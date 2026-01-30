package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RunStepDetailsToolCallsFileSearchObjectFileSearch._

case class RunStepDetailsToolCallsFileSearchObjectFileSearch (
  rankingOptions: Option[RunStepDetailsToolCallsFileSearchRankingOptionsObject],
/* The results of the file search. */
  results: Option[List[RunStepDetailsToolCallsFileSearchResultObject]])

object RunStepDetailsToolCallsFileSearchObjectFileSearch {
  import DateTimeCodecs._

  implicit val RunStepDetailsToolCallsFileSearchObjectFileSearchCodecJson: CodecJson[RunStepDetailsToolCallsFileSearchObjectFileSearch] = CodecJson.derive[RunStepDetailsToolCallsFileSearchObjectFileSearch]
  implicit val RunStepDetailsToolCallsFileSearchObjectFileSearchDecoder: EntityDecoder[RunStepDetailsToolCallsFileSearchObjectFileSearch] = jsonOf[RunStepDetailsToolCallsFileSearchObjectFileSearch]
  implicit val RunStepDetailsToolCallsFileSearchObjectFileSearchEncoder: EntityEncoder[RunStepDetailsToolCallsFileSearchObjectFileSearch] = jsonEncoderOf[RunStepDetailsToolCallsFileSearchObjectFileSearch]
}
