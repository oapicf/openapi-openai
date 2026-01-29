package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MessageDeltaObject._

case class MessageDeltaObject (
  /* The identifier of the message, which can be referenced in API endpoints. */
  id: String,
/* The object type, which is always `thread.message.delta`. */
  `object`: `Object`,
delta: MessageDeltaObjectDelta)

object MessageDeltaObject {
  import DateTimeCodecs._
  sealed trait `Object`
  case object ThreadMessageDelta extends `Object`

  object `Object` {
    def to`Object`(s: String): Option[`Object`] = s match {
      case "ThreadMessageDelta" => Some(ThreadMessageDelta)
      case _ => None
    }

    def from`Object`(x: `Object`): String = x match {
      case ThreadMessageDelta => "ThreadMessageDelta"
    }
  }

  implicit val `Object`EnumEncoder: EncodeJson[`Object`] =
    EncodeJson[`Object`](is => StringEncodeJson(`Object`.from`Object`(is)))

  implicit val `Object`EnumDecoder: DecodeJson[`Object`] =
    DecodeJson.optionDecoder[`Object`](n => n.string.flatMap(jStr => `Object`.to`Object`(jStr)), "`Object` failed to de-serialize")

  implicit val MessageDeltaObjectCodecJson: CodecJson[MessageDeltaObject] = CodecJson.derive[MessageDeltaObject]
  implicit val MessageDeltaObjectDecoder: EntityDecoder[MessageDeltaObject] = jsonOf[MessageDeltaObject]
  implicit val MessageDeltaObjectEncoder: EntityEncoder[MessageDeltaObject] = jsonEncoderOf[MessageDeltaObject]
}
