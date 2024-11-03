package models

// MessageDeltaContentTextAnnotationsFilePathObject - A URL for the file that's generated when the assistant used the `code_interpreter` tool to generate a file.
type MessageDeltaContentTextAnnotationsFilePathObject struct {

	// The index of the annotation in the text content part.
	Index int32 `json:"index"`

	// Always `file_path`.
	Type string `json:"type"`

	// The text in the message content that needs to be replaced.
	Text string `json:"text,omitempty"`

	FilePath MessageDeltaContentTextAnnotationsFilePathObjectFilePath `json:"file_path,omitempty"`

	StartIndex int32 `json:"start_index,omitempty"`

	EndIndex int32 `json:"end_index,omitempty"`
}
