package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ResponseFormatJsonSchemaJsonSchema

/**
 * 
 * @param _type The type of response format being defined: `json_schema`
 * @param jsonUnderscoreschema 
 */
case class ResponseFormatJsonSchema(_type: String,
                jsonUnderscoreschema: ResponseFormatJsonSchemaJsonSchema
                )

object ResponseFormatJsonSchema {
    /**
     * Creates the codec for converting ResponseFormatJsonSchema from and to JSON.
     */
    implicit val decoder: Decoder[ResponseFormatJsonSchema] = deriveDecoder
    implicit val encoder: ObjectEncoder[ResponseFormatJsonSchema] = deriveEncoder
}
