#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_batch_request.h"


char* create_batch_request_endpoint_ToString(openai_api_create_batch_request_ENDPOINT_e endpoint) {
    char* endpointArray[] =  { "NULL", "/v1/chat/completions", "/v1/embeddings", "/v1/completions" };
    return endpointArray[endpoint];
}

openai_api_create_batch_request_ENDPOINT_e create_batch_request_endpoint_FromString(char* endpoint){
    int stringToReturn = 0;
    char *endpointArray[] =  { "NULL", "/v1/chat/completions", "/v1/embeddings", "/v1/completions" };
    size_t sizeofArray = sizeof(endpointArray) / sizeof(endpointArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(endpoint, endpointArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* create_batch_request_completion_window_ToString(openai_api_create_batch_request_COMPLETIONWINDOW_e completion_window) {
    char* completion_windowArray[] =  { "NULL", "24h" };
    return completion_windowArray[completion_window];
}

openai_api_create_batch_request_COMPLETIONWINDOW_e create_batch_request_completion_window_FromString(char* completion_window){
    int stringToReturn = 0;
    char *completion_windowArray[] =  { "NULL", "24h" };
    size_t sizeofArray = sizeof(completion_windowArray) / sizeof(completion_windowArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(completion_window, completion_windowArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static create_batch_request_t *create_batch_request_create_internal(
    char *input_file_id,
    openai_api_create_batch_request_ENDPOINT_e endpoint,
    openai_api_create_batch_request_COMPLETIONWINDOW_e completion_window,
    list_t* metadata
    ) {
    create_batch_request_t *create_batch_request_local_var = malloc(sizeof(create_batch_request_t));
    if (!create_batch_request_local_var) {
        return NULL;
    }
    create_batch_request_local_var->input_file_id = input_file_id;
    create_batch_request_local_var->endpoint = endpoint;
    create_batch_request_local_var->completion_window = completion_window;
    create_batch_request_local_var->metadata = metadata;

    create_batch_request_local_var->_library_owned = 1;
    return create_batch_request_local_var;
}

__attribute__((deprecated)) create_batch_request_t *create_batch_request_create(
    char *input_file_id,
    openai_api_create_batch_request_ENDPOINT_e endpoint,
    openai_api_create_batch_request_COMPLETIONWINDOW_e completion_window,
    list_t* metadata
    ) {
    return create_batch_request_create_internal (
        input_file_id,
        endpoint,
        completion_window,
        metadata
        );
}

void create_batch_request_free(create_batch_request_t *create_batch_request) {
    if(NULL == create_batch_request){
        return ;
    }
    if(create_batch_request->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "create_batch_request_free");
        return ;
    }
    listEntry_t *listEntry;
    if (create_batch_request->input_file_id) {
        free(create_batch_request->input_file_id);
        create_batch_request->input_file_id = NULL;
    }
    if (create_batch_request->metadata) {
        list_ForEach(listEntry, create_batch_request->metadata) {
            keyValuePair_t *localKeyValue = listEntry->data;
            free (localKeyValue->key);
            free (localKeyValue->value);
            keyValuePair_free(localKeyValue);
        }
        list_freeList(create_batch_request->metadata);
        create_batch_request->metadata = NULL;
    }
    free(create_batch_request);
}

cJSON *create_batch_request_convertToJSON(create_batch_request_t *create_batch_request) {
    cJSON *item = cJSON_CreateObject();

    // create_batch_request->input_file_id
    if (!create_batch_request->input_file_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "input_file_id", create_batch_request->input_file_id) == NULL) {
    goto fail; //String
    }


    // create_batch_request->endpoint
    if (openai_api_create_batch_request_ENDPOINT_NULL == create_batch_request->endpoint) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "endpoint", create_batch_request_endpoint_ToString(create_batch_request->endpoint)) == NULL)
    {
    goto fail; //Enum
    }


    // create_batch_request->completion_window
    if (openai_api_create_batch_request_COMPLETIONWINDOW_NULL == create_batch_request->completion_window) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "completion_window", create_batch_request_completion_window_ToString(create_batch_request->completion_window)) == NULL)
    {
    goto fail; //Enum
    }


    // create_batch_request->metadata
    if(create_batch_request->metadata) {
    cJSON *metadata = cJSON_AddObjectToObject(item, "metadata");
    if(metadata == NULL) {
        goto fail; //primitive map container
    }
    cJSON *localMapObject = metadata;
    listEntry_t *metadataListEntry;
    if (create_batch_request->metadata) {
    list_ForEach(metadataListEntry, create_batch_request->metadata) {
        keyValuePair_t *localKeyValue = metadataListEntry->data;
        if(cJSON_AddStringToObject(localMapObject, localKeyValue->key, localKeyValue->value) == NULL)
        {
            goto fail;
        }
    }
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

create_batch_request_t *create_batch_request_parseFromJSON(cJSON *create_batch_requestJSON){

    create_batch_request_t *create_batch_request_local_var = NULL;

    // define the local map for create_batch_request->metadata
    list_t *metadataList = NULL;

    // create_batch_request->input_file_id
    cJSON *input_file_id = cJSON_GetObjectItemCaseSensitive(create_batch_requestJSON, "input_file_id");
    if (cJSON_IsNull(input_file_id)) {
        input_file_id = NULL;
    }
    if (!input_file_id) {
        goto end;
    }

    
    if(!cJSON_IsString(input_file_id))
    {
    goto end; //String
    }

    // create_batch_request->endpoint
    cJSON *endpoint = cJSON_GetObjectItemCaseSensitive(create_batch_requestJSON, "endpoint");
    if (cJSON_IsNull(endpoint)) {
        endpoint = NULL;
    }
    if (!endpoint) {
        goto end;
    }

    openai_api_create_batch_request_ENDPOINT_e endpointVariable;
    
    if(!cJSON_IsString(endpoint))
    {
    goto end; //Enum
    }
    endpointVariable = create_batch_request_endpoint_FromString(endpoint->valuestring);

    // create_batch_request->completion_window
    cJSON *completion_window = cJSON_GetObjectItemCaseSensitive(create_batch_requestJSON, "completion_window");
    if (cJSON_IsNull(completion_window)) {
        completion_window = NULL;
    }
    if (!completion_window) {
        goto end;
    }

    openai_api_create_batch_request_COMPLETIONWINDOW_e completion_windowVariable;
    
    if(!cJSON_IsString(completion_window))
    {
    goto end; //Enum
    }
    completion_windowVariable = create_batch_request_completion_window_FromString(completion_window->valuestring);

    // create_batch_request->metadata
    cJSON *metadata = cJSON_GetObjectItemCaseSensitive(create_batch_requestJSON, "metadata");
    if (cJSON_IsNull(metadata)) {
        metadata = NULL;
    }
    if (metadata) { 
    cJSON *metadata_local_map = NULL;
    if(!cJSON_IsObject(metadata) && !cJSON_IsNull(metadata))
    {
        goto end;//primitive map container
    }
    if(cJSON_IsObject(metadata))
    {
        metadataList = list_createList();
        keyValuePair_t *localMapKeyPair;
        cJSON_ArrayForEach(metadata_local_map, metadata)
        {
            cJSON *localMapObject = metadata_local_map;
            if(!cJSON_IsString(localMapObject))
            {
                goto end;
            }
            localMapKeyPair = keyValuePair_create(strdup(localMapObject->string),strdup(localMapObject->valuestring));
            list_addElement(metadataList , localMapKeyPair);
        }
    }
    }


    create_batch_request_local_var = create_batch_request_create_internal (
        strdup(input_file_id->valuestring),
        endpointVariable,
        completion_windowVariable,
        metadata ? metadataList : NULL
        );

    return create_batch_request_local_var;
end:
    if (metadataList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, metadataList) {
            keyValuePair_t *localKeyValue = listEntry->data;
            free(localKeyValue->key);
            localKeyValue->key = NULL;
            free(localKeyValue->value);
            localKeyValue->value = NULL;
            keyValuePair_free(localKeyValue);
            localKeyValue = NULL;
        }
        list_freeList(metadataList);
        metadataList = NULL;
    }
    return NULL;

}
