package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import DeleteAssistantResponse._

case class DeleteAssistantResponse (
  id: String,
deleted: Boolean,
`object`: `Object`)

object DeleteAssistantResponse {
  import DateTimeCodecs._
  sealed trait `Object`
  case object AssistantDeleted extends `Object`

  object `Object` {
    def to`Object`(s: String): Option[`Object`] = s match {
      case "AssistantDeleted" => Some(AssistantDeleted)
      case _ => None
    }

    def from`Object`(x: `Object`): String = x match {
      case AssistantDeleted => "AssistantDeleted"
    }
  }

  implicit val `Object`EnumEncoder: EncodeJson[`Object`] =
    EncodeJson[`Object`](is => StringEncodeJson(`Object`.from`Object`(is)))

  implicit val `Object`EnumDecoder: DecodeJson[`Object`] =
    DecodeJson.optionDecoder[`Object`](n => n.string.flatMap(jStr => `Object`.to`Object`(jStr)), "`Object` failed to de-serialize")

  implicit val DeleteAssistantResponseCodecJson: CodecJson[DeleteAssistantResponse] = CodecJson.derive[DeleteAssistantResponse]
  implicit val DeleteAssistantResponseDecoder: EntityDecoder[DeleteAssistantResponse] = jsonOf[DeleteAssistantResponse]
  implicit val DeleteAssistantResponseEncoder: EntityEncoder[DeleteAssistantResponse] = jsonEncoderOf[DeleteAssistantResponse]
}
