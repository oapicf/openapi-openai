package model

import play.api.libs.json._

/**
  * ID of the model to use. Only `whisper-1` (which is powered by our open source Whisper V2 model) is currently available. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-04-14T13:53:34.453725706Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CreateTranscriptionRequestModel(
)

object CreateTranscriptionRequestModel {
  implicit lazy val createTranscriptionRequestModelJsonFormat: Format[CreateTranscriptionRequestModel] = Json.format[CreateTranscriptionRequestModel]
}

