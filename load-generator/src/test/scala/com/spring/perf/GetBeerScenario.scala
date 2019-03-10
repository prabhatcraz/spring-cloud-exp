package com.spring.perf

import com.spring.perf.GetBeerRequest
import io.gatling.core.Predef.scenario

object GetBeerScenario {
  val getBeerScenario = scenario("Get Beer scenario")
    .exec(GetBeerRequest.get_beer)
}
