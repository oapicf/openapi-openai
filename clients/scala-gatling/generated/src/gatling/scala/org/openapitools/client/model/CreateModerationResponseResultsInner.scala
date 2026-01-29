
package org.openapitools.client.model


case class CreateModerationResponseResultsInner (
    /* Whether any of the below categories are flagged. */
    _flagged: Boolean,
    _categories: CreateModerationResponseResultsInnerCategories,
    _categoryScores: CreateModerationResponseResultsInnerCategoryScores
)
object CreateModerationResponseResultsInner {
    def toStringBody(var_flagged: Object, var_categories: Object, var_categoryScores: Object) =
        s"""
        | {
        | "flagged":$var_flagged,"categories":$var_categories,"categoryScores":$var_categoryScores
        | }
        """.stripMargin
}
