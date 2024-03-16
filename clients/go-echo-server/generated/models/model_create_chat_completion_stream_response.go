package models

type CreateChatCompletionStreamResponse struct {

	Id string `json:"id"`

	Object string `json:"object"`

	Created int32 `json:"created"`

	Model string `json:"model"`

	Choices []CreateChatCompletionStreamResponseChoicesInner `json:"choices"`
}
