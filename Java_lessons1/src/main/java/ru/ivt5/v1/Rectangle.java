package ru.ivt5.v1;

public class Rectangle {

        private Point topLeft;
        private Point bottomRight;

        // Constructors
        public Rectangle(Point leftTop, Point rightBottom) {
            this.topLeft = leftTop;
            this.bottomRight = rightBottom;
        }

        public Rectangle(int xLeft, int yTop, int xRight, int yBottom) {
            this.topLeft = new Point(xLeft, yTop);
            this.bottomRight = new Point(xRight, yBottom);
        }

        public Rectangle(int length, int width) {
            this.topLeft = new Point(0, 0);
            this.bottomRight = new Point(length, width);
        }

        public Rectangle() {
            this(1, 1);
        }

        public Point getTopLeft() {
            return topLeft;
        }

        public void setTopLeft(Point topLeft) {
            this.topLeft = topLeft;
        }

        public Point getBottomRight() {
            return bottomRight;
        }

        public void setBottomRight(Point bottomRight) {
            this.bottomRight = bottomRight;
        }

        public int getLength() {
            return bottomRight.getX() - topLeft.getX();
        }

        public int getWidth() {
            return bottomRight.getY() - topLeft.getY();
        }


        public void moveTo(int x, int y) {
            int length = getLength();
            int width = getWidth();
            this.topLeft = new Point(x, y);
            this.bottomRight = new Point(x + length, y + width);
        }

        public void moveTo(Point point) {
            moveTo(point.getX(), point.getY());
        }

        public void moveRel(int dx, int dy) {
            topLeft.setX(topLeft.getX() + dx);
            topLeft.setY(topLeft.getY() + dy);
            bottomRight.setX(bottomRight.getX() + dx);
            bottomRight.setY(bottomRight.getY() + dy);
        }


        public void resize(double ratio) {
            int newLength = (int) (getLength() * ratio);
            int newWidth = (int) (getWidth() * ratio);
            this.bottomRight = new Point(topLeft.getX() + newLength, topLeft.getY() + newWidth);
        }

        public void stretch(double xRatio, double yRatio) {
            int newLength = (int) (getLength() * xRatio);
            int newWidth = (int) (getWidth() * yRatio);
            this.bottomRight = new Point(topLeft.getX() + newLength, topLeft.getY() + newWidth);
        }


        public double getArea() {
            return (double) getLength() * getWidth();
        }

        public double getPerimeter() {
            return 2.0 * (getLength() + getWidth());
        }


        public boolean isInside(int x, int y) {
            return x >= topLeft.getX() && x <= bottomRight.getX() &&
                    y >= topLeft.getY() && y <= bottomRight.getY();
        }

        public boolean isInside(Point point) {
            return isInside(point.getX(), point.getY());
        }

        public boolean isIntersects(Rectangle rectangle) {
            return !(rectangle.getBottomRight().getX() < this.topLeft.getX() ||
                    rectangle.getTopLeft().getX() > this.bottomRight.getX() ||
                    rectangle.getBottomRight().getY() < this.topLeft.getY() ||
                    rectangle.getTopLeft().getY() > this.bottomRight.getY());
        }

        public boolean isInside(Rectangle rectangle) {
            return this.isInside(rectangle.getTopLeft()) && this.isInside(rectangle.getBottomRight());
        }
    }




