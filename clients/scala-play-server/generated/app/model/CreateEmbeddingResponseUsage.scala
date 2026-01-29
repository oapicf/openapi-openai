package model

import play.api.libs.json._

/**
  * The usage information for the request.
  * @param promptTokens The number of tokens used by the prompt.
  * @param totalTokens The total number of tokens used by the request.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T10:48:27.489746113Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CreateEmbeddingResponseUsage(
  promptTokens: Int,
  totalTokens: Int
)

object CreateEmbeddingResponseUsage {
  implicit lazy val createEmbeddingResponseUsageJsonFormat: Format[CreateEmbeddingResponseUsage] = Json.format[CreateEmbeddingResponseUsage]
}

