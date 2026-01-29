package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation._

case class MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation (
  /* The ID of the specific File the citation is from. */
  fileId: Option[String],
/* The specific quote in the file. */
  quote: Option[String])

object MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation {
  import DateTimeCodecs._

  implicit val MessageDeltaContentTextAnnotationsFileCitationObjectFileCitationCodecJson: CodecJson[MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation] = CodecJson.derive[MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation]
  implicit val MessageDeltaContentTextAnnotationsFileCitationObjectFileCitationDecoder: EntityDecoder[MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation] = jsonOf[MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation]
  implicit val MessageDeltaContentTextAnnotationsFileCitationObjectFileCitationEncoder: EntityEncoder[MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation] = jsonEncoderOf[MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation]
}
