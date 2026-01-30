package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ResponseFormatJsonSchema.
  * @param `type` The type of response format being defined: `json_schema`
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ResponseFormatJsonSchema(
  `type`: ResponseFormatJsonSchema.Type.Value,
  jsonSchema: ResponseFormatJsonSchemaJsonSchema
)

object ResponseFormatJsonSchema {
  implicit lazy val responseFormatJsonSchemaJsonFormat: Format[ResponseFormatJsonSchema] = Json.format[ResponseFormatJsonSchema]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val JsonSchema = Value("json_schema")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

