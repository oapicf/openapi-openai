#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "update_vector_store_request.h"



static update_vector_store_request_t *update_vector_store_request_create_internal(
    char *name,
    vector_store_expiration_after_t *expires_after,
    object_t *metadata
    ) {
    update_vector_store_request_t *update_vector_store_request_local_var = malloc(sizeof(update_vector_store_request_t));
    if (!update_vector_store_request_local_var) {
        return NULL;
    }
    update_vector_store_request_local_var->name = name;
    update_vector_store_request_local_var->expires_after = expires_after;
    update_vector_store_request_local_var->metadata = metadata;

    update_vector_store_request_local_var->_library_owned = 1;
    return update_vector_store_request_local_var;
}

__attribute__((deprecated)) update_vector_store_request_t *update_vector_store_request_create(
    char *name,
    vector_store_expiration_after_t *expires_after,
    object_t *metadata
    ) {
    return update_vector_store_request_create_internal (
        name,
        expires_after,
        metadata
        );
}

void update_vector_store_request_free(update_vector_store_request_t *update_vector_store_request) {
    if(NULL == update_vector_store_request){
        return ;
    }
    if(update_vector_store_request->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "update_vector_store_request_free");
        return ;
    }
    listEntry_t *listEntry;
    if (update_vector_store_request->name) {
        free(update_vector_store_request->name);
        update_vector_store_request->name = NULL;
    }
    if (update_vector_store_request->expires_after) {
        vector_store_expiration_after_free(update_vector_store_request->expires_after);
        update_vector_store_request->expires_after = NULL;
    }
    if (update_vector_store_request->metadata) {
        object_free(update_vector_store_request->metadata);
        update_vector_store_request->metadata = NULL;
    }
    free(update_vector_store_request);
}

cJSON *update_vector_store_request_convertToJSON(update_vector_store_request_t *update_vector_store_request) {
    cJSON *item = cJSON_CreateObject();

    // update_vector_store_request->name
    if(update_vector_store_request->name) {
    if(cJSON_AddStringToObject(item, "name", update_vector_store_request->name) == NULL) {
    goto fail; //String
    }
    }


    // update_vector_store_request->expires_after
    if(update_vector_store_request->expires_after) {
    cJSON *expires_after_local_JSON = vector_store_expiration_after_convertToJSON(update_vector_store_request->expires_after);
    if(expires_after_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "expires_after", expires_after_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // update_vector_store_request->metadata
    if(update_vector_store_request->metadata) {
    cJSON *metadata_object = object_convertToJSON(update_vector_store_request->metadata);
    if(metadata_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "metadata", metadata_object);
    if(item->child == NULL) {
    goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

update_vector_store_request_t *update_vector_store_request_parseFromJSON(cJSON *update_vector_store_requestJSON){

    update_vector_store_request_t *update_vector_store_request_local_var = NULL;

    // define the local variable for update_vector_store_request->expires_after
    vector_store_expiration_after_t *expires_after_local_nonprim = NULL;

    // update_vector_store_request->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(update_vector_store_requestJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // update_vector_store_request->expires_after
    cJSON *expires_after = cJSON_GetObjectItemCaseSensitive(update_vector_store_requestJSON, "expires_after");
    if (cJSON_IsNull(expires_after)) {
        expires_after = NULL;
    }
    if (expires_after) { 
    expires_after_local_nonprim = vector_store_expiration_after_parseFromJSON(expires_after); //nonprimitive
    }

    // update_vector_store_request->metadata
    cJSON *metadata = cJSON_GetObjectItemCaseSensitive(update_vector_store_requestJSON, "metadata");
    if (cJSON_IsNull(metadata)) {
        metadata = NULL;
    }
    object_t *metadata_local_object = NULL;
    if (metadata) { 
    metadata_local_object = object_parseFromJSON(metadata); //object
    }


    update_vector_store_request_local_var = update_vector_store_request_create_internal (
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        expires_after ? expires_after_local_nonprim : NULL,
        metadata ? metadata_local_object : NULL
        );

    return update_vector_store_request_local_var;
end:
    if (expires_after_local_nonprim) {
        vector_store_expiration_after_free(expires_after_local_nonprim);
        expires_after_local_nonprim = NULL;
    }
    return NULL;

}
