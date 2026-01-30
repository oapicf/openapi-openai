#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "realtime_server_event_response_content_part_added_part.h"


char* realtime_server_event_response_content_part_added_part_type_ToString(openai_api_realtime_server_event_response_content_part_added_part_TYPE_e type) {
    char* typeArray[] =  { "NULL", "audio", "text" };
    return typeArray[type];
}

openai_api_realtime_server_event_response_content_part_added_part_TYPE_e realtime_server_event_response_content_part_added_part_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "audio", "text" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static realtime_server_event_response_content_part_added_part_t *realtime_server_event_response_content_part_added_part_create_internal(
    openai_api_realtime_server_event_response_content_part_added_part_TYPE_e type,
    char *text,
    char *audio,
    char *transcript
    ) {
    realtime_server_event_response_content_part_added_part_t *realtime_server_event_response_content_part_added_part_local_var = malloc(sizeof(realtime_server_event_response_content_part_added_part_t));
    if (!realtime_server_event_response_content_part_added_part_local_var) {
        return NULL;
    }
    realtime_server_event_response_content_part_added_part_local_var->type = type;
    realtime_server_event_response_content_part_added_part_local_var->text = text;
    realtime_server_event_response_content_part_added_part_local_var->audio = audio;
    realtime_server_event_response_content_part_added_part_local_var->transcript = transcript;

    realtime_server_event_response_content_part_added_part_local_var->_library_owned = 1;
    return realtime_server_event_response_content_part_added_part_local_var;
}

__attribute__((deprecated)) realtime_server_event_response_content_part_added_part_t *realtime_server_event_response_content_part_added_part_create(
    openai_api_realtime_server_event_response_content_part_added_part_TYPE_e type,
    char *text,
    char *audio,
    char *transcript
    ) {
    return realtime_server_event_response_content_part_added_part_create_internal (
        type,
        text,
        audio,
        transcript
        );
}

void realtime_server_event_response_content_part_added_part_free(realtime_server_event_response_content_part_added_part_t *realtime_server_event_response_content_part_added_part) {
    if(NULL == realtime_server_event_response_content_part_added_part){
        return ;
    }
    if(realtime_server_event_response_content_part_added_part->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "realtime_server_event_response_content_part_added_part_free");
        return ;
    }
    listEntry_t *listEntry;
    if (realtime_server_event_response_content_part_added_part->text) {
        free(realtime_server_event_response_content_part_added_part->text);
        realtime_server_event_response_content_part_added_part->text = NULL;
    }
    if (realtime_server_event_response_content_part_added_part->audio) {
        free(realtime_server_event_response_content_part_added_part->audio);
        realtime_server_event_response_content_part_added_part->audio = NULL;
    }
    if (realtime_server_event_response_content_part_added_part->transcript) {
        free(realtime_server_event_response_content_part_added_part->transcript);
        realtime_server_event_response_content_part_added_part->transcript = NULL;
    }
    free(realtime_server_event_response_content_part_added_part);
}

cJSON *realtime_server_event_response_content_part_added_part_convertToJSON(realtime_server_event_response_content_part_added_part_t *realtime_server_event_response_content_part_added_part) {
    cJSON *item = cJSON_CreateObject();

    // realtime_server_event_response_content_part_added_part->type
    if(realtime_server_event_response_content_part_added_part->type != openai_api_realtime_server_event_response_content_part_added_part_TYPE_NULL) {
    if(cJSON_AddStringToObject(item, "type", realtime_server_event_response_content_part_added_part_type_ToString(realtime_server_event_response_content_part_added_part->type)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // realtime_server_event_response_content_part_added_part->text
    if(realtime_server_event_response_content_part_added_part->text) {
    if(cJSON_AddStringToObject(item, "text", realtime_server_event_response_content_part_added_part->text) == NULL) {
    goto fail; //String
    }
    }


    // realtime_server_event_response_content_part_added_part->audio
    if(realtime_server_event_response_content_part_added_part->audio) {
    if(cJSON_AddStringToObject(item, "audio", realtime_server_event_response_content_part_added_part->audio) == NULL) {
    goto fail; //String
    }
    }


    // realtime_server_event_response_content_part_added_part->transcript
    if(realtime_server_event_response_content_part_added_part->transcript) {
    if(cJSON_AddStringToObject(item, "transcript", realtime_server_event_response_content_part_added_part->transcript) == NULL) {
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

realtime_server_event_response_content_part_added_part_t *realtime_server_event_response_content_part_added_part_parseFromJSON(cJSON *realtime_server_event_response_content_part_added_partJSON){

    realtime_server_event_response_content_part_added_part_t *realtime_server_event_response_content_part_added_part_local_var = NULL;

    // realtime_server_event_response_content_part_added_part->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(realtime_server_event_response_content_part_added_partJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    openai_api_realtime_server_event_response_content_part_added_part_TYPE_e typeVariable;
    if (type) { 
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = realtime_server_event_response_content_part_added_part_type_FromString(type->valuestring);
    }

    // realtime_server_event_response_content_part_added_part->text
    cJSON *text = cJSON_GetObjectItemCaseSensitive(realtime_server_event_response_content_part_added_partJSON, "text");
    if (cJSON_IsNull(text)) {
        text = NULL;
    }
    if (text) { 
    if(!cJSON_IsString(text) && !cJSON_IsNull(text))
    {
    goto end; //String
    }
    }

    // realtime_server_event_response_content_part_added_part->audio
    cJSON *audio = cJSON_GetObjectItemCaseSensitive(realtime_server_event_response_content_part_added_partJSON, "audio");
    if (cJSON_IsNull(audio)) {
        audio = NULL;
    }
    if (audio) { 
    if(!cJSON_IsString(audio) && !cJSON_IsNull(audio))
    {
    goto end; //String
    }
    }

    // realtime_server_event_response_content_part_added_part->transcript
    cJSON *transcript = cJSON_GetObjectItemCaseSensitive(realtime_server_event_response_content_part_added_partJSON, "transcript");
    if (cJSON_IsNull(transcript)) {
        transcript = NULL;
    }
    if (transcript) { 
    if(!cJSON_IsString(transcript) && !cJSON_IsNull(transcript))
    {
    goto end; //String
    }
    }


    realtime_server_event_response_content_part_added_part_local_var = realtime_server_event_response_content_part_added_part_create_internal (
        type ? typeVariable : openai_api_realtime_server_event_response_content_part_added_part_TYPE_NULL,
        text && !cJSON_IsNull(text) ? strdup(text->valuestring) : NULL,
        audio && !cJSON_IsNull(audio) ? strdup(audio->valuestring) : NULL,
        transcript && !cJSON_IsNull(transcript) ? strdup(transcript->valuestring) : NULL
        );

    return realtime_server_event_response_content_part_added_part_local_var;
end:
    return NULL;

}
