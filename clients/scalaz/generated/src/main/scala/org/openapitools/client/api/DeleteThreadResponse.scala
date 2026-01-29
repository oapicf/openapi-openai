package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import DeleteThreadResponse._

case class DeleteThreadResponse (
  id: String,
deleted: Boolean,
`object`: `Object`)

object DeleteThreadResponse {
  import DateTimeCodecs._
  sealed trait `Object`
  case object ThreadDeleted extends `Object`

  object `Object` {
    def to`Object`(s: String): Option[`Object`] = s match {
      case "ThreadDeleted" => Some(ThreadDeleted)
      case _ => None
    }

    def from`Object`(x: `Object`): String = x match {
      case ThreadDeleted => "ThreadDeleted"
    }
  }

  implicit val `Object`EnumEncoder: EncodeJson[`Object`] =
    EncodeJson[`Object`](is => StringEncodeJson(`Object`.from`Object`(is)))

  implicit val `Object`EnumDecoder: DecodeJson[`Object`] =
    DecodeJson.optionDecoder[`Object`](n => n.string.flatMap(jStr => `Object`.to`Object`(jStr)), "`Object` failed to de-serialize")

  implicit val DeleteThreadResponseCodecJson: CodecJson[DeleteThreadResponse] = CodecJson.derive[DeleteThreadResponse]
  implicit val DeleteThreadResponseDecoder: EntityDecoder[DeleteThreadResponse] = jsonOf[DeleteThreadResponse]
  implicit val DeleteThreadResponseEncoder: EntityEncoder[DeleteThreadResponse] = jsonEncoderOf[DeleteThreadResponse]
}
