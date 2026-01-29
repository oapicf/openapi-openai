package model

import play.api.libs.json._

/**
  * ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T10:48:27.489746113Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CreateEmbeddingRequestModel(
)

object CreateEmbeddingRequestModel {
  implicit lazy val createEmbeddingRequestModelJsonFormat: Format[CreateEmbeddingRequestModel] = Json.format[CreateEmbeddingRequestModel]
}

