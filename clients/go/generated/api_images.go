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


// ImagesAPIService ImagesAPI service
type ImagesAPIService service

type ApiCreateImageRequest struct {
	ctx context.Context
	ApiService *ImagesAPIService
	createImageRequest *CreateImageRequest
}

func (r ApiCreateImageRequest) CreateImageRequest(createImageRequest CreateImageRequest) ApiCreateImageRequest {
	r.createImageRequest = &createImageRequest
	return r
}

func (r ApiCreateImageRequest) Execute() (*ImagesResponse, *http.Response, error) {
	return r.ApiService.CreateImageExecute(r)
}

/*
CreateImage Creates an image given a prompt.

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return ApiCreateImageRequest
*/
func (a *ImagesAPIService) CreateImage(ctx context.Context) ApiCreateImageRequest {
	return ApiCreateImageRequest{
		ApiService: a,
		ctx: ctx,
	}
}

// Execute executes the request
//  @return ImagesResponse
func (a *ImagesAPIService) CreateImageExecute(r ApiCreateImageRequest) (*ImagesResponse, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodPost
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  *ImagesResponse
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "ImagesAPIService.CreateImage")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/images/generations"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}
	if r.createImageRequest == nil {
		return localVarReturnValue, nil, reportError("createImageRequest is required and must be specified")
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
	localVarPostBody = r.createImageRequest
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

type ApiCreateImageEditRequest struct {
	ctx context.Context
	ApiService *ImagesAPIService
	image *os.File
	prompt *string
	mask *os.File
	model *CreateImageEditRequestModel
	n *int32
	size *string
	responseFormat *string
	user *string
}

// The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask.
func (r ApiCreateImageEditRequest) Image(image *os.File) ApiCreateImageEditRequest {
	r.image = image
	return r
}

// A text description of the desired image(s). The maximum length is 1000 characters.
func (r ApiCreateImageEditRequest) Prompt(prompt string) ApiCreateImageEditRequest {
	r.prompt = &prompt
	return r
}

// An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where &#x60;image&#x60; should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as &#x60;image&#x60;.
func (r ApiCreateImageEditRequest) Mask(mask *os.File) ApiCreateImageEditRequest {
	r.mask = mask
	return r
}

func (r ApiCreateImageEditRequest) Model(model CreateImageEditRequestModel) ApiCreateImageEditRequest {
	r.model = &model
	return r
}

// The number of images to generate. Must be between 1 and 10.
func (r ApiCreateImageEditRequest) N(n int32) ApiCreateImageEditRequest {
	r.n = &n
	return r
}

// The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;.
func (r ApiCreateImageEditRequest) Size(size string) ApiCreateImageEditRequest {
	r.size = &size
	return r
}

// The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated.
func (r ApiCreateImageEditRequest) ResponseFormat(responseFormat string) ApiCreateImageEditRequest {
	r.responseFormat = &responseFormat
	return r
}

// A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
func (r ApiCreateImageEditRequest) User(user string) ApiCreateImageEditRequest {
	r.user = &user
	return r
}

func (r ApiCreateImageEditRequest) Execute() (*ImagesResponse, *http.Response, error) {
	return r.ApiService.CreateImageEditExecute(r)
}

/*
CreateImageEdit Creates an edited or extended image given an original image and a prompt.

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return ApiCreateImageEditRequest
*/
func (a *ImagesAPIService) CreateImageEdit(ctx context.Context) ApiCreateImageEditRequest {
	return ApiCreateImageEditRequest{
		ApiService: a,
		ctx: ctx,
	}
}

// Execute executes the request
//  @return ImagesResponse
func (a *ImagesAPIService) CreateImageEditExecute(r ApiCreateImageEditRequest) (*ImagesResponse, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodPost
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  *ImagesResponse
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "ImagesAPIService.CreateImageEdit")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/images/edits"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}
	if r.image == nil {
		return localVarReturnValue, nil, reportError("image is required and must be specified")
	}
	if r.prompt == nil {
		return localVarReturnValue, nil, reportError("prompt is required and must be specified")
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
	var imageLocalVarFormFileName string
	var imageLocalVarFileName     string
	var imageLocalVarFileBytes    []byte

	imageLocalVarFormFileName = "image"
	imageLocalVarFile := r.image

	if imageLocalVarFile != nil {
		fbs, _ := io.ReadAll(imageLocalVarFile)

		imageLocalVarFileBytes = fbs
		imageLocalVarFileName = imageLocalVarFile.Name()
		imageLocalVarFile.Close()
		formFiles = append(formFiles, formFile{fileBytes: imageLocalVarFileBytes, fileName: imageLocalVarFileName, formFileName: imageLocalVarFormFileName})
	}
	parameterAddToHeaderOrQuery(localVarFormParams, "prompt", r.prompt, "")
	var maskLocalVarFormFileName string
	var maskLocalVarFileName     string
	var maskLocalVarFileBytes    []byte

	maskLocalVarFormFileName = "mask"
	maskLocalVarFile := r.mask

	if maskLocalVarFile != nil {
		fbs, _ := io.ReadAll(maskLocalVarFile)

		maskLocalVarFileBytes = fbs
		maskLocalVarFileName = maskLocalVarFile.Name()
		maskLocalVarFile.Close()
		formFiles = append(formFiles, formFile{fileBytes: maskLocalVarFileBytes, fileName: maskLocalVarFileName, formFileName: maskLocalVarFormFileName})
	}
	if r.model != nil {
		paramJson, err := parameterToJson(*r.model)
		if err != nil {
			return localVarReturnValue, nil, err
		}
		localVarFormParams.Add("model", paramJson)
	}
	if r.n != nil {
		parameterAddToHeaderOrQuery(localVarFormParams, "n", r.n, "")
	}
	if r.size != nil {
		parameterAddToHeaderOrQuery(localVarFormParams, "size", r.size, "")
	}
	if r.responseFormat != nil {
		parameterAddToHeaderOrQuery(localVarFormParams, "response_format", r.responseFormat, "")
	}
	if r.user != nil {
		parameterAddToHeaderOrQuery(localVarFormParams, "user", r.user, "")
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

type ApiCreateImageVariationRequest struct {
	ctx context.Context
	ApiService *ImagesAPIService
	image *os.File
	model *CreateImageEditRequestModel
	n *int32
	responseFormat *string
	size *string
	user *string
}

// The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square.
func (r ApiCreateImageVariationRequest) Image(image *os.File) ApiCreateImageVariationRequest {
	r.image = image
	return r
}

func (r ApiCreateImageVariationRequest) Model(model CreateImageEditRequestModel) ApiCreateImageVariationRequest {
	r.model = &model
	return r
}

// The number of images to generate. Must be between 1 and 10. For &#x60;dall-e-3&#x60;, only &#x60;n&#x3D;1&#x60; is supported.
func (r ApiCreateImageVariationRequest) N(n int32) ApiCreateImageVariationRequest {
	r.n = &n
	return r
}

// The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated.
func (r ApiCreateImageVariationRequest) ResponseFormat(responseFormat string) ApiCreateImageVariationRequest {
	r.responseFormat = &responseFormat
	return r
}

// The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;.
func (r ApiCreateImageVariationRequest) Size(size string) ApiCreateImageVariationRequest {
	r.size = &size
	return r
}

// A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
func (r ApiCreateImageVariationRequest) User(user string) ApiCreateImageVariationRequest {
	r.user = &user
	return r
}

func (r ApiCreateImageVariationRequest) Execute() (*ImagesResponse, *http.Response, error) {
	return r.ApiService.CreateImageVariationExecute(r)
}

/*
CreateImageVariation Creates a variation of a given image.

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return ApiCreateImageVariationRequest
*/
func (a *ImagesAPIService) CreateImageVariation(ctx context.Context) ApiCreateImageVariationRequest {
	return ApiCreateImageVariationRequest{
		ApiService: a,
		ctx: ctx,
	}
}

// Execute executes the request
//  @return ImagesResponse
func (a *ImagesAPIService) CreateImageVariationExecute(r ApiCreateImageVariationRequest) (*ImagesResponse, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodPost
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  *ImagesResponse
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "ImagesAPIService.CreateImageVariation")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/images/variations"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}
	if r.image == nil {
		return localVarReturnValue, nil, reportError("image is required and must be specified")
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
	var imageLocalVarFormFileName string
	var imageLocalVarFileName     string
	var imageLocalVarFileBytes    []byte

	imageLocalVarFormFileName = "image"
	imageLocalVarFile := r.image

	if imageLocalVarFile != nil {
		fbs, _ := io.ReadAll(imageLocalVarFile)

		imageLocalVarFileBytes = fbs
		imageLocalVarFileName = imageLocalVarFile.Name()
		imageLocalVarFile.Close()
		formFiles = append(formFiles, formFile{fileBytes: imageLocalVarFileBytes, fileName: imageLocalVarFileName, formFileName: imageLocalVarFormFileName})
	}
	if r.model != nil {
		paramJson, err := parameterToJson(*r.model)
		if err != nil {
			return localVarReturnValue, nil, err
		}
		localVarFormParams.Add("model", paramJson)
	}
	if r.n != nil {
		parameterAddToHeaderOrQuery(localVarFormParams, "n", r.n, "")
	}
	if r.responseFormat != nil {
		parameterAddToHeaderOrQuery(localVarFormParams, "response_format", r.responseFormat, "")
	}
	if r.size != nil {
		parameterAddToHeaderOrQuery(localVarFormParams, "size", r.size, "")
	}
	if r.user != nil {
		parameterAddToHeaderOrQuery(localVarFormParams, "user", r.user, "")
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
