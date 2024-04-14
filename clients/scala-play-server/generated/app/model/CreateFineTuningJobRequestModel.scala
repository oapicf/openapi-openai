package model

import play.api.libs.json._

/**
  * The name of the model to fine-tune. You can select one of the [supported models](/docs/guides/fine-tuning/what-models-can-be-fine-tuned). 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-04-14T13:53:34.453725706Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CreateFineTuningJobRequestModel(
)

object CreateFineTuningJobRequestModel {
  implicit lazy val createFineTuningJobRequestModelJsonFormat: Format[CreateFineTuningJobRequestModel] = Json.format[CreateFineTuningJobRequestModel]
}

