# クラス

クラスは、データと処理をまとめた設計図です。  
同じ構造のオブジェクトを複数作ることができます。

## サンプルコード

```python
class Person:

    def __init__(self, name):
        self.name = name

    def introduce(self):
        print(f"こんにちは、{self.name}です。")


person1 = Person("たくと")
person2 = Person("さくら")

person1.introduce()
person2.introduce()