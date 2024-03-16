package models

type CreateChatCompletionStreamResponseChoicesInner struct {

	Index int32 `json:"index,omitempty"`

	Delta ChatCompletionStreamResponseDelta `json:"delta,omitempty"`

	FinishReason string `json:"finish_reason,omitempty"`
}
