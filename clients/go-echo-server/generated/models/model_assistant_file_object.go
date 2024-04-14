package models

// AssistantFileObject - A list of [Files](/docs/api-reference/files) attached to an `assistant`.
type AssistantFileObject struct {

	// The identifier, which can be referenced in API endpoints.
	Id string `json:"id"`

	// The object type, which is always `assistant.file`.
	Object string `json:"object"`

	// The Unix timestamp (in seconds) for when the assistant file was created.
	CreatedAt int32 `json:"created_at"`

	// The assistant ID that the file is attached to.
	AssistantId string `json:"assistant_id"`
}
