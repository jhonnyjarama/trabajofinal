package CAJERO1;

public class boleta {

	// Atributos
		private String nombre;
		private String opera;
		private float monto;
		private String estado;
		
		
		
		// Getters and Setters
		public String getOpera() {
			return this.opera;
		}
		
		public boleta(String opera) {
			this.opera = opera;
		}

		// Getters and Setters
		public String getNombre() {
			return this.nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		public float getmonto() {
			return this.monto;
		}
		public void setmonto(float monto) {
			this.monto = monto;
		}
		public String getestado() {
			return this.estado;
		}
		public void setestado(String estado) {
			this.estado = estado;
		}
		// Constructores
		public boleta() {
			
		}
		public boleta(String nombre, String opera , float monto, String estado) {
			this.nombre = nombre;
			this.opera = opera;
			this.monto = monto;
			this.estado = estado;
		}
		
		public String NombreCompleto() {
			return this.nombre;
		}
		public String OperacionRealizada() {
			return this.opera;
		}
		
		public String Mostrarmonto() {
			 String a = "No tiene fondos" ;
			 String b = "Le quedan fondos";
			return (this.monto  == 0 ? a : b);
		}
		
		public String MostrarEstado() {
			return (this.estado.equals("NO") ? "No hubo operación" : "Operacion " + this.opera );
		}
		
	}
