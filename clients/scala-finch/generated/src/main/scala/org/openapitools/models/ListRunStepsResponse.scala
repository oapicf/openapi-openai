package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.RunStepObject
import scala.collection.immutable.Seq

/**
 * 
 * @param _object 
 * @param data 
 * @param firstUnderscoreid 
 * @param lastUnderscoreid 
 * @param hasUnderscoremore 
 */
case class ListRunStepsResponse(_object: String,
                data: Seq[RunStepObject],
                firstUnderscoreid: String,
                lastUnderscoreid: String,
                hasUnderscoremore: Boolean
                )

object ListRunStepsResponse {
    /**
     * Creates the codec for converting ListRunStepsResponse from and to JSON.
     */
    implicit val decoder: Decoder[ListRunStepsResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[ListRunStepsResponse] = deriveEncoder
}
