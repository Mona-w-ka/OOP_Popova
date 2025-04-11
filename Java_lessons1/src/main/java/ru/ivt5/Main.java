package ru.ivt5;

import processing.core.PApplet;
import ru.ivt5.v1.ColoredCircle;

import java.util.ArrayList;
import java.util.Iterator;

public class Main extends PApplet {
    private ArrayList<ColoredCircle> circles;
    private float prevMouseX, prevMouseY;
    long lastAddTime = 0;
    int delay = 40;
    float mod = 1f;


    public void settings() {
        size(800, 500);
    }

    public void setup() {
        circles = new ArrayList<>();
        // Первый круг в центре
        addCircle(width / 2f, height / 2f, 5, 5);
    }

    public void addCircle(float x, float y, float dx, float dy) {
        ColoredCircle circle = new ColoredCircle(this, x, y, dx, dy) {
            float pulseSpeed = random(0.05f, 0.1f);
            float baseSize = random(15, 40); // Случайный базовый размер
            float minSize = baseSize * 0.7f;  // Минимальный размер (70% от базового)
            float maxSize = baseSize * 1.3f;  // Максимальный размер (130% от базового)
            float pulseOffset = random(TWO_PI);

            @Override
            public void render() {
                float pulse = (sin((millis() * pulseSpeed + pulseOffset)) + 1) / 2;
                float currentSize = minSize + pulse * (maxSize - minSize);

                sketch.fill(sketch.random(255), sketch.random(255), sketch.random(255));
                sketch.noStroke();
                sketch.ellipse(x, y, currentSize, currentSize);
            }
        };
        circles.add(circle);
    }

    public void updateAndRender() {
        Iterator<ColoredCircle> it = circles.iterator();
        while (it.hasNext()) {
            ColoredCircle f = it.next();
            f.step();
            f.render();
            if (f.life == 0) {
                it.remove();
            }
        }
    }

    public void draw() {
        background(64);
        updateAndRender();
        prevMouseX = mouseX;
        prevMouseY = mouseY;
    }

    public void mouseDragged() {
        long now = millis();
        if (now - lastAddTime > delay) {
            addCircle(mouseX, mouseY,
                    (mouseX - prevMouseX) * mod,
                    (mouseY - prevMouseY) * mod);
            lastAddTime = now;
        }
    }

    public static void main(String[] args) {
        PApplet.main(Main.class);
    }
}