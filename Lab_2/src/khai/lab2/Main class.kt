package khai.lab2
// 6. Constructor
open class Student constructor(val Name: Person,
                               override var specialization: String,
                               override var mark: Int ,
        private var interest: Boolean): Bachelor(), Exam {

// 1. Abstract class
    override fun study() {
        println("${this.Name.name} ${this.Name.surname} studying $specialization...") }

    override fun drink_something(what: String) {
        super.drink_something(what)
        println("Done.")
    }

// 2. Interface
    override fun pass(Mark: Int) {
    if (Mark <60) {
        println("${this.Name.name} ${this.Name.surname} not passed am exam")
        interest =false
    }
    else {
        println("${this.Name.name} ${this.Name.surname} passed am exam")
        if (Mark >90) {
            interest = true
        }
    }
    this.mark = Mark
    println("Mark is ${this.mark}"
    )
}

// 3. Inner class
    inner class Curiosity {
        fun assess() {
            when(interest) {
                true -> println("Student is interested.")
                false -> println("Student is not interested.")
            }
        }
}

// 6.Getter
    fun getInterest() = this.interest.toString()

// 4. Nested-Enum
    enum class Control(val markable: Boolean) {
        EXAM(true),
        CREDIT(false),
        DIFF_CREDIT(true)
}

// 5. Data class
   data class Person(val name: String, val surname: String)
}