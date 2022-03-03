import com.github.javafaker.Faker
import java.time.LocalDate

fun main() {

    val clinic: Clinic = ClinicImpl()
    for (i in 1..100) {
        val pet: Pet = EntityFactory.getPet()
        clinic.serve(Visit(pet, Faker().date().between(pet.birthDate.toDate(),
            LocalDate.now().toDate()).toLocalDateTime(), EntityFactory.getVet(), EntityFactory.getVisitType()))
    }
}