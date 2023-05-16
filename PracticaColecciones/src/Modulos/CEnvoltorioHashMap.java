package Modulos;

import javax.swing.text.StyledEditorKit;
import java.util.HashMap;
import java.util.Iterator;

public class CEnvoltorioHashMap implements IMetodosColecciones{
    private HashMap<Integer,Alumno> misAlumnos;

    public CEnvoltorioHashMap(HashMap<Integer, Alumno> misAlumnos) {
        this.misAlumnos = misAlumnos;
    }
    public CEnvoltorioHashMap()
    {
        this.misAlumnos=new HashMap<>();
    }

    @Override
    public boolean agregar(Alumno miAlumno) {
        boolean res=false;
        if(!misAlumnos.containsKey(miAlumno.getLegajo()))
        {
            misAlumnos.put(miAlumno.getLegajo(),miAlumno);
            res=true;
        }

        return res;
    }

    @Override
    public boolean buscar(Alumno miAlumno) {
        boolean res=false;
        if(misAlumnos.containsValue(miAlumno))
        {
            res=true;
        }
        return res;
    }

    @Override
    public String listar() {
        String res=new String();
        if(!misAlumnos.isEmpty())
        {
            Iterator it=misAlumnos.entrySet().iterator();
            while(it.hasNext())
            {
                res+="\n"+it.next();
            }

        }
        return res;
    }

    @Override
    public boolean eliminar(Alumno miAlumno) {
        boolean res=false;
        if (misAlumnos.containsKey(miAlumno.getLegajo()))
        {
            misAlumnos.remove(miAlumno);
            res=true;
        }
        return res;
    }

    @Override
    public int contar() {
        int cant=misAlumnos.size();
        return cant;
    }
}
