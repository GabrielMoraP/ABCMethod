package modelo;

public class Articulo implements Comparable<Articulo>{

	private String nombre;
	private float costoAnual;
	private float porcentaje;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getCostoAnual() {
		return costoAnual;
	}

	public void setCostoAnual(float costoAnual) {
		this.costoAnual = costoAnual;
	}

	public float getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(float porcentaje) {
		this.porcentaje = porcentaje;
	}
        
        @Override
	public String toString() {
		return nombre + "\t" + costoAnual + "\t" + porcentaje;
	}

        @Override
        public boolean equals(Object obj) {
            Articulo articulo = (Articulo) obj;
            return (nombre.equalsIgnoreCase(articulo.getNombre()))&&(costoAnual==articulo.getCostoAnual())&&(porcentaje==articulo.getPorcentaje());
        }   

    @Override
    public int compareTo(Articulo articulo) {
        if(costoAnual>articulo.costoAnual){
            return -1;
        }else if(costoAnual<articulo.costoAnual){
            return 1;
        }else{
            return 0;
        }
    }

}
