#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "user_delete_response.h"


char* user_delete_response_object_ToString(openai_api_user_delete_response_OBJECT_e object) {
    char* objectArray[] =  { "NULL", "organization.user.deleted" };
    return objectArray[object];
}

openai_api_user_delete_response_OBJECT_e user_delete_response_object_FromString(char* object){
    int stringToReturn = 0;
    char *objectArray[] =  { "NULL", "organization.user.deleted" };
    size_t sizeofArray = sizeof(objectArray) / sizeof(objectArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(object, objectArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static user_delete_response_t *user_delete_response_create_internal(
    openai_api_user_delete_response_OBJECT_e object,
    char *id,
    int *deleted
    ) {
    user_delete_response_t *user_delete_response_local_var = malloc(sizeof(user_delete_response_t));
    if (!user_delete_response_local_var) {
        return NULL;
    }
    memset(user_delete_response_local_var, 0, sizeof(user_delete_response_t));
    user_delete_response_local_var->_library_owned = 1;
    user_delete_response_local_var->object = object;
    user_delete_response_local_var->id = id;
    user_delete_response_local_var->deleted = deleted;
    return user_delete_response_local_var;
}

__attribute__((deprecated)) user_delete_response_t *user_delete_response_create(
    openai_api_user_delete_response_OBJECT_e object,
    char *id,
    int *deleted
    ) {
    int *deleted_copy = NULL;
    if (deleted) {
        deleted_copy = malloc(sizeof(int));
        if (deleted_copy) *deleted_copy = *deleted;
    }
    user_delete_response_t *result = user_delete_response_create_internal (
        object,
        id,
        deleted_copy
        );
    if (!result) {
        free(deleted_copy);
    }
    return result;
}

void user_delete_response_free(user_delete_response_t *user_delete_response) {
    if(NULL == user_delete_response){
        return ;
    }
    if(user_delete_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "user_delete_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (user_delete_response->id) {
        free(user_delete_response->id);
        user_delete_response->id = NULL;
    }
    if (user_delete_response->deleted) {
        free(user_delete_response->deleted);
        user_delete_response->deleted = NULL;
    }
    free(user_delete_response);
}

cJSON *user_delete_response_convertToJSON(user_delete_response_t *user_delete_response) {
    cJSON *item = cJSON_CreateObject();

    // user_delete_response->object
    if (openai_api_user_delete_response_OBJECT_NULL == user_delete_response->object) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "object", user_delete_response_object_ToString(user_delete_response->object)) == NULL)
    {
    goto fail; //Enum
    }


    // user_delete_response->id
    if (!user_delete_response->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", user_delete_response->id) == NULL) {
    goto fail; //String
    }


    // user_delete_response->deleted
    if (!user_delete_response->deleted) {
        goto fail;
    }
    if(cJSON_AddBoolToObject(item, "deleted", *user_delete_response->deleted) == NULL) {
    goto fail; //Bool
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

user_delete_response_t *user_delete_response_parseFromJSON(cJSON *user_delete_responseJSON){

    user_delete_response_t *user_delete_response_local_var = NULL;

    char *id_local_str = NULL;

    // define the local variable for user_delete_response->deleted
    int *deleted_local_var = NULL;

    // user_delete_response->object
    cJSON *object = cJSON_GetObjectItemCaseSensitive(user_delete_responseJSON, "object");
    if (cJSON_IsNull(object)) {
        object = NULL;
    }
    if (!object) {
        goto end;
    }

    openai_api_user_delete_response_OBJECT_e objectVariable;
    
    if(!cJSON_IsString(object))
    {
    goto end; //Enum
    }
    objectVariable = user_delete_response_object_FromString(object->valuestring);

    // user_delete_response->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(user_delete_responseJSON, "id");
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

    // user_delete_response->deleted
    cJSON *deleted = cJSON_GetObjectItemCaseSensitive(user_delete_responseJSON, "deleted");
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
    deleted_local_var = malloc(sizeof(int));
    if(!deleted_local_var)
    {
        goto end;
    }
    *deleted_local_var = deleted->valueint;


    if (id && !cJSON_IsNull(id)) id_local_str = strdup(id->valuestring);

    user_delete_response_local_var = user_delete_response_create_internal (
        objectVariable,
        id_local_str,
        deleted_local_var
        );

    if (!user_delete_response_local_var) {
        goto end;
    }

    return user_delete_response_local_var;
end:
    if (id_local_str) {
        free(id_local_str);
        id_local_str = NULL;
    }
    if (deleted_local_var) {
        free(deleted_local_var);
        deleted_local_var = NULL;
    }
    return NULL;

}
