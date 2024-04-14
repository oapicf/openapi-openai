
package org.openapitools.client.model


case class CreateModerationResponseResultsInnerCategories (
    /* Content that expresses, incites, or promotes hate based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste. Hateful content aimed at non-protected groups (e.g., chess players) is harassment. */
    _hate: Boolean,
    /* Hateful content that also includes violence or serious harm towards the targeted group based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste. */
    _hateThreatening: Boolean,
    /* Content that expresses, incites, or promotes harassing language towards any target. */
    _harassment: Boolean,
    /* Harassment content that also includes violence or serious harm towards any target. */
    _harassmentThreatening: Boolean,
    /* Content that promotes, encourages, or depicts acts of self-harm, such as suicide, cutting, and eating disorders. */
    _selfHarm: Boolean,
    /* Content where the speaker expresses that they are engaging or intend to engage in acts of self-harm, such as suicide, cutting, and eating disorders. */
    _selfHarmIntent: Boolean,
    /* Content that encourages performing acts of self-harm, such as suicide, cutting, and eating disorders, or that gives instructions or advice on how to commit such acts. */
    _selfHarmInstructions: Boolean,
    /* Content meant to arouse sexual excitement, such as the description of sexual activity, or that promotes sexual services (excluding sex education and wellness). */
    _sexual: Boolean,
    /* Sexual content that includes an individual who is under 18 years old. */
    _sexualMinors: Boolean,
    /* Content that depicts death, violence, or physical injury. */
    _violence: Boolean,
    /* Content that depicts death, violence, or physical injury in graphic detail. */
    _violenceGraphic: Boolean
)
object CreateModerationResponseResultsInnerCategories {
    def toStringBody(var_hate: Object, var_hateThreatening: Object, var_harassment: Object, var_harassmentThreatening: Object, var_selfHarm: Object, var_selfHarmIntent: Object, var_selfHarmInstructions: Object, var_sexual: Object, var_sexualMinors: Object, var_violence: Object, var_violenceGraphic: Object) =
        s"""
        | {
        | "hate":$var_hate,"hateThreatening":$var_hateThreatening,"harassment":$var_harassment,"harassmentThreatening":$var_harassmentThreatening,"selfHarm":$var_selfHarm,"selfHarmIntent":$var_selfHarmIntent,"selfHarmInstructions":$var_selfHarmInstructions,"sexual":$var_sexual,"sexualMinors":$var_sexualMinors,"violence":$var_violence,"violenceGraphic":$var_violenceGraphic
        | }
        """.stripMargin
}
