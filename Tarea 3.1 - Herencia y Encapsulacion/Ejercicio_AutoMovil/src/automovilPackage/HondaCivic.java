package automovilPackage;


public class HondaCivic extends Automovil{
    
    public HondaCivic()
    {
        super();
        System.out.println("Constructor de Honda Civic");
    }
    
    @Override
    public void encender()
    {
        System.out.println("El honda civic esta encendiendo co arranque deportivo...");
    }
    
    @Override
    public void apagar()
    {
        System.out.println("El honda civic se esta apagando...");
    }
    
    @Override
    public void acelerar()
    {
        System.out.println("El honda civic esta acelerando rapidamente...");
    }
    
    @Override
    public void frenar()
    {
        System.out.println("El honda civic esta frenando con mucho control...");
    }
    
    
    
    
    
}
