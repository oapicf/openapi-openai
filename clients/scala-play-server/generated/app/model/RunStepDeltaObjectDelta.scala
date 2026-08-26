package model

import play.api.libs.json._

/**
  * The delta containing the fields that have changed on the run step.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-26T05:22:02.282422614Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class RunStepDeltaObjectDelta(
  stepDetails: Option[RunStepDeltaObjectDeltaStepDetails]
)

object RunStepDeltaObjectDelta {
  implicit lazy val runStepDeltaObjectDeltaJsonFormat: Format[RunStepDeltaObjectDelta] = Json.format[RunStepDeltaObjectDelta]
}

