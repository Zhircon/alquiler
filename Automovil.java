public class Automovil implements Renta{
    private String marca;
    private int cilindraje;
    private String tipoAuto;
    private Conductor piloto;
    //Constructores
    Automovil(String marca,int cilindraje,String tipoAuto){
        this.marca=marca;
        this.cilindraje=cilindraje;
        this.tipoAuto=tipoAuto;
    }
    Automovil(String marca,int cilindraje,String tipoAuto,Conductor piloto){
        this.marca=marca;
        this.cilindraje=cilindraje;
        this.tipoAuto=tipoAuto;
        this.piloto=piloto;
    }
    //gettes;
    public Conductor getPiloto() {
        return piloto;
    }
    public String getMarca() {
        return marca;
    }
    public int getCilindraje() {
        return cilindraje;
    }
    public String getTipoAuto() {
        return tipoAuto;
    }
    //Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }
    public void setTipoAuto(String tipoAuto) {
        this.tipoAuto = tipoAuto;
    }
    public void AddConductor(Conductor conductor){
       this.piloto=conductor;
    }
    public float calcularRenta(){
        float renta=0f;
        if(tipoAuto=="compacto"||tipoAuto=="Compacto"||tipoAuto=="Compacto"){
             renta=450f;
        }
        if(tipoAuto=="sedan"||tipoAuto=="Sedan"||tipoAuto=="SEDAN"){
            renta=550f;
        }
        if(tipoAuto=="van"||tipoAuto=="Van"||tipoAuto=="VAN"){
            renta=700f;
        }
        switch(piloto.getSexo()){
            case "hombre":
            case "Hombre":
            case "HOMBRE":
            float porcentaje=renta*.05f;
            renta=renta+porcentaje;
            if(piloto.getEdad()<35){
                porcentaje=renta*.10f;
            }
            renta=renta+porcentaje;
            break;
        }
        return renta;
    }
    public String toString(){
        return "Marca: "+marca+ "\n Cilindraje: "+cilindraje+"\n TipoAuto: "+tipoAuto;
    }
}