package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ChatCompletionRequestMessage._

case class ChatCompletionRequestMessage (
  /* The role of the messages author. One of `system`, `user`, `assistant`, or `function`. */
  role: Role,
/* The contents of the message. `content` is required for all messages except assistant messages with function calls. */
  content: Option[String],
/* The name of the author of this message. `name` is required if role is `function`, and it should be the name of the function whose response is in the `content`. May contain a-z, A-Z, 0-9, and underscores, with a maximum length of 64 characters. */
  name: Option[String],
functionCall: Option[ChatCompletionRequestMessageFunctionCall])

object ChatCompletionRequestMessage {
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

  implicit val ChatCompletionRequestMessageCodecJson: CodecJson[ChatCompletionRequestMessage] = CodecJson.derive[ChatCompletionRequestMessage]
  implicit val ChatCompletionRequestMessageDecoder: EntityDecoder[ChatCompletionRequestMessage] = jsonOf[ChatCompletionRequestMessage]
  implicit val ChatCompletionRequestMessageEncoder: EntityEncoder[ChatCompletionRequestMessage] = jsonEncoderOf[ChatCompletionRequestMessage]
}
