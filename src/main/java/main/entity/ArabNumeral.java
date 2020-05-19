package main.entity;

public enum ArabNumeral {
    I("1", 1),
    II("2", 2),
    III("3", 3),
    IV("4", 4),
    V("5", 5),
    VI("6", 6),
    VII("7", 7),
    VIII("8", 8),
    IX("9", 9),
    X("10", 10);

    private int value;
    private String key;

    ArabNumeral(String key, int value) {
        this.key = key;
        this.value = value;
    }

    public int getValue() { return value; }
    public String getKey() {
        return key;
    }
    public String getName() { return "Arab"; }
}
