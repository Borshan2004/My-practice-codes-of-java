
package labclasstwo;


public class usemathsincosraddegree {
    
    public static void main(String[] args){
    
        //radian to degree
        double radianTodegree = Math.toDegrees(Math.PI);
        int degInt = (int)(radianTodegree);
        System.out.println("Radian to Degree: "+degInt);
        
        //degree to radian
        
        double degreeToradian = Math.toRadians(180);
        System.out.println("Degree to Radian: "+degreeToradian);
        
        //sin
        double sinthirty = Math.sin(Math.toRadians(30));
        System.out.println("Sin(30): "+sinthirty);
        
        //cos
        double costhirty = Math.cos(Math.toRadians(30));
        System.out.println("Cos(30): "+costhirty);
        
        //tan
        double tanthirty = Math.tan(Math.toRadians(30));
        System.out.println("tan(30): "+tanthirty);
        
        //sin inverse
        double inversesin = Math.asin(1);//radin value
        double inversesin_deg = Math.toDegrees(inversesin); //degree value
        System.out.println("Sininverse(1): "+inversesin_deg);
        
        //cos inverse
        double inversecos = Math.acos(1);//radin value
        double inversecos_deg = Math.toDegrees(inversecos); //degree value
        System.out.println("Sininverse(1): "+inversecos_deg);
    }
    
    
}
