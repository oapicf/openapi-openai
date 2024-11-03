package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Describes an OpenAI model offering that can be used with the API.
 * @param id The model identifier, which can be referenced in the API endpoints.
 * @param created The Unix timestamp (in seconds) when the model was created.
 * @param _object The object type, which is always \"model\".
 * @param ownedUnderscoreby The organization that owns the model.
 */
case class Model(id: String,
                created: Int,
                _object: String,
                ownedUnderscoreby: String
                )

object Model {
    /**
     * Creates the codec for converting Model from and to JSON.
     */
    implicit val decoder: Decoder[Model] = deriveDecoder
    implicit val encoder: ObjectEncoder[Model] = deriveEncoder
}
