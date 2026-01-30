package models

// ChatCompletionRequestMessageContentPartAudio - Learn about [audio inputs](/docs/guides/audio). 
type ChatCompletionRequestMessageContentPartAudio struct {

	// The type of the content part. Always `input_audio`.
	Type string `json:"type"`

	InputAudio ChatCompletionRequestMessageContentPartAudioInputAudio `json:"input_audio"`
}
