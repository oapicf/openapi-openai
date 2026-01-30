#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "fine_tune_preference_request_input_input.h"



static fine_tune_preference_request_input_input_t *fine_tune_preference_request_input_input_create_internal(
    list_t *messages,
    list_t *tools,
    int parallel_tool_calls
    ) {
    fine_tune_preference_request_input_input_t *fine_tune_preference_request_input_input_local_var = malloc(sizeof(fine_tune_preference_request_input_input_t));
    if (!fine_tune_preference_request_input_input_local_var) {
        return NULL;
    }
    fine_tune_preference_request_input_input_local_var->messages = messages;
    fine_tune_preference_request_input_input_local_var->tools = tools;
    fine_tune_preference_request_input_input_local_var->parallel_tool_calls = parallel_tool_calls;

    fine_tune_preference_request_input_input_local_var->_library_owned = 1;
    return fine_tune_preference_request_input_input_local_var;
}

__attribute__((deprecated)) fine_tune_preference_request_input_input_t *fine_tune_preference_request_input_input_create(
    list_t *messages,
    list_t *tools,
    int parallel_tool_calls
    ) {
    return fine_tune_preference_request_input_input_create_internal (
        messages,
        tools,
        parallel_tool_calls
        );
}

void fine_tune_preference_request_input_input_free(fine_tune_preference_request_input_input_t *fine_tune_preference_request_input_input) {
    if(NULL == fine_tune_preference_request_input_input){
        return ;
    }
    if(fine_tune_preference_request_input_input->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "fine_tune_preference_request_input_input_free");
        return ;
    }
    listEntry_t *listEntry;
    if (fine_tune_preference_request_input_input->messages) {
        list_ForEach(listEntry, fine_tune_preference_request_input_input->messages) {
            fine_tune_chat_request_input_messages_inner_free(listEntry->data);
        }
        list_freeList(fine_tune_preference_request_input_input->messages);
        fine_tune_preference_request_input_input->messages = NULL;
    }
    if (fine_tune_preference_request_input_input->tools) {
        list_ForEach(listEntry, fine_tune_preference_request_input_input->tools) {
            chat_completion_tool_free(listEntry->data);
        }
        list_freeList(fine_tune_preference_request_input_input->tools);
        fine_tune_preference_request_input_input->tools = NULL;
    }
    free(fine_tune_preference_request_input_input);
}

cJSON *fine_tune_preference_request_input_input_convertToJSON(fine_tune_preference_request_input_input_t *fine_tune_preference_request_input_input) {
    cJSON *item = cJSON_CreateObject();

    // fine_tune_preference_request_input_input->messages
    if(fine_tune_preference_request_input_input->messages) {
    cJSON *messages = cJSON_AddArrayToObject(item, "messages");
    if(messages == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *messagesListEntry;
    if (fine_tune_preference_request_input_input->messages) {
    list_ForEach(messagesListEntry, fine_tune_preference_request_input_input->messages) {
    cJSON *itemLocal = fine_tune_chat_request_input_messages_inner_convertToJSON(messagesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(messages, itemLocal);
    }
    }
    }


    // fine_tune_preference_request_input_input->tools
    if(fine_tune_preference_request_input_input->tools) {
    cJSON *tools = cJSON_AddArrayToObject(item, "tools");
    if(tools == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *toolsListEntry;
    if (fine_tune_preference_request_input_input->tools) {
    list_ForEach(toolsListEntry, fine_tune_preference_request_input_input->tools) {
    cJSON *itemLocal = chat_completion_tool_convertToJSON(toolsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(tools, itemLocal);
    }
    }
    }


    // fine_tune_preference_request_input_input->parallel_tool_calls
    if(fine_tune_preference_request_input_input->parallel_tool_calls) {
    if(cJSON_AddBoolToObject(item, "parallel_tool_calls", fine_tune_preference_request_input_input->parallel_tool_calls) == NULL) {
    goto fail; //Bool
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

fine_tune_preference_request_input_input_t *fine_tune_preference_request_input_input_parseFromJSON(cJSON *fine_tune_preference_request_input_inputJSON){

    fine_tune_preference_request_input_input_t *fine_tune_preference_request_input_input_local_var = NULL;

    // define the local list for fine_tune_preference_request_input_input->messages
    list_t *messagesList = NULL;

    // define the local list for fine_tune_preference_request_input_input->tools
    list_t *toolsList = NULL;

    // fine_tune_preference_request_input_input->messages
    cJSON *messages = cJSON_GetObjectItemCaseSensitive(fine_tune_preference_request_input_inputJSON, "messages");
    if (cJSON_IsNull(messages)) {
        messages = NULL;
    }
    if (messages) { 
    cJSON *messages_local_nonprimitive = NULL;
    if(!cJSON_IsArray(messages)){
        goto end; //nonprimitive container
    }

    messagesList = list_createList();

    cJSON_ArrayForEach(messages_local_nonprimitive,messages )
    {
        if(!cJSON_IsObject(messages_local_nonprimitive)){
            goto end;
        }
        fine_tune_chat_request_input_messages_inner_t *messagesItem = fine_tune_chat_request_input_messages_inner_parseFromJSON(messages_local_nonprimitive);

        list_addElement(messagesList, messagesItem);
    }
    }

    // fine_tune_preference_request_input_input->tools
    cJSON *tools = cJSON_GetObjectItemCaseSensitive(fine_tune_preference_request_input_inputJSON, "tools");
    if (cJSON_IsNull(tools)) {
        tools = NULL;
    }
    if (tools) { 
    cJSON *tools_local_nonprimitive = NULL;
    if(!cJSON_IsArray(tools)){
        goto end; //nonprimitive container
    }

    toolsList = list_createList();

    cJSON_ArrayForEach(tools_local_nonprimitive,tools )
    {
        if(!cJSON_IsObject(tools_local_nonprimitive)){
            goto end;
        }
        chat_completion_tool_t *toolsItem = chat_completion_tool_parseFromJSON(tools_local_nonprimitive);

        list_addElement(toolsList, toolsItem);
    }
    }

    // fine_tune_preference_request_input_input->parallel_tool_calls
    cJSON *parallel_tool_calls = cJSON_GetObjectItemCaseSensitive(fine_tune_preference_request_input_inputJSON, "parallel_tool_calls");
    if (cJSON_IsNull(parallel_tool_calls)) {
        parallel_tool_calls = NULL;
    }
    if (parallel_tool_calls) { 
    if(!cJSON_IsBool(parallel_tool_calls))
    {
    goto end; //Bool
    }
    }


    fine_tune_preference_request_input_input_local_var = fine_tune_preference_request_input_input_create_internal (
        messages ? messagesList : NULL,
        tools ? toolsList : NULL,
        parallel_tool_calls ? parallel_tool_calls->valueint : 0
        );

    return fine_tune_preference_request_input_input_local_var;
end:
    if (messagesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, messagesList) {
            fine_tune_chat_request_input_messages_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(messagesList);
        messagesList = NULL;
    }
    if (toolsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, toolsList) {
            chat_completion_tool_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(toolsList);
        toolsList = NULL;
    }
    return NULL;

}
