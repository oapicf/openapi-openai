package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for RunStepDetailsToolCallsFileSearchObject.
  * @param id The ID of the tool call object.
  * @param `type` The type of tool call. This is always going to be `file_search` for this type of tool call.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class RunStepDetailsToolCallsFileSearchObject(
  id: String,
  `type`: RunStepDetailsToolCallsFileSearchObject.Type.Value,
  fileSearch: RunStepDetailsToolCallsFileSearchObjectFileSearch
)

object RunStepDetailsToolCallsFileSearchObject {
  implicit lazy val runStepDetailsToolCallsFileSearchObjectJsonFormat: Format[RunStepDetailsToolCallsFileSearchObject] = Json.format[RunStepDetailsToolCallsFileSearchObject]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val FileSearch = Value("file_search")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

