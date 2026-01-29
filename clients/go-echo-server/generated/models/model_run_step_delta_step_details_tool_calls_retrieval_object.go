package models

type RunStepDeltaStepDetailsToolCallsRetrievalObject struct {

	// The index of the tool call in the tool calls array.
	Index int32 `json:"index"`

	// The ID of the tool call object.
	Id string `json:"id,omitempty"`

	// The type of tool call. This is always going to be `retrieval` for this type of tool call.
	Type string `json:"type"`

	// For now, this is always going to be an empty object.
	Retrieval map[string]interface{} `json:"retrieval,omitempty"`
}
