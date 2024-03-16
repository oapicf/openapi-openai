package models

type CreateEditResponse struct {

	Object string `json:"object"`

	Created int32 `json:"created"`

	Choices []CreateEditResponseChoicesInner `json:"choices"`

	Usage CreateCompletionResponseUsage `json:"usage"`
}
