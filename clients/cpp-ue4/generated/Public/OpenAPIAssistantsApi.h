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

class OPENAPI_API OpenAPIAssistantsApi
{
public:
	OpenAPIAssistantsApi();
	~OpenAPIAssistantsApi();

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

	class CancelRunRequest;
	class CancelRunResponse;
	class CreateAssistantRequest;
	class CreateAssistantResponse;
	class CreateAssistantFileRequest;
	class CreateAssistantFileResponse;
	class CreateMessageRequest;
	class CreateMessageResponse;
	class CreateRunRequest;
	class CreateRunResponse;
	class CreateThreadRequest;
	class CreateThreadResponse;
	class CreateThreadAndRunRequest;
	class CreateThreadAndRunResponse;
	class DeleteAssistantRequest;
	class DeleteAssistantResponse;
	class DeleteAssistantFileRequest;
	class DeleteAssistantFileResponse;
	class DeleteThreadRequest;
	class DeleteThreadResponse;
	class GetAssistantRequest;
	class GetAssistantResponse;
	class GetAssistantFileRequest;
	class GetAssistantFileResponse;
	class GetMessageRequest;
	class GetMessageResponse;
	class GetMessageFileRequest;
	class GetMessageFileResponse;
	class GetRunRequest;
	class GetRunResponse;
	class GetRunStepRequest;
	class GetRunStepResponse;
	class GetThreadRequest;
	class GetThreadResponse;
	class ListAssistantFilesRequest;
	class ListAssistantFilesResponse;
	class ListAssistantsRequest;
	class ListAssistantsResponse;
	class ListMessageFilesRequest;
	class ListMessageFilesResponse;
	class ListMessagesRequest;
	class ListMessagesResponse;
	class ListRunStepsRequest;
	class ListRunStepsResponse;
	class ListRunsRequest;
	class ListRunsResponse;
	class ModifyAssistantRequest;
	class ModifyAssistantResponse;
	class ModifyMessageRequest;
	class ModifyMessageResponse;
	class ModifyRunRequest;
	class ModifyRunResponse;
	class ModifyThreadRequest;
	class ModifyThreadResponse;
	class SubmitToolOuputsToRunRequest;
	class SubmitToolOuputsToRunResponse;
	
    DECLARE_DELEGATE_OneParam(FCancelRunDelegate, const CancelRunResponse&);
    DECLARE_DELEGATE_OneParam(FCreateAssistantDelegate, const CreateAssistantResponse&);
    DECLARE_DELEGATE_OneParam(FCreateAssistantFileDelegate, const CreateAssistantFileResponse&);
    DECLARE_DELEGATE_OneParam(FCreateMessageDelegate, const CreateMessageResponse&);
    DECLARE_DELEGATE_OneParam(FCreateRunDelegate, const CreateRunResponse&);
    DECLARE_DELEGATE_OneParam(FCreateThreadDelegate, const CreateThreadResponse&);
    DECLARE_DELEGATE_OneParam(FCreateThreadAndRunDelegate, const CreateThreadAndRunResponse&);
    DECLARE_DELEGATE_OneParam(FDeleteAssistantDelegate, const DeleteAssistantResponse&);
    DECLARE_DELEGATE_OneParam(FDeleteAssistantFileDelegate, const DeleteAssistantFileResponse&);
    DECLARE_DELEGATE_OneParam(FDeleteThreadDelegate, const DeleteThreadResponse&);
    DECLARE_DELEGATE_OneParam(FGetAssistantDelegate, const GetAssistantResponse&);
    DECLARE_DELEGATE_OneParam(FGetAssistantFileDelegate, const GetAssistantFileResponse&);
    DECLARE_DELEGATE_OneParam(FGetMessageDelegate, const GetMessageResponse&);
    DECLARE_DELEGATE_OneParam(FGetMessageFileDelegate, const GetMessageFileResponse&);
    DECLARE_DELEGATE_OneParam(FGetRunDelegate, const GetRunResponse&);
    DECLARE_DELEGATE_OneParam(FGetRunStepDelegate, const GetRunStepResponse&);
    DECLARE_DELEGATE_OneParam(FGetThreadDelegate, const GetThreadResponse&);
    DECLARE_DELEGATE_OneParam(FListAssistantFilesDelegate, const ListAssistantFilesResponse&);
    DECLARE_DELEGATE_OneParam(FListAssistantsDelegate, const ListAssistantsResponse&);
    DECLARE_DELEGATE_OneParam(FListMessageFilesDelegate, const ListMessageFilesResponse&);
    DECLARE_DELEGATE_OneParam(FListMessagesDelegate, const ListMessagesResponse&);
    DECLARE_DELEGATE_OneParam(FListRunStepsDelegate, const ListRunStepsResponse&);
    DECLARE_DELEGATE_OneParam(FListRunsDelegate, const ListRunsResponse&);
    DECLARE_DELEGATE_OneParam(FModifyAssistantDelegate, const ModifyAssistantResponse&);
    DECLARE_DELEGATE_OneParam(FModifyMessageDelegate, const ModifyMessageResponse&);
    DECLARE_DELEGATE_OneParam(FModifyRunDelegate, const ModifyRunResponse&);
    DECLARE_DELEGATE_OneParam(FModifyThreadDelegate, const ModifyThreadResponse&);
    DECLARE_DELEGATE_OneParam(FSubmitToolOuputsToRunDelegate, const SubmitToolOuputsToRunResponse&);
    
    FHttpRequestPtr CancelRun(const CancelRunRequest& Request, const FCancelRunDelegate& Delegate = FCancelRunDelegate()) const;
    FHttpRequestPtr CreateAssistant(const CreateAssistantRequest& Request, const FCreateAssistantDelegate& Delegate = FCreateAssistantDelegate()) const;
    FHttpRequestPtr CreateAssistantFile(const CreateAssistantFileRequest& Request, const FCreateAssistantFileDelegate& Delegate = FCreateAssistantFileDelegate()) const;
    FHttpRequestPtr CreateMessage(const CreateMessageRequest& Request, const FCreateMessageDelegate& Delegate = FCreateMessageDelegate()) const;
    FHttpRequestPtr CreateRun(const CreateRunRequest& Request, const FCreateRunDelegate& Delegate = FCreateRunDelegate()) const;
    FHttpRequestPtr CreateThread(const CreateThreadRequest& Request, const FCreateThreadDelegate& Delegate = FCreateThreadDelegate()) const;
    FHttpRequestPtr CreateThreadAndRun(const CreateThreadAndRunRequest& Request, const FCreateThreadAndRunDelegate& Delegate = FCreateThreadAndRunDelegate()) const;
    FHttpRequestPtr DeleteAssistant(const DeleteAssistantRequest& Request, const FDeleteAssistantDelegate& Delegate = FDeleteAssistantDelegate()) const;
    FHttpRequestPtr DeleteAssistantFile(const DeleteAssistantFileRequest& Request, const FDeleteAssistantFileDelegate& Delegate = FDeleteAssistantFileDelegate()) const;
    FHttpRequestPtr DeleteThread(const DeleteThreadRequest& Request, const FDeleteThreadDelegate& Delegate = FDeleteThreadDelegate()) const;
    FHttpRequestPtr GetAssistant(const GetAssistantRequest& Request, const FGetAssistantDelegate& Delegate = FGetAssistantDelegate()) const;
    FHttpRequestPtr GetAssistantFile(const GetAssistantFileRequest& Request, const FGetAssistantFileDelegate& Delegate = FGetAssistantFileDelegate()) const;
    FHttpRequestPtr GetMessage(const GetMessageRequest& Request, const FGetMessageDelegate& Delegate = FGetMessageDelegate()) const;
    FHttpRequestPtr GetMessageFile(const GetMessageFileRequest& Request, const FGetMessageFileDelegate& Delegate = FGetMessageFileDelegate()) const;
    FHttpRequestPtr GetRun(const GetRunRequest& Request, const FGetRunDelegate& Delegate = FGetRunDelegate()) const;
    FHttpRequestPtr GetRunStep(const GetRunStepRequest& Request, const FGetRunStepDelegate& Delegate = FGetRunStepDelegate()) const;
    FHttpRequestPtr GetThread(const GetThreadRequest& Request, const FGetThreadDelegate& Delegate = FGetThreadDelegate()) const;
    FHttpRequestPtr ListAssistantFiles(const ListAssistantFilesRequest& Request, const FListAssistantFilesDelegate& Delegate = FListAssistantFilesDelegate()) const;
    FHttpRequestPtr ListAssistants(const ListAssistantsRequest& Request, const FListAssistantsDelegate& Delegate = FListAssistantsDelegate()) const;
    FHttpRequestPtr ListMessageFiles(const ListMessageFilesRequest& Request, const FListMessageFilesDelegate& Delegate = FListMessageFilesDelegate()) const;
    FHttpRequestPtr ListMessages(const ListMessagesRequest& Request, const FListMessagesDelegate& Delegate = FListMessagesDelegate()) const;
    FHttpRequestPtr ListRunSteps(const ListRunStepsRequest& Request, const FListRunStepsDelegate& Delegate = FListRunStepsDelegate()) const;
    FHttpRequestPtr ListRuns(const ListRunsRequest& Request, const FListRunsDelegate& Delegate = FListRunsDelegate()) const;
    FHttpRequestPtr ModifyAssistant(const ModifyAssistantRequest& Request, const FModifyAssistantDelegate& Delegate = FModifyAssistantDelegate()) const;
    FHttpRequestPtr ModifyMessage(const ModifyMessageRequest& Request, const FModifyMessageDelegate& Delegate = FModifyMessageDelegate()) const;
    FHttpRequestPtr ModifyRun(const ModifyRunRequest& Request, const FModifyRunDelegate& Delegate = FModifyRunDelegate()) const;
    FHttpRequestPtr ModifyThread(const ModifyThreadRequest& Request, const FModifyThreadDelegate& Delegate = FModifyThreadDelegate()) const;
    FHttpRequestPtr SubmitToolOuputsToRun(const SubmitToolOuputsToRunRequest& Request, const FSubmitToolOuputsToRunDelegate& Delegate = FSubmitToolOuputsToRunDelegate()) const;
    
private:
    void OnCancelRunResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FCancelRunDelegate Delegate) const;
    void OnCreateAssistantResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FCreateAssistantDelegate Delegate) const;
    void OnCreateAssistantFileResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FCreateAssistantFileDelegate Delegate) const;
    void OnCreateMessageResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FCreateMessageDelegate Delegate) const;
    void OnCreateRunResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FCreateRunDelegate Delegate) const;
    void OnCreateThreadResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FCreateThreadDelegate Delegate) const;
    void OnCreateThreadAndRunResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FCreateThreadAndRunDelegate Delegate) const;
    void OnDeleteAssistantResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FDeleteAssistantDelegate Delegate) const;
    void OnDeleteAssistantFileResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FDeleteAssistantFileDelegate Delegate) const;
    void OnDeleteThreadResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FDeleteThreadDelegate Delegate) const;
    void OnGetAssistantResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FGetAssistantDelegate Delegate) const;
    void OnGetAssistantFileResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FGetAssistantFileDelegate Delegate) const;
    void OnGetMessageResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FGetMessageDelegate Delegate) const;
    void OnGetMessageFileResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FGetMessageFileDelegate Delegate) const;
    void OnGetRunResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FGetRunDelegate Delegate) const;
    void OnGetRunStepResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FGetRunStepDelegate Delegate) const;
    void OnGetThreadResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FGetThreadDelegate Delegate) const;
    void OnListAssistantFilesResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FListAssistantFilesDelegate Delegate) const;
    void OnListAssistantsResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FListAssistantsDelegate Delegate) const;
    void OnListMessageFilesResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FListMessageFilesDelegate Delegate) const;
    void OnListMessagesResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FListMessagesDelegate Delegate) const;
    void OnListRunStepsResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FListRunStepsDelegate Delegate) const;
    void OnListRunsResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FListRunsDelegate Delegate) const;
    void OnModifyAssistantResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FModifyAssistantDelegate Delegate) const;
    void OnModifyMessageResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FModifyMessageDelegate Delegate) const;
    void OnModifyRunResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FModifyRunDelegate Delegate) const;
    void OnModifyThreadResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FModifyThreadDelegate Delegate) const;
    void OnSubmitToolOuputsToRunResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FSubmitToolOuputsToRunDelegate Delegate) const;
    
	FHttpRequestRef CreateHttpRequest(const Request& Request) const;
	bool IsValid() const;
	void HandleResponse(FHttpResponsePtr HttpResponse, bool bSucceeded, Response& InOutResponse) const;

	FString Url;
	TMap<FString,FString> AdditionalHeaderParams;
	mutable FHttpRetrySystem::FManager* RetryManager = nullptr;
	mutable TUniquePtr<HttpRetryManager> DefaultRetryManager;
};

}
