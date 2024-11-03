package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ChatCompletionRequestUserMessage._

case class ChatCompletionRequestUserMessage (
  content: ChatCompletionRequestUserMessageContent,
/* The role of the messages author, in this case `user`. */
  role: Role,
/* An optional name for the participant. Provides the model information to differentiate between participants of the same role. */
  name: Option[String])

object ChatCompletionRequestUserMessage {
  import DateTimeCodecs._
  sealed trait Role
  case object User extends Role

  object Role {
    def toRole(s: String): Option[Role] = s match {
      case "User" => Some(User)
      case _ => None
    }

    def fromRole(x: Role): String = x match {
      case User => "User"
    }
  }

  implicit val RoleEnumEncoder: EncodeJson[Role] =
    EncodeJson[Role](is => StringEncodeJson(Role.fromRole(is)))

  implicit val RoleEnumDecoder: DecodeJson[Role] =
    DecodeJson.optionDecoder[Role](n => n.string.flatMap(jStr => Role.toRole(jStr)), "Role failed to de-serialize")

  implicit val ChatCompletionRequestUserMessageCodecJson: CodecJson[ChatCompletionRequestUserMessage] = CodecJson.derive[ChatCompletionRequestUserMessage]
  implicit val ChatCompletionRequestUserMessageDecoder: EntityDecoder[ChatCompletionRequestUserMessage] = jsonOf[ChatCompletionRequestUserMessage]
  implicit val ChatCompletionRequestUserMessageEncoder: EntityEncoder[ChatCompletionRequestUserMessage] = jsonEncoderOf[ChatCompletionRequestUserMessage]
}
