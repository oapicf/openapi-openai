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