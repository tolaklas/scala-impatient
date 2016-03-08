package com.dojo.chapter6.chapter5

import com.dojo.chapter6.chapter5.lib.account.{SavingsAccountFirst, SavingsAccount}
import com.dojo.chapter6.chapter5.lib.enums.TrafficLightColor
import com.dojo.chapter6.chapter5.lib.enums.AdvancedTrafficLightColor
import com.dojo.chapter6.chapter5.lib.logger.{FileAndConsoleLogger, FileLogger, ConsoleLogger}
import com.dojo.chapter6.chapter5.lib.person.Employee

object Chapter6 extends App {

  println(TrafficLightColor.Green)

  println(TrafficLightColor.Yellow.id)

  println(AdvancedTrafficLightColor.values)

  println(AdvancedTrafficLightColor.Red.id)

  val employee = new Employee
  println(employee.toString)

  /*val consoleLogger = new ConsoleLogger
  consoleLogger.log("Hello")*/

  var savingsAccountFirst = new SavingsAccountFirst(5000)

  savingsAccountFirst.balance = 3099
  println(savingsAccountFirst.balance)

  savingsAccountFirst.withdraw(3000)
  println(savingsAccountFirst.balance)

  savingsAccountFirst.withdraw(100)
  println(savingsAccountFirst.balance)


  var savingsAccountConsole = new SavingsAccount(3000) with ConsoleLogger
  var savingsAccountFile = new SavingsAccount(3000) with FileLogger
  var savingsAccountFileAndConsole = new SavingsAccount(3000) with FileAndConsoleLogger

  /*savingsAccountConsole.withdraw(3500)
  savingsAccountFile.withdraw(3500)*/
  savingsAccountFileAndConsole.withdraw(3500)

}
