package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import DeleteFileResponse._

case class DeleteFileResponse (
  id: String,
`object`: `Object`,
deleted: Boolean)

object DeleteFileResponse {
  import DateTimeCodecs._
  sealed trait `Object`
  case object File extends `Object`

  object `Object` {
    def to`Object`(s: String): Option[`Object`] = s match {
      case "File" => Some(File)
      case _ => None
    }

    def from`Object`(x: `Object`): String = x match {
      case File => "File"
    }
  }

  implicit val `Object`EnumEncoder: EncodeJson[`Object`] =
    EncodeJson[`Object`](is => StringEncodeJson(`Object`.from`Object`(is)))

  implicit val `Object`EnumDecoder: DecodeJson[`Object`] =
    DecodeJson.optionDecoder[`Object`](n => n.string.flatMap(jStr => `Object`.to`Object`(jStr)), "`Object` failed to de-serialize")

  implicit val DeleteFileResponseCodecJson: CodecJson[DeleteFileResponse] = CodecJson.derive[DeleteFileResponse]
  implicit val DeleteFileResponseDecoder: EntityDecoder[DeleteFileResponse] = jsonOf[DeleteFileResponse]
  implicit val DeleteFileResponseEncoder: EntityEncoder[DeleteFileResponse] = jsonEncoderOf[DeleteFileResponse]
}
