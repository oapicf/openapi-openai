#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_chat_completion_request.h"



create_chat_completion_request_t *create_chat_completion_request_create(
    list_t *messages,
    create_chat_completion_request_model_t *model,
    double frequency_penalty,
    list_t* logit_bias,
    int logprobs,
    int top_logprobs,
    int max_tokens,
    int n,
    double presence_penalty,
    create_chat_completion_request_response_format_t *response_format,
    int seed,
    create_chat_completion_request_stop_t *stop,
    int stream,
    double temperature,
    double top_p,
    list_t *tools,
    chat_completion_tool_choice_option_t *tool_choice,
    char *user,
    create_chat_completion_request_function_call_t *function_call,
    list_t *functions
    ) {
    create_chat_completion_request_t *create_chat_completion_request_local_var = malloc(sizeof(create_chat_completion_request_t));
    if (!create_chat_completion_request_local_var) {
        return NULL;
    }
    create_chat_completion_request_local_var->messages = messages;
    create_chat_completion_request_local_var->model = model;
    create_chat_completion_request_local_var->frequency_penalty = frequency_penalty;
    create_chat_completion_request_local_var->logit_bias = logit_bias;
    create_chat_completion_request_local_var->logprobs = logprobs;
    create_chat_completion_request_local_var->top_logprobs = top_logprobs;
    create_chat_completion_request_local_var->max_tokens = max_tokens;
    create_chat_completion_request_local_var->n = n;
    create_chat_completion_request_local_var->presence_penalty = presence_penalty;
    create_chat_completion_request_local_var->response_format = response_format;
    create_chat_completion_request_local_var->seed = seed;
    create_chat_completion_request_local_var->stop = stop;
    create_chat_completion_request_local_var->stream = stream;
    create_chat_completion_request_local_var->temperature = temperature;
    create_chat_completion_request_local_var->top_p = top_p;
    create_chat_completion_request_local_var->tools = tools;
    create_chat_completion_request_local_var->tool_choice = tool_choice;
    create_chat_completion_request_local_var->user = user;
    create_chat_completion_request_local_var->function_call = function_call;
    create_chat_completion_request_local_var->functions = functions;

    return create_chat_completion_request_local_var;
}


void create_chat_completion_request_free(create_chat_completion_request_t *create_chat_completion_request) {
    if(NULL == create_chat_completion_request){
        return ;
    }
    listEntry_t *listEntry;
    if (create_chat_completion_request->messages) {
        list_ForEach(listEntry, create_chat_completion_request->messages) {
            chat_completion_request_message_free(listEntry->data);
        }
        list_freeList(create_chat_completion_request->messages);
        create_chat_completion_request->messages = NULL;
    }
    if (create_chat_completion_request->model) {
        create_chat_completion_request_model_free(create_chat_completion_request->model);
        create_chat_completion_request->model = NULL;
    }
    if (create_chat_completion_request->logit_bias) {
        list_ForEach(listEntry, create_chat_completion_request->logit_bias) {
            keyValuePair_t *localKeyValue = (keyValuePair_t*) listEntry->data;
            free (localKeyValue->key);
            free (localKeyValue->value);
            keyValuePair_free(localKeyValue);
        }
        list_freeList(create_chat_completion_request->logit_bias);
        create_chat_completion_request->logit_bias = NULL;
    }
    if (create_chat_completion_request->response_format) {
        create_chat_completion_request_response_format_free(create_chat_completion_request->response_format);
        create_chat_completion_request->response_format = NULL;
    }
    if (create_chat_completion_request->stop) {
        create_chat_completion_request_stop_free(create_chat_completion_request->stop);
        create_chat_completion_request->stop = NULL;
    }
    if (create_chat_completion_request->tools) {
        list_ForEach(listEntry, create_chat_completion_request->tools) {
            chat_completion_tool_free(listEntry->data);
        }
        list_freeList(create_chat_completion_request->tools);
        create_chat_completion_request->tools = NULL;
    }
    if (create_chat_completion_request->tool_choice) {
        chat_completion_tool_choice_option_free(create_chat_completion_request->tool_choice);
        create_chat_completion_request->tool_choice = NULL;
    }
    if (create_chat_completion_request->user) {
        free(create_chat_completion_request->user);
        create_chat_completion_request->user = NULL;
    }
    if (create_chat_completion_request->function_call) {
        create_chat_completion_request_function_call_free(create_chat_completion_request->function_call);
        create_chat_completion_request->function_call = NULL;
    }
    if (create_chat_completion_request->functions) {
        list_ForEach(listEntry, create_chat_completion_request->functions) {
            chat_completion_functions_free(listEntry->data);
        }
        list_freeList(create_chat_completion_request->functions);
        create_chat_completion_request->functions = NULL;
    }
    free(create_chat_completion_request);
}

cJSON *create_chat_completion_request_convertToJSON(create_chat_completion_request_t *create_chat_completion_request) {
    cJSON *item = cJSON_CreateObject();

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


    // create_chat_completion_request->frequency_penalty
    if(create_chat_completion_request->frequency_penalty) {
    if(cJSON_AddNumberToObject(item, "frequency_penalty", create_chat_completion_request->frequency_penalty) == NULL) {
    goto fail; //Numeric
    }
    }


    // create_chat_completion_request->logit_bias
    if(create_chat_completion_request->logit_bias) {
    cJSON *logit_bias = cJSON_AddObjectToObject(item, "logit_bias");
    if(logit_bias == NULL) {
        goto fail; //primitive map container
    }
    cJSON *localMapObject = logit_bias;
    listEntry_t *logit_biasListEntry;
    if (create_chat_completion_request->logit_bias) {
    list_ForEach(logit_biasListEntry, create_chat_completion_request->logit_bias) {
        keyValuePair_t *localKeyValue = (keyValuePair_t*)logit_biasListEntry->data;
        if(cJSON_AddNumberToObject(localMapObject, localKeyValue->key, *(double *)localKeyValue->value) == NULL)
        {
            goto fail;
        }
    }
    }
    }


    // create_chat_completion_request->logprobs
    if(create_chat_completion_request->logprobs) {
    if(cJSON_AddBoolToObject(item, "logprobs", create_chat_completion_request->logprobs) == NULL) {
    goto fail; //Bool
    }
    }


    // create_chat_completion_request->top_logprobs
    if(create_chat_completion_request->top_logprobs) {
    if(cJSON_AddNumberToObject(item, "top_logprobs", create_chat_completion_request->top_logprobs) == NULL) {
    goto fail; //Numeric
    }
    }


    // create_chat_completion_request->max_tokens
    if(create_chat_completion_request->max_tokens) {
    if(cJSON_AddNumberToObject(item, "max_tokens", create_chat_completion_request->max_tokens) == NULL) {
    goto fail; //Numeric
    }
    }


    // create_chat_completion_request->n
    if(create_chat_completion_request->n) {
    if(cJSON_AddNumberToObject(item, "n", create_chat_completion_request->n) == NULL) {
    goto fail; //Numeric
    }
    }


    // create_chat_completion_request->presence_penalty
    if(create_chat_completion_request->presence_penalty) {
    if(cJSON_AddNumberToObject(item, "presence_penalty", create_chat_completion_request->presence_penalty) == NULL) {
    goto fail; //Numeric
    }
    }


    // create_chat_completion_request->response_format
    if(create_chat_completion_request->response_format) {
    cJSON *response_format_local_JSON = create_chat_completion_request_response_format_convertToJSON(create_chat_completion_request->response_format);
    if(response_format_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "response_format", response_format_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // create_chat_completion_request->seed
    if(create_chat_completion_request->seed) {
    if(cJSON_AddNumberToObject(item, "seed", create_chat_completion_request->seed) == NULL) {
    goto fail; //Numeric
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


    // create_chat_completion_request->stream
    if(create_chat_completion_request->stream) {
    if(cJSON_AddBoolToObject(item, "stream", create_chat_completion_request->stream) == NULL) {
    goto fail; //Bool
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


    // create_chat_completion_request->tools
    if(create_chat_completion_request->tools) {
    cJSON *tools = cJSON_AddArrayToObject(item, "tools");
    if(tools == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *toolsListEntry;
    if (create_chat_completion_request->tools) {
    list_ForEach(toolsListEntry, create_chat_completion_request->tools) {
    cJSON *itemLocal = chat_completion_tool_convertToJSON(toolsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(tools, itemLocal);
    }
    }
    }


    // create_chat_completion_request->tool_choice
    if(create_chat_completion_request->tool_choice) {
    cJSON *tool_choice_local_JSON = chat_completion_tool_choice_option_convertToJSON(create_chat_completion_request->tool_choice);
    if(tool_choice_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "tool_choice", tool_choice_local_JSON);
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

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

create_chat_completion_request_t *create_chat_completion_request_parseFromJSON(cJSON *create_chat_completion_requestJSON){

    create_chat_completion_request_t *create_chat_completion_request_local_var = NULL;

    // define the local list for create_chat_completion_request->messages
    list_t *messagesList = NULL;

    // define the local variable for create_chat_completion_request->model
    create_chat_completion_request_model_t *model_local_nonprim = NULL;

    // define the local map for create_chat_completion_request->logit_bias
    list_t *logit_biasList = NULL;

    // define the local variable for create_chat_completion_request->response_format
    create_chat_completion_request_response_format_t *response_format_local_nonprim = NULL;

    // define the local variable for create_chat_completion_request->stop
    create_chat_completion_request_stop_t *stop_local_nonprim = NULL;

    // define the local list for create_chat_completion_request->tools
    list_t *toolsList = NULL;

    // define the local variable for create_chat_completion_request->tool_choice
    chat_completion_tool_choice_option_t *tool_choice_local_nonprim = NULL;

    // define the local variable for create_chat_completion_request->function_call
    create_chat_completion_request_function_call_t *function_call_local_nonprim = NULL;

    // define the local list for create_chat_completion_request->functions
    list_t *functionsList = NULL;

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

    // create_chat_completion_request->model
    cJSON *model = cJSON_GetObjectItemCaseSensitive(create_chat_completion_requestJSON, "model");
    if (!model) {
        goto end;
    }

    
    model_local_nonprim = create_chat_completion_request_model_parseFromJSON(model); //nonprimitive

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

    // create_chat_completion_request->logprobs
    cJSON *logprobs = cJSON_GetObjectItemCaseSensitive(create_chat_completion_requestJSON, "logprobs");
    if (logprobs) { 
    if(!cJSON_IsBool(logprobs))
    {
    goto end; //Bool
    }
    }

    // create_chat_completion_request->top_logprobs
    cJSON *top_logprobs = cJSON_GetObjectItemCaseSensitive(create_chat_completion_requestJSON, "top_logprobs");
    if (top_logprobs) { 
    if(!cJSON_IsNumber(top_logprobs))
    {
    goto end; //Numeric
    }
    }

    // create_chat_completion_request->max_tokens
    cJSON *max_tokens = cJSON_GetObjectItemCaseSensitive(create_chat_completion_requestJSON, "max_tokens");
    if (max_tokens) { 
    if(!cJSON_IsNumber(max_tokens))
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

    // create_chat_completion_request->presence_penalty
    cJSON *presence_penalty = cJSON_GetObjectItemCaseSensitive(create_chat_completion_requestJSON, "presence_penalty");
    if (presence_penalty) { 
    if(!cJSON_IsNumber(presence_penalty))
    {
    goto end; //Numeric
    }
    }

    // create_chat_completion_request->response_format
    cJSON *response_format = cJSON_GetObjectItemCaseSensitive(create_chat_completion_requestJSON, "response_format");
    if (response_format) { 
    response_format_local_nonprim = create_chat_completion_request_response_format_parseFromJSON(response_format); //nonprimitive
    }

    // create_chat_completion_request->seed
    cJSON *seed = cJSON_GetObjectItemCaseSensitive(create_chat_completion_requestJSON, "seed");
    if (seed) { 
    if(!cJSON_IsNumber(seed))
    {
    goto end; //Numeric
    }
    }

    // create_chat_completion_request->stop
    cJSON *stop = cJSON_GetObjectItemCaseSensitive(create_chat_completion_requestJSON, "stop");
    if (stop) { 
    stop_local_nonprim = create_chat_completion_request_stop_parseFromJSON(stop); //nonprimitive
    }

    // create_chat_completion_request->stream
    cJSON *stream = cJSON_GetObjectItemCaseSensitive(create_chat_completion_requestJSON, "stream");
    if (stream) { 
    if(!cJSON_IsBool(stream))
    {
    goto end; //Bool
    }
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

    // create_chat_completion_request->tools
    cJSON *tools = cJSON_GetObjectItemCaseSensitive(create_chat_completion_requestJSON, "tools");
    if (tools) { 
    cJSON *tools_local_nonprimitive = NULL;
    if(!cJSON_IsArray(tools)){
        goto end; //nonprimitive container
    }

    toolsList = list_createList();

    cJSON_ArrayForEach(tools_local_nonprimitive,tools )
    {
        if(!cJSON_IsObject(tools_local_nonprimitive)){
            goto end;
        }
        chat_completion_tool_t *toolsItem = chat_completion_tool_parseFromJSON(tools_local_nonprimitive);

        list_addElement(toolsList, toolsItem);
    }
    }

    // create_chat_completion_request->tool_choice
    cJSON *tool_choice = cJSON_GetObjectItemCaseSensitive(create_chat_completion_requestJSON, "tool_choice");
    if (tool_choice) { 
    tool_choice_local_nonprim = chat_completion_tool_choice_option_parseFromJSON(tool_choice); //nonprimitive
    }

    // create_chat_completion_request->user
    cJSON *user = cJSON_GetObjectItemCaseSensitive(create_chat_completion_requestJSON, "user");
    if (user) { 
    if(!cJSON_IsString(user) && !cJSON_IsNull(user))
    {
    goto end; //String
    }
    }

    // create_chat_completion_request->function_call
    cJSON *function_call = cJSON_GetObjectItemCaseSensitive(create_chat_completion_requestJSON, "function_call");
    if (function_call) { 
    function_call_local_nonprim = create_chat_completion_request_function_call_parseFromJSON(function_call); //nonprimitive
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


    create_chat_completion_request_local_var = create_chat_completion_request_create (
        messagesList,
        model_local_nonprim,
        frequency_penalty ? frequency_penalty->valuedouble : 0,
        logit_bias ? logit_biasList : NULL,
        logprobs ? logprobs->valueint : 0,
        top_logprobs ? top_logprobs->valuedouble : 0,
        max_tokens ? max_tokens->valuedouble : 0,
        n ? n->valuedouble : 0,
        presence_penalty ? presence_penalty->valuedouble : 0,
        response_format ? response_format_local_nonprim : NULL,
        seed ? seed->valuedouble : 0,
        stop ? stop_local_nonprim : NULL,
        stream ? stream->valueint : 0,
        temperature ? temperature->valuedouble : 0,
        top_p ? top_p->valuedouble : 0,
        tools ? toolsList : NULL,
        tool_choice ? tool_choice_local_nonprim : NULL,
        user && !cJSON_IsNull(user) ? strdup(user->valuestring) : NULL,
        function_call ? function_call_local_nonprim : NULL,
        functions ? functionsList : NULL
        );

    return create_chat_completion_request_local_var;
end:
    if (messagesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, messagesList) {
            chat_completion_request_message_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(messagesList);
        messagesList = NULL;
    }
    if (model_local_nonprim) {
        create_chat_completion_request_model_free(model_local_nonprim);
        model_local_nonprim = NULL;
    }
    if (logit_biasList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, logit_biasList) {
            keyValuePair_t *localKeyValue = (keyValuePair_t*) listEntry->data;
            free(localKeyValue->key);
            localKeyValue->key = NULL;
            keyValuePair_free(localKeyValue);
            localKeyValue = NULL;
        }
        list_freeList(logit_biasList);
        logit_biasList = NULL;
    }
    if (response_format_local_nonprim) {
        create_chat_completion_request_response_format_free(response_format_local_nonprim);
        response_format_local_nonprim = NULL;
    }
    if (stop_local_nonprim) {
        create_chat_completion_request_stop_free(stop_local_nonprim);
        stop_local_nonprim = NULL;
    }
    if (toolsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, toolsList) {
            chat_completion_tool_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(toolsList);
        toolsList = NULL;
    }
    if (tool_choice_local_nonprim) {
        chat_completion_tool_choice_option_free(tool_choice_local_nonprim);
        tool_choice_local_nonprim = NULL;
    }
    if (function_call_local_nonprim) {
        create_chat_completion_request_function_call_free(function_call_local_nonprim);
        function_call_local_nonprim = NULL;
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
    return NULL;

}
