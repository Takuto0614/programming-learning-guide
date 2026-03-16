# ループ（繰り返し処理）

ループを使うと、同じ処理を繰り返し実行することができます。

## while文

```java
public class WhileSample {

    public static void main(String[] args) {

        int i = 0;

        while (i < 5) {
            System.out.println(i);
            i++;
        }

    }

}