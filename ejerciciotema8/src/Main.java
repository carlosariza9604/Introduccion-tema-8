public class Main {
    public static void main(String[] args) {
        persona e1=new persona();
        e1.dameNombre("Pablo");
        e1.dameEdad(15);
        e1.dameTelefono(7230161);
        System.out.println("nombre de la persona 1: "+e1.devuelveNombre() );
        System.out.println("nombre de la persona 1: "+e1.devuelveEdad() );
        System.out.println("nombre de la persona 1: "+e1.devuelveTelefono() );
        persona e2=new persona();
        e2.dameNombre("camila");
        e2.dameEdad(15);
        e2.dameTelefono(569675);
        System.out.println("nombre de la persona 2: "+e2.devuelveNombre() );
        System.out.println("nombre de la persona 2: "+e2.devuelveEdad() );
        System.out.println("nombre de la persona 2: "+e2.devuelveTelefono() );
    }
}
class persona {
    private int edad;
    private String nombre;
    private int telefono;


    public void dameNombre(String nom)
    {
        this.nombre=nom;
    }
    public void dameEdad(int ed)
    {
        this.edad=ed;
    }
    public void dameTelefono(int tl)
    {
        this.telefono=tl;
    }
    public String devuelveNombre()
    {
        return nombre;
    }
    public int devuelveEdad()
    {
        return edad;
    }
    public int devuelveTelefono()
    {
        return telefono;
    }
}