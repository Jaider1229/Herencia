
package Herencia;

public class Estudiante extends Persona{
        
        private int codigo;
        private float notaFinal;
        
    public Estudiante(String nombre, String apellido, int edad,int codigo, float notaFinal){
            super(nombre, apellido, edad);
            this.codigo=codigo;
            this.notaFinal=notaFinal;
    }


    public void mostrarDatos(){
        System.out.println("El estudiiante "+nombre+getApellido()+" con "+getEdad()+" años de edad "+
                " \nEl codigo de este estudiante es:"+codigo+" y su nota final es de:"+notaFinal);
    }
    
}
