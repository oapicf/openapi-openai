package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AnyType

/**
 * 
 * @param description A description of what the response format is for, used by the model to determine how to respond in the format.
 * @param name The name of the response format. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64.
 * @param schema The schema for the response format, described as a JSON Schema object.
 * @param strict Whether to enable strict schema adherence when generating the output. If set to true, the model will always follow the exact schema defined in the `schema` field. Only a subset of JSON Schema is supported when `strict` is `true`. To learn more, read the [Structured Outputs guide](/docs/guides/structured-outputs).
 */
case class ResponseFormatJsonSchemaJsonSchema(description: Option[String],
                name: String,
                schema: Option[Map[String, AnyType]],
                strict: Option[Boolean]
                )

object ResponseFormatJsonSchemaJsonSchema {
    /**
     * Creates the codec for converting ResponseFormatJsonSchemaJsonSchema from and to JSON.
     */
    implicit val decoder: Decoder[ResponseFormatJsonSchemaJsonSchema] = deriveDecoder
    implicit val encoder: ObjectEncoder[ResponseFormatJsonSchemaJsonSchema] = deriveEncoder
}
