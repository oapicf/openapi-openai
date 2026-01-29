package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.MessageObject
import scala.collection.immutable.Seq

/**
 * 
 * @param _object 
 * @param data 
 * @param firstUnderscoreid 
 * @param lastUnderscoreid 
 * @param hasUnderscoremore 
 */
case class ListMessagesResponse(_object: String,
                data: Seq[MessageObject],
                firstUnderscoreid: String,
                lastUnderscoreid: String,
                hasUnderscoremore: Boolean
                )

object ListMessagesResponse {
    /**
     * Creates the codec for converting ListMessagesResponse from and to JSON.
     */
    implicit val decoder: Decoder[ListMessagesResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[ListMessagesResponse] = deriveEncoder
}
