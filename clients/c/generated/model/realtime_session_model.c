#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "realtime_session_model.h"



static realtime_session_model_t *realtime_session_model_create_internal(
    ) {
    realtime_session_model_t *realtime_session_model_local_var = malloc(sizeof(realtime_session_model_t));
    if (!realtime_session_model_local_var) {
        return NULL;
    }

    realtime_session_model_local_var->_library_owned = 1;
    return realtime_session_model_local_var;
}

__attribute__((deprecated)) realtime_session_model_t *realtime_session_model_create(
    ) {
    return realtime_session_model_create_internal (
        );
}

void realtime_session_model_free(realtime_session_model_t *realtime_session_model) {
    if(NULL == realtime_session_model){
        return ;
    }
    if(realtime_session_model->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "realtime_session_model_free");
        return ;
    }
    listEntry_t *listEntry;
    free(realtime_session_model);
}

cJSON *realtime_session_model_convertToJSON(realtime_session_model_t *realtime_session_model) {
    cJSON *item = cJSON_CreateObject();
    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

realtime_session_model_t *realtime_session_model_parseFromJSON(cJSON *realtime_session_modelJSON){

    realtime_session_model_t *realtime_session_model_local_var = NULL;


    realtime_session_model_local_var = realtime_session_model_create_internal (
        );

    return realtime_session_model_local_var;
end:
    return NULL;

}
