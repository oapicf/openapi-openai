
package org.openapitools.client.model


case class CreateModerationResponseResultsInnerCategoryScores (
    /* The score for the category 'hate'. */
    _hate: Number,
    /* The score for the category 'hate/threatening'. */
    _hateThreatening: Number,
    /* The score for the category 'harassment'. */
    _harassment: Number,
    /* The score for the category 'harassment/threatening'. */
    _harassmentThreatening: Number,
    /* The score for the category 'self-harm'. */
    _selfHarm: Number,
    /* The score for the category 'self-harm/intent'. */
    _selfHarmIntent: Number,
    /* The score for the category 'self-harm/instructions'. */
    _selfHarmInstructions: Number,
    /* The score for the category 'sexual'. */
    _sexual: Number,
    /* The score for the category 'sexual/minors'. */
    _sexualMinors: Number,
    /* The score for the category 'violence'. */
    _violence: Number,
    /* The score for the category 'violence/graphic'. */
    _violenceGraphic: Number
)
object CreateModerationResponseResultsInnerCategoryScores {
    def toStringBody(var_hate: Object, var_hateThreatening: Object, var_harassment: Object, var_harassmentThreatening: Object, var_selfHarm: Object, var_selfHarmIntent: Object, var_selfHarmInstructions: Object, var_sexual: Object, var_sexualMinors: Object, var_violence: Object, var_violenceGraphic: Object) =
        s"""
        | {
        | "hate":$var_hate,"hateThreatening":$var_hateThreatening,"harassment":$var_harassment,"harassmentThreatening":$var_harassmentThreatening,"selfHarm":$var_selfHarm,"selfHarmIntent":$var_selfHarmIntent,"selfHarmInstructions":$var_selfHarmInstructions,"sexual":$var_sexual,"sexualMinors":$var_sexualMinors,"violence":$var_violence,"violenceGraphic":$var_violenceGraphic
        | }
        """.stripMargin
}
