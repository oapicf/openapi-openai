#ifndef TINY_CPP_CLIENT_AssistantsApi_H_
#define TINY_CPP_CLIENT_AssistantsApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

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

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class AssistantsApi : public Service {
public:
    AssistantsApi() = default;

    virtual ~AssistantsApi() = default;

    /**
    * Cancels a run that is `in_progress`..
    *
    * 
    * \param threadId The ID of the thread to which this run belongs. *Required*
    * \param runId The ID of the run to cancel. *Required*
    */
    Response<
                RunObject
        >
    cancelRun(
            
            std::string threadId
            , 
            
            std::string runId
            
    );
    /**
    * Create an assistant with a model and instructions..
    *
    * 
    * \param createAssistantRequest  *Required*
    */
    Response<
                AssistantObject
        >
    createAssistant(
            
            CreateAssistantRequest createAssistantRequest
            
    );
    /**
    * Create a message..
    *
    * 
    * \param threadId The ID of the [thread](/docs/api-reference/threads) to create a message for. *Required*
    * \param createMessageRequest  *Required*
    */
    Response<
                MessageObject
        >
    createMessage(
            
            std::string threadId
            , 
            
            CreateMessageRequest createMessageRequest
            
    );
    /**
    * Create a run..
    *
    * 
    * \param threadId The ID of the thread to run. *Required*
    * \param createRunRequest  *Required*
    * \param includeLeft_Square_BracketRight_Square_Bracket A list of additional fields to include in the response. Currently the only supported value is `step_details.tool_calls[*].file_search.results[*].content` to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
    */
    Response<
                RunObject
        >
    createRun(
            
            std::string threadId
            , 
            
            CreateRunRequest createRunRequest
            , 
            std::list<std::string> includeLeft_Square_BracketRight_Square_Bracket
            
            
    );
    /**
    * Create a thread..
    *
    * 
    * \param createThreadRequest 
    */
    Response<
                ThreadObject
        >
    createThread(
            
            CreateThreadRequest createThreadRequest
            
    );
    /**
    * Create a thread and run it in one request..
    *
    * 
    * \param createThreadAndRunRequest  *Required*
    */
    Response<
                RunObject
        >
    createThreadAndRun(
            
            CreateThreadAndRunRequest createThreadAndRunRequest
            
    );
    /**
    * Delete an assistant..
    *
    * 
    * \param assistantId The ID of the assistant to delete. *Required*
    */
    Response<
                DeleteAssistantResponse
        >
    deleteAssistant(
            
            std::string assistantId
            
    );
    /**
    * Deletes a message..
    *
    * 
    * \param threadId The ID of the thread to which this message belongs. *Required*
    * \param messageId The ID of the message to delete. *Required*
    */
    Response<
                DeleteMessageResponse
        >
    deleteMessage(
            
            std::string threadId
            , 
            
            std::string messageId
            
    );
    /**
    * Delete a thread..
    *
    * 
    * \param threadId The ID of the thread to delete. *Required*
    */
    Response<
                DeleteThreadResponse
        >
    deleteThread(
            
            std::string threadId
            
    );
    /**
    * Retrieves an assistant..
    *
    * 
    * \param assistantId The ID of the assistant to retrieve. *Required*
    */
    Response<
                AssistantObject
        >
    getAssistant(
            
            std::string assistantId
            
    );
    /**
    * Retrieve a message..
    *
    * 
    * \param threadId The ID of the [thread](/docs/api-reference/threads) to which this message belongs. *Required*
    * \param messageId The ID of the message to retrieve. *Required*
    */
    Response<
                MessageObject
        >
    getMessage(
            
            std::string threadId
            , 
            
            std::string messageId
            
    );
    /**
    * Retrieves a run..
    *
    * 
    * \param threadId The ID of the [thread](/docs/api-reference/threads) that was run. *Required*
    * \param runId The ID of the run to retrieve. *Required*
    */
    Response<
                RunObject
        >
    getRun(
            
            std::string threadId
            , 
            
            std::string runId
            
    );
    /**
    * Retrieves a run step..
    *
    * 
    * \param threadId The ID of the thread to which the run and run step belongs. *Required*
    * \param runId The ID of the run to which the run step belongs. *Required*
    * \param stepId The ID of the run step to retrieve. *Required*
    * \param includeLeft_Square_BracketRight_Square_Bracket A list of additional fields to include in the response. Currently the only supported value is `step_details.tool_calls[*].file_search.results[*].content` to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
    */
    Response<
                RunStepObject
        >
    getRunStep(
            
            std::string threadId
            , 
            
            std::string runId
            , 
            
            std::string stepId
            , 
            std::list<std::string> includeLeft_Square_BracketRight_Square_Bracket
            
            
    );
    /**
    * Retrieves a thread..
    *
    * 
    * \param threadId The ID of the thread to retrieve. *Required*
    */
    Response<
                ThreadObject
        >
    getThread(
            
            std::string threadId
            
    );
    /**
    * Returns a list of assistants..
    *
    * 
    * \param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
    * \param order Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
    * \param after A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
    * \param before A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
    */
    Response<
                ListAssistantsResponse
        >
    listAssistants(
            
            int limit
            , 
            
            std::string order
            , 
            
            std::string after
            , 
            
            std::string before
            
    );
    /**
    * Returns a list of messages for a given thread..
    *
    * 
    * \param threadId The ID of the [thread](/docs/api-reference/threads) the messages belong to. *Required*
    * \param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
    * \param order Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
    * \param after A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
    * \param before A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
    * \param runId Filter messages by the run ID that generated them. 
    */
    Response<
                ListMessagesResponse
        >
    listMessages(
            
            std::string threadId
            , 
            
            int limit
            , 
            
            std::string order
            , 
            
            std::string after
            , 
            
            std::string before
            , 
            
            std::string runId
            
    );
    /**
    * Returns a list of run steps belonging to a run..
    *
    * 
    * \param threadId The ID of the thread the run and run steps belong to. *Required*
    * \param runId The ID of the run the run steps belong to. *Required*
    * \param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
    * \param order Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
    * \param after A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
    * \param before A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
    * \param includeLeft_Square_BracketRight_Square_Bracket A list of additional fields to include in the response. Currently the only supported value is `step_details.tool_calls[*].file_search.results[*].content` to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
    */
    Response<
                ListRunStepsResponse
        >
    listRunSteps(
            
            std::string threadId
            , 
            
            std::string runId
            , 
            
            int limit
            , 
            
            std::string order
            , 
            
            std::string after
            , 
            
            std::string before
            , 
            std::list<std::string> includeLeft_Square_BracketRight_Square_Bracket
            
            
    );
    /**
    * Returns a list of runs belonging to a thread..
    *
    * 
    * \param threadId The ID of the thread the run belongs to. *Required*
    * \param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
    * \param order Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
    * \param after A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
    * \param before A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
    */
    Response<
                ListRunsResponse
        >
    listRuns(
            
            std::string threadId
            , 
            
            int limit
            , 
            
            std::string order
            , 
            
            std::string after
            , 
            
            std::string before
            
    );
    /**
    * Modifies an assistant..
    *
    * 
    * \param assistantId The ID of the assistant to modify. *Required*
    * \param modifyAssistantRequest  *Required*
    */
    Response<
                AssistantObject
        >
    modifyAssistant(
            
            std::string assistantId
            , 
            
            ModifyAssistantRequest modifyAssistantRequest
            
    );
    /**
    * Modifies a message..
    *
    * 
    * \param threadId The ID of the thread to which this message belongs. *Required*
    * \param messageId The ID of the message to modify. *Required*
    * \param modifyMessageRequest  *Required*
    */
    Response<
                MessageObject
        >
    modifyMessage(
            
            std::string threadId
            , 
            
            std::string messageId
            , 
            
            ModifyMessageRequest modifyMessageRequest
            
    );
    /**
    * Modifies a run..
    *
    * 
    * \param threadId The ID of the [thread](/docs/api-reference/threads) that was run. *Required*
    * \param runId The ID of the run to modify. *Required*
    * \param modifyRunRequest  *Required*
    */
    Response<
                RunObject
        >
    modifyRun(
            
            std::string threadId
            , 
            
            std::string runId
            , 
            
            ModifyRunRequest modifyRunRequest
            
    );
    /**
    * Modifies a thread..
    *
    * 
    * \param threadId The ID of the thread to modify. Only the `metadata` can be modified. *Required*
    * \param modifyThreadRequest  *Required*
    */
    Response<
                ThreadObject
        >
    modifyThread(
            
            std::string threadId
            , 
            
            ModifyThreadRequest modifyThreadRequest
            
    );
    /**
    * When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they're all completed. All outputs must be submitted in a single request. .
    *
    * 
    * \param threadId The ID of the [thread](/docs/api-reference/threads) to which this run belongs. *Required*
    * \param runId The ID of the run that requires the tool output submission. *Required*
    * \param submitToolOutputsRunRequest  *Required*
    */
    Response<
                RunObject
        >
    submitToolOuputsToRun(
            
            std::string threadId
            , 
            
            std::string runId
            , 
            
            SubmitToolOutputsRunRequest submitToolOutputsRunRequest
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_AssistantsApi_H_ */