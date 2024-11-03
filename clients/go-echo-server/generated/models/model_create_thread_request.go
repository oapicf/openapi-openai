package models

type CreateThreadRequest struct {

	// A list of [messages](/docs/api-reference/messages) to start the thread with.
	Messages []CreateMessageRequest `json:"messages,omitempty"`

	// Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
	Metadata *map[string]interface{} `json:"metadata,omitempty"`
}
