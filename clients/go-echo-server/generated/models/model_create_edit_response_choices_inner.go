package models

type CreateEditResponseChoicesInner struct {

	Text string `json:"text,omitempty"`

	Index int32 `json:"index,omitempty"`

	Logprobs *CreateCompletionResponseChoicesInnerLogprobs `json:"logprobs,omitempty"`

	FinishReason string `json:"finish_reason,omitempty"`
}
