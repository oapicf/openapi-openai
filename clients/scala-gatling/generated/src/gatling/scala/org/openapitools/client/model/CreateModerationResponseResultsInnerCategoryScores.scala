
package org.openapitools.client.model


case class CreateModerationResponseResultsInnerCategoryScores (
    _hate: Number,
    _hateThreatening: Number,
    _selfHarm: Number,
    _sexual: Number,
    _sexualMinors: Number,
    _violence: Number,
    _violenceGraphic: Number
)
object CreateModerationResponseResultsInnerCategoryScores {
    def toStringBody(var_hate: Object, var_hateThreatening: Object, var_selfHarm: Object, var_sexual: Object, var_sexualMinors: Object, var_violence: Object, var_violenceGraphic: Object) =
        s"""
        | {
        | "hate":$var_hate,"hateThreatening":$var_hateThreatening,"selfHarm":$var_selfHarm,"sexual":$var_sexual,"sexualMinors":$var_sexualMinors,"violence":$var_violence,"violenceGraphic":$var_violenceGraphic
        | }
        """.stripMargin
}
