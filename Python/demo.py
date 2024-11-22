from datetime import datetime

class Person:
    def __init__(self, name, country, date_of_birth):
        self.name = name
        self.country = country
        self.date_of_birth = date_of_birth  # Expecting date_of_birth in 'YYYY-MM-DD' format

    def calculate_age(self):
        birth_date = datetime.strptime(self.date_of_birth, "%Y-%m-%d")
        today = datetime.today()
        age = today.year - birth_date.year - ((today.month, today.day) < (birth_date.month, birth_date.day))
        return age

    def display_details(self):
        print(f"Name: {self.name}")
        print(f"Country: {self.country}")
        print(f"Date of Birth: {self.date_of_birth}")
        print(f"Age: {self.calculate_age()}")

# Example usage
if __name__ == "__main__":
    person = Person("Alice", "India", "1990-05-20")
    person.display_details()
