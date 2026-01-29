package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for RunStepDeltaStepDetailsToolCallsRetrievalObject.
  * @param index The index of the tool call in the tool calls array.
  * @param id The ID of the tool call object.
  * @param `type` The type of tool call. This is always going to be `retrieval` for this type of tool call.
  * @param retrieval For now, this is always going to be an empty object.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T10:48:27.489746113Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class RunStepDeltaStepDetailsToolCallsRetrievalObject(
  index: Int,
  id: Option[String],
  `type`: RunStepDeltaStepDetailsToolCallsRetrievalObject.Type.Value,
  retrieval: Option[JsObject]
)

object RunStepDeltaStepDetailsToolCallsRetrievalObject {
  implicit lazy val runStepDeltaStepDetailsToolCallsRetrievalObjectJsonFormat: Format[RunStepDeltaStepDetailsToolCallsRetrievalObject] = Json.format[RunStepDeltaStepDetailsToolCallsRetrievalObject]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val Retrieval = Value("retrieval")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

