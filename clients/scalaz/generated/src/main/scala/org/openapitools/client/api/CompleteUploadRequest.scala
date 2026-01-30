package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CompleteUploadRequest._

case class CompleteUploadRequest (
  /* The ordered list of Part IDs.  */
  partIds: List[String],
/* The optional md5 checksum for the file contents to verify if the bytes uploaded matches what you expect.  */
  md5: Option[String])

object CompleteUploadRequest {
  import DateTimeCodecs._

  implicit val CompleteUploadRequestCodecJson: CodecJson[CompleteUploadRequest] = CodecJson.derive[CompleteUploadRequest]
  implicit val CompleteUploadRequestDecoder: EntityDecoder[CompleteUploadRequest] = jsonOf[CompleteUploadRequest]
  implicit val CompleteUploadRequestEncoder: EntityEncoder[CompleteUploadRequest] = jsonEncoderOf[CompleteUploadRequest]
}
