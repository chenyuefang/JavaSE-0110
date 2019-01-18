package demo.day08;

public class RandomName {

    private static final String[] NAMES = {
            "陈月芳",
            "刘立超",
            "邓超元",
            "赵明睿",
            "赵晨锦",
            "金谡",
            "杨斌",
            "杨恒",
            "李静雅",
            "王雅雯",
            "王强",
            "师尧",
            "吴凯平",
            "韩思远",
            "陈慧慧",
            "李欣",
            "王一茗",
            "李奕霖",
            "苏宏月",
            "赵灿"
    };

    public static String getRandomName() {
        int index = (int) (Math.random() * NAMES.length);
        return NAMES[index];
    }
}
