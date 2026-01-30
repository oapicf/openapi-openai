package model

import play.api.libs.json._

/**
  * Data about a previous audio response from the model.  [Learn more](/docs/guides/audio). 
  * @param id Unique identifier for a previous audio response from the model. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ChatCompletionRequestAssistantMessageAudio(
  id: String
)

object ChatCompletionRequestAssistantMessageAudio {
  implicit lazy val chatCompletionRequestAssistantMessageAudioJsonFormat: Format[ChatCompletionRequestAssistantMessageAudio] = Json.format[ChatCompletionRequestAssistantMessageAudio]
}

