package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateModerationResponseResultsInnerCategories._

case class CreateModerationResponseResultsInnerCategories (
  hate: Boolean,
hateThreatening: Boolean,
selfHarm: Boolean,
sexual: Boolean,
sexualMinors: Boolean,
violence: Boolean,
violenceGraphic: Boolean)

object CreateModerationResponseResultsInnerCategories {
  import DateTimeCodecs._

  implicit val CreateModerationResponseResultsInnerCategoriesCodecJson: CodecJson[CreateModerationResponseResultsInnerCategories] = CodecJson.derive[CreateModerationResponseResultsInnerCategories]
  implicit val CreateModerationResponseResultsInnerCategoriesDecoder: EntityDecoder[CreateModerationResponseResultsInnerCategories] = jsonOf[CreateModerationResponseResultsInnerCategories]
  implicit val CreateModerationResponseResultsInnerCategoriesEncoder: EntityEncoder[CreateModerationResponseResultsInnerCategories] = jsonEncoderOf[CreateModerationResponseResultsInnerCategories]
}
