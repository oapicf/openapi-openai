package models

type CreateMessageRequestAttachmentsInner struct {

	// The ID of the file to attach to the message.
	FileId string `json:"file_id,omitempty"`

	// The tools to add this file to.
	Tools []CreateMessageRequestAttachmentsInnerToolsInner `json:"tools,omitempty"`
}
