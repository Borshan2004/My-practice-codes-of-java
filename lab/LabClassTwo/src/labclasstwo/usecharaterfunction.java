
package labclasstwo;


public class usecharaterfunction {
    public static void main(String[] args){
        
       
        char c1 = 'b';
        char c2 ='5';
        char c3= 'B';
        
        System.out.println(Character.isLetter(c1));
        System.out.println(Character.isLetter(c2));
        
        System.out.println(Character.isDigit(c2));
        
        
        System.out.println(Character.isUpperCase(c3));
        System.out.println(Character.isLowerCase(c3));
        
        
        
        System.out.println(Character.toLowerCase(c3));
        System.out.println(Character.toUpperCase(c1));

        
        
        String name = "borshan";
        String name2 = "       PuRiFicAtion";
        System.out.println(name.length());
        
 
        System.out.println(name.charAt(2));
        
        System.out.println(name.concat(name2));
        
        System.out.println(name.toUpperCase());
        System.out.println(name2.toLowerCase());
        System.out.println(name2.trim());
        
        
        
        
    }
    
}
