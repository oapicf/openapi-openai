
package org.openapitools.client.model


case class CreateModerationResponseResultsInnerCategories (
    _hate: Boolean,
    _hateThreatening: Boolean,
    _selfHarm: Boolean,
    _sexual: Boolean,
    _sexualMinors: Boolean,
    _violence: Boolean,
    _violenceGraphic: Boolean
)
object CreateModerationResponseResultsInnerCategories {
    def toStringBody(var_hate: Object, var_hateThreatening: Object, var_selfHarm: Object, var_sexual: Object, var_sexualMinors: Object, var_violence: Object, var_violenceGraphic: Object) =
        s"""
        | {
        | "hate":$var_hate,"hateThreatening":$var_hateThreatening,"selfHarm":$var_selfHarm,"sexual":$var_sexual,"sexualMinors":$var_sexualMinors,"violence":$var_violence,"violenceGraphic":$var_violenceGraphic
        | }
        """.stripMargin
}
