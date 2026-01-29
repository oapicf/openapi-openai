package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.SubmitToolOutputsRunRequestToolOutputsInner
import scala.collection.immutable.Seq

/**
 * 
 * @param toolUnderscoreoutputs A list of tools for which the outputs are being submitted.
 * @param stream If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message. 
 */
case class SubmitToolOutputsRunRequest(toolUnderscoreoutputs: Seq[SubmitToolOutputsRunRequestToolOutputsInner],
                stream: Option[Boolean]
                )

object SubmitToolOutputsRunRequest {
    /**
     * Creates the codec for converting SubmitToolOutputsRunRequest from and to JSON.
     */
    implicit val decoder: Decoder[SubmitToolOutputsRunRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[SubmitToolOutputsRunRequest] = deriveEncoder
}
