#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_chat_completion_stream_response_choices_inner.h"


char* create_chat_completion_stream_response_choices_inner_finish_reason_ToString(openai_api_create_chat_completion_stream_response_choices_inner_FINISHREASON_e finish_reason) {
    char* finish_reasonArray[] =  { "NULL", "stop", "length", "tool_calls", "content_filter", "function_call" };
    return finish_reasonArray[finish_reason];
}

openai_api_create_chat_completion_stream_response_choices_inner_FINISHREASON_e create_chat_completion_stream_response_choices_inner_finish_reason_FromString(char* finish_reason){
    int stringToReturn = 0;
    char *finish_reasonArray[] =  { "NULL", "stop", "length", "tool_calls", "content_filter", "function_call" };
    size_t sizeofArray = sizeof(finish_reasonArray) / sizeof(finish_reasonArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(finish_reason, finish_reasonArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static create_chat_completion_stream_response_choices_inner_t *create_chat_completion_stream_response_choices_inner_create_internal(
    chat_completion_stream_response_delta_t *delta,
    create_chat_completion_response_choices_inner_logprobs_t *logprobs,
    openai_api_create_chat_completion_stream_response_choices_inner_FINISHREASON_e finish_reason,
    int index
    ) {
    create_chat_completion_stream_response_choices_inner_t *create_chat_completion_stream_response_choices_inner_local_var = malloc(sizeof(create_chat_completion_stream_response_choices_inner_t));
    if (!create_chat_completion_stream_response_choices_inner_local_var) {
        return NULL;
    }
    create_chat_completion_stream_response_choices_inner_local_var->delta = delta;
    create_chat_completion_stream_response_choices_inner_local_var->logprobs = logprobs;
    create_chat_completion_stream_response_choices_inner_local_var->finish_reason = finish_reason;
    create_chat_completion_stream_response_choices_inner_local_var->index = index;

    create_chat_completion_stream_response_choices_inner_local_var->_library_owned = 1;
    return create_chat_completion_stream_response_choices_inner_local_var;
}

__attribute__((deprecated)) create_chat_completion_stream_response_choices_inner_t *create_chat_completion_stream_response_choices_inner_create(
    chat_completion_stream_response_delta_t *delta,
    create_chat_completion_response_choices_inner_logprobs_t *logprobs,
    openai_api_create_chat_completion_stream_response_choices_inner_FINISHREASON_e finish_reason,
    int index
    ) {
    return create_chat_completion_stream_response_choices_inner_create_internal (
        delta,
        logprobs,
        finish_reason,
        index
        );
}

void create_chat_completion_stream_response_choices_inner_free(create_chat_completion_stream_response_choices_inner_t *create_chat_completion_stream_response_choices_inner) {
    if(NULL == create_chat_completion_stream_response_choices_inner){
        return ;
    }
    if(create_chat_completion_stream_response_choices_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "create_chat_completion_stream_response_choices_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (create_chat_completion_stream_response_choices_inner->delta) {
        chat_completion_stream_response_delta_free(create_chat_completion_stream_response_choices_inner->delta);
        create_chat_completion_stream_response_choices_inner->delta = NULL;
    }
    if (create_chat_completion_stream_response_choices_inner->logprobs) {
        create_chat_completion_response_choices_inner_logprobs_free(create_chat_completion_stream_response_choices_inner->logprobs);
        create_chat_completion_stream_response_choices_inner->logprobs = NULL;
    }
    free(create_chat_completion_stream_response_choices_inner);
}

cJSON *create_chat_completion_stream_response_choices_inner_convertToJSON(create_chat_completion_stream_response_choices_inner_t *create_chat_completion_stream_response_choices_inner) {
    cJSON *item = cJSON_CreateObject();

    // create_chat_completion_stream_response_choices_inner->delta
    if (!create_chat_completion_stream_response_choices_inner->delta) {
        goto fail;
    }
    cJSON *delta_local_JSON = chat_completion_stream_response_delta_convertToJSON(create_chat_completion_stream_response_choices_inner->delta);
    if(delta_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "delta", delta_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // create_chat_completion_stream_response_choices_inner->logprobs
    if(create_chat_completion_stream_response_choices_inner->logprobs) {
    cJSON *logprobs_local_JSON = create_chat_completion_response_choices_inner_logprobs_convertToJSON(create_chat_completion_stream_response_choices_inner->logprobs);
    if(logprobs_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "logprobs", logprobs_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // create_chat_completion_stream_response_choices_inner->finish_reason
    if (openai_api_create_chat_completion_stream_response_choices_inner_FINISHREASON_NULL == create_chat_completion_stream_response_choices_inner->finish_reason) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "finish_reason", create_chat_completion_stream_response_choices_inner_finish_reason_ToString(create_chat_completion_stream_response_choices_inner->finish_reason)) == NULL)
    {
    goto fail; //Enum
    }


    // create_chat_completion_stream_response_choices_inner->index
    if (!create_chat_completion_stream_response_choices_inner->index) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "index", create_chat_completion_stream_response_choices_inner->index) == NULL) {
    goto fail; //Numeric
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

create_chat_completion_stream_response_choices_inner_t *create_chat_completion_stream_response_choices_inner_parseFromJSON(cJSON *create_chat_completion_stream_response_choices_innerJSON){

    create_chat_completion_stream_response_choices_inner_t *create_chat_completion_stream_response_choices_inner_local_var = NULL;

    // define the local variable for create_chat_completion_stream_response_choices_inner->delta
    chat_completion_stream_response_delta_t *delta_local_nonprim = NULL;

    // define the local variable for create_chat_completion_stream_response_choices_inner->logprobs
    create_chat_completion_response_choices_inner_logprobs_t *logprobs_local_nonprim = NULL;

    // create_chat_completion_stream_response_choices_inner->delta
    cJSON *delta = cJSON_GetObjectItemCaseSensitive(create_chat_completion_stream_response_choices_innerJSON, "delta");
    if (cJSON_IsNull(delta)) {
        delta = NULL;
    }
    if (!delta) {
        goto end;
    }

    
    delta_local_nonprim = chat_completion_stream_response_delta_parseFromJSON(delta); //nonprimitive

    // create_chat_completion_stream_response_choices_inner->logprobs
    cJSON *logprobs = cJSON_GetObjectItemCaseSensitive(create_chat_completion_stream_response_choices_innerJSON, "logprobs");
    if (cJSON_IsNull(logprobs)) {
        logprobs = NULL;
    }
    if (logprobs) { 
    logprobs_local_nonprim = create_chat_completion_response_choices_inner_logprobs_parseFromJSON(logprobs); //nonprimitive
    }

    // create_chat_completion_stream_response_choices_inner->finish_reason
    cJSON *finish_reason = cJSON_GetObjectItemCaseSensitive(create_chat_completion_stream_response_choices_innerJSON, "finish_reason");
    if (cJSON_IsNull(finish_reason)) {
        finish_reason = NULL;
    }
    if (!finish_reason) {
        goto end;
    }

    openai_api_create_chat_completion_stream_response_choices_inner_FINISHREASON_e finish_reasonVariable;
    
    if(!cJSON_IsString(finish_reason))
    {
    goto end; //Enum
    }
    finish_reasonVariable = create_chat_completion_stream_response_choices_inner_finish_reason_FromString(finish_reason->valuestring);

    // create_chat_completion_stream_response_choices_inner->index
    cJSON *index = cJSON_GetObjectItemCaseSensitive(create_chat_completion_stream_response_choices_innerJSON, "index");
    if (cJSON_IsNull(index)) {
        index = NULL;
    }
    if (!index) {
        goto end;
    }

    
    if(!cJSON_IsNumber(index))
    {
    goto end; //Numeric
    }


    create_chat_completion_stream_response_choices_inner_local_var = create_chat_completion_stream_response_choices_inner_create_internal (
        delta_local_nonprim,
        logprobs ? logprobs_local_nonprim : NULL,
        finish_reasonVariable,
        index->valuedouble
        );

    return create_chat_completion_stream_response_choices_inner_local_var;
end:
    if (delta_local_nonprim) {
        chat_completion_stream_response_delta_free(delta_local_nonprim);
        delta_local_nonprim = NULL;
    }
    if (logprobs_local_nonprim) {
        create_chat_completion_response_choices_inner_logprobs_free(logprobs_local_nonprim);
        logprobs_local_nonprim = NULL;
    }
    return NULL;

}
