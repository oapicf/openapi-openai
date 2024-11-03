#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "chat_completion_request_message.h"


char* chat_completion_request_message_role_ToString(openai_api_chat_completion_request_message_ROLE_e role) {
    char* roleArray[] =  { "NULL", "function" };
    return roleArray[role];
}

openai_api_chat_completion_request_message_ROLE_e chat_completion_request_message_role_FromString(char* role){
    int stringToReturn = 0;
    char *roleArray[] =  { "NULL", "function" };
    size_t sizeofArray = sizeof(roleArray) / sizeof(roleArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(role, roleArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

chat_completion_request_message_t *chat_completion_request_message_create(
    char *content,
    openai_api_chat_completion_request_message_ROLE_e role,
    char *name,
    list_t *tool_calls,
    chat_completion_request_assistant_message_function_call_t *function_call,
    char *tool_call_id
    ) {
    chat_completion_request_message_t *chat_completion_request_message_local_var = malloc(sizeof(chat_completion_request_message_t));
    if (!chat_completion_request_message_local_var) {
        return NULL;
    }
    chat_completion_request_message_local_var->content = content;
    chat_completion_request_message_local_var->role = role;
    chat_completion_request_message_local_var->name = name;
    chat_completion_request_message_local_var->tool_calls = tool_calls;
    chat_completion_request_message_local_var->function_call = function_call;
    chat_completion_request_message_local_var->tool_call_id = tool_call_id;

    return chat_completion_request_message_local_var;
}


void chat_completion_request_message_free(chat_completion_request_message_t *chat_completion_request_message) {
    if(NULL == chat_completion_request_message){
        return ;
    }
    listEntry_t *listEntry;
    if (chat_completion_request_message->content) {
        free(chat_completion_request_message->content);
        chat_completion_request_message->content = NULL;
    }
    if (chat_completion_request_message->name) {
        free(chat_completion_request_message->name);
        chat_completion_request_message->name = NULL;
    }
    if (chat_completion_request_message->tool_calls) {
        list_ForEach(listEntry, chat_completion_request_message->tool_calls) {
            chat_completion_message_tool_call_free(listEntry->data);
        }
        list_freeList(chat_completion_request_message->tool_calls);
        chat_completion_request_message->tool_calls = NULL;
    }
    if (chat_completion_request_message->function_call) {
        chat_completion_request_assistant_message_function_call_free(chat_completion_request_message->function_call);
        chat_completion_request_message->function_call = NULL;
    }
    if (chat_completion_request_message->tool_call_id) {
        free(chat_completion_request_message->tool_call_id);
        chat_completion_request_message->tool_call_id = NULL;
    }
    free(chat_completion_request_message);
}

cJSON *chat_completion_request_message_convertToJSON(chat_completion_request_message_t *chat_completion_request_message) {
    cJSON *item = cJSON_CreateObject();

    // chat_completion_request_message->content
    if (!chat_completion_request_message->content) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "content", chat_completion_request_message->content) == NULL) {
    goto fail; //String
    }


    // chat_completion_request_message->role
    if (openai_api_chat_completion_request_message_ROLE_NULL == chat_completion_request_message->role) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "role", rolechat_completion_request_message_ToString(chat_completion_request_message->role)) == NULL)
    {
    goto fail; //Enum
    }


    // chat_completion_request_message->name
    if (!chat_completion_request_message->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", chat_completion_request_message->name) == NULL) {
    goto fail; //String
    }


    // chat_completion_request_message->tool_calls
    if(chat_completion_request_message->tool_calls) {
    cJSON *tool_calls = cJSON_AddArrayToObject(item, "tool_calls");
    if(tool_calls == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *tool_callsListEntry;
    if (chat_completion_request_message->tool_calls) {
    list_ForEach(tool_callsListEntry, chat_completion_request_message->tool_calls) {
    cJSON *itemLocal = chat_completion_message_tool_call_convertToJSON(tool_callsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(tool_calls, itemLocal);
    }
    }
    }


    // chat_completion_request_message->function_call
    if(chat_completion_request_message->function_call) {
    cJSON *function_call_local_JSON = chat_completion_request_assistant_message_function_call_convertToJSON(chat_completion_request_message->function_call);
    if(function_call_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "function_call", function_call_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // chat_completion_request_message->tool_call_id
    if (!chat_completion_request_message->tool_call_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "tool_call_id", chat_completion_request_message->tool_call_id) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

chat_completion_request_message_t *chat_completion_request_message_parseFromJSON(cJSON *chat_completion_request_messageJSON){

    chat_completion_request_message_t *chat_completion_request_message_local_var = NULL;

    // define the local list for chat_completion_request_message->tool_calls
    list_t *tool_callsList = NULL;

    // define the local variable for chat_completion_request_message->function_call
    chat_completion_request_assistant_message_function_call_t *function_call_local_nonprim = NULL;

    // chat_completion_request_message->content
    cJSON *content = cJSON_GetObjectItemCaseSensitive(chat_completion_request_messageJSON, "content");
    if (!content) {
        goto end;
    }

    
    if(!cJSON_IsString(content))
    {
    goto end; //String
    }

    // chat_completion_request_message->role
    cJSON *role = cJSON_GetObjectItemCaseSensitive(chat_completion_request_messageJSON, "role");
    if (!role) {
        goto end;
    }

    openai_api_chat_completion_request_message_ROLE_e roleVariable;
    
    if(!cJSON_IsString(role))
    {
    goto end; //Enum
    }
    roleVariable = chat_completion_request_message_role_FromString(role->valuestring);

    // chat_completion_request_message->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(chat_completion_request_messageJSON, "name");
    if (!name) {
        goto end;
    }

    
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }

    // chat_completion_request_message->tool_calls
    cJSON *tool_calls = cJSON_GetObjectItemCaseSensitive(chat_completion_request_messageJSON, "tool_calls");
    if (tool_calls) { 
    cJSON *tool_calls_local_nonprimitive = NULL;
    if(!cJSON_IsArray(tool_calls)){
        goto end; //nonprimitive container
    }

    tool_callsList = list_createList();

    cJSON_ArrayForEach(tool_calls_local_nonprimitive,tool_calls )
    {
        if(!cJSON_IsObject(tool_calls_local_nonprimitive)){
            goto end;
        }
        chat_completion_message_tool_call_t *tool_callsItem = chat_completion_message_tool_call_parseFromJSON(tool_calls_local_nonprimitive);

        list_addElement(tool_callsList, tool_callsItem);
    }
    }

    // chat_completion_request_message->function_call
    cJSON *function_call = cJSON_GetObjectItemCaseSensitive(chat_completion_request_messageJSON, "function_call");
    if (function_call) { 
    function_call_local_nonprim = chat_completion_request_assistant_message_function_call_parseFromJSON(function_call); //nonprimitive
    }

    // chat_completion_request_message->tool_call_id
    cJSON *tool_call_id = cJSON_GetObjectItemCaseSensitive(chat_completion_request_messageJSON, "tool_call_id");
    if (!tool_call_id) {
        goto end;
    }

    
    if(!cJSON_IsString(tool_call_id))
    {
    goto end; //String
    }


    chat_completion_request_message_local_var = chat_completion_request_message_create (
        strdup(content->valuestring),
        roleVariable,
        strdup(name->valuestring),
        tool_calls ? tool_callsList : NULL,
        function_call ? function_call_local_nonprim : NULL,
        strdup(tool_call_id->valuestring)
        );

    return chat_completion_request_message_local_var;
end:
    if (tool_callsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, tool_callsList) {
            chat_completion_message_tool_call_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(tool_callsList);
        tool_callsList = NULL;
    }
    if (function_call_local_nonprim) {
        chat_completion_request_assistant_message_function_call_free(function_call_local_nonprim);
        function_call_local_nonprim = NULL;
    }
    return NULL;

}
