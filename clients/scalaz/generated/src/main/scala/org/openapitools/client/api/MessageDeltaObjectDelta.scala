package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MessageDeltaObjectDelta._

case class MessageDeltaObjectDelta (
  /* The entity that produced the message. One of `user` or `assistant`. */
  role: Option[Role],
/* The content of the message in array of text and/or images. */
  content: Option[List[MessageDeltaObjectDeltaContentInner]],
/* A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message. */
  fileIds: Option[List[String]])

object MessageDeltaObjectDelta {
  import DateTimeCodecs._
  sealed trait Role
  case object User extends Role
  case object Assistant extends Role

  object Role {
    def toRole(s: String): Option[Role] = s match {
      case "User" => Some(User)
      case "Assistant" => Some(Assistant)
      case _ => None
    }

    def fromRole(x: Role): String = x match {
      case User => "User"
      case Assistant => "Assistant"
    }
  }

  implicit val RoleEnumEncoder: EncodeJson[Role] =
    EncodeJson[Role](is => StringEncodeJson(Role.fromRole(is)))

  implicit val RoleEnumDecoder: DecodeJson[Role] =
    DecodeJson.optionDecoder[Role](n => n.string.flatMap(jStr => Role.toRole(jStr)), "Role failed to de-serialize")

  implicit val MessageDeltaObjectDeltaCodecJson: CodecJson[MessageDeltaObjectDelta] = CodecJson.derive[MessageDeltaObjectDelta]
  implicit val MessageDeltaObjectDeltaDecoder: EntityDecoder[MessageDeltaObjectDelta] = jsonOf[MessageDeltaObjectDelta]
  implicit val MessageDeltaObjectDeltaEncoder: EntityEncoder[MessageDeltaObjectDelta] = jsonEncoderOf[MessageDeltaObjectDelta]
}
