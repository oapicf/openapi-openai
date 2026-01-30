package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RunStepDetailsToolCallsFileSearchResultObjectContentInner._

case class RunStepDetailsToolCallsFileSearchResultObjectContentInner (
  /* The type of the content. */
  `type`: Option[`Type`],
/* The text content of the file. */
  text: Option[String])

object RunStepDetailsToolCallsFileSearchResultObjectContentInner {
  import DateTimeCodecs._
  sealed trait `Type`
  case object Text extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "Text" => Some(Text)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case Text => "Text"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val RunStepDetailsToolCallsFileSearchResultObjectContentInnerCodecJson: CodecJson[RunStepDetailsToolCallsFileSearchResultObjectContentInner] = CodecJson.derive[RunStepDetailsToolCallsFileSearchResultObjectContentInner]
  implicit val RunStepDetailsToolCallsFileSearchResultObjectContentInnerDecoder: EntityDecoder[RunStepDetailsToolCallsFileSearchResultObjectContentInner] = jsonOf[RunStepDetailsToolCallsFileSearchResultObjectContentInner]
  implicit val RunStepDetailsToolCallsFileSearchResultObjectContentInnerEncoder: EntityEncoder[RunStepDetailsToolCallsFileSearchResultObjectContentInner] = jsonEncoderOf[RunStepDetailsToolCallsFileSearchResultObjectContentInner]
}
