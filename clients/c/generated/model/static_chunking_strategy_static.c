#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "static_chunking_strategy_static.h"



static static_chunking_strategy_static_t *static_chunking_strategy_static_create_internal(
    int *max_chunk_size_tokens,
    int *chunk_overlap_tokens
    ) {
    static_chunking_strategy_static_t *static_chunking_strategy_static_local_var = malloc(sizeof(static_chunking_strategy_static_t));
    if (!static_chunking_strategy_static_local_var) {
        return NULL;
    }
    memset(static_chunking_strategy_static_local_var, 0, sizeof(static_chunking_strategy_static_t));
    static_chunking_strategy_static_local_var->_library_owned = 1;
    static_chunking_strategy_static_local_var->max_chunk_size_tokens = max_chunk_size_tokens;
    static_chunking_strategy_static_local_var->chunk_overlap_tokens = chunk_overlap_tokens;
    return static_chunking_strategy_static_local_var;
}

__attribute__((deprecated)) static_chunking_strategy_static_t *static_chunking_strategy_static_create(
    int *max_chunk_size_tokens,
    int *chunk_overlap_tokens
    ) {
    int *max_chunk_size_tokens_copy = NULL;
    if (max_chunk_size_tokens) {
        max_chunk_size_tokens_copy = malloc(sizeof(int));
        if (max_chunk_size_tokens_copy) *max_chunk_size_tokens_copy = *max_chunk_size_tokens;
    }
    int *chunk_overlap_tokens_copy = NULL;
    if (chunk_overlap_tokens) {
        chunk_overlap_tokens_copy = malloc(sizeof(int));
        if (chunk_overlap_tokens_copy) *chunk_overlap_tokens_copy = *chunk_overlap_tokens;
    }
    static_chunking_strategy_static_t *result = static_chunking_strategy_static_create_internal (
        max_chunk_size_tokens_copy,
        chunk_overlap_tokens_copy
        );
    if (!result) {
        free(max_chunk_size_tokens_copy);
        free(chunk_overlap_tokens_copy);
    }
    return result;
}

void static_chunking_strategy_static_free(static_chunking_strategy_static_t *static_chunking_strategy_static) {
    if(NULL == static_chunking_strategy_static){
        return ;
    }
    if(static_chunking_strategy_static->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "static_chunking_strategy_static_free");
        return ;
    }
    listEntry_t *listEntry;
    if (static_chunking_strategy_static->max_chunk_size_tokens) {
        free(static_chunking_strategy_static->max_chunk_size_tokens);
        static_chunking_strategy_static->max_chunk_size_tokens = NULL;
    }
    if (static_chunking_strategy_static->chunk_overlap_tokens) {
        free(static_chunking_strategy_static->chunk_overlap_tokens);
        static_chunking_strategy_static->chunk_overlap_tokens = NULL;
    }
    free(static_chunking_strategy_static);
}

cJSON *static_chunking_strategy_static_convertToJSON(static_chunking_strategy_static_t *static_chunking_strategy_static) {
    cJSON *item = cJSON_CreateObject();

    // static_chunking_strategy_static->max_chunk_size_tokens
    if (!static_chunking_strategy_static->max_chunk_size_tokens) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "max_chunk_size_tokens", *static_chunking_strategy_static->max_chunk_size_tokens) == NULL) {
    goto fail; //Numeric
    }


    // static_chunking_strategy_static->chunk_overlap_tokens
    if (!static_chunking_strategy_static->chunk_overlap_tokens) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "chunk_overlap_tokens", *static_chunking_strategy_static->chunk_overlap_tokens) == NULL) {
    goto fail; //Numeric
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

static_chunking_strategy_static_t *static_chunking_strategy_static_parseFromJSON(cJSON *static_chunking_strategy_staticJSON){

    static_chunking_strategy_static_t *static_chunking_strategy_static_local_var = NULL;

    // define the local variable for static_chunking_strategy_static->max_chunk_size_tokens
    int *max_chunk_size_tokens_local_var = NULL;

    // define the local variable for static_chunking_strategy_static->chunk_overlap_tokens
    int *chunk_overlap_tokens_local_var = NULL;

    // static_chunking_strategy_static->max_chunk_size_tokens
    cJSON *max_chunk_size_tokens = cJSON_GetObjectItemCaseSensitive(static_chunking_strategy_staticJSON, "max_chunk_size_tokens");
    if (cJSON_IsNull(max_chunk_size_tokens)) {
        max_chunk_size_tokens = NULL;
    }
    if (!max_chunk_size_tokens) {
        goto end;
    }

    
    if(!cJSON_IsNumber(max_chunk_size_tokens))
    {
    goto end; //Numeric
    }
    max_chunk_size_tokens_local_var = malloc(sizeof(int));
    if(!max_chunk_size_tokens_local_var)
    {
        goto end;
    }
    *max_chunk_size_tokens_local_var = max_chunk_size_tokens->valuedouble;

    // static_chunking_strategy_static->chunk_overlap_tokens
    cJSON *chunk_overlap_tokens = cJSON_GetObjectItemCaseSensitive(static_chunking_strategy_staticJSON, "chunk_overlap_tokens");
    if (cJSON_IsNull(chunk_overlap_tokens)) {
        chunk_overlap_tokens = NULL;
    }
    if (!chunk_overlap_tokens) {
        goto end;
    }

    
    if(!cJSON_IsNumber(chunk_overlap_tokens))
    {
    goto end; //Numeric
    }
    chunk_overlap_tokens_local_var = malloc(sizeof(int));
    if(!chunk_overlap_tokens_local_var)
    {
        goto end;
    }
    *chunk_overlap_tokens_local_var = chunk_overlap_tokens->valuedouble;



    static_chunking_strategy_static_local_var = static_chunking_strategy_static_create_internal (
        max_chunk_size_tokens_local_var,
        chunk_overlap_tokens_local_var
        );

    if (!static_chunking_strategy_static_local_var) {
        goto end;
    }

    return static_chunking_strategy_static_local_var;
end:
    if (max_chunk_size_tokens_local_var) {
        free(max_chunk_size_tokens_local_var);
        max_chunk_size_tokens_local_var = NULL;
    }
    if (chunk_overlap_tokens_local_var) {
        free(chunk_overlap_tokens_local_var);
        chunk_overlap_tokens_local_var = NULL;
    }
    return NULL;

}
