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

// FilesAPIController binds http requests to an api service and writes the service results to the http response
type FilesAPIController struct {
	service FilesAPIServicer
	errorHandler ErrorHandler
}

// FilesAPIOption for how the controller is set up.
type FilesAPIOption func(*FilesAPIController)

// WithFilesAPIErrorHandler inject ErrorHandler into controller
func WithFilesAPIErrorHandler(h ErrorHandler) FilesAPIOption {
	return func(c *FilesAPIController) {
		c.errorHandler = h
	}
}

// NewFilesAPIController creates a default api controller
func NewFilesAPIController(s FilesAPIServicer, opts ...FilesAPIOption) Router {
	controller := &FilesAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the FilesAPIController
func (c *FilesAPIController) Routes() Routes {
	return Routes{
		"CreateFile": Route{
			strings.ToUpper("Post"),
			"/v1/files",
			c.CreateFile,
		},
		"DeleteFile": Route{
			strings.ToUpper("Delete"),
			"/v1/files/{file_id}",
			c.DeleteFile,
		},
		"DownloadFile": Route{
			strings.ToUpper("Get"),
			"/v1/files/{file_id}/content",
			c.DownloadFile,
		},
		"ListFiles": Route{
			strings.ToUpper("Get"),
			"/v1/files",
			c.ListFiles,
		},
		"RetrieveFile": Route{
			strings.ToUpper("Get"),
			"/v1/files/{file_id}",
			c.RetrieveFile,
		},
	}
}

// CreateFile - Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports `.jsonl` files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
func (c *FilesAPIController) CreateFile(w http.ResponseWriter, r *http.Request) {
	if err := r.ParseMultipartForm(32 << 20); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	var fileParam *os.File
	{
		param, err := ReadFormFileToTempFile(r, "file")
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		fileParam = param
	}
	
	
	
	
	purposeParam := r.FormValue("purpose")
	result, err := c.service.CreateFile(r.Context(), fileParam, purposeParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// DeleteFile - Delete a file.
func (c *FilesAPIController) DeleteFile(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	fileIdParam := params["file_id"]
	if fileIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"file_id"}, nil)
		return
	}
	result, err := c.service.DeleteFile(r.Context(), fileIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// DownloadFile - Returns the contents of the specified file.
func (c *FilesAPIController) DownloadFile(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	fileIdParam := params["file_id"]
	if fileIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"file_id"}, nil)
		return
	}
	result, err := c.service.DownloadFile(r.Context(), fileIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// ListFiles - Returns a list of files that belong to the user's organization.
func (c *FilesAPIController) ListFiles(w http.ResponseWriter, r *http.Request) {
	query, err := parseQuery(r.URL.RawQuery)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	var purposeParam string
	if query.Has("purpose") {
		param := query.Get("purpose")

		purposeParam = param
	} else {
	}
	result, err := c.service.ListFiles(r.Context(), purposeParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// RetrieveFile - Returns information about a specific file.
func (c *FilesAPIController) RetrieveFile(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	fileIdParam := params["file_id"]
	if fileIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"file_id"}, nil)
		return
	}
	result, err := c.service.RetrieveFile(r.Context(), fileIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}