package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ChatCompletionResponseMessage._

case class ChatCompletionResponseMessage (
  /* The role of the author of this message. */
  role: Role,
/* The contents of the message. */
  content: Option[String],
functionCall: Option[ChatCompletionRequestMessageFunctionCall])

object ChatCompletionResponseMessage {
  import DateTimeCodecs._
  sealed trait Role
  case object System extends Role
  case object User extends Role
  case object Assistant extends Role
  case object Function extends Role

  object Role {
    def toRole(s: String): Option[Role] = s match {
      case "System" => Some(System)
      case "User" => Some(User)
      case "Assistant" => Some(Assistant)
      case "Function" => Some(Function)
      case _ => None
    }

    def fromRole(x: Role): String = x match {
      case System => "System"
      case User => "User"
      case Assistant => "Assistant"
      case Function => "Function"
    }
  }

  implicit val RoleEnumEncoder: EncodeJson[Role] =
    EncodeJson[Role](is => StringEncodeJson(Role.fromRole(is)))

  implicit val RoleEnumDecoder: DecodeJson[Role] =
    DecodeJson.optionDecoder[Role](n => n.string.flatMap(jStr => Role.toRole(jStr)), "Role failed to de-serialize")

  implicit val ChatCompletionResponseMessageCodecJson: CodecJson[ChatCompletionResponseMessage] = CodecJson.derive[ChatCompletionResponseMessage]
  implicit val ChatCompletionResponseMessageDecoder: EntityDecoder[ChatCompletionResponseMessage] = jsonOf[ChatCompletionResponseMessage]
  implicit val ChatCompletionResponseMessageEncoder: EntityEncoder[ChatCompletionResponseMessage] = jsonEncoderOf[ChatCompletionResponseMessage]
}
