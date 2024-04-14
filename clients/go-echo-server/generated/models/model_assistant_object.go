package models

// AssistantObject - Represents an `assistant` that can call the model and use tools.
type AssistantObject struct {

	// The identifier, which can be referenced in API endpoints.
	Id string `json:"id"`

	// The object type, which is always `assistant`.
	Object string `json:"object"`

	// The Unix timestamp (in seconds) for when the assistant was created.
	CreatedAt int32 `json:"created_at"`

	// The name of the assistant. The maximum length is 256 characters. 
	Name *string `json:"name"`

	// The description of the assistant. The maximum length is 512 characters. 
	Description *string `json:"description"`

	// ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them. 
	Model string `json:"model"`

	// The system instructions that the assistant uses. The maximum length is 256,000 characters. 
	Instructions *string `json:"instructions"`

	// A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `retrieval`, or `function`. 
	Tools []AssistantObjectToolsInner `json:"tools"`

	// A list of [file](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order. 
	FileIds []string `json:"file_ids"`

	// Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
	Metadata *map[string]interface{} `json:"metadata"`
}
