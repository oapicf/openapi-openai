#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "realtime_session_turn_detection.h"


char* realtime_session_turn_detection_type_ToString(openai_api_realtime_session_turn_detection_TYPE_e type) {
    char* typeArray[] =  { "NULL", "server_vad" };
    return typeArray[type];
}

openai_api_realtime_session_turn_detection_TYPE_e realtime_session_turn_detection_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "server_vad" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static realtime_session_turn_detection_t *realtime_session_turn_detection_create_internal(
    openai_api_realtime_session_turn_detection_TYPE_e type,
    double threshold,
    int prefix_padding_ms,
    int silence_duration_ms
    ) {
    realtime_session_turn_detection_t *realtime_session_turn_detection_local_var = malloc(sizeof(realtime_session_turn_detection_t));
    if (!realtime_session_turn_detection_local_var) {
        return NULL;
    }
    realtime_session_turn_detection_local_var->type = type;
    realtime_session_turn_detection_local_var->threshold = threshold;
    realtime_session_turn_detection_local_var->prefix_padding_ms = prefix_padding_ms;
    realtime_session_turn_detection_local_var->silence_duration_ms = silence_duration_ms;

    realtime_session_turn_detection_local_var->_library_owned = 1;
    return realtime_session_turn_detection_local_var;
}

__attribute__((deprecated)) realtime_session_turn_detection_t *realtime_session_turn_detection_create(
    openai_api_realtime_session_turn_detection_TYPE_e type,
    double threshold,
    int prefix_padding_ms,
    int silence_duration_ms
    ) {
    return realtime_session_turn_detection_create_internal (
        type,
        threshold,
        prefix_padding_ms,
        silence_duration_ms
        );
}

void realtime_session_turn_detection_free(realtime_session_turn_detection_t *realtime_session_turn_detection) {
    if(NULL == realtime_session_turn_detection){
        return ;
    }
    if(realtime_session_turn_detection->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "realtime_session_turn_detection_free");
        return ;
    }
    listEntry_t *listEntry;
    free(realtime_session_turn_detection);
}

cJSON *realtime_session_turn_detection_convertToJSON(realtime_session_turn_detection_t *realtime_session_turn_detection) {
    cJSON *item = cJSON_CreateObject();

    // realtime_session_turn_detection->type
    if(realtime_session_turn_detection->type != openai_api_realtime_session_turn_detection_TYPE_NULL) {
    if(cJSON_AddStringToObject(item, "type", realtime_session_turn_detection_type_ToString(realtime_session_turn_detection->type)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // realtime_session_turn_detection->threshold
    if(realtime_session_turn_detection->threshold) {
    if(cJSON_AddNumberToObject(item, "threshold", realtime_session_turn_detection->threshold) == NULL) {
    goto fail; //Numeric
    }
    }


    // realtime_session_turn_detection->prefix_padding_ms
    if(realtime_session_turn_detection->prefix_padding_ms) {
    if(cJSON_AddNumberToObject(item, "prefix_padding_ms", realtime_session_turn_detection->prefix_padding_ms) == NULL) {
    goto fail; //Numeric
    }
    }


    // realtime_session_turn_detection->silence_duration_ms
    if(realtime_session_turn_detection->silence_duration_ms) {
    if(cJSON_AddNumberToObject(item, "silence_duration_ms", realtime_session_turn_detection->silence_duration_ms) == NULL) {
    goto fail; //Numeric
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

realtime_session_turn_detection_t *realtime_session_turn_detection_parseFromJSON(cJSON *realtime_session_turn_detectionJSON){

    realtime_session_turn_detection_t *realtime_session_turn_detection_local_var = NULL;

    // realtime_session_turn_detection->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(realtime_session_turn_detectionJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    openai_api_realtime_session_turn_detection_TYPE_e typeVariable;
    if (type) { 
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = realtime_session_turn_detection_type_FromString(type->valuestring);
    }

    // realtime_session_turn_detection->threshold
    cJSON *threshold = cJSON_GetObjectItemCaseSensitive(realtime_session_turn_detectionJSON, "threshold");
    if (cJSON_IsNull(threshold)) {
        threshold = NULL;
    }
    if (threshold) { 
    if(!cJSON_IsNumber(threshold))
    {
    goto end; //Numeric
    }
    }

    // realtime_session_turn_detection->prefix_padding_ms
    cJSON *prefix_padding_ms = cJSON_GetObjectItemCaseSensitive(realtime_session_turn_detectionJSON, "prefix_padding_ms");
    if (cJSON_IsNull(prefix_padding_ms)) {
        prefix_padding_ms = NULL;
    }
    if (prefix_padding_ms) { 
    if(!cJSON_IsNumber(prefix_padding_ms))
    {
    goto end; //Numeric
    }
    }

    // realtime_session_turn_detection->silence_duration_ms
    cJSON *silence_duration_ms = cJSON_GetObjectItemCaseSensitive(realtime_session_turn_detectionJSON, "silence_duration_ms");
    if (cJSON_IsNull(silence_duration_ms)) {
        silence_duration_ms = NULL;
    }
    if (silence_duration_ms) { 
    if(!cJSON_IsNumber(silence_duration_ms))
    {
    goto end; //Numeric
    }
    }


    realtime_session_turn_detection_local_var = realtime_session_turn_detection_create_internal (
        type ? typeVariable : openai_api_realtime_session_turn_detection_TYPE_NULL,
        threshold ? threshold->valuedouble : 0,
        prefix_padding_ms ? prefix_padding_ms->valuedouble : 0,
        silence_duration_ms ? silence_duration_ms->valuedouble : 0
        );

    return realtime_session_turn_detection_local_var;
end:
    return NULL;

}
