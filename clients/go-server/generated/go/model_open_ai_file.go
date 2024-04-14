/*
 * OpenAI API
 *
 * APIs for sampling from and fine-tuning language models
 *
 * API version: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type OpenAiFile struct {

	Id string `json:"id"`

	Object string `json:"object"`

	Bytes int32 `json:"bytes"`

	CreatedAt int32 `json:"created_at"`

	Filename string `json:"filename"`

	Purpose string `json:"purpose"`

	Status string `json:"status,omitempty"`

	StatusDetails *map[string]interface{} `json:"status_details,omitempty"`
}

// AssertOpenAiFileRequired checks if the required fields are not zero-ed
func AssertOpenAiFileRequired(obj OpenAiFile) error {
	elements := map[string]interface{}{
		"id": obj.Id,
		"object": obj.Object,
		"bytes": obj.Bytes,
		"created_at": obj.CreatedAt,
		"filename": obj.Filename,
		"purpose": obj.Purpose,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertOpenAiFileConstraints checks if the values respects the defined constraints
func AssertOpenAiFileConstraints(obj OpenAiFile) error {
	return nil
}