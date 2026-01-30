package models

// RunStepDetailsToolCallsFileSearchRankingOptionsObject - The ranking options for the file search.
type RunStepDetailsToolCallsFileSearchRankingOptionsObject struct {

	// The ranker used for the file search.
	Ranker string `json:"ranker"`

	// The score threshold for the file search. All values must be a floating point number between 0 and 1.
	ScoreThreshold float32 `json:"score_threshold"`
}
