#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_edit_response_choices_inner.h"


char* create_edit_response_choices_inner_finish_reason_ToString(openai_api_create_edit_response_choices_inner_FINISHREASON_e finish_reason) {
    char* finish_reasonArray[] =  { "NULL", "stop", "length" };
    return finish_reasonArray[finish_reason];
}

openai_api_create_edit_response_choices_inner_FINISHREASON_e create_edit_response_choices_inner_finish_reason_FromString(char* finish_reason){
    int stringToReturn = 0;
    char *finish_reasonArray[] =  { "NULL", "stop", "length" };
    size_t sizeofArray = sizeof(finish_reasonArray) / sizeof(finish_reasonArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(finish_reason, finish_reasonArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

create_edit_response_choices_inner_t *create_edit_response_choices_inner_create(
    char *text,
    int index,
    create_completion_response_choices_inner_logprobs_t *logprobs,
    openai_api_create_edit_response_choices_inner_FINISHREASON_e finish_reason
    ) {
    create_edit_response_choices_inner_t *create_edit_response_choices_inner_local_var = malloc(sizeof(create_edit_response_choices_inner_t));
    if (!create_edit_response_choices_inner_local_var) {
        return NULL;
    }
    create_edit_response_choices_inner_local_var->text = text;
    create_edit_response_choices_inner_local_var->index = index;
    create_edit_response_choices_inner_local_var->logprobs = logprobs;
    create_edit_response_choices_inner_local_var->finish_reason = finish_reason;

    return create_edit_response_choices_inner_local_var;
}


void create_edit_response_choices_inner_free(create_edit_response_choices_inner_t *create_edit_response_choices_inner) {
    if(NULL == create_edit_response_choices_inner){
        return ;
    }
    listEntry_t *listEntry;
    if (create_edit_response_choices_inner->text) {
        free(create_edit_response_choices_inner->text);
        create_edit_response_choices_inner->text = NULL;
    }
    if (create_edit_response_choices_inner->logprobs) {
        create_completion_response_choices_inner_logprobs_free(create_edit_response_choices_inner->logprobs);
        create_edit_response_choices_inner->logprobs = NULL;
    }
    free(create_edit_response_choices_inner);
}

cJSON *create_edit_response_choices_inner_convertToJSON(create_edit_response_choices_inner_t *create_edit_response_choices_inner) {
    cJSON *item = cJSON_CreateObject();

    // create_edit_response_choices_inner->text
    if(create_edit_response_choices_inner->text) {
    if(cJSON_AddStringToObject(item, "text", create_edit_response_choices_inner->text) == NULL) {
    goto fail; //String
    }
    }


    // create_edit_response_choices_inner->index
    if(create_edit_response_choices_inner->index) {
    if(cJSON_AddNumberToObject(item, "index", create_edit_response_choices_inner->index) == NULL) {
    goto fail; //Numeric
    }
    }


    // create_edit_response_choices_inner->logprobs
    if(create_edit_response_choices_inner->logprobs) {
    cJSON *logprobs_local_JSON = create_completion_response_choices_inner_logprobs_convertToJSON(create_edit_response_choices_inner->logprobs);
    if(logprobs_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "logprobs", logprobs_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // create_edit_response_choices_inner->finish_reason
    if(create_edit_response_choices_inner->finish_reason != openai_api_create_edit_response_choices_inner_FINISHREASON_NULL) {
    if(cJSON_AddStringToObject(item, "finish_reason", finish_reasoncreate_edit_response_choices_inner_ToString(create_edit_response_choices_inner->finish_reason)) == NULL)
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

create_edit_response_choices_inner_t *create_edit_response_choices_inner_parseFromJSON(cJSON *create_edit_response_choices_innerJSON){

    create_edit_response_choices_inner_t *create_edit_response_choices_inner_local_var = NULL;

    // define the local variable for create_edit_response_choices_inner->logprobs
    create_completion_response_choices_inner_logprobs_t *logprobs_local_nonprim = NULL;

    // create_edit_response_choices_inner->text
    cJSON *text = cJSON_GetObjectItemCaseSensitive(create_edit_response_choices_innerJSON, "text");
    if (text) { 
    if(!cJSON_IsString(text) && !cJSON_IsNull(text))
    {
    goto end; //String
    }
    }

    // create_edit_response_choices_inner->index
    cJSON *index = cJSON_GetObjectItemCaseSensitive(create_edit_response_choices_innerJSON, "index");
    if (index) { 
    if(!cJSON_IsNumber(index))
    {
    goto end; //Numeric
    }
    }

    // create_edit_response_choices_inner->logprobs
    cJSON *logprobs = cJSON_GetObjectItemCaseSensitive(create_edit_response_choices_innerJSON, "logprobs");
    if (logprobs) { 
    logprobs_local_nonprim = create_completion_response_choices_inner_logprobs_parseFromJSON(logprobs); //nonprimitive
    }

    // create_edit_response_choices_inner->finish_reason
    cJSON *finish_reason = cJSON_GetObjectItemCaseSensitive(create_edit_response_choices_innerJSON, "finish_reason");
    openai_api_create_edit_response_choices_inner_FINISHREASON_e finish_reasonVariable;
    if (finish_reason) { 
    if(!cJSON_IsString(finish_reason))
    {
    goto end; //Enum
    }
    finish_reasonVariable = create_edit_response_choices_inner_finish_reason_FromString(finish_reason->valuestring);
    }


    create_edit_response_choices_inner_local_var = create_edit_response_choices_inner_create (
        text && !cJSON_IsNull(text) ? strdup(text->valuestring) : NULL,
        index ? index->valuedouble : 0,
        logprobs ? logprobs_local_nonprim : NULL,
        finish_reason ? finish_reasonVariable : openai_api_create_edit_response_choices_inner_FINISHREASON_NULL
        );

    return create_edit_response_choices_inner_local_var;
end:
    if (logprobs_local_nonprim) {
        create_completion_response_choices_inner_logprobs_free(logprobs_local_nonprim);
        logprobs_local_nonprim = NULL;
    }
    return NULL;

}
