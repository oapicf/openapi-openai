package model

import play.api.libs.json._

/**
  * The usage information for the request.
  * @param promptTokens The number of tokens used by the prompt.
  * @param totalTokens The total number of tokens used by the request.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CreateEmbeddingResponseUsage(
  promptTokens: Int,
  totalTokens: Int
)

object CreateEmbeddingResponseUsage {
  implicit lazy val createEmbeddingResponseUsageJsonFormat: Format[CreateEmbeddingResponseUsage] = Json.format[CreateEmbeddingResponseUsage]
}

