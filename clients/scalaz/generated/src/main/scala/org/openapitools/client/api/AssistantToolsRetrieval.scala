package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AssistantToolsRetrieval._

case class AssistantToolsRetrieval (
  /* The type of tool being defined: `retrieval` */
  `type`: `Type`)

object AssistantToolsRetrieval {
  import DateTimeCodecs._
  sealed trait `Type`
  case object Retrieval extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "Retrieval" => Some(Retrieval)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case Retrieval => "Retrieval"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val AssistantToolsRetrievalCodecJson: CodecJson[AssistantToolsRetrieval] = CodecJson.derive[AssistantToolsRetrieval]
  implicit val AssistantToolsRetrievalDecoder: EntityDecoder[AssistantToolsRetrieval] = jsonOf[AssistantToolsRetrieval]
  implicit val AssistantToolsRetrievalEncoder: EntityEncoder[AssistantToolsRetrieval] = jsonEncoderOf[AssistantToolsRetrieval]
}
