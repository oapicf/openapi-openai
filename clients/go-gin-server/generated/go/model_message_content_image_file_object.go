/*
 * OpenAI API
 *
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * API version: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

// MessageContentImageFileObject - References an image [File](/docs/api-reference/files) in the content of a message.
type MessageContentImageFileObject struct {

	// Always `image_file`.
	Type string `json:"type"`

	ImageFile MessageContentImageFileObjectImageFile `json:"image_file"`
}