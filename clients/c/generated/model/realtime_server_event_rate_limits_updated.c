#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "realtime_server_event_rate_limits_updated.h"


char* realtime_server_event_rate_limits_updated_type_ToString(openai_api_realtime_server_event_rate_limits_updated_TYPE_e type) {
    char* typeArray[] =  { "NULL", "rate_limits.updated" };
    return typeArray[type];
}

openai_api_realtime_server_event_rate_limits_updated_TYPE_e realtime_server_event_rate_limits_updated_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "rate_limits.updated" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static realtime_server_event_rate_limits_updated_t *realtime_server_event_rate_limits_updated_create_internal(
    char *event_id,
    openai_api_realtime_server_event_rate_limits_updated_TYPE_e type,
    list_t *rate_limits
    ) {
    realtime_server_event_rate_limits_updated_t *realtime_server_event_rate_limits_updated_local_var = malloc(sizeof(realtime_server_event_rate_limits_updated_t));
    if (!realtime_server_event_rate_limits_updated_local_var) {
        return NULL;
    }
    realtime_server_event_rate_limits_updated_local_var->event_id = event_id;
    realtime_server_event_rate_limits_updated_local_var->type = type;
    realtime_server_event_rate_limits_updated_local_var->rate_limits = rate_limits;

    realtime_server_event_rate_limits_updated_local_var->_library_owned = 1;
    return realtime_server_event_rate_limits_updated_local_var;
}

__attribute__((deprecated)) realtime_server_event_rate_limits_updated_t *realtime_server_event_rate_limits_updated_create(
    char *event_id,
    openai_api_realtime_server_event_rate_limits_updated_TYPE_e type,
    list_t *rate_limits
    ) {
    return realtime_server_event_rate_limits_updated_create_internal (
        event_id,
        type,
        rate_limits
        );
}

void realtime_server_event_rate_limits_updated_free(realtime_server_event_rate_limits_updated_t *realtime_server_event_rate_limits_updated) {
    if(NULL == realtime_server_event_rate_limits_updated){
        return ;
    }
    if(realtime_server_event_rate_limits_updated->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "realtime_server_event_rate_limits_updated_free");
        return ;
    }
    listEntry_t *listEntry;
    if (realtime_server_event_rate_limits_updated->event_id) {
        free(realtime_server_event_rate_limits_updated->event_id);
        realtime_server_event_rate_limits_updated->event_id = NULL;
    }
    if (realtime_server_event_rate_limits_updated->rate_limits) {
        list_ForEach(listEntry, realtime_server_event_rate_limits_updated->rate_limits) {
            realtime_server_event_rate_limits_updated_rate_limits_inner_free(listEntry->data);
        }
        list_freeList(realtime_server_event_rate_limits_updated->rate_limits);
        realtime_server_event_rate_limits_updated->rate_limits = NULL;
    }
    free(realtime_server_event_rate_limits_updated);
}

cJSON *realtime_server_event_rate_limits_updated_convertToJSON(realtime_server_event_rate_limits_updated_t *realtime_server_event_rate_limits_updated) {
    cJSON *item = cJSON_CreateObject();

    // realtime_server_event_rate_limits_updated->event_id
    if (!realtime_server_event_rate_limits_updated->event_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "event_id", realtime_server_event_rate_limits_updated->event_id) == NULL) {
    goto fail; //String
    }


    // realtime_server_event_rate_limits_updated->type
    if (openai_api_realtime_server_event_rate_limits_updated_TYPE_NULL == realtime_server_event_rate_limits_updated->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", realtime_server_event_rate_limits_updated_type_ToString(realtime_server_event_rate_limits_updated->type)) == NULL)
    {
    goto fail; //Enum
    }


    // realtime_server_event_rate_limits_updated->rate_limits
    if (!realtime_server_event_rate_limits_updated->rate_limits) {
        goto fail;
    }
    cJSON *rate_limits = cJSON_AddArrayToObject(item, "rate_limits");
    if(rate_limits == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *rate_limitsListEntry;
    if (realtime_server_event_rate_limits_updated->rate_limits) {
    list_ForEach(rate_limitsListEntry, realtime_server_event_rate_limits_updated->rate_limits) {
    cJSON *itemLocal = realtime_server_event_rate_limits_updated_rate_limits_inner_convertToJSON(rate_limitsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(rate_limits, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

realtime_server_event_rate_limits_updated_t *realtime_server_event_rate_limits_updated_parseFromJSON(cJSON *realtime_server_event_rate_limits_updatedJSON){

    realtime_server_event_rate_limits_updated_t *realtime_server_event_rate_limits_updated_local_var = NULL;

    // define the local list for realtime_server_event_rate_limits_updated->rate_limits
    list_t *rate_limitsList = NULL;

    // realtime_server_event_rate_limits_updated->event_id
    cJSON *event_id = cJSON_GetObjectItemCaseSensitive(realtime_server_event_rate_limits_updatedJSON, "event_id");
    if (cJSON_IsNull(event_id)) {
        event_id = NULL;
    }
    if (!event_id) {
        goto end;
    }

    
    if(!cJSON_IsString(event_id))
    {
    goto end; //String
    }

    // realtime_server_event_rate_limits_updated->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(realtime_server_event_rate_limits_updatedJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (!type) {
        goto end;
    }

    openai_api_realtime_server_event_rate_limits_updated_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = realtime_server_event_rate_limits_updated_type_FromString(type->valuestring);

    // realtime_server_event_rate_limits_updated->rate_limits
    cJSON *rate_limits = cJSON_GetObjectItemCaseSensitive(realtime_server_event_rate_limits_updatedJSON, "rate_limits");
    if (cJSON_IsNull(rate_limits)) {
        rate_limits = NULL;
    }
    if (!rate_limits) {
        goto end;
    }

    
    cJSON *rate_limits_local_nonprimitive = NULL;
    if(!cJSON_IsArray(rate_limits)){
        goto end; //nonprimitive container
    }

    rate_limitsList = list_createList();

    cJSON_ArrayForEach(rate_limits_local_nonprimitive,rate_limits )
    {
        if(!cJSON_IsObject(rate_limits_local_nonprimitive)){
            goto end;
        }
        realtime_server_event_rate_limits_updated_rate_limits_inner_t *rate_limitsItem = realtime_server_event_rate_limits_updated_rate_limits_inner_parseFromJSON(rate_limits_local_nonprimitive);

        list_addElement(rate_limitsList, rate_limitsItem);
    }


    realtime_server_event_rate_limits_updated_local_var = realtime_server_event_rate_limits_updated_create_internal (
        strdup(event_id->valuestring),
        typeVariable,
        rate_limitsList
        );

    return realtime_server_event_rate_limits_updated_local_var;
end:
    if (rate_limitsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, rate_limitsList) {
            realtime_server_event_rate_limits_updated_rate_limits_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(rate_limitsList);
        rate_limitsList = NULL;
    }
    return NULL;

}
