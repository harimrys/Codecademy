class SinoTibetan extends Language {

  SinoTibetan(String nombre, int nume){
    super(nombre, nume, "Asia", "subject object verb"); 

    if(nombre.contains("Chinese")){
      wordOrder = "subject verb object";
    }
  }
}
