package Four_Piller;

public class Encapsulation_2 {
    public static void main(String[] args) {

        Laptop l1=new Laptop();
        l1.setPrice(60000);
        System.out.println("Laptop Price: "+ l1.getPrice());

    }
}


class Laptop{
    int ram;
    private int price;

    public int getPrice() {
        return price;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setPrice(int price) {

        boolean isAdmin=true;

        if(!isAdmin){
            System.out.println("You can not set the price.");
        }
        else{
            this.price = price;
        }

    }

}