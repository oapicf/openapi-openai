#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "assistants_named_tool_choice.h"


char* assistants_named_tool_choice_type_ToString(openai_api_assistants_named_tool_choice_TYPE_e type) {
    char* typeArray[] =  { "NULL", "function", "code_interpreter", "file_search" };
    return typeArray[type];
}

openai_api_assistants_named_tool_choice_TYPE_e assistants_named_tool_choice_type_FromString(char* type){
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

static assistants_named_tool_choice_t *assistants_named_tool_choice_create_internal(
    openai_api_assistants_named_tool_choice_TYPE_e type,
    assistants_named_tool_choice_function_t *function
    ) {
    assistants_named_tool_choice_t *assistants_named_tool_choice_local_var = malloc(sizeof(assistants_named_tool_choice_t));
    if (!assistants_named_tool_choice_local_var) {
        return NULL;
    }
    assistants_named_tool_choice_local_var->type = type;
    assistants_named_tool_choice_local_var->function = function;

    assistants_named_tool_choice_local_var->_library_owned = 1;
    return assistants_named_tool_choice_local_var;
}

__attribute__((deprecated)) assistants_named_tool_choice_t *assistants_named_tool_choice_create(
    openai_api_assistants_named_tool_choice_TYPE_e type,
    assistants_named_tool_choice_function_t *function
    ) {
    return assistants_named_tool_choice_create_internal (
        type,
        function
        );
}

void assistants_named_tool_choice_free(assistants_named_tool_choice_t *assistants_named_tool_choice) {
    if(NULL == assistants_named_tool_choice){
        return ;
    }
    if(assistants_named_tool_choice->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "assistants_named_tool_choice_free");
        return ;
    }
    listEntry_t *listEntry;
    if (assistants_named_tool_choice->function) {
        assistants_named_tool_choice_function_free(assistants_named_tool_choice->function);
        assistants_named_tool_choice->function = NULL;
    }
    free(assistants_named_tool_choice);
}

cJSON *assistants_named_tool_choice_convertToJSON(assistants_named_tool_choice_t *assistants_named_tool_choice) {
    cJSON *item = cJSON_CreateObject();

    // assistants_named_tool_choice->type
    if (openai_api_assistants_named_tool_choice_TYPE_NULL == assistants_named_tool_choice->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", assistants_named_tool_choice_type_ToString(assistants_named_tool_choice->type)) == NULL)
    {
    goto fail; //Enum
    }


    // assistants_named_tool_choice->function
    if(assistants_named_tool_choice->function) {
    cJSON *function_local_JSON = assistants_named_tool_choice_function_convertToJSON(assistants_named_tool_choice->function);
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

assistants_named_tool_choice_t *assistants_named_tool_choice_parseFromJSON(cJSON *assistants_named_tool_choiceJSON){

    assistants_named_tool_choice_t *assistants_named_tool_choice_local_var = NULL;

    // define the local variable for assistants_named_tool_choice->function
    assistants_named_tool_choice_function_t *function_local_nonprim = NULL;

    // assistants_named_tool_choice->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(assistants_named_tool_choiceJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (!type) {
        goto end;
    }

    openai_api_assistants_named_tool_choice_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = assistants_named_tool_choice_type_FromString(type->valuestring);

    // assistants_named_tool_choice->function
    cJSON *function = cJSON_GetObjectItemCaseSensitive(assistants_named_tool_choiceJSON, "function");
    if (cJSON_IsNull(function)) {
        function = NULL;
    }
    if (function) { 
    function_local_nonprim = assistants_named_tool_choice_function_parseFromJSON(function); //nonprimitive
    }


    assistants_named_tool_choice_local_var = assistants_named_tool_choice_create_internal (
        typeVariable,
        function ? function_local_nonprim : NULL
        );

    return assistants_named_tool_choice_local_var;
end:
    if (function_local_nonprim) {
        assistants_named_tool_choice_function_free(function_local_nonprim);
        function_local_nonprim = NULL;
    }
    return NULL;

}
