#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "chat_completion_token_logprob_top_logprobs_inner.h"



static chat_completion_token_logprob_top_logprobs_inner_t *chat_completion_token_logprob_top_logprobs_inner_create_internal(
    char *token,
    double logprob,
    list_t *bytes
    ) {
    chat_completion_token_logprob_top_logprobs_inner_t *chat_completion_token_logprob_top_logprobs_inner_local_var = malloc(sizeof(chat_completion_token_logprob_top_logprobs_inner_t));
    if (!chat_completion_token_logprob_top_logprobs_inner_local_var) {
        return NULL;
    }
    chat_completion_token_logprob_top_logprobs_inner_local_var->token = token;
    chat_completion_token_logprob_top_logprobs_inner_local_var->logprob = logprob;
    chat_completion_token_logprob_top_logprobs_inner_local_var->bytes = bytes;

    chat_completion_token_logprob_top_logprobs_inner_local_var->_library_owned = 1;
    return chat_completion_token_logprob_top_logprobs_inner_local_var;
}

__attribute__((deprecated)) chat_completion_token_logprob_top_logprobs_inner_t *chat_completion_token_logprob_top_logprobs_inner_create(
    char *token,
    double logprob,
    list_t *bytes
    ) {
    return chat_completion_token_logprob_top_logprobs_inner_create_internal (
        token,
        logprob,
        bytes
        );
}

void chat_completion_token_logprob_top_logprobs_inner_free(chat_completion_token_logprob_top_logprobs_inner_t *chat_completion_token_logprob_top_logprobs_inner) {
    if(NULL == chat_completion_token_logprob_top_logprobs_inner){
        return ;
    }
    if(chat_completion_token_logprob_top_logprobs_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "chat_completion_token_logprob_top_logprobs_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (chat_completion_token_logprob_top_logprobs_inner->token) {
        free(chat_completion_token_logprob_top_logprobs_inner->token);
        chat_completion_token_logprob_top_logprobs_inner->token = NULL;
    }
    if (chat_completion_token_logprob_top_logprobs_inner->bytes) {
        list_ForEach(listEntry, chat_completion_token_logprob_top_logprobs_inner->bytes) {
            free(listEntry->data);
        }
        list_freeList(chat_completion_token_logprob_top_logprobs_inner->bytes);
        chat_completion_token_logprob_top_logprobs_inner->bytes = NULL;
    }
    free(chat_completion_token_logprob_top_logprobs_inner);
}

cJSON *chat_completion_token_logprob_top_logprobs_inner_convertToJSON(chat_completion_token_logprob_top_logprobs_inner_t *chat_completion_token_logprob_top_logprobs_inner) {
    cJSON *item = cJSON_CreateObject();

    // chat_completion_token_logprob_top_logprobs_inner->token
    if (!chat_completion_token_logprob_top_logprobs_inner->token) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "token", chat_completion_token_logprob_top_logprobs_inner->token) == NULL) {
    goto fail; //String
    }


    // chat_completion_token_logprob_top_logprobs_inner->logprob
    if (!chat_completion_token_logprob_top_logprobs_inner->logprob) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "logprob", chat_completion_token_logprob_top_logprobs_inner->logprob) == NULL) {
    goto fail; //Numeric
    }


    // chat_completion_token_logprob_top_logprobs_inner->bytes
    if (!chat_completion_token_logprob_top_logprobs_inner->bytes) {
        goto fail;
    }
    cJSON *bytes = cJSON_AddArrayToObject(item, "bytes");
    if(bytes == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *bytesListEntry;
    list_ForEach(bytesListEntry, chat_completion_token_logprob_top_logprobs_inner->bytes) {
    if(cJSON_AddNumberToObject(bytes, "", *(double *)bytesListEntry->data) == NULL)
    {
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

chat_completion_token_logprob_top_logprobs_inner_t *chat_completion_token_logprob_top_logprobs_inner_parseFromJSON(cJSON *chat_completion_token_logprob_top_logprobs_innerJSON){

    chat_completion_token_logprob_top_logprobs_inner_t *chat_completion_token_logprob_top_logprobs_inner_local_var = NULL;

    // define the local list for chat_completion_token_logprob_top_logprobs_inner->bytes
    list_t *bytesList = NULL;

    // chat_completion_token_logprob_top_logprobs_inner->token
    cJSON *token = cJSON_GetObjectItemCaseSensitive(chat_completion_token_logprob_top_logprobs_innerJSON, "token");
    if (cJSON_IsNull(token)) {
        token = NULL;
    }
    if (!token) {
        goto end;
    }

    
    if(!cJSON_IsString(token))
    {
    goto end; //String
    }

    // chat_completion_token_logprob_top_logprobs_inner->logprob
    cJSON *logprob = cJSON_GetObjectItemCaseSensitive(chat_completion_token_logprob_top_logprobs_innerJSON, "logprob");
    if (cJSON_IsNull(logprob)) {
        logprob = NULL;
    }
    if (!logprob) {
        goto end;
    }

    
    if(!cJSON_IsNumber(logprob))
    {
    goto end; //Numeric
    }

    // chat_completion_token_logprob_top_logprobs_inner->bytes
    cJSON *bytes = cJSON_GetObjectItemCaseSensitive(chat_completion_token_logprob_top_logprobs_innerJSON, "bytes");
    if (cJSON_IsNull(bytes)) {
        bytes = NULL;
    }
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
        double *bytes_local_value = calloc(1, sizeof(double));
        if(!bytes_local_value)
        {
            goto end;
        }
        *bytes_local_value = bytes_local->valuedouble;
        list_addElement(bytesList , bytes_local_value);
    }


    chat_completion_token_logprob_top_logprobs_inner_local_var = chat_completion_token_logprob_top_logprobs_inner_create_internal (
        strdup(token->valuestring),
        logprob->valuedouble,
        bytesList
        );

    return chat_completion_token_logprob_top_logprobs_inner_local_var;
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
    return NULL;

}
