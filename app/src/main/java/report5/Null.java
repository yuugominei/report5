package report5;

public class Null {
    
    
    public static void main (String[] args){
        
        try {
        String str = null;
        System.out.println(str.length());
    } catch (NullPointerException e){
        System.out.println("問題発生！");
        System.out.println(e.getMessage());
    }
    }
}