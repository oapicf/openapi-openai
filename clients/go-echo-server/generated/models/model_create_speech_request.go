package models

type CreateSpeechRequest struct {

	Model CreateSpeechRequestModel `json:"model"`

	// The text to generate audio for. The maximum length is 4096 characters.
	Input string `json:"input"`

	// The voice to use when generating the audio. Supported voices are `alloy`, `echo`, `fable`, `onyx`, `nova`, and `shimmer`. Previews of the voices are available in the [Text to speech guide](/docs/guides/text-to-speech/voice-options).
	Voice string `json:"voice"`

	// The format to audio in. Supported formats are `mp3`, `opus`, `aac`, `flac`, `wav`, and `pcm`.
	ResponseFormat string `json:"response_format,omitempty"`

	// The speed of the generated audio. Select a value from `0.25` to `4.0`. `1.0` is the default.
	Speed float32 `json:"speed,omitempty"`
}