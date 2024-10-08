/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class Empleado extends Persona{
    private String codigo,puesto;

    public Empleado(){}
    public Empleado(String codigo, String puesto, String nombres, String apellidos, String direccion, String telefono, String fecha_nacimiento) {
        super(nombres, apellidos, direccion, telefono, fecha_nacimiento);
        this.codigo = codigo;
        this.puesto = puesto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    public void agregar(){
      System.out.println("Codigo: " + getCodigo());
      System.out.println("Puesto: " + getPuesto());
      System.out.println("Nombres: " +  getNombres() );
      System.out.println("Apellidos: " + getApellidos() );
      System.out.println("Direccion: " + getDireccion() );
      System.out.println("Telefono: " + getTelefono() );
      System.out.println("Fecha Nacimiento: " + getFecha_nacimiento());
      System.out.println("__________________________________________");
    }
    
}
