package models

// CreateChatCompletionResponseChoicesInnerLogprobs - Log probability information for the choice.
type CreateChatCompletionResponseChoicesInnerLogprobs struct {

	// A list of message content tokens with log probability information.
	Content *[]ChatCompletionTokenLogprob `json:"content"`

	// A list of message refusal tokens with log probability information.
	Refusal *[]ChatCompletionTokenLogprob `json:"refusal"`
}
