package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ChatCompletionRequestFunctionMessage._

case class ChatCompletionRequestFunctionMessage (
  /* The role of the messages author, in this case `function`. */
  role: Role,
/* The contents of the function message. */
  content: String,
/* The name of the function to call. */
  name: String)

object ChatCompletionRequestFunctionMessage {
  import DateTimeCodecs._
  sealed trait Role
  case object Function extends Role

  object Role {
    def toRole(s: String): Option[Role] = s match {
      case "Function" => Some(Function)
      case _ => None
    }

    def fromRole(x: Role): String = x match {
      case Function => "Function"
    }
  }

  implicit val RoleEnumEncoder: EncodeJson[Role] =
    EncodeJson[Role](is => StringEncodeJson(Role.fromRole(is)))

  implicit val RoleEnumDecoder: DecodeJson[Role] =
    DecodeJson.optionDecoder[Role](n => n.string.flatMap(jStr => Role.toRole(jStr)), "Role failed to de-serialize")

  implicit val ChatCompletionRequestFunctionMessageCodecJson: CodecJson[ChatCompletionRequestFunctionMessage] = CodecJson.derive[ChatCompletionRequestFunctionMessage]
  implicit val ChatCompletionRequestFunctionMessageDecoder: EntityDecoder[ChatCompletionRequestFunctionMessage] = jsonOf[ChatCompletionRequestFunctionMessage]
  implicit val ChatCompletionRequestFunctionMessageEncoder: EntityEncoder[ChatCompletionRequestFunctionMessage] = jsonEncoderOf[ChatCompletionRequestFunctionMessage]
}
