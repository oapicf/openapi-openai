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

import (
	"encoding/json"
	"net/http"
	"strings"
	"os"

	"github.com/gorilla/mux"
)

// OpenAIAPIController binds http requests to an api service and writes the service results to the http response
type OpenAIAPIController struct {
	service OpenAIAPIServicer
	errorHandler ErrorHandler
}

// OpenAIAPIOption for how the controller is set up.
type OpenAIAPIOption func(*OpenAIAPIController)

// WithOpenAIAPIErrorHandler inject ErrorHandler into controller
func WithOpenAIAPIErrorHandler(h ErrorHandler) OpenAIAPIOption {
	return func(c *OpenAIAPIController) {
		c.errorHandler = h
	}
}

// NewOpenAIAPIController creates a default api controller
func NewOpenAIAPIController(s OpenAIAPIServicer, opts ...OpenAIAPIOption) Router {
	controller := &OpenAIAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the OpenAIAPIController
func (c *OpenAIAPIController) Routes() Routes {
	return Routes{
		"CancelFineTune": Route{
			strings.ToUpper("Post"),
			"/v1/fine-tunes/{fine_tune_id}/cancel",
			c.CancelFineTune,
		},
		"CreateChatCompletion": Route{
			strings.ToUpper("Post"),
			"/v1/chat/completions",
			c.CreateChatCompletion,
		},
		"CreateCompletion": Route{
			strings.ToUpper("Post"),
			"/v1/completions",
			c.CreateCompletion,
		},
		"CreateEdit": Route{
			strings.ToUpper("Post"),
			"/v1/edits",
			c.CreateEdit,
		},
		"CreateEmbedding": Route{
			strings.ToUpper("Post"),
			"/v1/embeddings",
			c.CreateEmbedding,
		},
		"CreateFile": Route{
			strings.ToUpper("Post"),
			"/v1/files",
			c.CreateFile,
		},
		"CreateFineTune": Route{
			strings.ToUpper("Post"),
			"/v1/fine-tunes",
			c.CreateFineTune,
		},
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
		"CreateModeration": Route{
			strings.ToUpper("Post"),
			"/v1/moderations",
			c.CreateModeration,
		},
		"CreateTranscription": Route{
			strings.ToUpper("Post"),
			"/v1/audio/transcriptions",
			c.CreateTranscription,
		},
		"CreateTranslation": Route{
			strings.ToUpper("Post"),
			"/v1/audio/translations",
			c.CreateTranslation,
		},
		"DeleteFile": Route{
			strings.ToUpper("Delete"),
			"/v1/files/{file_id}",
			c.DeleteFile,
		},
		"DeleteModel": Route{
			strings.ToUpper("Delete"),
			"/v1/models/{model}",
			c.DeleteModel,
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
		"ListFineTuneEvents": Route{
			strings.ToUpper("Get"),
			"/v1/fine-tunes/{fine_tune_id}/events",
			c.ListFineTuneEvents,
		},
		"ListFineTunes": Route{
			strings.ToUpper("Get"),
			"/v1/fine-tunes",
			c.ListFineTunes,
		},
		"ListModels": Route{
			strings.ToUpper("Get"),
			"/v1/models",
			c.ListModels,
		},
		"RetrieveFile": Route{
			strings.ToUpper("Get"),
			"/v1/files/{file_id}",
			c.RetrieveFile,
		},
		"RetrieveFineTune": Route{
			strings.ToUpper("Get"),
			"/v1/fine-tunes/{fine_tune_id}",
			c.RetrieveFineTune,
		},
		"RetrieveModel": Route{
			strings.ToUpper("Get"),
			"/v1/models/{model}",
			c.RetrieveModel,
		},
	}
}

// CancelFineTune - Immediately cancel a fine-tune job. 
func (c *OpenAIAPIController) CancelFineTune(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	fineTuneIdParam := params["fine_tune_id"]
	if fineTuneIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"fine_tune_id"}, nil)
		return
	}
	result, err := c.service.CancelFineTune(r.Context(), fineTuneIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// CreateChatCompletion - Creates a model response for the given chat conversation.
func (c *OpenAIAPIController) CreateChatCompletion(w http.ResponseWriter, r *http.Request) {
	createChatCompletionRequestParam := CreateChatCompletionRequest{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&createChatCompletionRequestParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertCreateChatCompletionRequestRequired(createChatCompletionRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertCreateChatCompletionRequestConstraints(createChatCompletionRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.CreateChatCompletion(r.Context(), createChatCompletionRequestParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// CreateCompletion - Creates a completion for the provided prompt and parameters.
func (c *OpenAIAPIController) CreateCompletion(w http.ResponseWriter, r *http.Request) {
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

// CreateEdit - Creates a new edit for the provided input, instruction, and parameters.
func (c *OpenAIAPIController) CreateEdit(w http.ResponseWriter, r *http.Request) {
	createEditRequestParam := CreateEditRequest{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&createEditRequestParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertCreateEditRequestRequired(createEditRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertCreateEditRequestConstraints(createEditRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.CreateEdit(r.Context(), createEditRequestParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// CreateEmbedding - Creates an embedding vector representing the input text.
func (c *OpenAIAPIController) CreateEmbedding(w http.ResponseWriter, r *http.Request) {
	createEmbeddingRequestParam := CreateEmbeddingRequest{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&createEmbeddingRequestParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertCreateEmbeddingRequestRequired(createEmbeddingRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertCreateEmbeddingRequestConstraints(createEmbeddingRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.CreateEmbedding(r.Context(), createEmbeddingRequestParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// CreateFile - Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 
func (c *OpenAIAPIController) CreateFile(w http.ResponseWriter, r *http.Request) {
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

// CreateFineTune - Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
func (c *OpenAIAPIController) CreateFineTune(w http.ResponseWriter, r *http.Request) {
	createFineTuneRequestParam := CreateFineTuneRequest{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&createFineTuneRequestParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertCreateFineTuneRequestRequired(createFineTuneRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertCreateFineTuneRequestConstraints(createFineTuneRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.CreateFineTune(r.Context(), createFineTuneRequestParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// CreateImage - Creates an image given a prompt.
func (c *OpenAIAPIController) CreateImage(w http.ResponseWriter, r *http.Request) {
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
func (c *OpenAIAPIController) CreateImageEdit(w http.ResponseWriter, r *http.Request) {
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
	
	
	
	
	nParam := r.FormValue("n")
	
	
	sizeParam := r.FormValue("size")
	
	
	responseFormatParam := r.FormValue("response_format")
	
	
	userParam := r.FormValue("user")
	result, err := c.service.CreateImageEdit(r.Context(), imageParam, promptParam, maskParam, nParam, sizeParam, responseFormatParam, userParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// CreateImageVariation - Creates a variation of a given image.
func (c *OpenAIAPIController) CreateImageVariation(w http.ResponseWriter, r *http.Request) {
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
	
	
	
	
	nParam := r.FormValue("n")
	
	
	sizeParam := r.FormValue("size")
	
	
	responseFormatParam := r.FormValue("response_format")
	
	
	userParam := r.FormValue("user")
	result, err := c.service.CreateImageVariation(r.Context(), imageParam, nParam, sizeParam, responseFormatParam, userParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// CreateModeration - Classifies if text violates OpenAI's Content Policy
func (c *OpenAIAPIController) CreateModeration(w http.ResponseWriter, r *http.Request) {
	createModerationRequestParam := CreateModerationRequest{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&createModerationRequestParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertCreateModerationRequestRequired(createModerationRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertCreateModerationRequestConstraints(createModerationRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.CreateModeration(r.Context(), createModerationRequestParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// CreateTranscription - Transcribes audio into the input language.
func (c *OpenAIAPIController) CreateTranscription(w http.ResponseWriter, r *http.Request) {
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
	
	
	
	
	modelParam := r.FormValue("model")
	
	
	promptParam := r.FormValue("prompt")
	
	
	responseFormatParam := r.FormValue("response_format")
	
	
	temperatureParam := r.FormValue("temperature")
	
	
	languageParam := r.FormValue("language")
	result, err := c.service.CreateTranscription(r.Context(), fileParam, modelParam, promptParam, responseFormatParam, temperatureParam, languageParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// CreateTranslation - Translates audio into English.
func (c *OpenAIAPIController) CreateTranslation(w http.ResponseWriter, r *http.Request) {
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
	
	
	
	
	modelParam := r.FormValue("model")
	
	
	promptParam := r.FormValue("prompt")
	
	
	responseFormatParam := r.FormValue("response_format")
	
	
	temperatureParam := r.FormValue("temperature")
	result, err := c.service.CreateTranslation(r.Context(), fileParam, modelParam, promptParam, responseFormatParam, temperatureParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// DeleteFile - Delete a file.
func (c *OpenAIAPIController) DeleteFile(w http.ResponseWriter, r *http.Request) {
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

// DeleteModel - Delete a fine-tuned model. You must have the Owner role in your organization.
func (c *OpenAIAPIController) DeleteModel(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	modelParam := params["model"]
	if modelParam == "" {
		c.errorHandler(w, r, &RequiredError{"model"}, nil)
		return
	}
	result, err := c.service.DeleteModel(r.Context(), modelParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// DownloadFile - Returns the contents of the specified file
func (c *OpenAIAPIController) DownloadFile(w http.ResponseWriter, r *http.Request) {
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
func (c *OpenAIAPIController) ListFiles(w http.ResponseWriter, r *http.Request) {
	result, err := c.service.ListFiles(r.Context())
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// ListFineTuneEvents - Get fine-grained status updates for a fine-tune job. 
func (c *OpenAIAPIController) ListFineTuneEvents(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query, err := parseQuery(r.URL.RawQuery)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	fineTuneIdParam := params["fine_tune_id"]
	if fineTuneIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"fine_tune_id"}, nil)
		return
	}
	var streamParam bool
	if query.Has("stream") {
		param, err := parseBoolParameter(
			query.Get("stream"),
			WithParse[bool](parseBool),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		streamParam = param
	} else {
		var param bool = false
		streamParam = param
	}
	result, err := c.service.ListFineTuneEvents(r.Context(), fineTuneIdParam, streamParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// ListFineTunes - List your organization's fine-tuning jobs 
func (c *OpenAIAPIController) ListFineTunes(w http.ResponseWriter, r *http.Request) {
	result, err := c.service.ListFineTunes(r.Context())
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// ListModels - Lists the currently available models, and provides basic information about each one such as the owner and availability.
func (c *OpenAIAPIController) ListModels(w http.ResponseWriter, r *http.Request) {
	result, err := c.service.ListModels(r.Context())
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// RetrieveFile - Returns information about a specific file.
func (c *OpenAIAPIController) RetrieveFile(w http.ResponseWriter, r *http.Request) {
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

// RetrieveFineTune - Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
func (c *OpenAIAPIController) RetrieveFineTune(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	fineTuneIdParam := params["fine_tune_id"]
	if fineTuneIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"fine_tune_id"}, nil)
		return
	}
	result, err := c.service.RetrieveFineTune(r.Context(), fineTuneIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// RetrieveModel - Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
func (c *OpenAIAPIController) RetrieveModel(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	modelParam := params["model"]
	if modelParam == "" {
		c.errorHandler(w, r, &RequiredError{"model"}, nil)
		return
	}
	result, err := c.service.RetrieveModel(r.Context(), modelParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}