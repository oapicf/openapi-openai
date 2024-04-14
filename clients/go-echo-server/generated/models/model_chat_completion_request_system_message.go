package models

type ChatCompletionRequestSystemMessage struct {

	// The contents of the system message.
	Content string `json:"content"`

	// The role of the messages author, in this case `system`.
	Role string `json:"role"`

	// An optional name for the participant. Provides the model information to differentiate between participants of the same role.
	Name string `json:"name,omitempty"`
}
