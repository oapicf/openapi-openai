package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateModerationResponseResultsInner._

case class CreateModerationResponseResultsInner (
  /* Whether any of the below categories are flagged. */
  flagged: Boolean,
categories: CreateModerationResponseResultsInnerCategories,
categoryScores: CreateModerationResponseResultsInnerCategoryScores,
categoryAppliedInputTypes: CreateModerationResponseResultsInnerCategoryAppliedInputTypes)

object CreateModerationResponseResultsInner {
  import DateTimeCodecs._

  implicit val CreateModerationResponseResultsInnerCodecJson: CodecJson[CreateModerationResponseResultsInner] = CodecJson.derive[CreateModerationResponseResultsInner]
  implicit val CreateModerationResponseResultsInnerDecoder: EntityDecoder[CreateModerationResponseResultsInner] = jsonOf[CreateModerationResponseResultsInner]
  implicit val CreateModerationResponseResultsInnerEncoder: EntityEncoder[CreateModerationResponseResultsInner] = jsonEncoderOf[CreateModerationResponseResultsInner]
}
