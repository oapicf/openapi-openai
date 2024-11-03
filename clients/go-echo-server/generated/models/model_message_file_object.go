package models

// MessageFileObject - A list of files attached to a `message`.
type MessageFileObject struct {

	// The identifier, which can be referenced in API endpoints.
	Id string `json:"id"`

	// The object type, which is always `thread.message.file`.
	Object string `json:"object"`

	// The Unix timestamp (in seconds) for when the message file was created.
	CreatedAt int32 `json:"created_at"`

	// The ID of the [message](/docs/api-reference/messages) that the [File](/docs/api-reference/files) is attached to.
	MessageId string `json:"message_id"`
}
