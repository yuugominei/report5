package Report5;

public class Null {
    
    
    public static void main (String[] args){
        String str = null;
        try {
            System.out.println(str.length());
    } catch (NullPointerException e){
        System.out.println("問題発生！");
    }
    }
}