package models

type ChatCompletionRequestMessageContentPartAudioInputAudio struct {

	// Base64 encoded audio data.
	Data string `json:"data"`

	// The format of the encoded audio data. Currently supports \"wav\" and \"mp3\". 
	Format string `json:"format"`
}
