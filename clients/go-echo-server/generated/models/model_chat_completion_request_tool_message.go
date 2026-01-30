package models

type ChatCompletionRequestToolMessage struct {

	// The role of the messages author, in this case `tool`.
	Role string `json:"role"`

	Content ChatCompletionRequestToolMessageContent `json:"content"`

	// Tool call that this message is responding to.
	ToolCallId string `json:"tool_call_id"`
}
