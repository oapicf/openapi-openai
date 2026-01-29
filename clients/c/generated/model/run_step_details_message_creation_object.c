#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "run_step_details_message_creation_object.h"


char* run_step_details_message_creation_object_type_ToString(openai_api_run_step_details_message_creation_object_TYPE_e type) {
    char* typeArray[] =  { "NULL", "message_creation" };
    return typeArray[type];
}

openai_api_run_step_details_message_creation_object_TYPE_e run_step_details_message_creation_object_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "message_creation" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static run_step_details_message_creation_object_t *run_step_details_message_creation_object_create_internal(
    openai_api_run_step_details_message_creation_object_TYPE_e type,
    run_step_details_message_creation_object_message_creation_t *message_creation
    ) {
    run_step_details_message_creation_object_t *run_step_details_message_creation_object_local_var = malloc(sizeof(run_step_details_message_creation_object_t));
    if (!run_step_details_message_creation_object_local_var) {
        return NULL;
    }
    run_step_details_message_creation_object_local_var->type = type;
    run_step_details_message_creation_object_local_var->message_creation = message_creation;

    run_step_details_message_creation_object_local_var->_library_owned = 1;
    return run_step_details_message_creation_object_local_var;
}

__attribute__((deprecated)) run_step_details_message_creation_object_t *run_step_details_message_creation_object_create(
    openai_api_run_step_details_message_creation_object_TYPE_e type,
    run_step_details_message_creation_object_message_creation_t *message_creation
    ) {
    return run_step_details_message_creation_object_create_internal (
        type,
        message_creation
        );
}

void run_step_details_message_creation_object_free(run_step_details_message_creation_object_t *run_step_details_message_creation_object) {
    if(NULL == run_step_details_message_creation_object){
        return ;
    }
    if(run_step_details_message_creation_object->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "run_step_details_message_creation_object_free");
        return ;
    }
    listEntry_t *listEntry;
    if (run_step_details_message_creation_object->message_creation) {
        run_step_details_message_creation_object_message_creation_free(run_step_details_message_creation_object->message_creation);
        run_step_details_message_creation_object->message_creation = NULL;
    }
    free(run_step_details_message_creation_object);
}

cJSON *run_step_details_message_creation_object_convertToJSON(run_step_details_message_creation_object_t *run_step_details_message_creation_object) {
    cJSON *item = cJSON_CreateObject();

    // run_step_details_message_creation_object->type
    if (openai_api_run_step_details_message_creation_object_TYPE_NULL == run_step_details_message_creation_object->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", run_step_details_message_creation_object_type_ToString(run_step_details_message_creation_object->type)) == NULL)
    {
    goto fail; //Enum
    }


    // run_step_details_message_creation_object->message_creation
    if (!run_step_details_message_creation_object->message_creation) {
        goto fail;
    }
    cJSON *message_creation_local_JSON = run_step_details_message_creation_object_message_creation_convertToJSON(run_step_details_message_creation_object->message_creation);
    if(message_creation_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "message_creation", message_creation_local_JSON);
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

run_step_details_message_creation_object_t *run_step_details_message_creation_object_parseFromJSON(cJSON *run_step_details_message_creation_objectJSON){

    run_step_details_message_creation_object_t *run_step_details_message_creation_object_local_var = NULL;

    // define the local variable for run_step_details_message_creation_object->message_creation
    run_step_details_message_creation_object_message_creation_t *message_creation_local_nonprim = NULL;

    // run_step_details_message_creation_object->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(run_step_details_message_creation_objectJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (!type) {
        goto end;
    }

    openai_api_run_step_details_message_creation_object_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = run_step_details_message_creation_object_type_FromString(type->valuestring);

    // run_step_details_message_creation_object->message_creation
    cJSON *message_creation = cJSON_GetObjectItemCaseSensitive(run_step_details_message_creation_objectJSON, "message_creation");
    if (cJSON_IsNull(message_creation)) {
        message_creation = NULL;
    }
    if (!message_creation) {
        goto end;
    }

    
    message_creation_local_nonprim = run_step_details_message_creation_object_message_creation_parseFromJSON(message_creation); //nonprimitive


    run_step_details_message_creation_object_local_var = run_step_details_message_creation_object_create_internal (
        typeVariable,
        message_creation_local_nonprim
        );

    return run_step_details_message_creation_object_local_var;
end:
    if (message_creation_local_nonprim) {
        run_step_details_message_creation_object_message_creation_free(message_creation_local_nonprim);
        message_creation_local_nonprim = NULL;
    }
    return NULL;

}
