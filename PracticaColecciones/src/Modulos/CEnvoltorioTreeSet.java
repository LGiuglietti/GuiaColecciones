package Modulos;

import java.util.Iterator;
import java.util.TreeSet;

public class CEnvoltorioTreeSet implements IMetodosColecciones{
    TreeSet<Alumno> arbol;

    public CEnvoltorioTreeSet(TreeSet<Alumno> arbol) {
        this.arbol = arbol;
    }
    public CEnvoltorioTreeSet()
    {
        this.arbol=new TreeSet<>();
    }


    @Override
    public boolean agregar(Alumno miAlumno) {
        //boolean res=false;
       boolean res=arbol.add(miAlumno);
        return res;
    }

    @Override
    public boolean buscar(Alumno miAlumno) {
        boolean res=false;
        if(arbol.contains(miAlumno.getLegajo()))
        {
            res=true;
        }
        return res;
    }

    @Override
    public String listar() {
        Iterator it=arbol.iterator();
        String res=new String();
        while(it.hasNext())
        {
            res+="\n"+it.next();
        }
        return res;
    }

    @Override
    public boolean eliminar(Alumno miAlumno) {
        boolean res=false;
        if(arbol.contains(miAlumno))
        {
            res=arbol.remove(miAlumno);

        }
        return res;
    }

    @Override
    public int contar() {
        int cant=0;
        Iterator it= arbol.iterator();
        while(it.hasNext())
        {
            it.next();
            cant++;
        }
        return cant;
    }

}
