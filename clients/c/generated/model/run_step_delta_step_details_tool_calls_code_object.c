#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "run_step_delta_step_details_tool_calls_code_object.h"


char* run_step_delta_step_details_tool_calls_code_object_type_ToString(openai_api_run_step_delta_step_details_tool_calls_code_object_TYPE_e type) {
    char* typeArray[] =  { "NULL", "code_interpreter" };
    return typeArray[type];
}

openai_api_run_step_delta_step_details_tool_calls_code_object_TYPE_e run_step_delta_step_details_tool_calls_code_object_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "code_interpreter" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static run_step_delta_step_details_tool_calls_code_object_t *run_step_delta_step_details_tool_calls_code_object_create_internal(
    int *index,
    char *id,
    openai_api_run_step_delta_step_details_tool_calls_code_object_TYPE_e type,
    run_step_delta_step_details_tool_calls_code_object_code_interpreter_t *code_interpreter
    ) {
    run_step_delta_step_details_tool_calls_code_object_t *run_step_delta_step_details_tool_calls_code_object_local_var = malloc(sizeof(run_step_delta_step_details_tool_calls_code_object_t));
    if (!run_step_delta_step_details_tool_calls_code_object_local_var) {
        return NULL;
    }
    memset(run_step_delta_step_details_tool_calls_code_object_local_var, 0, sizeof(run_step_delta_step_details_tool_calls_code_object_t));
    run_step_delta_step_details_tool_calls_code_object_local_var->_library_owned = 1;
    run_step_delta_step_details_tool_calls_code_object_local_var->index = index;
    run_step_delta_step_details_tool_calls_code_object_local_var->id = id;
    run_step_delta_step_details_tool_calls_code_object_local_var->type = type;
    run_step_delta_step_details_tool_calls_code_object_local_var->code_interpreter = code_interpreter;
    return run_step_delta_step_details_tool_calls_code_object_local_var;
}

__attribute__((deprecated)) run_step_delta_step_details_tool_calls_code_object_t *run_step_delta_step_details_tool_calls_code_object_create(
    int *index,
    char *id,
    openai_api_run_step_delta_step_details_tool_calls_code_object_TYPE_e type,
    run_step_delta_step_details_tool_calls_code_object_code_interpreter_t *code_interpreter
    ) {
    int *index_copy = NULL;
    if (index) {
        index_copy = malloc(sizeof(int));
        if (index_copy) *index_copy = *index;
    }
    run_step_delta_step_details_tool_calls_code_object_t *result = run_step_delta_step_details_tool_calls_code_object_create_internal (
        index_copy,
        id,
        type,
        code_interpreter
        );
    if (!result) {
        free(index_copy);
    }
    return result;
}

void run_step_delta_step_details_tool_calls_code_object_free(run_step_delta_step_details_tool_calls_code_object_t *run_step_delta_step_details_tool_calls_code_object) {
    if(NULL == run_step_delta_step_details_tool_calls_code_object){
        return ;
    }
    if(run_step_delta_step_details_tool_calls_code_object->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "run_step_delta_step_details_tool_calls_code_object_free");
        return ;
    }
    listEntry_t *listEntry;
    if (run_step_delta_step_details_tool_calls_code_object->index) {
        free(run_step_delta_step_details_tool_calls_code_object->index);
        run_step_delta_step_details_tool_calls_code_object->index = NULL;
    }
    if (run_step_delta_step_details_tool_calls_code_object->id) {
        free(run_step_delta_step_details_tool_calls_code_object->id);
        run_step_delta_step_details_tool_calls_code_object->id = NULL;
    }
    if (run_step_delta_step_details_tool_calls_code_object->code_interpreter) {
        run_step_delta_step_details_tool_calls_code_object_code_interpreter_free(run_step_delta_step_details_tool_calls_code_object->code_interpreter);
        run_step_delta_step_details_tool_calls_code_object->code_interpreter = NULL;
    }
    free(run_step_delta_step_details_tool_calls_code_object);
}

cJSON *run_step_delta_step_details_tool_calls_code_object_convertToJSON(run_step_delta_step_details_tool_calls_code_object_t *run_step_delta_step_details_tool_calls_code_object) {
    cJSON *item = cJSON_CreateObject();

    // run_step_delta_step_details_tool_calls_code_object->index
    if (!run_step_delta_step_details_tool_calls_code_object->index) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "index", *run_step_delta_step_details_tool_calls_code_object->index) == NULL) {
    goto fail; //Numeric
    }


    // run_step_delta_step_details_tool_calls_code_object->id
    if(run_step_delta_step_details_tool_calls_code_object->id) {
    if(cJSON_AddStringToObject(item, "id", run_step_delta_step_details_tool_calls_code_object->id) == NULL) {
    goto fail; //String
    }
    }


    // run_step_delta_step_details_tool_calls_code_object->type
    if (openai_api_run_step_delta_step_details_tool_calls_code_object_TYPE_NULL == run_step_delta_step_details_tool_calls_code_object->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", run_step_delta_step_details_tool_calls_code_object_type_ToString(run_step_delta_step_details_tool_calls_code_object->type)) == NULL)
    {
    goto fail; //Enum
    }


    // run_step_delta_step_details_tool_calls_code_object->code_interpreter
    if(run_step_delta_step_details_tool_calls_code_object->code_interpreter) {
    cJSON *code_interpreter_local_JSON = run_step_delta_step_details_tool_calls_code_object_code_interpreter_convertToJSON(run_step_delta_step_details_tool_calls_code_object->code_interpreter);
    if(code_interpreter_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "code_interpreter", code_interpreter_local_JSON);
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

run_step_delta_step_details_tool_calls_code_object_t *run_step_delta_step_details_tool_calls_code_object_parseFromJSON(cJSON *run_step_delta_step_details_tool_calls_code_objectJSON){

    run_step_delta_step_details_tool_calls_code_object_t *run_step_delta_step_details_tool_calls_code_object_local_var = NULL;

    // define the local variable for run_step_delta_step_details_tool_calls_code_object->index
    int *index_local_var = NULL;

    char *id_local_str = NULL;

    // define the local variable for run_step_delta_step_details_tool_calls_code_object->code_interpreter
    run_step_delta_step_details_tool_calls_code_object_code_interpreter_t *code_interpreter_local_nonprim = NULL;

    // run_step_delta_step_details_tool_calls_code_object->index
    cJSON *index = cJSON_GetObjectItemCaseSensitive(run_step_delta_step_details_tool_calls_code_objectJSON, "index");
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
    index_local_var = malloc(sizeof(int));
    if(!index_local_var)
    {
        goto end;
    }
    *index_local_var = index->valuedouble;

    // run_step_delta_step_details_tool_calls_code_object->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(run_step_delta_step_details_tool_calls_code_objectJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // run_step_delta_step_details_tool_calls_code_object->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(run_step_delta_step_details_tool_calls_code_objectJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (!type) {
        goto end;
    }

    openai_api_run_step_delta_step_details_tool_calls_code_object_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = run_step_delta_step_details_tool_calls_code_object_type_FromString(type->valuestring);

    // run_step_delta_step_details_tool_calls_code_object->code_interpreter
    cJSON *code_interpreter = cJSON_GetObjectItemCaseSensitive(run_step_delta_step_details_tool_calls_code_objectJSON, "code_interpreter");
    if (cJSON_IsNull(code_interpreter)) {
        code_interpreter = NULL;
    }
    if (code_interpreter) { 
    code_interpreter_local_nonprim = run_step_delta_step_details_tool_calls_code_object_code_interpreter_parseFromJSON(code_interpreter); //nonprimitive
    }


    if (id && !cJSON_IsNull(id)) id_local_str = strdup(id->valuestring);

    run_step_delta_step_details_tool_calls_code_object_local_var = run_step_delta_step_details_tool_calls_code_object_create_internal (
        index_local_var,
        id_local_str,
        typeVariable,
        code_interpreter ? code_interpreter_local_nonprim : NULL
        );

    if (!run_step_delta_step_details_tool_calls_code_object_local_var) {
        goto end;
    }

    return run_step_delta_step_details_tool_calls_code_object_local_var;
end:
    if (index_local_var) {
        free(index_local_var);
        index_local_var = NULL;
    }
    if (id_local_str) {
        free(id_local_str);
        id_local_str = NULL;
    }
    if (code_interpreter_local_nonprim) {
        run_step_delta_step_details_tool_calls_code_object_code_interpreter_free(code_interpreter_local_nonprim);
        code_interpreter_local_nonprim = NULL;
    }
    return NULL;

}
