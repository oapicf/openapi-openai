package models

// MessageContentTextAnnotationsFilePathObject - A URL for the file that's generated when the assistant used the `code_interpreter` tool to generate a file.
type MessageContentTextAnnotationsFilePathObject struct {

	// Always `file_path`.
	Type string `json:"type"`

	// The text in the message content that needs to be replaced.
	Text string `json:"text"`

	FilePath MessageContentTextAnnotationsFilePathObjectFilePath `json:"file_path"`

	StartIndex int32 `json:"start_index"`

	EndIndex int32 `json:"end_index"`
}
