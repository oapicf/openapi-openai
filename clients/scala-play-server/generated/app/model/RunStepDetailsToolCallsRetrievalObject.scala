package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for RunStepDetailsToolCallsRetrievalObject.
  * @param id The ID of the tool call object.
  * @param `type` The type of tool call. This is always going to be `retrieval` for this type of tool call.
  * @param retrieval For now, this is always going to be an empty object.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class RunStepDetailsToolCallsRetrievalObject(
  id: String,
  `type`: RunStepDetailsToolCallsRetrievalObject.Type.Value,
  retrieval: JsObject
)

object RunStepDetailsToolCallsRetrievalObject {
  implicit lazy val runStepDetailsToolCallsRetrievalObjectJsonFormat: Format[RunStepDetailsToolCallsRetrievalObject] = Json.format[RunStepDetailsToolCallsRetrievalObject]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val Retrieval = Value("retrieval")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

