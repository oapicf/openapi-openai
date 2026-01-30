package org.openapitools.server.model


/**
 * @param description A description of what the response format is for, used by the model to determine how to respond in the format. for example: ''null''
 * @param name The name of the response format. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64. for example: ''null''
 * @param schema The schema for the response format, described as a JSON Schema object. for example: ''null''
 * @param strict Whether to enable strict schema adherence when generating the output. If set to true, the model will always follow the exact schema defined in the `schema` field. Only a subset of JSON Schema is supported when `strict` is `true`. To learn more, read the [Structured Outputs guide](/docs/guides/structured-outputs). for example: ''null''
*/
final case class ResponseFormatJsonSchemaJsonSchema (
  description: Option[String] = None,
  name: String,
  schema: Option[Map[String, AnyType]] = None,
  strict: Option[Boolean] = None
)

