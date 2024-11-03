#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_chat_completion_request_stop.h"



create_chat_completion_request_stop_t *create_chat_completion_request_stop_create(
    ) {
    create_chat_completion_request_stop_t *create_chat_completion_request_stop_local_var = malloc(sizeof(create_chat_completion_request_stop_t));
    if (!create_chat_completion_request_stop_local_var) {
        return NULL;
    }

    return create_chat_completion_request_stop_local_var;
}


void create_chat_completion_request_stop_free(create_chat_completion_request_stop_t *create_chat_completion_request_stop) {
    if(NULL == create_chat_completion_request_stop){
        return ;
    }
    listEntry_t *listEntry;
    free(create_chat_completion_request_stop);
}

cJSON *create_chat_completion_request_stop_convertToJSON(create_chat_completion_request_stop_t *create_chat_completion_request_stop) {
    cJSON *item = cJSON_CreateObject();
    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

create_chat_completion_request_stop_t *create_chat_completion_request_stop_parseFromJSON(cJSON *create_chat_completion_request_stopJSON){

    create_chat_completion_request_stop_t *create_chat_completion_request_stop_local_var = NULL;


    create_chat_completion_request_stop_local_var = create_chat_completion_request_stop_create (
        );

    return create_chat_completion_request_stop_local_var;
end:
    return NULL;

}
