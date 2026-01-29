#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_moderation_request_input.h"



static create_moderation_request_input_t *create_moderation_request_input_create_internal(
    ) {
    create_moderation_request_input_t *create_moderation_request_input_local_var = malloc(sizeof(create_moderation_request_input_t));
    if (!create_moderation_request_input_local_var) {
        return NULL;
    }

    create_moderation_request_input_local_var->_library_owned = 1;
    return create_moderation_request_input_local_var;
}

__attribute__((deprecated)) create_moderation_request_input_t *create_moderation_request_input_create(
    ) {
    return create_moderation_request_input_create_internal (
        );
}

void create_moderation_request_input_free(create_moderation_request_input_t *create_moderation_request_input) {
    if(NULL == create_moderation_request_input){
        return ;
    }
    if(create_moderation_request_input->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "create_moderation_request_input_free");
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


    create_moderation_request_input_local_var = create_moderation_request_input_create_internal (
        );

    return create_moderation_request_input_local_var;
end:
    return NULL;

}
