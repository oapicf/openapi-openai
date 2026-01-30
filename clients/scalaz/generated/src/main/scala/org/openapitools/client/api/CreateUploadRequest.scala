package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateUploadRequest._

case class CreateUploadRequest (
  /* The name of the file to upload.  */
  filename: String,
/* The intended purpose of the uploaded file.  See the [documentation on File purposes](/docs/api-reference/files/create#files-create-purpose).  */
  purpose: Purpose,
/* The number of bytes in the file you are uploading.  */
  bytes: Integer,
/* The MIME type of the file.  This must fall within the supported MIME types for your file purpose. See the supported MIME types for assistants and vision.  */
  mimeType: String)

object CreateUploadRequest {
  import DateTimeCodecs._
  sealed trait Purpose
  case object Assistants extends Purpose
  case object Batch extends Purpose
  case object FineTune extends Purpose
  case object Vision extends Purpose

  object Purpose {
    def toPurpose(s: String): Option[Purpose] = s match {
      case "Assistants" => Some(Assistants)
      case "Batch" => Some(Batch)
      case "FineTune" => Some(FineTune)
      case "Vision" => Some(Vision)
      case _ => None
    }

    def fromPurpose(x: Purpose): String = x match {
      case Assistants => "Assistants"
      case Batch => "Batch"
      case FineTune => "FineTune"
      case Vision => "Vision"
    }
  }

  implicit val PurposeEnumEncoder: EncodeJson[Purpose] =
    EncodeJson[Purpose](is => StringEncodeJson(Purpose.fromPurpose(is)))

  implicit val PurposeEnumDecoder: DecodeJson[Purpose] =
    DecodeJson.optionDecoder[Purpose](n => n.string.flatMap(jStr => Purpose.toPurpose(jStr)), "Purpose failed to de-serialize")

  implicit val CreateUploadRequestCodecJson: CodecJson[CreateUploadRequest] = CodecJson.derive[CreateUploadRequest]
  implicit val CreateUploadRequestDecoder: EntityDecoder[CreateUploadRequest] = jsonOf[CreateUploadRequest]
  implicit val CreateUploadRequestEncoder: EntityEncoder[CreateUploadRequest] = jsonEncoderOf[CreateUploadRequest]
}
