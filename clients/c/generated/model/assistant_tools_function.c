#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "assistant_tools_function.h"


char* assistant_tools_function_type_ToString(openai_api_assistant_tools_function_TYPE_e type) {
    char* typeArray[] =  { "NULL", "function" };
    return typeArray[type];
}

openai_api_assistant_tools_function_TYPE_e assistant_tools_function_type_FromString(char* type){
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

assistant_tools_function_t *assistant_tools_function_create(
    openai_api_assistant_tools_function_TYPE_e type,
    function_object_t *function
    ) {
    assistant_tools_function_t *assistant_tools_function_local_var = malloc(sizeof(assistant_tools_function_t));
    if (!assistant_tools_function_local_var) {
        return NULL;
    }
    assistant_tools_function_local_var->type = type;
    assistant_tools_function_local_var->function = function;

    return assistant_tools_function_local_var;
}


void assistant_tools_function_free(assistant_tools_function_t *assistant_tools_function) {
    if(NULL == assistant_tools_function){
        return ;
    }
    listEntry_t *listEntry;
    if (assistant_tools_function->function) {
        function_object_free(assistant_tools_function->function);
        assistant_tools_function->function = NULL;
    }
    free(assistant_tools_function);
}

cJSON *assistant_tools_function_convertToJSON(assistant_tools_function_t *assistant_tools_function) {
    cJSON *item = cJSON_CreateObject();

    // assistant_tools_function->type
    if (openai_api_assistant_tools_function_TYPE_NULL == assistant_tools_function->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", typeassistant_tools_function_ToString(assistant_tools_function->type)) == NULL)
    {
    goto fail; //Enum
    }


    // assistant_tools_function->function
    if (!assistant_tools_function->function) {
        goto fail;
    }
    cJSON *function_local_JSON = function_object_convertToJSON(assistant_tools_function->function);
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

assistant_tools_function_t *assistant_tools_function_parseFromJSON(cJSON *assistant_tools_functionJSON){

    assistant_tools_function_t *assistant_tools_function_local_var = NULL;

    // define the local variable for assistant_tools_function->function
    function_object_t *function_local_nonprim = NULL;

    // assistant_tools_function->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(assistant_tools_functionJSON, "type");
    if (!type) {
        goto end;
    }

    openai_api_assistant_tools_function_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = assistant_tools_function_type_FromString(type->valuestring);

    // assistant_tools_function->function
    cJSON *function = cJSON_GetObjectItemCaseSensitive(assistant_tools_functionJSON, "function");
    if (!function) {
        goto end;
    }

    
    function_local_nonprim = function_object_parseFromJSON(function); //nonprimitive


    assistant_tools_function_local_var = assistant_tools_function_create (
        typeVariable,
        function_local_nonprim
        );

    return assistant_tools_function_local_var;
end:
    if (function_local_nonprim) {
        function_object_free(function_local_nonprim);
        function_local_nonprim = NULL;
    }
    return NULL;

}
