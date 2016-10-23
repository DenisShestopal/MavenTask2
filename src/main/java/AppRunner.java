public class AppRunner {

    static Integer value = 3;

    public static void main(String ... args){
        AppRunner item = new AppRunner();
        item.doSmth(value);
        System.out.println(item);
    }

    public Integer doSmth(Integer number){
        return ++number;

    }

}