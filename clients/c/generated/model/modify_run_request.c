#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "modify_run_request.h"



static modify_run_request_t *modify_run_request_create_internal(
    object_t *metadata
    ) {
    modify_run_request_t *modify_run_request_local_var = malloc(sizeof(modify_run_request_t));
    if (!modify_run_request_local_var) {
        return NULL;
    }
    modify_run_request_local_var->metadata = metadata;

    modify_run_request_local_var->_library_owned = 1;
    return modify_run_request_local_var;
}

__attribute__((deprecated)) modify_run_request_t *modify_run_request_create(
    object_t *metadata
    ) {
    return modify_run_request_create_internal (
        metadata
        );
}

void modify_run_request_free(modify_run_request_t *modify_run_request) {
    if(NULL == modify_run_request){
        return ;
    }
    if(modify_run_request->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "modify_run_request_free");
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
    if (cJSON_IsNull(metadata)) {
        metadata = NULL;
    }
    object_t *metadata_local_object = NULL;
    if (metadata) { 
    metadata_local_object = object_parseFromJSON(metadata); //object
    }


    modify_run_request_local_var = modify_run_request_create_internal (
        metadata ? metadata_local_object : NULL
        );

    return modify_run_request_local_var;
end:
    return NULL;

}
