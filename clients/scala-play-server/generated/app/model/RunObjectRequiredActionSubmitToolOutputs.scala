package model

import play.api.libs.json._

/**
  * Details on the tool outputs needed for this run to continue.
  * @param toolCalls A list of the relevant tool calls.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-04-14T13:53:34.453725706Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class RunObjectRequiredActionSubmitToolOutputs(
  toolCalls: List[RunToolCallObject]
)

object RunObjectRequiredActionSubmitToolOutputs {
  implicit lazy val runObjectRequiredActionSubmitToolOutputsJsonFormat: Format[RunObjectRequiredActionSubmitToolOutputs] = Json.format[RunObjectRequiredActionSubmitToolOutputs]
}

