package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AssistantFileObject._

case class AssistantFileObject (
  /* The identifier, which can be referenced in API endpoints. */
  id: String,
/* The object type, which is always `assistant.file`. */
  `object`: `Object`,
/* The Unix timestamp (in seconds) for when the assistant file was created. */
  createdAt: Integer,
/* The assistant ID that the file is attached to. */
  assistantId: String)

object AssistantFileObject {
  import DateTimeCodecs._
  sealed trait `Object`
  case object AssistantFile extends `Object`

  object `Object` {
    def to`Object`(s: String): Option[`Object`] = s match {
      case "AssistantFile" => Some(AssistantFile)
      case _ => None
    }

    def from`Object`(x: `Object`): String = x match {
      case AssistantFile => "AssistantFile"
    }
  }

  implicit val `Object`EnumEncoder: EncodeJson[`Object`] =
    EncodeJson[`Object`](is => StringEncodeJson(`Object`.from`Object`(is)))

  implicit val `Object`EnumDecoder: DecodeJson[`Object`] =
    DecodeJson.optionDecoder[`Object`](n => n.string.flatMap(jStr => `Object`.to`Object`(jStr)), "`Object` failed to de-serialize")

  implicit val AssistantFileObjectCodecJson: CodecJson[AssistantFileObject] = CodecJson.derive[AssistantFileObject]
  implicit val AssistantFileObjectDecoder: EntityDecoder[AssistantFileObject] = jsonOf[AssistantFileObject]
  implicit val AssistantFileObjectEncoder: EntityEncoder[AssistantFileObject] = jsonEncoderOf[AssistantFileObject]
}
