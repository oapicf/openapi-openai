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
	"os"
)


// AudioAPIService AudioAPI service
type AudioAPIService service

type ApiCreateSpeechRequest struct {
	ctx context.Context
	ApiService *AudioAPIService
	createSpeechRequest *CreateSpeechRequest
}

func (r ApiCreateSpeechRequest) CreateSpeechRequest(createSpeechRequest CreateSpeechRequest) ApiCreateSpeechRequest {
	r.createSpeechRequest = &createSpeechRequest
	return r
}

func (r ApiCreateSpeechRequest) Execute() (*os.File, *http.Response, error) {
	return r.ApiService.CreateSpeechExecute(r)
}

/*
CreateSpeech Generates audio from the input text.

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return ApiCreateSpeechRequest
*/
func (a *AudioAPIService) CreateSpeech(ctx context.Context) ApiCreateSpeechRequest {
	return ApiCreateSpeechRequest{
		ApiService: a,
		ctx: ctx,
	}
}

// Execute executes the request
//  @return *os.File
func (a *AudioAPIService) CreateSpeechExecute(r ApiCreateSpeechRequest) (*os.File, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodPost
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  *os.File
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "AudioAPIService.CreateSpeech")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/audio/speech"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}
	if r.createSpeechRequest == nil {
		return localVarReturnValue, nil, reportError("createSpeechRequest is required and must be specified")
	}

	// to determine the Content-Type header
	localVarHTTPContentTypes := []string{"application/json"}

	// set Content-Type header
	localVarHTTPContentType := selectHeaderContentType(localVarHTTPContentTypes)
	if localVarHTTPContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHTTPContentType
	}

	// to determine the Accept header
	localVarHTTPHeaderAccepts := []string{"application/octet-stream"}

	// set Accept header
	localVarHTTPHeaderAccept := selectHeaderAccept(localVarHTTPHeaderAccepts)
	if localVarHTTPHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHTTPHeaderAccept
	}
	// body params
	localVarPostBody = r.createSpeechRequest
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

type ApiCreateTranscriptionRequest struct {
	ctx context.Context
	ApiService *AudioAPIService
	file *os.File
	model *CreateTranscriptionRequestModel
	language *string
	prompt *string
	responseFormat *string
	temperature *float32
	timestampGranularities *[]string
}

// The audio file object (not file name) to transcribe, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. 
func (r ApiCreateTranscriptionRequest) File(file *os.File) ApiCreateTranscriptionRequest {
	r.file = file
	return r
}

func (r ApiCreateTranscriptionRequest) Model(model CreateTranscriptionRequestModel) ApiCreateTranscriptionRequest {
	r.model = &model
	return r
}

// The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency. 
func (r ApiCreateTranscriptionRequest) Language(language string) ApiCreateTranscriptionRequest {
	r.language = &language
	return r
}

// An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language. 
func (r ApiCreateTranscriptionRequest) Prompt(prompt string) ApiCreateTranscriptionRequest {
	r.prompt = &prompt
	return r
}

// The format of the transcript output, in one of these options: &#x60;json&#x60;, &#x60;text&#x60;, &#x60;srt&#x60;, &#x60;verbose_json&#x60;, or &#x60;vtt&#x60;. 
func (r ApiCreateTranscriptionRequest) ResponseFormat(responseFormat string) ApiCreateTranscriptionRequest {
	r.responseFormat = &responseFormat
	return r
}

// The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. 
func (r ApiCreateTranscriptionRequest) Temperature(temperature float32) ApiCreateTranscriptionRequest {
	r.temperature = &temperature
	return r
}

// The timestamp granularities to populate for this transcription. &#x60;response_format&#x60; must be set &#x60;verbose_json&#x60; to use timestamp granularities. Either or both of these options are supported: &#x60;word&#x60;, or &#x60;segment&#x60;. Note: There is no additional latency for segment timestamps, but generating word timestamps incurs additional latency. 
func (r ApiCreateTranscriptionRequest) TimestampGranularities(timestampGranularities []string) ApiCreateTranscriptionRequest {
	r.timestampGranularities = &timestampGranularities
	return r
}

func (r ApiCreateTranscriptionRequest) Execute() (*CreateTranscription200Response, *http.Response, error) {
	return r.ApiService.CreateTranscriptionExecute(r)
}

/*
CreateTranscription Transcribes audio into the input language.

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return ApiCreateTranscriptionRequest
*/
func (a *AudioAPIService) CreateTranscription(ctx context.Context) ApiCreateTranscriptionRequest {
	return ApiCreateTranscriptionRequest{
		ApiService: a,
		ctx: ctx,
	}
}

// Execute executes the request
//  @return CreateTranscription200Response
func (a *AudioAPIService) CreateTranscriptionExecute(r ApiCreateTranscriptionRequest) (*CreateTranscription200Response, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodPost
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  *CreateTranscription200Response
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "AudioAPIService.CreateTranscription")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/audio/transcriptions"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}
	if r.file == nil {
		return localVarReturnValue, nil, reportError("file is required and must be specified")
	}
	if r.model == nil {
		return localVarReturnValue, nil, reportError("model is required and must be specified")
	}

	// to determine the Content-Type header
	localVarHTTPContentTypes := []string{"multipart/form-data"}

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
	var fileLocalVarFormFileName string
	var fileLocalVarFileName     string
	var fileLocalVarFileBytes    []byte

	fileLocalVarFormFileName = "file"
	fileLocalVarFile := r.file

	if fileLocalVarFile != nil {
		fbs, _ := io.ReadAll(fileLocalVarFile)

		fileLocalVarFileBytes = fbs
		fileLocalVarFileName = fileLocalVarFile.Name()
		fileLocalVarFile.Close()
		formFiles = append(formFiles, formFile{fileBytes: fileLocalVarFileBytes, fileName: fileLocalVarFileName, formFileName: fileLocalVarFormFileName})
	}
	parameterAddToHeaderOrQuery(localVarFormParams, "model", r.model, "", "")
	if r.language != nil {
		parameterAddToHeaderOrQuery(localVarFormParams, "language", r.language, "", "")
	}
	if r.prompt != nil {
		parameterAddToHeaderOrQuery(localVarFormParams, "prompt", r.prompt, "", "")
	}
	if r.responseFormat != nil {
		parameterAddToHeaderOrQuery(localVarFormParams, "response_format", r.responseFormat, "", "")
	}
	if r.temperature != nil {
		parameterAddToHeaderOrQuery(localVarFormParams, "temperature", r.temperature, "", "")
	}
	if r.timestampGranularities != nil {
		parameterAddToHeaderOrQuery(localVarFormParams, "timestamp_granularities[]", r.timestampGranularities, "", "csv")
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

type ApiCreateTranslationRequest struct {
	ctx context.Context
	ApiService *AudioAPIService
	file *os.File
	model *CreateTranscriptionRequestModel
	prompt *string
	responseFormat *string
	temperature *float32
}

// The audio file object (not file name) translate, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. 
func (r ApiCreateTranslationRequest) File(file *os.File) ApiCreateTranslationRequest {
	r.file = file
	return r
}

func (r ApiCreateTranslationRequest) Model(model CreateTranscriptionRequestModel) ApiCreateTranslationRequest {
	r.model = &model
	return r
}

// An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English. 
func (r ApiCreateTranslationRequest) Prompt(prompt string) ApiCreateTranslationRequest {
	r.prompt = &prompt
	return r
}

// The format of the transcript output, in one of these options: &#x60;json&#x60;, &#x60;text&#x60;, &#x60;srt&#x60;, &#x60;verbose_json&#x60;, or &#x60;vtt&#x60;. 
func (r ApiCreateTranslationRequest) ResponseFormat(responseFormat string) ApiCreateTranslationRequest {
	r.responseFormat = &responseFormat
	return r
}

// The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. 
func (r ApiCreateTranslationRequest) Temperature(temperature float32) ApiCreateTranslationRequest {
	r.temperature = &temperature
	return r
}

func (r ApiCreateTranslationRequest) Execute() (*CreateTranslation200Response, *http.Response, error) {
	return r.ApiService.CreateTranslationExecute(r)
}

/*
CreateTranslation Translates audio into English.

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return ApiCreateTranslationRequest
*/
func (a *AudioAPIService) CreateTranslation(ctx context.Context) ApiCreateTranslationRequest {
	return ApiCreateTranslationRequest{
		ApiService: a,
		ctx: ctx,
	}
}

// Execute executes the request
//  @return CreateTranslation200Response
func (a *AudioAPIService) CreateTranslationExecute(r ApiCreateTranslationRequest) (*CreateTranslation200Response, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodPost
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  *CreateTranslation200Response
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "AudioAPIService.CreateTranslation")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/audio/translations"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}
	if r.file == nil {
		return localVarReturnValue, nil, reportError("file is required and must be specified")
	}
	if r.model == nil {
		return localVarReturnValue, nil, reportError("model is required and must be specified")
	}

	// to determine the Content-Type header
	localVarHTTPContentTypes := []string{"multipart/form-data"}

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
	var fileLocalVarFormFileName string
	var fileLocalVarFileName     string
	var fileLocalVarFileBytes    []byte

	fileLocalVarFormFileName = "file"
	fileLocalVarFile := r.file

	if fileLocalVarFile != nil {
		fbs, _ := io.ReadAll(fileLocalVarFile)

		fileLocalVarFileBytes = fbs
		fileLocalVarFileName = fileLocalVarFile.Name()
		fileLocalVarFile.Close()
		formFiles = append(formFiles, formFile{fileBytes: fileLocalVarFileBytes, fileName: fileLocalVarFileName, formFileName: fileLocalVarFormFileName})
	}
	parameterAddToHeaderOrQuery(localVarFormParams, "model", r.model, "", "")
	if r.prompt != nil {
		parameterAddToHeaderOrQuery(localVarFormParams, "prompt", r.prompt, "", "")
	}
	if r.responseFormat != nil {
		parameterAddToHeaderOrQuery(localVarFormParams, "response_format", r.responseFormat, "", "")
	}
	if r.temperature != nil {
		parameterAddToHeaderOrQuery(localVarFormParams, "temperature", r.temperature, "", "")
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
