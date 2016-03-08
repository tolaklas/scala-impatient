package com.dojo.chapter6.chapter5.lib.account

import com.dojo.chapter6.chapter5.lib.logger.Logged

class SavingsAccount extends Account with Logged {

  def this(balance: Double) {
    this()
    this.balance = balance
  }

  def withdraw(amount: Double): Unit = {
    if (amount > balance) log("Insufficient funds, only " + balance + " available.")
    else balance -= amount
  }
}
