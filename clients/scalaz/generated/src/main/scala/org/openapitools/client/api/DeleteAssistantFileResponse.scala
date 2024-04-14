package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import DeleteAssistantFileResponse._

case class DeleteAssistantFileResponse (
  id: String,
deleted: Boolean,
`object`: `Object`)

object DeleteAssistantFileResponse {
  import DateTimeCodecs._
  sealed trait `Object`
  case object AssistantFileDeleted extends `Object`

  object `Object` {
    def to`Object`(s: String): Option[`Object`] = s match {
      case "AssistantFileDeleted" => Some(AssistantFileDeleted)
      case _ => None
    }

    def from`Object`(x: `Object`): String = x match {
      case AssistantFileDeleted => "AssistantFileDeleted"
    }
  }

  implicit val `Object`EnumEncoder: EncodeJson[`Object`] =
    EncodeJson[`Object`](is => StringEncodeJson(`Object`.from`Object`(is)))

  implicit val `Object`EnumDecoder: DecodeJson[`Object`] =
    DecodeJson.optionDecoder[`Object`](n => n.string.flatMap(jStr => `Object`.to`Object`(jStr)), "`Object` failed to de-serialize")

  implicit val DeleteAssistantFileResponseCodecJson: CodecJson[DeleteAssistantFileResponse] = CodecJson.derive[DeleteAssistantFileResponse]
  implicit val DeleteAssistantFileResponseDecoder: EntityDecoder[DeleteAssistantFileResponse] = jsonOf[DeleteAssistantFileResponse]
  implicit val DeleteAssistantFileResponseEncoder: EntityEncoder[DeleteAssistantFileResponse] = jsonEncoderOf[DeleteAssistantFileResponse]
}
