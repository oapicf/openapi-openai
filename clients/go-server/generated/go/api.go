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
	"context"
	"net/http"
	"os"
)



// OpenAIAPIRouter defines the required methods for binding the api requests to a responses for the OpenAIAPI
// The OpenAIAPIRouter implementation should parse necessary information from the http request,
// pass the data to a OpenAIAPIServicer to perform the required actions, then write the service results to the http response.
type OpenAIAPIRouter interface { 
	CancelFineTune(http.ResponseWriter, *http.Request)
	CreateChatCompletion(http.ResponseWriter, *http.Request)
	CreateCompletion(http.ResponseWriter, *http.Request)
	CreateEdit(http.ResponseWriter, *http.Request)
	CreateEmbedding(http.ResponseWriter, *http.Request)
	CreateFile(http.ResponseWriter, *http.Request)
	CreateFineTune(http.ResponseWriter, *http.Request)
	CreateImage(http.ResponseWriter, *http.Request)
	CreateImageEdit(http.ResponseWriter, *http.Request)
	CreateImageVariation(http.ResponseWriter, *http.Request)
	CreateModeration(http.ResponseWriter, *http.Request)
	CreateTranscription(http.ResponseWriter, *http.Request)
	CreateTranslation(http.ResponseWriter, *http.Request)
	DeleteFile(http.ResponseWriter, *http.Request)
	DeleteModel(http.ResponseWriter, *http.Request)
	DownloadFile(http.ResponseWriter, *http.Request)
	ListFiles(http.ResponseWriter, *http.Request)
	ListFineTuneEvents(http.ResponseWriter, *http.Request)
	ListFineTunes(http.ResponseWriter, *http.Request)
	ListModels(http.ResponseWriter, *http.Request)
	RetrieveFile(http.ResponseWriter, *http.Request)
	RetrieveFineTune(http.ResponseWriter, *http.Request)
	RetrieveModel(http.ResponseWriter, *http.Request)
}


// OpenAIAPIServicer defines the api actions for the OpenAIAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type OpenAIAPIServicer interface { 
	CancelFineTune(context.Context, string) (ImplResponse, error)
	CreateChatCompletion(context.Context, CreateChatCompletionRequest) (ImplResponse, error)
	CreateCompletion(context.Context, CreateCompletionRequest) (ImplResponse, error)
	CreateEdit(context.Context, CreateEditRequest) (ImplResponse, error)
	CreateEmbedding(context.Context, CreateEmbeddingRequest) (ImplResponse, error)
	CreateFile(context.Context, *os.File, string) (ImplResponse, error)
	CreateFineTune(context.Context, CreateFineTuneRequest) (ImplResponse, error)
	CreateImage(context.Context, CreateImageRequest) (ImplResponse, error)
	CreateImageEdit(context.Context, *os.File, string, *os.File, *int32, *string, *string, string) (ImplResponse, error)
	CreateImageVariation(context.Context, *os.File, *int32, *string, *string, string) (ImplResponse, error)
	CreateModeration(context.Context, CreateModerationRequest) (ImplResponse, error)
	CreateTranscription(context.Context, *os.File, CreateTranscriptionRequestModel, string, string, float32, string) (ImplResponse, error)
	CreateTranslation(context.Context, *os.File, CreateTranscriptionRequestModel, string, string, float32) (ImplResponse, error)
	DeleteFile(context.Context, string) (ImplResponse, error)
	DeleteModel(context.Context, string) (ImplResponse, error)
	DownloadFile(context.Context, string) (ImplResponse, error)
	ListFiles(context.Context) (ImplResponse, error)
	ListFineTuneEvents(context.Context, string, bool) (ImplResponse, error)
	ListFineTunes(context.Context) (ImplResponse, error)
	ListModels(context.Context) (ImplResponse, error)
	RetrieveFile(context.Context, string) (ImplResponse, error)
	RetrieveFineTune(context.Context, string) (ImplResponse, error)
	RetrieveModel(context.Context, string) (ImplResponse, error)
}
