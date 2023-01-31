public class Main {
    public static void main(String[] args) {
        float ticketPrise = 2_000;
        int milePrise = 20;
        int miles = (int)ticketPrise / milePrise;
        System.out.println("Вам будет начислено " + miles + " миль за купленный билет.");
    }
}
