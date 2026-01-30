#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "invite_delete_response.h"


char* invite_delete_response_object_ToString(openai_api_invite_delete_response_OBJECT_e object) {
    char* objectArray[] =  { "NULL", "organization.invite.deleted" };
    return objectArray[object];
}

openai_api_invite_delete_response_OBJECT_e invite_delete_response_object_FromString(char* object){
    int stringToReturn = 0;
    char *objectArray[] =  { "NULL", "organization.invite.deleted" };
    size_t sizeofArray = sizeof(objectArray) / sizeof(objectArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(object, objectArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static invite_delete_response_t *invite_delete_response_create_internal(
    openai_api_invite_delete_response_OBJECT_e object,
    char *id,
    int deleted
    ) {
    invite_delete_response_t *invite_delete_response_local_var = malloc(sizeof(invite_delete_response_t));
    if (!invite_delete_response_local_var) {
        return NULL;
    }
    invite_delete_response_local_var->object = object;
    invite_delete_response_local_var->id = id;
    invite_delete_response_local_var->deleted = deleted;

    invite_delete_response_local_var->_library_owned = 1;
    return invite_delete_response_local_var;
}

__attribute__((deprecated)) invite_delete_response_t *invite_delete_response_create(
    openai_api_invite_delete_response_OBJECT_e object,
    char *id,
    int deleted
    ) {
    return invite_delete_response_create_internal (
        object,
        id,
        deleted
        );
}

void invite_delete_response_free(invite_delete_response_t *invite_delete_response) {
    if(NULL == invite_delete_response){
        return ;
    }
    if(invite_delete_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "invite_delete_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (invite_delete_response->id) {
        free(invite_delete_response->id);
        invite_delete_response->id = NULL;
    }
    free(invite_delete_response);
}

cJSON *invite_delete_response_convertToJSON(invite_delete_response_t *invite_delete_response) {
    cJSON *item = cJSON_CreateObject();

    // invite_delete_response->object
    if (openai_api_invite_delete_response_OBJECT_NULL == invite_delete_response->object) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "object", invite_delete_response_object_ToString(invite_delete_response->object)) == NULL)
    {
    goto fail; //Enum
    }


    // invite_delete_response->id
    if (!invite_delete_response->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", invite_delete_response->id) == NULL) {
    goto fail; //String
    }


    // invite_delete_response->deleted
    if (!invite_delete_response->deleted) {
        goto fail;
    }
    if(cJSON_AddBoolToObject(item, "deleted", invite_delete_response->deleted) == NULL) {
    goto fail; //Bool
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

invite_delete_response_t *invite_delete_response_parseFromJSON(cJSON *invite_delete_responseJSON){

    invite_delete_response_t *invite_delete_response_local_var = NULL;

    // invite_delete_response->object
    cJSON *object = cJSON_GetObjectItemCaseSensitive(invite_delete_responseJSON, "object");
    if (cJSON_IsNull(object)) {
        object = NULL;
    }
    if (!object) {
        goto end;
    }

    openai_api_invite_delete_response_OBJECT_e objectVariable;
    
    if(!cJSON_IsString(object))
    {
    goto end; //Enum
    }
    objectVariable = invite_delete_response_object_FromString(object->valuestring);

    // invite_delete_response->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(invite_delete_responseJSON, "id");
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

    // invite_delete_response->deleted
    cJSON *deleted = cJSON_GetObjectItemCaseSensitive(invite_delete_responseJSON, "deleted");
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


    invite_delete_response_local_var = invite_delete_response_create_internal (
        objectVariable,
        strdup(id->valuestring),
        deleted->valueint
        );

    return invite_delete_response_local_var;
end:
    return NULL;

}
