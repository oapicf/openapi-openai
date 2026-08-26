#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "admin_api_keys_delete_200_response.h"



static admin_api_keys_delete_200_response_t *admin_api_keys_delete_200_response_create_internal(
    char *id,
    char *object,
    int *deleted
    ) {
    admin_api_keys_delete_200_response_t *admin_api_keys_delete_200_response_local_var = malloc(sizeof(admin_api_keys_delete_200_response_t));
    if (!admin_api_keys_delete_200_response_local_var) {
        return NULL;
    }
    memset(admin_api_keys_delete_200_response_local_var, 0, sizeof(admin_api_keys_delete_200_response_t));
    admin_api_keys_delete_200_response_local_var->_library_owned = 1;
    admin_api_keys_delete_200_response_local_var->id = id;
    admin_api_keys_delete_200_response_local_var->object = object;
    admin_api_keys_delete_200_response_local_var->deleted = deleted;
    return admin_api_keys_delete_200_response_local_var;
}

__attribute__((deprecated)) admin_api_keys_delete_200_response_t *admin_api_keys_delete_200_response_create(
    char *id,
    char *object,
    int *deleted
    ) {
    int *deleted_copy = NULL;
    if (deleted) {
        deleted_copy = malloc(sizeof(int));
        if (deleted_copy) *deleted_copy = *deleted;
    }
    admin_api_keys_delete_200_response_t *result = admin_api_keys_delete_200_response_create_internal (
        id,
        object,
        deleted_copy
        );
    if (!result) {
        free(deleted_copy);
    }
    return result;
}

void admin_api_keys_delete_200_response_free(admin_api_keys_delete_200_response_t *admin_api_keys_delete_200_response) {
    if(NULL == admin_api_keys_delete_200_response){
        return ;
    }
    if(admin_api_keys_delete_200_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "admin_api_keys_delete_200_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (admin_api_keys_delete_200_response->id) {
        free(admin_api_keys_delete_200_response->id);
        admin_api_keys_delete_200_response->id = NULL;
    }
    if (admin_api_keys_delete_200_response->object) {
        free(admin_api_keys_delete_200_response->object);
        admin_api_keys_delete_200_response->object = NULL;
    }
    if (admin_api_keys_delete_200_response->deleted) {
        free(admin_api_keys_delete_200_response->deleted);
        admin_api_keys_delete_200_response->deleted = NULL;
    }
    free(admin_api_keys_delete_200_response);
}

cJSON *admin_api_keys_delete_200_response_convertToJSON(admin_api_keys_delete_200_response_t *admin_api_keys_delete_200_response) {
    cJSON *item = cJSON_CreateObject();

    // admin_api_keys_delete_200_response->id
    if(admin_api_keys_delete_200_response->id) {
    if(cJSON_AddStringToObject(item, "id", admin_api_keys_delete_200_response->id) == NULL) {
    goto fail; //String
    }
    }


    // admin_api_keys_delete_200_response->object
    if(admin_api_keys_delete_200_response->object) {
    if(cJSON_AddStringToObject(item, "object", admin_api_keys_delete_200_response->object) == NULL) {
    goto fail; //String
    }
    }


    // admin_api_keys_delete_200_response->deleted
    if(admin_api_keys_delete_200_response->deleted) {
    if(cJSON_AddBoolToObject(item, "deleted", *admin_api_keys_delete_200_response->deleted) == NULL) {
    goto fail; //Bool
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

admin_api_keys_delete_200_response_t *admin_api_keys_delete_200_response_parseFromJSON(cJSON *admin_api_keys_delete_200_responseJSON){

    admin_api_keys_delete_200_response_t *admin_api_keys_delete_200_response_local_var = NULL;

    char *id_local_str = NULL;

    char *object_local_str = NULL;

    // define the local variable for admin_api_keys_delete_200_response->deleted
    int *deleted_local_var = NULL;

    // admin_api_keys_delete_200_response->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(admin_api_keys_delete_200_responseJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // admin_api_keys_delete_200_response->object
    cJSON *object = cJSON_GetObjectItemCaseSensitive(admin_api_keys_delete_200_responseJSON, "object");
    if (cJSON_IsNull(object)) {
        object = NULL;
    }
    if (object) { 
    if(!cJSON_IsString(object) && !cJSON_IsNull(object))
    {
    goto end; //String
    }
    }

    // admin_api_keys_delete_200_response->deleted
    cJSON *deleted = cJSON_GetObjectItemCaseSensitive(admin_api_keys_delete_200_responseJSON, "deleted");
    if (cJSON_IsNull(deleted)) {
        deleted = NULL;
    }
    if (deleted) { 
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
    }


    if (id && !cJSON_IsNull(id)) id_local_str = strdup(id->valuestring);
    if (object && !cJSON_IsNull(object)) object_local_str = strdup(object->valuestring);

    admin_api_keys_delete_200_response_local_var = admin_api_keys_delete_200_response_create_internal (
        id_local_str,
        object_local_str,
        deleted_local_var
        );

    if (!admin_api_keys_delete_200_response_local_var) {
        goto end;
    }

    return admin_api_keys_delete_200_response_local_var;
end:
    if (id_local_str) {
        free(id_local_str);
        id_local_str = NULL;
    }
    if (object_local_str) {
        free(object_local_str);
        object_local_str = NULL;
    }
    if (deleted_local_var) {
        free(deleted_local_var);
        deleted_local_var = NULL;
    }
    return NULL;

}
