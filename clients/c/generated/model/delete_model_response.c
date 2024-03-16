#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "delete_model_response.h"



delete_model_response_t *delete_model_response_create(
    char *id,
    char *object,
    int deleted
    ) {
    delete_model_response_t *delete_model_response_local_var = malloc(sizeof(delete_model_response_t));
    if (!delete_model_response_local_var) {
        return NULL;
    }
    delete_model_response_local_var->id = id;
    delete_model_response_local_var->object = object;
    delete_model_response_local_var->deleted = deleted;

    return delete_model_response_local_var;
}


void delete_model_response_free(delete_model_response_t *delete_model_response) {
    if(NULL == delete_model_response){
        return ;
    }
    listEntry_t *listEntry;
    if (delete_model_response->id) {
        free(delete_model_response->id);
        delete_model_response->id = NULL;
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


    // delete_model_response->object
    if (!delete_model_response->object) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "object", delete_model_response->object) == NULL) {
    goto fail; //String
    }


    // delete_model_response->deleted
    if (!delete_model_response->deleted) {
        goto fail;
    }
    if(cJSON_AddBoolToObject(item, "deleted", delete_model_response->deleted) == NULL) {
    goto fail; //Bool
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

    // delete_model_response->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(delete_model_responseJSON, "id");
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }

    // delete_model_response->object
    cJSON *object = cJSON_GetObjectItemCaseSensitive(delete_model_responseJSON, "object");
    if (!object) {
        goto end;
    }

    
    if(!cJSON_IsString(object))
    {
    goto end; //String
    }

    // delete_model_response->deleted
    cJSON *deleted = cJSON_GetObjectItemCaseSensitive(delete_model_responseJSON, "deleted");
    if (!deleted) {
        goto end;
    }

    
    if(!cJSON_IsBool(deleted))
    {
    goto end; //Bool
    }


    delete_model_response_local_var = delete_model_response_create (
        strdup(id->valuestring),
        strdup(object->valuestring),
        deleted->valueint
        );

    return delete_model_response_local_var;
end:
    return NULL;

}
