package model

import play.api.libs.json._

/**
  * One of the available [TTS models](/docs/models#tts): `tts-1` or `tts-1-hd` 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CreateSpeechRequestModel(
)

object CreateSpeechRequestModel {
  implicit lazy val createSpeechRequestModelJsonFormat: Format[CreateSpeechRequestModel] = Json.format[CreateSpeechRequestModel]
}

