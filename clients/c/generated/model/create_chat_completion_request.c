#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_chat_completion_request.h"



create_chat_completion_request_t *create_chat_completion_request_create(
    create_chat_completion_request_model_t *model,
    list_t *messages,
    list_t *functions,
    create_chat_completion_request_function_call_t *function_call,
    double temperature,
    double top_p,
    int n,
    int stream,
    create_chat_completion_request_stop_t *stop,
    int max_tokens,
    double presence_penalty,
    double frequency_penalty,
    object_t *logit_bias,
    char *user
    ) {
    create_chat_completion_request_t *create_chat_completion_request_local_var = malloc(sizeof(create_chat_completion_request_t));
    if (!create_chat_completion_request_local_var) {
        return NULL;
    }
    create_chat_completion_request_local_var->model = model;
    create_chat_completion_request_local_var->messages = messages;
    create_chat_completion_request_local_var->functions = functions;
    create_chat_completion_request_local_var->function_call = function_call;
    create_chat_completion_request_local_var->temperature = temperature;
    create_chat_completion_request_local_var->top_p = top_p;
    create_chat_completion_request_local_var->n = n;
    create_chat_completion_request_local_var->stream = stream;
    create_chat_completion_request_local_var->stop = stop;
    create_chat_completion_request_local_var->max_tokens = max_tokens;
    create_chat_completion_request_local_var->presence_penalty = presence_penalty;
    create_chat_completion_request_local_var->frequency_penalty = frequency_penalty;
    create_chat_completion_request_local_var->logit_bias = logit_bias;
    create_chat_completion_request_local_var->user = user;

    return create_chat_completion_request_local_var;
}


void create_chat_completion_request_free(create_chat_completion_request_t *create_chat_completion_request) {
    if(NULL == create_chat_completion_request){
        return ;
    }
    listEntry_t *listEntry;
    if (create_chat_completion_request->model) {
        create_chat_completion_request_model_free(create_chat_completion_request->model);
        create_chat_completion_request->model = NULL;
    }
    if (create_chat_completion_request->messages) {
        list_ForEach(listEntry, create_chat_completion_request->messages) {
            chat_completion_request_message_free(listEntry->data);
        }
        list_freeList(create_chat_completion_request->messages);
        create_chat_completion_request->messages = NULL;
    }
    if (create_chat_completion_request->functions) {
        list_ForEach(listEntry, create_chat_completion_request->functions) {
            chat_completion_functions_free(listEntry->data);
        }
        list_freeList(create_chat_completion_request->functions);
        create_chat_completion_request->functions = NULL;
    }
    if (create_chat_completion_request->function_call) {
        create_chat_completion_request_function_call_free(create_chat_completion_request->function_call);
        create_chat_completion_request->function_call = NULL;
    }
    if (create_chat_completion_request->stop) {
        create_chat_completion_request_stop_free(create_chat_completion_request->stop);
        create_chat_completion_request->stop = NULL;
    }
    if (create_chat_completion_request->logit_bias) {
        object_free(create_chat_completion_request->logit_bias);
        create_chat_completion_request->logit_bias = NULL;
    }
    if (create_chat_completion_request->user) {
        free(create_chat_completion_request->user);
        create_chat_completion_request->user = NULL;
    }
    free(create_chat_completion_request);
}

cJSON *create_chat_completion_request_convertToJSON(create_chat_completion_request_t *create_chat_completion_request) {
    cJSON *item = cJSON_CreateObject();

    // create_chat_completion_request->model
    if (!create_chat_completion_request->model) {
        goto fail;
    }
    cJSON *model_local_JSON = create_chat_completion_request_model_convertToJSON(create_chat_completion_request->model);
    if(model_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "model", model_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // create_chat_completion_request->messages
    if (!create_chat_completion_request->messages) {
        goto fail;
    }
    cJSON *messages = cJSON_AddArrayToObject(item, "messages");
    if(messages == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *messagesListEntry;
    if (create_chat_completion_request->messages) {
    list_ForEach(messagesListEntry, create_chat_completion_request->messages) {
    cJSON *itemLocal = chat_completion_request_message_convertToJSON(messagesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(messages, itemLocal);
    }
    }


    // create_chat_completion_request->functions
    if(create_chat_completion_request->functions) {
    cJSON *functions = cJSON_AddArrayToObject(item, "functions");
    if(functions == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *functionsListEntry;
    if (create_chat_completion_request->functions) {
    list_ForEach(functionsListEntry, create_chat_completion_request->functions) {
    cJSON *itemLocal = chat_completion_functions_convertToJSON(functionsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(functions, itemLocal);
    }
    }
    }


    // create_chat_completion_request->function_call
    if(create_chat_completion_request->function_call) {
    cJSON *function_call_local_JSON = create_chat_completion_request_function_call_convertToJSON(create_chat_completion_request->function_call);
    if(function_call_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "function_call", function_call_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // create_chat_completion_request->temperature
    if(create_chat_completion_request->temperature) {
    if(cJSON_AddNumberToObject(item, "temperature", create_chat_completion_request->temperature) == NULL) {
    goto fail; //Numeric
    }
    }


    // create_chat_completion_request->top_p
    if(create_chat_completion_request->top_p) {
    if(cJSON_AddNumberToObject(item, "top_p", create_chat_completion_request->top_p) == NULL) {
    goto fail; //Numeric
    }
    }


    // create_chat_completion_request->n
    if(create_chat_completion_request->n) {
    if(cJSON_AddNumberToObject(item, "n", create_chat_completion_request->n) == NULL) {
    goto fail; //Numeric
    }
    }


    // create_chat_completion_request->stream
    if(create_chat_completion_request->stream) {
    if(cJSON_AddBoolToObject(item, "stream", create_chat_completion_request->stream) == NULL) {
    goto fail; //Bool
    }
    }


    // create_chat_completion_request->stop
    if(create_chat_completion_request->stop) {
    cJSON *stop_local_JSON = create_chat_completion_request_stop_convertToJSON(create_chat_completion_request->stop);
    if(stop_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "stop", stop_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // create_chat_completion_request->max_tokens
    if(create_chat_completion_request->max_tokens) {
    if(cJSON_AddNumberToObject(item, "max_tokens", create_chat_completion_request->max_tokens) == NULL) {
    goto fail; //Numeric
    }
    }


    // create_chat_completion_request->presence_penalty
    if(create_chat_completion_request->presence_penalty) {
    if(cJSON_AddNumberToObject(item, "presence_penalty", create_chat_completion_request->presence_penalty) == NULL) {
    goto fail; //Numeric
    }
    }


    // create_chat_completion_request->frequency_penalty
    if(create_chat_completion_request->frequency_penalty) {
    if(cJSON_AddNumberToObject(item, "frequency_penalty", create_chat_completion_request->frequency_penalty) == NULL) {
    goto fail; //Numeric
    }
    }


    // create_chat_completion_request->logit_bias
    if(create_chat_completion_request->logit_bias) {
    cJSON *logit_bias_object = object_convertToJSON(create_chat_completion_request->logit_bias);
    if(logit_bias_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "logit_bias", logit_bias_object);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // create_chat_completion_request->user
    if(create_chat_completion_request->user) {
    if(cJSON_AddStringToObject(item, "user", create_chat_completion_request->user) == NULL) {
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

create_chat_completion_request_t *create_chat_completion_request_parseFromJSON(cJSON *create_chat_completion_requestJSON){

    create_chat_completion_request_t *create_chat_completion_request_local_var = NULL;

    // define the local variable for create_chat_completion_request->model
    create_chat_completion_request_model_t *model_local_nonprim = NULL;

    // define the local list for create_chat_completion_request->messages
    list_t *messagesList = NULL;

    // define the local list for create_chat_completion_request->functions
    list_t *functionsList = NULL;

    // define the local variable for create_chat_completion_request->function_call
    create_chat_completion_request_function_call_t *function_call_local_nonprim = NULL;

    // define the local variable for create_chat_completion_request->stop
    create_chat_completion_request_stop_t *stop_local_nonprim = NULL;

    // create_chat_completion_request->model
    cJSON *model = cJSON_GetObjectItemCaseSensitive(create_chat_completion_requestJSON, "model");
    if (!model) {
        goto end;
    }

    
    model_local_nonprim = create_chat_completion_request_model_parseFromJSON(model); //nonprimitive

    // create_chat_completion_request->messages
    cJSON *messages = cJSON_GetObjectItemCaseSensitive(create_chat_completion_requestJSON, "messages");
    if (!messages) {
        goto end;
    }

    
    cJSON *messages_local_nonprimitive = NULL;
    if(!cJSON_IsArray(messages)){
        goto end; //nonprimitive container
    }

    messagesList = list_createList();

    cJSON_ArrayForEach(messages_local_nonprimitive,messages )
    {
        if(!cJSON_IsObject(messages_local_nonprimitive)){
            goto end;
        }
        chat_completion_request_message_t *messagesItem = chat_completion_request_message_parseFromJSON(messages_local_nonprimitive);

        list_addElement(messagesList, messagesItem);
    }

    // create_chat_completion_request->functions
    cJSON *functions = cJSON_GetObjectItemCaseSensitive(create_chat_completion_requestJSON, "functions");
    if (functions) { 
    cJSON *functions_local_nonprimitive = NULL;
    if(!cJSON_IsArray(functions)){
        goto end; //nonprimitive container
    }

    functionsList = list_createList();

    cJSON_ArrayForEach(functions_local_nonprimitive,functions )
    {
        if(!cJSON_IsObject(functions_local_nonprimitive)){
            goto end;
        }
        chat_completion_functions_t *functionsItem = chat_completion_functions_parseFromJSON(functions_local_nonprimitive);

        list_addElement(functionsList, functionsItem);
    }
    }

    // create_chat_completion_request->function_call
    cJSON *function_call = cJSON_GetObjectItemCaseSensitive(create_chat_completion_requestJSON, "function_call");
    if (function_call) { 
    function_call_local_nonprim = create_chat_completion_request_function_call_parseFromJSON(function_call); //nonprimitive
    }

    // create_chat_completion_request->temperature
    cJSON *temperature = cJSON_GetObjectItemCaseSensitive(create_chat_completion_requestJSON, "temperature");
    if (temperature) { 
    if(!cJSON_IsNumber(temperature))
    {
    goto end; //Numeric
    }
    }

    // create_chat_completion_request->top_p
    cJSON *top_p = cJSON_GetObjectItemCaseSensitive(create_chat_completion_requestJSON, "top_p");
    if (top_p) { 
    if(!cJSON_IsNumber(top_p))
    {
    goto end; //Numeric
    }
    }

    // create_chat_completion_request->n
    cJSON *n = cJSON_GetObjectItemCaseSensitive(create_chat_completion_requestJSON, "n");
    if (n) { 
    if(!cJSON_IsNumber(n))
    {
    goto end; //Numeric
    }
    }

    // create_chat_completion_request->stream
    cJSON *stream = cJSON_GetObjectItemCaseSensitive(create_chat_completion_requestJSON, "stream");
    if (stream) { 
    if(!cJSON_IsBool(stream))
    {
    goto end; //Bool
    }
    }

    // create_chat_completion_request->stop
    cJSON *stop = cJSON_GetObjectItemCaseSensitive(create_chat_completion_requestJSON, "stop");
    if (stop) { 
    stop_local_nonprim = create_chat_completion_request_stop_parseFromJSON(stop); //nonprimitive
    }

    // create_chat_completion_request->max_tokens
    cJSON *max_tokens = cJSON_GetObjectItemCaseSensitive(create_chat_completion_requestJSON, "max_tokens");
    if (max_tokens) { 
    if(!cJSON_IsNumber(max_tokens))
    {
    goto end; //Numeric
    }
    }

    // create_chat_completion_request->presence_penalty
    cJSON *presence_penalty = cJSON_GetObjectItemCaseSensitive(create_chat_completion_requestJSON, "presence_penalty");
    if (presence_penalty) { 
    if(!cJSON_IsNumber(presence_penalty))
    {
    goto end; //Numeric
    }
    }

    // create_chat_completion_request->frequency_penalty
    cJSON *frequency_penalty = cJSON_GetObjectItemCaseSensitive(create_chat_completion_requestJSON, "frequency_penalty");
    if (frequency_penalty) { 
    if(!cJSON_IsNumber(frequency_penalty))
    {
    goto end; //Numeric
    }
    }

    // create_chat_completion_request->logit_bias
    cJSON *logit_bias = cJSON_GetObjectItemCaseSensitive(create_chat_completion_requestJSON, "logit_bias");
    object_t *logit_bias_local_object = NULL;
    if (logit_bias) { 
    logit_bias_local_object = object_parseFromJSON(logit_bias); //object
    }

    // create_chat_completion_request->user
    cJSON *user = cJSON_GetObjectItemCaseSensitive(create_chat_completion_requestJSON, "user");
    if (user) { 
    if(!cJSON_IsString(user) && !cJSON_IsNull(user))
    {
    goto end; //String
    }
    }


    create_chat_completion_request_local_var = create_chat_completion_request_create (
        model_local_nonprim,
        messagesList,
        functions ? functionsList : NULL,
        function_call ? function_call_local_nonprim : NULL,
        temperature ? temperature->valuedouble : 0,
        top_p ? top_p->valuedouble : 0,
        n ? n->valuedouble : 0,
        stream ? stream->valueint : 0,
        stop ? stop_local_nonprim : NULL,
        max_tokens ? max_tokens->valuedouble : 0,
        presence_penalty ? presence_penalty->valuedouble : 0,
        frequency_penalty ? frequency_penalty->valuedouble : 0,
        logit_bias ? logit_bias_local_object : NULL,
        user && !cJSON_IsNull(user) ? strdup(user->valuestring) : NULL
        );

    return create_chat_completion_request_local_var;
end:
    if (model_local_nonprim) {
        create_chat_completion_request_model_free(model_local_nonprim);
        model_local_nonprim = NULL;
    }
    if (messagesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, messagesList) {
            chat_completion_request_message_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(messagesList);
        messagesList = NULL;
    }
    if (functionsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, functionsList) {
            chat_completion_functions_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(functionsList);
        functionsList = NULL;
    }
    if (function_call_local_nonprim) {
        create_chat_completion_request_function_call_free(function_call_local_nonprim);
        function_call_local_nonprim = NULL;
    }
    if (stop_local_nonprim) {
        create_chat_completion_request_stop_free(stop_local_nonprim);
        stop_local_nonprim = NULL;
    }
    return NULL;

}
