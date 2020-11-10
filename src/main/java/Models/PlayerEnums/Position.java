package Models.PlayerEnums;

public enum Position {
    G("Guard"),
    F("Forward"),
    C("Center");

    private String position;

    Position(String position){
        this.position = position;
    }

}
