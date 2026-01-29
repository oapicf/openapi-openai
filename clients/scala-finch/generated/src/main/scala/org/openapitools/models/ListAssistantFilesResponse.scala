package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AssistantFileObject
import scala.collection.immutable.Seq

/**
 * 
 * @param _object 
 * @param data 
 * @param firstUnderscoreid 
 * @param lastUnderscoreid 
 * @param hasUnderscoremore 
 */
case class ListAssistantFilesResponse(_object: String,
                data: Seq[AssistantFileObject],
                firstUnderscoreid: String,
                lastUnderscoreid: String,
                hasUnderscoremore: Boolean
                )

object ListAssistantFilesResponse {
    /**
     * Creates the codec for converting ListAssistantFilesResponse from and to JSON.
     */
    implicit val decoder: Decoder[ListAssistantFilesResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[ListAssistantFilesResponse] = deriveEncoder
}
