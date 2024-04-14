package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateModerationResponseResultsInnerCategories._

case class CreateModerationResponseResultsInnerCategories (
  /* Content that expresses, incites, or promotes hate based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste. Hateful content aimed at non-protected groups (e.g., chess players) is harassment. */
  hate: Boolean,
/* Hateful content that also includes violence or serious harm towards the targeted group based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste. */
  hateThreatening: Boolean,
/* Content that expresses, incites, or promotes harassing language towards any target. */
  harassment: Boolean,
/* Harassment content that also includes violence or serious harm towards any target. */
  harassmentThreatening: Boolean,
/* Content that promotes, encourages, or depicts acts of self-harm, such as suicide, cutting, and eating disorders. */
  selfHarm: Boolean,
/* Content where the speaker expresses that they are engaging or intend to engage in acts of self-harm, such as suicide, cutting, and eating disorders. */
  selfHarmIntent: Boolean,
/* Content that encourages performing acts of self-harm, such as suicide, cutting, and eating disorders, or that gives instructions or advice on how to commit such acts. */
  selfHarmInstructions: Boolean,
/* Content meant to arouse sexual excitement, such as the description of sexual activity, or that promotes sexual services (excluding sex education and wellness). */
  sexual: Boolean,
/* Sexual content that includes an individual who is under 18 years old. */
  sexualMinors: Boolean,
/* Content that depicts death, violence, or physical injury. */
  violence: Boolean,
/* Content that depicts death, violence, or physical injury in graphic detail. */
  violenceGraphic: Boolean)

object CreateModerationResponseResultsInnerCategories {
  import DateTimeCodecs._

  implicit val CreateModerationResponseResultsInnerCategoriesCodecJson: CodecJson[CreateModerationResponseResultsInnerCategories] = CodecJson.derive[CreateModerationResponseResultsInnerCategories]
  implicit val CreateModerationResponseResultsInnerCategoriesDecoder: EntityDecoder[CreateModerationResponseResultsInnerCategories] = jsonOf[CreateModerationResponseResultsInnerCategories]
  implicit val CreateModerationResponseResultsInnerCategoriesEncoder: EntityEncoder[CreateModerationResponseResultsInnerCategories] = jsonEncoderOf[CreateModerationResponseResultsInnerCategories]
}
