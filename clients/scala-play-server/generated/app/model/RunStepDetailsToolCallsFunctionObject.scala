package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for RunStepDetailsToolCallsFunctionObject.
  * @param id The ID of the tool call object.
  * @param `type` The type of tool call. This is always going to be `function` for this type of tool call.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-04-14T13:53:34.453725706Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class RunStepDetailsToolCallsFunctionObject(
  id: String,
  `type`: RunStepDetailsToolCallsFunctionObject.Type.Value,
  function: RunStepDetailsToolCallsFunctionObjectFunction
)

object RunStepDetailsToolCallsFunctionObject {
  implicit lazy val runStepDetailsToolCallsFunctionObjectJsonFormat: Format[RunStepDetailsToolCallsFunctionObject] = Json.format[RunStepDetailsToolCallsFunctionObject]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val Function = Value("function")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

