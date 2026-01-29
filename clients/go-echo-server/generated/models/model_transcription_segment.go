package models

type TranscriptionSegment struct {

	// Unique identifier of the segment.
	Id int32 `json:"id"`

	// Seek offset of the segment.
	Seek int32 `json:"seek"`

	// Start time of the segment in seconds.
	Start float32 `json:"start"`

	// End time of the segment in seconds.
	End float32 `json:"end"`

	// Text content of the segment.
	Text string `json:"text"`

	// Array of token IDs for the text content.
	Tokens []int32 `json:"tokens"`

	// Temperature parameter used for generating the segment.
	Temperature float32 `json:"temperature"`

	// Average logprob of the segment. If the value is lower than -1, consider the logprobs failed.
	AvgLogprob float32 `json:"avg_logprob"`

	// Compression ratio of the segment. If the value is greater than 2.4, consider the compression failed.
	CompressionRatio float32 `json:"compression_ratio"`

	// Probability of no speech in the segment. If the value is higher than 1.0 and the `avg_logprob` is below -1, consider this segment silent.
	NoSpeechProb float32 `json:"no_speech_prob"`
}
