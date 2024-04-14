#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "modify_run_request.h"



modify_run_request_t *modify_run_request_create(
    object_t *metadata
    ) {
    modify_run_request_t *modify_run_request_local_var = malloc(sizeof(modify_run_request_t));
    if (!modify_run_request_local_var) {
        return NULL;
    }
    modify_run_request_local_var->metadata = metadata;

    return modify_run_request_local_var;
}


void modify_run_request_free(modify_run_request_t *modify_run_request) {
    if(NULL == modify_run_request){
        return ;
    }
    listEntry_t *listEntry;
    if (modify_run_request->metadata) {
        object_free(modify_run_request->metadata);
        modify_run_request->metadata = NULL;
    }
    free(modify_run_request);
}

cJSON *modify_run_request_convertToJSON(modify_run_request_t *modify_run_request) {
    cJSON *item = cJSON_CreateObject();

    // modify_run_request->metadata
    if(modify_run_request->metadata) {
    cJSON *metadata_object = object_convertToJSON(modify_run_request->metadata);
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

modify_run_request_t *modify_run_request_parseFromJSON(cJSON *modify_run_requestJSON){

    modify_run_request_t *modify_run_request_local_var = NULL;

    // modify_run_request->metadata
    cJSON *metadata = cJSON_GetObjectItemCaseSensitive(modify_run_requestJSON, "metadata");
    object_t *metadata_local_object = NULL;
    if (metadata) { 
    metadata_local_object = object_parseFromJSON(metadata); //object
    }


    modify_run_request_local_var = modify_run_request_create (
        metadata ? metadata_local_object : NULL
        );

    return modify_run_request_local_var;
end:
    return NULL;

}
