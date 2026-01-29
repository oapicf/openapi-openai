package models

// ErrorEvent - Occurs when an [error](/docs/guides/error-codes/api-errors) occurs. This can happen due to an internal server error or a timeout.
type ErrorEvent struct {

	Event string `json:"event"`

	Data Error `json:"data"`
}
