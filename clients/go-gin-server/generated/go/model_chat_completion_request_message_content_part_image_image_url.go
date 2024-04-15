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

type ChatCompletionRequestMessageContentPartImageImageUrl struct {

	// Either a URL of the image or the base64 encoded image data.
	Url string `json:"url"`

	// Specifies the detail level of the image. Learn more in the [Vision guide](/docs/guides/vision/low-or-high-fidelity-image-understanding).
	Detail string `json:"detail,omitempty"`
}