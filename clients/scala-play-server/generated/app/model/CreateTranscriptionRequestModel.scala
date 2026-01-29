package model

import play.api.libs.json._

/**
  * ID of the model to use. Only `whisper-1` (which is powered by our open source Whisper V2 model) is currently available. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T10:48:27.489746113Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CreateTranscriptionRequestModel(
)

object CreateTranscriptionRequestModel {
  implicit lazy val createTranscriptionRequestModelJsonFormat: Format[CreateTranscriptionRequestModel] = Json.format[CreateTranscriptionRequestModel]
}

