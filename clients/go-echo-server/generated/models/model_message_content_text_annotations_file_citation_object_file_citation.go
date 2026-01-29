package models

type MessageContentTextAnnotationsFileCitationObjectFileCitation struct {

	// The ID of the specific File the citation is from.
	FileId string `json:"file_id"`

	// The specific quote in the file.
	Quote string `json:"quote"`
}
