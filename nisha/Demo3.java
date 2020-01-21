class box {
    int length;
    int breadth;
    int height;
    void setDim(int l, int b, int h) {
        length=l;
        breadth=b;
        height=h;
        int vol=l*b*h;
       System.out.println("volume "+vol);
    }
}
public class Demo3
{
    public static void main(String[]args)
    {
        box b1=new box();
        b1.setDim(2,3,4);
    }
}

      