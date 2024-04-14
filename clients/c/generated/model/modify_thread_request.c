#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "modify_thread_request.h"



modify_thread_request_t *modify_thread_request_create(
    object_t *metadata
    ) {
    modify_thread_request_t *modify_thread_request_local_var = malloc(sizeof(modify_thread_request_t));
    if (!modify_thread_request_local_var) {
        return NULL;
    }
    modify_thread_request_local_var->metadata = metadata;

    return modify_thread_request_local_var;
}


void modify_thread_request_free(modify_thread_request_t *modify_thread_request) {
    if(NULL == modify_thread_request){
        return ;
    }
    listEntry_t *listEntry;
    if (modify_thread_request->metadata) {
        object_free(modify_thread_request->metadata);
        modify_thread_request->metadata = NULL;
    }
    free(modify_thread_request);
}

cJSON *modify_thread_request_convertToJSON(modify_thread_request_t *modify_thread_request) {
    cJSON *item = cJSON_CreateObject();

    // modify_thread_request->metadata
    if(modify_thread_request->metadata) {
    cJSON *metadata_object = object_convertToJSON(modify_thread_request->metadata);
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

modify_thread_request_t *modify_thread_request_parseFromJSON(cJSON *modify_thread_requestJSON){

    modify_thread_request_t *modify_thread_request_local_var = NULL;

    // modify_thread_request->metadata
    cJSON *metadata = cJSON_GetObjectItemCaseSensitive(modify_thread_requestJSON, "metadata");
    object_t *metadata_local_object = NULL;
    if (metadata) { 
    metadata_local_object = object_parseFromJSON(metadata); //object
    }


    modify_thread_request_local_var = modify_thread_request_create (
        metadata ? metadata_local_object : NULL
        );

    return modify_thread_request_local_var;
end:
    return NULL;

}
