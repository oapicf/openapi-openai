package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for SubmitToolOutputsRunRequest.
  * @param toolOutputs A list of tools for which the outputs are being submitted.
  * @param stream If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class SubmitToolOutputsRunRequest(
  toolOutputs: List[SubmitToolOutputsRunRequestToolOutputsInner],
  stream: Option[Boolean]
)

object SubmitToolOutputsRunRequest {
  implicit lazy val submitToolOutputsRunRequestJsonFormat: Format[SubmitToolOutputsRunRequest] = Json.format[SubmitToolOutputsRunRequest]
}

