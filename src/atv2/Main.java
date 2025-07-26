package atv2;

public class Main {
    public static void main(String[] args) {
        Carro car1 = new Carro();
        Carro car2 = new Carro();
        Carro car3 = new Carro();

        car1.ano = 2021;
        car1.marca = "Fiat";
        car1.modelo = "Fiat";
        car2.marca = "Chevrolet";
        car2.modelo = "Camaro";
        car2.ano = 2021;
        car3.marca = "Ferrari";
        car3.modelo = "Spider";
        car3.ano = 2021;

        System.out.println(car1.ano+ ""+car1.marca+""+car1.modelo);
        System.out.println(car2.ano+ ""+car2.marca+""+car2.modelo);
        System.out.println(car3.ano+ ""+car3.marca+""+car3.modelo);
    }
}
