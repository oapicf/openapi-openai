#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_speech_request_model.h"



create_speech_request_model_t *create_speech_request_model_create(
    ) {
    create_speech_request_model_t *create_speech_request_model_local_var = malloc(sizeof(create_speech_request_model_t));
    if (!create_speech_request_model_local_var) {
        return NULL;
    }

    return create_speech_request_model_local_var;
}


void create_speech_request_model_free(create_speech_request_model_t *create_speech_request_model) {
    if(NULL == create_speech_request_model){
        return ;
    }
    listEntry_t *listEntry;
    free(create_speech_request_model);
}

cJSON *create_speech_request_model_convertToJSON(create_speech_request_model_t *create_speech_request_model) {
    cJSON *item = cJSON_CreateObject();
    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

create_speech_request_model_t *create_speech_request_model_parseFromJSON(cJSON *create_speech_request_modelJSON){

    create_speech_request_model_t *create_speech_request_model_local_var = NULL;


    create_speech_request_model_local_var = create_speech_request_model_create (
        );

    return create_speech_request_model_local_var;
end:
    return NULL;

}
