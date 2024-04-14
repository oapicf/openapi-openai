package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.MessageDeltaObjectDeltaContentInner
import scala.collection.immutable.Seq

/**
 * The delta containing the fields that have changed on the Message.
 * @param role The entity that produced the message. One of `user` or `assistant`.
 * @param content The content of the message in array of text and/or images.
 * @param fileUnderscoreids A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message.
 */
case class MessageDeltaObjectDelta(role: Option[String],
                content: Option[Seq[MessageDeltaObjectDeltaContentInner]],
                fileUnderscoreids: Option[Seq[String]]
                )

object MessageDeltaObjectDelta {
    /**
     * Creates the codec for converting MessageDeltaObjectDelta from and to JSON.
     */
    implicit val decoder: Decoder[MessageDeltaObjectDelta] = deriveDecoder
    implicit val encoder: ObjectEncoder[MessageDeltaObjectDelta] = deriveEncoder
}
