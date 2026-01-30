package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ChatCompletionRequestSystemMessage._

case class ChatCompletionRequestSystemMessage (
  content: ChatCompletionRequestSystemMessageContent,
/* The role of the messages author, in this case `system`. */
  role: Role,
/* An optional name for the participant. Provides the model information to differentiate between participants of the same role. */
  name: Option[String])

object ChatCompletionRequestSystemMessage {
  import DateTimeCodecs._
  sealed trait Role
  case object System extends Role

  object Role {
    def toRole(s: String): Option[Role] = s match {
      case "System" => Some(System)
      case _ => None
    }

    def fromRole(x: Role): String = x match {
      case System => "System"
    }
  }

  implicit val RoleEnumEncoder: EncodeJson[Role] =
    EncodeJson[Role](is => StringEncodeJson(Role.fromRole(is)))

  implicit val RoleEnumDecoder: DecodeJson[Role] =
    DecodeJson.optionDecoder[Role](n => n.string.flatMap(jStr => Role.toRole(jStr)), "Role failed to de-serialize")

  implicit val ChatCompletionRequestSystemMessageCodecJson: CodecJson[ChatCompletionRequestSystemMessage] = CodecJson.derive[ChatCompletionRequestSystemMessage]
  implicit val ChatCompletionRequestSystemMessageDecoder: EntityDecoder[ChatCompletionRequestSystemMessage] = jsonOf[ChatCompletionRequestSystemMessage]
  implicit val ChatCompletionRequestSystemMessageEncoder: EntityEncoder[ChatCompletionRequestSystemMessage] = jsonEncoderOf[ChatCompletionRequestSystemMessage]
}
