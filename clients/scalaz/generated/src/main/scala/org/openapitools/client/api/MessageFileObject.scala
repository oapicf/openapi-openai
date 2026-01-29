package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MessageFileObject._

case class MessageFileObject (
  /* The identifier, which can be referenced in API endpoints. */
  id: String,
/* The object type, which is always `thread.message.file`. */
  `object`: `Object`,
/* The Unix timestamp (in seconds) for when the message file was created. */
  createdAt: Integer,
/* The ID of the [message](/docs/api-reference/messages) that the [File](/docs/api-reference/files) is attached to. */
  messageId: String)

object MessageFileObject {
  import DateTimeCodecs._
  sealed trait `Object`
  case object ThreadMessageFile extends `Object`

  object `Object` {
    def to`Object`(s: String): Option[`Object`] = s match {
      case "ThreadMessageFile" => Some(ThreadMessageFile)
      case _ => None
    }

    def from`Object`(x: `Object`): String = x match {
      case ThreadMessageFile => "ThreadMessageFile"
    }
  }

  implicit val `Object`EnumEncoder: EncodeJson[`Object`] =
    EncodeJson[`Object`](is => StringEncodeJson(`Object`.from`Object`(is)))

  implicit val `Object`EnumDecoder: DecodeJson[`Object`] =
    DecodeJson.optionDecoder[`Object`](n => n.string.flatMap(jStr => `Object`.to`Object`(jStr)), "`Object` failed to de-serialize")

  implicit val MessageFileObjectCodecJson: CodecJson[MessageFileObject] = CodecJson.derive[MessageFileObject]
  implicit val MessageFileObjectDecoder: EntityDecoder[MessageFileObject] = jsonOf[MessageFileObject]
  implicit val MessageFileObjectEncoder: EntityEncoder[MessageFileObject] = jsonEncoderOf[MessageFileObject]
}
