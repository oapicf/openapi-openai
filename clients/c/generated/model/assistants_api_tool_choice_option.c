#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "assistants_api_tool_choice_option.h"


char* assistants_api_tool_choice_option_type_ToString(openai_api_assistants_api_tool_choice_option_TYPE_e type) {
    char* typeArray[] =  { "NULL", "function", "code_interpreter", "file_search" };
    return typeArray[type];
}

openai_api_assistants_api_tool_choice_option_TYPE_e assistants_api_tool_choice_option_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "function", "code_interpreter", "file_search" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static assistants_api_tool_choice_option_t *assistants_api_tool_choice_option_create_internal(
    openai_api_assistants_api_tool_choice_option_TYPE_e type,
    assistants_named_tool_choice_function_t *function
    ) {
    assistants_api_tool_choice_option_t *assistants_api_tool_choice_option_local_var = malloc(sizeof(assistants_api_tool_choice_option_t));
    if (!assistants_api_tool_choice_option_local_var) {
        return NULL;
    }
    assistants_api_tool_choice_option_local_var->type = type;
    assistants_api_tool_choice_option_local_var->function = function;

    assistants_api_tool_choice_option_local_var->_library_owned = 1;
    return assistants_api_tool_choice_option_local_var;
}

__attribute__((deprecated)) assistants_api_tool_choice_option_t *assistants_api_tool_choice_option_create(
    openai_api_assistants_api_tool_choice_option_TYPE_e type,
    assistants_named_tool_choice_function_t *function
    ) {
    return assistants_api_tool_choice_option_create_internal (
        type,
        function
        );
}

void assistants_api_tool_choice_option_free(assistants_api_tool_choice_option_t *assistants_api_tool_choice_option) {
    if(NULL == assistants_api_tool_choice_option){
        return ;
    }
    if(assistants_api_tool_choice_option->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "assistants_api_tool_choice_option_free");
        return ;
    }
    listEntry_t *listEntry;
    if (assistants_api_tool_choice_option->function) {
        assistants_named_tool_choice_function_free(assistants_api_tool_choice_option->function);
        assistants_api_tool_choice_option->function = NULL;
    }
    free(assistants_api_tool_choice_option);
}

cJSON *assistants_api_tool_choice_option_convertToJSON(assistants_api_tool_choice_option_t *assistants_api_tool_choice_option) {
    cJSON *item = cJSON_CreateObject();

    // assistants_api_tool_choice_option->type
    if (openai_api_assistants_api_tool_choice_option_TYPE_NULL == assistants_api_tool_choice_option->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", assistants_api_tool_choice_option_type_ToString(assistants_api_tool_choice_option->type)) == NULL)
    {
    goto fail; //Enum
    }


    // assistants_api_tool_choice_option->function
    if(assistants_api_tool_choice_option->function) {
    cJSON *function_local_JSON = assistants_named_tool_choice_function_convertToJSON(assistants_api_tool_choice_option->function);
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

assistants_api_tool_choice_option_t *assistants_api_tool_choice_option_parseFromJSON(cJSON *assistants_api_tool_choice_optionJSON){

    assistants_api_tool_choice_option_t *assistants_api_tool_choice_option_local_var = NULL;

    // define the local variable for assistants_api_tool_choice_option->function
    assistants_named_tool_choice_function_t *function_local_nonprim = NULL;

    // assistants_api_tool_choice_option->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(assistants_api_tool_choice_optionJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (!type) {
        goto end;
    }

    openai_api_assistants_api_tool_choice_option_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = assistants_api_tool_choice_option_type_FromString(type->valuestring);

    // assistants_api_tool_choice_option->function
    cJSON *function = cJSON_GetObjectItemCaseSensitive(assistants_api_tool_choice_optionJSON, "function");
    if (cJSON_IsNull(function)) {
        function = NULL;
    }
    if (function) { 
    function_local_nonprim = assistants_named_tool_choice_function_parseFromJSON(function); //nonprimitive
    }


    assistants_api_tool_choice_option_local_var = assistants_api_tool_choice_option_create_internal (
        typeVariable,
        function ? function_local_nonprim : NULL
        );

    return assistants_api_tool_choice_option_local_var;
end:
    if (function_local_nonprim) {
        assistants_named_tool_choice_function_free(function_local_nonprim);
        function_local_nonprim = NULL;
    }
    return NULL;

}
