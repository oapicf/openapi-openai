package models

// MessageDeltaObject - Represents a message delta i.e. any changed fields on a message during streaming. 
type MessageDeltaObject struct {

	// The identifier of the message, which can be referenced in API endpoints.
	Id string `json:"id"`

	// The object type, which is always `thread.message.delta`.
	Object string `json:"object"`

	Delta MessageDeltaObjectDelta `json:"delta"`
}
