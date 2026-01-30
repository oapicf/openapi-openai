package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CreateMessageRequestAttachmentsInnerToolsInner
import scala.collection.immutable.Seq

/**
 * 
 * @param fileUnderscoreid The ID of the file to attach to the message.
 * @param tools The tools to add this file to.
 */
case class CreateMessageRequestAttachmentsInner(fileUnderscoreid: Option[String],
                tools: Option[Seq[CreateMessageRequestAttachmentsInnerToolsInner]]
                )

object CreateMessageRequestAttachmentsInner {
    /**
     * Creates the codec for converting CreateMessageRequestAttachmentsInner from and to JSON.
     */
    implicit val decoder: Decoder[CreateMessageRequestAttachmentsInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateMessageRequestAttachmentsInner] = deriveEncoder
}
