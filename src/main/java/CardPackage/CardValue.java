package CardPackage;

public enum CardValue {
    ACE(11),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(10),
    QUEEN(10),
    KING(10),
    ONE(1);

    private final int value;


    CardValue(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }

    public String getName(){return this.toString();}

}
