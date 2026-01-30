#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "realtime_conversation_item_content_inner.h"


char* realtime_conversation_item_content_inner_type_ToString(openai_api_realtime_conversation_item_content_inner_TYPE_e type) {
    char* typeArray[] =  { "NULL", "input_audio", "input_text", "item_reference", "text" };
    return typeArray[type];
}

openai_api_realtime_conversation_item_content_inner_TYPE_e realtime_conversation_item_content_inner_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "input_audio", "input_text", "item_reference", "text" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static realtime_conversation_item_content_inner_t *realtime_conversation_item_content_inner_create_internal(
    openai_api_realtime_conversation_item_content_inner_TYPE_e type,
    char *text,
    char *id,
    char *audio,
    char *transcript
    ) {
    realtime_conversation_item_content_inner_t *realtime_conversation_item_content_inner_local_var = malloc(sizeof(realtime_conversation_item_content_inner_t));
    if (!realtime_conversation_item_content_inner_local_var) {
        return NULL;
    }
    realtime_conversation_item_content_inner_local_var->type = type;
    realtime_conversation_item_content_inner_local_var->text = text;
    realtime_conversation_item_content_inner_local_var->id = id;
    realtime_conversation_item_content_inner_local_var->audio = audio;
    realtime_conversation_item_content_inner_local_var->transcript = transcript;

    realtime_conversation_item_content_inner_local_var->_library_owned = 1;
    return realtime_conversation_item_content_inner_local_var;
}

__attribute__((deprecated)) realtime_conversation_item_content_inner_t *realtime_conversation_item_content_inner_create(
    openai_api_realtime_conversation_item_content_inner_TYPE_e type,
    char *text,
    char *id,
    char *audio,
    char *transcript
    ) {
    return realtime_conversation_item_content_inner_create_internal (
        type,
        text,
        id,
        audio,
        transcript
        );
}

void realtime_conversation_item_content_inner_free(realtime_conversation_item_content_inner_t *realtime_conversation_item_content_inner) {
    if(NULL == realtime_conversation_item_content_inner){
        return ;
    }
    if(realtime_conversation_item_content_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "realtime_conversation_item_content_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (realtime_conversation_item_content_inner->text) {
        free(realtime_conversation_item_content_inner->text);
        realtime_conversation_item_content_inner->text = NULL;
    }
    if (realtime_conversation_item_content_inner->id) {
        free(realtime_conversation_item_content_inner->id);
        realtime_conversation_item_content_inner->id = NULL;
    }
    if (realtime_conversation_item_content_inner->audio) {
        free(realtime_conversation_item_content_inner->audio);
        realtime_conversation_item_content_inner->audio = NULL;
    }
    if (realtime_conversation_item_content_inner->transcript) {
        free(realtime_conversation_item_content_inner->transcript);
        realtime_conversation_item_content_inner->transcript = NULL;
    }
    free(realtime_conversation_item_content_inner);
}

cJSON *realtime_conversation_item_content_inner_convertToJSON(realtime_conversation_item_content_inner_t *realtime_conversation_item_content_inner) {
    cJSON *item = cJSON_CreateObject();

    // realtime_conversation_item_content_inner->type
    if(realtime_conversation_item_content_inner->type != openai_api_realtime_conversation_item_content_inner_TYPE_NULL) {
    if(cJSON_AddStringToObject(item, "type", realtime_conversation_item_content_inner_type_ToString(realtime_conversation_item_content_inner->type)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // realtime_conversation_item_content_inner->text
    if(realtime_conversation_item_content_inner->text) {
    if(cJSON_AddStringToObject(item, "text", realtime_conversation_item_content_inner->text) == NULL) {
    goto fail; //String
    }
    }


    // realtime_conversation_item_content_inner->id
    if(realtime_conversation_item_content_inner->id) {
    if(cJSON_AddStringToObject(item, "id", realtime_conversation_item_content_inner->id) == NULL) {
    goto fail; //String
    }
    }


    // realtime_conversation_item_content_inner->audio
    if(realtime_conversation_item_content_inner->audio) {
    if(cJSON_AddStringToObject(item, "audio", realtime_conversation_item_content_inner->audio) == NULL) {
    goto fail; //String
    }
    }


    // realtime_conversation_item_content_inner->transcript
    if(realtime_conversation_item_content_inner->transcript) {
    if(cJSON_AddStringToObject(item, "transcript", realtime_conversation_item_content_inner->transcript) == NULL) {
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

realtime_conversation_item_content_inner_t *realtime_conversation_item_content_inner_parseFromJSON(cJSON *realtime_conversation_item_content_innerJSON){

    realtime_conversation_item_content_inner_t *realtime_conversation_item_content_inner_local_var = NULL;

    // realtime_conversation_item_content_inner->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(realtime_conversation_item_content_innerJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    openai_api_realtime_conversation_item_content_inner_TYPE_e typeVariable;
    if (type) { 
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = realtime_conversation_item_content_inner_type_FromString(type->valuestring);
    }

    // realtime_conversation_item_content_inner->text
    cJSON *text = cJSON_GetObjectItemCaseSensitive(realtime_conversation_item_content_innerJSON, "text");
    if (cJSON_IsNull(text)) {
        text = NULL;
    }
    if (text) { 
    if(!cJSON_IsString(text) && !cJSON_IsNull(text))
    {
    goto end; //String
    }
    }

    // realtime_conversation_item_content_inner->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(realtime_conversation_item_content_innerJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // realtime_conversation_item_content_inner->audio
    cJSON *audio = cJSON_GetObjectItemCaseSensitive(realtime_conversation_item_content_innerJSON, "audio");
    if (cJSON_IsNull(audio)) {
        audio = NULL;
    }
    if (audio) { 
    if(!cJSON_IsString(audio) && !cJSON_IsNull(audio))
    {
    goto end; //String
    }
    }

    // realtime_conversation_item_content_inner->transcript
    cJSON *transcript = cJSON_GetObjectItemCaseSensitive(realtime_conversation_item_content_innerJSON, "transcript");
    if (cJSON_IsNull(transcript)) {
        transcript = NULL;
    }
    if (transcript) { 
    if(!cJSON_IsString(transcript) && !cJSON_IsNull(transcript))
    {
    goto end; //String
    }
    }


    realtime_conversation_item_content_inner_local_var = realtime_conversation_item_content_inner_create_internal (
        type ? typeVariable : openai_api_realtime_conversation_item_content_inner_TYPE_NULL,
        text && !cJSON_IsNull(text) ? strdup(text->valuestring) : NULL,
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL,
        audio && !cJSON_IsNull(audio) ? strdup(audio->valuestring) : NULL,
        transcript && !cJSON_IsNull(transcript) ? strdup(transcript->valuestring) : NULL
        );

    return realtime_conversation_item_content_inner_local_var;
end:
    return NULL;

}
