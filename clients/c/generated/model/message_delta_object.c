#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "message_delta_object.h"


char* message_delta_object_object_ToString(openai_api_message_delta_object_OBJECT_e object) {
    char* objectArray[] =  { "NULL", "thread.message.delta" };
    return objectArray[object];
}

openai_api_message_delta_object_OBJECT_e message_delta_object_object_FromString(char* object){
    int stringToReturn = 0;
    char *objectArray[] =  { "NULL", "thread.message.delta" };
    size_t sizeofArray = sizeof(objectArray) / sizeof(objectArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(object, objectArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static message_delta_object_t *message_delta_object_create_internal(
    char *id,
    openai_api_message_delta_object_OBJECT_e object,
    message_delta_object_delta_t *delta
    ) {
    message_delta_object_t *message_delta_object_local_var = malloc(sizeof(message_delta_object_t));
    if (!message_delta_object_local_var) {
        return NULL;
    }
    message_delta_object_local_var->id = id;
    message_delta_object_local_var->object = object;
    message_delta_object_local_var->delta = delta;

    message_delta_object_local_var->_library_owned = 1;
    return message_delta_object_local_var;
}

__attribute__((deprecated)) message_delta_object_t *message_delta_object_create(
    char *id,
    openai_api_message_delta_object_OBJECT_e object,
    message_delta_object_delta_t *delta
    ) {
    return message_delta_object_create_internal (
        id,
        object,
        delta
        );
}

void message_delta_object_free(message_delta_object_t *message_delta_object) {
    if(NULL == message_delta_object){
        return ;
    }
    if(message_delta_object->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "message_delta_object_free");
        return ;
    }
    listEntry_t *listEntry;
    if (message_delta_object->id) {
        free(message_delta_object->id);
        message_delta_object->id = NULL;
    }
    if (message_delta_object->delta) {
        message_delta_object_delta_free(message_delta_object->delta);
        message_delta_object->delta = NULL;
    }
    free(message_delta_object);
}

cJSON *message_delta_object_convertToJSON(message_delta_object_t *message_delta_object) {
    cJSON *item = cJSON_CreateObject();

    // message_delta_object->id
    if (!message_delta_object->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", message_delta_object->id) == NULL) {
    goto fail; //String
    }


    // message_delta_object->object
    if (openai_api_message_delta_object_OBJECT_NULL == message_delta_object->object) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "object", message_delta_object_object_ToString(message_delta_object->object)) == NULL)
    {
    goto fail; //Enum
    }


    // message_delta_object->delta
    if (!message_delta_object->delta) {
        goto fail;
    }
    cJSON *delta_local_JSON = message_delta_object_delta_convertToJSON(message_delta_object->delta);
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

message_delta_object_t *message_delta_object_parseFromJSON(cJSON *message_delta_objectJSON){

    message_delta_object_t *message_delta_object_local_var = NULL;

    // define the local variable for message_delta_object->delta
    message_delta_object_delta_t *delta_local_nonprim = NULL;

    // message_delta_object->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(message_delta_objectJSON, "id");
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

    // message_delta_object->object
    cJSON *object = cJSON_GetObjectItemCaseSensitive(message_delta_objectJSON, "object");
    if (cJSON_IsNull(object)) {
        object = NULL;
    }
    if (!object) {
        goto end;
    }

    openai_api_message_delta_object_OBJECT_e objectVariable;
    
    if(!cJSON_IsString(object))
    {
    goto end; //Enum
    }
    objectVariable = message_delta_object_object_FromString(object->valuestring);

    // message_delta_object->delta
    cJSON *delta = cJSON_GetObjectItemCaseSensitive(message_delta_objectJSON, "delta");
    if (cJSON_IsNull(delta)) {
        delta = NULL;
    }
    if (!delta) {
        goto end;
    }

    
    delta_local_nonprim = message_delta_object_delta_parseFromJSON(delta); //nonprimitive


    message_delta_object_local_var = message_delta_object_create_internal (
        strdup(id->valuestring),
        objectVariable,
        delta_local_nonprim
        );

    return message_delta_object_local_var;
end:
    if (delta_local_nonprim) {
        message_delta_object_delta_free(delta_local_nonprim);
        delta_local_nonprim = NULL;
    }
    return NULL;

}
