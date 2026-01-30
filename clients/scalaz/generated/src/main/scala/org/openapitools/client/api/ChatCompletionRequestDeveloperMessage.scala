package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ChatCompletionRequestDeveloperMessage._

case class ChatCompletionRequestDeveloperMessage (
  content: ChatCompletionRequestDeveloperMessageContent,
/* The role of the messages author, in this case `developer`. */
  role: Role,
/* An optional name for the participant. Provides the model information to differentiate between participants of the same role. */
  name: Option[String])

object ChatCompletionRequestDeveloperMessage {
  import DateTimeCodecs._
  sealed trait Role
  case object Developer extends Role

  object Role {
    def toRole(s: String): Option[Role] = s match {
      case "Developer" => Some(Developer)
      case _ => None
    }

    def fromRole(x: Role): String = x match {
      case Developer => "Developer"
    }
  }

  implicit val RoleEnumEncoder: EncodeJson[Role] =
    EncodeJson[Role](is => StringEncodeJson(Role.fromRole(is)))

  implicit val RoleEnumDecoder: DecodeJson[Role] =
    DecodeJson.optionDecoder[Role](n => n.string.flatMap(jStr => Role.toRole(jStr)), "Role failed to de-serialize")

  implicit val ChatCompletionRequestDeveloperMessageCodecJson: CodecJson[ChatCompletionRequestDeveloperMessage] = CodecJson.derive[ChatCompletionRequestDeveloperMessage]
  implicit val ChatCompletionRequestDeveloperMessageDecoder: EntityDecoder[ChatCompletionRequestDeveloperMessage] = jsonOf[ChatCompletionRequestDeveloperMessage]
  implicit val ChatCompletionRequestDeveloperMessageEncoder: EntityEncoder[ChatCompletionRequestDeveloperMessage] = jsonEncoderOf[ChatCompletionRequestDeveloperMessage]
}
