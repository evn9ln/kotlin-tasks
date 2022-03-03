import java.time.LocalDate
import java.time.LocalDateTime

abstract class Person(val firstName: String, val lastName: String, val birthDate: LocalDate, var address: String,
                      var city: String, var email: String, var telephone: String) {

    fun fullName() = "$firstName $lastName"
}

class Vet(firstName: String, lastName: String, birthDate: LocalDate,
          address: String, city: String, email: String,
          telephone: String): Person(firstName, lastName, birthDate, address, city, email, telephone) {

}

enum class PetType(val type: String) {
    CAT("Cat"),
    DOG("Dog"),
    OTHER("Other")
}

enum class VisitType {
    CHECKUP, TREATMENT, OTHER
}

data class Pet(val name: String, val birthDate: LocalDate, val type: PetType, var owner: Owner) {


    init {
        owner.pets.add(this)
    }

    override fun toString(): String {
        return "Pet name: $name"
    }
}

class Owner(firstName: String, lastName: String, birthDate: LocalDate,
            address: String, city: String, email: String,
            telephone: String): Person(firstName, lastName, birthDate, address, city, email, telephone) {

    var pets: MutableList<Pet> = mutableListOf()
}

data class Visit(val pet: Pet, val visitDate: LocalDateTime, val vet: Vet, val visitType: VisitType) {

}


