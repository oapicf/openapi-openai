package models

type ModifyAssistantRequestToolResourcesCodeInterpreter struct {

	// Overrides the list of [file](/docs/api-reference/files) IDs made available to the `code_interpreter` tool. There can be a maximum of 20 files associated with the tool. 
	FileIds []string `json:"file_ids,omitempty"`
}
