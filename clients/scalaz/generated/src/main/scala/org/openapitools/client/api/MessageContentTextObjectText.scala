package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MessageContentTextObjectText._

case class MessageContentTextObjectText (
  /* The data that makes up the text. */
  value: String,
annotations: List[MessageContentTextObjectTextAnnotationsInner])

object MessageContentTextObjectText {
  import DateTimeCodecs._

  implicit val MessageContentTextObjectTextCodecJson: CodecJson[MessageContentTextObjectText] = CodecJson.derive[MessageContentTextObjectText]
  implicit val MessageContentTextObjectTextDecoder: EntityDecoder[MessageContentTextObjectText] = jsonOf[MessageContentTextObjectText]
  implicit val MessageContentTextObjectTextEncoder: EntityEncoder[MessageContentTextObjectText] = jsonEncoderOf[MessageContentTextObjectText]
}
