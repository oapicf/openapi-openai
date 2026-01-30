package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ArrayOfContentPartsInner

/**
 * 
 */
case class CreateMessageRequestContent()

object CreateMessageRequestContent {
    /**
     * Creates the codec for converting CreateMessageRequestContent from and to JSON.
     */
    implicit val decoder: Decoder[CreateMessageRequestContent] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateMessageRequestContent] = deriveEncoder
}
