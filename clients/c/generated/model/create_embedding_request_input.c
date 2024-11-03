#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_embedding_request_input.h"



create_embedding_request_input_t *create_embedding_request_input_create(
    ) {
    create_embedding_request_input_t *create_embedding_request_input_local_var = malloc(sizeof(create_embedding_request_input_t));
    if (!create_embedding_request_input_local_var) {
        return NULL;
    }

    return create_embedding_request_input_local_var;
}


void create_embedding_request_input_free(create_embedding_request_input_t *create_embedding_request_input) {
    if(NULL == create_embedding_request_input){
        return ;
    }
    listEntry_t *listEntry;
    free(create_embedding_request_input);
}

cJSON *create_embedding_request_input_convertToJSON(create_embedding_request_input_t *create_embedding_request_input) {
    cJSON *item = cJSON_CreateObject();
    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

create_embedding_request_input_t *create_embedding_request_input_parseFromJSON(cJSON *create_embedding_request_inputJSON){

    create_embedding_request_input_t *create_embedding_request_input_local_var = NULL;


    create_embedding_request_input_local_var = create_embedding_request_input_create (
        );

    return create_embedding_request_input_local_var;
end:
    return NULL;

}
