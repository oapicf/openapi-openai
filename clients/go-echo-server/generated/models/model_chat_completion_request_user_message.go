package models

type ChatCompletionRequestUserMessage struct {

	Content ChatCompletionRequestUserMessageContent `json:"content"`

	// The role of the messages author, in this case `user`.
	Role string `json:"role"`

	// An optional name for the participant. Provides the model information to differentiate between participants of the same role.
	Name string `json:"name,omitempty"`
}
