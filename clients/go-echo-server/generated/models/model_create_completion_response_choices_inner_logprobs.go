package models

type CreateCompletionResponseChoicesInnerLogprobs struct {

	Tokens []string `json:"tokens,omitempty"`

	TokenLogprobs []float32 `json:"token_logprobs,omitempty"`

	TopLogprobs []map[string]interface{} `json:"top_logprobs,omitempty"`

	TextOffset []int32 `json:"text_offset,omitempty"`
}
