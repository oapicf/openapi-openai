package models

// RealtimeServerEventConversationCreatedConversation - The conversation resource.
type RealtimeServerEventConversationCreatedConversation struct {

	// The unique ID of the conversation.
	Id string `json:"id,omitempty"`

	// The object type, must be `realtime.conversation`.
	Object string `json:"object,omitempty"`
}
