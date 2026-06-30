fun main() {

    val patients = mutableListOf<String>()

    while (true) {

        println("\n Hospital Management System ")
        println("1. Add Patient")
        println("2. Show Patients")
        println("3. Discharge Patient")
        println("4. Exit")

        print("Enter your choice: ")
        val choice = readLine()?.toIntOrNull()

        when (choice) {

            1 -> {
                print("Enter patient name: ")
                val patient = readLine()

                if (!patient.isNullOrBlank()) {
                    patients.add(patient)
                    println("Patient admitted successfully!")
                } else {
                    println("Patient name cannot be empty.")
                }
            }

            2 -> {
                if (patients.isEmpty()) {
                    println("No patients admitted.")
                } else {
                    println("\nList of Patients:")
                    for (patient in patients) {
                        println("- $patient")
                    }
                }
            }

            3 -> {
                print("Enter patient name to discharge: ")
                val patient = readLine()

                if (patients.remove(patient)) {
                    println("Patient discharged successfully!")
                } else {
                    println("Patient not found.")
                }
            }

            4 -> {
                println("Thank you for using the Hospital Management System.")
                break
            }

            else -> {
                println("Invalid choice. Please try again.")
            }
        }
    }
}