package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CreateCompletionResponse_usage.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-16T01:17:28.392125286Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CreateCompletionResponseUsage(
  promptTokens: Int,
  completionTokens: Int,
  totalTokens: Int
)

object CreateCompletionResponseUsage {
  implicit lazy val createCompletionResponseUsageJsonFormat: Format[CreateCompletionResponseUsage] = Json.format[CreateCompletionResponseUsage]
}

