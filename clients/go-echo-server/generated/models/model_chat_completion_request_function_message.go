package models

type ChatCompletionRequestFunctionMessage struct {

	// The role of the messages author, in this case `function`.
	Role string `json:"role"`

	// The contents of the function message.
	Content *string `json:"content"`

	// The name of the function to call.
	Name string `json:"name"`
}
