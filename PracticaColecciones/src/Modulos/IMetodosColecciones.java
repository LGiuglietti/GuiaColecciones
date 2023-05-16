package Modulos;
import com.sun.source.tree.Tree;
public interface IMetodosColecciones {
    boolean agregar(Alumno miAlumno);
    boolean buscar(Alumno miAlumno);
    String listar();
    boolean eliminar(Alumno miAlumno);

    int contar();

}
