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

import (
	"context"
	"net/http"
	"errors"
)

// CompletionsAPIService is a service that implements the logic for the CompletionsAPIServicer
// This service should implement the business logic for every endpoint for the CompletionsAPI API.
// Include any external packages or services that will be required by this service.
type CompletionsAPIService struct {
}

// NewCompletionsAPIService creates a default api service
func NewCompletionsAPIService() CompletionsAPIServicer {
	return &CompletionsAPIService{}
}

// CreateCompletion - Creates a completion for the provided prompt and parameters.
func (s *CompletionsAPIService) CreateCompletion(ctx context.Context, createCompletionRequest CreateCompletionRequest) (ImplResponse, error) {
	// TODO - update CreateCompletion with the required logic for this service method.
	// Add api_completions_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, CreateCompletionResponse{}) or use other options such as http.Ok ...
	// return Response(200, CreateCompletionResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("CreateCompletion method not implemented")
}
