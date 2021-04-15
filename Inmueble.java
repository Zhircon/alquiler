public class Inmueble implements Renta{
        private String ciudad;
        private String ubicacion;
        private int numHabitaciones;
        private String tipo;
        private float metrosCuadrados;
        //Constructores
        Inmueble(String ciudad,String ubicacion,int numHabitaciones,String tipo,float metrosCuadrados){
            this.ciudad=ciudad;
            this.ubicacion=ubicacion;
            this.numHabitaciones=numHabitaciones;
            this.tipo=tipo;
            this.metrosCuadrados=metrosCuadrados;
        }
        //Getters
        public String getCiudad() {
            return ciudad;
        }
        public String getUbicacion() {
            return ubicacion;
        }
        public int getNumHabitaciones() {
            return numHabitaciones;
        }
        public String getTipo() {
            return tipo;
        }
        public float getMetrosCuadrados() {
            return metrosCuadrados;
        }
        //Setters
        public void setCiudad(String ciudad) {
            this.ciudad = ciudad;
        }
        public void setUbicacion(String ubicacion) {
            this.ubicacion = ubicacion;
        }
        public void setNumHabitaciones(int numHabitaciones) {
            this.numHabitaciones = numHabitaciones;
        }
        public void setMetrosCuadrados(float metrosCuadrados) {
            this.metrosCuadrados = metrosCuadrados;
        }
        public void setTipo(String tipo) {
            this.tipo = tipo;
        }
        //Implementacion de Renta
        public float calcularRenta(){
            float precioHabitacion=300f;
            float renta=precioHabitacion*this.numHabitaciones;
            if ((tipo=="casa"||tipo=="Casa")|| tipo=="CASA"){
                renta=renta+350f;
            }
            if(this.metrosCuadrados>100){
                renta=renta+200f;
            }
            return renta;
        }
        public String toString(){
            return "Ciudad: "+ciudad+"\n Localizacion: "+ubicacion+"\n Numero de habitaciones: "+numHabitaciones+"\n Tipo: "+tipo+"\n MetrosCuadrados:"+metrosCuadrados;
        }
    }