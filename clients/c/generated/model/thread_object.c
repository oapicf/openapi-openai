#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "thread_object.h"


char* thread_object_object_ToString(openai_api_thread_object_OBJECT_e object) {
    char* objectArray[] =  { "NULL", "thread" };
    return objectArray[object];
}

openai_api_thread_object_OBJECT_e thread_object_object_FromString(char* object){
    int stringToReturn = 0;
    char *objectArray[] =  { "NULL", "thread" };
    size_t sizeofArray = sizeof(objectArray) / sizeof(objectArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(object, objectArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static thread_object_t *thread_object_create_internal(
    char *id,
    openai_api_thread_object_OBJECT_e object,
    int created_at,
    modify_thread_request_tool_resources_t *tool_resources,
    object_t *metadata
    ) {
    thread_object_t *thread_object_local_var = malloc(sizeof(thread_object_t));
    if (!thread_object_local_var) {
        return NULL;
    }
    thread_object_local_var->id = id;
    thread_object_local_var->object = object;
    thread_object_local_var->created_at = created_at;
    thread_object_local_var->tool_resources = tool_resources;
    thread_object_local_var->metadata = metadata;

    thread_object_local_var->_library_owned = 1;
    return thread_object_local_var;
}

__attribute__((deprecated)) thread_object_t *thread_object_create(
    char *id,
    openai_api_thread_object_OBJECT_e object,
    int created_at,
    modify_thread_request_tool_resources_t *tool_resources,
    object_t *metadata
    ) {
    return thread_object_create_internal (
        id,
        object,
        created_at,
        tool_resources,
        metadata
        );
}

void thread_object_free(thread_object_t *thread_object) {
    if(NULL == thread_object){
        return ;
    }
    if(thread_object->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "thread_object_free");
        return ;
    }
    listEntry_t *listEntry;
    if (thread_object->id) {
        free(thread_object->id);
        thread_object->id = NULL;
    }
    if (thread_object->tool_resources) {
        modify_thread_request_tool_resources_free(thread_object->tool_resources);
        thread_object->tool_resources = NULL;
    }
    if (thread_object->metadata) {
        object_free(thread_object->metadata);
        thread_object->metadata = NULL;
    }
    free(thread_object);
}

cJSON *thread_object_convertToJSON(thread_object_t *thread_object) {
    cJSON *item = cJSON_CreateObject();

    // thread_object->id
    if (!thread_object->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", thread_object->id) == NULL) {
    goto fail; //String
    }


    // thread_object->object
    if (openai_api_thread_object_OBJECT_NULL == thread_object->object) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "object", thread_object_object_ToString(thread_object->object)) == NULL)
    {
    goto fail; //Enum
    }


    // thread_object->created_at
    if (!thread_object->created_at) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "created_at", thread_object->created_at) == NULL) {
    goto fail; //Numeric
    }


    // thread_object->tool_resources
    if (!thread_object->tool_resources) {
        goto fail;
    }
    cJSON *tool_resources_local_JSON = modify_thread_request_tool_resources_convertToJSON(thread_object->tool_resources);
    if(tool_resources_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "tool_resources", tool_resources_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // thread_object->metadata
    if (!thread_object->metadata) {
        goto fail;
    }
    cJSON *metadata_object = object_convertToJSON(thread_object->metadata);
    if(metadata_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "metadata", metadata_object);
    if(item->child == NULL) {
    goto fail;
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

thread_object_t *thread_object_parseFromJSON(cJSON *thread_objectJSON){

    thread_object_t *thread_object_local_var = NULL;

    // define the local variable for thread_object->tool_resources
    modify_thread_request_tool_resources_t *tool_resources_local_nonprim = NULL;

    // thread_object->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(thread_objectJSON, "id");
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

    // thread_object->object
    cJSON *object = cJSON_GetObjectItemCaseSensitive(thread_objectJSON, "object");
    if (cJSON_IsNull(object)) {
        object = NULL;
    }
    if (!object) {
        goto end;
    }

    openai_api_thread_object_OBJECT_e objectVariable;
    
    if(!cJSON_IsString(object))
    {
    goto end; //Enum
    }
    objectVariable = thread_object_object_FromString(object->valuestring);

    // thread_object->created_at
    cJSON *created_at = cJSON_GetObjectItemCaseSensitive(thread_objectJSON, "created_at");
    if (cJSON_IsNull(created_at)) {
        created_at = NULL;
    }
    if (!created_at) {
        goto end;
    }

    
    if(!cJSON_IsNumber(created_at))
    {
    goto end; //Numeric
    }

    // thread_object->tool_resources
    cJSON *tool_resources = cJSON_GetObjectItemCaseSensitive(thread_objectJSON, "tool_resources");
    if (cJSON_IsNull(tool_resources)) {
        tool_resources = NULL;
    }
    if (!tool_resources) {
        goto end;
    }

    
    tool_resources_local_nonprim = modify_thread_request_tool_resources_parseFromJSON(tool_resources); //nonprimitive

    // thread_object->metadata
    cJSON *metadata = cJSON_GetObjectItemCaseSensitive(thread_objectJSON, "metadata");
    if (cJSON_IsNull(metadata)) {
        metadata = NULL;
    }
    if (!metadata) {
        goto end;
    }

    object_t *metadata_local_object = NULL;
    
    metadata_local_object = object_parseFromJSON(metadata); //object


    thread_object_local_var = thread_object_create_internal (
        strdup(id->valuestring),
        objectVariable,
        created_at->valuedouble,
        tool_resources_local_nonprim,
        metadata_local_object
        );

    return thread_object_local_var;
end:
    if (tool_resources_local_nonprim) {
        modify_thread_request_tool_resources_free(tool_resources_local_nonprim);
        tool_resources_local_nonprim = NULL;
    }
    return NULL;

}
