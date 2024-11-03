package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.FunctionObject

/**
 * 
 * @param _type The type of the tool. Currently, only `function` is supported.
 * @param function 
 */
case class ChatCompletionTool(_type: String,
                function: FunctionObject
                )

object ChatCompletionTool {
    /**
     * Creates the codec for converting ChatCompletionTool from and to JSON.
     */
    implicit val decoder: Decoder[ChatCompletionTool] = deriveDecoder
    implicit val encoder: ObjectEncoder[ChatCompletionTool] = deriveEncoder
}
