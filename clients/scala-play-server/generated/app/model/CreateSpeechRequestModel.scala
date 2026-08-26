package model

import play.api.libs.json._

/**
  * One of the available [TTS models](/docs/models#tts): `tts-1` or `tts-1-hd` 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-26T05:22:02.282422614Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CreateSpeechRequestModel(
)

object CreateSpeechRequestModel {
  implicit lazy val createSpeechRequestModelJsonFormat: Format[CreateSpeechRequestModel] = Json.format[CreateSpeechRequestModel]
}

