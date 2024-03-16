package models

type CreateChatCompletionResponseChoicesInner struct {

	Index int32 `json:"index,omitempty"`

	Message ChatCompletionResponseMessage `json:"message,omitempty"`

	FinishReason string `json:"finish_reason,omitempty"`
}
