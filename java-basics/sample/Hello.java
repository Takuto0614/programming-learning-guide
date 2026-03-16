
---

# 8. sample フォルダにコードを置く

教材だけでなく、実際のコードファイルもあると見栄えが良いです。

## java-basics/sample/Hello.java

```java
public class Hello {
    public static void main(String[] args) {
        int age = 24;
        String name = "Takkun";

        System.out.println("name: " + name);
        System.out.println("age: " + age);
    }
}