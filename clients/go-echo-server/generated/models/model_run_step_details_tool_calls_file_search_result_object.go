package models

// RunStepDetailsToolCallsFileSearchResultObject - A result instance of the file search.
type RunStepDetailsToolCallsFileSearchResultObject struct {

	// The ID of the file that result was found in.
	FileId string `json:"file_id"`

	// The name of the file that result was found in.
	FileName string `json:"file_name"`

	// The score of the result. All values must be a floating point number between 0 and 1.
	Score float32 `json:"score"`

	// The content of the result that was found. The content is only included if requested via the include query parameter.
	Content []RunStepDetailsToolCallsFileSearchResultObjectContentInner `json:"content,omitempty"`
}
