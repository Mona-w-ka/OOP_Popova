package ru.ivt5.v3.v3.colors;

    public enum Color {
        RED, GREEN, BLUE;
        public static Color colorFromString(String string) throws ColorException{
            try{
                return Color.valueOf(string);
            }
            catch(IllegalArgumentException e){
                throw new ColorException(ColorErrorCode.WRONG_COLOR_STRING);
            }
            catch(NullPointerException e){
                throw new ColorException(ColorErrorCode.NULL_COLOR);
            }
        }
    }

