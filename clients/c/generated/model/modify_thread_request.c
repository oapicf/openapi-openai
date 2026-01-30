#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "modify_thread_request.h"



static modify_thread_request_t *modify_thread_request_create_internal(
    modify_thread_request_tool_resources_t *tool_resources,
    object_t *metadata
    ) {
    modify_thread_request_t *modify_thread_request_local_var = malloc(sizeof(modify_thread_request_t));
    if (!modify_thread_request_local_var) {
        return NULL;
    }
    modify_thread_request_local_var->tool_resources = tool_resources;
    modify_thread_request_local_var->metadata = metadata;

    modify_thread_request_local_var->_library_owned = 1;
    return modify_thread_request_local_var;
}

__attribute__((deprecated)) modify_thread_request_t *modify_thread_request_create(
    modify_thread_request_tool_resources_t *tool_resources,
    object_t *metadata
    ) {
    return modify_thread_request_create_internal (
        tool_resources,
        metadata
        );
}

void modify_thread_request_free(modify_thread_request_t *modify_thread_request) {
    if(NULL == modify_thread_request){
        return ;
    }
    if(modify_thread_request->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "modify_thread_request_free");
        return ;
    }
    listEntry_t *listEntry;
    if (modify_thread_request->tool_resources) {
        modify_thread_request_tool_resources_free(modify_thread_request->tool_resources);
        modify_thread_request->tool_resources = NULL;
    }
    if (modify_thread_request->metadata) {
        object_free(modify_thread_request->metadata);
        modify_thread_request->metadata = NULL;
    }
    free(modify_thread_request);
}

cJSON *modify_thread_request_convertToJSON(modify_thread_request_t *modify_thread_request) {
    cJSON *item = cJSON_CreateObject();

    // modify_thread_request->tool_resources
    if(modify_thread_request->tool_resources) {
    cJSON *tool_resources_local_JSON = modify_thread_request_tool_resources_convertToJSON(modify_thread_request->tool_resources);
    if(tool_resources_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "tool_resources", tool_resources_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


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

    // define the local variable for modify_thread_request->tool_resources
    modify_thread_request_tool_resources_t *tool_resources_local_nonprim = NULL;

    // modify_thread_request->tool_resources
    cJSON *tool_resources = cJSON_GetObjectItemCaseSensitive(modify_thread_requestJSON, "tool_resources");
    if (cJSON_IsNull(tool_resources)) {
        tool_resources = NULL;
    }
    if (tool_resources) { 
    tool_resources_local_nonprim = modify_thread_request_tool_resources_parseFromJSON(tool_resources); //nonprimitive
    }

    // modify_thread_request->metadata
    cJSON *metadata = cJSON_GetObjectItemCaseSensitive(modify_thread_requestJSON, "metadata");
    if (cJSON_IsNull(metadata)) {
        metadata = NULL;
    }
    object_t *metadata_local_object = NULL;
    if (metadata) { 
    metadata_local_object = object_parseFromJSON(metadata); //object
    }


    modify_thread_request_local_var = modify_thread_request_create_internal (
        tool_resources ? tool_resources_local_nonprim : NULL,
        metadata ? metadata_local_object : NULL
        );

    return modify_thread_request_local_var;
end:
    if (tool_resources_local_nonprim) {
        modify_thread_request_tool_resources_free(tool_resources_local_nonprim);
        tool_resources_local_nonprim = NULL;
    }
    return NULL;

}
