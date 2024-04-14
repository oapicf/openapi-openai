#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "delete_thread_response.h"


char* delete_thread_response_object_ToString(openai_api_delete_thread_response_OBJECT_e object) {
    char* objectArray[] =  { "NULL", "thread.deleted" };
    return objectArray[object];
}

openai_api_delete_thread_response_OBJECT_e delete_thread_response_object_FromString(char* object){
    int stringToReturn = 0;
    char *objectArray[] =  { "NULL", "thread.deleted" };
    size_t sizeofArray = sizeof(objectArray) / sizeof(objectArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(object, objectArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

delete_thread_response_t *delete_thread_response_create(
    char *id,
    int deleted,
    openai_api_delete_thread_response_OBJECT_e object
    ) {
    delete_thread_response_t *delete_thread_response_local_var = malloc(sizeof(delete_thread_response_t));
    if (!delete_thread_response_local_var) {
        return NULL;
    }
    delete_thread_response_local_var->id = id;
    delete_thread_response_local_var->deleted = deleted;
    delete_thread_response_local_var->object = object;

    return delete_thread_response_local_var;
}


void delete_thread_response_free(delete_thread_response_t *delete_thread_response) {
    if(NULL == delete_thread_response){
        return ;
    }
    listEntry_t *listEntry;
    if (delete_thread_response->id) {
        free(delete_thread_response->id);
        delete_thread_response->id = NULL;
    }
    free(delete_thread_response);
}

cJSON *delete_thread_response_convertToJSON(delete_thread_response_t *delete_thread_response) {
    cJSON *item = cJSON_CreateObject();

    // delete_thread_response->id
    if (!delete_thread_response->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", delete_thread_response->id) == NULL) {
    goto fail; //String
    }


    // delete_thread_response->deleted
    if (!delete_thread_response->deleted) {
        goto fail;
    }
    if(cJSON_AddBoolToObject(item, "deleted", delete_thread_response->deleted) == NULL) {
    goto fail; //Bool
    }


    // delete_thread_response->object
    if (openai_api_delete_thread_response_OBJECT_NULL == delete_thread_response->object) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "object", objectdelete_thread_response_ToString(delete_thread_response->object)) == NULL)
    {
    goto fail; //Enum
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

delete_thread_response_t *delete_thread_response_parseFromJSON(cJSON *delete_thread_responseJSON){

    delete_thread_response_t *delete_thread_response_local_var = NULL;

    // delete_thread_response->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(delete_thread_responseJSON, "id");
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }

    // delete_thread_response->deleted
    cJSON *deleted = cJSON_GetObjectItemCaseSensitive(delete_thread_responseJSON, "deleted");
    if (!deleted) {
        goto end;
    }

    
    if(!cJSON_IsBool(deleted))
    {
    goto end; //Bool
    }

    // delete_thread_response->object
    cJSON *object = cJSON_GetObjectItemCaseSensitive(delete_thread_responseJSON, "object");
    if (!object) {
        goto end;
    }

    openai_api_delete_thread_response_OBJECT_e objectVariable;
    
    if(!cJSON_IsString(object))
    {
    goto end; //Enum
    }
    objectVariable = delete_thread_response_object_FromString(object->valuestring);


    delete_thread_response_local_var = delete_thread_response_create (
        strdup(id->valuestring),
        deleted->valueint,
        objectVariable
        );

    return delete_thread_response_local_var;
end:
    return NULL;

}
