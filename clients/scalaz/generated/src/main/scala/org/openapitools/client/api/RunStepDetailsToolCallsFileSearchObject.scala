package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RunStepDetailsToolCallsFileSearchObject._

case class RunStepDetailsToolCallsFileSearchObject (
  /* The ID of the tool call object. */
  id: String,
/* The type of tool call. This is always going to be `file_search` for this type of tool call. */
  `type`: `Type`,
fileSearch: RunStepDetailsToolCallsFileSearchObjectFileSearch)

object RunStepDetailsToolCallsFileSearchObject {
  import DateTimeCodecs._
  sealed trait `Type`
  case object FileSearch extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "FileSearch" => Some(FileSearch)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case FileSearch => "FileSearch"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val RunStepDetailsToolCallsFileSearchObjectCodecJson: CodecJson[RunStepDetailsToolCallsFileSearchObject] = CodecJson.derive[RunStepDetailsToolCallsFileSearchObject]
  implicit val RunStepDetailsToolCallsFileSearchObjectDecoder: EntityDecoder[RunStepDetailsToolCallsFileSearchObject] = jsonOf[RunStepDetailsToolCallsFileSearchObject]
  implicit val RunStepDetailsToolCallsFileSearchObjectEncoder: EntityEncoder[RunStepDetailsToolCallsFileSearchObject] = jsonEncoderOf[RunStepDetailsToolCallsFileSearchObject]
}
