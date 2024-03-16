package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CreateEmbeddingResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-16T01:17:28.392125286Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CreateEmbeddingResponse(
  `object`: String,
  model: String,
  data: List[CreateEmbeddingResponseDataInner],
  usage: CreateEmbeddingResponseUsage
)

object CreateEmbeddingResponse {
  implicit lazy val createEmbeddingResponseJsonFormat: Format[CreateEmbeddingResponse] = Json.format[CreateEmbeddingResponse]
}

