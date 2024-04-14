package models

// CreateChatCompletionResponseChoicesInnerLogprobs - Log probability information for the choice.
type CreateChatCompletionResponseChoicesInnerLogprobs struct {

	// A list of message content tokens with log probability information.
	Content *[]ChatCompletionTokenLogprob `json:"content"`
}
