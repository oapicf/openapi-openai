package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for FineTune.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-16T01:17:28.392125286Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class FineTune(
  id: String,
  `object`: String,
  createdAt: Int,
  updatedAt: Int,
  model: String,
  fineTunedModel: String,
  organizationId: String,
  status: String,
  hyperparams: JsObject,
  trainingFiles: List[OpenAIFile],
  validationFiles: List[OpenAIFile],
  resultFiles: List[OpenAIFile],
  events: Option[List[FineTuneEvent]]
)

object FineTune {
  implicit lazy val fineTuneJsonFormat: Format[FineTune] = Json.format[FineTune]
}

