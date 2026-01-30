package model

import play.api.libs.json._

/**
  * The name of the model to fine-tune. You can select one of the [supported models](/docs/guides/fine-tuning#which-models-can-be-fine-tuned). 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CreateFineTuningJobRequestModel(
)

object CreateFineTuningJobRequestModel {
  implicit lazy val createFineTuningJobRequestModelJsonFormat: Format[CreateFineTuningJobRequestModel] = Json.format[CreateFineTuningJobRequestModel]
}

