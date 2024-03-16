package org.openapitools.server.model


/**
 * @param name The name of the function to be called. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64. for example: ''null''
 * @param description The description of what the function does. for example: ''null''
 * @param parameters The parameters the functions accepts, described as a JSON Schema object. See the [guide](/docs/guides/gpt/function-calling) for examples, and the [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for documentation about the format. for example: ''null''
*/
final case class ChatCompletionFunctions (
  name: String,
  description: Option[String] = None,
  parameters: Option[Map[String, AnyType]] = None
)

