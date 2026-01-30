package models

// RealtimeServerEventConversationItemDeleted - Returned when an item in the conversation is deleted by the client with a  `conversation.item.delete` event. This event is used to synchronize the  server's understanding of the conversation history with the client's view. 
type RealtimeServerEventConversationItemDeleted struct {

	// The unique ID of the server event.
	EventId string `json:"event_id"`

	// The event type, must be `conversation.item.deleted`.
	Type string `json:"type"`

	// The ID of the item that was deleted.
	ItemId string `json:"item_id"`
}
