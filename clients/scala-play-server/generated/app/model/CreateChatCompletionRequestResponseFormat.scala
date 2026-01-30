package model

import play.api.libs.json._

/**
  * An object specifying the format that the model must output.  Setting to `{ \"type\": \"json_schema\", \"json_schema\": {...} }` enables Structured Outputs which ensures the model will match your supplied JSON schema. Learn more in the [Structured Outputs guide](/docs/guides/structured-outputs).  Setting to `{ \"type\": \"json_object\" }` enables JSON mode, which ensures the message the model generates is valid JSON.  **Important:** when using JSON mode, you **must** also instruct the model to produce JSON yourself via a system or user message. Without this, the model may generate an unending stream of whitespace until the generation reaches the token limit, resulting in a long-running and seemingly \"stuck\" request. Also note that the message content may be partially cut off if `finish_reason=\"length\"`, which indicates the generation exceeded `max_tokens` or the conversation exceeded the max context length. 
  * @param `type` The type of response format being defined: `text`
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CreateChatCompletionRequestResponseFormat(
  `type`: CreateChatCompletionRequestResponseFormat.Type.Value,
  jsonSchema: ResponseFormatJsonSchemaJsonSchema
)

object CreateChatCompletionRequestResponseFormat {
  implicit lazy val createChatCompletionRequestResponseFormatJsonFormat: Format[CreateChatCompletionRequestResponseFormat] = Json.format[CreateChatCompletionRequestResponseFormat]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val Text = Value("text")
    val JsonObject = Value("json_object")
    val JsonSchema = Value("json_schema")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

