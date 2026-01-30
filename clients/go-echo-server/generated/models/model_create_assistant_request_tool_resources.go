package models

// CreateAssistantRequestToolResources - A set of resources that are used by the assistant's tools. The resources are specific to the type of tool. For example, the `code_interpreter` tool requires a list of file IDs, while the `file_search` tool requires a list of vector store IDs. 
type CreateAssistantRequestToolResources struct {

	CodeInterpreter CreateAssistantRequestToolResourcesCodeInterpreter `json:"code_interpreter,omitempty"`

	FileSearch *CreateAssistantRequestToolResourcesFileSearch `json:"file_search,omitempty"`
}
