package models

// RealtimeServerEventResponseAudioTranscriptDelta - Returned when the model-generated transcription of audio output is updated. 
type RealtimeServerEventResponseAudioTranscriptDelta struct {

	// The unique ID of the server event.
	EventId string `json:"event_id"`

	// The event type, must be `response.audio_transcript.delta`.
	Type string `json:"type"`

	// The ID of the response.
	ResponseId string `json:"response_id"`

	// The ID of the item.
	ItemId string `json:"item_id"`

	// The index of the output item in the response.
	OutputIndex int32 `json:"output_index"`

	// The index of the content part in the item's content array.
	ContentIndex int32 `json:"content_index"`

	// The transcript delta.
	Delta string `json:"delta"`
}
