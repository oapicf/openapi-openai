package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UploadPart._

case class UploadPart (
  /* The upload Part unique identifier, which can be referenced in API endpoints. */
  id: String,
/* The Unix timestamp (in seconds) for when the Part was created. */
  createdAt: Integer,
/* The ID of the Upload object that this Part was added to. */
  uploadId: String,
/* The object type, which is always `upload.part`. */
  `object`: `Object`)

object UploadPart {
  import DateTimeCodecs._
  sealed trait `Object`
  case object UploadPart extends `Object`

  object `Object` {
    def to`Object`(s: String): Option[`Object`] = s match {
      case "UploadPart" => Some(UploadPart)
      case _ => None
    }

    def from`Object`(x: `Object`): String = x match {
      case UploadPart => "UploadPart"
    }
  }

  implicit val `Object`EnumEncoder: EncodeJson[`Object`] =
    EncodeJson[`Object`](is => StringEncodeJson(`Object`.from`Object`(is)))

  implicit val `Object`EnumDecoder: DecodeJson[`Object`] =
    DecodeJson.optionDecoder[`Object`](n => n.string.flatMap(jStr => `Object`.to`Object`(jStr)), "`Object` failed to de-serialize")

  implicit val UploadPartCodecJson: CodecJson[UploadPart] = CodecJson.derive[UploadPart]
  implicit val UploadPartDecoder: EntityDecoder[UploadPart] = jsonOf[UploadPart]
  implicit val UploadPartEncoder: EntityEncoder[UploadPart] = jsonEncoderOf[UploadPart]
}
