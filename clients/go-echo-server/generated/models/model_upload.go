package models

// Upload - The Upload object can accept byte chunks in the form of Parts. 
type Upload struct {

	// The Upload unique identifier, which can be referenced in API endpoints.
	Id string `json:"id"`

	// The Unix timestamp (in seconds) for when the Upload was created.
	CreatedAt int32 `json:"created_at"`

	// The name of the file to be uploaded.
	Filename string `json:"filename"`

	// The intended number of bytes to be uploaded.
	Bytes int32 `json:"bytes"`

	// The intended purpose of the file. [Please refer here](/docs/api-reference/files/object#files/object-purpose) for acceptable values.
	Purpose string `json:"purpose"`

	// The status of the Upload.
	Status string `json:"status"`

	// The Unix timestamp (in seconds) for when the Upload was created.
	ExpiresAt int32 `json:"expires_at"`

	// The object type, which is always \"upload\".
	Object string `json:"object,omitempty"`

	File OpenAiFile `json:"file,omitempty"`
}
