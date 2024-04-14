#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "run_step_delta_step_details_tool_calls_retrieval_object.h"


char* run_step_delta_step_details_tool_calls_retrieval_object_type_ToString(openai_api_run_step_delta_step_details_tool_calls_retrieval_object_TYPE_e type) {
    char* typeArray[] =  { "NULL", "retrieval" };
    return typeArray[type];
}

openai_api_run_step_delta_step_details_tool_calls_retrieval_object_TYPE_e run_step_delta_step_details_tool_calls_retrieval_object_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "retrieval" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

run_step_delta_step_details_tool_calls_retrieval_object_t *run_step_delta_step_details_tool_calls_retrieval_object_create(
    int index,
    char *id,
    openai_api_run_step_delta_step_details_tool_calls_retrieval_object_TYPE_e type,
    object_t *retrieval
    ) {
    run_step_delta_step_details_tool_calls_retrieval_object_t *run_step_delta_step_details_tool_calls_retrieval_object_local_var = malloc(sizeof(run_step_delta_step_details_tool_calls_retrieval_object_t));
    if (!run_step_delta_step_details_tool_calls_retrieval_object_local_var) {
        return NULL;
    }
    run_step_delta_step_details_tool_calls_retrieval_object_local_var->index = index;
    run_step_delta_step_details_tool_calls_retrieval_object_local_var->id = id;
    run_step_delta_step_details_tool_calls_retrieval_object_local_var->type = type;
    run_step_delta_step_details_tool_calls_retrieval_object_local_var->retrieval = retrieval;

    return run_step_delta_step_details_tool_calls_retrieval_object_local_var;
}


void run_step_delta_step_details_tool_calls_retrieval_object_free(run_step_delta_step_details_tool_calls_retrieval_object_t *run_step_delta_step_details_tool_calls_retrieval_object) {
    if(NULL == run_step_delta_step_details_tool_calls_retrieval_object){
        return ;
    }
    listEntry_t *listEntry;
    if (run_step_delta_step_details_tool_calls_retrieval_object->id) {
        free(run_step_delta_step_details_tool_calls_retrieval_object->id);
        run_step_delta_step_details_tool_calls_retrieval_object->id = NULL;
    }
    if (run_step_delta_step_details_tool_calls_retrieval_object->retrieval) {
        object_free(run_step_delta_step_details_tool_calls_retrieval_object->retrieval);
        run_step_delta_step_details_tool_calls_retrieval_object->retrieval = NULL;
    }
    free(run_step_delta_step_details_tool_calls_retrieval_object);
}

cJSON *run_step_delta_step_details_tool_calls_retrieval_object_convertToJSON(run_step_delta_step_details_tool_calls_retrieval_object_t *run_step_delta_step_details_tool_calls_retrieval_object) {
    cJSON *item = cJSON_CreateObject();

    // run_step_delta_step_details_tool_calls_retrieval_object->index
    if (!run_step_delta_step_details_tool_calls_retrieval_object->index) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "index", run_step_delta_step_details_tool_calls_retrieval_object->index) == NULL) {
    goto fail; //Numeric
    }


    // run_step_delta_step_details_tool_calls_retrieval_object->id
    if(run_step_delta_step_details_tool_calls_retrieval_object->id) {
    if(cJSON_AddStringToObject(item, "id", run_step_delta_step_details_tool_calls_retrieval_object->id) == NULL) {
    goto fail; //String
    }
    }


    // run_step_delta_step_details_tool_calls_retrieval_object->type
    if (openai_api_run_step_delta_step_details_tool_calls_retrieval_object_TYPE_NULL == run_step_delta_step_details_tool_calls_retrieval_object->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", typerun_step_delta_step_details_tool_calls_retrieval_object_ToString(run_step_delta_step_details_tool_calls_retrieval_object->type)) == NULL)
    {
    goto fail; //Enum
    }


    // run_step_delta_step_details_tool_calls_retrieval_object->retrieval
    if(run_step_delta_step_details_tool_calls_retrieval_object->retrieval) {
    cJSON *retrieval_object = object_convertToJSON(run_step_delta_step_details_tool_calls_retrieval_object->retrieval);
    if(retrieval_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "retrieval", retrieval_object);
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

run_step_delta_step_details_tool_calls_retrieval_object_t *run_step_delta_step_details_tool_calls_retrieval_object_parseFromJSON(cJSON *run_step_delta_step_details_tool_calls_retrieval_objectJSON){

    run_step_delta_step_details_tool_calls_retrieval_object_t *run_step_delta_step_details_tool_calls_retrieval_object_local_var = NULL;

    // run_step_delta_step_details_tool_calls_retrieval_object->index
    cJSON *index = cJSON_GetObjectItemCaseSensitive(run_step_delta_step_details_tool_calls_retrieval_objectJSON, "index");
    if (!index) {
        goto end;
    }

    
    if(!cJSON_IsNumber(index))
    {
    goto end; //Numeric
    }

    // run_step_delta_step_details_tool_calls_retrieval_object->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(run_step_delta_step_details_tool_calls_retrieval_objectJSON, "id");
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // run_step_delta_step_details_tool_calls_retrieval_object->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(run_step_delta_step_details_tool_calls_retrieval_objectJSON, "type");
    if (!type) {
        goto end;
    }

    openai_api_run_step_delta_step_details_tool_calls_retrieval_object_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = run_step_delta_step_details_tool_calls_retrieval_object_type_FromString(type->valuestring);

    // run_step_delta_step_details_tool_calls_retrieval_object->retrieval
    cJSON *retrieval = cJSON_GetObjectItemCaseSensitive(run_step_delta_step_details_tool_calls_retrieval_objectJSON, "retrieval");
    object_t *retrieval_local_object = NULL;
    if (retrieval) { 
    retrieval_local_object = object_parseFromJSON(retrieval); //object
    }


    run_step_delta_step_details_tool_calls_retrieval_object_local_var = run_step_delta_step_details_tool_calls_retrieval_object_create (
        index->valuedouble,
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL,
        typeVariable,
        retrieval ? retrieval_local_object : NULL
        );

    return run_step_delta_step_details_tool_calls_retrieval_object_local_var;
end:
    return NULL;

}
