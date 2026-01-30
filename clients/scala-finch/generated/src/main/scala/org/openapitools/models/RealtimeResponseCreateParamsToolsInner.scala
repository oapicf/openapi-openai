package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param _type The type of the tool, i.e. `function`.
 * @param name The name of the function.
 * @param description The description of the function, including guidance on when and how  to call it, and guidance about what to tell the user when calling  (if anything). 
 * @param parameters Parameters of the function in JSON Schema.
 */
case class RealtimeResponseCreateParamsToolsInner(_type: Option[String],
                name: Option[String],
                description: Option[String],
                parameters: Option[Object]
                )

object RealtimeResponseCreateParamsToolsInner {
    /**
     * Creates the codec for converting RealtimeResponseCreateParamsToolsInner from and to JSON.
     */
    implicit val decoder: Decoder[RealtimeResponseCreateParamsToolsInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[RealtimeResponseCreateParamsToolsInner] = deriveEncoder
}
