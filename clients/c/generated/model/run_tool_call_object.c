#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "run_tool_call_object.h"


char* run_tool_call_object_type_ToString(openai_api_run_tool_call_object_TYPE_e type) {
    char* typeArray[] =  { "NULL", "function" };
    return typeArray[type];
}

openai_api_run_tool_call_object_TYPE_e run_tool_call_object_type_FromString(char* type){
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

static run_tool_call_object_t *run_tool_call_object_create_internal(
    char *id,
    openai_api_run_tool_call_object_TYPE_e type,
    run_tool_call_object_function_t *function
    ) {
    run_tool_call_object_t *run_tool_call_object_local_var = malloc(sizeof(run_tool_call_object_t));
    if (!run_tool_call_object_local_var) {
        return NULL;
    }
    run_tool_call_object_local_var->id = id;
    run_tool_call_object_local_var->type = type;
    run_tool_call_object_local_var->function = function;

    run_tool_call_object_local_var->_library_owned = 1;
    return run_tool_call_object_local_var;
}

__attribute__((deprecated)) run_tool_call_object_t *run_tool_call_object_create(
    char *id,
    openai_api_run_tool_call_object_TYPE_e type,
    run_tool_call_object_function_t *function
    ) {
    return run_tool_call_object_create_internal (
        id,
        type,
        function
        );
}

void run_tool_call_object_free(run_tool_call_object_t *run_tool_call_object) {
    if(NULL == run_tool_call_object){
        return ;
    }
    if(run_tool_call_object->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "run_tool_call_object_free");
        return ;
    }
    listEntry_t *listEntry;
    if (run_tool_call_object->id) {
        free(run_tool_call_object->id);
        run_tool_call_object->id = NULL;
    }
    if (run_tool_call_object->function) {
        run_tool_call_object_function_free(run_tool_call_object->function);
        run_tool_call_object->function = NULL;
    }
    free(run_tool_call_object);
}

cJSON *run_tool_call_object_convertToJSON(run_tool_call_object_t *run_tool_call_object) {
    cJSON *item = cJSON_CreateObject();

    // run_tool_call_object->id
    if (!run_tool_call_object->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", run_tool_call_object->id) == NULL) {
    goto fail; //String
    }


    // run_tool_call_object->type
    if (openai_api_run_tool_call_object_TYPE_NULL == run_tool_call_object->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", run_tool_call_object_type_ToString(run_tool_call_object->type)) == NULL)
    {
    goto fail; //Enum
    }


    // run_tool_call_object->function
    if (!run_tool_call_object->function) {
        goto fail;
    }
    cJSON *function_local_JSON = run_tool_call_object_function_convertToJSON(run_tool_call_object->function);
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

run_tool_call_object_t *run_tool_call_object_parseFromJSON(cJSON *run_tool_call_objectJSON){

    run_tool_call_object_t *run_tool_call_object_local_var = NULL;

    // define the local variable for run_tool_call_object->function
    run_tool_call_object_function_t *function_local_nonprim = NULL;

    // run_tool_call_object->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(run_tool_call_objectJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }

    // run_tool_call_object->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(run_tool_call_objectJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (!type) {
        goto end;
    }

    openai_api_run_tool_call_object_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = run_tool_call_object_type_FromString(type->valuestring);

    // run_tool_call_object->function
    cJSON *function = cJSON_GetObjectItemCaseSensitive(run_tool_call_objectJSON, "function");
    if (cJSON_IsNull(function)) {
        function = NULL;
    }
    if (!function) {
        goto end;
    }

    
    function_local_nonprim = run_tool_call_object_function_parseFromJSON(function); //nonprimitive


    run_tool_call_object_local_var = run_tool_call_object_create_internal (
        strdup(id->valuestring),
        typeVariable,
        function_local_nonprim
        );

    return run_tool_call_object_local_var;
end:
    if (function_local_nonprim) {
        run_tool_call_object_function_free(function_local_nonprim);
        function_local_nonprim = NULL;
    }
    return NULL;

}
