package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ChatCompletionFunctions.
  * @param name The name of the function to be called. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64.
  * @param description The description of what the function does.
  * @param parameters The parameters the functions accepts, described as a JSON Schema object. See the [guide](/docs/guides/gpt/function-calling) for examples, and the [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for documentation about the format.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-16T01:17:28.392125286Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class ChatCompletionFunctions(
  name: String,
  description: Option[String],
  parameters: Option[Map[String, OasAnyTypeNotMapped]],
)

object ChatCompletionFunctions {
  implicit lazy val chatCompletionFunctionsJsonFormat: Format[ChatCompletionFunctions] = Json.format[ChatCompletionFunctions]
}

