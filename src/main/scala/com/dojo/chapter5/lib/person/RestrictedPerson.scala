package com.dojo.chapter5.lib.person

class RestrictedPerson(val name: String) {
  private[this] var privAge = 0 // This restricts access to other objects. Only the current object can change this

  def age = privAge

  def age_= (newAge: Int) {
    if (newAge > privAge) privAge = newAge
    else println(name + ", you can't get younger my dear. You are still " + privAge + " and not " + newAge + ".")
  }
}
