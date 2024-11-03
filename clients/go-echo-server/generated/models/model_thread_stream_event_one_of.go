package models

// ThreadStreamEventOneOf - Occurs when a new [thread](/docs/api-reference/threads/object) is created.
type ThreadStreamEventOneOf struct {

	Event string `json:"event"`

	Data ThreadObject `json:"data"`
}
