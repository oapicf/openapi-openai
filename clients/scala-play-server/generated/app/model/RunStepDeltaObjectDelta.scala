package model

import play.api.libs.json._

/**
  * The delta containing the fields that have changed on the run step.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class RunStepDeltaObjectDelta(
  stepDetails: Option[RunStepDeltaObjectDeltaStepDetails]
)

object RunStepDeltaObjectDelta {
  implicit lazy val runStepDeltaObjectDeltaJsonFormat: Format[RunStepDeltaObjectDelta] = Json.format[RunStepDeltaObjectDelta]
}

