package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MessageContentTextAnnotationsFilePathObjectFilePath._

case class MessageContentTextAnnotationsFilePathObjectFilePath (
  /* The ID of the file that was generated. */
  fileId: String)

object MessageContentTextAnnotationsFilePathObjectFilePath {
  import DateTimeCodecs._

  implicit val MessageContentTextAnnotationsFilePathObjectFilePathCodecJson: CodecJson[MessageContentTextAnnotationsFilePathObjectFilePath] = CodecJson.derive[MessageContentTextAnnotationsFilePathObjectFilePath]
  implicit val MessageContentTextAnnotationsFilePathObjectFilePathDecoder: EntityDecoder[MessageContentTextAnnotationsFilePathObjectFilePath] = jsonOf[MessageContentTextAnnotationsFilePathObjectFilePath]
  implicit val MessageContentTextAnnotationsFilePathObjectFilePathEncoder: EntityEncoder[MessageContentTextAnnotationsFilePathObjectFilePath] = jsonEncoderOf[MessageContentTextAnnotationsFilePathObjectFilePath]
}
