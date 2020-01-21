class box {
    int length;
    int breadth;
    int height;
    void volume() {
        System.out.println("volume"+(length*breadth*height));
    }
}
public class Demo1
{
    public static void main(String[]args)
    {
        box b1=new box();
        b1.length =2;
        b1.breadth =3;
        b1.height=4;
        b1.volume();
    }
}
        
        