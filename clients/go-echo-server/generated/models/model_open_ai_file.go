package models

// OpenAiFile - The `File` object represents a document that has been uploaded to OpenAI.
type OpenAiFile struct {

	// The file identifier, which can be referenced in the API endpoints.
	Id string `json:"id"`

	// The size of the file, in bytes.
	Bytes int32 `json:"bytes"`

	// The Unix timestamp (in seconds) for when the file was created.
	CreatedAt int32 `json:"created_at"`

	// The name of the file.
	Filename string `json:"filename"`

	// The object type, which is always `file`.
	Object string `json:"object"`

	// The intended purpose of the file. Supported values are `fine-tune`, `fine-tune-results`, `assistants`, and `assistants_output`.
	Purpose string `json:"purpose"`

	// Deprecated. The current status of the file, which can be either `uploaded`, `processed`, or `error`.
	// Deprecated
	Status string `json:"status"`

	// Deprecated. For details on why a fine-tuning training file failed validation, see the `error` field on `fine_tuning.job`.
	// Deprecated
	StatusDetails string `json:"status_details,omitempty"`
}
