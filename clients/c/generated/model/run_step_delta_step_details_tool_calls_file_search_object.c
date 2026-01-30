#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "run_step_delta_step_details_tool_calls_file_search_object.h"


char* run_step_delta_step_details_tool_calls_file_search_object_type_ToString(openai_api_run_step_delta_step_details_tool_calls_file_search_object_TYPE_e type) {
    char* typeArray[] =  { "NULL", "file_search" };
    return typeArray[type];
}

openai_api_run_step_delta_step_details_tool_calls_file_search_object_TYPE_e run_step_delta_step_details_tool_calls_file_search_object_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "file_search" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static run_step_delta_step_details_tool_calls_file_search_object_t *run_step_delta_step_details_tool_calls_file_search_object_create_internal(
    int index,
    char *id,
    openai_api_run_step_delta_step_details_tool_calls_file_search_object_TYPE_e type,
    object_t *file_search
    ) {
    run_step_delta_step_details_tool_calls_file_search_object_t *run_step_delta_step_details_tool_calls_file_search_object_local_var = malloc(sizeof(run_step_delta_step_details_tool_calls_file_search_object_t));
    if (!run_step_delta_step_details_tool_calls_file_search_object_local_var) {
        return NULL;
    }
    run_step_delta_step_details_tool_calls_file_search_object_local_var->index = index;
    run_step_delta_step_details_tool_calls_file_search_object_local_var->id = id;
    run_step_delta_step_details_tool_calls_file_search_object_local_var->type = type;
    run_step_delta_step_details_tool_calls_file_search_object_local_var->file_search = file_search;

    run_step_delta_step_details_tool_calls_file_search_object_local_var->_library_owned = 1;
    return run_step_delta_step_details_tool_calls_file_search_object_local_var;
}

__attribute__((deprecated)) run_step_delta_step_details_tool_calls_file_search_object_t *run_step_delta_step_details_tool_calls_file_search_object_create(
    int index,
    char *id,
    openai_api_run_step_delta_step_details_tool_calls_file_search_object_TYPE_e type,
    object_t *file_search
    ) {
    return run_step_delta_step_details_tool_calls_file_search_object_create_internal (
        index,
        id,
        type,
        file_search
        );
}

void run_step_delta_step_details_tool_calls_file_search_object_free(run_step_delta_step_details_tool_calls_file_search_object_t *run_step_delta_step_details_tool_calls_file_search_object) {
    if(NULL == run_step_delta_step_details_tool_calls_file_search_object){
        return ;
    }
    if(run_step_delta_step_details_tool_calls_file_search_object->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "run_step_delta_step_details_tool_calls_file_search_object_free");
        return ;
    }
    listEntry_t *listEntry;
    if (run_step_delta_step_details_tool_calls_file_search_object->id) {
        free(run_step_delta_step_details_tool_calls_file_search_object->id);
        run_step_delta_step_details_tool_calls_file_search_object->id = NULL;
    }
    if (run_step_delta_step_details_tool_calls_file_search_object->file_search) {
        object_free(run_step_delta_step_details_tool_calls_file_search_object->file_search);
        run_step_delta_step_details_tool_calls_file_search_object->file_search = NULL;
    }
    free(run_step_delta_step_details_tool_calls_file_search_object);
}

cJSON *run_step_delta_step_details_tool_calls_file_search_object_convertToJSON(run_step_delta_step_details_tool_calls_file_search_object_t *run_step_delta_step_details_tool_calls_file_search_object) {
    cJSON *item = cJSON_CreateObject();

    // run_step_delta_step_details_tool_calls_file_search_object->index
    if (!run_step_delta_step_details_tool_calls_file_search_object->index) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "index", run_step_delta_step_details_tool_calls_file_search_object->index) == NULL) {
    goto fail; //Numeric
    }


    // run_step_delta_step_details_tool_calls_file_search_object->id
    if(run_step_delta_step_details_tool_calls_file_search_object->id) {
    if(cJSON_AddStringToObject(item, "id", run_step_delta_step_details_tool_calls_file_search_object->id) == NULL) {
    goto fail; //String
    }
    }


    // run_step_delta_step_details_tool_calls_file_search_object->type
    if (openai_api_run_step_delta_step_details_tool_calls_file_search_object_TYPE_NULL == run_step_delta_step_details_tool_calls_file_search_object->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", run_step_delta_step_details_tool_calls_file_search_object_type_ToString(run_step_delta_step_details_tool_calls_file_search_object->type)) == NULL)
    {
    goto fail; //Enum
    }


    // run_step_delta_step_details_tool_calls_file_search_object->file_search
    if (!run_step_delta_step_details_tool_calls_file_search_object->file_search) {
        goto fail;
    }
    cJSON *file_search_object = object_convertToJSON(run_step_delta_step_details_tool_calls_file_search_object->file_search);
    if(file_search_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "file_search", file_search_object);
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

run_step_delta_step_details_tool_calls_file_search_object_t *run_step_delta_step_details_tool_calls_file_search_object_parseFromJSON(cJSON *run_step_delta_step_details_tool_calls_file_search_objectJSON){

    run_step_delta_step_details_tool_calls_file_search_object_t *run_step_delta_step_details_tool_calls_file_search_object_local_var = NULL;

    // run_step_delta_step_details_tool_calls_file_search_object->index
    cJSON *index = cJSON_GetObjectItemCaseSensitive(run_step_delta_step_details_tool_calls_file_search_objectJSON, "index");
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

    // run_step_delta_step_details_tool_calls_file_search_object->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(run_step_delta_step_details_tool_calls_file_search_objectJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // run_step_delta_step_details_tool_calls_file_search_object->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(run_step_delta_step_details_tool_calls_file_search_objectJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (!type) {
        goto end;
    }

    openai_api_run_step_delta_step_details_tool_calls_file_search_object_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = run_step_delta_step_details_tool_calls_file_search_object_type_FromString(type->valuestring);

    // run_step_delta_step_details_tool_calls_file_search_object->file_search
    cJSON *file_search = cJSON_GetObjectItemCaseSensitive(run_step_delta_step_details_tool_calls_file_search_objectJSON, "file_search");
    if (cJSON_IsNull(file_search)) {
        file_search = NULL;
    }
    if (!file_search) {
        goto end;
    }

    object_t *file_search_local_object = NULL;
    
    file_search_local_object = object_parseFromJSON(file_search); //object


    run_step_delta_step_details_tool_calls_file_search_object_local_var = run_step_delta_step_details_tool_calls_file_search_object_create_internal (
        index->valuedouble,
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL,
        typeVariable,
        file_search_local_object
        );

    return run_step_delta_step_details_tool_calls_file_search_object_local_var;
end:
    return NULL;

}
