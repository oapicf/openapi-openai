package models

type MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation struct {

	// The ID of the specific File the citation is from.
	FileId string `json:"file_id,omitempty"`

	// The specific quote in the file.
	Quote string `json:"quote,omitempty"`
}
