import java.util.Scanner;

public class Principal {
    public static void main(String[]args){
        Automovil alfaromeo=new Automovil("Alfaromeo",8,"Compacto");
        Automovil camaro2005=new Automovil("Chewrolet",6,"Sedan");
        Automovil toyota=new Automovil("Toyota",6,"Van");
        Automovil vehiculos[]={alfaromeo,camaro2005,toyota};
        Inmueble mansion=new Inmueble("CDMX","La colonia rosa",15,"Casa",600f);
        Inmueble heretics=new Inmueble("Andorra","vanilla",8,"Casa",200f);
        Inmueble hotelMg=new Inmueble("xalapa","vanilla",2,"Departamento",80f);
        Inmueble locaciones[]={mansion,heretics,hotelMg};
        System.out.println("Que desea Rentar? \n inmuebles(i),vehiculos(v)");
        Scanner sc=new Scanner(System.in);
        char eleccion =sc.next().charAt(0);
        char tipoEleccion=eleccion;
        int indice=0;
        switch(eleccion){
            case 'i':
            case 'I':
                System.out.println("Inmuebles:");
                System.out.println("--------------------");
                for(int i=0;i<3;i++){
                    System.out.println("Opcion: "+((int)i+1));
                    System.out.println(locaciones[i]);
                    System.out.println("--------------------");
                }
                System.out.println("¿Cual sera su eleccion?(1-3)");
                eleccion=sc.next().charAt(0);
                switch(eleccion){
                    case '1':
                    case '2':
                    case '3':
                        indice=Character.getNumericValue(eleccion);
                    break;
                    default:
                        System.out.println ("Opcion no valida");
                    break;
                }
            break;
            case 'v':
            case 'V':
                System.out.println("Vehiculos:");
                System.out.println("--------------------");   
                for(int i=0;i<3;i++){
                    System.out.println("Opcion: "+((int)i+1));
                    System.out.println(vehiculos[i]);
                    System.out.println("--------------------");
                }
                System.out.println("¿Cual sera su eleccion?(1-3)");
                eleccion=sc.next().charAt(0);
                switch(eleccion){
                    case '1':
                    case '2':
                    case '3':
                        indice=Character.getNumericValue(eleccion);
                    break;
                    default:
                        System.out.println ("Opcion no valida");
                    break;
                }
            break;
            default:
                System.out.println("Opcion no valida");
            break;
        }
        Scanner scannerPersona=new Scanner(System.in);
        if(tipoEleccion=='i'||tipoEleccion=='I'){
            System.out.println("Ha elegido el inmueble: "+indice);
            System.out.println(locaciones[indice-1]);
            System.out.println("La renta seria:"+locaciones[indice-1].calcularRenta());
        }
        if(tipoEleccion=='v'||tipoEleccion=='V'){
            System.out.println("Ha elegido el Vehiculo: "+(indice-1));
            System.out.println(vehiculos[indice-1]);
            System.out.println("Como se llama el conductor:");
            String nombre=scannerPersona.nextLine();
            System.out.println("Como Edad tiene el conductor:");
            String edad=scannerPersona.nextLine();
            int enteroEdad=Integer.parseInt(edad);
            System.out.println("que sexo es el conductor(hombre-mujer,lgbt no aplica ):");
            String sexo=scannerPersona.nextLine();
            Conductor piloto =new Conductor(nombre,sexo,enteroEdad); 
            vehiculos[indice-1].AddConductor(piloto);
            System.out.println("La renta seria:"+vehiculos[indice-1].calcularRenta());
        }
    }
}
