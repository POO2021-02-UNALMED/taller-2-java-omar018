package test;


public class Auto {
	public String modelo;
    public int precio;
    public Asiento asientos[];
    public String marca;
    public Motor motor;
    public int registro;
    public int cantidadCreados;

    public int cantidadAsientos(){
        int cantidad = 0;
        for (Asiento asiento:asientos) {
            if (asiento!= null){cantidad++;}
        }
        return cantidad;
    }
    public String verificarIntegridad(){
        int reg = this.registro;
        for (Asiento asiento:asientos) {
            if(asiento != null) {
                if (reg == asiento.registro && reg == this.motor.registro) {
                    return "Auto original";
                } else {
                    return "Las piezas no son originales";
                }
            }
        }
		return marca;
    }

}

