package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ChatCompletionRequestToolMessage._

case class ChatCompletionRequestToolMessage (
  /* The role of the messages author, in this case `tool`. */
  role: Role,
/* The contents of the tool message. */
  content: String,
/* Tool call that this message is responding to. */
  toolCallId: String)

object ChatCompletionRequestToolMessage {
  import DateTimeCodecs._
  sealed trait Role
  case object Tool extends Role

  object Role {
    def toRole(s: String): Option[Role] = s match {
      case "Tool" => Some(Tool)
      case _ => None
    }

    def fromRole(x: Role): String = x match {
      case Tool => "Tool"
    }
  }

  implicit val RoleEnumEncoder: EncodeJson[Role] =
    EncodeJson[Role](is => StringEncodeJson(Role.fromRole(is)))

  implicit val RoleEnumDecoder: DecodeJson[Role] =
    DecodeJson.optionDecoder[Role](n => n.string.flatMap(jStr => Role.toRole(jStr)), "Role failed to de-serialize")

  implicit val ChatCompletionRequestToolMessageCodecJson: CodecJson[ChatCompletionRequestToolMessage] = CodecJson.derive[ChatCompletionRequestToolMessage]
  implicit val ChatCompletionRequestToolMessageDecoder: EntityDecoder[ChatCompletionRequestToolMessage] = jsonOf[ChatCompletionRequestToolMessage]
  implicit val ChatCompletionRequestToolMessageEncoder: EntityEncoder[ChatCompletionRequestToolMessage] = jsonEncoderOf[ChatCompletionRequestToolMessage]
}
