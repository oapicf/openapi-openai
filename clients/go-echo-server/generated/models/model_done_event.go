package models

// DoneEvent - Occurs when a stream ends.
type DoneEvent struct {

	Event string `json:"event"`

	Data string `json:"data"`
}
