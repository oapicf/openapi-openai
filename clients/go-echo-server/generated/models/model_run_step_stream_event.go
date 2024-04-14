package models

type RunStepStreamEvent struct {

	Event string `json:"event"`

	Data RunStepObject `json:"data"`
}
