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
	"encoding/json"
	"net/http"
	"strings"

	"github.com/gorilla/mux"
)

// CompletionsAPIController binds http requests to an api service and writes the service results to the http response
type CompletionsAPIController struct {
	service CompletionsAPIServicer
	errorHandler ErrorHandler
}

// CompletionsAPIOption for how the controller is set up.
type CompletionsAPIOption func(*CompletionsAPIController)

// WithCompletionsAPIErrorHandler inject ErrorHandler into controller
func WithCompletionsAPIErrorHandler(h ErrorHandler) CompletionsAPIOption {
	return func(c *CompletionsAPIController) {
		c.errorHandler = h
	}
}

// NewCompletionsAPIController creates a default api controller
func NewCompletionsAPIController(s CompletionsAPIServicer, opts ...CompletionsAPIOption) Router {
	controller := &CompletionsAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the CompletionsAPIController
func (c *CompletionsAPIController) Routes() Routes {
	return Routes{
		"CreateCompletion": Route{
			strings.ToUpper("Post"),
			"/v1/completions",
			c.CreateCompletion,
		},
	}
}

// CreateCompletion - Creates a completion for the provided prompt and parameters.
func (c *CompletionsAPIController) CreateCompletion(w http.ResponseWriter, r *http.Request) {
	createCompletionRequestParam := CreateCompletionRequest{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&createCompletionRequestParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertCreateCompletionRequestRequired(createCompletionRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertCreateCompletionRequestConstraints(createCompletionRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.CreateCompletion(r.Context(), createCompletionRequestParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}
