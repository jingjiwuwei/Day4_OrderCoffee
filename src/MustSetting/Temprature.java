package MustSetting;

public enum Temprature {
    Regular, Easy, Icefree;

    public String toString() {
        switch (this) {
            case Regular:
                return "正常冰";
            case Easy:
                return "少冰";
            case Icefree:
                return "去冰";
            default:
                return "unspecified";
        }
    }
}