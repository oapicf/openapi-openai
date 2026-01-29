#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "chat_completion_message_tool_call_chunk.h"


char* chat_completion_message_tool_call_chunk_type_ToString(openai_api_chat_completion_message_tool_call_chunk_TYPE_e type) {
    char* typeArray[] =  { "NULL", "function" };
    return typeArray[type];
}

openai_api_chat_completion_message_tool_call_chunk_TYPE_e chat_completion_message_tool_call_chunk_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "function" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static chat_completion_message_tool_call_chunk_t *chat_completion_message_tool_call_chunk_create_internal(
    int index,
    char *id,
    openai_api_chat_completion_message_tool_call_chunk_TYPE_e type,
    chat_completion_message_tool_call_chunk_function_t *function
    ) {
    chat_completion_message_tool_call_chunk_t *chat_completion_message_tool_call_chunk_local_var = malloc(sizeof(chat_completion_message_tool_call_chunk_t));
    if (!chat_completion_message_tool_call_chunk_local_var) {
        return NULL;
    }
    chat_completion_message_tool_call_chunk_local_var->index = index;
    chat_completion_message_tool_call_chunk_local_var->id = id;
    chat_completion_message_tool_call_chunk_local_var->type = type;
    chat_completion_message_tool_call_chunk_local_var->function = function;

    chat_completion_message_tool_call_chunk_local_var->_library_owned = 1;
    return chat_completion_message_tool_call_chunk_local_var;
}

__attribute__((deprecated)) chat_completion_message_tool_call_chunk_t *chat_completion_message_tool_call_chunk_create(
    int index,
    char *id,
    openai_api_chat_completion_message_tool_call_chunk_TYPE_e type,
    chat_completion_message_tool_call_chunk_function_t *function
    ) {
    return chat_completion_message_tool_call_chunk_create_internal (
        index,
        id,
        type,
        function
        );
}

void chat_completion_message_tool_call_chunk_free(chat_completion_message_tool_call_chunk_t *chat_completion_message_tool_call_chunk) {
    if(NULL == chat_completion_message_tool_call_chunk){
        return ;
    }
    if(chat_completion_message_tool_call_chunk->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "chat_completion_message_tool_call_chunk_free");
        return ;
    }
    listEntry_t *listEntry;
    if (chat_completion_message_tool_call_chunk->id) {
        free(chat_completion_message_tool_call_chunk->id);
        chat_completion_message_tool_call_chunk->id = NULL;
    }
    if (chat_completion_message_tool_call_chunk->function) {
        chat_completion_message_tool_call_chunk_function_free(chat_completion_message_tool_call_chunk->function);
        chat_completion_message_tool_call_chunk->function = NULL;
    }
    free(chat_completion_message_tool_call_chunk);
}

cJSON *chat_completion_message_tool_call_chunk_convertToJSON(chat_completion_message_tool_call_chunk_t *chat_completion_message_tool_call_chunk) {
    cJSON *item = cJSON_CreateObject();

    // chat_completion_message_tool_call_chunk->index
    if (!chat_completion_message_tool_call_chunk->index) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "index", chat_completion_message_tool_call_chunk->index) == NULL) {
    goto fail; //Numeric
    }


    // chat_completion_message_tool_call_chunk->id
    if(chat_completion_message_tool_call_chunk->id) {
    if(cJSON_AddStringToObject(item, "id", chat_completion_message_tool_call_chunk->id) == NULL) {
    goto fail; //String
    }
    }


    // chat_completion_message_tool_call_chunk->type
    if(chat_completion_message_tool_call_chunk->type != openai_api_chat_completion_message_tool_call_chunk_TYPE_NULL) {
    if(cJSON_AddStringToObject(item, "type", chat_completion_message_tool_call_chunk_type_ToString(chat_completion_message_tool_call_chunk->type)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // chat_completion_message_tool_call_chunk->function
    if(chat_completion_message_tool_call_chunk->function) {
    cJSON *function_local_JSON = chat_completion_message_tool_call_chunk_function_convertToJSON(chat_completion_message_tool_call_chunk->function);
    if(function_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "function", function_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

chat_completion_message_tool_call_chunk_t *chat_completion_message_tool_call_chunk_parseFromJSON(cJSON *chat_completion_message_tool_call_chunkJSON){

    chat_completion_message_tool_call_chunk_t *chat_completion_message_tool_call_chunk_local_var = NULL;

    // define the local variable for chat_completion_message_tool_call_chunk->function
    chat_completion_message_tool_call_chunk_function_t *function_local_nonprim = NULL;

    // chat_completion_message_tool_call_chunk->index
    cJSON *index = cJSON_GetObjectItemCaseSensitive(chat_completion_message_tool_call_chunkJSON, "index");
    if (cJSON_IsNull(index)) {
        index = NULL;
    }
    if (!index) {
        goto end;
    }

    
    if(!cJSON_IsNumber(index))
    {
    goto end; //Numeric
    }

    // chat_completion_message_tool_call_chunk->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(chat_completion_message_tool_call_chunkJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // chat_completion_message_tool_call_chunk->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(chat_completion_message_tool_call_chunkJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    openai_api_chat_completion_message_tool_call_chunk_TYPE_e typeVariable;
    if (type) { 
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = chat_completion_message_tool_call_chunk_type_FromString(type->valuestring);
    }

    // chat_completion_message_tool_call_chunk->function
    cJSON *function = cJSON_GetObjectItemCaseSensitive(chat_completion_message_tool_call_chunkJSON, "function");
    if (cJSON_IsNull(function)) {
        function = NULL;
    }
    if (function) { 
    function_local_nonprim = chat_completion_message_tool_call_chunk_function_parseFromJSON(function); //nonprimitive
    }


    chat_completion_message_tool_call_chunk_local_var = chat_completion_message_tool_call_chunk_create_internal (
        index->valuedouble,
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL,
        type ? typeVariable : openai_api_chat_completion_message_tool_call_chunk_TYPE_NULL,
        function ? function_local_nonprim : NULL
        );

    return chat_completion_message_tool_call_chunk_local_var;
end:
    if (function_local_nonprim) {
        chat_completion_message_tool_call_chunk_function_free(function_local_nonprim);
        function_local_nonprim = NULL;
    }
    return NULL;

}
