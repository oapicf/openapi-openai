#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_thread_and_run_request_tools_inner.h"


char* create_thread_and_run_request_tools_inner_type_ToString(openai_api_create_thread_and_run_request_tools_inner_TYPE_e type) {
    char* typeArray[] =  { "NULL", "code_interpreter", "file_search", "function" };
    return typeArray[type];
}

openai_api_create_thread_and_run_request_tools_inner_TYPE_e create_thread_and_run_request_tools_inner_type_FromString(char* type){
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

static create_thread_and_run_request_tools_inner_t *create_thread_and_run_request_tools_inner_create_internal(
    openai_api_create_thread_and_run_request_tools_inner_TYPE_e type,
    assistant_tools_file_search_file_search_t *file_search,
    function_object_t *function
    ) {
    create_thread_and_run_request_tools_inner_t *create_thread_and_run_request_tools_inner_local_var = malloc(sizeof(create_thread_and_run_request_tools_inner_t));
    if (!create_thread_and_run_request_tools_inner_local_var) {
        return NULL;
    }
    create_thread_and_run_request_tools_inner_local_var->type = type;
    create_thread_and_run_request_tools_inner_local_var->file_search = file_search;
    create_thread_and_run_request_tools_inner_local_var->function = function;

    create_thread_and_run_request_tools_inner_local_var->_library_owned = 1;
    return create_thread_and_run_request_tools_inner_local_var;
}

__attribute__((deprecated)) create_thread_and_run_request_tools_inner_t *create_thread_and_run_request_tools_inner_create(
    openai_api_create_thread_and_run_request_tools_inner_TYPE_e type,
    assistant_tools_file_search_file_search_t *file_search,
    function_object_t *function
    ) {
    return create_thread_and_run_request_tools_inner_create_internal (
        type,
        file_search,
        function
        );
}

void create_thread_and_run_request_tools_inner_free(create_thread_and_run_request_tools_inner_t *create_thread_and_run_request_tools_inner) {
    if(NULL == create_thread_and_run_request_tools_inner){
        return ;
    }
    if(create_thread_and_run_request_tools_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "create_thread_and_run_request_tools_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (create_thread_and_run_request_tools_inner->file_search) {
        assistant_tools_file_search_file_search_free(create_thread_and_run_request_tools_inner->file_search);
        create_thread_and_run_request_tools_inner->file_search = NULL;
    }
    if (create_thread_and_run_request_tools_inner->function) {
        function_object_free(create_thread_and_run_request_tools_inner->function);
        create_thread_and_run_request_tools_inner->function = NULL;
    }
    free(create_thread_and_run_request_tools_inner);
}

cJSON *create_thread_and_run_request_tools_inner_convertToJSON(create_thread_and_run_request_tools_inner_t *create_thread_and_run_request_tools_inner) {
    cJSON *item = cJSON_CreateObject();

    // create_thread_and_run_request_tools_inner->type
    if (openai_api_create_thread_and_run_request_tools_inner_TYPE_NULL == create_thread_and_run_request_tools_inner->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", create_thread_and_run_request_tools_inner_type_ToString(create_thread_and_run_request_tools_inner->type)) == NULL)
    {
    goto fail; //Enum
    }


    // create_thread_and_run_request_tools_inner->file_search
    if(create_thread_and_run_request_tools_inner->file_search) {
    cJSON *file_search_local_JSON = assistant_tools_file_search_file_search_convertToJSON(create_thread_and_run_request_tools_inner->file_search);
    if(file_search_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "file_search", file_search_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // create_thread_and_run_request_tools_inner->function
    if (!create_thread_and_run_request_tools_inner->function) {
        goto fail;
    }
    cJSON *function_local_JSON = function_object_convertToJSON(create_thread_and_run_request_tools_inner->function);
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

create_thread_and_run_request_tools_inner_t *create_thread_and_run_request_tools_inner_parseFromJSON(cJSON *create_thread_and_run_request_tools_innerJSON){

    create_thread_and_run_request_tools_inner_t *create_thread_and_run_request_tools_inner_local_var = NULL;

    // define the local variable for create_thread_and_run_request_tools_inner->file_search
    assistant_tools_file_search_file_search_t *file_search_local_nonprim = NULL;

    // define the local variable for create_thread_and_run_request_tools_inner->function
    function_object_t *function_local_nonprim = NULL;

    // create_thread_and_run_request_tools_inner->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(create_thread_and_run_request_tools_innerJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (!type) {
        goto end;
    }

    openai_api_create_thread_and_run_request_tools_inner_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = create_thread_and_run_request_tools_inner_type_FromString(type->valuestring);

    // create_thread_and_run_request_tools_inner->file_search
    cJSON *file_search = cJSON_GetObjectItemCaseSensitive(create_thread_and_run_request_tools_innerJSON, "file_search");
    if (cJSON_IsNull(file_search)) {
        file_search = NULL;
    }
    if (file_search) { 
    file_search_local_nonprim = assistant_tools_file_search_file_search_parseFromJSON(file_search); //nonprimitive
    }

    // create_thread_and_run_request_tools_inner->function
    cJSON *function = cJSON_GetObjectItemCaseSensitive(create_thread_and_run_request_tools_innerJSON, "function");
    if (cJSON_IsNull(function)) {
        function = NULL;
    }
    if (!function) {
        goto end;
    }

    
    function_local_nonprim = function_object_parseFromJSON(function); //nonprimitive


    create_thread_and_run_request_tools_inner_local_var = create_thread_and_run_request_tools_inner_create_internal (
        typeVariable,
        file_search ? file_search_local_nonprim : NULL,
        function_local_nonprim
        );

    return create_thread_and_run_request_tools_inner_local_var;
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
