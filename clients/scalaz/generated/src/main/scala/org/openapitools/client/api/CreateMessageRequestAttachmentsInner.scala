package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateMessageRequestAttachmentsInner._

case class CreateMessageRequestAttachmentsInner (
  /* The ID of the file to attach to the message. */
  fileId: Option[String],
/* The tools to add this file to. */
  tools: Option[List[CreateMessageRequestAttachmentsInnerToolsInner]])

object CreateMessageRequestAttachmentsInner {
  import DateTimeCodecs._

  implicit val CreateMessageRequestAttachmentsInnerCodecJson: CodecJson[CreateMessageRequestAttachmentsInner] = CodecJson.derive[CreateMessageRequestAttachmentsInner]
  implicit val CreateMessageRequestAttachmentsInnerDecoder: EntityDecoder[CreateMessageRequestAttachmentsInner] = jsonOf[CreateMessageRequestAttachmentsInner]
  implicit val CreateMessageRequestAttachmentsInnerEncoder: EntityEncoder[CreateMessageRequestAttachmentsInner] = jsonEncoderOf[CreateMessageRequestAttachmentsInner]
}
