package com.dojo.chapter6.chapter5

import com.dojo.chapter5.lib.person.{Person, RestrictedPerson}
import com.dojo.chapter6.chapter5.lib.Counter
import com.dojo.chapter6.chapter5.lib.enum.TrafficLightColor
import com.dojo.chapter6.chapter5.lib.enums.AdvancedTrafficLightColor
import com.dojo.chapter6.chapter5.lib.person.Employee


object Chapter6 extends App {

  println(TrafficLightColor.Green)

  println(TrafficLightColor.Yellow.id)

  println(AdvancedTrafficLightColor.values)

  println(AdvancedTrafficLightColor.Red.id)

  val employee = new Employee
  println(employee.toString)
}
