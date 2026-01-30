#ifndef _AssistantsManager_H_
#define _AssistantsManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "AssistantObject.h"
#include "CreateAssistantRequest.h"
#include "CreateMessageRequest.h"
#include "CreateRunRequest.h"
#include "CreateThreadAndRunRequest.h"
#include "CreateThreadRequest.h"
#include "DeleteAssistantResponse.h"
#include "DeleteMessageResponse.h"
#include "DeleteThreadResponse.h"
#include "ListAssistantsResponse.h"
#include "ListMessagesResponse.h"
#include "ListRunStepsResponse.h"
#include "ListRunsResponse.h"
#include "MessageObject.h"
#include "ModifyAssistantRequest.h"
#include "ModifyMessageRequest.h"
#include "ModifyRunRequest.h"
#include "ModifyThreadRequest.h"
#include "RunObject.h"
#include "RunStepObject.h"
#include "SubmitToolOutputsRunRequest.h"
#include "ThreadObject.h"
#include <list>
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Assistants Assistants
 * \ingroup Operations
 *  @{
 */
class AssistantsManager {
public:
	AssistantsManager();
	virtual ~AssistantsManager();

/*! \brief Cancels a run that is `in_progress`.. *Synchronous*
 *
 * 
 * \param threadId The ID of the thread to which this run belongs. *Required*
 * \param runId The ID of the run to cancel. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool cancelRunSync(char * accessToken,
	std::string threadId, std::string runId, 
	void(* handler)(RunObject, Error, void* )
	, void* userData);

/*! \brief Cancels a run that is `in_progress`.. *Asynchronous*
 *
 * 
 * \param threadId The ID of the thread to which this run belongs. *Required*
 * \param runId The ID of the run to cancel. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool cancelRunAsync(char * accessToken,
	std::string threadId, std::string runId, 
	void(* handler)(RunObject, Error, void* )
	, void* userData);


/*! \brief Create an assistant with a model and instructions.. *Synchronous*
 *
 * 
 * \param createAssistantRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createAssistantSync(char * accessToken,
	std::shared_ptr<CreateAssistantRequest> createAssistantRequest, 
	void(* handler)(AssistantObject, Error, void* )
	, void* userData);

/*! \brief Create an assistant with a model and instructions.. *Asynchronous*
 *
 * 
 * \param createAssistantRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createAssistantAsync(char * accessToken,
	std::shared_ptr<CreateAssistantRequest> createAssistantRequest, 
	void(* handler)(AssistantObject, Error, void* )
	, void* userData);


/*! \brief Create a message.. *Synchronous*
 *
 * 
 * \param threadId The ID of the [thread](/docs/api-reference/threads) to create a message for. *Required*
 * \param createMessageRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createMessageSync(char * accessToken,
	std::string threadId, std::shared_ptr<CreateMessageRequest> createMessageRequest, 
	void(* handler)(MessageObject, Error, void* )
	, void* userData);

/*! \brief Create a message.. *Asynchronous*
 *
 * 
 * \param threadId The ID of the [thread](/docs/api-reference/threads) to create a message for. *Required*
 * \param createMessageRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createMessageAsync(char * accessToken,
	std::string threadId, std::shared_ptr<CreateMessageRequest> createMessageRequest, 
	void(* handler)(MessageObject, Error, void* )
	, void* userData);


/*! \brief Create a run.. *Synchronous*
 *
 * 
 * \param threadId The ID of the thread to run. *Required*
 * \param createRunRequest  *Required*
 * \param includeLeft_Square_BracketRight_Square_Bracket A list of additional fields to include in the response. Currently the only supported value is `step_details.tool_calls[*].file_search.results[*].content` to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createRunSync(char * accessToken,
	std::string threadId, std::shared_ptr<CreateRunRequest> createRunRequest, std::list<std::string> includeLeft_Square_BracketRight_Square_Bracket, 
	void(* handler)(RunObject, Error, void* )
	, void* userData);

/*! \brief Create a run.. *Asynchronous*
 *
 * 
 * \param threadId The ID of the thread to run. *Required*
 * \param createRunRequest  *Required*
 * \param includeLeft_Square_BracketRight_Square_Bracket A list of additional fields to include in the response. Currently the only supported value is `step_details.tool_calls[*].file_search.results[*].content` to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createRunAsync(char * accessToken,
	std::string threadId, std::shared_ptr<CreateRunRequest> createRunRequest, std::list<std::string> includeLeft_Square_BracketRight_Square_Bracket, 
	void(* handler)(RunObject, Error, void* )
	, void* userData);


/*! \brief Create a thread.. *Synchronous*
 *
 * 
 * \param createThreadRequest 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createThreadSync(char * accessToken,
	std::shared_ptr<CreateThreadRequest> createThreadRequest, 
	void(* handler)(ThreadObject, Error, void* )
	, void* userData);

/*! \brief Create a thread.. *Asynchronous*
 *
 * 
 * \param createThreadRequest 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createThreadAsync(char * accessToken,
	std::shared_ptr<CreateThreadRequest> createThreadRequest, 
	void(* handler)(ThreadObject, Error, void* )
	, void* userData);


/*! \brief Create a thread and run it in one request.. *Synchronous*
 *
 * 
 * \param createThreadAndRunRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createThreadAndRunSync(char * accessToken,
	std::shared_ptr<CreateThreadAndRunRequest> createThreadAndRunRequest, 
	void(* handler)(RunObject, Error, void* )
	, void* userData);

/*! \brief Create a thread and run it in one request.. *Asynchronous*
 *
 * 
 * \param createThreadAndRunRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createThreadAndRunAsync(char * accessToken,
	std::shared_ptr<CreateThreadAndRunRequest> createThreadAndRunRequest, 
	void(* handler)(RunObject, Error, void* )
	, void* userData);


/*! \brief Delete an assistant.. *Synchronous*
 *
 * 
 * \param assistantId The ID of the assistant to delete. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool deleteAssistantSync(char * accessToken,
	std::string assistantId, 
	void(* handler)(DeleteAssistantResponse, Error, void* )
	, void* userData);

/*! \brief Delete an assistant.. *Asynchronous*
 *
 * 
 * \param assistantId The ID of the assistant to delete. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool deleteAssistantAsync(char * accessToken,
	std::string assistantId, 
	void(* handler)(DeleteAssistantResponse, Error, void* )
	, void* userData);


/*! \brief Deletes a message.. *Synchronous*
 *
 * 
 * \param threadId The ID of the thread to which this message belongs. *Required*
 * \param messageId The ID of the message to delete. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool deleteMessageSync(char * accessToken,
	std::string threadId, std::string messageId, 
	void(* handler)(DeleteMessageResponse, Error, void* )
	, void* userData);

/*! \brief Deletes a message.. *Asynchronous*
 *
 * 
 * \param threadId The ID of the thread to which this message belongs. *Required*
 * \param messageId The ID of the message to delete. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool deleteMessageAsync(char * accessToken,
	std::string threadId, std::string messageId, 
	void(* handler)(DeleteMessageResponse, Error, void* )
	, void* userData);


/*! \brief Delete a thread.. *Synchronous*
 *
 * 
 * \param threadId The ID of the thread to delete. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool deleteThreadSync(char * accessToken,
	std::string threadId, 
	void(* handler)(DeleteThreadResponse, Error, void* )
	, void* userData);

/*! \brief Delete a thread.. *Asynchronous*
 *
 * 
 * \param threadId The ID of the thread to delete. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool deleteThreadAsync(char * accessToken,
	std::string threadId, 
	void(* handler)(DeleteThreadResponse, Error, void* )
	, void* userData);


/*! \brief Retrieves an assistant.. *Synchronous*
 *
 * 
 * \param assistantId The ID of the assistant to retrieve. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getAssistantSync(char * accessToken,
	std::string assistantId, 
	void(* handler)(AssistantObject, Error, void* )
	, void* userData);

/*! \brief Retrieves an assistant.. *Asynchronous*
 *
 * 
 * \param assistantId The ID of the assistant to retrieve. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getAssistantAsync(char * accessToken,
	std::string assistantId, 
	void(* handler)(AssistantObject, Error, void* )
	, void* userData);


/*! \brief Retrieve a message.. *Synchronous*
 *
 * 
 * \param threadId The ID of the [thread](/docs/api-reference/threads) to which this message belongs. *Required*
 * \param messageId The ID of the message to retrieve. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getMessageSync(char * accessToken,
	std::string threadId, std::string messageId, 
	void(* handler)(MessageObject, Error, void* )
	, void* userData);

/*! \brief Retrieve a message.. *Asynchronous*
 *
 * 
 * \param threadId The ID of the [thread](/docs/api-reference/threads) to which this message belongs. *Required*
 * \param messageId The ID of the message to retrieve. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getMessageAsync(char * accessToken,
	std::string threadId, std::string messageId, 
	void(* handler)(MessageObject, Error, void* )
	, void* userData);


/*! \brief Retrieves a run.. *Synchronous*
 *
 * 
 * \param threadId The ID of the [thread](/docs/api-reference/threads) that was run. *Required*
 * \param runId The ID of the run to retrieve. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getRunSync(char * accessToken,
	std::string threadId, std::string runId, 
	void(* handler)(RunObject, Error, void* )
	, void* userData);

/*! \brief Retrieves a run.. *Asynchronous*
 *
 * 
 * \param threadId The ID of the [thread](/docs/api-reference/threads) that was run. *Required*
 * \param runId The ID of the run to retrieve. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getRunAsync(char * accessToken,
	std::string threadId, std::string runId, 
	void(* handler)(RunObject, Error, void* )
	, void* userData);


/*! \brief Retrieves a run step.. *Synchronous*
 *
 * 
 * \param threadId The ID of the thread to which the run and run step belongs. *Required*
 * \param runId The ID of the run to which the run step belongs. *Required*
 * \param stepId The ID of the run step to retrieve. *Required*
 * \param includeLeft_Square_BracketRight_Square_Bracket A list of additional fields to include in the response. Currently the only supported value is `step_details.tool_calls[*].file_search.results[*].content` to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getRunStepSync(char * accessToken,
	std::string threadId, std::string runId, std::string stepId, std::list<std::string> includeLeft_Square_BracketRight_Square_Bracket, 
	void(* handler)(RunStepObject, Error, void* )
	, void* userData);

/*! \brief Retrieves a run step.. *Asynchronous*
 *
 * 
 * \param threadId The ID of the thread to which the run and run step belongs. *Required*
 * \param runId The ID of the run to which the run step belongs. *Required*
 * \param stepId The ID of the run step to retrieve. *Required*
 * \param includeLeft_Square_BracketRight_Square_Bracket A list of additional fields to include in the response. Currently the only supported value is `step_details.tool_calls[*].file_search.results[*].content` to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getRunStepAsync(char * accessToken,
	std::string threadId, std::string runId, std::string stepId, std::list<std::string> includeLeft_Square_BracketRight_Square_Bracket, 
	void(* handler)(RunStepObject, Error, void* )
	, void* userData);


/*! \brief Retrieves a thread.. *Synchronous*
 *
 * 
 * \param threadId The ID of the thread to retrieve. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getThreadSync(char * accessToken,
	std::string threadId, 
	void(* handler)(ThreadObject, Error, void* )
	, void* userData);

/*! \brief Retrieves a thread.. *Asynchronous*
 *
 * 
 * \param threadId The ID of the thread to retrieve. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getThreadAsync(char * accessToken,
	std::string threadId, 
	void(* handler)(ThreadObject, Error, void* )
	, void* userData);


/*! \brief Returns a list of assistants.. *Synchronous*
 *
 * 
 * \param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
 * \param order Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
 * \param after A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
 * \param before A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool listAssistantsSync(char * accessToken,
	int limit, std::string order, std::string after, std::string before, 
	void(* handler)(ListAssistantsResponse, Error, void* )
	, void* userData);

/*! \brief Returns a list of assistants.. *Asynchronous*
 *
 * 
 * \param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
 * \param order Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
 * \param after A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
 * \param before A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool listAssistantsAsync(char * accessToken,
	int limit, std::string order, std::string after, std::string before, 
	void(* handler)(ListAssistantsResponse, Error, void* )
	, void* userData);


/*! \brief Returns a list of messages for a given thread.. *Synchronous*
 *
 * 
 * \param threadId The ID of the [thread](/docs/api-reference/threads) the messages belong to. *Required*
 * \param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
 * \param order Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
 * \param after A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
 * \param before A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
 * \param runId Filter messages by the run ID that generated them. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool listMessagesSync(char * accessToken,
	std::string threadId, int limit, std::string order, std::string after, std::string before, std::string runId, 
	void(* handler)(ListMessagesResponse, Error, void* )
	, void* userData);

/*! \brief Returns a list of messages for a given thread.. *Asynchronous*
 *
 * 
 * \param threadId The ID of the [thread](/docs/api-reference/threads) the messages belong to. *Required*
 * \param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
 * \param order Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
 * \param after A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
 * \param before A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
 * \param runId Filter messages by the run ID that generated them. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool listMessagesAsync(char * accessToken,
	std::string threadId, int limit, std::string order, std::string after, std::string before, std::string runId, 
	void(* handler)(ListMessagesResponse, Error, void* )
	, void* userData);


/*! \brief Returns a list of run steps belonging to a run.. *Synchronous*
 *
 * 
 * \param threadId The ID of the thread the run and run steps belong to. *Required*
 * \param runId The ID of the run the run steps belong to. *Required*
 * \param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
 * \param order Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
 * \param after A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
 * \param before A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
 * \param includeLeft_Square_BracketRight_Square_Bracket A list of additional fields to include in the response. Currently the only supported value is `step_details.tool_calls[*].file_search.results[*].content` to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool listRunStepsSync(char * accessToken,
	std::string threadId, std::string runId, int limit, std::string order, std::string after, std::string before, std::list<std::string> includeLeft_Square_BracketRight_Square_Bracket, 
	void(* handler)(ListRunStepsResponse, Error, void* )
	, void* userData);

/*! \brief Returns a list of run steps belonging to a run.. *Asynchronous*
 *
 * 
 * \param threadId The ID of the thread the run and run steps belong to. *Required*
 * \param runId The ID of the run the run steps belong to. *Required*
 * \param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
 * \param order Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
 * \param after A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
 * \param before A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
 * \param includeLeft_Square_BracketRight_Square_Bracket A list of additional fields to include in the response. Currently the only supported value is `step_details.tool_calls[*].file_search.results[*].content` to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool listRunStepsAsync(char * accessToken,
	std::string threadId, std::string runId, int limit, std::string order, std::string after, std::string before, std::list<std::string> includeLeft_Square_BracketRight_Square_Bracket, 
	void(* handler)(ListRunStepsResponse, Error, void* )
	, void* userData);


/*! \brief Returns a list of runs belonging to a thread.. *Synchronous*
 *
 * 
 * \param threadId The ID of the thread the run belongs to. *Required*
 * \param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
 * \param order Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
 * \param after A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
 * \param before A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool listRunsSync(char * accessToken,
	std::string threadId, int limit, std::string order, std::string after, std::string before, 
	void(* handler)(ListRunsResponse, Error, void* )
	, void* userData);

/*! \brief Returns a list of runs belonging to a thread.. *Asynchronous*
 *
 * 
 * \param threadId The ID of the thread the run belongs to. *Required*
 * \param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
 * \param order Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
 * \param after A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
 * \param before A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool listRunsAsync(char * accessToken,
	std::string threadId, int limit, std::string order, std::string after, std::string before, 
	void(* handler)(ListRunsResponse, Error, void* )
	, void* userData);


/*! \brief Modifies an assistant.. *Synchronous*
 *
 * 
 * \param assistantId The ID of the assistant to modify. *Required*
 * \param modifyAssistantRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool modifyAssistantSync(char * accessToken,
	std::string assistantId, std::shared_ptr<ModifyAssistantRequest> modifyAssistantRequest, 
	void(* handler)(AssistantObject, Error, void* )
	, void* userData);

/*! \brief Modifies an assistant.. *Asynchronous*
 *
 * 
 * \param assistantId The ID of the assistant to modify. *Required*
 * \param modifyAssistantRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool modifyAssistantAsync(char * accessToken,
	std::string assistantId, std::shared_ptr<ModifyAssistantRequest> modifyAssistantRequest, 
	void(* handler)(AssistantObject, Error, void* )
	, void* userData);


/*! \brief Modifies a message.. *Synchronous*
 *
 * 
 * \param threadId The ID of the thread to which this message belongs. *Required*
 * \param messageId The ID of the message to modify. *Required*
 * \param modifyMessageRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool modifyMessageSync(char * accessToken,
	std::string threadId, std::string messageId, std::shared_ptr<ModifyMessageRequest> modifyMessageRequest, 
	void(* handler)(MessageObject, Error, void* )
	, void* userData);

/*! \brief Modifies a message.. *Asynchronous*
 *
 * 
 * \param threadId The ID of the thread to which this message belongs. *Required*
 * \param messageId The ID of the message to modify. *Required*
 * \param modifyMessageRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool modifyMessageAsync(char * accessToken,
	std::string threadId, std::string messageId, std::shared_ptr<ModifyMessageRequest> modifyMessageRequest, 
	void(* handler)(MessageObject, Error, void* )
	, void* userData);


/*! \brief Modifies a run.. *Synchronous*
 *
 * 
 * \param threadId The ID of the [thread](/docs/api-reference/threads) that was run. *Required*
 * \param runId The ID of the run to modify. *Required*
 * \param modifyRunRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool modifyRunSync(char * accessToken,
	std::string threadId, std::string runId, std::shared_ptr<ModifyRunRequest> modifyRunRequest, 
	void(* handler)(RunObject, Error, void* )
	, void* userData);

/*! \brief Modifies a run.. *Asynchronous*
 *
 * 
 * \param threadId The ID of the [thread](/docs/api-reference/threads) that was run. *Required*
 * \param runId The ID of the run to modify. *Required*
 * \param modifyRunRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool modifyRunAsync(char * accessToken,
	std::string threadId, std::string runId, std::shared_ptr<ModifyRunRequest> modifyRunRequest, 
	void(* handler)(RunObject, Error, void* )
	, void* userData);


/*! \brief Modifies a thread.. *Synchronous*
 *
 * 
 * \param threadId The ID of the thread to modify. Only the `metadata` can be modified. *Required*
 * \param modifyThreadRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool modifyThreadSync(char * accessToken,
	std::string threadId, std::shared_ptr<ModifyThreadRequest> modifyThreadRequest, 
	void(* handler)(ThreadObject, Error, void* )
	, void* userData);

/*! \brief Modifies a thread.. *Asynchronous*
 *
 * 
 * \param threadId The ID of the thread to modify. Only the `metadata` can be modified. *Required*
 * \param modifyThreadRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool modifyThreadAsync(char * accessToken,
	std::string threadId, std::shared_ptr<ModifyThreadRequest> modifyThreadRequest, 
	void(* handler)(ThreadObject, Error, void* )
	, void* userData);


/*! \brief When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they're all completed. All outputs must be submitted in a single request. . *Synchronous*
 *
 * 
 * \param threadId The ID of the [thread](/docs/api-reference/threads) to which this run belongs. *Required*
 * \param runId The ID of the run that requires the tool output submission. *Required*
 * \param submitToolOutputsRunRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool submitToolOuputsToRunSync(char * accessToken,
	std::string threadId, std::string runId, std::shared_ptr<SubmitToolOutputsRunRequest> submitToolOutputsRunRequest, 
	void(* handler)(RunObject, Error, void* )
	, void* userData);

/*! \brief When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they're all completed. All outputs must be submitted in a single request. . *Asynchronous*
 *
 * 
 * \param threadId The ID of the [thread](/docs/api-reference/threads) to which this run belongs. *Required*
 * \param runId The ID of the run that requires the tool output submission. *Required*
 * \param submitToolOutputsRunRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool submitToolOuputsToRunAsync(char * accessToken,
	std::string threadId, std::string runId, std::shared_ptr<SubmitToolOutputsRunRequest> submitToolOutputsRunRequest, 
	void(* handler)(RunObject, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.openai.com/v1";
	}
};
/** @}*/

}
}
#endif /* AssistantsManager_H_ */
