package model

import play.api.libs.json._

/**
  * Data about a previous audio response from the model.  [Learn more](/docs/guides/audio). 
  * @param id Unique identifier for a previous audio response from the model. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-26T05:22:02.282422614Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ChatCompletionRequestAssistantMessageAudio(
  id: String
)

object ChatCompletionRequestAssistantMessageAudio {
  implicit lazy val chatCompletionRequestAssistantMessageAudioJsonFormat: Format[ChatCompletionRequestAssistantMessageAudio] = Json.format[ChatCompletionRequestAssistantMessageAudio]
}

