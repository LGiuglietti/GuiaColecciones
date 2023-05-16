import Modulos.Alumno;
import Modulos.CEnvoltorioHashMap;
import Modulos.CEnvoltorioTreeSet;

public class Main {
    public static void main(String[] args) {
        //treeset
        CEnvoltorioTreeSet x=new CEnvoltorioTreeSet();
        x.agregar(new Alumno(1,"lau"));
        x.agregar(new Alumno(2,"male"));
        x.agregar(new Alumno(3,"motta"));
        System.out.println(x.listar());
        System.out.println("cantidad: "+x.contar());
        //hasmap
        CEnvoltorioHashMap mapa= new CEnvoltorioHashMap();
        mapa.agregar(new Alumno(1,"lau"));
        mapa.agregar(new Alumno(2,"juanpi"));
        mapa.agregar(new Alumno(3,"male"));
        mapa.agregar(new Alumno(4,"motta"));
        System.out.println(mapa.listar());
        System.out.println("cantidad: "+mapa.contar());
        //
    }
}