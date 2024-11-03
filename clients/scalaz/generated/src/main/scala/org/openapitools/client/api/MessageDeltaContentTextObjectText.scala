package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MessageDeltaContentTextObjectText._

case class MessageDeltaContentTextObjectText (
  /* The data that makes up the text. */
  value: Option[String],
annotations: Option[List[MessageDeltaContentTextObjectTextAnnotationsInner]])

object MessageDeltaContentTextObjectText {
  import DateTimeCodecs._

  implicit val MessageDeltaContentTextObjectTextCodecJson: CodecJson[MessageDeltaContentTextObjectText] = CodecJson.derive[MessageDeltaContentTextObjectText]
  implicit val MessageDeltaContentTextObjectTextDecoder: EntityDecoder[MessageDeltaContentTextObjectText] = jsonOf[MessageDeltaContentTextObjectText]
  implicit val MessageDeltaContentTextObjectTextEncoder: EntityEncoder[MessageDeltaContentTextObjectText] = jsonEncoderOf[MessageDeltaContentTextObjectText]
}
