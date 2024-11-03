#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "thread_object.h"


char* thread_object_object_ToString(openai_api_thread_object_OBJECT_e object) {
    char* objectArray[] =  { "NULL", "thread" };
    return objectArray[object];
}

openai_api_thread_object_OBJECT_e thread_object_object_FromString(char* object){
    int stringToReturn = 0;
    char *objectArray[] =  { "NULL", "thread" };
    size_t sizeofArray = sizeof(objectArray) / sizeof(objectArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(object, objectArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

thread_object_t *thread_object_create(
    char *id,
    openai_api_thread_object_OBJECT_e object,
    int created_at,
    object_t *metadata
    ) {
    thread_object_t *thread_object_local_var = malloc(sizeof(thread_object_t));
    if (!thread_object_local_var) {
        return NULL;
    }
    thread_object_local_var->id = id;
    thread_object_local_var->object = object;
    thread_object_local_var->created_at = created_at;
    thread_object_local_var->metadata = metadata;

    return thread_object_local_var;
}


void thread_object_free(thread_object_t *thread_object) {
    if(NULL == thread_object){
        return ;
    }
    listEntry_t *listEntry;
    if (thread_object->id) {
        free(thread_object->id);
        thread_object->id = NULL;
    }
    if (thread_object->metadata) {
        object_free(thread_object->metadata);
        thread_object->metadata = NULL;
    }
    free(thread_object);
}

cJSON *thread_object_convertToJSON(thread_object_t *thread_object) {
    cJSON *item = cJSON_CreateObject();

    // thread_object->id
    if (!thread_object->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", thread_object->id) == NULL) {
    goto fail; //String
    }


    // thread_object->object
    if (openai_api_thread_object_OBJECT_NULL == thread_object->object) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "object", objectthread_object_ToString(thread_object->object)) == NULL)
    {
    goto fail; //Enum
    }


    // thread_object->created_at
    if (!thread_object->created_at) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "created_at", thread_object->created_at) == NULL) {
    goto fail; //Numeric
    }


    // thread_object->metadata
    if (!thread_object->metadata) {
        goto fail;
    }
    cJSON *metadata_object = object_convertToJSON(thread_object->metadata);
    if(metadata_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "metadata", metadata_object);
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

thread_object_t *thread_object_parseFromJSON(cJSON *thread_objectJSON){

    thread_object_t *thread_object_local_var = NULL;

    // thread_object->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(thread_objectJSON, "id");
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }

    // thread_object->object
    cJSON *object = cJSON_GetObjectItemCaseSensitive(thread_objectJSON, "object");
    if (!object) {
        goto end;
    }

    openai_api_thread_object_OBJECT_e objectVariable;
    
    if(!cJSON_IsString(object))
    {
    goto end; //Enum
    }
    objectVariable = thread_object_object_FromString(object->valuestring);

    // thread_object->created_at
    cJSON *created_at = cJSON_GetObjectItemCaseSensitive(thread_objectJSON, "created_at");
    if (!created_at) {
        goto end;
    }

    
    if(!cJSON_IsNumber(created_at))
    {
    goto end; //Numeric
    }

    // thread_object->metadata
    cJSON *metadata = cJSON_GetObjectItemCaseSensitive(thread_objectJSON, "metadata");
    if (!metadata) {
        goto end;
    }

    object_t *metadata_local_object = NULL;
    
    metadata_local_object = object_parseFromJSON(metadata); //object


    thread_object_local_var = thread_object_create (
        strdup(id->valuestring),
        objectVariable,
        created_at->valuedouble,
        metadata_local_object
        );

    return thread_object_local_var;
end:
    return NULL;

}
