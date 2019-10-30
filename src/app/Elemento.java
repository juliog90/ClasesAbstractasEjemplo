package app;

public enum Elemento implements StringSizeable
{
    UNO, DOS, TRES;

    @Override
    public int getStringSize() {
        return UNO.toString().length();
    }
}