package models

// AuditLogRateLimitUpdatedChangesRequested - The payload used to update the rate limits.
type AuditLogRateLimitUpdatedChangesRequested struct {

	// The maximum requests per minute.
	MaxRequestsPer1Minute int32 `json:"max_requests_per_1_minute,omitempty"`

	// The maximum tokens per minute.
	MaxTokensPer1Minute int32 `json:"max_tokens_per_1_minute,omitempty"`

	// The maximum images per minute. Only relevant for certain models.
	MaxImagesPer1Minute int32 `json:"max_images_per_1_minute,omitempty"`

	// The maximum audio megabytes per minute. Only relevant for certain models.
	MaxAudioMegabytesPer1Minute int32 `json:"max_audio_megabytes_per_1_minute,omitempty"`

	// The maximum requests per day. Only relevant for certain models.
	MaxRequestsPer1Day int32 `json:"max_requests_per_1_day,omitempty"`

	// The maximum batch input tokens per day. Only relevant for certain models.
	Batch1DayMaxInputTokens int32 `json:"batch_1_day_max_input_tokens,omitempty"`
}
