#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "realtime_session_input_audio_transcription.h"



static realtime_session_input_audio_transcription_t *realtime_session_input_audio_transcription_create_internal(
    char *model
    ) {
    realtime_session_input_audio_transcription_t *realtime_session_input_audio_transcription_local_var = malloc(sizeof(realtime_session_input_audio_transcription_t));
    if (!realtime_session_input_audio_transcription_local_var) {
        return NULL;
    }
    realtime_session_input_audio_transcription_local_var->model = model;

    realtime_session_input_audio_transcription_local_var->_library_owned = 1;
    return realtime_session_input_audio_transcription_local_var;
}

__attribute__((deprecated)) realtime_session_input_audio_transcription_t *realtime_session_input_audio_transcription_create(
    char *model
    ) {
    return realtime_session_input_audio_transcription_create_internal (
        model
        );
}

void realtime_session_input_audio_transcription_free(realtime_session_input_audio_transcription_t *realtime_session_input_audio_transcription) {
    if(NULL == realtime_session_input_audio_transcription){
        return ;
    }
    if(realtime_session_input_audio_transcription->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "realtime_session_input_audio_transcription_free");
        return ;
    }
    listEntry_t *listEntry;
    if (realtime_session_input_audio_transcription->model) {
        free(realtime_session_input_audio_transcription->model);
        realtime_session_input_audio_transcription->model = NULL;
    }
    free(realtime_session_input_audio_transcription);
}

cJSON *realtime_session_input_audio_transcription_convertToJSON(realtime_session_input_audio_transcription_t *realtime_session_input_audio_transcription) {
    cJSON *item = cJSON_CreateObject();

    // realtime_session_input_audio_transcription->model
    if(realtime_session_input_audio_transcription->model) {
    if(cJSON_AddStringToObject(item, "model", realtime_session_input_audio_transcription->model) == NULL) {
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

realtime_session_input_audio_transcription_t *realtime_session_input_audio_transcription_parseFromJSON(cJSON *realtime_session_input_audio_transcriptionJSON){

    realtime_session_input_audio_transcription_t *realtime_session_input_audio_transcription_local_var = NULL;

    // realtime_session_input_audio_transcription->model
    cJSON *model = cJSON_GetObjectItemCaseSensitive(realtime_session_input_audio_transcriptionJSON, "model");
    if (cJSON_IsNull(model)) {
        model = NULL;
    }
    if (model) { 
    if(!cJSON_IsString(model) && !cJSON_IsNull(model))
    {
    goto end; //String
    }
    }


    realtime_session_input_audio_transcription_local_var = realtime_session_input_audio_transcription_create_internal (
        model && !cJSON_IsNull(model) ? strdup(model->valuestring) : NULL
        );

    return realtime_session_input_audio_transcription_local_var;
end:
    return NULL;

}
