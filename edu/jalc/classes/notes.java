# visibility modifier
1. public - everyone
2. private - class itself only (most restrictive)
3. protected - package and sub classes, class itself (third most restrictive)
4. package private default - only package can access (second most restrictive)

public class UselessClass{}

```
public class Driver{
  public static void main(String... args){
    UselessClass uselessClass = new UselessClass
  }
}
```
