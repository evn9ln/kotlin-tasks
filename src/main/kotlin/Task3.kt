import com.github.javafaker.Faker
import java.util.*

object EntityFactory {
    
    private val faker: Faker = Faker(Locale.ENGLISH)

    fun getVet(): Vet = Vet(faker.name().firstName(), faker.name().lastName(), faker.date().birthday().toLocalDate(),
                            faker.address().streetAddress(), faker.address().city(), faker.internet().emailAddress(),
                            faker.phoneNumber().phoneNumber())

    fun getOwner(): Owner = Owner(faker.name().firstName(), faker.name().lastName(),
                                faker.date().birthday().toLocalDate(), faker.address().streetAddress(),
                                faker.address().city(), faker.internet().emailAddress(),
                                faker.phoneNumber().phoneNumber())

    fun getPetType() = PetType.values().toList().shuffled().first()

    fun getPet(): Pet = Pet(faker.superhero().name(), faker.date().birthday().toLocalDate(),
                            getPetType(), Owner(faker.name().firstName(),
            faker.name().lastName(), faker.date().birthday().toLocalDate(), faker.address().streetAddress(),
            faker.address().city(), faker.internet().emailAddress(), faker.phoneNumber().phoneNumber()))

    fun getVisitType() = VisitType.values().toList().shuffled().first()
}