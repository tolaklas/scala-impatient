package com.dojo.chapter6.chapter5.lib.person

final class Employee extends Person {

  var salary: Double = 1422.23

  private val fqName = getClass.getName
  private val name = fqName.substring(fqName.lastIndexOf(".") + 1)

  override def toString = name + " [className=" + fqName + ", salary=" + salary + "]"
}
