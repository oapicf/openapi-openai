#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "delete_model_response.h"



static delete_model_response_t *delete_model_response_create_internal(
    char *id,
    int *deleted,
    char *object
    ) {
    delete_model_response_t *delete_model_response_local_var = malloc(sizeof(delete_model_response_t));
    if (!delete_model_response_local_var) {
        return NULL;
    }
    memset(delete_model_response_local_var, 0, sizeof(delete_model_response_t));
    delete_model_response_local_var->_library_owned = 1;
    delete_model_response_local_var->id = id;
    delete_model_response_local_var->deleted = deleted;
    delete_model_response_local_var->object = object;
    return delete_model_response_local_var;
}

__attribute__((deprecated)) delete_model_response_t *delete_model_response_create(
    char *id,
    int *deleted,
    char *object
    ) {
    int *deleted_copy = NULL;
    if (deleted) {
        deleted_copy = malloc(sizeof(int));
        if (deleted_copy) *deleted_copy = *deleted;
    }
    delete_model_response_t *result = delete_model_response_create_internal (
        id,
        deleted_copy,
        object
        );
    if (!result) {
        free(deleted_copy);
    }
    return result;
}

void delete_model_response_free(delete_model_response_t *delete_model_response) {
    if(NULL == delete_model_response){
        return ;
    }
    if(delete_model_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "delete_model_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (delete_model_response->id) {
        free(delete_model_response->id);
        delete_model_response->id = NULL;
    }
    if (delete_model_response->deleted) {
        free(delete_model_response->deleted);
        delete_model_response->deleted = NULL;
    }
    if (delete_model_response->object) {
        free(delete_model_response->object);
        delete_model_response->object = NULL;
    }
    free(delete_model_response);
}

cJSON *delete_model_response_convertToJSON(delete_model_response_t *delete_model_response) {
    cJSON *item = cJSON_CreateObject();

    // delete_model_response->id
    if (!delete_model_response->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", delete_model_response->id) == NULL) {
    goto fail; //String
    }


    // delete_model_response->deleted
    if (!delete_model_response->deleted) {
        goto fail;
    }
    if(cJSON_AddBoolToObject(item, "deleted", *delete_model_response->deleted) == NULL) {
    goto fail; //Bool
    }


    // delete_model_response->object
    if (!delete_model_response->object) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "object", delete_model_response->object) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

delete_model_response_t *delete_model_response_parseFromJSON(cJSON *delete_model_responseJSON){

    delete_model_response_t *delete_model_response_local_var = NULL;

    char *id_local_str = NULL;

    // define the local variable for delete_model_response->deleted
    int *deleted_local_var = NULL;

    char *object_local_str = NULL;

    // delete_model_response->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(delete_model_responseJSON, "id");
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

    // delete_model_response->deleted
    cJSON *deleted = cJSON_GetObjectItemCaseSensitive(delete_model_responseJSON, "deleted");
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

    // delete_model_response->object
    cJSON *object = cJSON_GetObjectItemCaseSensitive(delete_model_responseJSON, "object");
    if (cJSON_IsNull(object)) {
        object = NULL;
    }
    if (!object) {
        goto end;
    }

    
    if(!cJSON_IsString(object))
    {
    goto end; //String
    }


    if (id && !cJSON_IsNull(id)) id_local_str = strdup(id->valuestring);
    if (object && !cJSON_IsNull(object)) object_local_str = strdup(object->valuestring);

    delete_model_response_local_var = delete_model_response_create_internal (
        id_local_str,
        deleted_local_var,
        object_local_str
        );

    if (!delete_model_response_local_var) {
        goto end;
    }

    return delete_model_response_local_var;
end:
    if (id_local_str) {
        free(id_local_str);
        id_local_str = NULL;
    }
    if (deleted_local_var) {
        free(deleted_local_var);
        deleted_local_var = NULL;
    }
    if (object_local_str) {
        free(object_local_str);
        object_local_str = NULL;
    }
    return NULL;

}
