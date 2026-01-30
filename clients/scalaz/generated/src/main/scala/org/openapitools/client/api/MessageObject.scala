package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MessageObject._

case class MessageObject (
  /* The identifier, which can be referenced in API endpoints. */
  id: String,
/* The object type, which is always `thread.message`. */
  `object`: `Object`,
/* The Unix timestamp (in seconds) for when the message was created. */
  createdAt: Integer,
/* The [thread](/docs/api-reference/threads) ID that this message belongs to. */
  threadId: String,
/* The status of the message, which can be either `in_progress`, `incomplete`, or `completed`. */
  status: Status,
incompleteDetails: MessageObjectIncompleteDetails,
/* The Unix timestamp (in seconds) for when the message was completed. */
  completedAt: Integer,
/* The Unix timestamp (in seconds) for when the message was marked as incomplete. */
  incompleteAt: Integer,
/* The entity that produced the message. One of `user` or `assistant`. */
  role: Role,
/* The content of the message in array of text and/or images. */
  content: List[MessageObjectContentInner],
/* If applicable, the ID of the [assistant](/docs/api-reference/assistants) that authored this message. */
  assistantId: String,
/* The ID of the [run](/docs/api-reference/runs) associated with the creation of this message. Value is `null` when messages are created manually using the create message or create thread endpoints. */
  runId: String,
/* A list of files attached to the message, and the tools they were added to. */
  attachments: List[CreateMessageRequestAttachmentsInner],
/* Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  */
  metadata: Any)

object MessageObject {
  import DateTimeCodecs._
  sealed trait `Object`
  case object ThreadMessage extends `Object`

  object `Object` {
    def to`Object`(s: String): Option[`Object`] = s match {
      case "ThreadMessage" => Some(ThreadMessage)
      case _ => None
    }

    def from`Object`(x: `Object`): String = x match {
      case ThreadMessage => "ThreadMessage"
    }
  }

  implicit val `Object`EnumEncoder: EncodeJson[`Object`] =
    EncodeJson[`Object`](is => StringEncodeJson(`Object`.from`Object`(is)))

  implicit val `Object`EnumDecoder: DecodeJson[`Object`] =
    DecodeJson.optionDecoder[`Object`](n => n.string.flatMap(jStr => `Object`.to`Object`(jStr)), "`Object` failed to de-serialize")
  sealed trait Status
  case object InProgress extends Status
  case object Incomplete extends Status
  case object Completed extends Status

  object Status {
    def toStatus(s: String): Option[Status] = s match {
      case "InProgress" => Some(InProgress)
      case "Incomplete" => Some(Incomplete)
      case "Completed" => Some(Completed)
      case _ => None
    }

    def fromStatus(x: Status): String = x match {
      case InProgress => "InProgress"
      case Incomplete => "Incomplete"
      case Completed => "Completed"
    }
  }

  implicit val StatusEnumEncoder: EncodeJson[Status] =
    EncodeJson[Status](is => StringEncodeJson(Status.fromStatus(is)))

  implicit val StatusEnumDecoder: DecodeJson[Status] =
    DecodeJson.optionDecoder[Status](n => n.string.flatMap(jStr => Status.toStatus(jStr)), "Status failed to de-serialize")
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

  implicit val MessageObjectCodecJson: CodecJson[MessageObject] = CodecJson.derive[MessageObject]
  implicit val MessageObjectDecoder: EntityDecoder[MessageObject] = jsonOf[MessageObject]
  implicit val MessageObjectEncoder: EntityEncoder[MessageObject] = jsonEncoderOf[MessageObject]
}
