import java.util.*;
public class genericExample{
  public static void main(String... args){
    ArrayList<String> list = new ArrayList<>();
    System.out.println(list.size());
    list.add("Lauren");
    System.out.println(list.size());
    list.add(0, "Welborn");
    System.out.println(list);
    System.out.println(list.contains ("Kulis"));
    System.out.println(list.contains ("Lauren"));
    String firstName = list.get(1);
    System.out.println(firstName);
    String lastName = list.get(2);

  }
}
