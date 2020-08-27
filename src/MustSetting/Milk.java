package MustSetting;

public enum Milk {
    Whole, Skimmed, Oat, Ori;

    public String toString() {
        switch (this) {
            case Whole:
                return "全脂牛奶";
            case Skimmed:
                return "脱脂牛奶";
            case Oat:
                return "燕麦牛奶";
            case Ori:
                return "不加牛奶";
            default:
                return "unspecified";
        }
    }
}