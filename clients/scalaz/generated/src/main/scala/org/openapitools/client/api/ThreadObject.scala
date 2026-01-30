package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ThreadObject._

case class ThreadObject (
  /* The identifier, which can be referenced in API endpoints. */
  id: String,
/* The object type, which is always `thread`. */
  `object`: `Object`,
/* The Unix timestamp (in seconds) for when the thread was created. */
  createdAt: Integer,
toolResources: ModifyThreadRequestToolResources,
/* Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  */
  metadata: Any)

object ThreadObject {
  import DateTimeCodecs._
  sealed trait `Object`
  case object Thread extends `Object`

  object `Object` {
    def to`Object`(s: String): Option[`Object`] = s match {
      case "Thread" => Some(Thread)
      case _ => None
    }

    def from`Object`(x: `Object`): String = x match {
      case Thread => "Thread"
    }
  }

  implicit val `Object`EnumEncoder: EncodeJson[`Object`] =
    EncodeJson[`Object`](is => StringEncodeJson(`Object`.from`Object`(is)))

  implicit val `Object`EnumDecoder: DecodeJson[`Object`] =
    DecodeJson.optionDecoder[`Object`](n => n.string.flatMap(jStr => `Object`.to`Object`(jStr)), "`Object` failed to de-serialize")

  implicit val ThreadObjectCodecJson: CodecJson[ThreadObject] = CodecJson.derive[ThreadObject]
  implicit val ThreadObjectDecoder: EntityDecoder[ThreadObject] = jsonOf[ThreadObject]
  implicit val ThreadObjectEncoder: EntityEncoder[ThreadObject] = jsonEncoderOf[ThreadObject]
}
