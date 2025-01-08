public class LOL {
    int x;
    int y;
    LOL(){
        x=0;
        y=0;

    }
    LOL(int a,int b)
    {
        this.x=a;
        this.y=b;
    }
    void display(){
        System.out.println("HI");
    }
    void area(int x,int y)
    {
        int area1=x*y;
        System.out.println(area1);
    }

    public static void main(String[] args) {
        LOL obj=new LOL();
        LOL obj2=new LOL(45,25);
        obj.display();
        obj2.area(34,23);
    }
}

