package model

import play.api.libs.json._

/**
  * Maximum number of output tokens for a single assistant response, inclusive of tool calls. Provide an integer between 1 and 4096 to limit output tokens, or `inf` for the maximum available tokens for a given model. Defaults to `inf`. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-26T05:22:02.282422614Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class RealtimeResponseCreateParamsMaxResponseOutputTokens(
)

object RealtimeResponseCreateParamsMaxResponseOutputTokens {
  implicit lazy val realtimeResponseCreateParamsMaxResponseOutputTokensJsonFormat: Format[RealtimeResponseCreateParamsMaxResponseOutputTokens] = Json.format[RealtimeResponseCreateParamsMaxResponseOutputTokens]
}

