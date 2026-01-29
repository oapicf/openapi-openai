package model

import play.api.libs.json._

/**
  * An object specifying the format that the model must output. Compatible with [GPT-4 Turbo](/docs/models/gpt-4-and-gpt-4-turbo) and all GPT-3.5 Turbo models newer than `gpt-3.5-turbo-1106`.  Setting to `{ \"type\": \"json_object\" }` enables JSON mode, which guarantees the message the model generates is valid JSON.  **Important:** when using JSON mode, you **must** also instruct the model to produce JSON yourself via a system or user message. Without this, the model may generate an unending stream of whitespace until the generation reaches the token limit, resulting in a long-running and seemingly \"stuck\" request. Also note that the message content may be partially cut off if `finish_reason=\"length\"`, which indicates the generation exceeded `max_tokens` or the conversation exceeded the max context length. 
  * @param `type` Must be one of `text` or `json_object`.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T10:48:27.489746113Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CreateChatCompletionRequestResponseFormat(
  `type`: Option[CreateChatCompletionRequestResponseFormat.Type.Value]
)

object CreateChatCompletionRequestResponseFormat {
  implicit lazy val createChatCompletionRequestResponseFormatJsonFormat: Format[CreateChatCompletionRequestResponseFormat] = Json.format[CreateChatCompletionRequestResponseFormat]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val Text = Value("text")
    val JsonObject = Value("json_object")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

