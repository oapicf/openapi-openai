#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "delete_file_response.h"


char* delete_file_response_object_ToString(openai_api_delete_file_response_OBJECT_e object) {
    char* objectArray[] =  { "NULL", "file" };
    return objectArray[object];
}

openai_api_delete_file_response_OBJECT_e delete_file_response_object_FromString(char* object){
    int stringToReturn = 0;
    char *objectArray[] =  { "NULL", "file" };
    size_t sizeofArray = sizeof(objectArray) / sizeof(objectArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(object, objectArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

delete_file_response_t *delete_file_response_create(
    char *id,
    openai_api_delete_file_response_OBJECT_e object,
    int deleted
    ) {
    delete_file_response_t *delete_file_response_local_var = malloc(sizeof(delete_file_response_t));
    if (!delete_file_response_local_var) {
        return NULL;
    }
    delete_file_response_local_var->id = id;
    delete_file_response_local_var->object = object;
    delete_file_response_local_var->deleted = deleted;

    return delete_file_response_local_var;
}


void delete_file_response_free(delete_file_response_t *delete_file_response) {
    if(NULL == delete_file_response){
        return ;
    }
    listEntry_t *listEntry;
    if (delete_file_response->id) {
        free(delete_file_response->id);
        delete_file_response->id = NULL;
    }
    free(delete_file_response);
}

cJSON *delete_file_response_convertToJSON(delete_file_response_t *delete_file_response) {
    cJSON *item = cJSON_CreateObject();

    // delete_file_response->id
    if (!delete_file_response->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", delete_file_response->id) == NULL) {
    goto fail; //String
    }


    // delete_file_response->object
    if (openai_api_delete_file_response_OBJECT_NULL == delete_file_response->object) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "object", objectdelete_file_response_ToString(delete_file_response->object)) == NULL)
    {
    goto fail; //Enum
    }


    // delete_file_response->deleted
    if (!delete_file_response->deleted) {
        goto fail;
    }
    if(cJSON_AddBoolToObject(item, "deleted", delete_file_response->deleted) == NULL) {
    goto fail; //Bool
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

delete_file_response_t *delete_file_response_parseFromJSON(cJSON *delete_file_responseJSON){

    delete_file_response_t *delete_file_response_local_var = NULL;

    // delete_file_response->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(delete_file_responseJSON, "id");
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }

    // delete_file_response->object
    cJSON *object = cJSON_GetObjectItemCaseSensitive(delete_file_responseJSON, "object");
    if (!object) {
        goto end;
    }

    openai_api_delete_file_response_OBJECT_e objectVariable;
    
    if(!cJSON_IsString(object))
    {
    goto end; //Enum
    }
    objectVariable = delete_file_response_object_FromString(object->valuestring);

    // delete_file_response->deleted
    cJSON *deleted = cJSON_GetObjectItemCaseSensitive(delete_file_responseJSON, "deleted");
    if (!deleted) {
        goto end;
    }

    
    if(!cJSON_IsBool(deleted))
    {
    goto end; //Bool
    }


    delete_file_response_local_var = delete_file_response_create (
        strdup(id->valuestring),
        objectVariable,
        deleted->valueint
        );

    return delete_file_response_local_var;
end:
    return NULL;

}
