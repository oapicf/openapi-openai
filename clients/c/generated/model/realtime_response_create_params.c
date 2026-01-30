#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "realtime_response_create_params.h"


char* realtime_response_create_params_modalities_ToString(openai_api_realtime_response_create_params_MODALITIES_e modalities) {
    char *modalitiesArray[] =  { "NULL", "text", "audio" };
    return modalitiesArray[modalities - 1];
}

openai_api_realtime_response_create_params_MODALITIES_e realtime_response_create_params_modalities_FromString(char* modalities) {
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
char* realtime_response_create_params_voice_ToString(openai_api_realtime_response_create_params_VOICE_e voice) {
    char* voiceArray[] =  { "NULL", "alloy", "ash", "ballad", "coral", "echo", "sage", "shimmer", "verse" };
    return voiceArray[voice];
}

openai_api_realtime_response_create_params_VOICE_e realtime_response_create_params_voice_FromString(char* voice){
    int stringToReturn = 0;
    char *voiceArray[] =  { "NULL", "alloy", "ash", "ballad", "coral", "echo", "sage", "shimmer", "verse" };
    size_t sizeofArray = sizeof(voiceArray) / sizeof(voiceArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(voice, voiceArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* realtime_response_create_params_output_audio_format_ToString(openai_api_realtime_response_create_params_OUTPUTAUDIOFORMAT_e output_audio_format) {
    char* output_audio_formatArray[] =  { "NULL", "pcm16", "g711_ulaw", "g711_alaw" };
    return output_audio_formatArray[output_audio_format];
}

openai_api_realtime_response_create_params_OUTPUTAUDIOFORMAT_e realtime_response_create_params_output_audio_format_FromString(char* output_audio_format){
    int stringToReturn = 0;
    char *output_audio_formatArray[] =  { "NULL", "pcm16", "g711_ulaw", "g711_alaw" };
    size_t sizeofArray = sizeof(output_audio_formatArray) / sizeof(output_audio_formatArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(output_audio_format, output_audio_formatArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static realtime_response_create_params_t *realtime_response_create_params_create_internal(
    list_t *modalities,
    char *instructions,
    openai_api_realtime_response_create_params_VOICE_e voice,
    openai_api_realtime_response_create_params_OUTPUTAUDIOFORMAT_e output_audio_format,
    list_t *tools,
    char *tool_choice,
    double temperature,
    realtime_response_create_params_max_response_output_tokens_t *max_response_output_tokens,
    realtime_response_create_params_conversation_t *conversation,
    object_t *metadata,
    list_t *input
    ) {
    realtime_response_create_params_t *realtime_response_create_params_local_var = malloc(sizeof(realtime_response_create_params_t));
    if (!realtime_response_create_params_local_var) {
        return NULL;
    }
    realtime_response_create_params_local_var->modalities = modalities;
    realtime_response_create_params_local_var->instructions = instructions;
    realtime_response_create_params_local_var->voice = voice;
    realtime_response_create_params_local_var->output_audio_format = output_audio_format;
    realtime_response_create_params_local_var->tools = tools;
    realtime_response_create_params_local_var->tool_choice = tool_choice;
    realtime_response_create_params_local_var->temperature = temperature;
    realtime_response_create_params_local_var->max_response_output_tokens = max_response_output_tokens;
    realtime_response_create_params_local_var->conversation = conversation;
    realtime_response_create_params_local_var->metadata = metadata;
    realtime_response_create_params_local_var->input = input;

    realtime_response_create_params_local_var->_library_owned = 1;
    return realtime_response_create_params_local_var;
}

__attribute__((deprecated)) realtime_response_create_params_t *realtime_response_create_params_create(
    list_t *modalities,
    char *instructions,
    openai_api_realtime_response_create_params_VOICE_e voice,
    openai_api_realtime_response_create_params_OUTPUTAUDIOFORMAT_e output_audio_format,
    list_t *tools,
    char *tool_choice,
    double temperature,
    realtime_response_create_params_max_response_output_tokens_t *max_response_output_tokens,
    realtime_response_create_params_conversation_t *conversation,
    object_t *metadata,
    list_t *input
    ) {
    return realtime_response_create_params_create_internal (
        modalities,
        instructions,
        voice,
        output_audio_format,
        tools,
        tool_choice,
        temperature,
        max_response_output_tokens,
        conversation,
        metadata,
        input
        );
}

void realtime_response_create_params_free(realtime_response_create_params_t *realtime_response_create_params) {
    if(NULL == realtime_response_create_params){
        return ;
    }
    if(realtime_response_create_params->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "realtime_response_create_params_free");
        return ;
    }
    listEntry_t *listEntry;
    if (realtime_response_create_params->modalities) {
        list_ForEach(listEntry, realtime_response_create_params->modalities) {
            free(listEntry->data);
        }
        list_freeList(realtime_response_create_params->modalities);
        realtime_response_create_params->modalities = NULL;
    }
    if (realtime_response_create_params->instructions) {
        free(realtime_response_create_params->instructions);
        realtime_response_create_params->instructions = NULL;
    }
    if (realtime_response_create_params->tools) {
        list_ForEach(listEntry, realtime_response_create_params->tools) {
            realtime_response_create_params_tools_inner_free(listEntry->data);
        }
        list_freeList(realtime_response_create_params->tools);
        realtime_response_create_params->tools = NULL;
    }
    if (realtime_response_create_params->tool_choice) {
        free(realtime_response_create_params->tool_choice);
        realtime_response_create_params->tool_choice = NULL;
    }
    if (realtime_response_create_params->max_response_output_tokens) {
        realtime_response_create_params_max_response_output_tokens_free(realtime_response_create_params->max_response_output_tokens);
        realtime_response_create_params->max_response_output_tokens = NULL;
    }
    if (realtime_response_create_params->conversation) {
        realtime_response_create_params_conversation_free(realtime_response_create_params->conversation);
        realtime_response_create_params->conversation = NULL;
    }
    if (realtime_response_create_params->metadata) {
        object_free(realtime_response_create_params->metadata);
        realtime_response_create_params->metadata = NULL;
    }
    if (realtime_response_create_params->input) {
        list_ForEach(listEntry, realtime_response_create_params->input) {
            realtime_conversation_item_free(listEntry->data);
        }
        list_freeList(realtime_response_create_params->input);
        realtime_response_create_params->input = NULL;
    }
    free(realtime_response_create_params);
}

cJSON *realtime_response_create_params_convertToJSON(realtime_response_create_params_t *realtime_response_create_params) {
    cJSON *item = cJSON_CreateObject();

    // realtime_response_create_params->modalities
    if(realtime_response_create_params->modalities != openai_api_realtime_response_create_params_MODALITIES_NULL) {
    cJSON *modalities = cJSON_AddArrayToObject(item, "modalities");
    if(modalities == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *modalitiesListEntry;
    list_ForEach(modalitiesListEntry, realtime_response_create_params->modalities) {
    if(cJSON_AddStringToObject(modalities, "", modalitiesListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // realtime_response_create_params->instructions
    if(realtime_response_create_params->instructions) {
    if(cJSON_AddStringToObject(item, "instructions", realtime_response_create_params->instructions) == NULL) {
    goto fail; //String
    }
    }


    // realtime_response_create_params->voice
    if(realtime_response_create_params->voice != openai_api_realtime_response_create_params_VOICE_NULL) {
    if(cJSON_AddStringToObject(item, "voice", realtime_response_create_params_voice_ToString(realtime_response_create_params->voice)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // realtime_response_create_params->output_audio_format
    if(realtime_response_create_params->output_audio_format != openai_api_realtime_response_create_params_OUTPUTAUDIOFORMAT_NULL) {
    if(cJSON_AddStringToObject(item, "output_audio_format", realtime_response_create_params_output_audio_format_ToString(realtime_response_create_params->output_audio_format)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // realtime_response_create_params->tools
    if(realtime_response_create_params->tools) {
    cJSON *tools = cJSON_AddArrayToObject(item, "tools");
    if(tools == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *toolsListEntry;
    if (realtime_response_create_params->tools) {
    list_ForEach(toolsListEntry, realtime_response_create_params->tools) {
    cJSON *itemLocal = realtime_response_create_params_tools_inner_convertToJSON(toolsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(tools, itemLocal);
    }
    }
    }


    // realtime_response_create_params->tool_choice
    if(realtime_response_create_params->tool_choice) {
    if(cJSON_AddStringToObject(item, "tool_choice", realtime_response_create_params->tool_choice) == NULL) {
    goto fail; //String
    }
    }


    // realtime_response_create_params->temperature
    if(realtime_response_create_params->temperature) {
    if(cJSON_AddNumberToObject(item, "temperature", realtime_response_create_params->temperature) == NULL) {
    goto fail; //Numeric
    }
    }


    // realtime_response_create_params->max_response_output_tokens
    if(realtime_response_create_params->max_response_output_tokens) {
    cJSON *max_response_output_tokens_local_JSON = realtime_response_create_params_max_response_output_tokens_convertToJSON(realtime_response_create_params->max_response_output_tokens);
    if(max_response_output_tokens_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "max_response_output_tokens", max_response_output_tokens_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // realtime_response_create_params->conversation
    if(realtime_response_create_params->conversation) {
    cJSON *conversation_local_JSON = realtime_response_create_params_conversation_convertToJSON(realtime_response_create_params->conversation);
    if(conversation_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "conversation", conversation_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // realtime_response_create_params->metadata
    if(realtime_response_create_params->metadata) {
    cJSON *metadata_object = object_convertToJSON(realtime_response_create_params->metadata);
    if(metadata_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "metadata", metadata_object);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // realtime_response_create_params->input
    if(realtime_response_create_params->input) {
    cJSON *input = cJSON_AddArrayToObject(item, "input");
    if(input == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *inputListEntry;
    if (realtime_response_create_params->input) {
    list_ForEach(inputListEntry, realtime_response_create_params->input) {
    cJSON *itemLocal = realtime_conversation_item_convertToJSON(inputListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(input, itemLocal);
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

realtime_response_create_params_t *realtime_response_create_params_parseFromJSON(cJSON *realtime_response_create_paramsJSON){

    realtime_response_create_params_t *realtime_response_create_params_local_var = NULL;

    // define the local list for realtime_response_create_params->modalities
    list_t *modalitiesList = NULL;

    // define the local list for realtime_response_create_params->tools
    list_t *toolsList = NULL;

    // define the local variable for realtime_response_create_params->max_response_output_tokens
    realtime_response_create_params_max_response_output_tokens_t *max_response_output_tokens_local_nonprim = NULL;

    // define the local variable for realtime_response_create_params->conversation
    realtime_response_create_params_conversation_t *conversation_local_nonprim = NULL;

    // define the local list for realtime_response_create_params->input
    list_t *inputList = NULL;

    // realtime_response_create_params->modalities
    cJSON *modalities = cJSON_GetObjectItemCaseSensitive(realtime_response_create_paramsJSON, "modalities");
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

    // realtime_response_create_params->instructions
    cJSON *instructions = cJSON_GetObjectItemCaseSensitive(realtime_response_create_paramsJSON, "instructions");
    if (cJSON_IsNull(instructions)) {
        instructions = NULL;
    }
    if (instructions) { 
    if(!cJSON_IsString(instructions) && !cJSON_IsNull(instructions))
    {
    goto end; //String
    }
    }

    // realtime_response_create_params->voice
    cJSON *voice = cJSON_GetObjectItemCaseSensitive(realtime_response_create_paramsJSON, "voice");
    if (cJSON_IsNull(voice)) {
        voice = NULL;
    }
    openai_api_realtime_response_create_params_VOICE_e voiceVariable;
    if (voice) { 
    if(!cJSON_IsString(voice))
    {
    goto end; //Enum
    }
    voiceVariable = realtime_response_create_params_voice_FromString(voice->valuestring);
    }

    // realtime_response_create_params->output_audio_format
    cJSON *output_audio_format = cJSON_GetObjectItemCaseSensitive(realtime_response_create_paramsJSON, "output_audio_format");
    if (cJSON_IsNull(output_audio_format)) {
        output_audio_format = NULL;
    }
    openai_api_realtime_response_create_params_OUTPUTAUDIOFORMAT_e output_audio_formatVariable;
    if (output_audio_format) { 
    if(!cJSON_IsString(output_audio_format))
    {
    goto end; //Enum
    }
    output_audio_formatVariable = realtime_response_create_params_output_audio_format_FromString(output_audio_format->valuestring);
    }

    // realtime_response_create_params->tools
    cJSON *tools = cJSON_GetObjectItemCaseSensitive(realtime_response_create_paramsJSON, "tools");
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
        realtime_response_create_params_tools_inner_t *toolsItem = realtime_response_create_params_tools_inner_parseFromJSON(tools_local_nonprimitive);

        list_addElement(toolsList, toolsItem);
    }
    }

    // realtime_response_create_params->tool_choice
    cJSON *tool_choice = cJSON_GetObjectItemCaseSensitive(realtime_response_create_paramsJSON, "tool_choice");
    if (cJSON_IsNull(tool_choice)) {
        tool_choice = NULL;
    }
    if (tool_choice) { 
    if(!cJSON_IsString(tool_choice) && !cJSON_IsNull(tool_choice))
    {
    goto end; //String
    }
    }

    // realtime_response_create_params->temperature
    cJSON *temperature = cJSON_GetObjectItemCaseSensitive(realtime_response_create_paramsJSON, "temperature");
    if (cJSON_IsNull(temperature)) {
        temperature = NULL;
    }
    if (temperature) { 
    if(!cJSON_IsNumber(temperature))
    {
    goto end; //Numeric
    }
    }

    // realtime_response_create_params->max_response_output_tokens
    cJSON *max_response_output_tokens = cJSON_GetObjectItemCaseSensitive(realtime_response_create_paramsJSON, "max_response_output_tokens");
    if (cJSON_IsNull(max_response_output_tokens)) {
        max_response_output_tokens = NULL;
    }
    if (max_response_output_tokens) { 
    max_response_output_tokens_local_nonprim = realtime_response_create_params_max_response_output_tokens_parseFromJSON(max_response_output_tokens); //nonprimitive
    }

    // realtime_response_create_params->conversation
    cJSON *conversation = cJSON_GetObjectItemCaseSensitive(realtime_response_create_paramsJSON, "conversation");
    if (cJSON_IsNull(conversation)) {
        conversation = NULL;
    }
    if (conversation) { 
    conversation_local_nonprim = realtime_response_create_params_conversation_parseFromJSON(conversation); //nonprimitive
    }

    // realtime_response_create_params->metadata
    cJSON *metadata = cJSON_GetObjectItemCaseSensitive(realtime_response_create_paramsJSON, "metadata");
    if (cJSON_IsNull(metadata)) {
        metadata = NULL;
    }
    object_t *metadata_local_object = NULL;
    if (metadata) { 
    metadata_local_object = object_parseFromJSON(metadata); //object
    }

    // realtime_response_create_params->input
    cJSON *input = cJSON_GetObjectItemCaseSensitive(realtime_response_create_paramsJSON, "input");
    if (cJSON_IsNull(input)) {
        input = NULL;
    }
    if (input) { 
    cJSON *input_local_nonprimitive = NULL;
    if(!cJSON_IsArray(input)){
        goto end; //nonprimitive container
    }

    inputList = list_createList();

    cJSON_ArrayForEach(input_local_nonprimitive,input )
    {
        if(!cJSON_IsObject(input_local_nonprimitive)){
            goto end;
        }
        realtime_conversation_item_t *inputItem = realtime_conversation_item_parseFromJSON(input_local_nonprimitive);

        list_addElement(inputList, inputItem);
    }
    }


    realtime_response_create_params_local_var = realtime_response_create_params_create_internal (
        modalities ? modalitiesList : NULL,
        instructions && !cJSON_IsNull(instructions) ? strdup(instructions->valuestring) : NULL,
        voice ? voiceVariable : openai_api_realtime_response_create_params_VOICE_NULL,
        output_audio_format ? output_audio_formatVariable : openai_api_realtime_response_create_params_OUTPUTAUDIOFORMAT_NULL,
        tools ? toolsList : NULL,
        tool_choice && !cJSON_IsNull(tool_choice) ? strdup(tool_choice->valuestring) : NULL,
        temperature ? temperature->valuedouble : 0,
        max_response_output_tokens ? max_response_output_tokens_local_nonprim : NULL,
        conversation ? conversation_local_nonprim : NULL,
        metadata ? metadata_local_object : NULL,
        input ? inputList : NULL
        );

    return realtime_response_create_params_local_var;
end:
    if (modalitiesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, modalitiesList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(modalitiesList);
        modalitiesList = NULL;
    }
    if (toolsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, toolsList) {
            realtime_response_create_params_tools_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(toolsList);
        toolsList = NULL;
    }
    if (max_response_output_tokens_local_nonprim) {
        realtime_response_create_params_max_response_output_tokens_free(max_response_output_tokens_local_nonprim);
        max_response_output_tokens_local_nonprim = NULL;
    }
    if (conversation_local_nonprim) {
        realtime_response_create_params_conversation_free(conversation_local_nonprim);
        conversation_local_nonprim = NULL;
    }
    if (inputList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, inputList) {
            realtime_conversation_item_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(inputList);
        inputList = NULL;
    }
    return NULL;

}
