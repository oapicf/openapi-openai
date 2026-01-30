package models

type AssistantToolsFileSearch struct {

	// The type of tool being defined: `file_search`
	Type string `json:"type"`

	FileSearch AssistantToolsFileSearchFileSearch `json:"file_search,omitempty"`
}
