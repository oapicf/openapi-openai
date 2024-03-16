package models

type CreateChatCompletionResponse struct {

	Id string `json:"id"`

	Object string `json:"object"`

	Created int32 `json:"created"`

	Model string `json:"model"`

	Choices []CreateChatCompletionResponseChoicesInner `json:"choices"`

	Usage CreateCompletionResponseUsage `json:"usage,omitempty"`
}
