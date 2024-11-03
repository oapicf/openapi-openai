// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * OpenAI API
 *
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * API version: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 */

package openapi




type ModifyAssistantRequest struct {

	Model string `json:"model,omitempty"`

	// The name of the assistant. The maximum length is 256 characters. 
	Name *string `json:"name,omitempty"`

	// The description of the assistant. The maximum length is 512 characters. 
	Description *string `json:"description,omitempty"`

	// The system instructions that the assistant uses. The maximum length is 256,000 characters. 
	Instructions *string `json:"instructions,omitempty"`

	// A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `retrieval`, or `function`. 
	Tools []AssistantObjectToolsInner `json:"tools,omitempty"`

	// A list of [File](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order. If a file was previously attached to the list but does not show up in the list, it will be deleted from the assistant. 
	FileIds []string `json:"file_ids,omitempty"`

	// Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
	Metadata *map[string]interface{} `json:"metadata,omitempty"`
}

// AssertModifyAssistantRequestRequired checks if the required fields are not zero-ed
func AssertModifyAssistantRequestRequired(obj ModifyAssistantRequest) error {
	for _, el := range obj.Tools {
		if err := AssertAssistantObjectToolsInnerRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertModifyAssistantRequestConstraints checks if the values respects the defined constraints
func AssertModifyAssistantRequestConstraints(obj ModifyAssistantRequest) error {
	for _, el := range obj.Tools {
		if err := AssertAssistantObjectToolsInnerConstraints(el); err != nil {
			return err
		}
	}
	return nil
}
