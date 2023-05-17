public class Droid{
//variables
    String name;
    int batteryLevel;
    
    public Droid(String droidName){ //constructor
        name = droidName;
        batteryLevel = 100;
    }

    public void performingTask(String task){ //metodo
        System.out.println(name + " esta realizando la tarea: " +  task);
    }
    
    public void statingBattery(){ //metodo, al no tener nada entre parentesis al llamarlo no hace falta poner nada entre parentesis
        batteryLevel = batteryLevel - 10;
        System.out.println("Bateria: " + batteryLevel + "%");
    }
    
    public static void energyChange(Droid a, Droid b){ //metodo para intercambiar el nivel de bateria entre los droides
        int c = a.batteryLevel;
        int d = b.batteryLevel;
        
        b.batteryLevel = c;
        a.batteryLevel = d;
    }
        
    public String toString(){  //metodo toString()
       return "Hola! soy el droide: " + name;
   }
 

    public static void main(String[] args){
        Droid droide = new Droid("R2D2"); //se crea el objeto
        Droid droide2 = new Droid("Chopper"); //otro objeto
        
        System.out.println(droide); //imprime el nombre con el metodo toString
        
        droide.performingTask("bailando");
        droide.statingBattery();
        droide.performingTask("con Ahsoka");
        droide.performingTask("cocinando");
        droide.statingBattery(); //tiene 80% de bateria
 
        System.out.println();
        
        System.out.println(droide2);
        
        droide2.performingTask("con Hera");
        droide2.performingTask("arreglando el fantasma");
        droide2.statingBattery(); //tiene 90% de bateria
        System.out.println();
        
        droide.energyChange(droide, droide2); //llama al metodo de cambio de baterias y se las intercambia
        System.out.println(droide + " me he cambiado la bateria con el otro droide y ahora mi bateria es: " + droide.batteryLevel + "%");
        System.out.println();
        System.out.println(droide2 + " he intercambiado mi bateria con el otro droide y ahora mi bateria es: " + droide2.batteryLevel + "%");
 
    }
}
