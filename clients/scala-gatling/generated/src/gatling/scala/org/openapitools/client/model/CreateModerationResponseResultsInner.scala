
package org.openapitools.client.model


case class CreateModerationResponseResultsInner (
    /* Whether any of the below categories are flagged. */
    _flagged: Boolean,
    _categories: CreateModerationResponseResultsInnerCategories,
    _categoryScores: CreateModerationResponseResultsInnerCategoryScores,
    _categoryAppliedInputTypes: CreateModerationResponseResultsInnerCategoryAppliedInputTypes
)
object CreateModerationResponseResultsInner {
    def toStringBody(var_flagged: Object, var_categories: Object, var_categoryScores: Object, var_categoryAppliedInputTypes: Object) =
        s"""
        | {
        | "flagged":$var_flagged,"categories":$var_categories,"categoryScores":$var_categoryScores,"categoryAppliedInputTypes":$var_categoryAppliedInputTypes
        | }
        """.stripMargin
}
