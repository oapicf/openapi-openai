package model

import play.api.libs.json._

/**
  * Represents a run step delta i.e. any changed fields on a run step during streaming. 
  * @param id The identifier of the run step, which can be referenced in API endpoints.
  * @param `object` The object type, which is always `thread.run.step.delta`.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class RunStepDeltaObject(
  id: String,
  `object`: RunStepDeltaObject.Object.Value,
  delta: RunStepDeltaObjectDelta
)

object RunStepDeltaObject {
  implicit lazy val runStepDeltaObjectJsonFormat: Format[RunStepDeltaObject] = Json.format[RunStepDeltaObject]

  // noinspection TypeAnnotation
  object Object extends Enumeration {
    val ThreadRunStepDelta = Value("thread.run.step.delta")

    type Object = Value
    implicit lazy val ObjectJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

