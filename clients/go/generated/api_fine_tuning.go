/*
OpenAI API

The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.

API version: 2.0.0
Contact: blah+oapicf@cliffano.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package openapi

import (
	"bytes"
	"context"
	"io"
	"net/http"
	"net/url"
	"strings"
)


// FineTuningAPIService FineTuningAPI service
type FineTuningAPIService service

type ApiCancelFineTuningJobRequest struct {
	ctx context.Context
	ApiService *FineTuningAPIService
	fineTuningJobId string
}

func (r ApiCancelFineTuningJobRequest) Execute() (*FineTuningJob, *http.Response, error) {
	return r.ApiService.CancelFineTuningJobExecute(r)
}

/*
CancelFineTuningJob Immediately cancel a fine-tune job. 

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @param fineTuningJobId The ID of the fine-tuning job to cancel. 
 @return ApiCancelFineTuningJobRequest
*/
func (a *FineTuningAPIService) CancelFineTuningJob(ctx context.Context, fineTuningJobId string) ApiCancelFineTuningJobRequest {
	return ApiCancelFineTuningJobRequest{
		ApiService: a,
		ctx: ctx,
		fineTuningJobId: fineTuningJobId,
	}
}

// Execute executes the request
//  @return FineTuningJob
func (a *FineTuningAPIService) CancelFineTuningJobExecute(r ApiCancelFineTuningJobRequest) (*FineTuningJob, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodPost
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  *FineTuningJob
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "FineTuningAPIService.CancelFineTuningJob")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/fine_tuning/jobs/{fine_tuning_job_id}/cancel"
	localVarPath = strings.Replace(localVarPath, "{"+"fine_tuning_job_id"+"}", url.PathEscape(parameterValueToString(r.fineTuningJobId, "fineTuningJobId")), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	// to determine the Content-Type header
	localVarHTTPContentTypes := []string{}

	// set Content-Type header
	localVarHTTPContentType := selectHeaderContentType(localVarHTTPContentTypes)
	if localVarHTTPContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHTTPContentType
	}

	// to determine the Accept header
	localVarHTTPHeaderAccepts := []string{"application/json"}

	// set Accept header
	localVarHTTPHeaderAccept := selectHeaderAccept(localVarHTTPHeaderAccepts)
	if localVarHTTPHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHTTPHeaderAccept
	}
	req, err := a.client.prepareRequest(r.ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, formFiles)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(req)
	if err != nil || localVarHTTPResponse == nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	localVarBody, err := io.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	localVarHTTPResponse.Body = io.NopCloser(bytes.NewBuffer(localVarBody))
	if err != nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	err = a.client.decode(&localVarReturnValue, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
	if err != nil {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: err.Error(),
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	return localVarReturnValue, localVarHTTPResponse, nil
}

type ApiCreateFineTuningJobRequest struct {
	ctx context.Context
	ApiService *FineTuningAPIService
	createFineTuningJobRequest *CreateFineTuningJobRequest
}

func (r ApiCreateFineTuningJobRequest) CreateFineTuningJobRequest(createFineTuningJobRequest CreateFineTuningJobRequest) ApiCreateFineTuningJobRequest {
	r.createFineTuningJobRequest = &createFineTuningJobRequest
	return r
}

func (r ApiCreateFineTuningJobRequest) Execute() (*FineTuningJob, *http.Response, error) {
	return r.ApiService.CreateFineTuningJobExecute(r)
}

/*
CreateFineTuningJob Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return ApiCreateFineTuningJobRequest
*/
func (a *FineTuningAPIService) CreateFineTuningJob(ctx context.Context) ApiCreateFineTuningJobRequest {
	return ApiCreateFineTuningJobRequest{
		ApiService: a,
		ctx: ctx,
	}
}

// Execute executes the request
//  @return FineTuningJob
func (a *FineTuningAPIService) CreateFineTuningJobExecute(r ApiCreateFineTuningJobRequest) (*FineTuningJob, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodPost
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  *FineTuningJob
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "FineTuningAPIService.CreateFineTuningJob")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/fine_tuning/jobs"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}
	if r.createFineTuningJobRequest == nil {
		return localVarReturnValue, nil, reportError("createFineTuningJobRequest is required and must be specified")
	}

	// to determine the Content-Type header
	localVarHTTPContentTypes := []string{"application/json"}

	// set Content-Type header
	localVarHTTPContentType := selectHeaderContentType(localVarHTTPContentTypes)
	if localVarHTTPContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHTTPContentType
	}

	// to determine the Accept header
	localVarHTTPHeaderAccepts := []string{"application/json"}

	// set Accept header
	localVarHTTPHeaderAccept := selectHeaderAccept(localVarHTTPHeaderAccepts)
	if localVarHTTPHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHTTPHeaderAccept
	}
	// body params
	localVarPostBody = r.createFineTuningJobRequest
	req, err := a.client.prepareRequest(r.ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, formFiles)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(req)
	if err != nil || localVarHTTPResponse == nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	localVarBody, err := io.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	localVarHTTPResponse.Body = io.NopCloser(bytes.NewBuffer(localVarBody))
	if err != nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	err = a.client.decode(&localVarReturnValue, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
	if err != nil {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: err.Error(),
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	return localVarReturnValue, localVarHTTPResponse, nil
}

type ApiListFineTuningEventsRequest struct {
	ctx context.Context
	ApiService *FineTuningAPIService
	fineTuningJobId string
	after *string
	limit *int32
}

// Identifier for the last event from the previous pagination request.
func (r ApiListFineTuningEventsRequest) After(after string) ApiListFineTuningEventsRequest {
	r.after = &after
	return r
}

// Number of events to retrieve.
func (r ApiListFineTuningEventsRequest) Limit(limit int32) ApiListFineTuningEventsRequest {
	r.limit = &limit
	return r
}

func (r ApiListFineTuningEventsRequest) Execute() (*ListFineTuningJobEventsResponse, *http.Response, error) {
	return r.ApiService.ListFineTuningEventsExecute(r)
}

/*
ListFineTuningEvents Get status updates for a fine-tuning job. 

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @param fineTuningJobId The ID of the fine-tuning job to get events for. 
 @return ApiListFineTuningEventsRequest
*/
func (a *FineTuningAPIService) ListFineTuningEvents(ctx context.Context, fineTuningJobId string) ApiListFineTuningEventsRequest {
	return ApiListFineTuningEventsRequest{
		ApiService: a,
		ctx: ctx,
		fineTuningJobId: fineTuningJobId,
	}
}

// Execute executes the request
//  @return ListFineTuningJobEventsResponse
func (a *FineTuningAPIService) ListFineTuningEventsExecute(r ApiListFineTuningEventsRequest) (*ListFineTuningJobEventsResponse, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodGet
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  *ListFineTuningJobEventsResponse
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "FineTuningAPIService.ListFineTuningEvents")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/fine_tuning/jobs/{fine_tuning_job_id}/events"
	localVarPath = strings.Replace(localVarPath, "{"+"fine_tuning_job_id"+"}", url.PathEscape(parameterValueToString(r.fineTuningJobId, "fineTuningJobId")), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if r.after != nil {
		parameterAddToHeaderOrQuery(localVarQueryParams, "after", r.after, "form", "")
	}
	if r.limit != nil {
		parameterAddToHeaderOrQuery(localVarQueryParams, "limit", r.limit, "form", "")
	} else {
		var defaultValue int32 = 20
		r.limit = &defaultValue
	}
	// to determine the Content-Type header
	localVarHTTPContentTypes := []string{}

	// set Content-Type header
	localVarHTTPContentType := selectHeaderContentType(localVarHTTPContentTypes)
	if localVarHTTPContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHTTPContentType
	}

	// to determine the Accept header
	localVarHTTPHeaderAccepts := []string{"application/json"}

	// set Accept header
	localVarHTTPHeaderAccept := selectHeaderAccept(localVarHTTPHeaderAccepts)
	if localVarHTTPHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHTTPHeaderAccept
	}
	req, err := a.client.prepareRequest(r.ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, formFiles)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(req)
	if err != nil || localVarHTTPResponse == nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	localVarBody, err := io.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	localVarHTTPResponse.Body = io.NopCloser(bytes.NewBuffer(localVarBody))
	if err != nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	err = a.client.decode(&localVarReturnValue, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
	if err != nil {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: err.Error(),
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	return localVarReturnValue, localVarHTTPResponse, nil
}

type ApiListFineTuningJobCheckpointsRequest struct {
	ctx context.Context
	ApiService *FineTuningAPIService
	fineTuningJobId string
	after *string
	limit *int32
}

// Identifier for the last checkpoint ID from the previous pagination request.
func (r ApiListFineTuningJobCheckpointsRequest) After(after string) ApiListFineTuningJobCheckpointsRequest {
	r.after = &after
	return r
}

// Number of checkpoints to retrieve.
func (r ApiListFineTuningJobCheckpointsRequest) Limit(limit int32) ApiListFineTuningJobCheckpointsRequest {
	r.limit = &limit
	return r
}

func (r ApiListFineTuningJobCheckpointsRequest) Execute() (*ListFineTuningJobCheckpointsResponse, *http.Response, error) {
	return r.ApiService.ListFineTuningJobCheckpointsExecute(r)
}

/*
ListFineTuningJobCheckpoints List checkpoints for a fine-tuning job. 

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @param fineTuningJobId The ID of the fine-tuning job to get checkpoints for. 
 @return ApiListFineTuningJobCheckpointsRequest
*/
func (a *FineTuningAPIService) ListFineTuningJobCheckpoints(ctx context.Context, fineTuningJobId string) ApiListFineTuningJobCheckpointsRequest {
	return ApiListFineTuningJobCheckpointsRequest{
		ApiService: a,
		ctx: ctx,
		fineTuningJobId: fineTuningJobId,
	}
}

// Execute executes the request
//  @return ListFineTuningJobCheckpointsResponse
func (a *FineTuningAPIService) ListFineTuningJobCheckpointsExecute(r ApiListFineTuningJobCheckpointsRequest) (*ListFineTuningJobCheckpointsResponse, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodGet
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  *ListFineTuningJobCheckpointsResponse
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "FineTuningAPIService.ListFineTuningJobCheckpoints")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/fine_tuning/jobs/{fine_tuning_job_id}/checkpoints"
	localVarPath = strings.Replace(localVarPath, "{"+"fine_tuning_job_id"+"}", url.PathEscape(parameterValueToString(r.fineTuningJobId, "fineTuningJobId")), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if r.after != nil {
		parameterAddToHeaderOrQuery(localVarQueryParams, "after", r.after, "form", "")
	}
	if r.limit != nil {
		parameterAddToHeaderOrQuery(localVarQueryParams, "limit", r.limit, "form", "")
	} else {
		var defaultValue int32 = 10
		r.limit = &defaultValue
	}
	// to determine the Content-Type header
	localVarHTTPContentTypes := []string{}

	// set Content-Type header
	localVarHTTPContentType := selectHeaderContentType(localVarHTTPContentTypes)
	if localVarHTTPContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHTTPContentType
	}

	// to determine the Accept header
	localVarHTTPHeaderAccepts := []string{"application/json"}

	// set Accept header
	localVarHTTPHeaderAccept := selectHeaderAccept(localVarHTTPHeaderAccepts)
	if localVarHTTPHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHTTPHeaderAccept
	}
	req, err := a.client.prepareRequest(r.ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, formFiles)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(req)
	if err != nil || localVarHTTPResponse == nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	localVarBody, err := io.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	localVarHTTPResponse.Body = io.NopCloser(bytes.NewBuffer(localVarBody))
	if err != nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	err = a.client.decode(&localVarReturnValue, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
	if err != nil {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: err.Error(),
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	return localVarReturnValue, localVarHTTPResponse, nil
}

type ApiListPaginatedFineTuningJobsRequest struct {
	ctx context.Context
	ApiService *FineTuningAPIService
	after *string
	limit *int32
}

// Identifier for the last job from the previous pagination request.
func (r ApiListPaginatedFineTuningJobsRequest) After(after string) ApiListPaginatedFineTuningJobsRequest {
	r.after = &after
	return r
}

// Number of fine-tuning jobs to retrieve.
func (r ApiListPaginatedFineTuningJobsRequest) Limit(limit int32) ApiListPaginatedFineTuningJobsRequest {
	r.limit = &limit
	return r
}

func (r ApiListPaginatedFineTuningJobsRequest) Execute() (*ListPaginatedFineTuningJobsResponse, *http.Response, error) {
	return r.ApiService.ListPaginatedFineTuningJobsExecute(r)
}

/*
ListPaginatedFineTuningJobs List your organization's fine-tuning jobs 

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return ApiListPaginatedFineTuningJobsRequest
*/
func (a *FineTuningAPIService) ListPaginatedFineTuningJobs(ctx context.Context) ApiListPaginatedFineTuningJobsRequest {
	return ApiListPaginatedFineTuningJobsRequest{
		ApiService: a,
		ctx: ctx,
	}
}

// Execute executes the request
//  @return ListPaginatedFineTuningJobsResponse
func (a *FineTuningAPIService) ListPaginatedFineTuningJobsExecute(r ApiListPaginatedFineTuningJobsRequest) (*ListPaginatedFineTuningJobsResponse, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodGet
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  *ListPaginatedFineTuningJobsResponse
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "FineTuningAPIService.ListPaginatedFineTuningJobs")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/fine_tuning/jobs"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if r.after != nil {
		parameterAddToHeaderOrQuery(localVarQueryParams, "after", r.after, "form", "")
	}
	if r.limit != nil {
		parameterAddToHeaderOrQuery(localVarQueryParams, "limit", r.limit, "form", "")
	} else {
		var defaultValue int32 = 20
		r.limit = &defaultValue
	}
	// to determine the Content-Type header
	localVarHTTPContentTypes := []string{}

	// set Content-Type header
	localVarHTTPContentType := selectHeaderContentType(localVarHTTPContentTypes)
	if localVarHTTPContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHTTPContentType
	}

	// to determine the Accept header
	localVarHTTPHeaderAccepts := []string{"application/json"}

	// set Accept header
	localVarHTTPHeaderAccept := selectHeaderAccept(localVarHTTPHeaderAccepts)
	if localVarHTTPHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHTTPHeaderAccept
	}
	req, err := a.client.prepareRequest(r.ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, formFiles)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(req)
	if err != nil || localVarHTTPResponse == nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	localVarBody, err := io.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	localVarHTTPResponse.Body = io.NopCloser(bytes.NewBuffer(localVarBody))
	if err != nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	err = a.client.decode(&localVarReturnValue, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
	if err != nil {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: err.Error(),
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	return localVarReturnValue, localVarHTTPResponse, nil
}

type ApiRetrieveFineTuningJobRequest struct {
	ctx context.Context
	ApiService *FineTuningAPIService
	fineTuningJobId string
}

func (r ApiRetrieveFineTuningJobRequest) Execute() (*FineTuningJob, *http.Response, error) {
	return r.ApiService.RetrieveFineTuningJobExecute(r)
}

/*
RetrieveFineTuningJob Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @param fineTuningJobId The ID of the fine-tuning job. 
 @return ApiRetrieveFineTuningJobRequest
*/
func (a *FineTuningAPIService) RetrieveFineTuningJob(ctx context.Context, fineTuningJobId string) ApiRetrieveFineTuningJobRequest {
	return ApiRetrieveFineTuningJobRequest{
		ApiService: a,
		ctx: ctx,
		fineTuningJobId: fineTuningJobId,
	}
}

// Execute executes the request
//  @return FineTuningJob
func (a *FineTuningAPIService) RetrieveFineTuningJobExecute(r ApiRetrieveFineTuningJobRequest) (*FineTuningJob, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodGet
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  *FineTuningJob
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "FineTuningAPIService.RetrieveFineTuningJob")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/fine_tuning/jobs/{fine_tuning_job_id}"
	localVarPath = strings.Replace(localVarPath, "{"+"fine_tuning_job_id"+"}", url.PathEscape(parameterValueToString(r.fineTuningJobId, "fineTuningJobId")), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	// to determine the Content-Type header
	localVarHTTPContentTypes := []string{}

	// set Content-Type header
	localVarHTTPContentType := selectHeaderContentType(localVarHTTPContentTypes)
	if localVarHTTPContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHTTPContentType
	}

	// to determine the Accept header
	localVarHTTPHeaderAccepts := []string{"application/json"}

	// set Accept header
	localVarHTTPHeaderAccept := selectHeaderAccept(localVarHTTPHeaderAccepts)
	if localVarHTTPHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHTTPHeaderAccept
	}
	req, err := a.client.prepareRequest(r.ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, formFiles)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(req)
	if err != nil || localVarHTTPResponse == nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	localVarBody, err := io.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	localVarHTTPResponse.Body = io.NopCloser(bytes.NewBuffer(localVarBody))
	if err != nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	err = a.client.decode(&localVarReturnValue, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
	if err != nil {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: err.Error(),
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	return localVarReturnValue, localVarHTTPResponse, nil
}
