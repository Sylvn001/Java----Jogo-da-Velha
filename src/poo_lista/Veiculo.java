package poo_lista;
public class Veiculo {
    private String modelo;
    private int qtdCombustivel;
    private int capacidade;
    private int consumo;
    private int odometro; 

    public Veiculo(String modelo, int capacidade, int consumo) {
        this.modelo = modelo;
        this.capacidade = capacidade;
        this.consumo = consumo;
        this.odometro = 0;
        this.qtdCombustivel = 0;  
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getQtdCombustivel() {
        return qtdCombustivel;
    }

    public void setQtdCombustivel(int qtdCombustivel) {
        this.qtdCombustivel = qtdCombustivel;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public int getOdometro() {
        return odometro;
    }

    public void setOdometro(int odometro) {
        this.odometro = odometro;
    }
    public void abastecer( int qtd)
    {
        if( (qtd + getQtdCombustivel()) > getCapacidade())
            System.out.println("Tanque Não suporta essa quantidade de combustivel! Tente um valor menor");
        else
            setQtdCombustivel(getQtdCombustivel() + qtd );
    }
    public void percorrer(int distancia)
    {
        setOdometro( getOdometro() + distancia);
        int dis = distancia / getConsumo();
            setQtdCombustivel(getQtdCombustivel() - dis);
       
    }
    public int getAutonomia()
    {
        return (getConsumo() * getQtdCombustivel() );
    }
}
