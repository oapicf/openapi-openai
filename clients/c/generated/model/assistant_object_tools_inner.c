#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "assistant_object_tools_inner.h"


char* assistant_object_tools_inner_type_ToString(openai_api_assistant_object_tools_inner_TYPE_e type) {
    char* typeArray[] =  { "NULL", "code_interpreter", "file_search", "function" };
    return typeArray[type];
}

openai_api_assistant_object_tools_inner_TYPE_e assistant_object_tools_inner_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "code_interpreter", "file_search", "function" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static assistant_object_tools_inner_t *assistant_object_tools_inner_create_internal(
    openai_api_assistant_object_tools_inner_TYPE_e type,
    assistant_tools_file_search_file_search_t *file_search,
    function_object_t *function
    ) {
    assistant_object_tools_inner_t *assistant_object_tools_inner_local_var = malloc(sizeof(assistant_object_tools_inner_t));
    if (!assistant_object_tools_inner_local_var) {
        return NULL;
    }
    assistant_object_tools_inner_local_var->type = type;
    assistant_object_tools_inner_local_var->file_search = file_search;
    assistant_object_tools_inner_local_var->function = function;

    assistant_object_tools_inner_local_var->_library_owned = 1;
    return assistant_object_tools_inner_local_var;
}

__attribute__((deprecated)) assistant_object_tools_inner_t *assistant_object_tools_inner_create(
    openai_api_assistant_object_tools_inner_TYPE_e type,
    assistant_tools_file_search_file_search_t *file_search,
    function_object_t *function
    ) {
    return assistant_object_tools_inner_create_internal (
        type,
        file_search,
        function
        );
}

void assistant_object_tools_inner_free(assistant_object_tools_inner_t *assistant_object_tools_inner) {
    if(NULL == assistant_object_tools_inner){
        return ;
    }
    if(assistant_object_tools_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "assistant_object_tools_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (assistant_object_tools_inner->file_search) {
        assistant_tools_file_search_file_search_free(assistant_object_tools_inner->file_search);
        assistant_object_tools_inner->file_search = NULL;
    }
    if (assistant_object_tools_inner->function) {
        function_object_free(assistant_object_tools_inner->function);
        assistant_object_tools_inner->function = NULL;
    }
    free(assistant_object_tools_inner);
}

cJSON *assistant_object_tools_inner_convertToJSON(assistant_object_tools_inner_t *assistant_object_tools_inner) {
    cJSON *item = cJSON_CreateObject();

    // assistant_object_tools_inner->type
    if (openai_api_assistant_object_tools_inner_TYPE_NULL == assistant_object_tools_inner->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", assistant_object_tools_inner_type_ToString(assistant_object_tools_inner->type)) == NULL)
    {
    goto fail; //Enum
    }


    // assistant_object_tools_inner->file_search
    if(assistant_object_tools_inner->file_search) {
    cJSON *file_search_local_JSON = assistant_tools_file_search_file_search_convertToJSON(assistant_object_tools_inner->file_search);
    if(file_search_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "file_search", file_search_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // assistant_object_tools_inner->function
    if (!assistant_object_tools_inner->function) {
        goto fail;
    }
    cJSON *function_local_JSON = function_object_convertToJSON(assistant_object_tools_inner->function);
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

assistant_object_tools_inner_t *assistant_object_tools_inner_parseFromJSON(cJSON *assistant_object_tools_innerJSON){

    assistant_object_tools_inner_t *assistant_object_tools_inner_local_var = NULL;

    // define the local variable for assistant_object_tools_inner->file_search
    assistant_tools_file_search_file_search_t *file_search_local_nonprim = NULL;

    // define the local variable for assistant_object_tools_inner->function
    function_object_t *function_local_nonprim = NULL;

    // assistant_object_tools_inner->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(assistant_object_tools_innerJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (!type) {
        goto end;
    }

    openai_api_assistant_object_tools_inner_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = assistant_object_tools_inner_type_FromString(type->valuestring);

    // assistant_object_tools_inner->file_search
    cJSON *file_search = cJSON_GetObjectItemCaseSensitive(assistant_object_tools_innerJSON, "file_search");
    if (cJSON_IsNull(file_search)) {
        file_search = NULL;
    }
    if (file_search) { 
    file_search_local_nonprim = assistant_tools_file_search_file_search_parseFromJSON(file_search); //nonprimitive
    }

    // assistant_object_tools_inner->function
    cJSON *function = cJSON_GetObjectItemCaseSensitive(assistant_object_tools_innerJSON, "function");
    if (cJSON_IsNull(function)) {
        function = NULL;
    }
    if (!function) {
        goto end;
    }

    
    function_local_nonprim = function_object_parseFromJSON(function); //nonprimitive


    assistant_object_tools_inner_local_var = assistant_object_tools_inner_create_internal (
        typeVariable,
        file_search ? file_search_local_nonprim : NULL,
        function_local_nonprim
        );

    return assistant_object_tools_inner_local_var;
end:
    if (file_search_local_nonprim) {
        assistant_tools_file_search_file_search_free(file_search_local_nonprim);
        file_search_local_nonprim = NULL;
    }
    if (function_local_nonprim) {
        function_object_free(function_local_nonprim);
        function_local_nonprim = NULL;
    }
    return NULL;

}
