package org.openapitools.server.model


/**
 * @param description A description of what the function does, used by the model to choose when and how to call the function. for example: ''null''
 * @param name The name of the function to be called. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64. for example: ''null''
 * @param parameters The parameters the functions accepts, described as a JSON Schema object. See the [guide](/docs/guides/function-calling) for examples, and the [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for documentation about the format.   Omitting `parameters` defines a function with an empty parameter list. for example: ''null''
 * @param strict Whether to enable strict schema adherence when generating the function call. If set to true, the model will follow the exact schema defined in the `parameters` field. Only a subset of JSON Schema is supported when `strict` is `true`. Learn more about Structured Outputs in the [function calling guide](docs/guides/function-calling). for example: ''null''
*/
final case class FunctionObject (
  description: Option[String] = None,
  name: String,
  parameters: Option[Map[String, AnyType]] = None,
  strict: Option[Boolean] = None
)

