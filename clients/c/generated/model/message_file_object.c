#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "message_file_object.h"


char* message_file_object_object_ToString(openai_api_message_file_object_OBJECT_e object) {
    char* objectArray[] =  { "NULL", "thread.message.file" };
    return objectArray[object];
}

openai_api_message_file_object_OBJECT_e message_file_object_object_FromString(char* object){
    int stringToReturn = 0;
    char *objectArray[] =  { "NULL", "thread.message.file" };
    size_t sizeofArray = sizeof(objectArray) / sizeof(objectArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(object, objectArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static message_file_object_t *message_file_object_create_internal(
    char *id,
    openai_api_message_file_object_OBJECT_e object,
    int created_at,
    char *message_id
    ) {
    message_file_object_t *message_file_object_local_var = malloc(sizeof(message_file_object_t));
    if (!message_file_object_local_var) {
        return NULL;
    }
    message_file_object_local_var->id = id;
    message_file_object_local_var->object = object;
    message_file_object_local_var->created_at = created_at;
    message_file_object_local_var->message_id = message_id;

    message_file_object_local_var->_library_owned = 1;
    return message_file_object_local_var;
}

__attribute__((deprecated)) message_file_object_t *message_file_object_create(
    char *id,
    openai_api_message_file_object_OBJECT_e object,
    int created_at,
    char *message_id
    ) {
    return message_file_object_create_internal (
        id,
        object,
        created_at,
        message_id
        );
}

void message_file_object_free(message_file_object_t *message_file_object) {
    if(NULL == message_file_object){
        return ;
    }
    if(message_file_object->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "message_file_object_free");
        return ;
    }
    listEntry_t *listEntry;
    if (message_file_object->id) {
        free(message_file_object->id);
        message_file_object->id = NULL;
    }
    if (message_file_object->message_id) {
        free(message_file_object->message_id);
        message_file_object->message_id = NULL;
    }
    free(message_file_object);
}

cJSON *message_file_object_convertToJSON(message_file_object_t *message_file_object) {
    cJSON *item = cJSON_CreateObject();

    // message_file_object->id
    if (!message_file_object->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", message_file_object->id) == NULL) {
    goto fail; //String
    }


    // message_file_object->object
    if (openai_api_message_file_object_OBJECT_NULL == message_file_object->object) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "object", message_file_object_object_ToString(message_file_object->object)) == NULL)
    {
    goto fail; //Enum
    }


    // message_file_object->created_at
    if (!message_file_object->created_at) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "created_at", message_file_object->created_at) == NULL) {
    goto fail; //Numeric
    }


    // message_file_object->message_id
    if (!message_file_object->message_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "message_id", message_file_object->message_id) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

message_file_object_t *message_file_object_parseFromJSON(cJSON *message_file_objectJSON){

    message_file_object_t *message_file_object_local_var = NULL;

    // message_file_object->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(message_file_objectJSON, "id");
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

    // message_file_object->object
    cJSON *object = cJSON_GetObjectItemCaseSensitive(message_file_objectJSON, "object");
    if (cJSON_IsNull(object)) {
        object = NULL;
    }
    if (!object) {
        goto end;
    }

    openai_api_message_file_object_OBJECT_e objectVariable;
    
    if(!cJSON_IsString(object))
    {
    goto end; //Enum
    }
    objectVariable = message_file_object_object_FromString(object->valuestring);

    // message_file_object->created_at
    cJSON *created_at = cJSON_GetObjectItemCaseSensitive(message_file_objectJSON, "created_at");
    if (cJSON_IsNull(created_at)) {
        created_at = NULL;
    }
    if (!created_at) {
        goto end;
    }

    
    if(!cJSON_IsNumber(created_at))
    {
    goto end; //Numeric
    }

    // message_file_object->message_id
    cJSON *message_id = cJSON_GetObjectItemCaseSensitive(message_file_objectJSON, "message_id");
    if (cJSON_IsNull(message_id)) {
        message_id = NULL;
    }
    if (!message_id) {
        goto end;
    }

    
    if(!cJSON_IsString(message_id))
    {
    goto end; //String
    }


    message_file_object_local_var = message_file_object_create_internal (
        strdup(id->valuestring),
        objectVariable,
        created_at->valuedouble,
        strdup(message_id->valuestring)
        );

    return message_file_object_local_var;
end:
    return NULL;

}
