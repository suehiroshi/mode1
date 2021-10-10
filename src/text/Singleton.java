package text;

public class Singleton {
    private static Singleton instance = null;
    private Singleton(){}
    public static Singleton getInstance(){
        //如果还没有被实例化过，就实例化一个，然后返回
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
