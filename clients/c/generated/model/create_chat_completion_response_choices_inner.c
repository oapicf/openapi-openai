#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_chat_completion_response_choices_inner.h"


char* create_chat_completion_response_choices_inner_finish_reason_ToString(openai_api_create_chat_completion_response_choices_inner_FINISHREASON_e finish_reason) {
    char* finish_reasonArray[] =  { "NULL", "stop", "length", "tool_calls", "content_filter", "function_call" };
    return finish_reasonArray[finish_reason];
}

openai_api_create_chat_completion_response_choices_inner_FINISHREASON_e create_chat_completion_response_choices_inner_finish_reason_FromString(char* finish_reason){
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

create_chat_completion_response_choices_inner_t *create_chat_completion_response_choices_inner_create(
    openai_api_create_chat_completion_response_choices_inner_FINISHREASON_e finish_reason,
    int index,
    chat_completion_response_message_t *message,
    create_chat_completion_response_choices_inner_logprobs_t *logprobs
    ) {
    create_chat_completion_response_choices_inner_t *create_chat_completion_response_choices_inner_local_var = malloc(sizeof(create_chat_completion_response_choices_inner_t));
    if (!create_chat_completion_response_choices_inner_local_var) {
        return NULL;
    }
    create_chat_completion_response_choices_inner_local_var->finish_reason = finish_reason;
    create_chat_completion_response_choices_inner_local_var->index = index;
    create_chat_completion_response_choices_inner_local_var->message = message;
    create_chat_completion_response_choices_inner_local_var->logprobs = logprobs;

    return create_chat_completion_response_choices_inner_local_var;
}


void create_chat_completion_response_choices_inner_free(create_chat_completion_response_choices_inner_t *create_chat_completion_response_choices_inner) {
    if(NULL == create_chat_completion_response_choices_inner){
        return ;
    }
    listEntry_t *listEntry;
    if (create_chat_completion_response_choices_inner->message) {
        chat_completion_response_message_free(create_chat_completion_response_choices_inner->message);
        create_chat_completion_response_choices_inner->message = NULL;
    }
    if (create_chat_completion_response_choices_inner->logprobs) {
        create_chat_completion_response_choices_inner_logprobs_free(create_chat_completion_response_choices_inner->logprobs);
        create_chat_completion_response_choices_inner->logprobs = NULL;
    }
    free(create_chat_completion_response_choices_inner);
}

cJSON *create_chat_completion_response_choices_inner_convertToJSON(create_chat_completion_response_choices_inner_t *create_chat_completion_response_choices_inner) {
    cJSON *item = cJSON_CreateObject();

    // create_chat_completion_response_choices_inner->finish_reason
    if (openai_api_create_chat_completion_response_choices_inner_FINISHREASON_NULL == create_chat_completion_response_choices_inner->finish_reason) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "finish_reason", finish_reasoncreate_chat_completion_response_choices_inner_ToString(create_chat_completion_response_choices_inner->finish_reason)) == NULL)
    {
    goto fail; //Enum
    }


    // create_chat_completion_response_choices_inner->index
    if (!create_chat_completion_response_choices_inner->index) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "index", create_chat_completion_response_choices_inner->index) == NULL) {
    goto fail; //Numeric
    }


    // create_chat_completion_response_choices_inner->message
    if (!create_chat_completion_response_choices_inner->message) {
        goto fail;
    }
    cJSON *message_local_JSON = chat_completion_response_message_convertToJSON(create_chat_completion_response_choices_inner->message);
    if(message_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "message", message_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // create_chat_completion_response_choices_inner->logprobs
    if (!create_chat_completion_response_choices_inner->logprobs) {
        goto fail;
    }
    cJSON *logprobs_local_JSON = create_chat_completion_response_choices_inner_logprobs_convertToJSON(create_chat_completion_response_choices_inner->logprobs);
    if(logprobs_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "logprobs", logprobs_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

create_chat_completion_response_choices_inner_t *create_chat_completion_response_choices_inner_parseFromJSON(cJSON *create_chat_completion_response_choices_innerJSON){

    create_chat_completion_response_choices_inner_t *create_chat_completion_response_choices_inner_local_var = NULL;

    // define the local variable for create_chat_completion_response_choices_inner->message
    chat_completion_response_message_t *message_local_nonprim = NULL;

    // define the local variable for create_chat_completion_response_choices_inner->logprobs
    create_chat_completion_response_choices_inner_logprobs_t *logprobs_local_nonprim = NULL;

    // create_chat_completion_response_choices_inner->finish_reason
    cJSON *finish_reason = cJSON_GetObjectItemCaseSensitive(create_chat_completion_response_choices_innerJSON, "finish_reason");
    if (!finish_reason) {
        goto end;
    }

    openai_api_create_chat_completion_response_choices_inner_FINISHREASON_e finish_reasonVariable;
    
    if(!cJSON_IsString(finish_reason))
    {
    goto end; //Enum
    }
    finish_reasonVariable = create_chat_completion_response_choices_inner_finish_reason_FromString(finish_reason->valuestring);

    // create_chat_completion_response_choices_inner->index
    cJSON *index = cJSON_GetObjectItemCaseSensitive(create_chat_completion_response_choices_innerJSON, "index");
    if (!index) {
        goto end;
    }

    
    if(!cJSON_IsNumber(index))
    {
    goto end; //Numeric
    }

    // create_chat_completion_response_choices_inner->message
    cJSON *message = cJSON_GetObjectItemCaseSensitive(create_chat_completion_response_choices_innerJSON, "message");
    if (!message) {
        goto end;
    }

    
    message_local_nonprim = chat_completion_response_message_parseFromJSON(message); //nonprimitive

    // create_chat_completion_response_choices_inner->logprobs
    cJSON *logprobs = cJSON_GetObjectItemCaseSensitive(create_chat_completion_response_choices_innerJSON, "logprobs");
    if (!logprobs) {
        goto end;
    }

    
    logprobs_local_nonprim = create_chat_completion_response_choices_inner_logprobs_parseFromJSON(logprobs); //nonprimitive


    create_chat_completion_response_choices_inner_local_var = create_chat_completion_response_choices_inner_create (
        finish_reasonVariable,
        index->valuedouble,
        message_local_nonprim,
        logprobs_local_nonprim
        );

    return create_chat_completion_response_choices_inner_local_var;
end:
    if (message_local_nonprim) {
        chat_completion_response_message_free(message_local_nonprim);
        message_local_nonprim = NULL;
    }
    if (logprobs_local_nonprim) {
        create_chat_completion_response_choices_inner_logprobs_free(logprobs_local_nonprim);
        logprobs_local_nonprim = NULL;
    }
    return NULL;

}
