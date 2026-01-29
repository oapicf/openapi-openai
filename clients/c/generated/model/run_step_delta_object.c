#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "run_step_delta_object.h"


char* run_step_delta_object_object_ToString(openai_api_run_step_delta_object_OBJECT_e object) {
    char* objectArray[] =  { "NULL", "thread.run.step.delta" };
    return objectArray[object];
}

openai_api_run_step_delta_object_OBJECT_e run_step_delta_object_object_FromString(char* object){
    int stringToReturn = 0;
    char *objectArray[] =  { "NULL", "thread.run.step.delta" };
    size_t sizeofArray = sizeof(objectArray) / sizeof(objectArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(object, objectArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static run_step_delta_object_t *run_step_delta_object_create_internal(
    char *id,
    openai_api_run_step_delta_object_OBJECT_e object,
    run_step_delta_object_delta_t *delta
    ) {
    run_step_delta_object_t *run_step_delta_object_local_var = malloc(sizeof(run_step_delta_object_t));
    if (!run_step_delta_object_local_var) {
        return NULL;
    }
    run_step_delta_object_local_var->id = id;
    run_step_delta_object_local_var->object = object;
    run_step_delta_object_local_var->delta = delta;

    run_step_delta_object_local_var->_library_owned = 1;
    return run_step_delta_object_local_var;
}

__attribute__((deprecated)) run_step_delta_object_t *run_step_delta_object_create(
    char *id,
    openai_api_run_step_delta_object_OBJECT_e object,
    run_step_delta_object_delta_t *delta
    ) {
    return run_step_delta_object_create_internal (
        id,
        object,
        delta
        );
}

void run_step_delta_object_free(run_step_delta_object_t *run_step_delta_object) {
    if(NULL == run_step_delta_object){
        return ;
    }
    if(run_step_delta_object->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "run_step_delta_object_free");
        return ;
    }
    listEntry_t *listEntry;
    if (run_step_delta_object->id) {
        free(run_step_delta_object->id);
        run_step_delta_object->id = NULL;
    }
    if (run_step_delta_object->delta) {
        run_step_delta_object_delta_free(run_step_delta_object->delta);
        run_step_delta_object->delta = NULL;
    }
    free(run_step_delta_object);
}

cJSON *run_step_delta_object_convertToJSON(run_step_delta_object_t *run_step_delta_object) {
    cJSON *item = cJSON_CreateObject();

    // run_step_delta_object->id
    if (!run_step_delta_object->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", run_step_delta_object->id) == NULL) {
    goto fail; //String
    }


    // run_step_delta_object->object
    if (openai_api_run_step_delta_object_OBJECT_NULL == run_step_delta_object->object) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "object", run_step_delta_object_object_ToString(run_step_delta_object->object)) == NULL)
    {
    goto fail; //Enum
    }


    // run_step_delta_object->delta
    if (!run_step_delta_object->delta) {
        goto fail;
    }
    cJSON *delta_local_JSON = run_step_delta_object_delta_convertToJSON(run_step_delta_object->delta);
    if(delta_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "delta", delta_local_JSON);
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

run_step_delta_object_t *run_step_delta_object_parseFromJSON(cJSON *run_step_delta_objectJSON){

    run_step_delta_object_t *run_step_delta_object_local_var = NULL;

    // define the local variable for run_step_delta_object->delta
    run_step_delta_object_delta_t *delta_local_nonprim = NULL;

    // run_step_delta_object->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(run_step_delta_objectJSON, "id");
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

    // run_step_delta_object->object
    cJSON *object = cJSON_GetObjectItemCaseSensitive(run_step_delta_objectJSON, "object");
    if (cJSON_IsNull(object)) {
        object = NULL;
    }
    if (!object) {
        goto end;
    }

    openai_api_run_step_delta_object_OBJECT_e objectVariable;
    
    if(!cJSON_IsString(object))
    {
    goto end; //Enum
    }
    objectVariable = run_step_delta_object_object_FromString(object->valuestring);

    // run_step_delta_object->delta
    cJSON *delta = cJSON_GetObjectItemCaseSensitive(run_step_delta_objectJSON, "delta");
    if (cJSON_IsNull(delta)) {
        delta = NULL;
    }
    if (!delta) {
        goto end;
    }

    
    delta_local_nonprim = run_step_delta_object_delta_parseFromJSON(delta); //nonprimitive


    run_step_delta_object_local_var = run_step_delta_object_create_internal (
        strdup(id->valuestring),
        objectVariable,
        delta_local_nonprim
        );

    return run_step_delta_object_local_var;
end:
    if (delta_local_nonprim) {
        run_step_delta_object_delta_free(delta_local_nonprim);
        delta_local_nonprim = NULL;
    }
    return NULL;

}
