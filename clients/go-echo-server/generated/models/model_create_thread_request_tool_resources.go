package models

// CreateThreadRequestToolResources - A set of resources that are made available to the assistant's tools in this thread. The resources are specific to the type of tool. For example, the `code_interpreter` tool requires a list of file IDs, while the `file_search` tool requires a list of vector store IDs. 
type CreateThreadRequestToolResources struct {

	CodeInterpreter CreateAssistantRequestToolResourcesCodeInterpreter `json:"code_interpreter,omitempty"`

	FileSearch *CreateThreadRequestToolResourcesFileSearch `json:"file_search,omitempty"`
}
