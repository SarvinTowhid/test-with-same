package LearnStatic;

public class Static1 {

    public static void main(String[] args) {

        Dog fido = new Dog();
        Dog airBud = new Dog();

        fido.breed = "German Shephard";
        airBud.breed = "Golden Retriever";

        System.out.println(fido.breed);
        System.out.println(airBud.breed);

        fido.typeOfAnimal = "Giraffe";
        Dog.typeOfAnimal= "Elephent";


        System.out.println(fido.typeOfAnimal);
        System.out.println(airBud.typeOfAnimal);
    }
}
