package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.MessageContentTextObjectTextAnnotationsInner
import scala.collection.immutable.Seq

/**
 * 
 * @param value The data that makes up the text.
 * @param annotations 
 */
case class MessageContentTextObjectText(value: String,
                annotations: Seq[MessageContentTextObjectTextAnnotationsInner]
                )

object MessageContentTextObjectText {
    /**
     * Creates the codec for converting MessageContentTextObjectText from and to JSON.
     */
    implicit val decoder: Decoder[MessageContentTextObjectText] = deriveDecoder
    implicit val encoder: ObjectEncoder[MessageContentTextObjectText] = deriveEncoder
}
