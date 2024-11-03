package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param toolUnderscorecallUnderscoreid The ID of the tool call in the `required_action` object within the run object the output is being submitted for.
 * @param output The output of the tool call to be submitted to continue the run.
 */
case class SubmitToolOutputsRunRequestToolOutputsInner(toolUnderscorecallUnderscoreid: Option[String],
                output: Option[String]
                )

object SubmitToolOutputsRunRequestToolOutputsInner {
    /**
     * Creates the codec for converting SubmitToolOutputsRunRequestToolOutputsInner from and to JSON.
     */
    implicit val decoder: Decoder[SubmitToolOutputsRunRequestToolOutputsInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[SubmitToolOutputsRunRequestToolOutputsInner] = deriveEncoder
}
