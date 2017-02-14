public class Dog{
  public String name;
  public Dog(String name){
    this.name = name;
  }
  public void bark(){
    System.out.println("Woof");}
  public void bark(int numberOfTimes){
    for(int i = 0; i < numberOfTimes; i++)
      this.bark(i);
  }
  }
