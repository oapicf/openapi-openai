#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "delete_file_response.h"



delete_file_response_t *delete_file_response_create(
    char *id,
    char *object,
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
    if (delete_file_response->object) {
        free(delete_file_response->object);
        delete_file_response->object = NULL;
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
    if (!delete_file_response->object) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "object", delete_file_response->object) == NULL) {
    goto fail; //String
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

    
    if(!cJSON_IsString(object))
    {
    goto end; //String
    }

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
        strdup(object->valuestring),
        deleted->valueint
        );

    return delete_file_response_local_var;
end:
    return NULL;

}
