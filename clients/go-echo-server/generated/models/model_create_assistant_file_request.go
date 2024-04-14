package models

type CreateAssistantFileRequest struct {

	// A [File](/docs/api-reference/files) ID (with `purpose=\"assistants\"`) that the assistant should use. Useful for tools like `retrieval` and `code_interpreter` that can access files.
	FileId string `json:"file_id"`
}
