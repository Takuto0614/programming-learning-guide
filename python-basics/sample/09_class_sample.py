class Student:
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def introduce(self):
        print(f"名前: {self.name}, 年齢: {self.age}")

student = Student("Taro", 24)
student.introduce()