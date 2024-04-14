package model

import play.api.libs.json._

/**
  * One of the available [TTS models](/docs/models/tts): `tts-1` or `tts-1-hd` 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-04-14T13:53:34.453725706Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CreateSpeechRequestModel(
)

object CreateSpeechRequestModel {
  implicit lazy val createSpeechRequestModelJsonFormat: Format[CreateSpeechRequestModel] = Json.format[CreateSpeechRequestModel]
}

