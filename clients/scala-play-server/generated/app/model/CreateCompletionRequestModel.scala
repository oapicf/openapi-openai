package model

import play.api.libs.json._

/**
  * ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-16T01:17:28.392125286Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CreateCompletionRequestModel(
)

object CreateCompletionRequestModel {
  implicit lazy val createCompletionRequestModelJsonFormat: Format[CreateCompletionRequestModel] = Json.format[CreateCompletionRequestModel]
}

