package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import DeleteMessageResponse._

case class DeleteMessageResponse (
  id: String,
deleted: Boolean,
`object`: `Object`)

object DeleteMessageResponse {
  import DateTimeCodecs._
  sealed trait `Object`
  case object ThreadMessageDeleted extends `Object`

  object `Object` {
    def to`Object`(s: String): Option[`Object`] = s match {
      case "ThreadMessageDeleted" => Some(ThreadMessageDeleted)
      case _ => None
    }

    def from`Object`(x: `Object`): String = x match {
      case ThreadMessageDeleted => "ThreadMessageDeleted"
    }
  }

  implicit val `Object`EnumEncoder: EncodeJson[`Object`] =
    EncodeJson[`Object`](is => StringEncodeJson(`Object`.from`Object`(is)))

  implicit val `Object`EnumDecoder: DecodeJson[`Object`] =
    DecodeJson.optionDecoder[`Object`](n => n.string.flatMap(jStr => `Object`.to`Object`(jStr)), "`Object` failed to de-serialize")

  implicit val DeleteMessageResponseCodecJson: CodecJson[DeleteMessageResponse] = CodecJson.derive[DeleteMessageResponse]
  implicit val DeleteMessageResponseDecoder: EntityDecoder[DeleteMessageResponse] = jsonOf[DeleteMessageResponse]
  implicit val DeleteMessageResponseEncoder: EntityEncoder[DeleteMessageResponse] = jsonEncoderOf[DeleteMessageResponse]
}
