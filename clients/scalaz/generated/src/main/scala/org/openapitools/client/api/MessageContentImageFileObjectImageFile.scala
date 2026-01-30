package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MessageContentImageFileObjectImageFile._

case class MessageContentImageFileObjectImageFile (
  /* The [File](/docs/api-reference/files) ID of the image in the message content. Set `purpose=\"vision\"` when uploading the File if you need to later display the file content. */
  fileId: String,
/* Specifies the detail level of the image if specified by the user. `low` uses fewer tokens, you can opt in to high resolution using `high`. */
  detail: Option[Detail])

object MessageContentImageFileObjectImageFile {
  import DateTimeCodecs._
  sealed trait Detail
  case object Auto extends Detail
  case object Low extends Detail
  case object High extends Detail

  object Detail {
    def toDetail(s: String): Option[Detail] = s match {
      case "Auto" => Some(Auto)
      case "Low" => Some(Low)
      case "High" => Some(High)
      case _ => None
    }

    def fromDetail(x: Detail): String = x match {
      case Auto => "Auto"
      case Low => "Low"
      case High => "High"
    }
  }

  implicit val DetailEnumEncoder: EncodeJson[Detail] =
    EncodeJson[Detail](is => StringEncodeJson(Detail.fromDetail(is)))

  implicit val DetailEnumDecoder: DecodeJson[Detail] =
    DecodeJson.optionDecoder[Detail](n => n.string.flatMap(jStr => Detail.toDetail(jStr)), "Detail failed to de-serialize")

  implicit val MessageContentImageFileObjectImageFileCodecJson: CodecJson[MessageContentImageFileObjectImageFile] = CodecJson.derive[MessageContentImageFileObjectImageFile]
  implicit val MessageContentImageFileObjectImageFileDecoder: EntityDecoder[MessageContentImageFileObjectImageFile] = jsonOf[MessageContentImageFileObjectImageFile]
  implicit val MessageContentImageFileObjectImageFileEncoder: EntityEncoder[MessageContentImageFileObjectImageFile] = jsonEncoderOf[MessageContentImageFileObjectImageFile]
}
