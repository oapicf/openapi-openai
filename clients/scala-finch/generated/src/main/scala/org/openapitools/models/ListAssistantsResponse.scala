package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AssistantObject
import scala.collection.immutable.Seq

/**
 * 
 * @param _object 
 * @param data 
 * @param firstUnderscoreid 
 * @param lastUnderscoreid 
 * @param hasUnderscoremore 
 */
case class ListAssistantsResponse(_object: String,
                data: Seq[AssistantObject],
                firstUnderscoreid: String,
                lastUnderscoreid: String,
                hasUnderscoremore: Boolean
                )

object ListAssistantsResponse {
    /**
     * Creates the codec for converting ListAssistantsResponse from and to JSON.
     */
    implicit val decoder: Decoder[ListAssistantsResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[ListAssistantsResponse] = deriveEncoder
}
