package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.MessageDeltaContentTextObjectTextAnnotationsInner
import scala.collection.immutable.Seq

/**
 * 
 * @param value The data that makes up the text.
 * @param annotations 
 */
case class MessageDeltaContentTextObjectText(value: Option[String],
                annotations: Option[Seq[MessageDeltaContentTextObjectTextAnnotationsInner]]
                )

object MessageDeltaContentTextObjectText {
    /**
     * Creates the codec for converting MessageDeltaContentTextObjectText from and to JSON.
     */
    implicit val decoder: Decoder[MessageDeltaContentTextObjectText] = deriveDecoder
    implicit val encoder: ObjectEncoder[MessageDeltaContentTextObjectText] = deriveEncoder
}
