package models

type CreateCompletionResponseChoicesInner struct {

	Text string `json:"text"`

	Index int32 `json:"index"`

	Logprobs *CreateCompletionResponseChoicesInnerLogprobs `json:"logprobs"`

	FinishReason string `json:"finish_reason"`
}
