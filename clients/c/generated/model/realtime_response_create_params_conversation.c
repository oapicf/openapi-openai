#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "realtime_response_create_params_conversation.h"



static realtime_response_create_params_conversation_t *realtime_response_create_params_conversation_create_internal(
    ) {
    realtime_response_create_params_conversation_t *realtime_response_create_params_conversation_local_var = malloc(sizeof(realtime_response_create_params_conversation_t));
    if (!realtime_response_create_params_conversation_local_var) {
        return NULL;
    }

    realtime_response_create_params_conversation_local_var->_library_owned = 1;
    return realtime_response_create_params_conversation_local_var;
}

__attribute__((deprecated)) realtime_response_create_params_conversation_t *realtime_response_create_params_conversation_create(
    ) {
    return realtime_response_create_params_conversation_create_internal (
        );
}

void realtime_response_create_params_conversation_free(realtime_response_create_params_conversation_t *realtime_response_create_params_conversation) {
    if(NULL == realtime_response_create_params_conversation){
        return ;
    }
    if(realtime_response_create_params_conversation->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "realtime_response_create_params_conversation_free");
        return ;
    }
    listEntry_t *listEntry;
    free(realtime_response_create_params_conversation);
}

cJSON *realtime_response_create_params_conversation_convertToJSON(realtime_response_create_params_conversation_t *realtime_response_create_params_conversation) {
    cJSON *item = cJSON_CreateObject();
    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

realtime_response_create_params_conversation_t *realtime_response_create_params_conversation_parseFromJSON(cJSON *realtime_response_create_params_conversationJSON){

    realtime_response_create_params_conversation_t *realtime_response_create_params_conversation_local_var = NULL;


    realtime_response_create_params_conversation_local_var = realtime_response_create_params_conversation_create_internal (
        );

    return realtime_response_create_params_conversation_local_var;
end:
    return NULL;

}
