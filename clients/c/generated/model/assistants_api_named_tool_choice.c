#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "assistants_api_named_tool_choice.h"


char* assistants_api_named_tool_choice_type_ToString(openai_api_assistants_api_named_tool_choice_TYPE_e type) {
    char* typeArray[] =  { "NULL", "function", "code_interpreter", "retrieval" };
    return typeArray[type];
}

openai_api_assistants_api_named_tool_choice_TYPE_e assistants_api_named_tool_choice_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "function", "code_interpreter", "retrieval" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

assistants_api_named_tool_choice_t *assistants_api_named_tool_choice_create(
    openai_api_assistants_api_named_tool_choice_TYPE_e type,
    chat_completion_named_tool_choice_function_t *function
    ) {
    assistants_api_named_tool_choice_t *assistants_api_named_tool_choice_local_var = malloc(sizeof(assistants_api_named_tool_choice_t));
    if (!assistants_api_named_tool_choice_local_var) {
        return NULL;
    }
    assistants_api_named_tool_choice_local_var->type = type;
    assistants_api_named_tool_choice_local_var->function = function;

    return assistants_api_named_tool_choice_local_var;
}


void assistants_api_named_tool_choice_free(assistants_api_named_tool_choice_t *assistants_api_named_tool_choice) {
    if(NULL == assistants_api_named_tool_choice){
        return ;
    }
    listEntry_t *listEntry;
    if (assistants_api_named_tool_choice->function) {
        chat_completion_named_tool_choice_function_free(assistants_api_named_tool_choice->function);
        assistants_api_named_tool_choice->function = NULL;
    }
    free(assistants_api_named_tool_choice);
}

cJSON *assistants_api_named_tool_choice_convertToJSON(assistants_api_named_tool_choice_t *assistants_api_named_tool_choice) {
    cJSON *item = cJSON_CreateObject();

    // assistants_api_named_tool_choice->type
    if (openai_api_assistants_api_named_tool_choice_TYPE_NULL == assistants_api_named_tool_choice->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", typeassistants_api_named_tool_choice_ToString(assistants_api_named_tool_choice->type)) == NULL)
    {
    goto fail; //Enum
    }


    // assistants_api_named_tool_choice->function
    if(assistants_api_named_tool_choice->function) {
    cJSON *function_local_JSON = chat_completion_named_tool_choice_function_convertToJSON(assistants_api_named_tool_choice->function);
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

assistants_api_named_tool_choice_t *assistants_api_named_tool_choice_parseFromJSON(cJSON *assistants_api_named_tool_choiceJSON){

    assistants_api_named_tool_choice_t *assistants_api_named_tool_choice_local_var = NULL;

    // define the local variable for assistants_api_named_tool_choice->function
    chat_completion_named_tool_choice_function_t *function_local_nonprim = NULL;

    // assistants_api_named_tool_choice->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(assistants_api_named_tool_choiceJSON, "type");
    if (!type) {
        goto end;
    }

    openai_api_assistants_api_named_tool_choice_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = assistants_api_named_tool_choice_type_FromString(type->valuestring);

    // assistants_api_named_tool_choice->function
    cJSON *function = cJSON_GetObjectItemCaseSensitive(assistants_api_named_tool_choiceJSON, "function");
    if (function) { 
    function_local_nonprim = chat_completion_named_tool_choice_function_parseFromJSON(function); //nonprimitive
    }


    assistants_api_named_tool_choice_local_var = assistants_api_named_tool_choice_create (
        typeVariable,
        function ? function_local_nonprim : NULL
        );

    return assistants_api_named_tool_choice_local_var;
end:
    if (function_local_nonprim) {
        chat_completion_named_tool_choice_function_free(function_local_nonprim);
        function_local_nonprim = NULL;
    }
    return NULL;

}
