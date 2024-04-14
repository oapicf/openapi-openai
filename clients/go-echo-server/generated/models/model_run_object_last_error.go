package models

// RunObjectLastError - The last error associated with this run. Will be `null` if there are no errors.
type RunObjectLastError struct {

	// One of `server_error`, `rate_limit_exceeded`, or `invalid_prompt`.
	Code string `json:"code"`

	// A human-readable description of the error.
	Message string `json:"message"`
}
