package com.dojo.chapter5.lib

class Counter {
  private var value = 0 // You must initialize the field

  def increment() {
    value += 1
  } // Methods are public by default

  def current() = value
}

