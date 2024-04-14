package models

// RunStreamEventOneOf - Occurs when a new [run](/docs/api-reference/runs/object) is created.
type RunStreamEventOneOf struct {

	Event string `json:"event"`

	Data RunObject `json:"data"`
}
