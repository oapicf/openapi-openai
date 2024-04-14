package models

// ThreadObject - Represents a thread that contains [messages](/docs/api-reference/messages).
type ThreadObject struct {

	// The identifier, which can be referenced in API endpoints.
	Id string `json:"id"`

	// The object type, which is always `thread`.
	Object string `json:"object"`

	// The Unix timestamp (in seconds) for when the thread was created.
	CreatedAt int32 `json:"created_at"`

	// Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
	Metadata *map[string]interface{} `json:"metadata"`
}
