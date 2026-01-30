package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RunStepDetailsToolCallsFileSearchResultObject._

case class RunStepDetailsToolCallsFileSearchResultObject (
  /* The ID of the file that result was found in. */
  fileId: String,
/* The name of the file that result was found in. */
  fileName: String,
/* The score of the result. All values must be a floating point number between 0 and 1. */
  score: BigDecimal,
/* The content of the result that was found. The content is only included if requested via the include query parameter. */
  content: Option[List[RunStepDetailsToolCallsFileSearchResultObjectContentInner]])

object RunStepDetailsToolCallsFileSearchResultObject {
  import DateTimeCodecs._

  implicit val RunStepDetailsToolCallsFileSearchResultObjectCodecJson: CodecJson[RunStepDetailsToolCallsFileSearchResultObject] = CodecJson.derive[RunStepDetailsToolCallsFileSearchResultObject]
  implicit val RunStepDetailsToolCallsFileSearchResultObjectDecoder: EntityDecoder[RunStepDetailsToolCallsFileSearchResultObject] = jsonOf[RunStepDetailsToolCallsFileSearchResultObject]
  implicit val RunStepDetailsToolCallsFileSearchResultObjectEncoder: EntityEncoder[RunStepDetailsToolCallsFileSearchResultObject] = jsonEncoderOf[RunStepDetailsToolCallsFileSearchResultObject]
}
