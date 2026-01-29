package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for RunStepDeltaStepDetailsToolCallsFunctionObject.
  * @param index The index of the tool call in the tool calls array.
  * @param id The ID of the tool call object.
  * @param `type` The type of tool call. This is always going to be `function` for this type of tool call.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T10:48:27.489746113Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class RunStepDeltaStepDetailsToolCallsFunctionObject(
  index: Int,
  id: Option[String],
  `type`: RunStepDeltaStepDetailsToolCallsFunctionObject.Type.Value,
  function: Option[RunStepDeltaStepDetailsToolCallsFunctionObjectFunction]
)

object RunStepDeltaStepDetailsToolCallsFunctionObject {
  implicit lazy val runStepDeltaStepDetailsToolCallsFunctionObjectJsonFormat: Format[RunStepDeltaStepDetailsToolCallsFunctionObject] = Json.format[RunStepDeltaStepDetailsToolCallsFunctionObject]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val Function = Value("function")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

