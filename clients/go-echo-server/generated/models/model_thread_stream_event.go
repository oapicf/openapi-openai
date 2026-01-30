package models

// ThreadStreamEvent - Occurs when a new [thread](/docs/api-reference/threads/object) is created.
type ThreadStreamEvent struct {

	// Whether to enable input audio transcription.
	Enabled bool `json:"enabled,omitempty"`

	Event string `json:"event"`

	Data ThreadObject `json:"data"`
}
