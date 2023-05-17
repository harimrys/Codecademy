class Language {
//variables
  protected String name;
  protected int numSpeakers;
  protected String regionSpoken;
  protected String wordOrder;

//constructor
  Language (String nombre, int numero, String region, String word){
    this.name = nombre;
    this.numSpeakers = numero;
    this.regionSpoken = region;
    this.wordOrder = word;

  }
//constructor, como lleva void no va el return
  public void getInfo(){
    System.out.println(name + " is spoken by " + numSpeakers + " people mainly in " + regionSpoken + ".");
    System.out.println("The language follow the word order: " + wordOrder);
  }

//metodo main
  public static void main (String[] args){
    
    Language spanish = new Language("Spanish", 400, "Spain", "Sujeto + verbo + frase");
    spanish.getInfo(); //se llama al metodo

    System.out.println();
    
    Mayan mayan = new Mayan("Ki'che", 9000);
    mayan.getInfo(); //se llama al metodo

    System.out.println();

    SinoTibetan chino = new SinoTibetan("Chinese", 1000);
    SinoTibetan noChino = new SinoTibetan ("Tibetan", 2000);
    chino.getInfo();
    noChino.getInfo();
  }
}
