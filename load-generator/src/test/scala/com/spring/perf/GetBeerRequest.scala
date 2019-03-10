package com.spring.perf

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import com.spring.perf.Config.app_url

object GetBeerRequest {
  val get_beer = http("RequestName").get(app_url + "/beers/beer")
    .check(status is 200)
}
