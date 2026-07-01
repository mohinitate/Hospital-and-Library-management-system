fun main() {

        val books = mutableListOf<String>()

    while (true) {

        println("\n Library Management System ")
        println("1. Add Book")
        println("2. Show Books")
        println("3. Issue Book")
        println("4. Exit")

        print("Enter your choice: ")
        val choice = readLine()?.toIntOrNull()

        when (choice) {

            1 -> {
                print("Enter book name: ")
                val book = readLine()

                if (!book.isNullOrBlank()) {
                    books.add(book)
                    println(" Book added successfully!")
                } else {
                    println(" Book name cannot be empty.")
                }
            }

            2 -> {
                if (books.isEmpty()) {
                    println(" No books available.")
                } else {
                    println("\nBooks Available:")
                    for (book in books) {
                        println("- $book")
                    }
                }
            }

            3 -> {
                print("Enter book name to issue: ")
                val book = readLine()

                if (books.remove(book)) {
                    println(" Book issued successfully!")
                } else {
                    println(" Book not found.")
                }
            }

            4 -> {
                println("Thank you for using the Library Management System.")
                break
            }

            // Invalid input
            else -> {
                println("Invalid choice. Please try again.")
            }
        }
    }
}