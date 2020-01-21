class Box {
    //instance variable
    int length;
    int breadth;
    int height;
    //constructor
    
    Box(int length, int breadth,int height){
        this.length=length ;
        this.breadth=breadth;
        this.height=height;
        
        System.out.println("the object is created");
    }
    //method
    int  area(){
        return(this.length*this.breadth);
    }
}
public class Demo4
{
    public static void main(String[]args)
    {
        
   
        Box b =new Box(2,4,6);
        System.out.println("area ="+b.area());
    }
}
   
        
        
    