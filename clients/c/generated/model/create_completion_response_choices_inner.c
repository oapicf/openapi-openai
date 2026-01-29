#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_completion_response_choices_inner.h"


char* create_completion_response_choices_inner_finish_reason_ToString(openai_api_create_completion_response_choices_inner_FINISHREASON_e finish_reason) {
    char* finish_reasonArray[] =  { "NULL", "stop", "length", "content_filter" };
    return finish_reasonArray[finish_reason];
}

openai_api_create_completion_response_choices_inner_FINISHREASON_e create_completion_response_choices_inner_finish_reason_FromString(char* finish_reason){
    int stringToReturn = 0;
    char *finish_reasonArray[] =  { "NULL", "stop", "length", "content_filter" };
    size_t sizeofArray = sizeof(finish_reasonArray) / sizeof(finish_reasonArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(finish_reason, finish_reasonArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static create_completion_response_choices_inner_t *create_completion_response_choices_inner_create_internal(
    openai_api_create_completion_response_choices_inner_FINISHREASON_e finish_reason,
    int index,
    create_completion_response_choices_inner_logprobs_t *logprobs,
    char *text
    ) {
    create_completion_response_choices_inner_t *create_completion_response_choices_inner_local_var = malloc(sizeof(create_completion_response_choices_inner_t));
    if (!create_completion_response_choices_inner_local_var) {
        return NULL;
    }
    create_completion_response_choices_inner_local_var->finish_reason = finish_reason;
    create_completion_response_choices_inner_local_var->index = index;
    create_completion_response_choices_inner_local_var->logprobs = logprobs;
    create_completion_response_choices_inner_local_var->text = text;

    create_completion_response_choices_inner_local_var->_library_owned = 1;
    return create_completion_response_choices_inner_local_var;
}

__attribute__((deprecated)) create_completion_response_choices_inner_t *create_completion_response_choices_inner_create(
    openai_api_create_completion_response_choices_inner_FINISHREASON_e finish_reason,
    int index,
    create_completion_response_choices_inner_logprobs_t *logprobs,
    char *text
    ) {
    return create_completion_response_choices_inner_create_internal (
        finish_reason,
        index,
        logprobs,
        text
        );
}

void create_completion_response_choices_inner_free(create_completion_response_choices_inner_t *create_completion_response_choices_inner) {
    if(NULL == create_completion_response_choices_inner){
        return ;
    }
    if(create_completion_response_choices_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "create_completion_response_choices_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (create_completion_response_choices_inner->logprobs) {
        create_completion_response_choices_inner_logprobs_free(create_completion_response_choices_inner->logprobs);
        create_completion_response_choices_inner->logprobs = NULL;
    }
    if (create_completion_response_choices_inner->text) {
        free(create_completion_response_choices_inner->text);
        create_completion_response_choices_inner->text = NULL;
    }
    free(create_completion_response_choices_inner);
}

cJSON *create_completion_response_choices_inner_convertToJSON(create_completion_response_choices_inner_t *create_completion_response_choices_inner) {
    cJSON *item = cJSON_CreateObject();

    // create_completion_response_choices_inner->finish_reason
    if (openai_api_create_completion_response_choices_inner_FINISHREASON_NULL == create_completion_response_choices_inner->finish_reason) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "finish_reason", create_completion_response_choices_inner_finish_reason_ToString(create_completion_response_choices_inner->finish_reason)) == NULL)
    {
    goto fail; //Enum
    }


    // create_completion_response_choices_inner->index
    if (!create_completion_response_choices_inner->index) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "index", create_completion_response_choices_inner->index) == NULL) {
    goto fail; //Numeric
    }


    // create_completion_response_choices_inner->logprobs
    if (!create_completion_response_choices_inner->logprobs) {
        goto fail;
    }
    cJSON *logprobs_local_JSON = create_completion_response_choices_inner_logprobs_convertToJSON(create_completion_response_choices_inner->logprobs);
    if(logprobs_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "logprobs", logprobs_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // create_completion_response_choices_inner->text
    if (!create_completion_response_choices_inner->text) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "text", create_completion_response_choices_inner->text) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

create_completion_response_choices_inner_t *create_completion_response_choices_inner_parseFromJSON(cJSON *create_completion_response_choices_innerJSON){

    create_completion_response_choices_inner_t *create_completion_response_choices_inner_local_var = NULL;

    // define the local variable for create_completion_response_choices_inner->logprobs
    create_completion_response_choices_inner_logprobs_t *logprobs_local_nonprim = NULL;

    // create_completion_response_choices_inner->finish_reason
    cJSON *finish_reason = cJSON_GetObjectItemCaseSensitive(create_completion_response_choices_innerJSON, "finish_reason");
    if (cJSON_IsNull(finish_reason)) {
        finish_reason = NULL;
    }
    if (!finish_reason) {
        goto end;
    }

    openai_api_create_completion_response_choices_inner_FINISHREASON_e finish_reasonVariable;
    
    if(!cJSON_IsString(finish_reason))
    {
    goto end; //Enum
    }
    finish_reasonVariable = create_completion_response_choices_inner_finish_reason_FromString(finish_reason->valuestring);

    // create_completion_response_choices_inner->index
    cJSON *index = cJSON_GetObjectItemCaseSensitive(create_completion_response_choices_innerJSON, "index");
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

    // create_completion_response_choices_inner->logprobs
    cJSON *logprobs = cJSON_GetObjectItemCaseSensitive(create_completion_response_choices_innerJSON, "logprobs");
    if (cJSON_IsNull(logprobs)) {
        logprobs = NULL;
    }
    if (!logprobs) {
        goto end;
    }

    
    logprobs_local_nonprim = create_completion_response_choices_inner_logprobs_parseFromJSON(logprobs); //nonprimitive

    // create_completion_response_choices_inner->text
    cJSON *text = cJSON_GetObjectItemCaseSensitive(create_completion_response_choices_innerJSON, "text");
    if (cJSON_IsNull(text)) {
        text = NULL;
    }
    if (!text) {
        goto end;
    }

    
    if(!cJSON_IsString(text))
    {
    goto end; //String
    }


    create_completion_response_choices_inner_local_var = create_completion_response_choices_inner_create_internal (
        finish_reasonVariable,
        index->valuedouble,
        logprobs_local_nonprim,
        strdup(text->valuestring)
        );

    return create_completion_response_choices_inner_local_var;
end:
    if (logprobs_local_nonprim) {
        create_completion_response_choices_inner_logprobs_free(logprobs_local_nonprim);
        logprobs_local_nonprim = NULL;
    }
    return NULL;

}
