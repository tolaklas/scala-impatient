package com.dojo.chapter5

import com.dojo.chapter5.lib.person.{RestrictedPerson, Person}
import lib.Counter


object Chapter5 extends App {

  val myCounter = new Counter

  myCounter.increment()
  myCounter.increment()

  println(myCounter.current())

  val person = new Person
  person.printLnAge

  person.age = 30

  println(person.age)

  person.setAge(25)

  println(person.getAge)


  val restrictedPerson = new RestrictedPerson("Tolis")

  restrictedPerson.age = 18
  println(restrictedPerson.age)

  restrictedPerson.age = 15

  //val account
}
