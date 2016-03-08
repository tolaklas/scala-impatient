package com.dojo.chapter6.chapter5.lib.account

trait Account {
  var balance: Double = 0
  def withdraw(amount: Double)
}
