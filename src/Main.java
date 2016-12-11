/**
 * Created by e165750 on 2016/12/09.
 */
public class Main {
    public static void main(String[] args){
        try{
            String str;
            str = null;
            System.out.println(str.length());

        }catch(NullPointerException e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
