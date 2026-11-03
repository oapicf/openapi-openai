package model

import play.api.libs.json._

/**
  * Data about a previous audio response from the model.  [Learn more](/docs/guides/audio). 
  * @param id Unique identifier for a previous audio response from the model. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class ChatCompletionRequestAssistantMessageAudio(
  id: String
)

object ChatCompletionRequestAssistantMessageAudio {
  implicit lazy val chatCompletionRequestAssistantMessageAudioJsonFormat: Format[ChatCompletionRequestAssistantMessageAudio] = Json.format[ChatCompletionRequestAssistantMessageAudio]
}

