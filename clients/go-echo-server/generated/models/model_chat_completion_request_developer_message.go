package models

// ChatCompletionRequestDeveloperMessage - Developer-provided instructions that the model should follow, regardless of messages sent by the user. With o1 models and newer, `developer` messages replace the previous `system` messages. 
type ChatCompletionRequestDeveloperMessage struct {

	Content ChatCompletionRequestDeveloperMessageContent `json:"content"`

	// The role of the messages author, in this case `developer`.
	Role string `json:"role"`

	// An optional name for the participant. Provides the model information to differentiate between participants of the same role.
	Name string `json:"name,omitempty"`
}
