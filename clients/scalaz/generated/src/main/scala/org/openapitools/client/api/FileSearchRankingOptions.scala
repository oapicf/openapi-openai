package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import FileSearchRankingOptions._

case class FileSearchRankingOptions (
  /* The ranker to use for the file search. If not specified will use the `auto` ranker. */
  ranker: Option[Ranker],
/* The score threshold for the file search. All values must be a floating point number between 0 and 1. */
  scoreThreshold: BigDecimal)

object FileSearchRankingOptions {
  import DateTimeCodecs._
  sealed trait Ranker
  case object Auto extends Ranker
  case object Default20240821 extends Ranker

  object Ranker {
    def toRanker(s: String): Option[Ranker] = s match {
      case "Auto" => Some(Auto)
      case "Default20240821" => Some(Default20240821)
      case _ => None
    }

    def fromRanker(x: Ranker): String = x match {
      case Auto => "Auto"
      case Default20240821 => "Default20240821"
    }
  }

  implicit val RankerEnumEncoder: EncodeJson[Ranker] =
    EncodeJson[Ranker](is => StringEncodeJson(Ranker.fromRanker(is)))

  implicit val RankerEnumDecoder: DecodeJson[Ranker] =
    DecodeJson.optionDecoder[Ranker](n => n.string.flatMap(jStr => Ranker.toRanker(jStr)), "Ranker failed to de-serialize")

  implicit val FileSearchRankingOptionsCodecJson: CodecJson[FileSearchRankingOptions] = CodecJson.derive[FileSearchRankingOptions]
  implicit val FileSearchRankingOptionsDecoder: EntityDecoder[FileSearchRankingOptions] = jsonOf[FileSearchRankingOptions]
  implicit val FileSearchRankingOptionsEncoder: EntityEncoder[FileSearchRankingOptions] = jsonEncoderOf[FileSearchRankingOptions]
}
