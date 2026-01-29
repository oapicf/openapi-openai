package models

// DeleteAssistantFileResponse - Deletes the association between the assistant and the file, but does not delete the [File](/docs/api-reference/files) object itself.
type DeleteAssistantFileResponse struct {

	Id string `json:"id"`

	Deleted bool `json:"deleted"`

	Object string `json:"object"`
}
