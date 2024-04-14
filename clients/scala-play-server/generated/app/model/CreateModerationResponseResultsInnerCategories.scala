package model

import play.api.libs.json._

/**
  * A list of the categories, and whether they are flagged or not.
  * @param hate Content that expresses, incites, or promotes hate based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste. Hateful content aimed at non-protected groups (e.g., chess players) is harassment.
  * @param hateThreatening Hateful content that also includes violence or serious harm towards the targeted group based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste.
  * @param harassment Content that expresses, incites, or promotes harassing language towards any target.
  * @param harassmentThreatening Harassment content that also includes violence or serious harm towards any target.
  * @param selfHarm Content that promotes, encourages, or depicts acts of self-harm, such as suicide, cutting, and eating disorders.
  * @param selfHarmIntent Content where the speaker expresses that they are engaging or intend to engage in acts of self-harm, such as suicide, cutting, and eating disorders.
  * @param selfHarmInstructions Content that encourages performing acts of self-harm, such as suicide, cutting, and eating disorders, or that gives instructions or advice on how to commit such acts.
  * @param sexual Content meant to arouse sexual excitement, such as the description of sexual activity, or that promotes sexual services (excluding sex education and wellness).
  * @param sexualMinors Sexual content that includes an individual who is under 18 years old.
  * @param violence Content that depicts death, violence, or physical injury.
  * @param violenceGraphic Content that depicts death, violence, or physical injury in graphic detail.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-04-14T13:53:34.453725706Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CreateModerationResponseResultsInnerCategories(
  hate: Boolean,
  hateThreatening: Boolean,
  harassment: Boolean,
  harassmentThreatening: Boolean,
  selfHarm: Boolean,
  selfHarmIntent: Boolean,
  selfHarmInstructions: Boolean,
  sexual: Boolean,
  sexualMinors: Boolean,
  violence: Boolean,
  violenceGraphic: Boolean
)

object CreateModerationResponseResultsInnerCategories {
  implicit lazy val createModerationResponseResultsInnerCategoriesJsonFormat: Format[CreateModerationResponseResultsInnerCategories] = Json.format[CreateModerationResponseResultsInnerCategories]
}

