#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "realtime_server_event_rate_limits_updated_rate_limits_inner.h"


char* realtime_server_event_rate_limits_updated_rate_limits_inner_name_ToString(openai_api_realtime_server_event_rate_limits_updated_rate_limits_inner_NAME_e name) {
    char* nameArray[] =  { "NULL", "requests", "tokens" };
    return nameArray[name];
}

openai_api_realtime_server_event_rate_limits_updated_rate_limits_inner_NAME_e realtime_server_event_rate_limits_updated_rate_limits_inner_name_FromString(char* name){
    int stringToReturn = 0;
    char *nameArray[] =  { "NULL", "requests", "tokens" };
    size_t sizeofArray = sizeof(nameArray) / sizeof(nameArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(name, nameArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static realtime_server_event_rate_limits_updated_rate_limits_inner_t *realtime_server_event_rate_limits_updated_rate_limits_inner_create_internal(
    openai_api_realtime_server_event_rate_limits_updated_rate_limits_inner_NAME_e name,
    int limit,
    int remaining,
    double reset_seconds
    ) {
    realtime_server_event_rate_limits_updated_rate_limits_inner_t *realtime_server_event_rate_limits_updated_rate_limits_inner_local_var = malloc(sizeof(realtime_server_event_rate_limits_updated_rate_limits_inner_t));
    if (!realtime_server_event_rate_limits_updated_rate_limits_inner_local_var) {
        return NULL;
    }
    realtime_server_event_rate_limits_updated_rate_limits_inner_local_var->name = name;
    realtime_server_event_rate_limits_updated_rate_limits_inner_local_var->limit = limit;
    realtime_server_event_rate_limits_updated_rate_limits_inner_local_var->remaining = remaining;
    realtime_server_event_rate_limits_updated_rate_limits_inner_local_var->reset_seconds = reset_seconds;

    realtime_server_event_rate_limits_updated_rate_limits_inner_local_var->_library_owned = 1;
    return realtime_server_event_rate_limits_updated_rate_limits_inner_local_var;
}

__attribute__((deprecated)) realtime_server_event_rate_limits_updated_rate_limits_inner_t *realtime_server_event_rate_limits_updated_rate_limits_inner_create(
    openai_api_realtime_server_event_rate_limits_updated_rate_limits_inner_NAME_e name,
    int limit,
    int remaining,
    double reset_seconds
    ) {
    return realtime_server_event_rate_limits_updated_rate_limits_inner_create_internal (
        name,
        limit,
        remaining,
        reset_seconds
        );
}

void realtime_server_event_rate_limits_updated_rate_limits_inner_free(realtime_server_event_rate_limits_updated_rate_limits_inner_t *realtime_server_event_rate_limits_updated_rate_limits_inner) {
    if(NULL == realtime_server_event_rate_limits_updated_rate_limits_inner){
        return ;
    }
    if(realtime_server_event_rate_limits_updated_rate_limits_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "realtime_server_event_rate_limits_updated_rate_limits_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    free(realtime_server_event_rate_limits_updated_rate_limits_inner);
}

cJSON *realtime_server_event_rate_limits_updated_rate_limits_inner_convertToJSON(realtime_server_event_rate_limits_updated_rate_limits_inner_t *realtime_server_event_rate_limits_updated_rate_limits_inner) {
    cJSON *item = cJSON_CreateObject();

    // realtime_server_event_rate_limits_updated_rate_limits_inner->name
    if(realtime_server_event_rate_limits_updated_rate_limits_inner->name != openai_api_realtime_server_event_rate_limits_updated_rate_limits_inner_NAME_NULL) {
    if(cJSON_AddStringToObject(item, "name", realtime_server_event_rate_limits_updated_rate_limits_inner_name_ToString(realtime_server_event_rate_limits_updated_rate_limits_inner->name)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // realtime_server_event_rate_limits_updated_rate_limits_inner->limit
    if(realtime_server_event_rate_limits_updated_rate_limits_inner->limit) {
    if(cJSON_AddNumberToObject(item, "limit", realtime_server_event_rate_limits_updated_rate_limits_inner->limit) == NULL) {
    goto fail; //Numeric
    }
    }


    // realtime_server_event_rate_limits_updated_rate_limits_inner->remaining
    if(realtime_server_event_rate_limits_updated_rate_limits_inner->remaining) {
    if(cJSON_AddNumberToObject(item, "remaining", realtime_server_event_rate_limits_updated_rate_limits_inner->remaining) == NULL) {
    goto fail; //Numeric
    }
    }


    // realtime_server_event_rate_limits_updated_rate_limits_inner->reset_seconds
    if(realtime_server_event_rate_limits_updated_rate_limits_inner->reset_seconds) {
    if(cJSON_AddNumberToObject(item, "reset_seconds", realtime_server_event_rate_limits_updated_rate_limits_inner->reset_seconds) == NULL) {
    goto fail; //Numeric
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

realtime_server_event_rate_limits_updated_rate_limits_inner_t *realtime_server_event_rate_limits_updated_rate_limits_inner_parseFromJSON(cJSON *realtime_server_event_rate_limits_updated_rate_limits_innerJSON){

    realtime_server_event_rate_limits_updated_rate_limits_inner_t *realtime_server_event_rate_limits_updated_rate_limits_inner_local_var = NULL;

    // realtime_server_event_rate_limits_updated_rate_limits_inner->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(realtime_server_event_rate_limits_updated_rate_limits_innerJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    openai_api_realtime_server_event_rate_limits_updated_rate_limits_inner_NAME_e nameVariable;
    if (name) { 
    if(!cJSON_IsString(name))
    {
    goto end; //Enum
    }
    nameVariable = realtime_server_event_rate_limits_updated_rate_limits_inner_name_FromString(name->valuestring);
    }

    // realtime_server_event_rate_limits_updated_rate_limits_inner->limit
    cJSON *limit = cJSON_GetObjectItemCaseSensitive(realtime_server_event_rate_limits_updated_rate_limits_innerJSON, "limit");
    if (cJSON_IsNull(limit)) {
        limit = NULL;
    }
    if (limit) { 
    if(!cJSON_IsNumber(limit))
    {
    goto end; //Numeric
    }
    }

    // realtime_server_event_rate_limits_updated_rate_limits_inner->remaining
    cJSON *remaining = cJSON_GetObjectItemCaseSensitive(realtime_server_event_rate_limits_updated_rate_limits_innerJSON, "remaining");
    if (cJSON_IsNull(remaining)) {
        remaining = NULL;
    }
    if (remaining) { 
    if(!cJSON_IsNumber(remaining))
    {
    goto end; //Numeric
    }
    }

    // realtime_server_event_rate_limits_updated_rate_limits_inner->reset_seconds
    cJSON *reset_seconds = cJSON_GetObjectItemCaseSensitive(realtime_server_event_rate_limits_updated_rate_limits_innerJSON, "reset_seconds");
    if (cJSON_IsNull(reset_seconds)) {
        reset_seconds = NULL;
    }
    if (reset_seconds) { 
    if(!cJSON_IsNumber(reset_seconds))
    {
    goto end; //Numeric
    }
    }


    realtime_server_event_rate_limits_updated_rate_limits_inner_local_var = realtime_server_event_rate_limits_updated_rate_limits_inner_create_internal (
        name ? nameVariable : openai_api_realtime_server_event_rate_limits_updated_rate_limits_inner_NAME_NULL,
        limit ? limit->valuedouble : 0,
        remaining ? remaining->valuedouble : 0,
        reset_seconds ? reset_seconds->valuedouble : 0
        );

    return realtime_server_event_rate_limits_updated_rate_limits_inner_local_var;
end:
    return NULL;

}
