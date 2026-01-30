#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "chat_completion_named_tool_choice.h"


char* chat_completion_named_tool_choice_type_ToString(openai_api_chat_completion_named_tool_choice_TYPE_e type) {
    char* typeArray[] =  { "NULL", "function" };
    return typeArray[type];
}

openai_api_chat_completion_named_tool_choice_TYPE_e chat_completion_named_tool_choice_type_FromString(char* type){
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

static chat_completion_named_tool_choice_t *chat_completion_named_tool_choice_create_internal(
    openai_api_chat_completion_named_tool_choice_TYPE_e type,
    assistants_named_tool_choice_function_t *function
    ) {
    chat_completion_named_tool_choice_t *chat_completion_named_tool_choice_local_var = malloc(sizeof(chat_completion_named_tool_choice_t));
    if (!chat_completion_named_tool_choice_local_var) {
        return NULL;
    }
    chat_completion_named_tool_choice_local_var->type = type;
    chat_completion_named_tool_choice_local_var->function = function;

    chat_completion_named_tool_choice_local_var->_library_owned = 1;
    return chat_completion_named_tool_choice_local_var;
}

__attribute__((deprecated)) chat_completion_named_tool_choice_t *chat_completion_named_tool_choice_create(
    openai_api_chat_completion_named_tool_choice_TYPE_e type,
    assistants_named_tool_choice_function_t *function
    ) {
    return chat_completion_named_tool_choice_create_internal (
        type,
        function
        );
}

void chat_completion_named_tool_choice_free(chat_completion_named_tool_choice_t *chat_completion_named_tool_choice) {
    if(NULL == chat_completion_named_tool_choice){
        return ;
    }
    if(chat_completion_named_tool_choice->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "chat_completion_named_tool_choice_free");
        return ;
    }
    listEntry_t *listEntry;
    if (chat_completion_named_tool_choice->function) {
        assistants_named_tool_choice_function_free(chat_completion_named_tool_choice->function);
        chat_completion_named_tool_choice->function = NULL;
    }
    free(chat_completion_named_tool_choice);
}

cJSON *chat_completion_named_tool_choice_convertToJSON(chat_completion_named_tool_choice_t *chat_completion_named_tool_choice) {
    cJSON *item = cJSON_CreateObject();

    // chat_completion_named_tool_choice->type
    if (openai_api_chat_completion_named_tool_choice_TYPE_NULL == chat_completion_named_tool_choice->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", chat_completion_named_tool_choice_type_ToString(chat_completion_named_tool_choice->type)) == NULL)
    {
    goto fail; //Enum
    }


    // chat_completion_named_tool_choice->function
    if (!chat_completion_named_tool_choice->function) {
        goto fail;
    }
    cJSON *function_local_JSON = assistants_named_tool_choice_function_convertToJSON(chat_completion_named_tool_choice->function);
    if(function_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "function", function_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

chat_completion_named_tool_choice_t *chat_completion_named_tool_choice_parseFromJSON(cJSON *chat_completion_named_tool_choiceJSON){

    chat_completion_named_tool_choice_t *chat_completion_named_tool_choice_local_var = NULL;

    // define the local variable for chat_completion_named_tool_choice->function
    assistants_named_tool_choice_function_t *function_local_nonprim = NULL;

    // chat_completion_named_tool_choice->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(chat_completion_named_tool_choiceJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (!type) {
        goto end;
    }

    openai_api_chat_completion_named_tool_choice_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = chat_completion_named_tool_choice_type_FromString(type->valuestring);

    // chat_completion_named_tool_choice->function
    cJSON *function = cJSON_GetObjectItemCaseSensitive(chat_completion_named_tool_choiceJSON, "function");
    if (cJSON_IsNull(function)) {
        function = NULL;
    }
    if (!function) {
        goto end;
    }

    
    function_local_nonprim = assistants_named_tool_choice_function_parseFromJSON(function); //nonprimitive


    chat_completion_named_tool_choice_local_var = chat_completion_named_tool_choice_create_internal (
        typeVariable,
        function_local_nonprim
        );

    return chat_completion_named_tool_choice_local_var;
end:
    if (function_local_nonprim) {
        assistants_named_tool_choice_function_free(function_local_nonprim);
        function_local_nonprim = NULL;
    }
    return NULL;

}
