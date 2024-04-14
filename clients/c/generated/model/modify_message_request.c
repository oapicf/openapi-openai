#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "modify_message_request.h"



modify_message_request_t *modify_message_request_create(
    object_t *metadata
    ) {
    modify_message_request_t *modify_message_request_local_var = malloc(sizeof(modify_message_request_t));
    if (!modify_message_request_local_var) {
        return NULL;
    }
    modify_message_request_local_var->metadata = metadata;

    return modify_message_request_local_var;
}


void modify_message_request_free(modify_message_request_t *modify_message_request) {
    if(NULL == modify_message_request){
        return ;
    }
    listEntry_t *listEntry;
    if (modify_message_request->metadata) {
        object_free(modify_message_request->metadata);
        modify_message_request->metadata = NULL;
    }
    free(modify_message_request);
}

cJSON *modify_message_request_convertToJSON(modify_message_request_t *modify_message_request) {
    cJSON *item = cJSON_CreateObject();

    // modify_message_request->metadata
    if(modify_message_request->metadata) {
    cJSON *metadata_object = object_convertToJSON(modify_message_request->metadata);
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

modify_message_request_t *modify_message_request_parseFromJSON(cJSON *modify_message_requestJSON){

    modify_message_request_t *modify_message_request_local_var = NULL;

    // modify_message_request->metadata
    cJSON *metadata = cJSON_GetObjectItemCaseSensitive(modify_message_requestJSON, "metadata");
    object_t *metadata_local_object = NULL;
    if (metadata) { 
    metadata_local_object = object_parseFromJSON(metadata); //object
    }


    modify_message_request_local_var = modify_message_request_create (
        metadata ? metadata_local_object : NULL
        );

    return modify_message_request_local_var;
end:
    return NULL;

}
