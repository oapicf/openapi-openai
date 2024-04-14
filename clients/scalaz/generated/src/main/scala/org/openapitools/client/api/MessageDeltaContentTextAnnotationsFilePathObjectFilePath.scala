package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MessageDeltaContentTextAnnotationsFilePathObjectFilePath._

case class MessageDeltaContentTextAnnotationsFilePathObjectFilePath (
  /* The ID of the file that was generated. */
  fileId: Option[String])

object MessageDeltaContentTextAnnotationsFilePathObjectFilePath {
  import DateTimeCodecs._

  implicit val MessageDeltaContentTextAnnotationsFilePathObjectFilePathCodecJson: CodecJson[MessageDeltaContentTextAnnotationsFilePathObjectFilePath] = CodecJson.derive[MessageDeltaContentTextAnnotationsFilePathObjectFilePath]
  implicit val MessageDeltaContentTextAnnotationsFilePathObjectFilePathDecoder: EntityDecoder[MessageDeltaContentTextAnnotationsFilePathObjectFilePath] = jsonOf[MessageDeltaContentTextAnnotationsFilePathObjectFilePath]
  implicit val MessageDeltaContentTextAnnotationsFilePathObjectFilePathEncoder: EntityEncoder[MessageDeltaContentTextAnnotationsFilePathObjectFilePath] = jsonEncoderOf[MessageDeltaContentTextAnnotationsFilePathObjectFilePath]
}
