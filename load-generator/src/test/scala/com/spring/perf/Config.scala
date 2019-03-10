package com.spring.perf

object Config {
  val app_url = "http://localhost:8888"

  val rampUp = Integer.getInteger("rampup", 1).toInt
  val throughput = Integer.getInteger("throughput", 100).toInt
}
