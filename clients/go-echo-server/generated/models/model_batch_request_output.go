package models

// BatchRequestOutput - The per-line object of the batch output and error files
type BatchRequestOutput struct {

	Id string `json:"id,omitempty"`

	// A developer-provided per-request id that will be used to match outputs to inputs.
	CustomId string `json:"custom_id,omitempty"`

	Response *BatchRequestOutputResponse `json:"response,omitempty"`

	Error *BatchRequestOutputError `json:"error,omitempty"`
}
