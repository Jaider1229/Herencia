package Herencia;

public class Principal2 {
    
    public static void main (String[]args){
        Persona2 persona= new Persona2();
        Perro perro=new Perro();
        Animal animal=new Animal();
        persona.comer();
        perro.comer();
        animal.comer();
    }
}
