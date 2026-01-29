package models

type SubmitToolOutputsRunRequest struct {

	// A list of tools for which the outputs are being submitted.
	ToolOutputs []SubmitToolOutputsRunRequestToolOutputsInner `json:"tool_outputs"`

	// If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message. 
	Stream *bool `json:"stream,omitempty"`
}
