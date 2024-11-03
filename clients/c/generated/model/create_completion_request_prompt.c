#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_completion_request_prompt.h"



create_completion_request_prompt_t *create_completion_request_prompt_create(
    ) {
    create_completion_request_prompt_t *create_completion_request_prompt_local_var = malloc(sizeof(create_completion_request_prompt_t));
    if (!create_completion_request_prompt_local_var) {
        return NULL;
    }

    return create_completion_request_prompt_local_var;
}


void create_completion_request_prompt_free(create_completion_request_prompt_t *create_completion_request_prompt) {
    if(NULL == create_completion_request_prompt){
        return ;
    }
    listEntry_t *listEntry;
    free(create_completion_request_prompt);
}

cJSON *create_completion_request_prompt_convertToJSON(create_completion_request_prompt_t *create_completion_request_prompt) {
    cJSON *item = cJSON_CreateObject();
    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

create_completion_request_prompt_t *create_completion_request_prompt_parseFromJSON(cJSON *create_completion_request_promptJSON){

    create_completion_request_prompt_t *create_completion_request_prompt_local_var = NULL;


    create_completion_request_prompt_local_var = create_completion_request_prompt_create (
        );

    return create_completion_request_prompt_local_var;
end:
    return NULL;

}
