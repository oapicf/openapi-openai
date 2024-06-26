/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * OpenAPI spec version: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

#pragma once

#include "CoreMinimal.h"
#include "OpenAPIBaseModel.h"

namespace OpenAPI
{

class OPENAPI_API OpenAPIImagesApi
{
public:
	OpenAPIImagesApi();
	~OpenAPIImagesApi();

	/* Sets the URL Endpoint.
	* Note: several fallback endpoints can be configured in request retry policies, see Request::SetShouldRetry */
	void SetURL(const FString& Url);

	/* Adds global header params to all requests */
	void AddHeaderParam(const FString& Key, const FString& Value);
	void ClearHeaderParams();

	/* Sets the retry manager to the user-defined retry manager. User must manage the lifetime of the retry manager.
	* If no retry manager is specified and a request needs retries, a default retry manager will be used.
	* See also: Request::SetShouldRetry */
	void SetHttpRetryManager(FHttpRetrySystem::FManager& RetryManager);
	FHttpRetrySystem::FManager& GetHttpRetryManager();

	class CreateImageRequest;
	class CreateImageResponse;
	class CreateImageEditRequest;
	class CreateImageEditResponse;
	class CreateImageVariationRequest;
	class CreateImageVariationResponse;
	
    DECLARE_DELEGATE_OneParam(FCreateImageDelegate, const CreateImageResponse&);
    DECLARE_DELEGATE_OneParam(FCreateImageEditDelegate, const CreateImageEditResponse&);
    DECLARE_DELEGATE_OneParam(FCreateImageVariationDelegate, const CreateImageVariationResponse&);
    
    FHttpRequestPtr CreateImage(const CreateImageRequest& Request, const FCreateImageDelegate& Delegate = FCreateImageDelegate()) const;
    FHttpRequestPtr CreateImageEdit(const CreateImageEditRequest& Request, const FCreateImageEditDelegate& Delegate = FCreateImageEditDelegate()) const;
    FHttpRequestPtr CreateImageVariation(const CreateImageVariationRequest& Request, const FCreateImageVariationDelegate& Delegate = FCreateImageVariationDelegate()) const;
    
private:
    void OnCreateImageResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FCreateImageDelegate Delegate) const;
    void OnCreateImageEditResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FCreateImageEditDelegate Delegate) const;
    void OnCreateImageVariationResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FCreateImageVariationDelegate Delegate) const;
    
	FHttpRequestRef CreateHttpRequest(const Request& Request) const;
	bool IsValid() const;
	void HandleResponse(FHttpResponsePtr HttpResponse, bool bSucceeded, Response& InOutResponse) const;

	FString Url;
	TMap<FString,FString> AdditionalHeaderParams;
	mutable FHttpRetrySystem::FManager* RetryManager = nullptr;
	mutable TUniquePtr<HttpRetryManager> DefaultRetryManager;
};

}
