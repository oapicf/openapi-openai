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
	"os"
	"os"
	"os"
)



// AssistantsAPIRouter defines the required methods for binding the api requests to a responses for the AssistantsAPI
// The AssistantsAPIRouter implementation should parse necessary information from the http request,
// pass the data to a AssistantsAPIServicer to perform the required actions, then write the service results to the http response.
type AssistantsAPIRouter interface { 
	CancelRun(http.ResponseWriter, *http.Request)
	CreateAssistant(http.ResponseWriter, *http.Request)
	CreateAssistantFile(http.ResponseWriter, *http.Request)
	CreateMessage(http.ResponseWriter, *http.Request)
	CreateRun(http.ResponseWriter, *http.Request)
	CreateThread(http.ResponseWriter, *http.Request)
	CreateThreadAndRun(http.ResponseWriter, *http.Request)
	DeleteAssistant(http.ResponseWriter, *http.Request)
	DeleteAssistantFile(http.ResponseWriter, *http.Request)
	DeleteThread(http.ResponseWriter, *http.Request)
	GetAssistant(http.ResponseWriter, *http.Request)
	GetAssistantFile(http.ResponseWriter, *http.Request)
	GetMessage(http.ResponseWriter, *http.Request)
	GetMessageFile(http.ResponseWriter, *http.Request)
	GetRun(http.ResponseWriter, *http.Request)
	GetRunStep(http.ResponseWriter, *http.Request)
	GetThread(http.ResponseWriter, *http.Request)
	ListAssistantFiles(http.ResponseWriter, *http.Request)
	ListAssistants(http.ResponseWriter, *http.Request)
	ListMessageFiles(http.ResponseWriter, *http.Request)
	ListMessages(http.ResponseWriter, *http.Request)
	ListRunSteps(http.ResponseWriter, *http.Request)
	ListRuns(http.ResponseWriter, *http.Request)
	ModifyAssistant(http.ResponseWriter, *http.Request)
	ModifyMessage(http.ResponseWriter, *http.Request)
	ModifyRun(http.ResponseWriter, *http.Request)
	ModifyThread(http.ResponseWriter, *http.Request)
	SubmitToolOuputsToRun(http.ResponseWriter, *http.Request)
}
// AudioAPIRouter defines the required methods for binding the api requests to a responses for the AudioAPI
// The AudioAPIRouter implementation should parse necessary information from the http request,
// pass the data to a AudioAPIServicer to perform the required actions, then write the service results to the http response.
type AudioAPIRouter interface { 
	CreateSpeech(http.ResponseWriter, *http.Request)
	CreateTranscription(http.ResponseWriter, *http.Request)
	CreateTranslation(http.ResponseWriter, *http.Request)
}
// ChatAPIRouter defines the required methods for binding the api requests to a responses for the ChatAPI
// The ChatAPIRouter implementation should parse necessary information from the http request,
// pass the data to a ChatAPIServicer to perform the required actions, then write the service results to the http response.
type ChatAPIRouter interface { 
	CreateChatCompletion(http.ResponseWriter, *http.Request)
}
// CompletionsAPIRouter defines the required methods for binding the api requests to a responses for the CompletionsAPI
// The CompletionsAPIRouter implementation should parse necessary information from the http request,
// pass the data to a CompletionsAPIServicer to perform the required actions, then write the service results to the http response.
type CompletionsAPIRouter interface { 
	CreateCompletion(http.ResponseWriter, *http.Request)
}
// EmbeddingsAPIRouter defines the required methods for binding the api requests to a responses for the EmbeddingsAPI
// The EmbeddingsAPIRouter implementation should parse necessary information from the http request,
// pass the data to a EmbeddingsAPIServicer to perform the required actions, then write the service results to the http response.
type EmbeddingsAPIRouter interface { 
	CreateEmbedding(http.ResponseWriter, *http.Request)
}
// FilesAPIRouter defines the required methods for binding the api requests to a responses for the FilesAPI
// The FilesAPIRouter implementation should parse necessary information from the http request,
// pass the data to a FilesAPIServicer to perform the required actions, then write the service results to the http response.
type FilesAPIRouter interface { 
	CreateFile(http.ResponseWriter, *http.Request)
	DeleteFile(http.ResponseWriter, *http.Request)
	DownloadFile(http.ResponseWriter, *http.Request)
	ListFiles(http.ResponseWriter, *http.Request)
	RetrieveFile(http.ResponseWriter, *http.Request)
}
// FineTuningAPIRouter defines the required methods for binding the api requests to a responses for the FineTuningAPI
// The FineTuningAPIRouter implementation should parse necessary information from the http request,
// pass the data to a FineTuningAPIServicer to perform the required actions, then write the service results to the http response.
type FineTuningAPIRouter interface { 
	CancelFineTuningJob(http.ResponseWriter, *http.Request)
	CreateFineTuningJob(http.ResponseWriter, *http.Request)
	ListFineTuningEvents(http.ResponseWriter, *http.Request)
	ListFineTuningJobCheckpoints(http.ResponseWriter, *http.Request)
	ListPaginatedFineTuningJobs(http.ResponseWriter, *http.Request)
	RetrieveFineTuningJob(http.ResponseWriter, *http.Request)
}
// ImagesAPIRouter defines the required methods for binding the api requests to a responses for the ImagesAPI
// The ImagesAPIRouter implementation should parse necessary information from the http request,
// pass the data to a ImagesAPIServicer to perform the required actions, then write the service results to the http response.
type ImagesAPIRouter interface { 
	CreateImage(http.ResponseWriter, *http.Request)
	CreateImageEdit(http.ResponseWriter, *http.Request)
	CreateImageVariation(http.ResponseWriter, *http.Request)
}
// ModelsAPIRouter defines the required methods for binding the api requests to a responses for the ModelsAPI
// The ModelsAPIRouter implementation should parse necessary information from the http request,
// pass the data to a ModelsAPIServicer to perform the required actions, then write the service results to the http response.
type ModelsAPIRouter interface { 
	DeleteModel(http.ResponseWriter, *http.Request)
	ListModels(http.ResponseWriter, *http.Request)
	RetrieveModel(http.ResponseWriter, *http.Request)
}
// ModerationsAPIRouter defines the required methods for binding the api requests to a responses for the ModerationsAPI
// The ModerationsAPIRouter implementation should parse necessary information from the http request,
// pass the data to a ModerationsAPIServicer to perform the required actions, then write the service results to the http response.
type ModerationsAPIRouter interface { 
	CreateModeration(http.ResponseWriter, *http.Request)
}


// AssistantsAPIServicer defines the api actions for the AssistantsAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type AssistantsAPIServicer interface { 
	CancelRun(context.Context, string, string) (ImplResponse, error)
	CreateAssistant(context.Context, CreateAssistantRequest) (ImplResponse, error)
	CreateAssistantFile(context.Context, string, CreateAssistantFileRequest) (ImplResponse, error)
	CreateMessage(context.Context, string, CreateMessageRequest) (ImplResponse, error)
	CreateRun(context.Context, string, CreateRunRequest) (ImplResponse, error)
	CreateThread(context.Context, CreateThreadRequest) (ImplResponse, error)
	CreateThreadAndRun(context.Context, CreateThreadAndRunRequest) (ImplResponse, error)
	DeleteAssistant(context.Context, string) (ImplResponse, error)
	DeleteAssistantFile(context.Context, string, string) (ImplResponse, error)
	DeleteThread(context.Context, string) (ImplResponse, error)
	GetAssistant(context.Context, string) (ImplResponse, error)
	GetAssistantFile(context.Context, string, string) (ImplResponse, error)
	GetMessage(context.Context, string, string) (ImplResponse, error)
	GetMessageFile(context.Context, string, string, string) (ImplResponse, error)
	GetRun(context.Context, string, string) (ImplResponse, error)
	GetRunStep(context.Context, string, string, string) (ImplResponse, error)
	GetThread(context.Context, string) (ImplResponse, error)
	ListAssistantFiles(context.Context, string, int32, string, string, string) (ImplResponse, error)
	ListAssistants(context.Context, int32, string, string, string) (ImplResponse, error)
	ListMessageFiles(context.Context, string, string, int32, string, string, string) (ImplResponse, error)
	ListMessages(context.Context, string, int32, string, string, string, string) (ImplResponse, error)
	ListRunSteps(context.Context, string, string, int32, string, string, string) (ImplResponse, error)
	ListRuns(context.Context, string, int32, string, string, string) (ImplResponse, error)
	ModifyAssistant(context.Context, string, ModifyAssistantRequest) (ImplResponse, error)
	ModifyMessage(context.Context, string, string, ModifyMessageRequest) (ImplResponse, error)
	ModifyRun(context.Context, string, string, ModifyRunRequest) (ImplResponse, error)
	ModifyThread(context.Context, string, ModifyThreadRequest) (ImplResponse, error)
	SubmitToolOuputsToRun(context.Context, string, string, SubmitToolOutputsRunRequest) (ImplResponse, error)
}


// AudioAPIServicer defines the api actions for the AudioAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type AudioAPIServicer interface { 
	CreateSpeech(context.Context, CreateSpeechRequest) (ImplResponse, error)
	CreateTranscription(context.Context, *os.File, CreateTranscriptionRequestModel, string, string, string, float32, []string) (ImplResponse, error)
	CreateTranslation(context.Context, *os.File, CreateTranscriptionRequestModel, string, string, float32) (ImplResponse, error)
}


// ChatAPIServicer defines the api actions for the ChatAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type ChatAPIServicer interface { 
	CreateChatCompletion(context.Context, CreateChatCompletionRequest) (ImplResponse, error)
}


// CompletionsAPIServicer defines the api actions for the CompletionsAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type CompletionsAPIServicer interface { 
	CreateCompletion(context.Context, CreateCompletionRequest) (ImplResponse, error)
}


// EmbeddingsAPIServicer defines the api actions for the EmbeddingsAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type EmbeddingsAPIServicer interface { 
	CreateEmbedding(context.Context, CreateEmbeddingRequest) (ImplResponse, error)
}


// FilesAPIServicer defines the api actions for the FilesAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type FilesAPIServicer interface { 
	CreateFile(context.Context, *os.File, string) (ImplResponse, error)
	DeleteFile(context.Context, string) (ImplResponse, error)
	DownloadFile(context.Context, string) (ImplResponse, error)
	ListFiles(context.Context, string) (ImplResponse, error)
	RetrieveFile(context.Context, string) (ImplResponse, error)
}


// FineTuningAPIServicer defines the api actions for the FineTuningAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type FineTuningAPIServicer interface { 
	CancelFineTuningJob(context.Context, string) (ImplResponse, error)
	CreateFineTuningJob(context.Context, CreateFineTuningJobRequest) (ImplResponse, error)
	ListFineTuningEvents(context.Context, string, string, int32) (ImplResponse, error)
	ListFineTuningJobCheckpoints(context.Context, string, string, int32) (ImplResponse, error)
	ListPaginatedFineTuningJobs(context.Context, string, int32) (ImplResponse, error)
	RetrieveFineTuningJob(context.Context, string) (ImplResponse, error)
}


// ImagesAPIServicer defines the api actions for the ImagesAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type ImagesAPIServicer interface { 
	CreateImage(context.Context, CreateImageRequest) (ImplResponse, error)
	CreateImageEdit(context.Context, *os.File, string, *os.File, *CreateImageEditRequestModel, *int32, *string, *string, string) (ImplResponse, error)
	CreateImageVariation(context.Context, *os.File, *CreateImageEditRequestModel, *int32, *string, *string, string) (ImplResponse, error)
}


// ModelsAPIServicer defines the api actions for the ModelsAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type ModelsAPIServicer interface { 
	DeleteModel(context.Context, string) (ImplResponse, error)
	ListModels(context.Context) (ImplResponse, error)
	RetrieveModel(context.Context, string) (ImplResponse, error)
}


// ModerationsAPIServicer defines the api actions for the ModerationsAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type ModerationsAPIServicer interface { 
	CreateModeration(context.Context, CreateModerationRequest) (ImplResponse, error)
}