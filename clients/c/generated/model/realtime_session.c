#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "realtime_session.h"


char* realtime_session_modalities_ToString(openai_api_realtime_session_MODALITIES_e modalities) {
    char *modalitiesArray[] =  { "NULL", "text", "audio" };
    return modalitiesArray[modalities - 1];
}

openai_api_realtime_session_MODALITIES_e realtime_session_modalities_FromString(char* modalities) {
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
char* realtime_session_voice_ToString(openai_api_realtime_session_VOICE_e voice) {
    char* voiceArray[] =  { "NULL", "alloy", "ash", "ballad", "coral", "echo", "sage", "shimmer", "verse" };
    return voiceArray[voice];
}

openai_api_realtime_session_VOICE_e realtime_session_voice_FromString(char* voice){
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
char* realtime_session_input_audio_format_ToString(openai_api_realtime_session_INPUTAUDIOFORMAT_e input_audio_format) {
    char* input_audio_formatArray[] =  { "NULL", "pcm16", "g711_ulaw", "g711_alaw" };
    return input_audio_formatArray[input_audio_format];
}

openai_api_realtime_session_INPUTAUDIOFORMAT_e realtime_session_input_audio_format_FromString(char* input_audio_format){
    int stringToReturn = 0;
    char *input_audio_formatArray[] =  { "NULL", "pcm16", "g711_ulaw", "g711_alaw" };
    size_t sizeofArray = sizeof(input_audio_formatArray) / sizeof(input_audio_formatArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(input_audio_format, input_audio_formatArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* realtime_session_output_audio_format_ToString(openai_api_realtime_session_OUTPUTAUDIOFORMAT_e output_audio_format) {
    char* output_audio_formatArray[] =  { "NULL", "pcm16", "g711_ulaw", "g711_alaw" };
    return output_audio_formatArray[output_audio_format];
}

openai_api_realtime_session_OUTPUTAUDIOFORMAT_e realtime_session_output_audio_format_FromString(char* output_audio_format){
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

static realtime_session_t *realtime_session_create_internal(
    char *id,
    list_t *modalities,
    realtime_session_model_t *model,
    char *instructions,
    openai_api_realtime_session_VOICE_e voice,
    openai_api_realtime_session_INPUTAUDIOFORMAT_e input_audio_format,
    openai_api_realtime_session_OUTPUTAUDIOFORMAT_e output_audio_format,
    realtime_session_input_audio_transcription_t *input_audio_transcription,
    realtime_session_turn_detection_t *turn_detection,
    list_t *tools,
    char *tool_choice,
    double temperature,
    realtime_response_create_params_max_response_output_tokens_t *max_response_output_tokens
    ) {
    realtime_session_t *realtime_session_local_var = malloc(sizeof(realtime_session_t));
    if (!realtime_session_local_var) {
        return NULL;
    }
    realtime_session_local_var->id = id;
    realtime_session_local_var->modalities = modalities;
    realtime_session_local_var->model = model;
    realtime_session_local_var->instructions = instructions;
    realtime_session_local_var->voice = voice;
    realtime_session_local_var->input_audio_format = input_audio_format;
    realtime_session_local_var->output_audio_format = output_audio_format;
    realtime_session_local_var->input_audio_transcription = input_audio_transcription;
    realtime_session_local_var->turn_detection = turn_detection;
    realtime_session_local_var->tools = tools;
    realtime_session_local_var->tool_choice = tool_choice;
    realtime_session_local_var->temperature = temperature;
    realtime_session_local_var->max_response_output_tokens = max_response_output_tokens;

    realtime_session_local_var->_library_owned = 1;
    return realtime_session_local_var;
}

__attribute__((deprecated)) realtime_session_t *realtime_session_create(
    char *id,
    list_t *modalities,
    realtime_session_model_t *model,
    char *instructions,
    openai_api_realtime_session_VOICE_e voice,
    openai_api_realtime_session_INPUTAUDIOFORMAT_e input_audio_format,
    openai_api_realtime_session_OUTPUTAUDIOFORMAT_e output_audio_format,
    realtime_session_input_audio_transcription_t *input_audio_transcription,
    realtime_session_turn_detection_t *turn_detection,
    list_t *tools,
    char *tool_choice,
    double temperature,
    realtime_response_create_params_max_response_output_tokens_t *max_response_output_tokens
    ) {
    return realtime_session_create_internal (
        id,
        modalities,
        model,
        instructions,
        voice,
        input_audio_format,
        output_audio_format,
        input_audio_transcription,
        turn_detection,
        tools,
        tool_choice,
        temperature,
        max_response_output_tokens
        );
}

void realtime_session_free(realtime_session_t *realtime_session) {
    if(NULL == realtime_session){
        return ;
    }
    if(realtime_session->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "realtime_session_free");
        return ;
    }
    listEntry_t *listEntry;
    if (realtime_session->id) {
        free(realtime_session->id);
        realtime_session->id = NULL;
    }
    if (realtime_session->modalities) {
        list_ForEach(listEntry, realtime_session->modalities) {
            free(listEntry->data);
        }
        list_freeList(realtime_session->modalities);
        realtime_session->modalities = NULL;
    }
    if (realtime_session->model) {
        realtime_session_model_free(realtime_session->model);
        realtime_session->model = NULL;
    }
    if (realtime_session->instructions) {
        free(realtime_session->instructions);
        realtime_session->instructions = NULL;
    }
    if (realtime_session->input_audio_transcription) {
        realtime_session_input_audio_transcription_free(realtime_session->input_audio_transcription);
        realtime_session->input_audio_transcription = NULL;
    }
    if (realtime_session->turn_detection) {
        realtime_session_turn_detection_free(realtime_session->turn_detection);
        realtime_session->turn_detection = NULL;
    }
    if (realtime_session->tools) {
        list_ForEach(listEntry, realtime_session->tools) {
            realtime_response_create_params_tools_inner_free(listEntry->data);
        }
        list_freeList(realtime_session->tools);
        realtime_session->tools = NULL;
    }
    if (realtime_session->tool_choice) {
        free(realtime_session->tool_choice);
        realtime_session->tool_choice = NULL;
    }
    if (realtime_session->max_response_output_tokens) {
        realtime_response_create_params_max_response_output_tokens_free(realtime_session->max_response_output_tokens);
        realtime_session->max_response_output_tokens = NULL;
    }
    free(realtime_session);
}

cJSON *realtime_session_convertToJSON(realtime_session_t *realtime_session) {
    cJSON *item = cJSON_CreateObject();

    // realtime_session->id
    if(realtime_session->id) {
    if(cJSON_AddStringToObject(item, "id", realtime_session->id) == NULL) {
    goto fail; //String
    }
    }


    // realtime_session->modalities
    if(realtime_session->modalities != openai_api_realtime_session_MODALITIES_NULL) {
    cJSON *modalities = cJSON_AddArrayToObject(item, "modalities");
    if(modalities == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *modalitiesListEntry;
    list_ForEach(modalitiesListEntry, realtime_session->modalities) {
    if(cJSON_AddStringToObject(modalities, "", modalitiesListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // realtime_session->model
    if(realtime_session->model) {
    cJSON *model_local_JSON = realtime_session_model_convertToJSON(realtime_session->model);
    if(model_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "model", model_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // realtime_session->instructions
    if(realtime_session->instructions) {
    if(cJSON_AddStringToObject(item, "instructions", realtime_session->instructions) == NULL) {
    goto fail; //String
    }
    }


    // realtime_session->voice
    if(realtime_session->voice != openai_api_realtime_session_VOICE_NULL) {
    if(cJSON_AddStringToObject(item, "voice", realtime_session_voice_ToString(realtime_session->voice)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // realtime_session->input_audio_format
    if(realtime_session->input_audio_format != openai_api_realtime_session_INPUTAUDIOFORMAT_NULL) {
    if(cJSON_AddStringToObject(item, "input_audio_format", realtime_session_input_audio_format_ToString(realtime_session->input_audio_format)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // realtime_session->output_audio_format
    if(realtime_session->output_audio_format != openai_api_realtime_session_OUTPUTAUDIOFORMAT_NULL) {
    if(cJSON_AddStringToObject(item, "output_audio_format", realtime_session_output_audio_format_ToString(realtime_session->output_audio_format)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // realtime_session->input_audio_transcription
    if(realtime_session->input_audio_transcription) {
    cJSON *input_audio_transcription_local_JSON = realtime_session_input_audio_transcription_convertToJSON(realtime_session->input_audio_transcription);
    if(input_audio_transcription_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "input_audio_transcription", input_audio_transcription_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // realtime_session->turn_detection
    if(realtime_session->turn_detection) {
    cJSON *turn_detection_local_JSON = realtime_session_turn_detection_convertToJSON(realtime_session->turn_detection);
    if(turn_detection_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "turn_detection", turn_detection_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // realtime_session->tools
    if(realtime_session->tools) {
    cJSON *tools = cJSON_AddArrayToObject(item, "tools");
    if(tools == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *toolsListEntry;
    if (realtime_session->tools) {
    list_ForEach(toolsListEntry, realtime_session->tools) {
    cJSON *itemLocal = realtime_response_create_params_tools_inner_convertToJSON(toolsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(tools, itemLocal);
    }
    }
    }


    // realtime_session->tool_choice
    if(realtime_session->tool_choice) {
    if(cJSON_AddStringToObject(item, "tool_choice", realtime_session->tool_choice) == NULL) {
    goto fail; //String
    }
    }


    // realtime_session->temperature
    if(realtime_session->temperature) {
    if(cJSON_AddNumberToObject(item, "temperature", realtime_session->temperature) == NULL) {
    goto fail; //Numeric
    }
    }


    // realtime_session->max_response_output_tokens
    if(realtime_session->max_response_output_tokens) {
    cJSON *max_response_output_tokens_local_JSON = realtime_response_create_params_max_response_output_tokens_convertToJSON(realtime_session->max_response_output_tokens);
    if(max_response_output_tokens_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "max_response_output_tokens", max_response_output_tokens_local_JSON);
    if(item->child == NULL) {
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

realtime_session_t *realtime_session_parseFromJSON(cJSON *realtime_sessionJSON){

    realtime_session_t *realtime_session_local_var = NULL;

    // define the local list for realtime_session->modalities
    list_t *modalitiesList = NULL;

    // define the local variable for realtime_session->model
    realtime_session_model_t *model_local_nonprim = NULL;

    // define the local variable for realtime_session->input_audio_transcription
    realtime_session_input_audio_transcription_t *input_audio_transcription_local_nonprim = NULL;

    // define the local variable for realtime_session->turn_detection
    realtime_session_turn_detection_t *turn_detection_local_nonprim = NULL;

    // define the local list for realtime_session->tools
    list_t *toolsList = NULL;

    // define the local variable for realtime_session->max_response_output_tokens
    realtime_response_create_params_max_response_output_tokens_t *max_response_output_tokens_local_nonprim = NULL;

    // realtime_session->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(realtime_sessionJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // realtime_session->modalities
    cJSON *modalities = cJSON_GetObjectItemCaseSensitive(realtime_sessionJSON, "modalities");
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

    // realtime_session->model
    cJSON *model = cJSON_GetObjectItemCaseSensitive(realtime_sessionJSON, "model");
    if (cJSON_IsNull(model)) {
        model = NULL;
    }
    if (model) { 
    model_local_nonprim = realtime_session_model_parseFromJSON(model); //nonprimitive
    }

    // realtime_session->instructions
    cJSON *instructions = cJSON_GetObjectItemCaseSensitive(realtime_sessionJSON, "instructions");
    if (cJSON_IsNull(instructions)) {
        instructions = NULL;
    }
    if (instructions) { 
    if(!cJSON_IsString(instructions) && !cJSON_IsNull(instructions))
    {
    goto end; //String
    }
    }

    // realtime_session->voice
    cJSON *voice = cJSON_GetObjectItemCaseSensitive(realtime_sessionJSON, "voice");
    if (cJSON_IsNull(voice)) {
        voice = NULL;
    }
    openai_api_realtime_session_VOICE_e voiceVariable;
    if (voice) { 
    if(!cJSON_IsString(voice))
    {
    goto end; //Enum
    }
    voiceVariable = realtime_session_voice_FromString(voice->valuestring);
    }

    // realtime_session->input_audio_format
    cJSON *input_audio_format = cJSON_GetObjectItemCaseSensitive(realtime_sessionJSON, "input_audio_format");
    if (cJSON_IsNull(input_audio_format)) {
        input_audio_format = NULL;
    }
    openai_api_realtime_session_INPUTAUDIOFORMAT_e input_audio_formatVariable;
    if (input_audio_format) { 
    if(!cJSON_IsString(input_audio_format))
    {
    goto end; //Enum
    }
    input_audio_formatVariable = realtime_session_input_audio_format_FromString(input_audio_format->valuestring);
    }

    // realtime_session->output_audio_format
    cJSON *output_audio_format = cJSON_GetObjectItemCaseSensitive(realtime_sessionJSON, "output_audio_format");
    if (cJSON_IsNull(output_audio_format)) {
        output_audio_format = NULL;
    }
    openai_api_realtime_session_OUTPUTAUDIOFORMAT_e output_audio_formatVariable;
    if (output_audio_format) { 
    if(!cJSON_IsString(output_audio_format))
    {
    goto end; //Enum
    }
    output_audio_formatVariable = realtime_session_output_audio_format_FromString(output_audio_format->valuestring);
    }

    // realtime_session->input_audio_transcription
    cJSON *input_audio_transcription = cJSON_GetObjectItemCaseSensitive(realtime_sessionJSON, "input_audio_transcription");
    if (cJSON_IsNull(input_audio_transcription)) {
        input_audio_transcription = NULL;
    }
    if (input_audio_transcription) { 
    input_audio_transcription_local_nonprim = realtime_session_input_audio_transcription_parseFromJSON(input_audio_transcription); //nonprimitive
    }

    // realtime_session->turn_detection
    cJSON *turn_detection = cJSON_GetObjectItemCaseSensitive(realtime_sessionJSON, "turn_detection");
    if (cJSON_IsNull(turn_detection)) {
        turn_detection = NULL;
    }
    if (turn_detection) { 
    turn_detection_local_nonprim = realtime_session_turn_detection_parseFromJSON(turn_detection); //nonprimitive
    }

    // realtime_session->tools
    cJSON *tools = cJSON_GetObjectItemCaseSensitive(realtime_sessionJSON, "tools");
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

    // realtime_session->tool_choice
    cJSON *tool_choice = cJSON_GetObjectItemCaseSensitive(realtime_sessionJSON, "tool_choice");
    if (cJSON_IsNull(tool_choice)) {
        tool_choice = NULL;
    }
    if (tool_choice) { 
    if(!cJSON_IsString(tool_choice) && !cJSON_IsNull(tool_choice))
    {
    goto end; //String
    }
    }

    // realtime_session->temperature
    cJSON *temperature = cJSON_GetObjectItemCaseSensitive(realtime_sessionJSON, "temperature");
    if (cJSON_IsNull(temperature)) {
        temperature = NULL;
    }
    if (temperature) { 
    if(!cJSON_IsNumber(temperature))
    {
    goto end; //Numeric
    }
    }

    // realtime_session->max_response_output_tokens
    cJSON *max_response_output_tokens = cJSON_GetObjectItemCaseSensitive(realtime_sessionJSON, "max_response_output_tokens");
    if (cJSON_IsNull(max_response_output_tokens)) {
        max_response_output_tokens = NULL;
    }
    if (max_response_output_tokens) { 
    max_response_output_tokens_local_nonprim = realtime_response_create_params_max_response_output_tokens_parseFromJSON(max_response_output_tokens); //nonprimitive
    }


    realtime_session_local_var = realtime_session_create_internal (
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL,
        modalities ? modalitiesList : NULL,
        model ? model_local_nonprim : NULL,
        instructions && !cJSON_IsNull(instructions) ? strdup(instructions->valuestring) : NULL,
        voice ? voiceVariable : openai_api_realtime_session_VOICE_NULL,
        input_audio_format ? input_audio_formatVariable : openai_api_realtime_session_INPUTAUDIOFORMAT_NULL,
        output_audio_format ? output_audio_formatVariable : openai_api_realtime_session_OUTPUTAUDIOFORMAT_NULL,
        input_audio_transcription ? input_audio_transcription_local_nonprim : NULL,
        turn_detection ? turn_detection_local_nonprim : NULL,
        tools ? toolsList : NULL,
        tool_choice && !cJSON_IsNull(tool_choice) ? strdup(tool_choice->valuestring) : NULL,
        temperature ? temperature->valuedouble : 0,
        max_response_output_tokens ? max_response_output_tokens_local_nonprim : NULL
        );

    return realtime_session_local_var;
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
    if (model_local_nonprim) {
        realtime_session_model_free(model_local_nonprim);
        model_local_nonprim = NULL;
    }
    if (input_audio_transcription_local_nonprim) {
        realtime_session_input_audio_transcription_free(input_audio_transcription_local_nonprim);
        input_audio_transcription_local_nonprim = NULL;
    }
    if (turn_detection_local_nonprim) {
        realtime_session_turn_detection_free(turn_detection_local_nonprim);
        turn_detection_local_nonprim = NULL;
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
    return NULL;

}
