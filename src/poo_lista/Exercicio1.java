package poo_lista;
public class Exercicio1 {
    public static void main(String[] args) {
        Circulo c1 = new Circulo(1,2,100);
        Circulo c2 = new Circulo (1,2,100);
        Circulo c3 = new Circulo (20,22, 99);
        System.out.println("Centro X " +  c1.getCentroX() + " Centro Y " + c1.getCentroY() + " Raio: " + c1.getRaio());

         if (c1.comparaCirculo(c2))
            System.out.println("c1 igual a c2");
         else if (c1.comparaCirculo(c3))
            System.out.println("c1 igual a c3");
        c1.move(10, 20);
      
        System.out.println("Area: " + c1.area() );
        System.out.println("Perimetro: " +c1.perimetro());
        
        
    }
    
}
