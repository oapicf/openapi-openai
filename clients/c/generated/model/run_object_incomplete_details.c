#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "run_object_incomplete_details.h"


char* run_object_incomplete_details_reason_ToString(openai_api_run_object_incomplete_details_REASON_e reason) {
    char* reasonArray[] =  { "NULL", "max_completion_tokens", "max_prompt_tokens" };
    return reasonArray[reason];
}

openai_api_run_object_incomplete_details_REASON_e run_object_incomplete_details_reason_FromString(char* reason){
    int stringToReturn = 0;
    char *reasonArray[] =  { "NULL", "max_completion_tokens", "max_prompt_tokens" };
    size_t sizeofArray = sizeof(reasonArray) / sizeof(reasonArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(reason, reasonArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

run_object_incomplete_details_t *run_object_incomplete_details_create(
    openai_api_run_object_incomplete_details_REASON_e reason
    ) {
    run_object_incomplete_details_t *run_object_incomplete_details_local_var = malloc(sizeof(run_object_incomplete_details_t));
    if (!run_object_incomplete_details_local_var) {
        return NULL;
    }
    run_object_incomplete_details_local_var->reason = reason;

    return run_object_incomplete_details_local_var;
}


void run_object_incomplete_details_free(run_object_incomplete_details_t *run_object_incomplete_details) {
    if(NULL == run_object_incomplete_details){
        return ;
    }
    listEntry_t *listEntry;
    free(run_object_incomplete_details);
}

cJSON *run_object_incomplete_details_convertToJSON(run_object_incomplete_details_t *run_object_incomplete_details) {
    cJSON *item = cJSON_CreateObject();

    // run_object_incomplete_details->reason
    if(run_object_incomplete_details->reason != openai_api_run_object_incomplete_details_REASON_NULL) {
    if(cJSON_AddStringToObject(item, "reason", reasonrun_object_incomplete_details_ToString(run_object_incomplete_details->reason)) == NULL)
    {
    goto fail; //Enum
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

run_object_incomplete_details_t *run_object_incomplete_details_parseFromJSON(cJSON *run_object_incomplete_detailsJSON){

    run_object_incomplete_details_t *run_object_incomplete_details_local_var = NULL;

    // run_object_incomplete_details->reason
    cJSON *reason = cJSON_GetObjectItemCaseSensitive(run_object_incomplete_detailsJSON, "reason");
    openai_api_run_object_incomplete_details_REASON_e reasonVariable;
    if (reason) { 
    if(!cJSON_IsString(reason))
    {
    goto end; //Enum
    }
    reasonVariable = run_object_incomplete_details_reason_FromString(reason->valuestring);
    }


    run_object_incomplete_details_local_var = run_object_incomplete_details_create (
        reason ? reasonVariable : openai_api_run_object_incomplete_details_REASON_NULL
        );

    return run_object_incomplete_details_local_var;
end:
    return NULL;

}
