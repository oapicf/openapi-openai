package models

// ThreadStreamEvent - Occurs when a new [thread](/docs/api-reference/threads/object) is created.
type ThreadStreamEvent struct {

	Event string `json:"event"`

	Data ThreadObject `json:"data"`
}
