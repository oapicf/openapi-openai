package models

import (
	"gopkg.in/validator.v2"
)

type MessageContentTextObjectTextAnnotationsInner struct {

	// Always `file_citation`.
	Type string `json:"type"`

	// The text in the message content that needs to be replaced.
	Text string `json:"text"`

	FileCitation MessageContentTextAnnotationsFileCitationObjectFileCitation `json:"file_citation"`

	StartIndex int32 `json:"start_index"`

	EndIndex int32 `json:"end_index"`

	FilePath MessageContentTextAnnotationsFilePathObjectFilePath `json:"file_path"`
}
