
package org.openapitools.client.model


case class CreateModerationResponseResultsInnerCategoryAppliedInputTypes (
    /* The applied input type(s) for the category 'hate'. */
    _hate: List[String],
    /* The applied input type(s) for the category 'hate/threatening'. */
    _hateThreatening: List[String],
    /* The applied input type(s) for the category 'harassment'. */
    _harassment: List[String],
    /* The applied input type(s) for the category 'harassment/threatening'. */
    _harassmentThreatening: List[String],
    /* The applied input type(s) for the category 'illicit'. */
    _illicit: List[String],
    /* The applied input type(s) for the category 'illicit/violent'. */
    _illicitViolent: List[String],
    /* The applied input type(s) for the category 'self-harm'. */
    _selfHarm: List[String],
    /* The applied input type(s) for the category 'self-harm/intent'. */
    _selfHarmIntent: List[String],
    /* The applied input type(s) for the category 'self-harm/instructions'. */
    _selfHarmInstructions: List[String],
    /* The applied input type(s) for the category 'sexual'. */
    _sexual: List[String],
    /* The applied input type(s) for the category 'sexual/minors'. */
    _sexualMinors: List[String],
    /* The applied input type(s) for the category 'violence'. */
    _violence: List[String],
    /* The applied input type(s) for the category 'violence/graphic'. */
    _violenceGraphic: List[String]
)
object CreateModerationResponseResultsInnerCategoryAppliedInputTypes {
    def toStringBody(var_hate: Object, var_hateThreatening: Object, var_harassment: Object, var_harassmentThreatening: Object, var_illicit: Object, var_illicitViolent: Object, var_selfHarm: Object, var_selfHarmIntent: Object, var_selfHarmInstructions: Object, var_sexual: Object, var_sexualMinors: Object, var_violence: Object, var_violenceGraphic: Object) =
        s"""
        | {
        | "hate":$var_hate,"hateThreatening":$var_hateThreatening,"harassment":$var_harassment,"harassmentThreatening":$var_harassmentThreatening,"illicit":$var_illicit,"illicitViolent":$var_illicitViolent,"selfHarm":$var_selfHarm,"selfHarmIntent":$var_selfHarmIntent,"selfHarmInstructions":$var_selfHarmInstructions,"sexual":$var_sexual,"sexualMinors":$var_sexualMinors,"violence":$var_violence,"violenceGraphic":$var_violenceGraphic
        | }
        """.stripMargin
}
