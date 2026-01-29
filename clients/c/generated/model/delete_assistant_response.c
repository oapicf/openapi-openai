#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "delete_assistant_response.h"


char* delete_assistant_response_object_ToString(openai_api_delete_assistant_response_OBJECT_e object) {
    char* objectArray[] =  { "NULL", "assistant.deleted" };
    return objectArray[object];
}

openai_api_delete_assistant_response_OBJECT_e delete_assistant_response_object_FromString(char* object){
    int stringToReturn = 0;
    char *objectArray[] =  { "NULL", "assistant.deleted" };
    size_t sizeofArray = sizeof(objectArray) / sizeof(objectArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(object, objectArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static delete_assistant_response_t *delete_assistant_response_create_internal(
    char *id,
    int deleted,
    openai_api_delete_assistant_response_OBJECT_e object
    ) {
    delete_assistant_response_t *delete_assistant_response_local_var = malloc(sizeof(delete_assistant_response_t));
    if (!delete_assistant_response_local_var) {
        return NULL;
    }
    delete_assistant_response_local_var->id = id;
    delete_assistant_response_local_var->deleted = deleted;
    delete_assistant_response_local_var->object = object;

    delete_assistant_response_local_var->_library_owned = 1;
    return delete_assistant_response_local_var;
}

__attribute__((deprecated)) delete_assistant_response_t *delete_assistant_response_create(
    char *id,
    int deleted,
    openai_api_delete_assistant_response_OBJECT_e object
    ) {
    return delete_assistant_response_create_internal (
        id,
        deleted,
        object
        );
}

void delete_assistant_response_free(delete_assistant_response_t *delete_assistant_response) {
    if(NULL == delete_assistant_response){
        return ;
    }
    if(delete_assistant_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "delete_assistant_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (delete_assistant_response->id) {
        free(delete_assistant_response->id);
        delete_assistant_response->id = NULL;
    }
    free(delete_assistant_response);
}

cJSON *delete_assistant_response_convertToJSON(delete_assistant_response_t *delete_assistant_response) {
    cJSON *item = cJSON_CreateObject();

    // delete_assistant_response->id
    if (!delete_assistant_response->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", delete_assistant_response->id) == NULL) {
    goto fail; //String
    }


    // delete_assistant_response->deleted
    if (!delete_assistant_response->deleted) {
        goto fail;
    }
    if(cJSON_AddBoolToObject(item, "deleted", delete_assistant_response->deleted) == NULL) {
    goto fail; //Bool
    }


    // delete_assistant_response->object
    if (openai_api_delete_assistant_response_OBJECT_NULL == delete_assistant_response->object) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "object", delete_assistant_response_object_ToString(delete_assistant_response->object)) == NULL)
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

delete_assistant_response_t *delete_assistant_response_parseFromJSON(cJSON *delete_assistant_responseJSON){

    delete_assistant_response_t *delete_assistant_response_local_var = NULL;

    // delete_assistant_response->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(delete_assistant_responseJSON, "id");
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

    // delete_assistant_response->deleted
    cJSON *deleted = cJSON_GetObjectItemCaseSensitive(delete_assistant_responseJSON, "deleted");
    if (cJSON_IsNull(deleted)) {
        deleted = NULL;
    }
    if (!deleted) {
        goto end;
    }

    
    if(!cJSON_IsBool(deleted))
    {
    goto end; //Bool
    }

    // delete_assistant_response->object
    cJSON *object = cJSON_GetObjectItemCaseSensitive(delete_assistant_responseJSON, "object");
    if (cJSON_IsNull(object)) {
        object = NULL;
    }
    if (!object) {
        goto end;
    }

    openai_api_delete_assistant_response_OBJECT_e objectVariable;
    
    if(!cJSON_IsString(object))
    {
    goto end; //Enum
    }
    objectVariable = delete_assistant_response_object_FromString(object->valuestring);


    delete_assistant_response_local_var = delete_assistant_response_create_internal (
        strdup(id->valuestring),
        deleted->valueint,
        objectVariable
        );

    return delete_assistant_response_local_var;
end:
    return NULL;

}
