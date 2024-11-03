#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "chat_completion_token_logprob.h"



chat_completion_token_logprob_t *chat_completion_token_logprob_create(
    char *token,
    double logprob,
    list_t *bytes,
    list_t *top_logprobs
    ) {
    chat_completion_token_logprob_t *chat_completion_token_logprob_local_var = malloc(sizeof(chat_completion_token_logprob_t));
    if (!chat_completion_token_logprob_local_var) {
        return NULL;
    }
    chat_completion_token_logprob_local_var->token = token;
    chat_completion_token_logprob_local_var->logprob = logprob;
    chat_completion_token_logprob_local_var->bytes = bytes;
    chat_completion_token_logprob_local_var->top_logprobs = top_logprobs;

    return chat_completion_token_logprob_local_var;
}


void chat_completion_token_logprob_free(chat_completion_token_logprob_t *chat_completion_token_logprob) {
    if(NULL == chat_completion_token_logprob){
        return ;
    }
    listEntry_t *listEntry;
    if (chat_completion_token_logprob->token) {
        free(chat_completion_token_logprob->token);
        chat_completion_token_logprob->token = NULL;
    }
    if (chat_completion_token_logprob->bytes) {
        list_ForEach(listEntry, chat_completion_token_logprob->bytes) {
            free(listEntry->data);
        }
        list_freeList(chat_completion_token_logprob->bytes);
        chat_completion_token_logprob->bytes = NULL;
    }
    if (chat_completion_token_logprob->top_logprobs) {
        list_ForEach(listEntry, chat_completion_token_logprob->top_logprobs) {
            chat_completion_token_logprob_top_logprobs_inner_free(listEntry->data);
        }
        list_freeList(chat_completion_token_logprob->top_logprobs);
        chat_completion_token_logprob->top_logprobs = NULL;
    }
    free(chat_completion_token_logprob);
}

cJSON *chat_completion_token_logprob_convertToJSON(chat_completion_token_logprob_t *chat_completion_token_logprob) {
    cJSON *item = cJSON_CreateObject();

    // chat_completion_token_logprob->token
    if (!chat_completion_token_logprob->token) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "token", chat_completion_token_logprob->token) == NULL) {
    goto fail; //String
    }


    // chat_completion_token_logprob->logprob
    if (!chat_completion_token_logprob->logprob) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "logprob", chat_completion_token_logprob->logprob) == NULL) {
    goto fail; //Numeric
    }


    // chat_completion_token_logprob->bytes
    if (!chat_completion_token_logprob->bytes) {
        goto fail;
    }
    cJSON *bytes = cJSON_AddArrayToObject(item, "bytes");
    if(bytes == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *bytesListEntry;
    list_ForEach(bytesListEntry, chat_completion_token_logprob->bytes) {
    if(cJSON_AddNumberToObject(bytes, "", *(double *)bytesListEntry->data) == NULL)
    {
        goto fail;
    }
    }


    // chat_completion_token_logprob->top_logprobs
    if (!chat_completion_token_logprob->top_logprobs) {
        goto fail;
    }
    cJSON *top_logprobs = cJSON_AddArrayToObject(item, "top_logprobs");
    if(top_logprobs == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *top_logprobsListEntry;
    if (chat_completion_token_logprob->top_logprobs) {
    list_ForEach(top_logprobsListEntry, chat_completion_token_logprob->top_logprobs) {
    cJSON *itemLocal = chat_completion_token_logprob_top_logprobs_inner_convertToJSON(top_logprobsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(top_logprobs, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

chat_completion_token_logprob_t *chat_completion_token_logprob_parseFromJSON(cJSON *chat_completion_token_logprobJSON){

    chat_completion_token_logprob_t *chat_completion_token_logprob_local_var = NULL;

    // define the local list for chat_completion_token_logprob->bytes
    list_t *bytesList = NULL;

    // define the local list for chat_completion_token_logprob->top_logprobs
    list_t *top_logprobsList = NULL;

    // chat_completion_token_logprob->token
    cJSON *token = cJSON_GetObjectItemCaseSensitive(chat_completion_token_logprobJSON, "token");
    if (!token) {
        goto end;
    }

    
    if(!cJSON_IsString(token))
    {
    goto end; //String
    }

    // chat_completion_token_logprob->logprob
    cJSON *logprob = cJSON_GetObjectItemCaseSensitive(chat_completion_token_logprobJSON, "logprob");
    if (!logprob) {
        goto end;
    }

    
    if(!cJSON_IsNumber(logprob))
    {
    goto end; //Numeric
    }

    // chat_completion_token_logprob->bytes
    cJSON *bytes = cJSON_GetObjectItemCaseSensitive(chat_completion_token_logprobJSON, "bytes");
    if (!bytes) {
        goto end;
    }

    
    cJSON *bytes_local = NULL;
    if(!cJSON_IsArray(bytes)) {
        goto end;//primitive container
    }
    bytesList = list_createList();

    cJSON_ArrayForEach(bytes_local, bytes)
    {
        if(!cJSON_IsNumber(bytes_local))
        {
            goto end;
        }
        double *bytes_local_value = (double *)calloc(1, sizeof(double));
        if(!bytes_local_value)
        {
            goto end;
        }
        *bytes_local_value = bytes_local->valuedouble;
        list_addElement(bytesList , bytes_local_value);
    }

    // chat_completion_token_logprob->top_logprobs
    cJSON *top_logprobs = cJSON_GetObjectItemCaseSensitive(chat_completion_token_logprobJSON, "top_logprobs");
    if (!top_logprobs) {
        goto end;
    }

    
    cJSON *top_logprobs_local_nonprimitive = NULL;
    if(!cJSON_IsArray(top_logprobs)){
        goto end; //nonprimitive container
    }

    top_logprobsList = list_createList();

    cJSON_ArrayForEach(top_logprobs_local_nonprimitive,top_logprobs )
    {
        if(!cJSON_IsObject(top_logprobs_local_nonprimitive)){
            goto end;
        }
        chat_completion_token_logprob_top_logprobs_inner_t *top_logprobsItem = chat_completion_token_logprob_top_logprobs_inner_parseFromJSON(top_logprobs_local_nonprimitive);

        list_addElement(top_logprobsList, top_logprobsItem);
    }


    chat_completion_token_logprob_local_var = chat_completion_token_logprob_create (
        strdup(token->valuestring),
        logprob->valuedouble,
        bytesList,
        top_logprobsList
        );

    return chat_completion_token_logprob_local_var;
end:
    if (bytesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, bytesList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(bytesList);
        bytesList = NULL;
    }
    if (top_logprobsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, top_logprobsList) {
            chat_completion_token_logprob_top_logprobs_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(top_logprobsList);
        top_logprobsList = NULL;
    }
    return NULL;

}
