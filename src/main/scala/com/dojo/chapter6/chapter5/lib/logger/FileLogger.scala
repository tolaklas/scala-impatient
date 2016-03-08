package com.dojo.chapter6.chapter5.lib.logger

trait FileLogger extends ConsoleLogger {
  override def log(msg: String) = {
    printToFile(msg)
  }

  protected def printToFile(msg: String): Unit = {
    println("FILE_SAVE: " + msg)
  }
}
