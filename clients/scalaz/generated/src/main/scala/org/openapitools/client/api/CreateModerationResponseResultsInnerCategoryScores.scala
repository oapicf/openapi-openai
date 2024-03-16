package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateModerationResponseResultsInnerCategoryScores._

case class CreateModerationResponseResultsInnerCategoryScores (
  hate: BigDecimal,
hateThreatening: BigDecimal,
selfHarm: BigDecimal,
sexual: BigDecimal,
sexualMinors: BigDecimal,
violence: BigDecimal,
violenceGraphic: BigDecimal)

object CreateModerationResponseResultsInnerCategoryScores {
  import DateTimeCodecs._

  implicit val CreateModerationResponseResultsInnerCategoryScoresCodecJson: CodecJson[CreateModerationResponseResultsInnerCategoryScores] = CodecJson.derive[CreateModerationResponseResultsInnerCategoryScores]
  implicit val CreateModerationResponseResultsInnerCategoryScoresDecoder: EntityDecoder[CreateModerationResponseResultsInnerCategoryScores] = jsonOf[CreateModerationResponseResultsInnerCategoryScores]
  implicit val CreateModerationResponseResultsInnerCategoryScoresEncoder: EntityEncoder[CreateModerationResponseResultsInnerCategoryScores] = jsonEncoderOf[CreateModerationResponseResultsInnerCategoryScores]
}
