package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ResponseFormatJsonSchema_json_schema.
  * @param description A description of what the response format is for, used by the model to determine how to respond in the format.
  * @param name The name of the response format. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64.
  * @param schema The schema for the response format, described as a JSON Schema object.
  * @param strict Whether to enable strict schema adherence when generating the output. If set to true, the model will always follow the exact schema defined in the `schema` field. Only a subset of JSON Schema is supported when `strict` is `true`. To learn more, read the [Structured Outputs guide](/docs/guides/structured-outputs).
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ResponseFormatJsonSchemaJsonSchema(
  description: Option[String],
  name: String,
  schema: Option[Map[String, OasAnyTypeNotMapped]],
  strict: Option[Boolean]
)

object ResponseFormatJsonSchemaJsonSchema {
  implicit lazy val responseFormatJsonSchemaJsonSchemaJsonFormat: Format[ResponseFormatJsonSchemaJsonSchema] = Json.format[ResponseFormatJsonSchemaJsonSchema]
}

