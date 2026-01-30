#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "realtime_response.h"


char* realtime_response_object_ToString(openai_api_realtime_response_OBJECT_e object) {
    char* objectArray[] =  { "NULL", "realtime.response" };
    return objectArray[object];
}

openai_api_realtime_response_OBJECT_e realtime_response_object_FromString(char* object){
    int stringToReturn = 0;
    char *objectArray[] =  { "NULL", "realtime.response" };
    size_t sizeofArray = sizeof(objectArray) / sizeof(objectArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(object, objectArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* realtime_response_status_ToString(openai_api_realtime_response_STATUS_e status) {
    char* statusArray[] =  { "NULL", "completed", "cancelled", "failed", "incomplete" };
    return statusArray[status];
}

openai_api_realtime_response_STATUS_e realtime_response_status_FromString(char* status){
    int stringToReturn = 0;
    char *statusArray[] =  { "NULL", "completed", "cancelled", "failed", "incomplete" };
    size_t sizeofArray = sizeof(statusArray) / sizeof(statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(status, statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static realtime_response_t *realtime_response_create_internal(
    char *id,
    openai_api_realtime_response_OBJECT_e object,
    openai_api_realtime_response_STATUS_e status,
    realtime_response_status_details_t *status_details,
    list_t *output,
    object_t *metadata,
    realtime_response_usage_t *usage
    ) {
    realtime_response_t *realtime_response_local_var = malloc(sizeof(realtime_response_t));
    if (!realtime_response_local_var) {
        return NULL;
    }
    realtime_response_local_var->id = id;
    realtime_response_local_var->object = object;
    realtime_response_local_var->status = status;
    realtime_response_local_var->status_details = status_details;
    realtime_response_local_var->output = output;
    realtime_response_local_var->metadata = metadata;
    realtime_response_local_var->usage = usage;

    realtime_response_local_var->_library_owned = 1;
    return realtime_response_local_var;
}

__attribute__((deprecated)) realtime_response_t *realtime_response_create(
    char *id,
    openai_api_realtime_response_OBJECT_e object,
    openai_api_realtime_response_STATUS_e status,
    realtime_response_status_details_t *status_details,
    list_t *output,
    object_t *metadata,
    realtime_response_usage_t *usage
    ) {
    return realtime_response_create_internal (
        id,
        object,
        status,
        status_details,
        output,
        metadata,
        usage
        );
}

void realtime_response_free(realtime_response_t *realtime_response) {
    if(NULL == realtime_response){
        return ;
    }
    if(realtime_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "realtime_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (realtime_response->id) {
        free(realtime_response->id);
        realtime_response->id = NULL;
    }
    if (realtime_response->status_details) {
        realtime_response_status_details_free(realtime_response->status_details);
        realtime_response->status_details = NULL;
    }
    if (realtime_response->output) {
        list_ForEach(listEntry, realtime_response->output) {
            realtime_conversation_item_free(listEntry->data);
        }
        list_freeList(realtime_response->output);
        realtime_response->output = NULL;
    }
    if (realtime_response->metadata) {
        object_free(realtime_response->metadata);
        realtime_response->metadata = NULL;
    }
    if (realtime_response->usage) {
        realtime_response_usage_free(realtime_response->usage);
        realtime_response->usage = NULL;
    }
    free(realtime_response);
}

cJSON *realtime_response_convertToJSON(realtime_response_t *realtime_response) {
    cJSON *item = cJSON_CreateObject();

    // realtime_response->id
    if(realtime_response->id) {
    if(cJSON_AddStringToObject(item, "id", realtime_response->id) == NULL) {
    goto fail; //String
    }
    }


    // realtime_response->object
    if(realtime_response->object != openai_api_realtime_response_OBJECT_NULL) {
    if(cJSON_AddStringToObject(item, "object", realtime_response_object_ToString(realtime_response->object)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // realtime_response->status
    if(realtime_response->status != openai_api_realtime_response_STATUS_NULL) {
    if(cJSON_AddStringToObject(item, "status", realtime_response_status_ToString(realtime_response->status)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // realtime_response->status_details
    if(realtime_response->status_details) {
    cJSON *status_details_local_JSON = realtime_response_status_details_convertToJSON(realtime_response->status_details);
    if(status_details_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "status_details", status_details_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // realtime_response->output
    if(realtime_response->output) {
    cJSON *output = cJSON_AddArrayToObject(item, "output");
    if(output == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *outputListEntry;
    if (realtime_response->output) {
    list_ForEach(outputListEntry, realtime_response->output) {
    cJSON *itemLocal = realtime_conversation_item_convertToJSON(outputListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(output, itemLocal);
    }
    }
    }


    // realtime_response->metadata
    if(realtime_response->metadata) {
    cJSON *metadata_object = object_convertToJSON(realtime_response->metadata);
    if(metadata_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "metadata", metadata_object);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // realtime_response->usage
    if(realtime_response->usage) {
    cJSON *usage_local_JSON = realtime_response_usage_convertToJSON(realtime_response->usage);
    if(usage_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "usage", usage_local_JSON);
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

realtime_response_t *realtime_response_parseFromJSON(cJSON *realtime_responseJSON){

    realtime_response_t *realtime_response_local_var = NULL;

    // define the local variable for realtime_response->status_details
    realtime_response_status_details_t *status_details_local_nonprim = NULL;

    // define the local list for realtime_response->output
    list_t *outputList = NULL;

    // define the local variable for realtime_response->usage
    realtime_response_usage_t *usage_local_nonprim = NULL;

    // realtime_response->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(realtime_responseJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // realtime_response->object
    cJSON *object = cJSON_GetObjectItemCaseSensitive(realtime_responseJSON, "object");
    if (cJSON_IsNull(object)) {
        object = NULL;
    }
    openai_api_realtime_response_OBJECT_e objectVariable;
    if (object) { 
    if(!cJSON_IsString(object))
    {
    goto end; //Enum
    }
    objectVariable = realtime_response_object_FromString(object->valuestring);
    }

    // realtime_response->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(realtime_responseJSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    openai_api_realtime_response_STATUS_e statusVariable;
    if (status) { 
    if(!cJSON_IsString(status))
    {
    goto end; //Enum
    }
    statusVariable = realtime_response_status_FromString(status->valuestring);
    }

    // realtime_response->status_details
    cJSON *status_details = cJSON_GetObjectItemCaseSensitive(realtime_responseJSON, "status_details");
    if (cJSON_IsNull(status_details)) {
        status_details = NULL;
    }
    if (status_details) { 
    status_details_local_nonprim = realtime_response_status_details_parseFromJSON(status_details); //nonprimitive
    }

    // realtime_response->output
    cJSON *output = cJSON_GetObjectItemCaseSensitive(realtime_responseJSON, "output");
    if (cJSON_IsNull(output)) {
        output = NULL;
    }
    if (output) { 
    cJSON *output_local_nonprimitive = NULL;
    if(!cJSON_IsArray(output)){
        goto end; //nonprimitive container
    }

    outputList = list_createList();

    cJSON_ArrayForEach(output_local_nonprimitive,output )
    {
        if(!cJSON_IsObject(output_local_nonprimitive)){
            goto end;
        }
        realtime_conversation_item_t *outputItem = realtime_conversation_item_parseFromJSON(output_local_nonprimitive);

        list_addElement(outputList, outputItem);
    }
    }

    // realtime_response->metadata
    cJSON *metadata = cJSON_GetObjectItemCaseSensitive(realtime_responseJSON, "metadata");
    if (cJSON_IsNull(metadata)) {
        metadata = NULL;
    }
    object_t *metadata_local_object = NULL;
    if (metadata) { 
    metadata_local_object = object_parseFromJSON(metadata); //object
    }

    // realtime_response->usage
    cJSON *usage = cJSON_GetObjectItemCaseSensitive(realtime_responseJSON, "usage");
    if (cJSON_IsNull(usage)) {
        usage = NULL;
    }
    if (usage) { 
    usage_local_nonprim = realtime_response_usage_parseFromJSON(usage); //nonprimitive
    }


    realtime_response_local_var = realtime_response_create_internal (
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL,
        object ? objectVariable : openai_api_realtime_response_OBJECT_NULL,
        status ? statusVariable : openai_api_realtime_response_STATUS_NULL,
        status_details ? status_details_local_nonprim : NULL,
        output ? outputList : NULL,
        metadata ? metadata_local_object : NULL,
        usage ? usage_local_nonprim : NULL
        );

    return realtime_response_local_var;
end:
    if (status_details_local_nonprim) {
        realtime_response_status_details_free(status_details_local_nonprim);
        status_details_local_nonprim = NULL;
    }
    if (outputList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, outputList) {
            realtime_conversation_item_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(outputList);
        outputList = NULL;
    }
    if (usage_local_nonprim) {
        realtime_response_usage_free(usage_local_nonprim);
        usage_local_nonprim = NULL;
    }
    return NULL;

}
