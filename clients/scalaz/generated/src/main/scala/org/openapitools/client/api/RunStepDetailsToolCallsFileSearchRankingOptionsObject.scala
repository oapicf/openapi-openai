package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RunStepDetailsToolCallsFileSearchRankingOptionsObject._

case class RunStepDetailsToolCallsFileSearchRankingOptionsObject (
  /* The ranker used for the file search. */
  ranker: Ranker,
/* The score threshold for the file search. All values must be a floating point number between 0 and 1. */
  scoreThreshold: BigDecimal)

object RunStepDetailsToolCallsFileSearchRankingOptionsObject {
  import DateTimeCodecs._
  sealed trait Ranker
  case object Default20240821 extends Ranker

  object Ranker {
    def toRanker(s: String): Option[Ranker] = s match {
      case "Default20240821" => Some(Default20240821)
      case _ => None
    }

    def fromRanker(x: Ranker): String = x match {
      case Default20240821 => "Default20240821"
    }
  }

  implicit val RankerEnumEncoder: EncodeJson[Ranker] =
    EncodeJson[Ranker](is => StringEncodeJson(Ranker.fromRanker(is)))

  implicit val RankerEnumDecoder: DecodeJson[Ranker] =
    DecodeJson.optionDecoder[Ranker](n => n.string.flatMap(jStr => Ranker.toRanker(jStr)), "Ranker failed to de-serialize")

  implicit val RunStepDetailsToolCallsFileSearchRankingOptionsObjectCodecJson: CodecJson[RunStepDetailsToolCallsFileSearchRankingOptionsObject] = CodecJson.derive[RunStepDetailsToolCallsFileSearchRankingOptionsObject]
  implicit val RunStepDetailsToolCallsFileSearchRankingOptionsObjectDecoder: EntityDecoder[RunStepDetailsToolCallsFileSearchRankingOptionsObject] = jsonOf[RunStepDetailsToolCallsFileSearchRankingOptionsObject]
  implicit val RunStepDetailsToolCallsFileSearchRankingOptionsObjectEncoder: EntityEncoder[RunStepDetailsToolCallsFileSearchRankingOptionsObject] = jsonEncoderOf[RunStepDetailsToolCallsFileSearchRankingOptionsObject]
}
