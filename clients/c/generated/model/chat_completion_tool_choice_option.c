#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "chat_completion_tool_choice_option.h"


char* chat_completion_tool_choice_option_type_ToString(openai_api_chat_completion_tool_choice_option_TYPE_e type) {
    char* typeArray[] =  { "NULL", "function" };
    return typeArray[type];
}

openai_api_chat_completion_tool_choice_option_TYPE_e chat_completion_tool_choice_option_type_FromString(char* type){
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

chat_completion_tool_choice_option_t *chat_completion_tool_choice_option_create(
    openai_api_chat_completion_tool_choice_option_TYPE_e type,
    chat_completion_named_tool_choice_function_t *function
    ) {
    chat_completion_tool_choice_option_t *chat_completion_tool_choice_option_local_var = malloc(sizeof(chat_completion_tool_choice_option_t));
    if (!chat_completion_tool_choice_option_local_var) {
        return NULL;
    }
    chat_completion_tool_choice_option_local_var->type = type;
    chat_completion_tool_choice_option_local_var->function = function;

    return chat_completion_tool_choice_option_local_var;
}


void chat_completion_tool_choice_option_free(chat_completion_tool_choice_option_t *chat_completion_tool_choice_option) {
    if(NULL == chat_completion_tool_choice_option){
        return ;
    }
    listEntry_t *listEntry;
    if (chat_completion_tool_choice_option->function) {
        chat_completion_named_tool_choice_function_free(chat_completion_tool_choice_option->function);
        chat_completion_tool_choice_option->function = NULL;
    }
    free(chat_completion_tool_choice_option);
}

cJSON *chat_completion_tool_choice_option_convertToJSON(chat_completion_tool_choice_option_t *chat_completion_tool_choice_option) {
    cJSON *item = cJSON_CreateObject();

    // chat_completion_tool_choice_option->type
    if (openai_api_chat_completion_tool_choice_option_TYPE_NULL == chat_completion_tool_choice_option->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", typechat_completion_tool_choice_option_ToString(chat_completion_tool_choice_option->type)) == NULL)
    {
    goto fail; //Enum
    }


    // chat_completion_tool_choice_option->function
    if (!chat_completion_tool_choice_option->function) {
        goto fail;
    }
    cJSON *function_local_JSON = chat_completion_named_tool_choice_function_convertToJSON(chat_completion_tool_choice_option->function);
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

chat_completion_tool_choice_option_t *chat_completion_tool_choice_option_parseFromJSON(cJSON *chat_completion_tool_choice_optionJSON){

    chat_completion_tool_choice_option_t *chat_completion_tool_choice_option_local_var = NULL;

    // define the local variable for chat_completion_tool_choice_option->function
    chat_completion_named_tool_choice_function_t *function_local_nonprim = NULL;

    // chat_completion_tool_choice_option->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(chat_completion_tool_choice_optionJSON, "type");
    if (!type) {
        goto end;
    }

    openai_api_chat_completion_tool_choice_option_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = chat_completion_tool_choice_option_type_FromString(type->valuestring);

    // chat_completion_tool_choice_option->function
    cJSON *function = cJSON_GetObjectItemCaseSensitive(chat_completion_tool_choice_optionJSON, "function");
    if (!function) {
        goto end;
    }

    
    function_local_nonprim = chat_completion_named_tool_choice_function_parseFromJSON(function); //nonprimitive


    chat_completion_tool_choice_option_local_var = chat_completion_tool_choice_option_create (
        typeVariable,
        function_local_nonprim
        );

    return chat_completion_tool_choice_option_local_var;
end:
    if (function_local_nonprim) {
        chat_completion_named_tool_choice_function_free(function_local_nonprim);
        function_local_nonprim = NULL;
    }
    return NULL;

}
