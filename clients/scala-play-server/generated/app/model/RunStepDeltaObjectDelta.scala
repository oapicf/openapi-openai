package model

import play.api.libs.json._

/**
  * The delta containing the fields that have changed on the run step.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class RunStepDeltaObjectDelta(
  stepDetails: Option[RunStepDeltaObjectDeltaStepDetails]
)

object RunStepDeltaObjectDelta {
  implicit lazy val runStepDeltaObjectDeltaJsonFormat: Format[RunStepDeltaObjectDelta] = Json.format[RunStepDeltaObjectDelta]
}

