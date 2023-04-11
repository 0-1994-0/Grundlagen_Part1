public class MainCooking {
    public static void main(String[] args) {

        Cooking cooking = new Cooking();


        System.out.println(cooking.suggestPrice("Veggie", 85));


        System.out.println(cooking.firstBox(5,true,false,4));
        System.out.println(cooking.suggestPrice("Vegan",4));
        System.out.println(cooking.firstBox(10,false,false,8));
    }
}
