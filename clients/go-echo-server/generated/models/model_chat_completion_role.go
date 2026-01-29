package models
// ChatCompletionRole : The role of the author of a message
type ChatCompletionRole string

// List of ChatCompletionRole
const (
	SYSTEM ChatCompletionRole = "system"
	USER ChatCompletionRole = "user"
	ASSISTANT ChatCompletionRole = "assistant"
	TOOL ChatCompletionRole = "tool"
	FUNCTION ChatCompletionRole = "function"
)
