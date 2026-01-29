#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>

#include "AssistantsAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define MAX_NUMBER_LENGTH_LONG 21

// Functions for enum ORDER for AssistantsAPI_listAssistantFiles

static char* listAssistantFiles_ORDER_ToString(openai_api_listAssistantFiles_order_e ORDER){
    char *ORDERArray[] =  { "NULL", "asc", "desc" };
    return ORDERArray[ORDER];
}

static openai_api_listAssistantFiles_order_e listAssistantFiles_ORDER_FromString(char* ORDER){
    int stringToReturn = 0;
    char *ORDERArray[] =  { "NULL", "asc", "desc" };
    size_t sizeofArray = sizeof(ORDERArray) / sizeof(ORDERArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(ORDER, ORDERArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function listAssistantFiles_ORDER_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *listAssistantFiles_ORDER_convertToJSON(openai_api_listAssistantFiles_order_e ORDER) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "order", listAssistantFiles_ORDER_ToString(ORDER)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function listAssistantFiles_ORDER_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static openai_api_listAssistantFiles_order_e listAssistantFiles_ORDER_parseFromJSON(cJSON* ORDERJSON) {
    openai_api_listAssistantFiles_order_e ORDERVariable = 0;
    cJSON *ORDERVar = cJSON_GetObjectItemCaseSensitive(ORDERJSON, "order");
    if(!cJSON_IsString(ORDERVar) || (ORDERVar->valuestring == NULL))
    {
        goto end;
    }
    ORDERVariable = listAssistantFiles_ORDER_FromString(ORDERVar->valuestring);
    return ORDERVariable;
end:
    return 0;
}
*/

// Functions for enum ORDER for AssistantsAPI_listAssistants

static char* listAssistants_ORDER_ToString(openai_api_listAssistants_order_e ORDER){
    char *ORDERArray[] =  { "NULL", "asc", "desc" };
    return ORDERArray[ORDER];
}

static openai_api_listAssistants_order_e listAssistants_ORDER_FromString(char* ORDER){
    int stringToReturn = 0;
    char *ORDERArray[] =  { "NULL", "asc", "desc" };
    size_t sizeofArray = sizeof(ORDERArray) / sizeof(ORDERArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(ORDER, ORDERArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function listAssistants_ORDER_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *listAssistants_ORDER_convertToJSON(openai_api_listAssistants_order_e ORDER) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "order", listAssistants_ORDER_ToString(ORDER)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function listAssistants_ORDER_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static openai_api_listAssistants_order_e listAssistants_ORDER_parseFromJSON(cJSON* ORDERJSON) {
    openai_api_listAssistants_order_e ORDERVariable = 0;
    cJSON *ORDERVar = cJSON_GetObjectItemCaseSensitive(ORDERJSON, "order");
    if(!cJSON_IsString(ORDERVar) || (ORDERVar->valuestring == NULL))
    {
        goto end;
    }
    ORDERVariable = listAssistants_ORDER_FromString(ORDERVar->valuestring);
    return ORDERVariable;
end:
    return 0;
}
*/

// Functions for enum ORDER for AssistantsAPI_listMessageFiles

static char* listMessageFiles_ORDER_ToString(openai_api_listMessageFiles_order_e ORDER){
    char *ORDERArray[] =  { "NULL", "asc", "desc" };
    return ORDERArray[ORDER];
}

static openai_api_listMessageFiles_order_e listMessageFiles_ORDER_FromString(char* ORDER){
    int stringToReturn = 0;
    char *ORDERArray[] =  { "NULL", "asc", "desc" };
    size_t sizeofArray = sizeof(ORDERArray) / sizeof(ORDERArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(ORDER, ORDERArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function listMessageFiles_ORDER_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *listMessageFiles_ORDER_convertToJSON(openai_api_listMessageFiles_order_e ORDER) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "order", listMessageFiles_ORDER_ToString(ORDER)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function listMessageFiles_ORDER_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static openai_api_listMessageFiles_order_e listMessageFiles_ORDER_parseFromJSON(cJSON* ORDERJSON) {
    openai_api_listMessageFiles_order_e ORDERVariable = 0;
    cJSON *ORDERVar = cJSON_GetObjectItemCaseSensitive(ORDERJSON, "order");
    if(!cJSON_IsString(ORDERVar) || (ORDERVar->valuestring == NULL))
    {
        goto end;
    }
    ORDERVariable = listMessageFiles_ORDER_FromString(ORDERVar->valuestring);
    return ORDERVariable;
end:
    return 0;
}
*/

// Functions for enum ORDER for AssistantsAPI_listMessages

static char* listMessages_ORDER_ToString(openai_api_listMessages_order_e ORDER){
    char *ORDERArray[] =  { "NULL", "asc", "desc" };
    return ORDERArray[ORDER];
}

static openai_api_listMessages_order_e listMessages_ORDER_FromString(char* ORDER){
    int stringToReturn = 0;
    char *ORDERArray[] =  { "NULL", "asc", "desc" };
    size_t sizeofArray = sizeof(ORDERArray) / sizeof(ORDERArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(ORDER, ORDERArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function listMessages_ORDER_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *listMessages_ORDER_convertToJSON(openai_api_listMessages_order_e ORDER) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "order", listMessages_ORDER_ToString(ORDER)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function listMessages_ORDER_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static openai_api_listMessages_order_e listMessages_ORDER_parseFromJSON(cJSON* ORDERJSON) {
    openai_api_listMessages_order_e ORDERVariable = 0;
    cJSON *ORDERVar = cJSON_GetObjectItemCaseSensitive(ORDERJSON, "order");
    if(!cJSON_IsString(ORDERVar) || (ORDERVar->valuestring == NULL))
    {
        goto end;
    }
    ORDERVariable = listMessages_ORDER_FromString(ORDERVar->valuestring);
    return ORDERVariable;
end:
    return 0;
}
*/

// Functions for enum ORDER for AssistantsAPI_listRunSteps

static char* listRunSteps_ORDER_ToString(openai_api_listRunSteps_order_e ORDER){
    char *ORDERArray[] =  { "NULL", "asc", "desc" };
    return ORDERArray[ORDER];
}

static openai_api_listRunSteps_order_e listRunSteps_ORDER_FromString(char* ORDER){
    int stringToReturn = 0;
    char *ORDERArray[] =  { "NULL", "asc", "desc" };
    size_t sizeofArray = sizeof(ORDERArray) / sizeof(ORDERArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(ORDER, ORDERArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function listRunSteps_ORDER_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *listRunSteps_ORDER_convertToJSON(openai_api_listRunSteps_order_e ORDER) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "order", listRunSteps_ORDER_ToString(ORDER)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function listRunSteps_ORDER_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static openai_api_listRunSteps_order_e listRunSteps_ORDER_parseFromJSON(cJSON* ORDERJSON) {
    openai_api_listRunSteps_order_e ORDERVariable = 0;
    cJSON *ORDERVar = cJSON_GetObjectItemCaseSensitive(ORDERJSON, "order");
    if(!cJSON_IsString(ORDERVar) || (ORDERVar->valuestring == NULL))
    {
        goto end;
    }
    ORDERVariable = listRunSteps_ORDER_FromString(ORDERVar->valuestring);
    return ORDERVariable;
end:
    return 0;
}
*/

// Functions for enum ORDER for AssistantsAPI_listRuns

static char* listRuns_ORDER_ToString(openai_api_listRuns_order_e ORDER){
    char *ORDERArray[] =  { "NULL", "asc", "desc" };
    return ORDERArray[ORDER];
}

static openai_api_listRuns_order_e listRuns_ORDER_FromString(char* ORDER){
    int stringToReturn = 0;
    char *ORDERArray[] =  { "NULL", "asc", "desc" };
    size_t sizeofArray = sizeof(ORDERArray) / sizeof(ORDERArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(ORDER, ORDERArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function listRuns_ORDER_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *listRuns_ORDER_convertToJSON(openai_api_listRuns_order_e ORDER) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "order", listRuns_ORDER_ToString(ORDER)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function listRuns_ORDER_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static openai_api_listRuns_order_e listRuns_ORDER_parseFromJSON(cJSON* ORDERJSON) {
    openai_api_listRuns_order_e ORDERVariable = 0;
    cJSON *ORDERVar = cJSON_GetObjectItemCaseSensitive(ORDERJSON, "order");
    if(!cJSON_IsString(ORDERVar) || (ORDERVar->valuestring == NULL))
    {
        goto end;
    }
    ORDERVariable = listRuns_ORDER_FromString(ORDERVar->valuestring);
    return ORDERVariable;
end:
    return 0;
}
*/


// Cancels a run that is `in_progress`.
//
run_object_t*
AssistantsAPI_cancelRun(apiClient_t *apiClient, char *thread_id, char *run_id)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/threads/{thread_id}/runs/{run_id}/cancel");

    if(!thread_id)
        goto end;
    if(!run_id)
        goto end;


    // Path Params
    long sizeOfPathParams_thread_id = strlen(thread_id)+3 + strlen(run_id)+3 + sizeof("{ thread_id }") - 1;
    if(thread_id == NULL) {
        goto end;
    }
    char* localVarToReplace_thread_id = malloc(sizeOfPathParams_thread_id);
    sprintf(localVarToReplace_thread_id, "{%s}", "thread_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_thread_id, thread_id);

    // Path Params
    long sizeOfPathParams_run_id = strlen(thread_id)+3 + strlen(run_id)+3 + sizeof("{ run_id }") - 1;
    if(run_id == NULL) {
        goto end;
    }
    char* localVarToReplace_run_id = malloc(sizeOfPathParams_run_id);
    sprintf(localVarToReplace_run_id, "{%s}", "run_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_run_id, run_id);


    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "POST");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","OK");
    //}
    //nonprimitive not container
    run_object_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *AssistantsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = run_object_parseFromJSON(AssistantsAPIlocalVarJSON);
        cJSON_Delete(AssistantsAPIlocalVarJSON);
        if(elementToReturn == NULL) {
            // return 0;
        }
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_thread_id);
    free(localVarToReplace_run_id);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Create an assistant with a model and instructions.
//
assistant_object_t*
AssistantsAPI_createAssistant(apiClient_t *apiClient, create_assistant_request_t *create_assistant_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/assistants");





    // Body Param
    cJSON *localVarSingleItemJSON_create_assistant_request = NULL;
    if (create_assistant_request != NULL)
    {
        //not string, not binary
        localVarSingleItemJSON_create_assistant_request = create_assistant_request_convertToJSON(create_assistant_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_create_assistant_request);
        localVarBodyLength = strlen(localVarBodyParameters);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    list_addElement(localVarContentType,"application/json"); //consumes
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "POST");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","OK");
    //}
    //nonprimitive not container
    assistant_object_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *AssistantsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = assistant_object_parseFromJSON(AssistantsAPIlocalVarJSON);
        cJSON_Delete(AssistantsAPIlocalVarJSON);
        if(elementToReturn == NULL) {
            // return 0;
        }
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    if (localVarSingleItemJSON_create_assistant_request) {
        cJSON_Delete(localVarSingleItemJSON_create_assistant_request);
        localVarSingleItemJSON_create_assistant_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Create an assistant file by attaching a [File](/docs/api-reference/files) to an [assistant](/docs/api-reference/assistants).
//
assistant_file_object_t*
AssistantsAPI_createAssistantFile(apiClient_t *apiClient, char *assistant_id, create_assistant_file_request_t *create_assistant_file_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/assistants/{assistant_id}/files");

    if(!assistant_id)
        goto end;


    // Path Params
    long sizeOfPathParams_assistant_id = strlen(assistant_id)+3 + sizeof("{ assistant_id }") - 1;
    if(assistant_id == NULL) {
        goto end;
    }
    char* localVarToReplace_assistant_id = malloc(sizeOfPathParams_assistant_id);
    sprintf(localVarToReplace_assistant_id, "{%s}", "assistant_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_assistant_id, assistant_id);



    // Body Param
    cJSON *localVarSingleItemJSON_create_assistant_file_request = NULL;
    if (create_assistant_file_request != NULL)
    {
        //not string, not binary
        localVarSingleItemJSON_create_assistant_file_request = create_assistant_file_request_convertToJSON(create_assistant_file_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_create_assistant_file_request);
        localVarBodyLength = strlen(localVarBodyParameters);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    list_addElement(localVarContentType,"application/json"); //consumes
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "POST");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","OK");
    //}
    //nonprimitive not container
    assistant_file_object_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *AssistantsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = assistant_file_object_parseFromJSON(AssistantsAPIlocalVarJSON);
        cJSON_Delete(AssistantsAPIlocalVarJSON);
        if(elementToReturn == NULL) {
            // return 0;
        }
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_assistant_id);
    if (localVarSingleItemJSON_create_assistant_file_request) {
        cJSON_Delete(localVarSingleItemJSON_create_assistant_file_request);
        localVarSingleItemJSON_create_assistant_file_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Create a message.
//
message_object_t*
AssistantsAPI_createMessage(apiClient_t *apiClient, char *thread_id, create_message_request_t *create_message_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/threads/{thread_id}/messages");

    if(!thread_id)
        goto end;


    // Path Params
    long sizeOfPathParams_thread_id = strlen(thread_id)+3 + sizeof("{ thread_id }") - 1;
    if(thread_id == NULL) {
        goto end;
    }
    char* localVarToReplace_thread_id = malloc(sizeOfPathParams_thread_id);
    sprintf(localVarToReplace_thread_id, "{%s}", "thread_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_thread_id, thread_id);



    // Body Param
    cJSON *localVarSingleItemJSON_create_message_request = NULL;
    if (create_message_request != NULL)
    {
        //not string, not binary
        localVarSingleItemJSON_create_message_request = create_message_request_convertToJSON(create_message_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_create_message_request);
        localVarBodyLength = strlen(localVarBodyParameters);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    list_addElement(localVarContentType,"application/json"); //consumes
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "POST");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","OK");
    //}
    //nonprimitive not container
    message_object_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *AssistantsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = message_object_parseFromJSON(AssistantsAPIlocalVarJSON);
        cJSON_Delete(AssistantsAPIlocalVarJSON);
        if(elementToReturn == NULL) {
            // return 0;
        }
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_thread_id);
    if (localVarSingleItemJSON_create_message_request) {
        cJSON_Delete(localVarSingleItemJSON_create_message_request);
        localVarSingleItemJSON_create_message_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Create a run.
//
run_object_t*
AssistantsAPI_createRun(apiClient_t *apiClient, char *thread_id, create_run_request_t *create_run_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/threads/{thread_id}/runs");

    if(!thread_id)
        goto end;


    // Path Params
    long sizeOfPathParams_thread_id = strlen(thread_id)+3 + sizeof("{ thread_id }") - 1;
    if(thread_id == NULL) {
        goto end;
    }
    char* localVarToReplace_thread_id = malloc(sizeOfPathParams_thread_id);
    sprintf(localVarToReplace_thread_id, "{%s}", "thread_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_thread_id, thread_id);



    // Body Param
    cJSON *localVarSingleItemJSON_create_run_request = NULL;
    if (create_run_request != NULL)
    {
        //not string, not binary
        localVarSingleItemJSON_create_run_request = create_run_request_convertToJSON(create_run_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_create_run_request);
        localVarBodyLength = strlen(localVarBodyParameters);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    list_addElement(localVarContentType,"application/json"); //consumes
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "POST");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","OK");
    //}
    //nonprimitive not container
    run_object_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *AssistantsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = run_object_parseFromJSON(AssistantsAPIlocalVarJSON);
        cJSON_Delete(AssistantsAPIlocalVarJSON);
        if(elementToReturn == NULL) {
            // return 0;
        }
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_thread_id);
    if (localVarSingleItemJSON_create_run_request) {
        cJSON_Delete(localVarSingleItemJSON_create_run_request);
        localVarSingleItemJSON_create_run_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Create a thread.
//
thread_object_t*
AssistantsAPI_createThread(apiClient_t *apiClient, create_thread_request_t *create_thread_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/threads");





    // Body Param
    cJSON *localVarSingleItemJSON_create_thread_request = NULL;
    if (create_thread_request != NULL)
    {
        //not string, not binary
        localVarSingleItemJSON_create_thread_request = create_thread_request_convertToJSON(create_thread_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_create_thread_request);
        localVarBodyLength = strlen(localVarBodyParameters);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    list_addElement(localVarContentType,"application/json"); //consumes
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "POST");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","OK");
    //}
    //nonprimitive not container
    thread_object_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *AssistantsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = thread_object_parseFromJSON(AssistantsAPIlocalVarJSON);
        cJSON_Delete(AssistantsAPIlocalVarJSON);
        if(elementToReturn == NULL) {
            // return 0;
        }
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    if (localVarSingleItemJSON_create_thread_request) {
        cJSON_Delete(localVarSingleItemJSON_create_thread_request);
        localVarSingleItemJSON_create_thread_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Create a thread and run it in one request.
//
run_object_t*
AssistantsAPI_createThreadAndRun(apiClient_t *apiClient, create_thread_and_run_request_t *create_thread_and_run_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/threads/runs");





    // Body Param
    cJSON *localVarSingleItemJSON_create_thread_and_run_request = NULL;
    if (create_thread_and_run_request != NULL)
    {
        //not string, not binary
        localVarSingleItemJSON_create_thread_and_run_request = create_thread_and_run_request_convertToJSON(create_thread_and_run_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_create_thread_and_run_request);
        localVarBodyLength = strlen(localVarBodyParameters);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    list_addElement(localVarContentType,"application/json"); //consumes
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "POST");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","OK");
    //}
    //nonprimitive not container
    run_object_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *AssistantsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = run_object_parseFromJSON(AssistantsAPIlocalVarJSON);
        cJSON_Delete(AssistantsAPIlocalVarJSON);
        if(elementToReturn == NULL) {
            // return 0;
        }
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    if (localVarSingleItemJSON_create_thread_and_run_request) {
        cJSON_Delete(localVarSingleItemJSON_create_thread_and_run_request);
        localVarSingleItemJSON_create_thread_and_run_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Delete an assistant.
//
delete_assistant_response_t*
AssistantsAPI_deleteAssistant(apiClient_t *apiClient, char *assistant_id)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/assistants/{assistant_id}");

    if(!assistant_id)
        goto end;


    // Path Params
    long sizeOfPathParams_assistant_id = strlen(assistant_id)+3 + sizeof("{ assistant_id }") - 1;
    if(assistant_id == NULL) {
        goto end;
    }
    char* localVarToReplace_assistant_id = malloc(sizeOfPathParams_assistant_id);
    sprintf(localVarToReplace_assistant_id, "{%s}", "assistant_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_assistant_id, assistant_id);


    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "DELETE");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","OK");
    //}
    //nonprimitive not container
    delete_assistant_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *AssistantsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = delete_assistant_response_parseFromJSON(AssistantsAPIlocalVarJSON);
        cJSON_Delete(AssistantsAPIlocalVarJSON);
        if(elementToReturn == NULL) {
            // return 0;
        }
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_assistant_id);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Delete an assistant file.
//
delete_assistant_file_response_t*
AssistantsAPI_deleteAssistantFile(apiClient_t *apiClient, char *assistant_id, char *file_id)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/assistants/{assistant_id}/files/{file_id}");

    if(!assistant_id)
        goto end;
    if(!file_id)
        goto end;


    // Path Params
    long sizeOfPathParams_assistant_id = strlen(assistant_id)+3 + strlen(file_id)+3 + sizeof("{ assistant_id }") - 1;
    if(assistant_id == NULL) {
        goto end;
    }
    char* localVarToReplace_assistant_id = malloc(sizeOfPathParams_assistant_id);
    sprintf(localVarToReplace_assistant_id, "{%s}", "assistant_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_assistant_id, assistant_id);

    // Path Params
    long sizeOfPathParams_file_id = strlen(assistant_id)+3 + strlen(file_id)+3 + sizeof("{ file_id }") - 1;
    if(file_id == NULL) {
        goto end;
    }
    char* localVarToReplace_file_id = malloc(sizeOfPathParams_file_id);
    sprintf(localVarToReplace_file_id, "{%s}", "file_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_file_id, file_id);


    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "DELETE");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","OK");
    //}
    //nonprimitive not container
    delete_assistant_file_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *AssistantsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = delete_assistant_file_response_parseFromJSON(AssistantsAPIlocalVarJSON);
        cJSON_Delete(AssistantsAPIlocalVarJSON);
        if(elementToReturn == NULL) {
            // return 0;
        }
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_assistant_id);
    free(localVarToReplace_file_id);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Delete a thread.
//
delete_thread_response_t*
AssistantsAPI_deleteThread(apiClient_t *apiClient, char *thread_id)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/threads/{thread_id}");

    if(!thread_id)
        goto end;


    // Path Params
    long sizeOfPathParams_thread_id = strlen(thread_id)+3 + sizeof("{ thread_id }") - 1;
    if(thread_id == NULL) {
        goto end;
    }
    char* localVarToReplace_thread_id = malloc(sizeOfPathParams_thread_id);
    sprintf(localVarToReplace_thread_id, "{%s}", "thread_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_thread_id, thread_id);


    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "DELETE");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","OK");
    //}
    //nonprimitive not container
    delete_thread_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *AssistantsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = delete_thread_response_parseFromJSON(AssistantsAPIlocalVarJSON);
        cJSON_Delete(AssistantsAPIlocalVarJSON);
        if(elementToReturn == NULL) {
            // return 0;
        }
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_thread_id);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Retrieves an assistant.
//
assistant_object_t*
AssistantsAPI_getAssistant(apiClient_t *apiClient, char *assistant_id)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/assistants/{assistant_id}");

    if(!assistant_id)
        goto end;


    // Path Params
    long sizeOfPathParams_assistant_id = strlen(assistant_id)+3 + sizeof("{ assistant_id }") - 1;
    if(assistant_id == NULL) {
        goto end;
    }
    char* localVarToReplace_assistant_id = malloc(sizeOfPathParams_assistant_id);
    sprintf(localVarToReplace_assistant_id, "{%s}", "assistant_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_assistant_id, assistant_id);


    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","OK");
    //}
    //nonprimitive not container
    assistant_object_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *AssistantsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = assistant_object_parseFromJSON(AssistantsAPIlocalVarJSON);
        cJSON_Delete(AssistantsAPIlocalVarJSON);
        if(elementToReturn == NULL) {
            // return 0;
        }
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_assistant_id);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Retrieves an AssistantFile.
//
assistant_file_object_t*
AssistantsAPI_getAssistantFile(apiClient_t *apiClient, char *assistant_id, char *file_id)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/assistants/{assistant_id}/files/{file_id}");

    if(!assistant_id)
        goto end;
    if(!file_id)
        goto end;


    // Path Params
    long sizeOfPathParams_assistant_id = strlen(assistant_id)+3 + strlen(file_id)+3 + sizeof("{ assistant_id }") - 1;
    if(assistant_id == NULL) {
        goto end;
    }
    char* localVarToReplace_assistant_id = malloc(sizeOfPathParams_assistant_id);
    sprintf(localVarToReplace_assistant_id, "{%s}", "assistant_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_assistant_id, assistant_id);

    // Path Params
    long sizeOfPathParams_file_id = strlen(assistant_id)+3 + strlen(file_id)+3 + sizeof("{ file_id }") - 1;
    if(file_id == NULL) {
        goto end;
    }
    char* localVarToReplace_file_id = malloc(sizeOfPathParams_file_id);
    sprintf(localVarToReplace_file_id, "{%s}", "file_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_file_id, file_id);


    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","OK");
    //}
    //nonprimitive not container
    assistant_file_object_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *AssistantsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = assistant_file_object_parseFromJSON(AssistantsAPIlocalVarJSON);
        cJSON_Delete(AssistantsAPIlocalVarJSON);
        if(elementToReturn == NULL) {
            // return 0;
        }
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_assistant_id);
    free(localVarToReplace_file_id);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Retrieve a message.
//
message_object_t*
AssistantsAPI_getMessage(apiClient_t *apiClient, char *thread_id, char *message_id)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/threads/{thread_id}/messages/{message_id}");

    if(!thread_id)
        goto end;
    if(!message_id)
        goto end;


    // Path Params
    long sizeOfPathParams_thread_id = strlen(thread_id)+3 + strlen(message_id)+3 + sizeof("{ thread_id }") - 1;
    if(thread_id == NULL) {
        goto end;
    }
    char* localVarToReplace_thread_id = malloc(sizeOfPathParams_thread_id);
    sprintf(localVarToReplace_thread_id, "{%s}", "thread_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_thread_id, thread_id);

    // Path Params
    long sizeOfPathParams_message_id = strlen(thread_id)+3 + strlen(message_id)+3 + sizeof("{ message_id }") - 1;
    if(message_id == NULL) {
        goto end;
    }
    char* localVarToReplace_message_id = malloc(sizeOfPathParams_message_id);
    sprintf(localVarToReplace_message_id, "{%s}", "message_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_message_id, message_id);


    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","OK");
    //}
    //nonprimitive not container
    message_object_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *AssistantsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = message_object_parseFromJSON(AssistantsAPIlocalVarJSON);
        cJSON_Delete(AssistantsAPIlocalVarJSON);
        if(elementToReturn == NULL) {
            // return 0;
        }
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_thread_id);
    free(localVarToReplace_message_id);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Retrieves a message file.
//
message_file_object_t*
AssistantsAPI_getMessageFile(apiClient_t *apiClient, char *thread_id, char *message_id, char *file_id)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/threads/{thread_id}/messages/{message_id}/files/{file_id}");

    if(!thread_id)
        goto end;
    if(!message_id)
        goto end;
    if(!file_id)
        goto end;


    // Path Params
    long sizeOfPathParams_thread_id = strlen(thread_id)+3 + strlen(message_id)+3 + strlen(file_id)+3 + sizeof("{ thread_id }") - 1;
    if(thread_id == NULL) {
        goto end;
    }
    char* localVarToReplace_thread_id = malloc(sizeOfPathParams_thread_id);
    sprintf(localVarToReplace_thread_id, "{%s}", "thread_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_thread_id, thread_id);

    // Path Params
    long sizeOfPathParams_message_id = strlen(thread_id)+3 + strlen(message_id)+3 + strlen(file_id)+3 + sizeof("{ message_id }") - 1;
    if(message_id == NULL) {
        goto end;
    }
    char* localVarToReplace_message_id = malloc(sizeOfPathParams_message_id);
    sprintf(localVarToReplace_message_id, "{%s}", "message_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_message_id, message_id);

    // Path Params
    long sizeOfPathParams_file_id = strlen(thread_id)+3 + strlen(message_id)+3 + strlen(file_id)+3 + sizeof("{ file_id }") - 1;
    if(file_id == NULL) {
        goto end;
    }
    char* localVarToReplace_file_id = malloc(sizeOfPathParams_file_id);
    sprintf(localVarToReplace_file_id, "{%s}", "file_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_file_id, file_id);


    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","OK");
    //}
    //nonprimitive not container
    message_file_object_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *AssistantsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = message_file_object_parseFromJSON(AssistantsAPIlocalVarJSON);
        cJSON_Delete(AssistantsAPIlocalVarJSON);
        if(elementToReturn == NULL) {
            // return 0;
        }
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_thread_id);
    free(localVarToReplace_message_id);
    free(localVarToReplace_file_id);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Retrieves a run.
//
run_object_t*
AssistantsAPI_getRun(apiClient_t *apiClient, char *thread_id, char *run_id)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/threads/{thread_id}/runs/{run_id}");

    if(!thread_id)
        goto end;
    if(!run_id)
        goto end;


    // Path Params
    long sizeOfPathParams_thread_id = strlen(thread_id)+3 + strlen(run_id)+3 + sizeof("{ thread_id }") - 1;
    if(thread_id == NULL) {
        goto end;
    }
    char* localVarToReplace_thread_id = malloc(sizeOfPathParams_thread_id);
    sprintf(localVarToReplace_thread_id, "{%s}", "thread_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_thread_id, thread_id);

    // Path Params
    long sizeOfPathParams_run_id = strlen(thread_id)+3 + strlen(run_id)+3 + sizeof("{ run_id }") - 1;
    if(run_id == NULL) {
        goto end;
    }
    char* localVarToReplace_run_id = malloc(sizeOfPathParams_run_id);
    sprintf(localVarToReplace_run_id, "{%s}", "run_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_run_id, run_id);


    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","OK");
    //}
    //nonprimitive not container
    run_object_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *AssistantsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = run_object_parseFromJSON(AssistantsAPIlocalVarJSON);
        cJSON_Delete(AssistantsAPIlocalVarJSON);
        if(elementToReturn == NULL) {
            // return 0;
        }
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_thread_id);
    free(localVarToReplace_run_id);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Retrieves a run step.
//
run_step_object_t*
AssistantsAPI_getRunStep(apiClient_t *apiClient, char *thread_id, char *run_id, char *step_id)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/threads/{thread_id}/runs/{run_id}/steps/{step_id}");

    if(!thread_id)
        goto end;
    if(!run_id)
        goto end;
    if(!step_id)
        goto end;


    // Path Params
    long sizeOfPathParams_thread_id = strlen(thread_id)+3 + strlen(run_id)+3 + strlen(step_id)+3 + sizeof("{ thread_id }") - 1;
    if(thread_id == NULL) {
        goto end;
    }
    char* localVarToReplace_thread_id = malloc(sizeOfPathParams_thread_id);
    sprintf(localVarToReplace_thread_id, "{%s}", "thread_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_thread_id, thread_id);

    // Path Params
    long sizeOfPathParams_run_id = strlen(thread_id)+3 + strlen(run_id)+3 + strlen(step_id)+3 + sizeof("{ run_id }") - 1;
    if(run_id == NULL) {
        goto end;
    }
    char* localVarToReplace_run_id = malloc(sizeOfPathParams_run_id);
    sprintf(localVarToReplace_run_id, "{%s}", "run_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_run_id, run_id);

    // Path Params
    long sizeOfPathParams_step_id = strlen(thread_id)+3 + strlen(run_id)+3 + strlen(step_id)+3 + sizeof("{ step_id }") - 1;
    if(step_id == NULL) {
        goto end;
    }
    char* localVarToReplace_step_id = malloc(sizeOfPathParams_step_id);
    sprintf(localVarToReplace_step_id, "{%s}", "step_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_step_id, step_id);


    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","OK");
    //}
    //nonprimitive not container
    run_step_object_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *AssistantsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = run_step_object_parseFromJSON(AssistantsAPIlocalVarJSON);
        cJSON_Delete(AssistantsAPIlocalVarJSON);
        if(elementToReturn == NULL) {
            // return 0;
        }
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_thread_id);
    free(localVarToReplace_run_id);
    free(localVarToReplace_step_id);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Retrieves a thread.
//
thread_object_t*
AssistantsAPI_getThread(apiClient_t *apiClient, char *thread_id)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/threads/{thread_id}");

    if(!thread_id)
        goto end;


    // Path Params
    long sizeOfPathParams_thread_id = strlen(thread_id)+3 + sizeof("{ thread_id }") - 1;
    if(thread_id == NULL) {
        goto end;
    }
    char* localVarToReplace_thread_id = malloc(sizeOfPathParams_thread_id);
    sprintf(localVarToReplace_thread_id, "{%s}", "thread_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_thread_id, thread_id);


    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","OK");
    //}
    //nonprimitive not container
    thread_object_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *AssistantsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = thread_object_parseFromJSON(AssistantsAPIlocalVarJSON);
        cJSON_Delete(AssistantsAPIlocalVarJSON);
        if(elementToReturn == NULL) {
            // return 0;
        }
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_thread_id);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Returns a list of assistant files.
//
list_assistant_files_response_t*
AssistantsAPI_listAssistantFiles(apiClient_t *apiClient, char *assistant_id, int *limit, openai_api_listAssistantFiles_order_e order, char *after, char *before)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/assistants/{assistant_id}/files");

    if(!assistant_id)
        goto end;


    // Path Params
    long sizeOfPathParams_assistant_id = strlen(assistant_id)+3 + sizeof("{ assistant_id }") - 1;
    if(assistant_id == NULL) {
        goto end;
    }
    char* localVarToReplace_assistant_id = malloc(sizeOfPathParams_assistant_id);
    sprintf(localVarToReplace_assistant_id, "{%s}", "assistant_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_assistant_id, assistant_id);



    // query parameters
    char *keyQuery_limit = NULL;
    char * valueQuery_limit = NULL;
    keyValuePair_t *keyPairQuery_limit = 0;
    if (limit)
    {
        keyQuery_limit = strdup("limit");
        valueQuery_limit = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_limit, MAX_NUMBER_LENGTH, "%d", *limit);
        keyPairQuery_limit = keyValuePair_create(keyQuery_limit, valueQuery_limit);
        list_addElement(localVarQueryParameters,keyPairQuery_limit);
    }

    // query parameters
    char *keyQuery_order = NULL;
    openai_api_listAssistantFiles_order_e valueQuery_order ;
    keyValuePair_t *keyPairQuery_order = 0;
    if (order)
    {
        keyQuery_order = strdup("order");
        valueQuery_order = (order);
        keyPairQuery_order = keyValuePair_create(keyQuery_order, strdup(listAssistantFiles_ORDER_ToString(
        valueQuery_order)));
        list_addElement(localVarQueryParameters,keyPairQuery_order);
    }

    // query parameters
    char *keyQuery_after = NULL;
    char * valueQuery_after = NULL;
    keyValuePair_t *keyPairQuery_after = 0;
    if (after)
    {
        keyQuery_after = strdup("after");
        valueQuery_after = strdup((after));
        keyPairQuery_after = keyValuePair_create(keyQuery_after, valueQuery_after);
        list_addElement(localVarQueryParameters,keyPairQuery_after);
    }

    // query parameters
    char *keyQuery_before = NULL;
    char * valueQuery_before = NULL;
    keyValuePair_t *keyPairQuery_before = 0;
    if (before)
    {
        keyQuery_before = strdup("before");
        valueQuery_before = strdup((before));
        keyPairQuery_before = keyValuePair_create(keyQuery_before, valueQuery_before);
        list_addElement(localVarQueryParameters,keyPairQuery_before);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","OK");
    //}
    //nonprimitive not container
    list_assistant_files_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *AssistantsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = list_assistant_files_response_parseFromJSON(AssistantsAPIlocalVarJSON);
        cJSON_Delete(AssistantsAPIlocalVarJSON);
        if(elementToReturn == NULL) {
            // return 0;
        }
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_freeList(localVarQueryParameters);
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_assistant_id);
    if(keyQuery_limit){
        free(keyQuery_limit);
        keyQuery_limit = NULL;
    }
    if(valueQuery_limit){
        free(valueQuery_limit);
        valueQuery_limit = NULL;
    }
    if(keyPairQuery_limit){
        keyValuePair_free(keyPairQuery_limit);
        keyPairQuery_limit = NULL;
    }
    if(keyQuery_order){
        free(keyQuery_order);
        keyQuery_order = NULL;
    }
    if(keyPairQuery_order){
        keyValuePair_free(keyPairQuery_order);
        keyPairQuery_order = NULL;
    }
    if(keyQuery_after){
        free(keyQuery_after);
        keyQuery_after = NULL;
    }
    if(valueQuery_after){
        free(valueQuery_after);
        valueQuery_after = NULL;
    }
    if(keyPairQuery_after){
        keyValuePair_free(keyPairQuery_after);
        keyPairQuery_after = NULL;
    }
    if(keyQuery_before){
        free(keyQuery_before);
        keyQuery_before = NULL;
    }
    if(valueQuery_before){
        free(valueQuery_before);
        valueQuery_before = NULL;
    }
    if(keyPairQuery_before){
        keyValuePair_free(keyPairQuery_before);
        keyPairQuery_before = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Returns a list of assistants.
//
list_assistants_response_t*
AssistantsAPI_listAssistants(apiClient_t *apiClient, int *limit, openai_api_listAssistants_order_e order, char *after, char *before)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/assistants");





    // query parameters
    char *keyQuery_limit = NULL;
    char * valueQuery_limit = NULL;
    keyValuePair_t *keyPairQuery_limit = 0;
    if (limit)
    {
        keyQuery_limit = strdup("limit");
        valueQuery_limit = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_limit, MAX_NUMBER_LENGTH, "%d", *limit);
        keyPairQuery_limit = keyValuePair_create(keyQuery_limit, valueQuery_limit);
        list_addElement(localVarQueryParameters,keyPairQuery_limit);
    }

    // query parameters
    char *keyQuery_order = NULL;
    openai_api_listAssistants_order_e valueQuery_order ;
    keyValuePair_t *keyPairQuery_order = 0;
    if (order)
    {
        keyQuery_order = strdup("order");
        valueQuery_order = (order);
        keyPairQuery_order = keyValuePair_create(keyQuery_order, strdup(listAssistants_ORDER_ToString(
        valueQuery_order)));
        list_addElement(localVarQueryParameters,keyPairQuery_order);
    }

    // query parameters
    char *keyQuery_after = NULL;
    char * valueQuery_after = NULL;
    keyValuePair_t *keyPairQuery_after = 0;
    if (after)
    {
        keyQuery_after = strdup("after");
        valueQuery_after = strdup((after));
        keyPairQuery_after = keyValuePair_create(keyQuery_after, valueQuery_after);
        list_addElement(localVarQueryParameters,keyPairQuery_after);
    }

    // query parameters
    char *keyQuery_before = NULL;
    char * valueQuery_before = NULL;
    keyValuePair_t *keyPairQuery_before = 0;
    if (before)
    {
        keyQuery_before = strdup("before");
        valueQuery_before = strdup((before));
        keyPairQuery_before = keyValuePair_create(keyQuery_before, valueQuery_before);
        list_addElement(localVarQueryParameters,keyPairQuery_before);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","OK");
    //}
    //nonprimitive not container
    list_assistants_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *AssistantsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = list_assistants_response_parseFromJSON(AssistantsAPIlocalVarJSON);
        cJSON_Delete(AssistantsAPIlocalVarJSON);
        if(elementToReturn == NULL) {
            // return 0;
        }
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_freeList(localVarQueryParameters);
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    if(keyQuery_limit){
        free(keyQuery_limit);
        keyQuery_limit = NULL;
    }
    if(valueQuery_limit){
        free(valueQuery_limit);
        valueQuery_limit = NULL;
    }
    if(keyPairQuery_limit){
        keyValuePair_free(keyPairQuery_limit);
        keyPairQuery_limit = NULL;
    }
    if(keyQuery_order){
        free(keyQuery_order);
        keyQuery_order = NULL;
    }
    if(keyPairQuery_order){
        keyValuePair_free(keyPairQuery_order);
        keyPairQuery_order = NULL;
    }
    if(keyQuery_after){
        free(keyQuery_after);
        keyQuery_after = NULL;
    }
    if(valueQuery_after){
        free(valueQuery_after);
        valueQuery_after = NULL;
    }
    if(keyPairQuery_after){
        keyValuePair_free(keyPairQuery_after);
        keyPairQuery_after = NULL;
    }
    if(keyQuery_before){
        free(keyQuery_before);
        keyQuery_before = NULL;
    }
    if(valueQuery_before){
        free(valueQuery_before);
        valueQuery_before = NULL;
    }
    if(keyPairQuery_before){
        keyValuePair_free(keyPairQuery_before);
        keyPairQuery_before = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Returns a list of message files.
//
list_message_files_response_t*
AssistantsAPI_listMessageFiles(apiClient_t *apiClient, char *thread_id, char *message_id, int *limit, openai_api_listMessageFiles_order_e order, char *after, char *before)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/threads/{thread_id}/messages/{message_id}/files");

    if(!thread_id)
        goto end;
    if(!message_id)
        goto end;


    // Path Params
    long sizeOfPathParams_thread_id = strlen(thread_id)+3 + strlen(message_id)+3 + sizeof("{ thread_id }") - 1;
    if(thread_id == NULL) {
        goto end;
    }
    char* localVarToReplace_thread_id = malloc(sizeOfPathParams_thread_id);
    sprintf(localVarToReplace_thread_id, "{%s}", "thread_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_thread_id, thread_id);

    // Path Params
    long sizeOfPathParams_message_id = strlen(thread_id)+3 + strlen(message_id)+3 + sizeof("{ message_id }") - 1;
    if(message_id == NULL) {
        goto end;
    }
    char* localVarToReplace_message_id = malloc(sizeOfPathParams_message_id);
    sprintf(localVarToReplace_message_id, "{%s}", "message_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_message_id, message_id);



    // query parameters
    char *keyQuery_limit = NULL;
    char * valueQuery_limit = NULL;
    keyValuePair_t *keyPairQuery_limit = 0;
    if (limit)
    {
        keyQuery_limit = strdup("limit");
        valueQuery_limit = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_limit, MAX_NUMBER_LENGTH, "%d", *limit);
        keyPairQuery_limit = keyValuePair_create(keyQuery_limit, valueQuery_limit);
        list_addElement(localVarQueryParameters,keyPairQuery_limit);
    }

    // query parameters
    char *keyQuery_order = NULL;
    openai_api_listMessageFiles_order_e valueQuery_order ;
    keyValuePair_t *keyPairQuery_order = 0;
    if (order)
    {
        keyQuery_order = strdup("order");
        valueQuery_order = (order);
        keyPairQuery_order = keyValuePair_create(keyQuery_order, strdup(listMessageFiles_ORDER_ToString(
        valueQuery_order)));
        list_addElement(localVarQueryParameters,keyPairQuery_order);
    }

    // query parameters
    char *keyQuery_after = NULL;
    char * valueQuery_after = NULL;
    keyValuePair_t *keyPairQuery_after = 0;
    if (after)
    {
        keyQuery_after = strdup("after");
        valueQuery_after = strdup((after));
        keyPairQuery_after = keyValuePair_create(keyQuery_after, valueQuery_after);
        list_addElement(localVarQueryParameters,keyPairQuery_after);
    }

    // query parameters
    char *keyQuery_before = NULL;
    char * valueQuery_before = NULL;
    keyValuePair_t *keyPairQuery_before = 0;
    if (before)
    {
        keyQuery_before = strdup("before");
        valueQuery_before = strdup((before));
        keyPairQuery_before = keyValuePair_create(keyQuery_before, valueQuery_before);
        list_addElement(localVarQueryParameters,keyPairQuery_before);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","OK");
    //}
    //nonprimitive not container
    list_message_files_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *AssistantsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = list_message_files_response_parseFromJSON(AssistantsAPIlocalVarJSON);
        cJSON_Delete(AssistantsAPIlocalVarJSON);
        if(elementToReturn == NULL) {
            // return 0;
        }
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_freeList(localVarQueryParameters);
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_thread_id);
    free(localVarToReplace_message_id);
    if(keyQuery_limit){
        free(keyQuery_limit);
        keyQuery_limit = NULL;
    }
    if(valueQuery_limit){
        free(valueQuery_limit);
        valueQuery_limit = NULL;
    }
    if(keyPairQuery_limit){
        keyValuePair_free(keyPairQuery_limit);
        keyPairQuery_limit = NULL;
    }
    if(keyQuery_order){
        free(keyQuery_order);
        keyQuery_order = NULL;
    }
    if(keyPairQuery_order){
        keyValuePair_free(keyPairQuery_order);
        keyPairQuery_order = NULL;
    }
    if(keyQuery_after){
        free(keyQuery_after);
        keyQuery_after = NULL;
    }
    if(valueQuery_after){
        free(valueQuery_after);
        valueQuery_after = NULL;
    }
    if(keyPairQuery_after){
        keyValuePair_free(keyPairQuery_after);
        keyPairQuery_after = NULL;
    }
    if(keyQuery_before){
        free(keyQuery_before);
        keyQuery_before = NULL;
    }
    if(valueQuery_before){
        free(valueQuery_before);
        valueQuery_before = NULL;
    }
    if(keyPairQuery_before){
        keyValuePair_free(keyPairQuery_before);
        keyPairQuery_before = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Returns a list of messages for a given thread.
//
list_messages_response_t*
AssistantsAPI_listMessages(apiClient_t *apiClient, char *thread_id, int *limit, openai_api_listMessages_order_e order, char *after, char *before, char *run_id)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/threads/{thread_id}/messages");

    if(!thread_id)
        goto end;


    // Path Params
    long sizeOfPathParams_thread_id = strlen(thread_id)+3 + sizeof("{ thread_id }") - 1;
    if(thread_id == NULL) {
        goto end;
    }
    char* localVarToReplace_thread_id = malloc(sizeOfPathParams_thread_id);
    sprintf(localVarToReplace_thread_id, "{%s}", "thread_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_thread_id, thread_id);



    // query parameters
    char *keyQuery_limit = NULL;
    char * valueQuery_limit = NULL;
    keyValuePair_t *keyPairQuery_limit = 0;
    if (limit)
    {
        keyQuery_limit = strdup("limit");
        valueQuery_limit = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_limit, MAX_NUMBER_LENGTH, "%d", *limit);
        keyPairQuery_limit = keyValuePair_create(keyQuery_limit, valueQuery_limit);
        list_addElement(localVarQueryParameters,keyPairQuery_limit);
    }

    // query parameters
    char *keyQuery_order = NULL;
    openai_api_listMessages_order_e valueQuery_order ;
    keyValuePair_t *keyPairQuery_order = 0;
    if (order)
    {
        keyQuery_order = strdup("order");
        valueQuery_order = (order);
        keyPairQuery_order = keyValuePair_create(keyQuery_order, strdup(listMessages_ORDER_ToString(
        valueQuery_order)));
        list_addElement(localVarQueryParameters,keyPairQuery_order);
    }

    // query parameters
    char *keyQuery_after = NULL;
    char * valueQuery_after = NULL;
    keyValuePair_t *keyPairQuery_after = 0;
    if (after)
    {
        keyQuery_after = strdup("after");
        valueQuery_after = strdup((after));
        keyPairQuery_after = keyValuePair_create(keyQuery_after, valueQuery_after);
        list_addElement(localVarQueryParameters,keyPairQuery_after);
    }

    // query parameters
    char *keyQuery_before = NULL;
    char * valueQuery_before = NULL;
    keyValuePair_t *keyPairQuery_before = 0;
    if (before)
    {
        keyQuery_before = strdup("before");
        valueQuery_before = strdup((before));
        keyPairQuery_before = keyValuePair_create(keyQuery_before, valueQuery_before);
        list_addElement(localVarQueryParameters,keyPairQuery_before);
    }

    // query parameters
    char *keyQuery_run_id = NULL;
    char * valueQuery_run_id = NULL;
    keyValuePair_t *keyPairQuery_run_id = 0;
    if (run_id)
    {
        keyQuery_run_id = strdup("run_id");
        valueQuery_run_id = strdup((run_id));
        keyPairQuery_run_id = keyValuePair_create(keyQuery_run_id, valueQuery_run_id);
        list_addElement(localVarQueryParameters,keyPairQuery_run_id);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","OK");
    //}
    //nonprimitive not container
    list_messages_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *AssistantsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = list_messages_response_parseFromJSON(AssistantsAPIlocalVarJSON);
        cJSON_Delete(AssistantsAPIlocalVarJSON);
        if(elementToReturn == NULL) {
            // return 0;
        }
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_freeList(localVarQueryParameters);
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_thread_id);
    if(keyQuery_limit){
        free(keyQuery_limit);
        keyQuery_limit = NULL;
    }
    if(valueQuery_limit){
        free(valueQuery_limit);
        valueQuery_limit = NULL;
    }
    if(keyPairQuery_limit){
        keyValuePair_free(keyPairQuery_limit);
        keyPairQuery_limit = NULL;
    }
    if(keyQuery_order){
        free(keyQuery_order);
        keyQuery_order = NULL;
    }
    if(keyPairQuery_order){
        keyValuePair_free(keyPairQuery_order);
        keyPairQuery_order = NULL;
    }
    if(keyQuery_after){
        free(keyQuery_after);
        keyQuery_after = NULL;
    }
    if(valueQuery_after){
        free(valueQuery_after);
        valueQuery_after = NULL;
    }
    if(keyPairQuery_after){
        keyValuePair_free(keyPairQuery_after);
        keyPairQuery_after = NULL;
    }
    if(keyQuery_before){
        free(keyQuery_before);
        keyQuery_before = NULL;
    }
    if(valueQuery_before){
        free(valueQuery_before);
        valueQuery_before = NULL;
    }
    if(keyPairQuery_before){
        keyValuePair_free(keyPairQuery_before);
        keyPairQuery_before = NULL;
    }
    if(keyQuery_run_id){
        free(keyQuery_run_id);
        keyQuery_run_id = NULL;
    }
    if(valueQuery_run_id){
        free(valueQuery_run_id);
        valueQuery_run_id = NULL;
    }
    if(keyPairQuery_run_id){
        keyValuePair_free(keyPairQuery_run_id);
        keyPairQuery_run_id = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Returns a list of run steps belonging to a run.
//
list_run_steps_response_t*
AssistantsAPI_listRunSteps(apiClient_t *apiClient, char *thread_id, char *run_id, int *limit, openai_api_listRunSteps_order_e order, char *after, char *before)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/threads/{thread_id}/runs/{run_id}/steps");

    if(!thread_id)
        goto end;
    if(!run_id)
        goto end;


    // Path Params
    long sizeOfPathParams_thread_id = strlen(thread_id)+3 + strlen(run_id)+3 + sizeof("{ thread_id }") - 1;
    if(thread_id == NULL) {
        goto end;
    }
    char* localVarToReplace_thread_id = malloc(sizeOfPathParams_thread_id);
    sprintf(localVarToReplace_thread_id, "{%s}", "thread_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_thread_id, thread_id);

    // Path Params
    long sizeOfPathParams_run_id = strlen(thread_id)+3 + strlen(run_id)+3 + sizeof("{ run_id }") - 1;
    if(run_id == NULL) {
        goto end;
    }
    char* localVarToReplace_run_id = malloc(sizeOfPathParams_run_id);
    sprintf(localVarToReplace_run_id, "{%s}", "run_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_run_id, run_id);



    // query parameters
    char *keyQuery_limit = NULL;
    char * valueQuery_limit = NULL;
    keyValuePair_t *keyPairQuery_limit = 0;
    if (limit)
    {
        keyQuery_limit = strdup("limit");
        valueQuery_limit = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_limit, MAX_NUMBER_LENGTH, "%d", *limit);
        keyPairQuery_limit = keyValuePair_create(keyQuery_limit, valueQuery_limit);
        list_addElement(localVarQueryParameters,keyPairQuery_limit);
    }

    // query parameters
    char *keyQuery_order = NULL;
    openai_api_listRunSteps_order_e valueQuery_order ;
    keyValuePair_t *keyPairQuery_order = 0;
    if (order)
    {
        keyQuery_order = strdup("order");
        valueQuery_order = (order);
        keyPairQuery_order = keyValuePair_create(keyQuery_order, strdup(listRunSteps_ORDER_ToString(
        valueQuery_order)));
        list_addElement(localVarQueryParameters,keyPairQuery_order);
    }

    // query parameters
    char *keyQuery_after = NULL;
    char * valueQuery_after = NULL;
    keyValuePair_t *keyPairQuery_after = 0;
    if (after)
    {
        keyQuery_after = strdup("after");
        valueQuery_after = strdup((after));
        keyPairQuery_after = keyValuePair_create(keyQuery_after, valueQuery_after);
        list_addElement(localVarQueryParameters,keyPairQuery_after);
    }

    // query parameters
    char *keyQuery_before = NULL;
    char * valueQuery_before = NULL;
    keyValuePair_t *keyPairQuery_before = 0;
    if (before)
    {
        keyQuery_before = strdup("before");
        valueQuery_before = strdup((before));
        keyPairQuery_before = keyValuePair_create(keyQuery_before, valueQuery_before);
        list_addElement(localVarQueryParameters,keyPairQuery_before);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","OK");
    //}
    //nonprimitive not container
    list_run_steps_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *AssistantsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = list_run_steps_response_parseFromJSON(AssistantsAPIlocalVarJSON);
        cJSON_Delete(AssistantsAPIlocalVarJSON);
        if(elementToReturn == NULL) {
            // return 0;
        }
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_freeList(localVarQueryParameters);
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_thread_id);
    free(localVarToReplace_run_id);
    if(keyQuery_limit){
        free(keyQuery_limit);
        keyQuery_limit = NULL;
    }
    if(valueQuery_limit){
        free(valueQuery_limit);
        valueQuery_limit = NULL;
    }
    if(keyPairQuery_limit){
        keyValuePair_free(keyPairQuery_limit);
        keyPairQuery_limit = NULL;
    }
    if(keyQuery_order){
        free(keyQuery_order);
        keyQuery_order = NULL;
    }
    if(keyPairQuery_order){
        keyValuePair_free(keyPairQuery_order);
        keyPairQuery_order = NULL;
    }
    if(keyQuery_after){
        free(keyQuery_after);
        keyQuery_after = NULL;
    }
    if(valueQuery_after){
        free(valueQuery_after);
        valueQuery_after = NULL;
    }
    if(keyPairQuery_after){
        keyValuePair_free(keyPairQuery_after);
        keyPairQuery_after = NULL;
    }
    if(keyQuery_before){
        free(keyQuery_before);
        keyQuery_before = NULL;
    }
    if(valueQuery_before){
        free(valueQuery_before);
        valueQuery_before = NULL;
    }
    if(keyPairQuery_before){
        keyValuePair_free(keyPairQuery_before);
        keyPairQuery_before = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Returns a list of runs belonging to a thread.
//
list_runs_response_t*
AssistantsAPI_listRuns(apiClient_t *apiClient, char *thread_id, int *limit, openai_api_listRuns_order_e order, char *after, char *before)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/threads/{thread_id}/runs");

    if(!thread_id)
        goto end;


    // Path Params
    long sizeOfPathParams_thread_id = strlen(thread_id)+3 + sizeof("{ thread_id }") - 1;
    if(thread_id == NULL) {
        goto end;
    }
    char* localVarToReplace_thread_id = malloc(sizeOfPathParams_thread_id);
    sprintf(localVarToReplace_thread_id, "{%s}", "thread_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_thread_id, thread_id);



    // query parameters
    char *keyQuery_limit = NULL;
    char * valueQuery_limit = NULL;
    keyValuePair_t *keyPairQuery_limit = 0;
    if (limit)
    {
        keyQuery_limit = strdup("limit");
        valueQuery_limit = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_limit, MAX_NUMBER_LENGTH, "%d", *limit);
        keyPairQuery_limit = keyValuePair_create(keyQuery_limit, valueQuery_limit);
        list_addElement(localVarQueryParameters,keyPairQuery_limit);
    }

    // query parameters
    char *keyQuery_order = NULL;
    openai_api_listRuns_order_e valueQuery_order ;
    keyValuePair_t *keyPairQuery_order = 0;
    if (order)
    {
        keyQuery_order = strdup("order");
        valueQuery_order = (order);
        keyPairQuery_order = keyValuePair_create(keyQuery_order, strdup(listRuns_ORDER_ToString(
        valueQuery_order)));
        list_addElement(localVarQueryParameters,keyPairQuery_order);
    }

    // query parameters
    char *keyQuery_after = NULL;
    char * valueQuery_after = NULL;
    keyValuePair_t *keyPairQuery_after = 0;
    if (after)
    {
        keyQuery_after = strdup("after");
        valueQuery_after = strdup((after));
        keyPairQuery_after = keyValuePair_create(keyQuery_after, valueQuery_after);
        list_addElement(localVarQueryParameters,keyPairQuery_after);
    }

    // query parameters
    char *keyQuery_before = NULL;
    char * valueQuery_before = NULL;
    keyValuePair_t *keyPairQuery_before = 0;
    if (before)
    {
        keyQuery_before = strdup("before");
        valueQuery_before = strdup((before));
        keyPairQuery_before = keyValuePair_create(keyQuery_before, valueQuery_before);
        list_addElement(localVarQueryParameters,keyPairQuery_before);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","OK");
    //}
    //nonprimitive not container
    list_runs_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *AssistantsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = list_runs_response_parseFromJSON(AssistantsAPIlocalVarJSON);
        cJSON_Delete(AssistantsAPIlocalVarJSON);
        if(elementToReturn == NULL) {
            // return 0;
        }
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_freeList(localVarQueryParameters);
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_thread_id);
    if(keyQuery_limit){
        free(keyQuery_limit);
        keyQuery_limit = NULL;
    }
    if(valueQuery_limit){
        free(valueQuery_limit);
        valueQuery_limit = NULL;
    }
    if(keyPairQuery_limit){
        keyValuePair_free(keyPairQuery_limit);
        keyPairQuery_limit = NULL;
    }
    if(keyQuery_order){
        free(keyQuery_order);
        keyQuery_order = NULL;
    }
    if(keyPairQuery_order){
        keyValuePair_free(keyPairQuery_order);
        keyPairQuery_order = NULL;
    }
    if(keyQuery_after){
        free(keyQuery_after);
        keyQuery_after = NULL;
    }
    if(valueQuery_after){
        free(valueQuery_after);
        valueQuery_after = NULL;
    }
    if(keyPairQuery_after){
        keyValuePair_free(keyPairQuery_after);
        keyPairQuery_after = NULL;
    }
    if(keyQuery_before){
        free(keyQuery_before);
        keyQuery_before = NULL;
    }
    if(valueQuery_before){
        free(valueQuery_before);
        valueQuery_before = NULL;
    }
    if(keyPairQuery_before){
        keyValuePair_free(keyPairQuery_before);
        keyPairQuery_before = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Modifies an assistant.
//
assistant_object_t*
AssistantsAPI_modifyAssistant(apiClient_t *apiClient, char *assistant_id, modify_assistant_request_t *modify_assistant_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/assistants/{assistant_id}");

    if(!assistant_id)
        goto end;


    // Path Params
    long sizeOfPathParams_assistant_id = strlen(assistant_id)+3 + sizeof("{ assistant_id }") - 1;
    if(assistant_id == NULL) {
        goto end;
    }
    char* localVarToReplace_assistant_id = malloc(sizeOfPathParams_assistant_id);
    sprintf(localVarToReplace_assistant_id, "{%s}", "assistant_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_assistant_id, assistant_id);



    // Body Param
    cJSON *localVarSingleItemJSON_modify_assistant_request = NULL;
    if (modify_assistant_request != NULL)
    {
        //not string, not binary
        localVarSingleItemJSON_modify_assistant_request = modify_assistant_request_convertToJSON(modify_assistant_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_modify_assistant_request);
        localVarBodyLength = strlen(localVarBodyParameters);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    list_addElement(localVarContentType,"application/json"); //consumes
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "POST");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","OK");
    //}
    //nonprimitive not container
    assistant_object_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *AssistantsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = assistant_object_parseFromJSON(AssistantsAPIlocalVarJSON);
        cJSON_Delete(AssistantsAPIlocalVarJSON);
        if(elementToReturn == NULL) {
            // return 0;
        }
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_assistant_id);
    if (localVarSingleItemJSON_modify_assistant_request) {
        cJSON_Delete(localVarSingleItemJSON_modify_assistant_request);
        localVarSingleItemJSON_modify_assistant_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Modifies a message.
//
message_object_t*
AssistantsAPI_modifyMessage(apiClient_t *apiClient, char *thread_id, char *message_id, modify_message_request_t *modify_message_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/threads/{thread_id}/messages/{message_id}");

    if(!thread_id)
        goto end;
    if(!message_id)
        goto end;


    // Path Params
    long sizeOfPathParams_thread_id = strlen(thread_id)+3 + strlen(message_id)+3 + sizeof("{ thread_id }") - 1;
    if(thread_id == NULL) {
        goto end;
    }
    char* localVarToReplace_thread_id = malloc(sizeOfPathParams_thread_id);
    sprintf(localVarToReplace_thread_id, "{%s}", "thread_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_thread_id, thread_id);

    // Path Params
    long sizeOfPathParams_message_id = strlen(thread_id)+3 + strlen(message_id)+3 + sizeof("{ message_id }") - 1;
    if(message_id == NULL) {
        goto end;
    }
    char* localVarToReplace_message_id = malloc(sizeOfPathParams_message_id);
    sprintf(localVarToReplace_message_id, "{%s}", "message_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_message_id, message_id);



    // Body Param
    cJSON *localVarSingleItemJSON_modify_message_request = NULL;
    if (modify_message_request != NULL)
    {
        //not string, not binary
        localVarSingleItemJSON_modify_message_request = modify_message_request_convertToJSON(modify_message_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_modify_message_request);
        localVarBodyLength = strlen(localVarBodyParameters);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    list_addElement(localVarContentType,"application/json"); //consumes
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "POST");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","OK");
    //}
    //nonprimitive not container
    message_object_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *AssistantsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = message_object_parseFromJSON(AssistantsAPIlocalVarJSON);
        cJSON_Delete(AssistantsAPIlocalVarJSON);
        if(elementToReturn == NULL) {
            // return 0;
        }
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_thread_id);
    free(localVarToReplace_message_id);
    if (localVarSingleItemJSON_modify_message_request) {
        cJSON_Delete(localVarSingleItemJSON_modify_message_request);
        localVarSingleItemJSON_modify_message_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Modifies a run.
//
run_object_t*
AssistantsAPI_modifyRun(apiClient_t *apiClient, char *thread_id, char *run_id, modify_run_request_t *modify_run_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/threads/{thread_id}/runs/{run_id}");

    if(!thread_id)
        goto end;
    if(!run_id)
        goto end;


    // Path Params
    long sizeOfPathParams_thread_id = strlen(thread_id)+3 + strlen(run_id)+3 + sizeof("{ thread_id }") - 1;
    if(thread_id == NULL) {
        goto end;
    }
    char* localVarToReplace_thread_id = malloc(sizeOfPathParams_thread_id);
    sprintf(localVarToReplace_thread_id, "{%s}", "thread_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_thread_id, thread_id);

    // Path Params
    long sizeOfPathParams_run_id = strlen(thread_id)+3 + strlen(run_id)+3 + sizeof("{ run_id }") - 1;
    if(run_id == NULL) {
        goto end;
    }
    char* localVarToReplace_run_id = malloc(sizeOfPathParams_run_id);
    sprintf(localVarToReplace_run_id, "{%s}", "run_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_run_id, run_id);



    // Body Param
    cJSON *localVarSingleItemJSON_modify_run_request = NULL;
    if (modify_run_request != NULL)
    {
        //not string, not binary
        localVarSingleItemJSON_modify_run_request = modify_run_request_convertToJSON(modify_run_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_modify_run_request);
        localVarBodyLength = strlen(localVarBodyParameters);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    list_addElement(localVarContentType,"application/json"); //consumes
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "POST");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","OK");
    //}
    //nonprimitive not container
    run_object_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *AssistantsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = run_object_parseFromJSON(AssistantsAPIlocalVarJSON);
        cJSON_Delete(AssistantsAPIlocalVarJSON);
        if(elementToReturn == NULL) {
            // return 0;
        }
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_thread_id);
    free(localVarToReplace_run_id);
    if (localVarSingleItemJSON_modify_run_request) {
        cJSON_Delete(localVarSingleItemJSON_modify_run_request);
        localVarSingleItemJSON_modify_run_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Modifies a thread.
//
thread_object_t*
AssistantsAPI_modifyThread(apiClient_t *apiClient, char *thread_id, modify_thread_request_t *modify_thread_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/threads/{thread_id}");

    if(!thread_id)
        goto end;


    // Path Params
    long sizeOfPathParams_thread_id = strlen(thread_id)+3 + sizeof("{ thread_id }") - 1;
    if(thread_id == NULL) {
        goto end;
    }
    char* localVarToReplace_thread_id = malloc(sizeOfPathParams_thread_id);
    sprintf(localVarToReplace_thread_id, "{%s}", "thread_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_thread_id, thread_id);



    // Body Param
    cJSON *localVarSingleItemJSON_modify_thread_request = NULL;
    if (modify_thread_request != NULL)
    {
        //not string, not binary
        localVarSingleItemJSON_modify_thread_request = modify_thread_request_convertToJSON(modify_thread_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_modify_thread_request);
        localVarBodyLength = strlen(localVarBodyParameters);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    list_addElement(localVarContentType,"application/json"); //consumes
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "POST");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","OK");
    //}
    //nonprimitive not container
    thread_object_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *AssistantsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = thread_object_parseFromJSON(AssistantsAPIlocalVarJSON);
        cJSON_Delete(AssistantsAPIlocalVarJSON);
        if(elementToReturn == NULL) {
            // return 0;
        }
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_thread_id);
    if (localVarSingleItemJSON_modify_thread_request) {
        cJSON_Delete(localVarSingleItemJSON_modify_thread_request);
        localVarSingleItemJSON_modify_thread_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they're all completed. All outputs must be submitted in a single request. 
//
run_object_t*
AssistantsAPI_submitToolOuputsToRun(apiClient_t *apiClient, char *thread_id, char *run_id, submit_tool_outputs_run_request_t *submit_tool_outputs_run_request)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/threads/{thread_id}/runs/{run_id}/submit_tool_outputs");

    if(!thread_id)
        goto end;
    if(!run_id)
        goto end;


    // Path Params
    long sizeOfPathParams_thread_id = strlen(thread_id)+3 + strlen(run_id)+3 + sizeof("{ thread_id }") - 1;
    if(thread_id == NULL) {
        goto end;
    }
    char* localVarToReplace_thread_id = malloc(sizeOfPathParams_thread_id);
    sprintf(localVarToReplace_thread_id, "{%s}", "thread_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_thread_id, thread_id);

    // Path Params
    long sizeOfPathParams_run_id = strlen(thread_id)+3 + strlen(run_id)+3 + sizeof("{ run_id }") - 1;
    if(run_id == NULL) {
        goto end;
    }
    char* localVarToReplace_run_id = malloc(sizeOfPathParams_run_id);
    sprintf(localVarToReplace_run_id, "{%s}", "run_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_run_id, run_id);



    // Body Param
    cJSON *localVarSingleItemJSON_submit_tool_outputs_run_request = NULL;
    if (submit_tool_outputs_run_request != NULL)
    {
        //not string, not binary
        localVarSingleItemJSON_submit_tool_outputs_run_request = submit_tool_outputs_run_request_convertToJSON(submit_tool_outputs_run_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_submit_tool_outputs_run_request);
        localVarBodyLength = strlen(localVarBodyParameters);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    list_addElement(localVarContentType,"application/json"); //consumes
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "POST");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","OK");
    //}
    //nonprimitive not container
    run_object_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *AssistantsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = run_object_parseFromJSON(AssistantsAPIlocalVarJSON);
        cJSON_Delete(AssistantsAPIlocalVarJSON);
        if(elementToReturn == NULL) {
            // return 0;
        }
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_thread_id);
    free(localVarToReplace_run_id);
    if (localVarSingleItemJSON_submit_tool_outputs_run_request) {
        cJSON_Delete(localVarSingleItemJSON_submit_tool_outputs_run_request);
        localVarSingleItemJSON_submit_tool_outputs_run_request = NULL;
    }
    free(localVarBodyParameters);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

