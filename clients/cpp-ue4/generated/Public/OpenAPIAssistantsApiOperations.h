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

#include "OpenAPIBaseModel.h"
#include "OpenAPIAssistantsApi.h"

#include "OpenAPIAssistantFileObject.h"
#include "OpenAPIAssistantObject.h"
#include "OpenAPICreateAssistantFileRequest.h"
#include "OpenAPICreateAssistantRequest.h"
#include "OpenAPICreateMessageRequest.h"
#include "OpenAPICreateRunRequest.h"
#include "OpenAPICreateThreadAndRunRequest.h"
#include "OpenAPICreateThreadRequest.h"
#include "OpenAPIDeleteAssistantFileResponse.h"
#include "OpenAPIDeleteAssistantResponse.h"
#include "OpenAPIDeleteThreadResponse.h"
#include "OpenAPIListAssistantFilesResponse.h"
#include "OpenAPIListAssistantsResponse.h"
#include "OpenAPIListMessageFilesResponse.h"
#include "OpenAPIListMessagesResponse.h"
#include "OpenAPIListRunStepsResponse.h"
#include "OpenAPIListRunsResponse.h"
#include "OpenAPIMessageFileObject.h"
#include "OpenAPIMessageObject.h"
#include "OpenAPIModifyAssistantRequest.h"
#include "OpenAPIModifyMessageRequest.h"
#include "OpenAPIModifyRunRequest.h"
#include "OpenAPIModifyThreadRequest.h"
#include "OpenAPIRunObject.h"
#include "OpenAPIRunStepObject.h"
#include "OpenAPISubmitToolOutputsRunRequest.h"
#include "OpenAPIThreadObject.h"

namespace OpenAPI
{

/* Cancels a run that is &#x60;in_progress&#x60;.

*/
class OPENAPI_API OpenAPIAssistantsApi::CancelRunRequest : public Request
{
public:
    virtual ~CancelRunRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* The ID of the thread to which this run belongs. */
	FString ThreadId;
	/* The ID of the run to cancel. */
	FString RunId;
};

class OPENAPI_API OpenAPIAssistantsApi::CancelRunResponse : public Response
{
public:
    virtual ~CancelRunResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    OpenAPIRunObject Content;
};

/* Create an assistant with a model and instructions.

*/
class OPENAPI_API OpenAPIAssistantsApi::CreateAssistantRequest : public Request
{
public:
    virtual ~CreateAssistantRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	OpenAPICreateAssistantRequest OpenAPICreateAssistantRequest;
};

class OPENAPI_API OpenAPIAssistantsApi::CreateAssistantResponse : public Response
{
public:
    virtual ~CreateAssistantResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    OpenAPIAssistantObject Content;
};

/* Create an assistant file by attaching a [File](/docs/api-reference/files) to an [assistant](/docs/api-reference/assistants).

*/
class OPENAPI_API OpenAPIAssistantsApi::CreateAssistantFileRequest : public Request
{
public:
    virtual ~CreateAssistantFileRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* The ID of the assistant for which to create a File.  */
	FString AssistantId;
	OpenAPICreateAssistantFileRequest OpenAPICreateAssistantFileRequest;
};

class OPENAPI_API OpenAPIAssistantsApi::CreateAssistantFileResponse : public Response
{
public:
    virtual ~CreateAssistantFileResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    OpenAPIAssistantFileObject Content;
};

/* Create a message.

*/
class OPENAPI_API OpenAPIAssistantsApi::CreateMessageRequest : public Request
{
public:
    virtual ~CreateMessageRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* The ID of the [thread](/docs/api-reference/threads) to create a message for. */
	FString ThreadId;
	OpenAPICreateMessageRequest OpenAPICreateMessageRequest;
};

class OPENAPI_API OpenAPIAssistantsApi::CreateMessageResponse : public Response
{
public:
    virtual ~CreateMessageResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    OpenAPIMessageObject Content;
};

/* Create a run.

*/
class OPENAPI_API OpenAPIAssistantsApi::CreateRunRequest : public Request
{
public:
    virtual ~CreateRunRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* The ID of the thread to run. */
	FString ThreadId;
	OpenAPICreateRunRequest OpenAPICreateRunRequest;
};

class OPENAPI_API OpenAPIAssistantsApi::CreateRunResponse : public Response
{
public:
    virtual ~CreateRunResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    OpenAPIRunObject Content;
};

/* Create a thread.

*/
class OPENAPI_API OpenAPIAssistantsApi::CreateThreadRequest : public Request
{
public:
    virtual ~CreateThreadRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	TOptional<OpenAPICreateThreadRequest> OpenAPICreateThreadRequest;
};

class OPENAPI_API OpenAPIAssistantsApi::CreateThreadResponse : public Response
{
public:
    virtual ~CreateThreadResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    OpenAPIThreadObject Content;
};

/* Create a thread and run it in one request.

*/
class OPENAPI_API OpenAPIAssistantsApi::CreateThreadAndRunRequest : public Request
{
public:
    virtual ~CreateThreadAndRunRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	OpenAPICreateThreadAndRunRequest OpenAPICreateThreadAndRunRequest;
};

class OPENAPI_API OpenAPIAssistantsApi::CreateThreadAndRunResponse : public Response
{
public:
    virtual ~CreateThreadAndRunResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    OpenAPIRunObject Content;
};

/* Delete an assistant.

*/
class OPENAPI_API OpenAPIAssistantsApi::DeleteAssistantRequest : public Request
{
public:
    virtual ~DeleteAssistantRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* The ID of the assistant to delete. */
	FString AssistantId;
};

class OPENAPI_API OpenAPIAssistantsApi::DeleteAssistantResponse : public Response
{
public:
    virtual ~DeleteAssistantResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    OpenAPIDeleteAssistantResponse Content;
};

/* Delete an assistant file.

*/
class OPENAPI_API OpenAPIAssistantsApi::DeleteAssistantFileRequest : public Request
{
public:
    virtual ~DeleteAssistantFileRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* The ID of the assistant that the file belongs to. */
	FString AssistantId;
	/* The ID of the file to delete. */
	FString FileId;
};

class OPENAPI_API OpenAPIAssistantsApi::DeleteAssistantFileResponse : public Response
{
public:
    virtual ~DeleteAssistantFileResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    OpenAPIDeleteAssistantFileResponse Content;
};

/* Delete a thread.

*/
class OPENAPI_API OpenAPIAssistantsApi::DeleteThreadRequest : public Request
{
public:
    virtual ~DeleteThreadRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* The ID of the thread to delete. */
	FString ThreadId;
};

class OPENAPI_API OpenAPIAssistantsApi::DeleteThreadResponse : public Response
{
public:
    virtual ~DeleteThreadResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    OpenAPIDeleteThreadResponse Content;
};

/* Retrieves an assistant.

*/
class OPENAPI_API OpenAPIAssistantsApi::GetAssistantRequest : public Request
{
public:
    virtual ~GetAssistantRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* The ID of the assistant to retrieve. */
	FString AssistantId;
};

class OPENAPI_API OpenAPIAssistantsApi::GetAssistantResponse : public Response
{
public:
    virtual ~GetAssistantResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    OpenAPIAssistantObject Content;
};

/* Retrieves an AssistantFile.

*/
class OPENAPI_API OpenAPIAssistantsApi::GetAssistantFileRequest : public Request
{
public:
    virtual ~GetAssistantFileRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* The ID of the assistant who the file belongs to. */
	FString AssistantId;
	/* The ID of the file we're getting. */
	FString FileId;
};

class OPENAPI_API OpenAPIAssistantsApi::GetAssistantFileResponse : public Response
{
public:
    virtual ~GetAssistantFileResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    OpenAPIAssistantFileObject Content;
};

/* Retrieve a message.

*/
class OPENAPI_API OpenAPIAssistantsApi::GetMessageRequest : public Request
{
public:
    virtual ~GetMessageRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* The ID of the [thread](/docs/api-reference/threads) to which this message belongs. */
	FString ThreadId;
	/* The ID of the message to retrieve. */
	FString MessageId;
};

class OPENAPI_API OpenAPIAssistantsApi::GetMessageResponse : public Response
{
public:
    virtual ~GetMessageResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    OpenAPIMessageObject Content;
};

/* Retrieves a message file.

*/
class OPENAPI_API OpenAPIAssistantsApi::GetMessageFileRequest : public Request
{
public:
    virtual ~GetMessageFileRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* The ID of the thread to which the message and File belong. */
	FString ThreadId;
	/* The ID of the message the file belongs to. */
	FString MessageId;
	/* The ID of the file being retrieved. */
	FString FileId;
};

class OPENAPI_API OpenAPIAssistantsApi::GetMessageFileResponse : public Response
{
public:
    virtual ~GetMessageFileResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    OpenAPIMessageFileObject Content;
};

/* Retrieves a run.

*/
class OPENAPI_API OpenAPIAssistantsApi::GetRunRequest : public Request
{
public:
    virtual ~GetRunRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* The ID of the [thread](/docs/api-reference/threads) that was run. */
	FString ThreadId;
	/* The ID of the run to retrieve. */
	FString RunId;
};

class OPENAPI_API OpenAPIAssistantsApi::GetRunResponse : public Response
{
public:
    virtual ~GetRunResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    OpenAPIRunObject Content;
};

/* Retrieves a run step.

*/
class OPENAPI_API OpenAPIAssistantsApi::GetRunStepRequest : public Request
{
public:
    virtual ~GetRunStepRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* The ID of the thread to which the run and run step belongs. */
	FString ThreadId;
	/* The ID of the run to which the run step belongs. */
	FString RunId;
	/* The ID of the run step to retrieve. */
	FString StepId;
};

class OPENAPI_API OpenAPIAssistantsApi::GetRunStepResponse : public Response
{
public:
    virtual ~GetRunStepResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    OpenAPIRunStepObject Content;
};

/* Retrieves a thread.

*/
class OPENAPI_API OpenAPIAssistantsApi::GetThreadRequest : public Request
{
public:
    virtual ~GetThreadRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* The ID of the thread to retrieve. */
	FString ThreadId;
};

class OPENAPI_API OpenAPIAssistantsApi::GetThreadResponse : public Response
{
public:
    virtual ~GetThreadResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    OpenAPIThreadObject Content;
};

/* Returns a list of assistant files.

*/
class OPENAPI_API OpenAPIAssistantsApi::ListAssistantFilesRequest : public Request
{
public:
    virtual ~ListAssistantFilesRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* The ID of the assistant the file belongs to. */
	FString AssistantId;
	/* A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  */
	TOptional<int32> Limit;
	enum class OrderEnum
	{
		Asc,
		Desc,
  	};

	static FString EnumToString(const OrderEnum& EnumValue);
	static bool EnumFromString(const FString& EnumAsString, OrderEnum& EnumValue);
	/* Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  */
	TOptional<OrderEnum> Order;
	/* A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  */
	TOptional<FString> After;
	/* A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  */
	TOptional<FString> Before;
};

class OPENAPI_API OpenAPIAssistantsApi::ListAssistantFilesResponse : public Response
{
public:
    virtual ~ListAssistantFilesResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    OpenAPIListAssistantFilesResponse Content;
};

/* Returns a list of assistants.

*/
class OPENAPI_API OpenAPIAssistantsApi::ListAssistantsRequest : public Request
{
public:
    virtual ~ListAssistantsRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  */
	TOptional<int32> Limit;
	enum class OrderEnum
	{
		Asc,
		Desc,
  	};

	static FString EnumToString(const OrderEnum& EnumValue);
	static bool EnumFromString(const FString& EnumAsString, OrderEnum& EnumValue);
	/* Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  */
	TOptional<OrderEnum> Order;
	/* A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  */
	TOptional<FString> After;
	/* A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  */
	TOptional<FString> Before;
};

class OPENAPI_API OpenAPIAssistantsApi::ListAssistantsResponse : public Response
{
public:
    virtual ~ListAssistantsResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    OpenAPIListAssistantsResponse Content;
};

/* Returns a list of message files.

*/
class OPENAPI_API OpenAPIAssistantsApi::ListMessageFilesRequest : public Request
{
public:
    virtual ~ListMessageFilesRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* The ID of the thread that the message and files belong to. */
	FString ThreadId;
	/* The ID of the message that the files belongs to. */
	FString MessageId;
	/* A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  */
	TOptional<int32> Limit;
	enum class OrderEnum
	{
		Asc,
		Desc,
  	};

	static FString EnumToString(const OrderEnum& EnumValue);
	static bool EnumFromString(const FString& EnumAsString, OrderEnum& EnumValue);
	/* Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  */
	TOptional<OrderEnum> Order;
	/* A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  */
	TOptional<FString> After;
	/* A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  */
	TOptional<FString> Before;
};

class OPENAPI_API OpenAPIAssistantsApi::ListMessageFilesResponse : public Response
{
public:
    virtual ~ListMessageFilesResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    OpenAPIListMessageFilesResponse Content;
};

/* Returns a list of messages for a given thread.

*/
class OPENAPI_API OpenAPIAssistantsApi::ListMessagesRequest : public Request
{
public:
    virtual ~ListMessagesRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* The ID of the [thread](/docs/api-reference/threads) the messages belong to. */
	FString ThreadId;
	/* A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  */
	TOptional<int32> Limit;
	enum class OrderEnum
	{
		Asc,
		Desc,
  	};

	static FString EnumToString(const OrderEnum& EnumValue);
	static bool EnumFromString(const FString& EnumAsString, OrderEnum& EnumValue);
	/* Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  */
	TOptional<OrderEnum> Order;
	/* A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  */
	TOptional<FString> After;
	/* A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  */
	TOptional<FString> Before;
	/* Filter messages by the run ID that generated them.  */
	TOptional<FString> RunId;
};

class OPENAPI_API OpenAPIAssistantsApi::ListMessagesResponse : public Response
{
public:
    virtual ~ListMessagesResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    OpenAPIListMessagesResponse Content;
};

/* Returns a list of run steps belonging to a run.

*/
class OPENAPI_API OpenAPIAssistantsApi::ListRunStepsRequest : public Request
{
public:
    virtual ~ListRunStepsRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* The ID of the thread the run and run steps belong to. */
	FString ThreadId;
	/* The ID of the run the run steps belong to. */
	FString RunId;
	/* A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  */
	TOptional<int32> Limit;
	enum class OrderEnum
	{
		Asc,
		Desc,
  	};

	static FString EnumToString(const OrderEnum& EnumValue);
	static bool EnumFromString(const FString& EnumAsString, OrderEnum& EnumValue);
	/* Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  */
	TOptional<OrderEnum> Order;
	/* A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  */
	TOptional<FString> After;
	/* A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  */
	TOptional<FString> Before;
};

class OPENAPI_API OpenAPIAssistantsApi::ListRunStepsResponse : public Response
{
public:
    virtual ~ListRunStepsResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    OpenAPIListRunStepsResponse Content;
};

/* Returns a list of runs belonging to a thread.

*/
class OPENAPI_API OpenAPIAssistantsApi::ListRunsRequest : public Request
{
public:
    virtual ~ListRunsRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* The ID of the thread the run belongs to. */
	FString ThreadId;
	/* A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  */
	TOptional<int32> Limit;
	enum class OrderEnum
	{
		Asc,
		Desc,
  	};

	static FString EnumToString(const OrderEnum& EnumValue);
	static bool EnumFromString(const FString& EnumAsString, OrderEnum& EnumValue);
	/* Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.  */
	TOptional<OrderEnum> Order;
	/* A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  */
	TOptional<FString> After;
	/* A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.  */
	TOptional<FString> Before;
};

class OPENAPI_API OpenAPIAssistantsApi::ListRunsResponse : public Response
{
public:
    virtual ~ListRunsResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    OpenAPIListRunsResponse Content;
};

/* Modifies an assistant.

*/
class OPENAPI_API OpenAPIAssistantsApi::ModifyAssistantRequest : public Request
{
public:
    virtual ~ModifyAssistantRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* The ID of the assistant to modify. */
	FString AssistantId;
	OpenAPIModifyAssistantRequest OpenAPIModifyAssistantRequest;
};

class OPENAPI_API OpenAPIAssistantsApi::ModifyAssistantResponse : public Response
{
public:
    virtual ~ModifyAssistantResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    OpenAPIAssistantObject Content;
};

/* Modifies a message.

*/
class OPENAPI_API OpenAPIAssistantsApi::ModifyMessageRequest : public Request
{
public:
    virtual ~ModifyMessageRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* The ID of the thread to which this message belongs. */
	FString ThreadId;
	/* The ID of the message to modify. */
	FString MessageId;
	OpenAPIModifyMessageRequest OpenAPIModifyMessageRequest;
};

class OPENAPI_API OpenAPIAssistantsApi::ModifyMessageResponse : public Response
{
public:
    virtual ~ModifyMessageResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    OpenAPIMessageObject Content;
};

/* Modifies a run.

*/
class OPENAPI_API OpenAPIAssistantsApi::ModifyRunRequest : public Request
{
public:
    virtual ~ModifyRunRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* The ID of the [thread](/docs/api-reference/threads) that was run. */
	FString ThreadId;
	/* The ID of the run to modify. */
	FString RunId;
	OpenAPIModifyRunRequest OpenAPIModifyRunRequest;
};

class OPENAPI_API OpenAPIAssistantsApi::ModifyRunResponse : public Response
{
public:
    virtual ~ModifyRunResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    OpenAPIRunObject Content;
};

/* Modifies a thread.

*/
class OPENAPI_API OpenAPIAssistantsApi::ModifyThreadRequest : public Request
{
public:
    virtual ~ModifyThreadRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* The ID of the thread to modify. Only the `metadata` can be modified. */
	FString ThreadId;
	OpenAPIModifyThreadRequest OpenAPIModifyThreadRequest;
};

class OPENAPI_API OpenAPIAssistantsApi::ModifyThreadResponse : public Response
{
public:
    virtual ~ModifyThreadResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    OpenAPIThreadObject Content;
};

/* When a run has the &#x60;status: \&quot;requires_action\&quot;&#x60; and &#x60;required_action.type&#x60; is &#x60;submit_tool_outputs&#x60;, this endpoint can be used to submit the outputs from the tool calls once they&#39;re all completed. All outputs must be submitted in a single request. 

*/
class OPENAPI_API OpenAPIAssistantsApi::SubmitToolOuputsToRunRequest : public Request
{
public:
    virtual ~SubmitToolOuputsToRunRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* The ID of the [thread](/docs/api-reference/threads) to which this run belongs. */
	FString ThreadId;
	/* The ID of the run that requires the tool output submission. */
	FString RunId;
	OpenAPISubmitToolOutputsRunRequest OpenAPISubmitToolOutputsRunRequest;
};

class OPENAPI_API OpenAPIAssistantsApi::SubmitToolOuputsToRunResponse : public Response
{
public:
    virtual ~SubmitToolOuputsToRunResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    OpenAPIRunObject Content;
};

}