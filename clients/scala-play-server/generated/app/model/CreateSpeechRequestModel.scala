package model

import play.api.libs.json._

/**
  * One of the available [TTS models](/docs/models/tts): `tts-1` or `tts-1-hd` 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CreateSpeechRequestModel(
)

object CreateSpeechRequestModel {
  implicit lazy val createSpeechRequestModelJsonFormat: Format[CreateSpeechRequestModel] = Json.format[CreateSpeechRequestModel]
}

