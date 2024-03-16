package model

import play.api.libs.json._

/**
  * The name of the base model to fine-tune. You can select one of \"ada\", \"babbage\", \"curie\", \"davinci\", or a fine-tuned model created after 2022-04-21. To learn more about these models, see the [Models](https://platform.openai.com/docs/models) documentation. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-16T01:17:28.392125286Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CreateFineTuneRequestModel(
)

object CreateFineTuneRequestModel {
  implicit lazy val createFineTuneRequestModelJsonFormat: Format[CreateFineTuneRequestModel] = Json.format[CreateFineTuneRequestModel]
}

