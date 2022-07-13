package OOP;

class Mobile{
    public void details(){
        System.out.println("Show Mobile Details");
    }
}

class Samsung extends Mobile{
    public void details(){
        System.out.println("Show Samsung details");
    }
}
public class PolyCreate {
    public static void main(String[] args) {
        Mobile mb = new Samsung();
        mb.details();
    }
}
