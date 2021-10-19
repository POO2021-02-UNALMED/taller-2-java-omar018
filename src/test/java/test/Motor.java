package test;

public class Motor {
	public int numeroCilindros;
    public String tipo;
    public int registro;
    
    public void cambiarRegistro(int registro){
        this.registro = registro;
    }
    
    public void asignarTipo(String tipoMotor){
        switch (tipoMotor){
            case"electrico":
            case"gasolina": {
            this.tipo = tipoMotor;
            break;
            }
     }
        
    }
}
