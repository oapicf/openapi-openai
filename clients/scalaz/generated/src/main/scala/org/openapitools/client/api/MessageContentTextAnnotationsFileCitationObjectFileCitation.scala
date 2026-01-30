package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MessageContentTextAnnotationsFileCitationObjectFileCitation._

case class MessageContentTextAnnotationsFileCitationObjectFileCitation (
  /* The ID of the specific File the citation is from. */
  fileId: String)

object MessageContentTextAnnotationsFileCitationObjectFileCitation {
  import DateTimeCodecs._

  implicit val MessageContentTextAnnotationsFileCitationObjectFileCitationCodecJson: CodecJson[MessageContentTextAnnotationsFileCitationObjectFileCitation] = CodecJson.derive[MessageContentTextAnnotationsFileCitationObjectFileCitation]
  implicit val MessageContentTextAnnotationsFileCitationObjectFileCitationDecoder: EntityDecoder[MessageContentTextAnnotationsFileCitationObjectFileCitation] = jsonOf[MessageContentTextAnnotationsFileCitationObjectFileCitation]
  implicit val MessageContentTextAnnotationsFileCitationObjectFileCitationEncoder: EntityEncoder[MessageContentTextAnnotationsFileCitationObjectFileCitation] = jsonEncoderOf[MessageContentTextAnnotationsFileCitationObjectFileCitation]
}
