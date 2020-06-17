package poo_lista;

public class Circulo {
    private int centroX;
    private int centroY;
    private int raio;
    
    public Circulo(int x, int y , int r){
        
        setCentroX(x);
        setCentroY(y);
        setRaio(r);
    }

    public void setCentroX(int centroX) {
        if(centroX < 0)
            System.out.println("Erro! digite valores inteiros positivos");
        else
            this.centroX = centroX;
    }

    public void setCentroY(int centroY) {
        if(centroY < 0)
            System.out.println("Erro! digite valores inteiros positivos");
        else
            this.centroY = centroY;
    }

    public void setRaio(int raio) {
        if(raio < 0)
            System.out.println("Erro, digite valores inteiros positivos");
        else
            this.raio = raio;
    }

    public int getCentroX() {
        return centroX;
    }

    public int getCentroY() {
        return centroY;
    }

    public int getRaio() {
        return raio;
    }
    public boolean comparaCirculo(Circulo comp)
    {
        if(this.centroX == comp.centroX && this.centroY == comp.centroY && this.raio == comp.raio)
            return true;
        else
            return false;
    }
    
    public void move(int x, int y){
        if(x < 0 || y < 0)
            System.out.println("Erro, insira valores validos!");
        else
        {
            setCentroX(x);
            setCentroY(y);   
            System.out.println("Valores alterados com sucesso!");
        }
    }
    public double area()
    {
        double area;
        area = (Math.PI * Math.pow(getRaio(), 2));    
        return area;
    }
    public double perimetro()
    {
        double p =0.0;
        p = 2 * Math.PI * getRaio();
        return p;
    }
    
}
