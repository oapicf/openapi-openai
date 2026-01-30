#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "realtime_response_status_details.h"


char* realtime_response_status_details_type_ToString(openai_api_realtime_response_status_details_TYPE_e type) {
    char* typeArray[] =  { "NULL", "completed", "cancelled", "failed", "incomplete" };
    return typeArray[type];
}

openai_api_realtime_response_status_details_TYPE_e realtime_response_status_details_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "completed", "cancelled", "failed", "incomplete" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* realtime_response_status_details_reason_ToString(openai_api_realtime_response_status_details_REASON_e reason) {
    char* reasonArray[] =  { "NULL", "turn_detected", "client_cancelled", "max_output_tokens", "content_filter" };
    return reasonArray[reason];
}

openai_api_realtime_response_status_details_REASON_e realtime_response_status_details_reason_FromString(char* reason){
    int stringToReturn = 0;
    char *reasonArray[] =  { "NULL", "turn_detected", "client_cancelled", "max_output_tokens", "content_filter" };
    size_t sizeofArray = sizeof(reasonArray) / sizeof(reasonArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(reason, reasonArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static realtime_response_status_details_t *realtime_response_status_details_create_internal(
    openai_api_realtime_response_status_details_TYPE_e type,
    openai_api_realtime_response_status_details_REASON_e reason,
    realtime_response_status_details_error_t *error
    ) {
    realtime_response_status_details_t *realtime_response_status_details_local_var = malloc(sizeof(realtime_response_status_details_t));
    if (!realtime_response_status_details_local_var) {
        return NULL;
    }
    realtime_response_status_details_local_var->type = type;
    realtime_response_status_details_local_var->reason = reason;
    realtime_response_status_details_local_var->error = error;

    realtime_response_status_details_local_var->_library_owned = 1;
    return realtime_response_status_details_local_var;
}

__attribute__((deprecated)) realtime_response_status_details_t *realtime_response_status_details_create(
    openai_api_realtime_response_status_details_TYPE_e type,
    openai_api_realtime_response_status_details_REASON_e reason,
    realtime_response_status_details_error_t *error
    ) {
    return realtime_response_status_details_create_internal (
        type,
        reason,
        error
        );
}

void realtime_response_status_details_free(realtime_response_status_details_t *realtime_response_status_details) {
    if(NULL == realtime_response_status_details){
        return ;
    }
    if(realtime_response_status_details->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "realtime_response_status_details_free");
        return ;
    }
    listEntry_t *listEntry;
    if (realtime_response_status_details->error) {
        realtime_response_status_details_error_free(realtime_response_status_details->error);
        realtime_response_status_details->error = NULL;
    }
    free(realtime_response_status_details);
}

cJSON *realtime_response_status_details_convertToJSON(realtime_response_status_details_t *realtime_response_status_details) {
    cJSON *item = cJSON_CreateObject();

    // realtime_response_status_details->type
    if(realtime_response_status_details->type != openai_api_realtime_response_status_details_TYPE_NULL) {
    if(cJSON_AddStringToObject(item, "type", realtime_response_status_details_type_ToString(realtime_response_status_details->type)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // realtime_response_status_details->reason
    if(realtime_response_status_details->reason != openai_api_realtime_response_status_details_REASON_NULL) {
    if(cJSON_AddStringToObject(item, "reason", realtime_response_status_details_reason_ToString(realtime_response_status_details->reason)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // realtime_response_status_details->error
    if(realtime_response_status_details->error) {
    cJSON *error_local_JSON = realtime_response_status_details_error_convertToJSON(realtime_response_status_details->error);
    if(error_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "error", error_local_JSON);
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

realtime_response_status_details_t *realtime_response_status_details_parseFromJSON(cJSON *realtime_response_status_detailsJSON){

    realtime_response_status_details_t *realtime_response_status_details_local_var = NULL;

    // define the local variable for realtime_response_status_details->error
    realtime_response_status_details_error_t *error_local_nonprim = NULL;

    // realtime_response_status_details->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(realtime_response_status_detailsJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    openai_api_realtime_response_status_details_TYPE_e typeVariable;
    if (type) { 
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = realtime_response_status_details_type_FromString(type->valuestring);
    }

    // realtime_response_status_details->reason
    cJSON *reason = cJSON_GetObjectItemCaseSensitive(realtime_response_status_detailsJSON, "reason");
    if (cJSON_IsNull(reason)) {
        reason = NULL;
    }
    openai_api_realtime_response_status_details_REASON_e reasonVariable;
    if (reason) { 
    if(!cJSON_IsString(reason))
    {
    goto end; //Enum
    }
    reasonVariable = realtime_response_status_details_reason_FromString(reason->valuestring);
    }

    // realtime_response_status_details->error
    cJSON *error = cJSON_GetObjectItemCaseSensitive(realtime_response_status_detailsJSON, "error");
    if (cJSON_IsNull(error)) {
        error = NULL;
    }
    if (error) { 
    error_local_nonprim = realtime_response_status_details_error_parseFromJSON(error); //nonprimitive
    }


    realtime_response_status_details_local_var = realtime_response_status_details_create_internal (
        type ? typeVariable : openai_api_realtime_response_status_details_TYPE_NULL,
        reason ? reasonVariable : openai_api_realtime_response_status_details_REASON_NULL,
        error ? error_local_nonprim : NULL
        );

    return realtime_response_status_details_local_var;
end:
    if (error_local_nonprim) {
        realtime_response_status_details_error_free(error_local_nonprim);
        error_local_nonprim = NULL;
    }
    return NULL;

}
