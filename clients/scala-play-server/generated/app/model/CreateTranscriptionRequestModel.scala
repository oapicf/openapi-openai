package model

import play.api.libs.json._

/**
  * ID of the model to use. Only `whisper-1` (which is powered by our open source Whisper V2 model) is currently available. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CreateTranscriptionRequestModel(
)

object CreateTranscriptionRequestModel {
  implicit lazy val createTranscriptionRequestModelJsonFormat: Format[CreateTranscriptionRequestModel] = Json.format[CreateTranscriptionRequestModel]
}

