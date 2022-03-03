
interface Clinic {

    fun serve(visit: Visit)
}

class ClinicImpl: Clinic {

    override fun serve(visit: Visit) {
       println("""
           |
           |##### Recipe #####
           |Person: ${visit.vet.fullName()}
           |Pet: ${visit.pet.name}
           |Date: ${visit.visitDate}
           |====================
           |
           """.trimMargin())
    }
}