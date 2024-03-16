#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_moderation_request_input.h"



create_moderation_request_input_t *create_moderation_request_input_create(
    ) {
    create_moderation_request_input_t *create_moderation_request_input_local_var = malloc(sizeof(create_moderation_request_input_t));
    if (!create_moderation_request_input_local_var) {
        return NULL;
    }

    return create_moderation_request_input_local_var;
}


void create_moderation_request_input_free(create_moderation_request_input_t *create_moderation_request_input) {
    if(NULL == create_moderation_request_input){
        return ;
    }
    listEntry_t *listEntry;
    free(create_moderation_request_input);
}

cJSON *create_moderation_request_input_convertToJSON(create_moderation_request_input_t *create_moderation_request_input) {
    cJSON *item = cJSON_CreateObject();
    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

create_moderation_request_input_t *create_moderation_request_input_parseFromJSON(cJSON *create_moderation_request_inputJSON){

    create_moderation_request_input_t *create_moderation_request_input_local_var = NULL;


    create_moderation_request_input_local_var = create_moderation_request_input_create (
        );

    return create_moderation_request_input_local_var;
end:
    return NULL;

}
