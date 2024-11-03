package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.RunToolCallObject
import scala.collection.immutable.Seq

/**
 * Details on the tool outputs needed for this run to continue.
 * @param toolUnderscorecalls A list of the relevant tool calls.
 */
case class RunObjectRequiredActionSubmitToolOutputs(toolUnderscorecalls: Seq[RunToolCallObject]
                )

object RunObjectRequiredActionSubmitToolOutputs {
    /**
     * Creates the codec for converting RunObjectRequiredActionSubmitToolOutputs from and to JSON.
     */
    implicit val decoder: Decoder[RunObjectRequiredActionSubmitToolOutputs] = deriveDecoder
    implicit val encoder: ObjectEncoder[RunObjectRequiredActionSubmitToolOutputs] = deriveEncoder
}
