package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateModerationResponseResultsInnerCategoryScores._

case class CreateModerationResponseResultsInnerCategoryScores (
  /* The score for the category 'hate'. */
  hate: BigDecimal,
/* The score for the category 'hate/threatening'. */
  hateThreatening: BigDecimal,
/* The score for the category 'harassment'. */
  harassment: BigDecimal,
/* The score for the category 'harassment/threatening'. */
  harassmentThreatening: BigDecimal,
/* The score for the category 'illicit'. */
  illicit: BigDecimal,
/* The score for the category 'illicit/violent'. */
  illicitViolent: BigDecimal,
/* The score for the category 'self-harm'. */
  selfHarm: BigDecimal,
/* The score for the category 'self-harm/intent'. */
  selfHarmIntent: BigDecimal,
/* The score for the category 'self-harm/instructions'. */
  selfHarmInstructions: BigDecimal,
/* The score for the category 'sexual'. */
  sexual: BigDecimal,
/* The score for the category 'sexual/minors'. */
  sexualMinors: BigDecimal,
/* The score for the category 'violence'. */
  violence: BigDecimal,
/* The score for the category 'violence/graphic'. */
  violenceGraphic: BigDecimal)

object CreateModerationResponseResultsInnerCategoryScores {
  import DateTimeCodecs._

  implicit val CreateModerationResponseResultsInnerCategoryScoresCodecJson: CodecJson[CreateModerationResponseResultsInnerCategoryScores] = CodecJson.derive[CreateModerationResponseResultsInnerCategoryScores]
  implicit val CreateModerationResponseResultsInnerCategoryScoresDecoder: EntityDecoder[CreateModerationResponseResultsInnerCategoryScores] = jsonOf[CreateModerationResponseResultsInnerCategoryScores]
  implicit val CreateModerationResponseResultsInnerCategoryScoresEncoder: EntityEncoder[CreateModerationResponseResultsInnerCategoryScores] = jsonEncoderOf[CreateModerationResponseResultsInnerCategoryScores]
}
