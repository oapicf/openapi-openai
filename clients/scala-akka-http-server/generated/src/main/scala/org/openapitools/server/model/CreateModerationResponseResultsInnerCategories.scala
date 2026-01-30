package org.openapitools.server.model


/**
 * A list of the categories, and whether they are flagged or not.
 *
 * @param hate Content that expresses, incites, or promotes hate based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste. Hateful content aimed at non-protected groups (e.g., chess players) is harassment. for example: ''null''
 * @param hateThreatening Hateful content that also includes violence or serious harm towards the targeted group based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste. for example: ''null''
 * @param harassment Content that expresses, incites, or promotes harassing language towards any target. for example: ''null''
 * @param harassmentThreatening Harassment content that also includes violence or serious harm towards any target. for example: ''null''
 * @param illicit Content that includes instructions or advice that facilitate the planning or execution of wrongdoing, or that gives advice or instruction on how to commit illicit acts. For example, \"how to shoplift\" would fit this category. for example: ''null''
 * @param illicitViolent Content that includes instructions or advice that facilitate the planning or execution of wrongdoing that also includes violence, or that gives advice or instruction on the procurement of any weapon. for example: ''null''
 * @param selfHarm Content that promotes, encourages, or depicts acts of self-harm, such as suicide, cutting, and eating disorders. for example: ''null''
 * @param selfHarmIntent Content where the speaker expresses that they are engaging or intend to engage in acts of self-harm, such as suicide, cutting, and eating disorders. for example: ''null''
 * @param selfHarmInstructions Content that encourages performing acts of self-harm, such as suicide, cutting, and eating disorders, or that gives instructions or advice on how to commit such acts. for example: ''null''
 * @param sexual Content meant to arouse sexual excitement, such as the description of sexual activity, or that promotes sexual services (excluding sex education and wellness). for example: ''null''
 * @param sexualMinors Sexual content that includes an individual who is under 18 years old. for example: ''null''
 * @param violence Content that depicts death, violence, or physical injury. for example: ''null''
 * @param violenceGraphic Content that depicts death, violence, or physical injury in graphic detail. for example: ''null''
*/
final case class CreateModerationResponseResultsInnerCategories (
  hate: Boolean,
  hateThreatening: Boolean,
  harassment: Boolean,
  harassmentThreatening: Boolean,
  illicit: Boolean,
  illicitViolent: Boolean,
  selfHarm: Boolean,
  selfHarmIntent: Boolean,
  selfHarmInstructions: Boolean,
  sexual: Boolean,
  sexualMinors: Boolean,
  violence: Boolean,
  violenceGraphic: Boolean
)

