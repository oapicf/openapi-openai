package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import Upload._

case class Upload (
  /* The Upload unique identifier, which can be referenced in API endpoints. */
  id: String,
/* The Unix timestamp (in seconds) for when the Upload was created. */
  createdAt: Integer,
/* The name of the file to be uploaded. */
  filename: String,
/* The intended number of bytes to be uploaded. */
  bytes: Integer,
/* The intended purpose of the file. [Please refer here](/docs/api-reference/files/object#files/object-purpose) for acceptable values. */
  purpose: String,
/* The status of the Upload. */
  status: Status,
/* The Unix timestamp (in seconds) for when the Upload was created. */
  expiresAt: Integer,
/* The object type, which is always \"upload\". */
  `object`: Option[`Object`],
file: Option[OpenAIFile])

object Upload {
  import DateTimeCodecs._
  sealed trait Status
  case object Pending extends Status
  case object Completed extends Status
  case object Cancelled extends Status
  case object Expired extends Status

  object Status {
    def toStatus(s: String): Option[Status] = s match {
      case "Pending" => Some(Pending)
      case "Completed" => Some(Completed)
      case "Cancelled" => Some(Cancelled)
      case "Expired" => Some(Expired)
      case _ => None
    }

    def fromStatus(x: Status): String = x match {
      case Pending => "Pending"
      case Completed => "Completed"
      case Cancelled => "Cancelled"
      case Expired => "Expired"
    }
  }

  implicit val StatusEnumEncoder: EncodeJson[Status] =
    EncodeJson[Status](is => StringEncodeJson(Status.fromStatus(is)))

  implicit val StatusEnumDecoder: DecodeJson[Status] =
    DecodeJson.optionDecoder[Status](n => n.string.flatMap(jStr => Status.toStatus(jStr)), "Status failed to de-serialize")
  sealed trait `Object`
  case object Upload extends `Object`

  object `Object` {
    def to`Object`(s: String): Option[`Object`] = s match {
      case "Upload" => Some(Upload)
      case _ => None
    }

    def from`Object`(x: `Object`): String = x match {
      case Upload => "Upload"
    }
  }

  implicit val `Object`EnumEncoder: EncodeJson[`Object`] =
    EncodeJson[`Object`](is => StringEncodeJson(`Object`.from`Object`(is)))

  implicit val `Object`EnumDecoder: DecodeJson[`Object`] =
    DecodeJson.optionDecoder[`Object`](n => n.string.flatMap(jStr => `Object`.to`Object`(jStr)), "`Object` failed to de-serialize")

  implicit val UploadCodecJson: CodecJson[Upload] = CodecJson.derive[Upload]
  implicit val UploadDecoder: EntityDecoder[Upload] = jsonOf[Upload]
  implicit val UploadEncoder: EntityEncoder[Upload] = jsonEncoderOf[Upload]
}
