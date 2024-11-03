package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * An object describing the expected output of the model. If `json_object` only `function` type `tools` are allowed to be passed to the Run. If `text` the model can return text or any value needed. 
 * @param _type Must be one of `text` or `json_object`.
 */
case class AssistantsApiResponseFormat(_type: Option[String]
                )

object AssistantsApiResponseFormat {
    /**
     * Creates the codec for converting AssistantsApiResponseFormat from and to JSON.
     */
    implicit val decoder: Decoder[AssistantsApiResponseFormat] = deriveDecoder
    implicit val encoder: ObjectEncoder[AssistantsApiResponseFormat] = deriveEncoder
}
