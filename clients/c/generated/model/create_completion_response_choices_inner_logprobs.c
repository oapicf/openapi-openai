#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_completion_response_choices_inner_logprobs.h"



static create_completion_response_choices_inner_logprobs_t *create_completion_response_choices_inner_logprobs_create_internal(
    list_t *text_offset,
    list_t *token_logprobs,
    list_t *tokens,
    list_t *top_logprobs
    ) {
    create_completion_response_choices_inner_logprobs_t *create_completion_response_choices_inner_logprobs_local_var = malloc(sizeof(create_completion_response_choices_inner_logprobs_t));
    if (!create_completion_response_choices_inner_logprobs_local_var) {
        return NULL;
    }
    create_completion_response_choices_inner_logprobs_local_var->text_offset = text_offset;
    create_completion_response_choices_inner_logprobs_local_var->token_logprobs = token_logprobs;
    create_completion_response_choices_inner_logprobs_local_var->tokens = tokens;
    create_completion_response_choices_inner_logprobs_local_var->top_logprobs = top_logprobs;

    create_completion_response_choices_inner_logprobs_local_var->_library_owned = 1;
    return create_completion_response_choices_inner_logprobs_local_var;
}

__attribute__((deprecated)) create_completion_response_choices_inner_logprobs_t *create_completion_response_choices_inner_logprobs_create(
    list_t *text_offset,
    list_t *token_logprobs,
    list_t *tokens,
    list_t *top_logprobs
    ) {
    return create_completion_response_choices_inner_logprobs_create_internal (
        text_offset,
        token_logprobs,
        tokens,
        top_logprobs
        );
}

void create_completion_response_choices_inner_logprobs_free(create_completion_response_choices_inner_logprobs_t *create_completion_response_choices_inner_logprobs) {
    if(NULL == create_completion_response_choices_inner_logprobs){
        return ;
    }
    if(create_completion_response_choices_inner_logprobs->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "create_completion_response_choices_inner_logprobs_free");
        return ;
    }
    listEntry_t *listEntry;
    if (create_completion_response_choices_inner_logprobs->text_offset) {
        list_ForEach(listEntry, create_completion_response_choices_inner_logprobs->text_offset) {
            free(listEntry->data);
        }
        list_freeList(create_completion_response_choices_inner_logprobs->text_offset);
        create_completion_response_choices_inner_logprobs->text_offset = NULL;
    }
    if (create_completion_response_choices_inner_logprobs->token_logprobs) {
        list_ForEach(listEntry, create_completion_response_choices_inner_logprobs->token_logprobs) {
            free(listEntry->data);
        }
        list_freeList(create_completion_response_choices_inner_logprobs->token_logprobs);
        create_completion_response_choices_inner_logprobs->token_logprobs = NULL;
    }
    if (create_completion_response_choices_inner_logprobs->tokens) {
        list_ForEach(listEntry, create_completion_response_choices_inner_logprobs->tokens) {
            free(listEntry->data);
        }
        list_freeList(create_completion_response_choices_inner_logprobs->tokens);
        create_completion_response_choices_inner_logprobs->tokens = NULL;
    }
    if (create_completion_response_choices_inner_logprobs->top_logprobs) {
        list_ForEach(listEntry, create_completion_response_choices_inner_logprobs->top_logprobs) {
            free(listEntry->data);
        }
        list_freeList(create_completion_response_choices_inner_logprobs->top_logprobs);
        create_completion_response_choices_inner_logprobs->top_logprobs = NULL;
    }
    free(create_completion_response_choices_inner_logprobs);
}

cJSON *create_completion_response_choices_inner_logprobs_convertToJSON(create_completion_response_choices_inner_logprobs_t *create_completion_response_choices_inner_logprobs) {
    cJSON *item = cJSON_CreateObject();

    // create_completion_response_choices_inner_logprobs->text_offset
    if(create_completion_response_choices_inner_logprobs->text_offset) {
    cJSON *text_offset = cJSON_AddArrayToObject(item, "text_offset");
    if(text_offset == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *text_offsetListEntry;
    list_ForEach(text_offsetListEntry, create_completion_response_choices_inner_logprobs->text_offset) {
    if(cJSON_AddNumberToObject(text_offset, "", *(double *)text_offsetListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // create_completion_response_choices_inner_logprobs->token_logprobs
    if(create_completion_response_choices_inner_logprobs->token_logprobs) {
    cJSON *token_logprobs = cJSON_AddArrayToObject(item, "token_logprobs");
    if(token_logprobs == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *token_logprobsListEntry;
    list_ForEach(token_logprobsListEntry, create_completion_response_choices_inner_logprobs->token_logprobs) {
    if(cJSON_AddNumberToObject(token_logprobs, "", *(double *)token_logprobsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // create_completion_response_choices_inner_logprobs->tokens
    if(create_completion_response_choices_inner_logprobs->tokens) {
    cJSON *tokens = cJSON_AddArrayToObject(item, "tokens");
    if(tokens == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *tokensListEntry;
    list_ForEach(tokensListEntry, create_completion_response_choices_inner_logprobs->tokens) {
    if(cJSON_AddStringToObject(tokens, "", tokensListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // create_completion_response_choices_inner_logprobs->top_logprobs
    if(create_completion_response_choices_inner_logprobs->top_logprobs) {
    cJSON *top_logprobs = cJSON_AddArrayToObject(item, "top_logprobs");
    if(top_logprobs == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *top_logprobsListEntry;
    list_ForEach(top_logprobsListEntry, create_completion_response_choices_inner_logprobs->top_logprobs) {
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

create_completion_response_choices_inner_logprobs_t *create_completion_response_choices_inner_logprobs_parseFromJSON(cJSON *create_completion_response_choices_inner_logprobsJSON){

    create_completion_response_choices_inner_logprobs_t *create_completion_response_choices_inner_logprobs_local_var = NULL;

    // define the local list for create_completion_response_choices_inner_logprobs->text_offset
    list_t *text_offsetList = NULL;

    // define the local list for create_completion_response_choices_inner_logprobs->token_logprobs
    list_t *token_logprobsList = NULL;

    // define the local list for create_completion_response_choices_inner_logprobs->tokens
    list_t *tokensList = NULL;

    // define the local list for create_completion_response_choices_inner_logprobs->top_logprobs
    list_t *top_logprobsList = NULL;

    // create_completion_response_choices_inner_logprobs->text_offset
    cJSON *text_offset = cJSON_GetObjectItemCaseSensitive(create_completion_response_choices_inner_logprobsJSON, "text_offset");
    if (cJSON_IsNull(text_offset)) {
        text_offset = NULL;
    }
    if (text_offset) { 
    cJSON *text_offset_local = NULL;
    if(!cJSON_IsArray(text_offset)) {
        goto end;//primitive container
    }
    text_offsetList = list_createList();

    cJSON_ArrayForEach(text_offset_local, text_offset)
    {
        if(!cJSON_IsNumber(text_offset_local))
        {
            goto end;
        }
        double *text_offset_local_value = calloc(1, sizeof(double));
        if(!text_offset_local_value)
        {
            goto end;
        }
        *text_offset_local_value = text_offset_local->valuedouble;
        list_addElement(text_offsetList , text_offset_local_value);
    }
    }

    // create_completion_response_choices_inner_logprobs->token_logprobs
    cJSON *token_logprobs = cJSON_GetObjectItemCaseSensitive(create_completion_response_choices_inner_logprobsJSON, "token_logprobs");
    if (cJSON_IsNull(token_logprobs)) {
        token_logprobs = NULL;
    }
    if (token_logprobs) { 
    cJSON *token_logprobs_local = NULL;
    if(!cJSON_IsArray(token_logprobs)) {
        goto end;//primitive container
    }
    token_logprobsList = list_createList();

    cJSON_ArrayForEach(token_logprobs_local, token_logprobs)
    {
        if(!cJSON_IsNumber(token_logprobs_local))
        {
            goto end;
        }
        double *token_logprobs_local_value = calloc(1, sizeof(double));
        if(!token_logprobs_local_value)
        {
            goto end;
        }
        *token_logprobs_local_value = token_logprobs_local->valuedouble;
        list_addElement(token_logprobsList , token_logprobs_local_value);
    }
    }

    // create_completion_response_choices_inner_logprobs->tokens
    cJSON *tokens = cJSON_GetObjectItemCaseSensitive(create_completion_response_choices_inner_logprobsJSON, "tokens");
    if (cJSON_IsNull(tokens)) {
        tokens = NULL;
    }
    if (tokens) { 
    cJSON *tokens_local = NULL;
    if(!cJSON_IsArray(tokens)) {
        goto end;//primitive container
    }
    tokensList = list_createList();

    cJSON_ArrayForEach(tokens_local, tokens)
    {
        if(!cJSON_IsString(tokens_local))
        {
            goto end;
        }
        list_addElement(tokensList , strdup(tokens_local->valuestring));
    }
    }

    // create_completion_response_choices_inner_logprobs->top_logprobs
    cJSON *top_logprobs = cJSON_GetObjectItemCaseSensitive(create_completion_response_choices_inner_logprobsJSON, "top_logprobs");
    if (cJSON_IsNull(top_logprobs)) {
        top_logprobs = NULL;
    }
    if (top_logprobs) { 
    cJSON *top_logprobs_local = NULL;
    if(!cJSON_IsArray(top_logprobs)) {
        goto end;//primitive container
    }
    top_logprobsList = list_createList();

    cJSON_ArrayForEach(top_logprobs_local, top_logprobs)
    {
    }
    }


    create_completion_response_choices_inner_logprobs_local_var = create_completion_response_choices_inner_logprobs_create_internal (
        text_offset ? text_offsetList : NULL,
        token_logprobs ? token_logprobsList : NULL,
        tokens ? tokensList : NULL,
        top_logprobs ? top_logprobsList : NULL
        );

    return create_completion_response_choices_inner_logprobs_local_var;
end:
    if (text_offsetList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, text_offsetList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(text_offsetList);
        text_offsetList = NULL;
    }
    if (token_logprobsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, token_logprobsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(token_logprobsList);
        token_logprobsList = NULL;
    }
    if (tokensList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, tokensList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(tokensList);
        tokensList = NULL;
    }
    if (top_logprobsList) {
        list_freeList(top_logprobsList);
        top_logprobsList = NULL;
    }
    return NULL;

}
