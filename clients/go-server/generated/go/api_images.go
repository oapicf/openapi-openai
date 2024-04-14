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
	"os"

	"github.com/gorilla/mux"
)

// ImagesAPIController binds http requests to an api service and writes the service results to the http response
type ImagesAPIController struct {
	service ImagesAPIServicer
	errorHandler ErrorHandler
}

// ImagesAPIOption for how the controller is set up.
type ImagesAPIOption func(*ImagesAPIController)

// WithImagesAPIErrorHandler inject ErrorHandler into controller
func WithImagesAPIErrorHandler(h ErrorHandler) ImagesAPIOption {
	return func(c *ImagesAPIController) {
		c.errorHandler = h
	}
}

// NewImagesAPIController creates a default api controller
func NewImagesAPIController(s ImagesAPIServicer, opts ...ImagesAPIOption) Router {
	controller := &ImagesAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the ImagesAPIController
func (c *ImagesAPIController) Routes() Routes {
	return Routes{
		"CreateImage": Route{
			strings.ToUpper("Post"),
			"/v1/images/generations",
			c.CreateImage,
		},
		"CreateImageEdit": Route{
			strings.ToUpper("Post"),
			"/v1/images/edits",
			c.CreateImageEdit,
		},
		"CreateImageVariation": Route{
			strings.ToUpper("Post"),
			"/v1/images/variations",
			c.CreateImageVariation,
		},
	}
}

// CreateImage - Creates an image given a prompt.
func (c *ImagesAPIController) CreateImage(w http.ResponseWriter, r *http.Request) {
	createImageRequestParam := CreateImageRequest{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&createImageRequestParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertCreateImageRequestRequired(createImageRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertCreateImageRequestConstraints(createImageRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.CreateImage(r.Context(), createImageRequestParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// CreateImageEdit - Creates an edited or extended image given an original image and a prompt.
func (c *ImagesAPIController) CreateImageEdit(w http.ResponseWriter, r *http.Request) {
	if err := r.ParseMultipartForm(32 << 20); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	var imageParam *os.File
	{
		param, err := ReadFormFileToTempFile(r, "image")
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		imageParam = param
	}
	
	
	
	
	promptParam := r.FormValue("prompt")
	var maskParam *os.File
	{
		param, err := ReadFormFileToTempFile(r, "mask")
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		maskParam = param
	}
	
	
	
	
	modelParam := r.FormValue("model")
	
	
	nParam := r.FormValue("n")
	
	
	sizeParam := r.FormValue("size")
	
	
	responseFormatParam := r.FormValue("response_format")
	
	
	userParam := r.FormValue("user")
	result, err := c.service.CreateImageEdit(r.Context(), imageParam, promptParam, maskParam, modelParam, nParam, sizeParam, responseFormatParam, userParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// CreateImageVariation - Creates a variation of a given image.
func (c *ImagesAPIController) CreateImageVariation(w http.ResponseWriter, r *http.Request) {
	if err := r.ParseMultipartForm(32 << 20); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	var imageParam *os.File
	{
		param, err := ReadFormFileToTempFile(r, "image")
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		imageParam = param
	}
	
	
	
	
	modelParam := r.FormValue("model")
	
	
	nParam := r.FormValue("n")
	
	
	responseFormatParam := r.FormValue("response_format")
	
	
	sizeParam := r.FormValue("size")
	
	
	userParam := r.FormValue("user")
	result, err := c.service.CreateImageVariation(r.Context(), imageParam, modelParam, nParam, responseFormatParam, sizeParam, userParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}
