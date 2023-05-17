class Mayan extends Language {

//constructor con super, esto cambia los datos del constructor de language para este
  Mayan(String nombre1, int nume){
    super(nombre1, nume, "Central America", "verb object subject");
  }

  @Override
  public void getInfo(){
    System.out.println(name + " is spoken by " + numSpeakers + " people mainly in " + regionSpoken + ".");
    System.out.println("The language follow the word order: " + wordOrder);
    System.out.println("Fun fact: Ki'che is an ergative language"); 
  }
}
