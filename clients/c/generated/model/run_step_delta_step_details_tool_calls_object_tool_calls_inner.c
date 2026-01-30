#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "run_step_delta_step_details_tool_calls_object_tool_calls_inner.h"


char* run_step_delta_step_details_tool_calls_object_tool_calls_inner_type_ToString(openai_api_run_step_delta_step_details_tool_calls_object_tool_calls_inner_TYPE_e type) {
    char* typeArray[] =  { "NULL", "code_interpreter", "file_search", "function" };
    return typeArray[type];
}

openai_api_run_step_delta_step_details_tool_calls_object_tool_calls_inner_TYPE_e run_step_delta_step_details_tool_calls_object_tool_calls_inner_type_FromString(char* type){
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

static run_step_delta_step_details_tool_calls_object_tool_calls_inner_t *run_step_delta_step_details_tool_calls_object_tool_calls_inner_create_internal(
    int index,
    char *id,
    openai_api_run_step_delta_step_details_tool_calls_object_tool_calls_inner_TYPE_e type,
    run_step_delta_step_details_tool_calls_code_object_code_interpreter_t *code_interpreter,
    object_t *file_search,
    run_step_delta_step_details_tool_calls_function_object_function_t *function
    ) {
    run_step_delta_step_details_tool_calls_object_tool_calls_inner_t *run_step_delta_step_details_tool_calls_object_tool_calls_inner_local_var = malloc(sizeof(run_step_delta_step_details_tool_calls_object_tool_calls_inner_t));
    if (!run_step_delta_step_details_tool_calls_object_tool_calls_inner_local_var) {
        return NULL;
    }
    run_step_delta_step_details_tool_calls_object_tool_calls_inner_local_var->index = index;
    run_step_delta_step_details_tool_calls_object_tool_calls_inner_local_var->id = id;
    run_step_delta_step_details_tool_calls_object_tool_calls_inner_local_var->type = type;
    run_step_delta_step_details_tool_calls_object_tool_calls_inner_local_var->code_interpreter = code_interpreter;
    run_step_delta_step_details_tool_calls_object_tool_calls_inner_local_var->file_search = file_search;
    run_step_delta_step_details_tool_calls_object_tool_calls_inner_local_var->function = function;

    run_step_delta_step_details_tool_calls_object_tool_calls_inner_local_var->_library_owned = 1;
    return run_step_delta_step_details_tool_calls_object_tool_calls_inner_local_var;
}

__attribute__((deprecated)) run_step_delta_step_details_tool_calls_object_tool_calls_inner_t *run_step_delta_step_details_tool_calls_object_tool_calls_inner_create(
    int index,
    char *id,
    openai_api_run_step_delta_step_details_tool_calls_object_tool_calls_inner_TYPE_e type,
    run_step_delta_step_details_tool_calls_code_object_code_interpreter_t *code_interpreter,
    object_t *file_search,
    run_step_delta_step_details_tool_calls_function_object_function_t *function
    ) {
    return run_step_delta_step_details_tool_calls_object_tool_calls_inner_create_internal (
        index,
        id,
        type,
        code_interpreter,
        file_search,
        function
        );
}

void run_step_delta_step_details_tool_calls_object_tool_calls_inner_free(run_step_delta_step_details_tool_calls_object_tool_calls_inner_t *run_step_delta_step_details_tool_calls_object_tool_calls_inner) {
    if(NULL == run_step_delta_step_details_tool_calls_object_tool_calls_inner){
        return ;
    }
    if(run_step_delta_step_details_tool_calls_object_tool_calls_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "run_step_delta_step_details_tool_calls_object_tool_calls_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (run_step_delta_step_details_tool_calls_object_tool_calls_inner->id) {
        free(run_step_delta_step_details_tool_calls_object_tool_calls_inner->id);
        run_step_delta_step_details_tool_calls_object_tool_calls_inner->id = NULL;
    }
    if (run_step_delta_step_details_tool_calls_object_tool_calls_inner->code_interpreter) {
        run_step_delta_step_details_tool_calls_code_object_code_interpreter_free(run_step_delta_step_details_tool_calls_object_tool_calls_inner->code_interpreter);
        run_step_delta_step_details_tool_calls_object_tool_calls_inner->code_interpreter = NULL;
    }
    if (run_step_delta_step_details_tool_calls_object_tool_calls_inner->file_search) {
        object_free(run_step_delta_step_details_tool_calls_object_tool_calls_inner->file_search);
        run_step_delta_step_details_tool_calls_object_tool_calls_inner->file_search = NULL;
    }
    if (run_step_delta_step_details_tool_calls_object_tool_calls_inner->function) {
        run_step_delta_step_details_tool_calls_function_object_function_free(run_step_delta_step_details_tool_calls_object_tool_calls_inner->function);
        run_step_delta_step_details_tool_calls_object_tool_calls_inner->function = NULL;
    }
    free(run_step_delta_step_details_tool_calls_object_tool_calls_inner);
}

cJSON *run_step_delta_step_details_tool_calls_object_tool_calls_inner_convertToJSON(run_step_delta_step_details_tool_calls_object_tool_calls_inner_t *run_step_delta_step_details_tool_calls_object_tool_calls_inner) {
    cJSON *item = cJSON_CreateObject();

    // run_step_delta_step_details_tool_calls_object_tool_calls_inner->index
    if (!run_step_delta_step_details_tool_calls_object_tool_calls_inner->index) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "index", run_step_delta_step_details_tool_calls_object_tool_calls_inner->index) == NULL) {
    goto fail; //Numeric
    }


    // run_step_delta_step_details_tool_calls_object_tool_calls_inner->id
    if(run_step_delta_step_details_tool_calls_object_tool_calls_inner->id) {
    if(cJSON_AddStringToObject(item, "id", run_step_delta_step_details_tool_calls_object_tool_calls_inner->id) == NULL) {
    goto fail; //String
    }
    }


    // run_step_delta_step_details_tool_calls_object_tool_calls_inner->type
    if (openai_api_run_step_delta_step_details_tool_calls_object_tool_calls_inner_TYPE_NULL == run_step_delta_step_details_tool_calls_object_tool_calls_inner->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", run_step_delta_step_details_tool_calls_object_tool_calls_inner_type_ToString(run_step_delta_step_details_tool_calls_object_tool_calls_inner->type)) == NULL)
    {
    goto fail; //Enum
    }


    // run_step_delta_step_details_tool_calls_object_tool_calls_inner->code_interpreter
    if(run_step_delta_step_details_tool_calls_object_tool_calls_inner->code_interpreter) {
    cJSON *code_interpreter_local_JSON = run_step_delta_step_details_tool_calls_code_object_code_interpreter_convertToJSON(run_step_delta_step_details_tool_calls_object_tool_calls_inner->code_interpreter);
    if(code_interpreter_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "code_interpreter", code_interpreter_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // run_step_delta_step_details_tool_calls_object_tool_calls_inner->file_search
    if (!run_step_delta_step_details_tool_calls_object_tool_calls_inner->file_search) {
        goto fail;
    }
    cJSON *file_search_object = object_convertToJSON(run_step_delta_step_details_tool_calls_object_tool_calls_inner->file_search);
    if(file_search_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "file_search", file_search_object);
    if(item->child == NULL) {
    goto fail;
    }


    // run_step_delta_step_details_tool_calls_object_tool_calls_inner->function
    if(run_step_delta_step_details_tool_calls_object_tool_calls_inner->function) {
    cJSON *function_local_JSON = run_step_delta_step_details_tool_calls_function_object_function_convertToJSON(run_step_delta_step_details_tool_calls_object_tool_calls_inner->function);
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

run_step_delta_step_details_tool_calls_object_tool_calls_inner_t *run_step_delta_step_details_tool_calls_object_tool_calls_inner_parseFromJSON(cJSON *run_step_delta_step_details_tool_calls_object_tool_calls_innerJSON){

    run_step_delta_step_details_tool_calls_object_tool_calls_inner_t *run_step_delta_step_details_tool_calls_object_tool_calls_inner_local_var = NULL;

    // define the local variable for run_step_delta_step_details_tool_calls_object_tool_calls_inner->code_interpreter
    run_step_delta_step_details_tool_calls_code_object_code_interpreter_t *code_interpreter_local_nonprim = NULL;

    // define the local variable for run_step_delta_step_details_tool_calls_object_tool_calls_inner->function
    run_step_delta_step_details_tool_calls_function_object_function_t *function_local_nonprim = NULL;

    // run_step_delta_step_details_tool_calls_object_tool_calls_inner->index
    cJSON *index = cJSON_GetObjectItemCaseSensitive(run_step_delta_step_details_tool_calls_object_tool_calls_innerJSON, "index");
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

    // run_step_delta_step_details_tool_calls_object_tool_calls_inner->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(run_step_delta_step_details_tool_calls_object_tool_calls_innerJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // run_step_delta_step_details_tool_calls_object_tool_calls_inner->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(run_step_delta_step_details_tool_calls_object_tool_calls_innerJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (!type) {
        goto end;
    }

    openai_api_run_step_delta_step_details_tool_calls_object_tool_calls_inner_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = run_step_delta_step_details_tool_calls_object_tool_calls_inner_type_FromString(type->valuestring);

    // run_step_delta_step_details_tool_calls_object_tool_calls_inner->code_interpreter
    cJSON *code_interpreter = cJSON_GetObjectItemCaseSensitive(run_step_delta_step_details_tool_calls_object_tool_calls_innerJSON, "code_interpreter");
    if (cJSON_IsNull(code_interpreter)) {
        code_interpreter = NULL;
    }
    if (code_interpreter) { 
    code_interpreter_local_nonprim = run_step_delta_step_details_tool_calls_code_object_code_interpreter_parseFromJSON(code_interpreter); //nonprimitive
    }

    // run_step_delta_step_details_tool_calls_object_tool_calls_inner->file_search
    cJSON *file_search = cJSON_GetObjectItemCaseSensitive(run_step_delta_step_details_tool_calls_object_tool_calls_innerJSON, "file_search");
    if (cJSON_IsNull(file_search)) {
        file_search = NULL;
    }
    if (!file_search) {
        goto end;
    }

    object_t *file_search_local_object = NULL;
    
    file_search_local_object = object_parseFromJSON(file_search); //object

    // run_step_delta_step_details_tool_calls_object_tool_calls_inner->function
    cJSON *function = cJSON_GetObjectItemCaseSensitive(run_step_delta_step_details_tool_calls_object_tool_calls_innerJSON, "function");
    if (cJSON_IsNull(function)) {
        function = NULL;
    }
    if (function) { 
    function_local_nonprim = run_step_delta_step_details_tool_calls_function_object_function_parseFromJSON(function); //nonprimitive
    }


    run_step_delta_step_details_tool_calls_object_tool_calls_inner_local_var = run_step_delta_step_details_tool_calls_object_tool_calls_inner_create_internal (
        index->valuedouble,
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL,
        typeVariable,
        code_interpreter ? code_interpreter_local_nonprim : NULL,
        file_search_local_object,
        function ? function_local_nonprim : NULL
        );

    return run_step_delta_step_details_tool_calls_object_tool_calls_inner_local_var;
end:
    if (code_interpreter_local_nonprim) {
        run_step_delta_step_details_tool_calls_code_object_code_interpreter_free(code_interpreter_local_nonprim);
        code_interpreter_local_nonprim = NULL;
    }
    if (function_local_nonprim) {
        run_step_delta_step_details_tool_calls_function_object_function_free(function_local_nonprim);
        function_local_nonprim = NULL;
    }
    return NULL;

}
