package models

type CreateModerationResponseResultsInner struct {

	// Whether any of the below categories are flagged.
	Flagged bool `json:"flagged"`

	Categories CreateModerationResponseResultsInnerCategories `json:"categories"`

	CategoryScores CreateModerationResponseResultsInnerCategoryScores `json:"category_scores"`
}
