package models

// RunStepDetailsToolCallsFileSearchObjectFileSearch - For now, this is always going to be an empty object.
type RunStepDetailsToolCallsFileSearchObjectFileSearch struct {

	RankingOptions RunStepDetailsToolCallsFileSearchRankingOptionsObject `json:"ranking_options,omitempty"`

	// The results of the file search.
	Results []RunStepDetailsToolCallsFileSearchResultObject `json:"results,omitempty"`
}
