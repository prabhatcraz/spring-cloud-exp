package com.spring.perf
import io.gatling.core.structure.{PopulationBuilder, ScenarioBuilder}
import scala.concurrent.duration._
import io.gatling.core.Predef.Simulation
import io.gatling.core.Predef._

class GetBeerSimulation extends Simulation {
  private val getBeerExec = GetBeerScenario.getBeerScenario.inject(
    atOnceUsers(1),
    rampUsersPerSec(1) to 100 during(300 seconds)
  )

  private val populationBuilders = List[PopulationBuilder] (getBeerExec)
  setUp(populationBuilders)
}