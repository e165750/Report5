/**
 * Created by e165750 on 2016/12/09.
 */
public class Main {
    public static void main(String[] args){
        try{
            String str;
            str = "3．14";
            System.out.println(str.length());
            double value = Double.parseDouble(str);

        }catch(NullPointerException e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
