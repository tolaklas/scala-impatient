package com.dojo.chapter6.chapter5.lib.person

import scala.beans.BeanProperty

class Person { // This is Java
  @BeanProperty var age = 0

  def printAge = {
    print(age)
  }

  def printLnAge = {
    printAge
    println
  }
}

