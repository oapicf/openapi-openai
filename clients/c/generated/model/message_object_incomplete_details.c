#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "message_object_incomplete_details.h"


char* message_object_incomplete_details_reason_ToString(openai_api_message_object_incomplete_details_REASON_e reason) {
    char* reasonArray[] =  { "NULL", "content_filter", "max_tokens", "run_cancelled", "run_expired", "run_failed" };
    return reasonArray[reason];
}

openai_api_message_object_incomplete_details_REASON_e message_object_incomplete_details_reason_FromString(char* reason){
    int stringToReturn = 0;
    char *reasonArray[] =  { "NULL", "content_filter", "max_tokens", "run_cancelled", "run_expired", "run_failed" };
    size_t sizeofArray = sizeof(reasonArray) / sizeof(reasonArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(reason, reasonArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

message_object_incomplete_details_t *message_object_incomplete_details_create(
    openai_api_message_object_incomplete_details_REASON_e reason
    ) {
    message_object_incomplete_details_t *message_object_incomplete_details_local_var = malloc(sizeof(message_object_incomplete_details_t));
    if (!message_object_incomplete_details_local_var) {
        return NULL;
    }
    message_object_incomplete_details_local_var->reason = reason;

    return message_object_incomplete_details_local_var;
}


void message_object_incomplete_details_free(message_object_incomplete_details_t *message_object_incomplete_details) {
    if(NULL == message_object_incomplete_details){
        return ;
    }
    listEntry_t *listEntry;
    free(message_object_incomplete_details);
}

cJSON *message_object_incomplete_details_convertToJSON(message_object_incomplete_details_t *message_object_incomplete_details) {
    cJSON *item = cJSON_CreateObject();

    // message_object_incomplete_details->reason
    if (openai_api_message_object_incomplete_details_REASON_NULL == message_object_incomplete_details->reason) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "reason", reasonmessage_object_incomplete_details_ToString(message_object_incomplete_details->reason)) == NULL)
    {
    goto fail; //Enum
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

message_object_incomplete_details_t *message_object_incomplete_details_parseFromJSON(cJSON *message_object_incomplete_detailsJSON){

    message_object_incomplete_details_t *message_object_incomplete_details_local_var = NULL;

    // message_object_incomplete_details->reason
    cJSON *reason = cJSON_GetObjectItemCaseSensitive(message_object_incomplete_detailsJSON, "reason");
    if (!reason) {
        goto end;
    }

    openai_api_message_object_incomplete_details_REASON_e reasonVariable;
    
    if(!cJSON_IsString(reason))
    {
    goto end; //Enum
    }
    reasonVariable = message_object_incomplete_details_reason_FromString(reason->valuestring);


    message_object_incomplete_details_local_var = message_object_incomplete_details_create (
        reasonVariable
        );

    return message_object_incomplete_details_local_var;
end:
    return NULL;

}
