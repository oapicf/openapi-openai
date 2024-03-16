package models

type ChatCompletionRequestMessage struct {

	// The role of the messages author. One of `system`, `user`, `assistant`, or `function`.
	Role string `json:"role"`

	// The contents of the message. `content` is required for all messages except assistant messages with function calls.
	Content string `json:"content,omitempty"`

	// The name of the author of this message. `name` is required if role is `function`, and it should be the name of the function whose response is in the `content`. May contain a-z, A-Z, 0-9, and underscores, with a maximum length of 64 characters.
	Name string `json:"name,omitempty"`

	FunctionCall ChatCompletionRequestMessageFunctionCall `json:"function_call,omitempty"`
}
