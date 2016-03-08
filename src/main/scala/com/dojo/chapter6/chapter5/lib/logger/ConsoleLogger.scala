package com.dojo.chapter6.chapter5.lib.logger

trait ConsoleLogger extends Logged {
  override def log(msg: String) = {
    println(msg)
  }
}
