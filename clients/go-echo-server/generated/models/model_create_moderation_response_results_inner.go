package models

type CreateModerationResponseResultsInner struct {

	Flagged bool `json:"flagged"`

	Categories CreateModerationResponseResultsInnerCategories `json:"categories"`

	CategoryScores CreateModerationResponseResultsInnerCategoryScores `json:"category_scores"`
}
