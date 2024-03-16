package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ChatCompletionStreamResponseDelta._

case class ChatCompletionStreamResponseDelta (
  /* The role of the author of this message. */
  role: Option[Role],
/* The contents of the chunk message. */
  content: Option[String],
functionCall: Option[ChatCompletionRequestMessageFunctionCall])

object ChatCompletionStreamResponseDelta {
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

  implicit val ChatCompletionStreamResponseDeltaCodecJson: CodecJson[ChatCompletionStreamResponseDelta] = CodecJson.derive[ChatCompletionStreamResponseDelta]
  implicit val ChatCompletionStreamResponseDeltaDecoder: EntityDecoder[ChatCompletionStreamResponseDelta] = jsonOf[ChatCompletionStreamResponseDelta]
  implicit val ChatCompletionStreamResponseDeltaEncoder: EntityEncoder[ChatCompletionStreamResponseDelta] = jsonEncoderOf[ChatCompletionStreamResponseDelta]
}
