public class Pet {
  enum Kind{
    DOG,
    CAT,
    OTHER,
  }
  //вид животного" (тип Kind),
  //"кличка" (тип String),
  //"дата рождения" (тип String),
  //вес (тип double);
  private String name;
  private String birthday;
  private double weight;

  public Pet (String name,String birthday,double weight){
    this.name = name;
    this.birthday = birthday;
    this.weight=weight;
  }

}
