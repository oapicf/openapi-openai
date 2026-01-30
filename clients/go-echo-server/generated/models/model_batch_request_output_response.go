package models

type BatchRequestOutputResponse struct {

	// The HTTP status code of the response
	StatusCode int32 `json:"status_code,omitempty"`

	// An unique identifier for the OpenAI API request. Please include this request ID when contacting support.
	RequestId string `json:"request_id,omitempty"`

	// The JSON body of the response
	Body map[string]interface{} `json:"body,omitempty"`
}
