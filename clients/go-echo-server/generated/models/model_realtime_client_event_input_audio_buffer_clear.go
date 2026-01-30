package models

// RealtimeClientEventInputAudioBufferClear - Send this event to clear the audio bytes in the buffer. The server will  respond with an `input_audio_buffer.cleared` event. 
type RealtimeClientEventInputAudioBufferClear struct {

	// Optional client-generated ID used to identify this event.
	EventId string `json:"event_id,omitempty"`

	// The event type, must be `input_audio_buffer.clear`.
	Type string `json:"type"`
}
