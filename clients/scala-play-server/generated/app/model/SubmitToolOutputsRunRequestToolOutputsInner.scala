package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for SubmitToolOutputsRunRequest_tool_outputs_inner.
  * @param toolCallId The ID of the tool call in the `required_action` object within the run object the output is being submitted for.
  * @param output The output of the tool call to be submitted to continue the run.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class SubmitToolOutputsRunRequestToolOutputsInner(
  toolCallId: Option[String],
  output: Option[String]
)

object SubmitToolOutputsRunRequestToolOutputsInner {
  implicit lazy val submitToolOutputsRunRequestToolOutputsInnerJsonFormat: Format[SubmitToolOutputsRunRequestToolOutputsInner] = Json.format[SubmitToolOutputsRunRequestToolOutputsInner]
}

