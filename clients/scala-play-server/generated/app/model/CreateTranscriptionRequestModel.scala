package model

import play.api.libs.json._

/**
  * ID of the model to use. Only `whisper-1` (which is powered by our open source Whisper V2 model) is currently available. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CreateTranscriptionRequestModel(
)

object CreateTranscriptionRequestModel {
  implicit lazy val createTranscriptionRequestModelJsonFormat: Format[CreateTranscriptionRequestModel] = Json.format[CreateTranscriptionRequestModel]
}

