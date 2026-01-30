#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_chat_completion_request.h"


char* create_chat_completion_request_reasoning_effort_ToString(openai_api_create_chat_completion_request_REASONINGEFFORT_e reasoning_effort) {
    char* reasoning_effortArray[] =  { "NULL", "low", "medium", "high" };
    return reasoning_effortArray[reasoning_effort];
}

openai_api_create_chat_completion_request_REASONINGEFFORT_e create_chat_completion_request_reasoning_effort_FromString(char* reasoning_effort){
    int stringToReturn = 0;
    char *reasoning_effortArray[] =  { "NULL", "low", "medium", "high" };
    size_t sizeofArray = sizeof(reasoning_effortArray) / sizeof(reasoning_effortArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(reasoning_effort, reasoning_effortArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* create_chat_completion_request_modalities_ToString(openai_api_create_chat_completion_request_MODALITIES_e modalities) {
    char *modalitiesArray[] =  { "NULL", "text", "audio" };
    return modalitiesArray[modalities - 1];
}

openai_api_create_chat_completion_request_MODALITIES_e create_chat_completion_request_modalities_FromString(char* modalities) {
    int stringToReturn = 0;
    char *modalitiesArray[] =  { "NULL", "text", "audio" };
    size_t sizeofArray = sizeof(modalitiesArray) / sizeof(modalitiesArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(modalities, modalitiesArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}
char* create_chat_completion_request_service_tier_ToString(openai_api_create_chat_completion_request_SERVICETIER_e service_tier) {
    char* service_tierArray[] =  { "NULL", "auto", "default" };
    return service_tierArray[service_tier];
}

openai_api_create_chat_completion_request_SERVICETIER_e create_chat_completion_request_service_tier_FromString(char* service_tier){
    int stringToReturn = 0;
    char *service_tierArray[] =  { "NULL", "auto", "default" };
    size_t sizeofArray = sizeof(service_tierArray) / sizeof(service_tierArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(service_tier, service_tierArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static create_chat_completion_request_t *create_chat_completion_request_create_internal(
    list_t *messages,
    create_chat_completion_request_model_t *model,
    int store,
    openai_api_create_chat_completion_request_REASONINGEFFORT_e reasoning_effort,
    list_t* metadata,
    double frequency_penalty,
    list_t* logit_bias,
    int logprobs,
    int top_logprobs,
    int max_tokens,
    int max_completion_tokens,
    int n,
    list_t *modalities,
    prediction_content_t *prediction,
    create_chat_completion_request_audio_t *audio,
    double presence_penalty,
    create_chat_completion_request_response_format_t *response_format,
    int seed,
    openai_api_create_chat_completion_request_SERVICETIER_e service_tier,
    create_chat_completion_request_stop_t *stop,
    int stream,
    chat_completion_stream_options_t *stream_options,
    double temperature,
    double top_p,
    list_t *tools,
    chat_completion_tool_choice_option_t *tool_choice,
    int parallel_tool_calls,
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
    create_chat_completion_request_local_var->store = store;
    create_chat_completion_request_local_var->reasoning_effort = reasoning_effort;
    create_chat_completion_request_local_var->metadata = metadata;
    create_chat_completion_request_local_var->frequency_penalty = frequency_penalty;
    create_chat_completion_request_local_var->logit_bias = logit_bias;
    create_chat_completion_request_local_var->logprobs = logprobs;
    create_chat_completion_request_local_var->top_logprobs = top_logprobs;
    create_chat_completion_request_local_var->max_tokens = max_tokens;
    create_chat_completion_request_local_var->max_completion_tokens = max_completion_tokens;
    create_chat_completion_request_local_var->n = n;
    create_chat_completion_request_local_var->modalities = modalities;
    create_chat_completion_request_local_var->prediction = prediction;
    create_chat_completion_request_local_var->audio = audio;
    create_chat_completion_request_local_var->presence_penalty = presence_penalty;
    create_chat_completion_request_local_var->response_format = response_format;
    create_chat_completion_request_local_var->seed = seed;
    create_chat_completion_request_local_var->service_tier = service_tier;
    create_chat_completion_request_local_var->stop = stop;
    create_chat_completion_request_local_var->stream = stream;
    create_chat_completion_request_local_var->stream_options = stream_options;
    create_chat_completion_request_local_var->temperature = temperature;
    create_chat_completion_request_local_var->top_p = top_p;
    create_chat_completion_request_local_var->tools = tools;
    create_chat_completion_request_local_var->tool_choice = tool_choice;
    create_chat_completion_request_local_var->parallel_tool_calls = parallel_tool_calls;
    create_chat_completion_request_local_var->user = user;
    create_chat_completion_request_local_var->function_call = function_call;
    create_chat_completion_request_local_var->functions = functions;

    create_chat_completion_request_local_var->_library_owned = 1;
    return create_chat_completion_request_local_var;
}

__attribute__((deprecated)) create_chat_completion_request_t *create_chat_completion_request_create(
    list_t *messages,
    create_chat_completion_request_model_t *model,
    int store,
    openai_api_create_chat_completion_request_REASONINGEFFORT_e reasoning_effort,
    list_t* metadata,
    double frequency_penalty,
    list_t* logit_bias,
    int logprobs,
    int top_logprobs,
    int max_tokens,
    int max_completion_tokens,
    int n,
    list_t *modalities,
    prediction_content_t *prediction,
    create_chat_completion_request_audio_t *audio,
    double presence_penalty,
    create_chat_completion_request_response_format_t *response_format,
    int seed,
    openai_api_create_chat_completion_request_SERVICETIER_e service_tier,
    create_chat_completion_request_stop_t *stop,
    int stream,
    chat_completion_stream_options_t *stream_options,
    double temperature,
    double top_p,
    list_t *tools,
    chat_completion_tool_choice_option_t *tool_choice,
    int parallel_tool_calls,
    char *user,
    create_chat_completion_request_function_call_t *function_call,
    list_t *functions
    ) {
    return create_chat_completion_request_create_internal (
        messages,
        model,
        store,
        reasoning_effort,
        metadata,
        frequency_penalty,
        logit_bias,
        logprobs,
        top_logprobs,
        max_tokens,
        max_completion_tokens,
        n,
        modalities,
        prediction,
        audio,
        presence_penalty,
        response_format,
        seed,
        service_tier,
        stop,
        stream,
        stream_options,
        temperature,
        top_p,
        tools,
        tool_choice,
        parallel_tool_calls,
        user,
        function_call,
        functions
        );
}

void create_chat_completion_request_free(create_chat_completion_request_t *create_chat_completion_request) {
    if(NULL == create_chat_completion_request){
        return ;
    }
    if(create_chat_completion_request->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "create_chat_completion_request_free");
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
    if (create_chat_completion_request->metadata) {
        list_ForEach(listEntry, create_chat_completion_request->metadata) {
            keyValuePair_t *localKeyValue = listEntry->data;
            free (localKeyValue->key);
            free (localKeyValue->value);
            keyValuePair_free(localKeyValue);
        }
        list_freeList(create_chat_completion_request->metadata);
        create_chat_completion_request->metadata = NULL;
    }
    if (create_chat_completion_request->logit_bias) {
        list_ForEach(listEntry, create_chat_completion_request->logit_bias) {
            keyValuePair_t *localKeyValue = listEntry->data;
            free (localKeyValue->key);
            free (localKeyValue->value);
            keyValuePair_free(localKeyValue);
        }
        list_freeList(create_chat_completion_request->logit_bias);
        create_chat_completion_request->logit_bias = NULL;
    }
    if (create_chat_completion_request->modalities) {
        list_ForEach(listEntry, create_chat_completion_request->modalities) {
            free(listEntry->data);
        }
        list_freeList(create_chat_completion_request->modalities);
        create_chat_completion_request->modalities = NULL;
    }
    if (create_chat_completion_request->prediction) {
        prediction_content_free(create_chat_completion_request->prediction);
        create_chat_completion_request->prediction = NULL;
    }
    if (create_chat_completion_request->audio) {
        create_chat_completion_request_audio_free(create_chat_completion_request->audio);
        create_chat_completion_request->audio = NULL;
    }
    if (create_chat_completion_request->response_format) {
        create_chat_completion_request_response_format_free(create_chat_completion_request->response_format);
        create_chat_completion_request->response_format = NULL;
    }
    if (create_chat_completion_request->stop) {
        create_chat_completion_request_stop_free(create_chat_completion_request->stop);
        create_chat_completion_request->stop = NULL;
    }
    if (create_chat_completion_request->stream_options) {
        chat_completion_stream_options_free(create_chat_completion_request->stream_options);
        create_chat_completion_request->stream_options = NULL;
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


    // create_chat_completion_request->store
    if(create_chat_completion_request->store) {
    if(cJSON_AddBoolToObject(item, "store", create_chat_completion_request->store) == NULL) {
    goto fail; //Bool
    }
    }


    // create_chat_completion_request->reasoning_effort
    if(create_chat_completion_request->reasoning_effort != openai_api_create_chat_completion_request_REASONINGEFFORT_NULL) {
    if(cJSON_AddStringToObject(item, "reasoning_effort", create_chat_completion_request_reasoning_effort_ToString(create_chat_completion_request->reasoning_effort)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // create_chat_completion_request->metadata
    if(create_chat_completion_request->metadata) {
    cJSON *metadata = cJSON_AddObjectToObject(item, "metadata");
    if(metadata == NULL) {
        goto fail; //primitive map container
    }
    cJSON *localMapObject = metadata;
    listEntry_t *metadataListEntry;
    if (create_chat_completion_request->metadata) {
    list_ForEach(metadataListEntry, create_chat_completion_request->metadata) {
        keyValuePair_t *localKeyValue = metadataListEntry->data;
        if(cJSON_AddStringToObject(localMapObject, localKeyValue->key, localKeyValue->value) == NULL)
        {
            goto fail;
        }
    }
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
    cJSON *logit_bias = cJSON_AddObjectToObject(item, "logit_bias");
    if(logit_bias == NULL) {
        goto fail; //primitive map container
    }
    cJSON *localMapObject = logit_bias;
    listEntry_t *logit_biasListEntry;
    if (create_chat_completion_request->logit_bias) {
    list_ForEach(logit_biasListEntry, create_chat_completion_request->logit_bias) {
        keyValuePair_t *localKeyValue = logit_biasListEntry->data;
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


    // create_chat_completion_request->max_completion_tokens
    if(create_chat_completion_request->max_completion_tokens) {
    if(cJSON_AddNumberToObject(item, "max_completion_tokens", create_chat_completion_request->max_completion_tokens) == NULL) {
    goto fail; //Numeric
    }
    }


    // create_chat_completion_request->n
    if(create_chat_completion_request->n) {
    if(cJSON_AddNumberToObject(item, "n", create_chat_completion_request->n) == NULL) {
    goto fail; //Numeric
    }
    }


    // create_chat_completion_request->modalities
    if(create_chat_completion_request->modalities != openai_api_create_chat_completion_request_MODALITIES_NULL) {
    cJSON *modalities = cJSON_AddArrayToObject(item, "modalities");
    if(modalities == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *modalitiesListEntry;
    list_ForEach(modalitiesListEntry, create_chat_completion_request->modalities) {
    if(cJSON_AddStringToObject(modalities, "", modalitiesListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // create_chat_completion_request->prediction
    if(create_chat_completion_request->prediction) {
    cJSON *prediction_local_JSON = prediction_content_convertToJSON(create_chat_completion_request->prediction);
    if(prediction_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "prediction", prediction_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // create_chat_completion_request->audio
    if(create_chat_completion_request->audio) {
    cJSON *audio_local_JSON = create_chat_completion_request_audio_convertToJSON(create_chat_completion_request->audio);
    if(audio_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "audio", audio_local_JSON);
    if(item->child == NULL) {
    goto fail;
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


    // create_chat_completion_request->service_tier
    if(create_chat_completion_request->service_tier != openai_api_create_chat_completion_request_SERVICETIER_NULL) {
    if(cJSON_AddStringToObject(item, "service_tier", create_chat_completion_request_service_tier_ToString(create_chat_completion_request->service_tier)) == NULL)
    {
    goto fail; //Enum
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


    // create_chat_completion_request->stream_options
    if(create_chat_completion_request->stream_options) {
    cJSON *stream_options_local_JSON = chat_completion_stream_options_convertToJSON(create_chat_completion_request->stream_options);
    if(stream_options_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "stream_options", stream_options_local_JSON);
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


    // create_chat_completion_request->parallel_tool_calls
    if(create_chat_completion_request->parallel_tool_calls) {
    if(cJSON_AddBoolToObject(item, "parallel_tool_calls", create_chat_completion_request->parallel_tool_calls) == NULL) {
    goto fail; //Bool
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

    // define the local map for create_chat_completion_request->metadata
    list_t *metadataList = NULL;

    // define the local map for create_chat_completion_request->logit_bias
    list_t *logit_biasList = NULL;

    // define the local list for create_chat_completion_request->modalities
    list_t *modalitiesList = NULL;

    // define the local variable for create_chat_completion_request->prediction
    prediction_content_t *prediction_local_nonprim = NULL;

    // define the local variable for create_chat_completion_request->audio
    create_chat_completion_request_audio_t *audio_local_nonprim = NULL;

    // define the local variable for create_chat_completion_request->response_format
    create_chat_completion_request_response_format_t *response_format_local_nonprim = NULL;

    // define the local variable for create_chat_completion_request->stop
    create_chat_completion_request_stop_t *stop_local_nonprim = NULL;

    // define the local variable for create_chat_completion_request->stream_options
    chat_completion_stream_options_t *stream_options_local_nonprim = NULL;

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
    if (cJSON_IsNull(messages)) {
        messages = NULL;
    }
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
    if (cJSON_IsNull(model)) {
        model = NULL;
    }
    if (!model) {
        goto end;
    }

    
    model_local_nonprim = create_chat_completion_request_model_parseFromJSON(model); //nonprimitive

    // create_chat_completion_request->store
    cJSON *store = cJSON_GetObjectItemCaseSensitive(create_chat_completion_requestJSON, "store");
    if (cJSON_IsNull(store)) {
        store = NULL;
    }
    if (store) { 
    if(!cJSON_IsBool(store))
    {
    goto end; //Bool
    }
    }

    // create_chat_completion_request->reasoning_effort
    cJSON *reasoning_effort = cJSON_GetObjectItemCaseSensitive(create_chat_completion_requestJSON, "reasoning_effort");
    if (cJSON_IsNull(reasoning_effort)) {
        reasoning_effort = NULL;
    }
    openai_api_create_chat_completion_request_REASONINGEFFORT_e reasoning_effortVariable;
    if (reasoning_effort) { 
    if(!cJSON_IsString(reasoning_effort))
    {
    goto end; //Enum
    }
    reasoning_effortVariable = create_chat_completion_request_reasoning_effort_FromString(reasoning_effort->valuestring);
    }

    // create_chat_completion_request->metadata
    cJSON *metadata = cJSON_GetObjectItemCaseSensitive(create_chat_completion_requestJSON, "metadata");
    if (cJSON_IsNull(metadata)) {
        metadata = NULL;
    }
    if (metadata) { 
    cJSON *metadata_local_map = NULL;
    if(!cJSON_IsObject(metadata) && !cJSON_IsNull(metadata))
    {
        goto end;//primitive map container
    }
    if(cJSON_IsObject(metadata))
    {
        metadataList = list_createList();
        keyValuePair_t *localMapKeyPair;
        cJSON_ArrayForEach(metadata_local_map, metadata)
        {
            cJSON *localMapObject = metadata_local_map;
            if(!cJSON_IsString(localMapObject))
            {
                goto end;
            }
            localMapKeyPair = keyValuePair_create(strdup(localMapObject->string),strdup(localMapObject->valuestring));
            list_addElement(metadataList , localMapKeyPair);
        }
    }
    }

    // create_chat_completion_request->frequency_penalty
    cJSON *frequency_penalty = cJSON_GetObjectItemCaseSensitive(create_chat_completion_requestJSON, "frequency_penalty");
    if (cJSON_IsNull(frequency_penalty)) {
        frequency_penalty = NULL;
    }
    if (frequency_penalty) { 
    if(!cJSON_IsNumber(frequency_penalty))
    {
    goto end; //Numeric
    }
    }

    // create_chat_completion_request->logit_bias
    cJSON *logit_bias = cJSON_GetObjectItemCaseSensitive(create_chat_completion_requestJSON, "logit_bias");
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

    // create_chat_completion_request->logprobs
    cJSON *logprobs = cJSON_GetObjectItemCaseSensitive(create_chat_completion_requestJSON, "logprobs");
    if (cJSON_IsNull(logprobs)) {
        logprobs = NULL;
    }
    if (logprobs) { 
    if(!cJSON_IsBool(logprobs))
    {
    goto end; //Bool
    }
    }

    // create_chat_completion_request->top_logprobs
    cJSON *top_logprobs = cJSON_GetObjectItemCaseSensitive(create_chat_completion_requestJSON, "top_logprobs");
    if (cJSON_IsNull(top_logprobs)) {
        top_logprobs = NULL;
    }
    if (top_logprobs) { 
    if(!cJSON_IsNumber(top_logprobs))
    {
    goto end; //Numeric
    }
    }

    // create_chat_completion_request->max_tokens
    cJSON *max_tokens = cJSON_GetObjectItemCaseSensitive(create_chat_completion_requestJSON, "max_tokens");
    if (cJSON_IsNull(max_tokens)) {
        max_tokens = NULL;
    }
    if (max_tokens) { 
    if(!cJSON_IsNumber(max_tokens))
    {
    goto end; //Numeric
    }
    }

    // create_chat_completion_request->max_completion_tokens
    cJSON *max_completion_tokens = cJSON_GetObjectItemCaseSensitive(create_chat_completion_requestJSON, "max_completion_tokens");
    if (cJSON_IsNull(max_completion_tokens)) {
        max_completion_tokens = NULL;
    }
    if (max_completion_tokens) { 
    if(!cJSON_IsNumber(max_completion_tokens))
    {
    goto end; //Numeric
    }
    }

    // create_chat_completion_request->n
    cJSON *n = cJSON_GetObjectItemCaseSensitive(create_chat_completion_requestJSON, "n");
    if (cJSON_IsNull(n)) {
        n = NULL;
    }
    if (n) { 
    if(!cJSON_IsNumber(n))
    {
    goto end; //Numeric
    }
    }

    // create_chat_completion_request->modalities
    cJSON *modalities = cJSON_GetObjectItemCaseSensitive(create_chat_completion_requestJSON, "modalities");
    if (cJSON_IsNull(modalities)) {
        modalities = NULL;
    }
    if (modalities) { 
    cJSON *modalities_local = NULL;
    if(!cJSON_IsArray(modalities)) {
        goto end;//primitive container
    }
    modalitiesList = list_createList();

    cJSON_ArrayForEach(modalities_local, modalities)
    {
        if(!cJSON_IsString(modalities_local))
        {
            goto end;
        }
        list_addElement(modalitiesList , strdup(modalities_local->valuestring));
    }
    }

    // create_chat_completion_request->prediction
    cJSON *prediction = cJSON_GetObjectItemCaseSensitive(create_chat_completion_requestJSON, "prediction");
    if (cJSON_IsNull(prediction)) {
        prediction = NULL;
    }
    if (prediction) { 
    prediction_local_nonprim = prediction_content_parseFromJSON(prediction); //nonprimitive
    }

    // create_chat_completion_request->audio
    cJSON *audio = cJSON_GetObjectItemCaseSensitive(create_chat_completion_requestJSON, "audio");
    if (cJSON_IsNull(audio)) {
        audio = NULL;
    }
    if (audio) { 
    audio_local_nonprim = create_chat_completion_request_audio_parseFromJSON(audio); //nonprimitive
    }

    // create_chat_completion_request->presence_penalty
    cJSON *presence_penalty = cJSON_GetObjectItemCaseSensitive(create_chat_completion_requestJSON, "presence_penalty");
    if (cJSON_IsNull(presence_penalty)) {
        presence_penalty = NULL;
    }
    if (presence_penalty) { 
    if(!cJSON_IsNumber(presence_penalty))
    {
    goto end; //Numeric
    }
    }

    // create_chat_completion_request->response_format
    cJSON *response_format = cJSON_GetObjectItemCaseSensitive(create_chat_completion_requestJSON, "response_format");
    if (cJSON_IsNull(response_format)) {
        response_format = NULL;
    }
    if (response_format) { 
    response_format_local_nonprim = create_chat_completion_request_response_format_parseFromJSON(response_format); //nonprimitive
    }

    // create_chat_completion_request->seed
    cJSON *seed = cJSON_GetObjectItemCaseSensitive(create_chat_completion_requestJSON, "seed");
    if (cJSON_IsNull(seed)) {
        seed = NULL;
    }
    if (seed) { 
    if(!cJSON_IsNumber(seed))
    {
    goto end; //Numeric
    }
    }

    // create_chat_completion_request->service_tier
    cJSON *service_tier = cJSON_GetObjectItemCaseSensitive(create_chat_completion_requestJSON, "service_tier");
    if (cJSON_IsNull(service_tier)) {
        service_tier = NULL;
    }
    openai_api_create_chat_completion_request_SERVICETIER_e service_tierVariable;
    if (service_tier) { 
    if(!cJSON_IsString(service_tier))
    {
    goto end; //Enum
    }
    service_tierVariable = create_chat_completion_request_service_tier_FromString(service_tier->valuestring);
    }

    // create_chat_completion_request->stop
    cJSON *stop = cJSON_GetObjectItemCaseSensitive(create_chat_completion_requestJSON, "stop");
    if (cJSON_IsNull(stop)) {
        stop = NULL;
    }
    if (stop) { 
    stop_local_nonprim = create_chat_completion_request_stop_parseFromJSON(stop); //nonprimitive
    }

    // create_chat_completion_request->stream
    cJSON *stream = cJSON_GetObjectItemCaseSensitive(create_chat_completion_requestJSON, "stream");
    if (cJSON_IsNull(stream)) {
        stream = NULL;
    }
    if (stream) { 
    if(!cJSON_IsBool(stream))
    {
    goto end; //Bool
    }
    }

    // create_chat_completion_request->stream_options
    cJSON *stream_options = cJSON_GetObjectItemCaseSensitive(create_chat_completion_requestJSON, "stream_options");
    if (cJSON_IsNull(stream_options)) {
        stream_options = NULL;
    }
    if (stream_options) { 
    stream_options_local_nonprim = chat_completion_stream_options_parseFromJSON(stream_options); //nonprimitive
    }

    // create_chat_completion_request->temperature
    cJSON *temperature = cJSON_GetObjectItemCaseSensitive(create_chat_completion_requestJSON, "temperature");
    if (cJSON_IsNull(temperature)) {
        temperature = NULL;
    }
    if (temperature) { 
    if(!cJSON_IsNumber(temperature))
    {
    goto end; //Numeric
    }
    }

    // create_chat_completion_request->top_p
    cJSON *top_p = cJSON_GetObjectItemCaseSensitive(create_chat_completion_requestJSON, "top_p");
    if (cJSON_IsNull(top_p)) {
        top_p = NULL;
    }
    if (top_p) { 
    if(!cJSON_IsNumber(top_p))
    {
    goto end; //Numeric
    }
    }

    // create_chat_completion_request->tools
    cJSON *tools = cJSON_GetObjectItemCaseSensitive(create_chat_completion_requestJSON, "tools");
    if (cJSON_IsNull(tools)) {
        tools = NULL;
    }
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
    if (cJSON_IsNull(tool_choice)) {
        tool_choice = NULL;
    }
    if (tool_choice) { 
    tool_choice_local_nonprim = chat_completion_tool_choice_option_parseFromJSON(tool_choice); //nonprimitive
    }

    // create_chat_completion_request->parallel_tool_calls
    cJSON *parallel_tool_calls = cJSON_GetObjectItemCaseSensitive(create_chat_completion_requestJSON, "parallel_tool_calls");
    if (cJSON_IsNull(parallel_tool_calls)) {
        parallel_tool_calls = NULL;
    }
    if (parallel_tool_calls) { 
    if(!cJSON_IsBool(parallel_tool_calls))
    {
    goto end; //Bool
    }
    }

    // create_chat_completion_request->user
    cJSON *user = cJSON_GetObjectItemCaseSensitive(create_chat_completion_requestJSON, "user");
    if (cJSON_IsNull(user)) {
        user = NULL;
    }
    if (user) { 
    if(!cJSON_IsString(user) && !cJSON_IsNull(user))
    {
    goto end; //String
    }
    }

    // create_chat_completion_request->function_call
    cJSON *function_call = cJSON_GetObjectItemCaseSensitive(create_chat_completion_requestJSON, "function_call");
    if (cJSON_IsNull(function_call)) {
        function_call = NULL;
    }
    if (function_call) { 
    function_call_local_nonprim = create_chat_completion_request_function_call_parseFromJSON(function_call); //nonprimitive
    }

    // create_chat_completion_request->functions
    cJSON *functions = cJSON_GetObjectItemCaseSensitive(create_chat_completion_requestJSON, "functions");
    if (cJSON_IsNull(functions)) {
        functions = NULL;
    }
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


    create_chat_completion_request_local_var = create_chat_completion_request_create_internal (
        messagesList,
        model_local_nonprim,
        store ? store->valueint : 0,
        reasoning_effort ? reasoning_effortVariable : openai_api_create_chat_completion_request_REASONINGEFFORT_NULL,
        metadata ? metadataList : NULL,
        frequency_penalty ? frequency_penalty->valuedouble : 0,
        logit_bias ? logit_biasList : NULL,
        logprobs ? logprobs->valueint : 0,
        top_logprobs ? top_logprobs->valuedouble : 0,
        max_tokens ? max_tokens->valuedouble : 0,
        max_completion_tokens ? max_completion_tokens->valuedouble : 0,
        n ? n->valuedouble : 0,
        modalities ? modalitiesList : NULL,
        prediction ? prediction_local_nonprim : NULL,
        audio ? audio_local_nonprim : NULL,
        presence_penalty ? presence_penalty->valuedouble : 0,
        response_format ? response_format_local_nonprim : NULL,
        seed ? seed->valuedouble : 0,
        service_tier ? service_tierVariable : openai_api_create_chat_completion_request_SERVICETIER_NULL,
        stop ? stop_local_nonprim : NULL,
        stream ? stream->valueint : 0,
        stream_options ? stream_options_local_nonprim : NULL,
        temperature ? temperature->valuedouble : 0,
        top_p ? top_p->valuedouble : 0,
        tools ? toolsList : NULL,
        tool_choice ? tool_choice_local_nonprim : NULL,
        parallel_tool_calls ? parallel_tool_calls->valueint : 0,
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
    if (metadataList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, metadataList) {
            keyValuePair_t *localKeyValue = listEntry->data;
            free(localKeyValue->key);
            localKeyValue->key = NULL;
            free(localKeyValue->value);
            localKeyValue->value = NULL;
            keyValuePair_free(localKeyValue);
            localKeyValue = NULL;
        }
        list_freeList(metadataList);
        metadataList = NULL;
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
    if (modalitiesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, modalitiesList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(modalitiesList);
        modalitiesList = NULL;
    }
    if (prediction_local_nonprim) {
        prediction_content_free(prediction_local_nonprim);
        prediction_local_nonprim = NULL;
    }
    if (audio_local_nonprim) {
        create_chat_completion_request_audio_free(audio_local_nonprim);
        audio_local_nonprim = NULL;
    }
    if (response_format_local_nonprim) {
        create_chat_completion_request_response_format_free(response_format_local_nonprim);
        response_format_local_nonprim = NULL;
    }
    if (stop_local_nonprim) {
        create_chat_completion_request_stop_free(stop_local_nonprim);
        stop_local_nonprim = NULL;
    }
    if (stream_options_local_nonprim) {
        chat_completion_stream_options_free(stream_options_local_nonprim);
        stream_options_local_nonprim = NULL;
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
