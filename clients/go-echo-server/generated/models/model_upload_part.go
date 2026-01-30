package models

// UploadPart - The upload Part represents a chunk of bytes we can add to an Upload object. 
type UploadPart struct {

	// The upload Part unique identifier, which can be referenced in API endpoints.
	Id string `json:"id"`

	// The Unix timestamp (in seconds) for when the Part was created.
	CreatedAt int32 `json:"created_at"`

	// The ID of the Upload object that this Part was added to.
	UploadId string `json:"upload_id"`

	// The object type, which is always `upload.part`.
	Object string `json:"object"`
}
