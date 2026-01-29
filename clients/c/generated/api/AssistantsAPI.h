#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/assistant_file_object.h"
#include "../model/assistant_object.h"
#include "../model/create_assistant_file_request.h"
#include "../model/create_assistant_request.h"
#include "../model/create_message_request.h"
#include "../model/create_run_request.h"
#include "../model/create_thread_and_run_request.h"
#include "../model/create_thread_request.h"
#include "../model/delete_assistant_file_response.h"
#include "../model/delete_assistant_response.h"
#include "../model/delete_thread_response.h"
#include "../model/list_assistant_files_response.h"
#include "../model/list_assistants_response.h"
#include "../model/list_message_files_response.h"
#include "../model/list_messages_response.h"
#include "../model/list_run_steps_response.h"
#include "../model/list_runs_response.h"
#include "../model/message_file_object.h"
#include "../model/message_object.h"
#include "../model/modify_assistant_request.h"
#include "../model/modify_message_request.h"
#include "../model/modify_run_request.h"
#include "../model/modify_thread_request.h"
#include "../model/run_object.h"
#include "../model/run_step_object.h"
#include "../model/submit_tool_outputs_run_request.h"
#include "../model/thread_object.h"

// Enum ORDER for AssistantsAPI_listAssistantFiles
typedef enum  { openai_api_listAssistantFiles_ORDER_NULL = 0, openai_api_listAssistantFiles_ORDER_asc, openai_api_listAssistantFiles_ORDER_desc } openai_api_listAssistantFiles_order_e;

// Enum ORDER for AssistantsAPI_listAssistants
typedef enum  { openai_api_listAssistants_ORDER_NULL = 0, openai_api_listAssistants_ORDER_asc, openai_api_listAssistants_ORDER_desc } openai_api_listAssistants_order_e;

// Enum ORDER for AssistantsAPI_listMessageFiles
typedef enum  { openai_api_listMessageFiles_ORDER_NULL = 0, openai_api_listMessageFiles_ORDER_asc, openai_api_listMessageFiles_ORDER_desc } openai_api_listMessageFiles_order_e;

// Enum ORDER for AssistantsAPI_listMessages
typedef enum  { openai_api_listMessages_ORDER_NULL = 0, openai_api_listMessages_ORDER_asc, openai_api_listMessages_ORDER_desc } openai_api_listMessages_order_e;

// Enum ORDER for AssistantsAPI_listRunSteps
typedef enum  { openai_api_listRunSteps_ORDER_NULL = 0, openai_api_listRunSteps_ORDER_asc, openai_api_listRunSteps_ORDER_desc } openai_api_listRunSteps_order_e;

// Enum ORDER for AssistantsAPI_listRuns
typedef enum  { openai_api_listRuns_ORDER_NULL = 0, openai_api_listRuns_ORDER_asc, openai_api_listRuns_ORDER_desc } openai_api_listRuns_order_e;


// Cancels a run that is `in_progress`.
//
run_object_t*
AssistantsAPI_cancelRun(apiClient_t *apiClient, char *thread_id, char *run_id);


// Create an assistant with a model and instructions.
//
assistant_object_t*
AssistantsAPI_createAssistant(apiClient_t *apiClient, create_assistant_request_t *create_assistant_request);


// Create an assistant file by attaching a [File](/docs/api-reference/files) to an [assistant](/docs/api-reference/assistants).
//
assistant_file_object_t*
AssistantsAPI_createAssistantFile(apiClient_t *apiClient, char *assistant_id, create_assistant_file_request_t *create_assistant_file_request);


// Create a message.
//
message_object_t*
AssistantsAPI_createMessage(apiClient_t *apiClient, char *thread_id, create_message_request_t *create_message_request);


// Create a run.
//
run_object_t*
AssistantsAPI_createRun(apiClient_t *apiClient, char *thread_id, create_run_request_t *create_run_request);


// Create a thread.
//
thread_object_t*
AssistantsAPI_createThread(apiClient_t *apiClient, create_thread_request_t *create_thread_request);


// Create a thread and run it in one request.
//
run_object_t*
AssistantsAPI_createThreadAndRun(apiClient_t *apiClient, create_thread_and_run_request_t *create_thread_and_run_request);


// Delete an assistant.
//
delete_assistant_response_t*
AssistantsAPI_deleteAssistant(apiClient_t *apiClient, char *assistant_id);


// Delete an assistant file.
//
delete_assistant_file_response_t*
AssistantsAPI_deleteAssistantFile(apiClient_t *apiClient, char *assistant_id, char *file_id);


// Delete a thread.
//
delete_thread_response_t*
AssistantsAPI_deleteThread(apiClient_t *apiClient, char *thread_id);


// Retrieves an assistant.
//
assistant_object_t*
AssistantsAPI_getAssistant(apiClient_t *apiClient, char *assistant_id);


// Retrieves an AssistantFile.
//
assistant_file_object_t*
AssistantsAPI_getAssistantFile(apiClient_t *apiClient, char *assistant_id, char *file_id);


// Retrieve a message.
//
message_object_t*
AssistantsAPI_getMessage(apiClient_t *apiClient, char *thread_id, char *message_id);


// Retrieves a message file.
//
message_file_object_t*
AssistantsAPI_getMessageFile(apiClient_t *apiClient, char *thread_id, char *message_id, char *file_id);


// Retrieves a run.
//
run_object_t*
AssistantsAPI_getRun(apiClient_t *apiClient, char *thread_id, char *run_id);


// Retrieves a run step.
//
run_step_object_t*
AssistantsAPI_getRunStep(apiClient_t *apiClient, char *thread_id, char *run_id, char *step_id);


// Retrieves a thread.
//
thread_object_t*
AssistantsAPI_getThread(apiClient_t *apiClient, char *thread_id);


// Returns a list of assistant files.
//
list_assistant_files_response_t*
AssistantsAPI_listAssistantFiles(apiClient_t *apiClient, char *assistant_id, int *limit, openai_api_listAssistantFiles_order_e order, char *after, char *before);


// Returns a list of assistants.
//
list_assistants_response_t*
AssistantsAPI_listAssistants(apiClient_t *apiClient, int *limit, openai_api_listAssistants_order_e order, char *after, char *before);


// Returns a list of message files.
//
list_message_files_response_t*
AssistantsAPI_listMessageFiles(apiClient_t *apiClient, char *thread_id, char *message_id, int *limit, openai_api_listMessageFiles_order_e order, char *after, char *before);


// Returns a list of messages for a given thread.
//
list_messages_response_t*
AssistantsAPI_listMessages(apiClient_t *apiClient, char *thread_id, int *limit, openai_api_listMessages_order_e order, char *after, char *before, char *run_id);


// Returns a list of run steps belonging to a run.
//
list_run_steps_response_t*
AssistantsAPI_listRunSteps(apiClient_t *apiClient, char *thread_id, char *run_id, int *limit, openai_api_listRunSteps_order_e order, char *after, char *before);


// Returns a list of runs belonging to a thread.
//
list_runs_response_t*
AssistantsAPI_listRuns(apiClient_t *apiClient, char *thread_id, int *limit, openai_api_listRuns_order_e order, char *after, char *before);


// Modifies an assistant.
//
assistant_object_t*
AssistantsAPI_modifyAssistant(apiClient_t *apiClient, char *assistant_id, modify_assistant_request_t *modify_assistant_request);


// Modifies a message.
//
message_object_t*
AssistantsAPI_modifyMessage(apiClient_t *apiClient, char *thread_id, char *message_id, modify_message_request_t *modify_message_request);


// Modifies a run.
//
run_object_t*
AssistantsAPI_modifyRun(apiClient_t *apiClient, char *thread_id, char *run_id, modify_run_request_t *modify_run_request);


// Modifies a thread.
//
thread_object_t*
AssistantsAPI_modifyThread(apiClient_t *apiClient, char *thread_id, modify_thread_request_t *modify_thread_request);


// When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they're all completed. All outputs must be submitted in a single request. 
//
run_object_t*
AssistantsAPI_submitToolOuputsToRun(apiClient_t *apiClient, char *thread_id, char *run_id, submit_tool_outputs_run_request_t *submit_tool_outputs_run_request);


