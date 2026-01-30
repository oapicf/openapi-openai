package models

type ChatCompletionRequestUserMessageContentPart struct {

	// The type of the content part.
	Type string `json:"type"`

	// The text content.
	Text string `json:"text"`

	ImageUrl ChatCompletionRequestMessageContentPartImageImageUrl `json:"image_url"`

	InputAudio ChatCompletionRequestMessageContentPartAudioInputAudio `json:"input_audio"`
}
