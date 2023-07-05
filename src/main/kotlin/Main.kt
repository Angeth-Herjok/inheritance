fun main() {
        var banker= Person.Banker("Janet",40,"Mrs.banker")
        println(banker.name)
        println(banker.age)
        println(banker.mr)
        println(banker.countMoney(mutableListOf(300,100,200,1000)))



        var doctor=Person.Doctor("Angeth",24,"Dr")
        println(doctor.name)
        println(doctor.age)
        println(doctor.mr)
        println(doctor.treatPatients("Herjok","Malaria"))
        println(doctor.introduction())

        var farmer=Person.Farmer("Father",50,"Mr.Boss")
        println(farmer.name)
        println(farmer.age)
        println(farmer.mr)
        println(farmer.cultivateLand(200,"Nandi County"))
        println(farmer.eat())

}
 open class Person(var name:String,var age:Int,var mr:String) {
          fun talk(words: String) {
                  println(words)
          }

          open fun eat() {
                  println("yummy")

          }

          fun sleep() {
                  println("zzzzz")
          }

          open fun introduction() {
                  println("Hi my name is $mr $name")
          }

          open class Banker(name: String,age: Int,mr: String):Person(name, age, mr) {
                  fun countMoney(notes: List<Int>): Int {
                          var sum = 0
                          for (y in notes) {
                                  sum += y
                          }
                          return sum
                  }

              override fun eat() {
//                  super.eat()
                  println("I sleep ccccccounting")
              }

          }

          class Doctor(name: String, age: Int, mr: String):Person(name, age, mr){
                  fun treatPatients(patientName: String, disease: String) {
                          println("My name is $patientName,I am suffering from $disease")
                  }

              override fun introduction() {
//                  super.introduction()
                  println("$mr $name is my name")
              }


          }

          class Farmer(name: String,age: Int, mr: String):Banker(name, age, mr) {
                open  fun cultivateLand(arcs: Int, area: String) {
                          println("I have $arcs hectares of land in $area")
                  }
          }


  }








