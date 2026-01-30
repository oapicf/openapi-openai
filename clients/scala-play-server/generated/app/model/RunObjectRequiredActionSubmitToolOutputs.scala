package model

import play.api.libs.json._

/**
  * Details on the tool outputs needed for this run to continue.
  * @param toolCalls A list of the relevant tool calls.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class RunObjectRequiredActionSubmitToolOutputs(
  toolCalls: List[RunToolCallObject]
)

object RunObjectRequiredActionSubmitToolOutputs {
  implicit lazy val runObjectRequiredActionSubmitToolOutputsJsonFormat: Format[RunObjectRequiredActionSubmitToolOutputs] = Json.format[RunObjectRequiredActionSubmitToolOutputs]
}

