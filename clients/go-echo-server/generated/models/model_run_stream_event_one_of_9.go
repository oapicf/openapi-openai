package models

// RunStreamEventOneOf9 - Occurs when a [run](/docs/api-reference/runs/object) expires.
type RunStreamEventOneOf9 struct {

	Event string `json:"event"`

	Data RunObject `json:"data"`
}
