package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ResponseFormatJsonSchemaJsonSchema._

case class ResponseFormatJsonSchemaJsonSchema (
  /* A description of what the response format is for, used by the model to determine how to respond in the format. */
  description: Option[String],
/* The name of the response format. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64. */
  name: String,
/* The schema for the response format, described as a JSON Schema object. */
  schema: Option[Map[String, AnyType]],
/* Whether to enable strict schema adherence when generating the output. If set to true, the model will always follow the exact schema defined in the `schema` field. Only a subset of JSON Schema is supported when `strict` is `true`. To learn more, read the [Structured Outputs guide](/docs/guides/structured-outputs). */
  strict: Option[Boolean])

object ResponseFormatJsonSchemaJsonSchema {
  import DateTimeCodecs._

  implicit val ResponseFormatJsonSchemaJsonSchemaCodecJson: CodecJson[ResponseFormatJsonSchemaJsonSchema] = CodecJson.derive[ResponseFormatJsonSchemaJsonSchema]
  implicit val ResponseFormatJsonSchemaJsonSchemaDecoder: EntityDecoder[ResponseFormatJsonSchemaJsonSchema] = jsonOf[ResponseFormatJsonSchemaJsonSchema]
  implicit val ResponseFormatJsonSchemaJsonSchemaEncoder: EntityEncoder[ResponseFormatJsonSchemaJsonSchema] = jsonEncoderOf[ResponseFormatJsonSchemaJsonSchema]
}
