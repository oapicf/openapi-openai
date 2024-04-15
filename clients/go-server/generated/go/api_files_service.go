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
	"os"
)

// FilesAPIService is a service that implements the logic for the FilesAPIServicer
// This service should implement the business logic for every endpoint for the FilesAPI API.
// Include any external packages or services that will be required by this service.
type FilesAPIService struct {
}

// NewFilesAPIService creates a default api service
func NewFilesAPIService() FilesAPIServicer {
	return &FilesAPIService{}
}

// CreateFile - Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports &#x60;.jsonl&#x60; files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
func (s *FilesAPIService) CreateFile(ctx context.Context, file *os.File, purpose string) (ImplResponse, error) {
	// TODO - update CreateFile with the required logic for this service method.
	// Add api_files_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, OpenAiFile{}) or use other options such as http.Ok ...
	// return Response(200, OpenAiFile{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("CreateFile method not implemented")
}

// DeleteFile - Delete a file.
func (s *FilesAPIService) DeleteFile(ctx context.Context, fileId string) (ImplResponse, error) {
	// TODO - update DeleteFile with the required logic for this service method.
	// Add api_files_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, DeleteFileResponse{}) or use other options such as http.Ok ...
	// return Response(200, DeleteFileResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("DeleteFile method not implemented")
}

// DownloadFile - Returns the contents of the specified file.
func (s *FilesAPIService) DownloadFile(ctx context.Context, fileId string) (ImplResponse, error) {
	// TODO - update DownloadFile with the required logic for this service method.
	// Add api_files_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, string{}) or use other options such as http.Ok ...
	// return Response(200, string{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("DownloadFile method not implemented")
}

// ListFiles - Returns a list of files that belong to the user&#39;s organization.
func (s *FilesAPIService) ListFiles(ctx context.Context, purpose string) (ImplResponse, error) {
	// TODO - update ListFiles with the required logic for this service method.
	// Add api_files_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, ListFilesResponse{}) or use other options such as http.Ok ...
	// return Response(200, ListFilesResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("ListFiles method not implemented")
}

// RetrieveFile - Returns information about a specific file.
func (s *FilesAPIService) RetrieveFile(ctx context.Context, fileId string) (ImplResponse, error) {
	// TODO - update RetrieveFile with the required logic for this service method.
	// Add api_files_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, OpenAiFile{}) or use other options such as http.Ok ...
	// return Response(200, OpenAiFile{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("RetrieveFile method not implemented")
}