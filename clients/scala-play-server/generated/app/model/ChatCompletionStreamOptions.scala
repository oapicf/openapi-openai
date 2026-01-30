package model

import play.api.libs.json._

/**
  * Options for streaming response. Only set this when you set `stream: true`. 
  * @param includeUsage If set, an additional chunk will be streamed before the `data: [DONE]` message. The `usage` field on this chunk shows the token usage statistics for the entire request, and the `choices` field will always be an empty array. All other chunks will also include a `usage` field, but with a null value. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ChatCompletionStreamOptions(
  includeUsage: Option[Boolean]
)

object ChatCompletionStreamOptions {
  implicit lazy val chatCompletionStreamOptionsJsonFormat: Format[ChatCompletionStreamOptions] = Json.format[ChatCompletionStreamOptions]
}

