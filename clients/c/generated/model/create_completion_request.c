#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_completion_request.h"



static create_completion_request_t *create_completion_request_create_internal(
    create_completion_request_model_t *model,
    create_completion_request_prompt_t *prompt,
    int best_of,
    int echo,
    double frequency_penalty,
    list_t* logit_bias,
    int logprobs,
    int max_tokens,
    int n,
    double presence_penalty,
    int seed,
    create_completion_request_stop_t *stop,
    int stream,
    char *suffix,
    double temperature,
    double top_p,
    char *user
    ) {
    create_completion_request_t *create_completion_request_local_var = malloc(sizeof(create_completion_request_t));
    if (!create_completion_request_local_var) {
        return NULL;
    }
    create_completion_request_local_var->model = model;
    create_completion_request_local_var->prompt = prompt;
    create_completion_request_local_var->best_of = best_of;
    create_completion_request_local_var->echo = echo;
    create_completion_request_local_var->frequency_penalty = frequency_penalty;
    create_completion_request_local_var->logit_bias = logit_bias;
    create_completion_request_local_var->logprobs = logprobs;
    create_completion_request_local_var->max_tokens = max_tokens;
    create_completion_request_local_var->n = n;
    create_completion_request_local_var->presence_penalty = presence_penalty;
    create_completion_request_local_var->seed = seed;
    create_completion_request_local_var->stop = stop;
    create_completion_request_local_var->stream = stream;
    create_completion_request_local_var->suffix = suffix;
    create_completion_request_local_var->temperature = temperature;
    create_completion_request_local_var->top_p = top_p;
    create_completion_request_local_var->user = user;

    create_completion_request_local_var->_library_owned = 1;
    return create_completion_request_local_var;
}

__attribute__((deprecated)) create_completion_request_t *create_completion_request_create(
    create_completion_request_model_t *model,
    create_completion_request_prompt_t *prompt,
    int best_of,
    int echo,
    double frequency_penalty,
    list_t* logit_bias,
    int logprobs,
    int max_tokens,
    int n,
    double presence_penalty,
    int seed,
    create_completion_request_stop_t *stop,
    int stream,
    char *suffix,
    double temperature,
    double top_p,
    char *user
    ) {
    return create_completion_request_create_internal (
        model,
        prompt,
        best_of,
        echo,
        frequency_penalty,
        logit_bias,
        logprobs,
        max_tokens,
        n,
        presence_penalty,
        seed,
        stop,
        stream,
        suffix,
        temperature,
        top_p,
        user
        );
}

void create_completion_request_free(create_completion_request_t *create_completion_request) {
    if(NULL == create_completion_request){
        return ;
    }
    if(create_completion_request->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "create_completion_request_free");
        return ;
    }
    listEntry_t *listEntry;
    if (create_completion_request->model) {
        create_completion_request_model_free(create_completion_request->model);
        create_completion_request->model = NULL;
    }
    if (create_completion_request->prompt) {
        create_completion_request_prompt_free(create_completion_request->prompt);
        create_completion_request->prompt = NULL;
    }
    if (create_completion_request->logit_bias) {
        list_ForEach(listEntry, create_completion_request->logit_bias) {
            keyValuePair_t *localKeyValue = listEntry->data;
            free (localKeyValue->key);
            free (localKeyValue->value);
            keyValuePair_free(localKeyValue);
        }
        list_freeList(create_completion_request->logit_bias);
        create_completion_request->logit_bias = NULL;
    }
    if (create_completion_request->stop) {
        create_completion_request_stop_free(create_completion_request->stop);
        create_completion_request->stop = NULL;
    }
    if (create_completion_request->suffix) {
        free(create_completion_request->suffix);
        create_completion_request->suffix = NULL;
    }
    if (create_completion_request->user) {
        free(create_completion_request->user);
        create_completion_request->user = NULL;
    }
    free(create_completion_request);
}

cJSON *create_completion_request_convertToJSON(create_completion_request_t *create_completion_request) {
    cJSON *item = cJSON_CreateObject();

    // create_completion_request->model
    if (!create_completion_request->model) {
        goto fail;
    }
    cJSON *model_local_JSON = create_completion_request_model_convertToJSON(create_completion_request->model);
    if(model_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "model", model_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // create_completion_request->prompt
    if (!create_completion_request->prompt) {
        goto fail;
    }
    cJSON *prompt_local_JSON = create_completion_request_prompt_convertToJSON(create_completion_request->prompt);
    if(prompt_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "prompt", prompt_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // create_completion_request->best_of
    if(create_completion_request->best_of) {
    if(cJSON_AddNumberToObject(item, "best_of", create_completion_request->best_of) == NULL) {
    goto fail; //Numeric
    }
    }


    // create_completion_request->echo
    if(create_completion_request->echo) {
    if(cJSON_AddBoolToObject(item, "echo", create_completion_request->echo) == NULL) {
    goto fail; //Bool
    }
    }


    // create_completion_request->frequency_penalty
    if(create_completion_request->frequency_penalty) {
    if(cJSON_AddNumberToObject(item, "frequency_penalty", create_completion_request->frequency_penalty) == NULL) {
    goto fail; //Numeric
    }
    }


    // create_completion_request->logit_bias
    if(create_completion_request->logit_bias) {
    cJSON *logit_bias = cJSON_AddObjectToObject(item, "logit_bias");
    if(logit_bias == NULL) {
        goto fail; //primitive map container
    }
    cJSON *localMapObject = logit_bias;
    listEntry_t *logit_biasListEntry;
    if (create_completion_request->logit_bias) {
    list_ForEach(logit_biasListEntry, create_completion_request->logit_bias) {
        keyValuePair_t *localKeyValue = logit_biasListEntry->data;
        if(cJSON_AddNumberToObject(localMapObject, localKeyValue->key, *(double *)localKeyValue->value) == NULL)
        {
            goto fail;
        }
    }
    }
    }


    // create_completion_request->logprobs
    if(create_completion_request->logprobs) {
    if(cJSON_AddNumberToObject(item, "logprobs", create_completion_request->logprobs) == NULL) {
    goto fail; //Numeric
    }
    }


    // create_completion_request->max_tokens
    if(create_completion_request->max_tokens) {
    if(cJSON_AddNumberToObject(item, "max_tokens", create_completion_request->max_tokens) == NULL) {
    goto fail; //Numeric
    }
    }


    // create_completion_request->n
    if(create_completion_request->n) {
    if(cJSON_AddNumberToObject(item, "n", create_completion_request->n) == NULL) {
    goto fail; //Numeric
    }
    }


    // create_completion_request->presence_penalty
    if(create_completion_request->presence_penalty) {
    if(cJSON_AddNumberToObject(item, "presence_penalty", create_completion_request->presence_penalty) == NULL) {
    goto fail; //Numeric
    }
    }


    // create_completion_request->seed
    if(create_completion_request->seed) {
    if(cJSON_AddNumberToObject(item, "seed", create_completion_request->seed) == NULL) {
    goto fail; //Numeric
    }
    }


    // create_completion_request->stop
    if(create_completion_request->stop) {
    cJSON *stop_local_JSON = create_completion_request_stop_convertToJSON(create_completion_request->stop);
    if(stop_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "stop", stop_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // create_completion_request->stream
    if(create_completion_request->stream) {
    if(cJSON_AddBoolToObject(item, "stream", create_completion_request->stream) == NULL) {
    goto fail; //Bool
    }
    }


    // create_completion_request->suffix
    if(create_completion_request->suffix) {
    if(cJSON_AddStringToObject(item, "suffix", create_completion_request->suffix) == NULL) {
    goto fail; //String
    }
    }


    // create_completion_request->temperature
    if(create_completion_request->temperature) {
    if(cJSON_AddNumberToObject(item, "temperature", create_completion_request->temperature) == NULL) {
    goto fail; //Numeric
    }
    }


    // create_completion_request->top_p
    if(create_completion_request->top_p) {
    if(cJSON_AddNumberToObject(item, "top_p", create_completion_request->top_p) == NULL) {
    goto fail; //Numeric
    }
    }


    // create_completion_request->user
    if(create_completion_request->user) {
    if(cJSON_AddStringToObject(item, "user", create_completion_request->user) == NULL) {
    goto fail; //String
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

create_completion_request_t *create_completion_request_parseFromJSON(cJSON *create_completion_requestJSON){

    create_completion_request_t *create_completion_request_local_var = NULL;

    // define the local variable for create_completion_request->model
    create_completion_request_model_t *model_local_nonprim = NULL;

    // define the local variable for create_completion_request->prompt
    create_completion_request_prompt_t *prompt_local_nonprim = NULL;

    // define the local map for create_completion_request->logit_bias
    list_t *logit_biasList = NULL;

    // define the local variable for create_completion_request->stop
    create_completion_request_stop_t *stop_local_nonprim = NULL;

    // create_completion_request->model
    cJSON *model = cJSON_GetObjectItemCaseSensitive(create_completion_requestJSON, "model");
    if (cJSON_IsNull(model)) {
        model = NULL;
    }
    if (!model) {
        goto end;
    }

    
    model_local_nonprim = create_completion_request_model_parseFromJSON(model); //nonprimitive

    // create_completion_request->prompt
    cJSON *prompt = cJSON_GetObjectItemCaseSensitive(create_completion_requestJSON, "prompt");
    if (cJSON_IsNull(prompt)) {
        prompt = NULL;
    }
    if (!prompt) {
        goto end;
    }

    
    prompt_local_nonprim = create_completion_request_prompt_parseFromJSON(prompt); //nonprimitive

    // create_completion_request->best_of
    cJSON *best_of = cJSON_GetObjectItemCaseSensitive(create_completion_requestJSON, "best_of");
    if (cJSON_IsNull(best_of)) {
        best_of = NULL;
    }
    if (best_of) { 
    if(!cJSON_IsNumber(best_of))
    {
    goto end; //Numeric
    }
    }

    // create_completion_request->echo
    cJSON *echo = cJSON_GetObjectItemCaseSensitive(create_completion_requestJSON, "echo");
    if (cJSON_IsNull(echo)) {
        echo = NULL;
    }
    if (echo) { 
    if(!cJSON_IsBool(echo))
    {
    goto end; //Bool
    }
    }

    // create_completion_request->frequency_penalty
    cJSON *frequency_penalty = cJSON_GetObjectItemCaseSensitive(create_completion_requestJSON, "frequency_penalty");
    if (cJSON_IsNull(frequency_penalty)) {
        frequency_penalty = NULL;
    }
    if (frequency_penalty) { 
    if(!cJSON_IsNumber(frequency_penalty))
    {
    goto end; //Numeric
    }
    }

    // create_completion_request->logit_bias
    cJSON *logit_bias = cJSON_GetObjectItemCaseSensitive(create_completion_requestJSON, "logit_bias");
    if (cJSON_IsNull(logit_bias)) {
        logit_bias = NULL;
    }
    if (logit_bias) { 
    cJSON *logit_bias_local_map = NULL;
    if(!cJSON_IsObject(logit_bias) && !cJSON_IsNull(logit_bias))
    {
        goto end;//primitive map container
    }
    if(cJSON_IsObject(logit_bias))
    {
        logit_biasList = list_createList();
        keyValuePair_t *localMapKeyPair;
        cJSON_ArrayForEach(logit_bias_local_map, logit_bias)
        {
            cJSON *localMapObject = logit_bias_local_map;
            if(!cJSON_IsNumber(localMapObject))
            {
                goto end;
            }
            localMapKeyPair = keyValuePair_create(strdup(localMapObject->string),&localMapObject->valuedouble );
            list_addElement(logit_biasList , localMapKeyPair);
        }
    }
    }

    // create_completion_request->logprobs
    cJSON *logprobs = cJSON_GetObjectItemCaseSensitive(create_completion_requestJSON, "logprobs");
    if (cJSON_IsNull(logprobs)) {
        logprobs = NULL;
    }
    if (logprobs) { 
    if(!cJSON_IsNumber(logprobs))
    {
    goto end; //Numeric
    }
    }

    // create_completion_request->max_tokens
    cJSON *max_tokens = cJSON_GetObjectItemCaseSensitive(create_completion_requestJSON, "max_tokens");
    if (cJSON_IsNull(max_tokens)) {
        max_tokens = NULL;
    }
    if (max_tokens) { 
    if(!cJSON_IsNumber(max_tokens))
    {
    goto end; //Numeric
    }
    }

    // create_completion_request->n
    cJSON *n = cJSON_GetObjectItemCaseSensitive(create_completion_requestJSON, "n");
    if (cJSON_IsNull(n)) {
        n = NULL;
    }
    if (n) { 
    if(!cJSON_IsNumber(n))
    {
    goto end; //Numeric
    }
    }

    // create_completion_request->presence_penalty
    cJSON *presence_penalty = cJSON_GetObjectItemCaseSensitive(create_completion_requestJSON, "presence_penalty");
    if (cJSON_IsNull(presence_penalty)) {
        presence_penalty = NULL;
    }
    if (presence_penalty) { 
    if(!cJSON_IsNumber(presence_penalty))
    {
    goto end; //Numeric
    }
    }

    // create_completion_request->seed
    cJSON *seed = cJSON_GetObjectItemCaseSensitive(create_completion_requestJSON, "seed");
    if (cJSON_IsNull(seed)) {
        seed = NULL;
    }
    if (seed) { 
    if(!cJSON_IsNumber(seed))
    {
    goto end; //Numeric
    }
    }

    // create_completion_request->stop
    cJSON *stop = cJSON_GetObjectItemCaseSensitive(create_completion_requestJSON, "stop");
    if (cJSON_IsNull(stop)) {
        stop = NULL;
    }
    if (stop) { 
    stop_local_nonprim = create_completion_request_stop_parseFromJSON(stop); //nonprimitive
    }

    // create_completion_request->stream
    cJSON *stream = cJSON_GetObjectItemCaseSensitive(create_completion_requestJSON, "stream");
    if (cJSON_IsNull(stream)) {
        stream = NULL;
    }
    if (stream) { 
    if(!cJSON_IsBool(stream))
    {
    goto end; //Bool
    }
    }

    // create_completion_request->suffix
    cJSON *suffix = cJSON_GetObjectItemCaseSensitive(create_completion_requestJSON, "suffix");
    if (cJSON_IsNull(suffix)) {
        suffix = NULL;
    }
    if (suffix) { 
    if(!cJSON_IsString(suffix) && !cJSON_IsNull(suffix))
    {
    goto end; //String
    }
    }

    // create_completion_request->temperature
    cJSON *temperature = cJSON_GetObjectItemCaseSensitive(create_completion_requestJSON, "temperature");
    if (cJSON_IsNull(temperature)) {
        temperature = NULL;
    }
    if (temperature) { 
    if(!cJSON_IsNumber(temperature))
    {
    goto end; //Numeric
    }
    }

    // create_completion_request->top_p
    cJSON *top_p = cJSON_GetObjectItemCaseSensitive(create_completion_requestJSON, "top_p");
    if (cJSON_IsNull(top_p)) {
        top_p = NULL;
    }
    if (top_p) { 
    if(!cJSON_IsNumber(top_p))
    {
    goto end; //Numeric
    }
    }

    // create_completion_request->user
    cJSON *user = cJSON_GetObjectItemCaseSensitive(create_completion_requestJSON, "user");
    if (cJSON_IsNull(user)) {
        user = NULL;
    }
    if (user) { 
    if(!cJSON_IsString(user) && !cJSON_IsNull(user))
    {
    goto end; //String
    }
    }


    create_completion_request_local_var = create_completion_request_create_internal (
        model_local_nonprim,
        prompt_local_nonprim,
        best_of ? best_of->valuedouble : 0,
        echo ? echo->valueint : 0,
        frequency_penalty ? frequency_penalty->valuedouble : 0,
        logit_bias ? logit_biasList : NULL,
        logprobs ? logprobs->valuedouble : 0,
        max_tokens ? max_tokens->valuedouble : 0,
        n ? n->valuedouble : 0,
        presence_penalty ? presence_penalty->valuedouble : 0,
        seed ? seed->valuedouble : 0,
        stop ? stop_local_nonprim : NULL,
        stream ? stream->valueint : 0,
        suffix && !cJSON_IsNull(suffix) ? strdup(suffix->valuestring) : NULL,
        temperature ? temperature->valuedouble : 0,
        top_p ? top_p->valuedouble : 0,
        user && !cJSON_IsNull(user) ? strdup(user->valuestring) : NULL
        );

    return create_completion_request_local_var;
end:
    if (model_local_nonprim) {
        create_completion_request_model_free(model_local_nonprim);
        model_local_nonprim = NULL;
    }
    if (prompt_local_nonprim) {
        create_completion_request_prompt_free(prompt_local_nonprim);
        prompt_local_nonprim = NULL;
    }
    if (logit_biasList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, logit_biasList) {
            keyValuePair_t *localKeyValue = listEntry->data;
            free(localKeyValue->key);
            localKeyValue->key = NULL;
            keyValuePair_free(localKeyValue);
            localKeyValue = NULL;
        }
        list_freeList(logit_biasList);
        logit_biasList = NULL;
    }
    if (stop_local_nonprim) {
        create_completion_request_stop_free(stop_local_nonprim);
        stop_local_nonprim = NULL;
    }
    return NULL;

}
