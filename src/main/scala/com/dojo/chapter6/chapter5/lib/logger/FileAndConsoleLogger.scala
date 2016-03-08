package com.dojo.chapter6.chapter5.lib.logger

trait FileAndConsoleLogger extends FileLogger {
  override def log(msg: String) = {
    println("Printing both: ")
    println(msg)
    printToFile(msg)
  }
}
