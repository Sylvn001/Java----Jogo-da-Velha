package poo_lista;
public class CodigoPostal {
    private int indicativo;
    private int extensao;
    private String rua;
    
    public CodigoPostal(int i, int e, String r)
    {
        setIndicativo(i);
        setExtensao(e);
        setRua(r);
  
    }
    public CodigoPostal(int i, String r)
    {
        setIndicativo(i);
        setRua(r);
        setExtensao(0);
    }
    public CodigoPostal()
    {
        setIndicativo(0);
        setExtensao(0);
        setRua("Indisponivel");
    }

    public int getIndicativo() {
        return indicativo;
    }

    public int getExtensao() {
        return extensao;
    }

    public String getRua() {
        return rua;
    }

    public void setIndicativo(int indicativo) {
        if(indicativo >= 0)
            this.indicativo = indicativo;
        else
            System.out.println("Insira numeros positivos");
    }

    public void setExtensao(int extensao) {
        if(extensao >=0)
            this.extensao = extensao;
        else 
            System.out.println("Insira numeros positivos");
    }

    public void setRua(String rua) {
        this.rua = rua;
    }
    
    public void mostra()
    {
        if (getIndicativo() == 0 && getExtensao() == 0)
            System.out.println("CEP: " + getRua());
        else
            System.out.println("CEP: " + getIndicativo() + "-" + getExtensao() + " "  + getRua() );
    }
}
