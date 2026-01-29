#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_completion_request_stop.h"



static create_completion_request_stop_t *create_completion_request_stop_create_internal(
    ) {
    create_completion_request_stop_t *create_completion_request_stop_local_var = malloc(sizeof(create_completion_request_stop_t));
    if (!create_completion_request_stop_local_var) {
        return NULL;
    }

    create_completion_request_stop_local_var->_library_owned = 1;
    return create_completion_request_stop_local_var;
}

__attribute__((deprecated)) create_completion_request_stop_t *create_completion_request_stop_create(
    ) {
    return create_completion_request_stop_create_internal (
        );
}

void create_completion_request_stop_free(create_completion_request_stop_t *create_completion_request_stop) {
    if(NULL == create_completion_request_stop){
        return ;
    }
    if(create_completion_request_stop->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "create_completion_request_stop_free");
        return ;
    }
    listEntry_t *listEntry;
    free(create_completion_request_stop);
}

cJSON *create_completion_request_stop_convertToJSON(create_completion_request_stop_t *create_completion_request_stop) {
    cJSON *item = cJSON_CreateObject();
    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

create_completion_request_stop_t *create_completion_request_stop_parseFromJSON(cJSON *create_completion_request_stopJSON){

    create_completion_request_stop_t *create_completion_request_stop_local_var = NULL;


    create_completion_request_stop_local_var = create_completion_request_stop_create_internal (
        );

    return create_completion_request_stop_local_var;
end:
    return NULL;

}
