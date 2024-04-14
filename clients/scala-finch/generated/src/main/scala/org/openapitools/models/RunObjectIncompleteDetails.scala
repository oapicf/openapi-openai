package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Details on why the run is incomplete. Will be `null` if the run is not incomplete.
 * @param reason The reason why the run is incomplete. This will point to which specific token limit was reached over the course of the run.
 */
case class RunObjectIncompleteDetails(reason: Option[String]
                )

object RunObjectIncompleteDetails {
    /**
     * Creates the codec for converting RunObjectIncompleteDetails from and to JSON.
     */
    implicit val decoder: Decoder[RunObjectIncompleteDetails] = deriveDecoder
    implicit val encoder: ObjectEncoder[RunObjectIncompleteDetails] = deriveEncoder
}
