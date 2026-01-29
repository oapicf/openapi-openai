#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "run_step_delta_step_details_tool_calls_function_object.h"


char* run_step_delta_step_details_tool_calls_function_object_type_ToString(openai_api_run_step_delta_step_details_tool_calls_function_object_TYPE_e type) {
    char* typeArray[] =  { "NULL", "function" };
    return typeArray[type];
}

openai_api_run_step_delta_step_details_tool_calls_function_object_TYPE_e run_step_delta_step_details_tool_calls_function_object_type_FromString(char* type){
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

static run_step_delta_step_details_tool_calls_function_object_t *run_step_delta_step_details_tool_calls_function_object_create_internal(
    int index,
    char *id,
    openai_api_run_step_delta_step_details_tool_calls_function_object_TYPE_e type,
    run_step_delta_step_details_tool_calls_function_object_function_t *function
    ) {
    run_step_delta_step_details_tool_calls_function_object_t *run_step_delta_step_details_tool_calls_function_object_local_var = malloc(sizeof(run_step_delta_step_details_tool_calls_function_object_t));
    if (!run_step_delta_step_details_tool_calls_function_object_local_var) {
        return NULL;
    }
    run_step_delta_step_details_tool_calls_function_object_local_var->index = index;
    run_step_delta_step_details_tool_calls_function_object_local_var->id = id;
    run_step_delta_step_details_tool_calls_function_object_local_var->type = type;
    run_step_delta_step_details_tool_calls_function_object_local_var->function = function;

    run_step_delta_step_details_tool_calls_function_object_local_var->_library_owned = 1;
    return run_step_delta_step_details_tool_calls_function_object_local_var;
}

__attribute__((deprecated)) run_step_delta_step_details_tool_calls_function_object_t *run_step_delta_step_details_tool_calls_function_object_create(
    int index,
    char *id,
    openai_api_run_step_delta_step_details_tool_calls_function_object_TYPE_e type,
    run_step_delta_step_details_tool_calls_function_object_function_t *function
    ) {
    return run_step_delta_step_details_tool_calls_function_object_create_internal (
        index,
        id,
        type,
        function
        );
}

void run_step_delta_step_details_tool_calls_function_object_free(run_step_delta_step_details_tool_calls_function_object_t *run_step_delta_step_details_tool_calls_function_object) {
    if(NULL == run_step_delta_step_details_tool_calls_function_object){
        return ;
    }
    if(run_step_delta_step_details_tool_calls_function_object->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "run_step_delta_step_details_tool_calls_function_object_free");
        return ;
    }
    listEntry_t *listEntry;
    if (run_step_delta_step_details_tool_calls_function_object->id) {
        free(run_step_delta_step_details_tool_calls_function_object->id);
        run_step_delta_step_details_tool_calls_function_object->id = NULL;
    }
    if (run_step_delta_step_details_tool_calls_function_object->function) {
        run_step_delta_step_details_tool_calls_function_object_function_free(run_step_delta_step_details_tool_calls_function_object->function);
        run_step_delta_step_details_tool_calls_function_object->function = NULL;
    }
    free(run_step_delta_step_details_tool_calls_function_object);
}

cJSON *run_step_delta_step_details_tool_calls_function_object_convertToJSON(run_step_delta_step_details_tool_calls_function_object_t *run_step_delta_step_details_tool_calls_function_object) {
    cJSON *item = cJSON_CreateObject();

    // run_step_delta_step_details_tool_calls_function_object->index
    if (!run_step_delta_step_details_tool_calls_function_object->index) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "index", run_step_delta_step_details_tool_calls_function_object->index) == NULL) {
    goto fail; //Numeric
    }


    // run_step_delta_step_details_tool_calls_function_object->id
    if(run_step_delta_step_details_tool_calls_function_object->id) {
    if(cJSON_AddStringToObject(item, "id", run_step_delta_step_details_tool_calls_function_object->id) == NULL) {
    goto fail; //String
    }
    }


    // run_step_delta_step_details_tool_calls_function_object->type
    if (openai_api_run_step_delta_step_details_tool_calls_function_object_TYPE_NULL == run_step_delta_step_details_tool_calls_function_object->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", run_step_delta_step_details_tool_calls_function_object_type_ToString(run_step_delta_step_details_tool_calls_function_object->type)) == NULL)
    {
    goto fail; //Enum
    }


    // run_step_delta_step_details_tool_calls_function_object->function
    if(run_step_delta_step_details_tool_calls_function_object->function) {
    cJSON *function_local_JSON = run_step_delta_step_details_tool_calls_function_object_function_convertToJSON(run_step_delta_step_details_tool_calls_function_object->function);
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

run_step_delta_step_details_tool_calls_function_object_t *run_step_delta_step_details_tool_calls_function_object_parseFromJSON(cJSON *run_step_delta_step_details_tool_calls_function_objectJSON){

    run_step_delta_step_details_tool_calls_function_object_t *run_step_delta_step_details_tool_calls_function_object_local_var = NULL;

    // define the local variable for run_step_delta_step_details_tool_calls_function_object->function
    run_step_delta_step_details_tool_calls_function_object_function_t *function_local_nonprim = NULL;

    // run_step_delta_step_details_tool_calls_function_object->index
    cJSON *index = cJSON_GetObjectItemCaseSensitive(run_step_delta_step_details_tool_calls_function_objectJSON, "index");
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

    // run_step_delta_step_details_tool_calls_function_object->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(run_step_delta_step_details_tool_calls_function_objectJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // run_step_delta_step_details_tool_calls_function_object->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(run_step_delta_step_details_tool_calls_function_objectJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (!type) {
        goto end;
    }

    openai_api_run_step_delta_step_details_tool_calls_function_object_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = run_step_delta_step_details_tool_calls_function_object_type_FromString(type->valuestring);

    // run_step_delta_step_details_tool_calls_function_object->function
    cJSON *function = cJSON_GetObjectItemCaseSensitive(run_step_delta_step_details_tool_calls_function_objectJSON, "function");
    if (cJSON_IsNull(function)) {
        function = NULL;
    }
    if (function) { 
    function_local_nonprim = run_step_delta_step_details_tool_calls_function_object_function_parseFromJSON(function); //nonprimitive
    }


    run_step_delta_step_details_tool_calls_function_object_local_var = run_step_delta_step_details_tool_calls_function_object_create_internal (
        index->valuedouble,
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL,
        typeVariable,
        function ? function_local_nonprim : NULL
        );

    return run_step_delta_step_details_tool_calls_function_object_local_var;
end:
    if (function_local_nonprim) {
        run_step_delta_step_details_tool_calls_function_object_function_free(function_local_nonprim);
        function_local_nonprim = NULL;
    }
    return NULL;

}
