package models

type RunStreamEvent struct {

	Event string `json:"event"`

	Data RunObject `json:"data"`
}
