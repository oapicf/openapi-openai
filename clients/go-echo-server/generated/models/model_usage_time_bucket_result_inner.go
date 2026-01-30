package models

type UsageTimeBucketResultInner struct {

	Object string `json:"object"`

	// The aggregated number of input tokens used.
	InputTokens int32 `json:"input_tokens"`

	// The aggregated number of text input tokens that has been cached from previous requests. For customers subscribe to scale tier, this includes scale tier tokens.
	InputCachedTokens int32 `json:"input_cached_tokens,omitempty"`

	// The aggregated number of text output tokens used. For customers subscribe to scale tier, this includes scale tier tokens.
	OutputTokens int32 `json:"output_tokens"`

	// The aggregated number of audio input tokens used, including cached tokens.
	InputAudioTokens int32 `json:"input_audio_tokens,omitempty"`

	// The aggregated number of audio output tokens used.
	OutputAudioTokens int32 `json:"output_audio_tokens,omitempty"`

	// The count of requests made to the model.
	NumModelRequests int32 `json:"num_model_requests"`

	// When `group_by=project_id`, this field provides the project ID of the grouped costs result.
	ProjectId *string `json:"project_id,omitempty"`

	// When `group_by=user_id`, this field provides the user ID of the grouped usage result.
	UserId *string `json:"user_id,omitempty"`

	// When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.
	ApiKeyId *string `json:"api_key_id,omitempty"`

	// When `group_by=model`, this field provides the model name of the grouped usage result.
	Model *string `json:"model,omitempty"`

	// When `group_by=batch`, this field tells whether the grouped usage result is batch or not.
	Batch *bool `json:"batch,omitempty"`

	// The number of images processed.
	Images int32 `json:"images"`

	// When `group_by=source`, this field provides the source of the grouped usage result, possible values are `image.generation`, `image.edit`, `image.variation`.
	Source *string `json:"source,omitempty"`

	// When `group_by=size`, this field provides the image size of the grouped usage result.
	Size *string `json:"size,omitempty"`

	// The number of characters processed.
	Characters int32 `json:"characters"`

	// The number of seconds processed.
	Seconds int32 `json:"seconds"`

	// The vector stores usage in bytes.
	UsageBytes int32 `json:"usage_bytes"`

	// The number of code interpreter sessions.
	Sessions int32 `json:"sessions"`

	Amount CostsResultAmount `json:"amount,omitempty"`

	// When `group_by=line_item`, this field provides the line item of the grouped costs result.
	LineItem *string `json:"line_item,omitempty"`
}
