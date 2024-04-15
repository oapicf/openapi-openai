package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateMessageRequest._

case class CreateMessageRequest (
  /* The role of the entity that is creating the message. Allowed values include: - `user`: Indicates the message is sent by an actual user and should be used in most cases to represent user-generated messages. - `assistant`: Indicates the message is generated by the assistant. Use this value to insert messages from the assistant into the conversation.  */
  role: Role,
/* The content of the message. */
  content: String,
/* A list of [File](/docs/api-reference/files) IDs that the message should use. There can be a maximum of 10 files attached to a message. Useful for tools like `retrieval` and `code_interpreter` that can access and use files. */
  fileIds: Option[List[String]],
/* Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  */
  metadata: Option[Any])

object CreateMessageRequest {
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

  implicit val CreateMessageRequestCodecJson: CodecJson[CreateMessageRequest] = CodecJson.derive[CreateMessageRequest]
  implicit val CreateMessageRequestDecoder: EntityDecoder[CreateMessageRequest] = jsonOf[CreateMessageRequest]
  implicit val CreateMessageRequestEncoder: EntityEncoder[CreateMessageRequest] = jsonEncoderOf[CreateMessageRequest]
}