package models

// RealtimeClientEventConversationItemDelete - Send this event when you want to remove any item from the conversation  history. The server will respond with a `conversation.item.deleted` event,  unless the item does not exist in the conversation history, in which case the  server will respond with an error. 
type RealtimeClientEventConversationItemDelete struct {

	// Optional client-generated ID used to identify this event.
	EventId string `json:"event_id,omitempty"`

	// The event type, must be `conversation.item.delete`.
	Type string `json:"type"`

	// The ID of the item to delete.
	ItemId string `json:"item_id"`
}
