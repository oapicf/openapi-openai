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

// RunStepObjectLastError - The last error associated with this run step. Will be `null` if there are no errors.
type RunStepObjectLastError struct {

	// One of `server_error` or `rate_limit_exceeded`.
	Code string `json:"code"`

	// A human-readable description of the error.
	Message string `json:"message"`
}
