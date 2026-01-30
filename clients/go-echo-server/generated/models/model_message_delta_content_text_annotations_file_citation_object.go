package models

// MessageDeltaContentTextAnnotationsFileCitationObject - A citation within the message that points to a specific quote from a specific File associated with the assistant or the message. Generated when the assistant uses the \"file_search\" tool to search files.
type MessageDeltaContentTextAnnotationsFileCitationObject struct {

	// The index of the annotation in the text content part.
	Index int32 `json:"index"`

	// Always `file_citation`.
	Type string `json:"type"`

	// The text in the message content that needs to be replaced.
	Text string `json:"text,omitempty"`

	FileCitation MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation `json:"file_citation,omitempty"`

	StartIndex int32 `json:"start_index,omitempty"`

	EndIndex int32 `json:"end_index,omitempty"`
}
