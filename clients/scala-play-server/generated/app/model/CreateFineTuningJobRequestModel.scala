package model

import play.api.libs.json._

/**
  * The name of the model to fine-tune. You can select one of the [supported models](/docs/guides/fine-tuning/what-models-can-be-fine-tuned). 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CreateFineTuningJobRequestModel(
)

object CreateFineTuningJobRequestModel {
  implicit lazy val createFineTuningJobRequestModelJsonFormat: Format[CreateFineTuningJobRequestModel] = Json.format[CreateFineTuningJobRequestModel]
}

