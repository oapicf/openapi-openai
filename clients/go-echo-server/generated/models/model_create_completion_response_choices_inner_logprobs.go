package models

type CreateCompletionResponseChoicesInnerLogprobs struct {

	TextOffset []int32 `json:"text_offset,omitempty"`

	TokenLogprobs []float32 `json:"token_logprobs,omitempty"`

	Tokens []string `json:"tokens,omitempty"`

	TopLogprobs []map[string]float32 `json:"top_logprobs,omitempty"`
}
