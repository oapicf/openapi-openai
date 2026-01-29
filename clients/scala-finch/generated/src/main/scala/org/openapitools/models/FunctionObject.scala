package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AnyType

/**
 * 
 * @param description A description of what the function does, used by the model to choose when and how to call the function.
 * @param name The name of the function to be called. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64.
 * @param parameters The parameters the functions accepts, described as a JSON Schema object. See the [guide](/docs/guides/text-generation/function-calling) for examples, and the [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for documentation about the format.   Omitting `parameters` defines a function with an empty parameter list.
 */
case class FunctionObject(description: Option[String],
                name: String,
                parameters: Option[Map[String, AnyType]]
                )

object FunctionObject {
    /**
     * Creates the codec for converting FunctionObject from and to JSON.
     */
    implicit val decoder: Decoder[FunctionObject] = deriveDecoder
    implicit val encoder: ObjectEncoder[FunctionObject] = deriveEncoder
}
