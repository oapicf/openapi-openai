#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_vector_store_file_request.h"



static create_vector_store_file_request_t *create_vector_store_file_request_create_internal(
    char *file_id,
    chunking_strategy_request_param_t *chunking_strategy
    ) {
    create_vector_store_file_request_t *create_vector_store_file_request_local_var = malloc(sizeof(create_vector_store_file_request_t));
    if (!create_vector_store_file_request_local_var) {
        return NULL;
    }
    create_vector_store_file_request_local_var->file_id = file_id;
    create_vector_store_file_request_local_var->chunking_strategy = chunking_strategy;

    create_vector_store_file_request_local_var->_library_owned = 1;
    return create_vector_store_file_request_local_var;
}

__attribute__((deprecated)) create_vector_store_file_request_t *create_vector_store_file_request_create(
    char *file_id,
    chunking_strategy_request_param_t *chunking_strategy
    ) {
    return create_vector_store_file_request_create_internal (
        file_id,
        chunking_strategy
        );
}

void create_vector_store_file_request_free(create_vector_store_file_request_t *create_vector_store_file_request) {
    if(NULL == create_vector_store_file_request){
        return ;
    }
    if(create_vector_store_file_request->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "create_vector_store_file_request_free");
        return ;
    }
    listEntry_t *listEntry;
    if (create_vector_store_file_request->file_id) {
        free(create_vector_store_file_request->file_id);
        create_vector_store_file_request->file_id = NULL;
    }
    if (create_vector_store_file_request->chunking_strategy) {
        chunking_strategy_request_param_free(create_vector_store_file_request->chunking_strategy);
        create_vector_store_file_request->chunking_strategy = NULL;
    }
    free(create_vector_store_file_request);
}

cJSON *create_vector_store_file_request_convertToJSON(create_vector_store_file_request_t *create_vector_store_file_request) {
    cJSON *item = cJSON_CreateObject();

    // create_vector_store_file_request->file_id
    if (!create_vector_store_file_request->file_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "file_id", create_vector_store_file_request->file_id) == NULL) {
    goto fail; //String
    }


    // create_vector_store_file_request->chunking_strategy
    if(create_vector_store_file_request->chunking_strategy) {
    cJSON *chunking_strategy_local_JSON = chunking_strategy_request_param_convertToJSON(create_vector_store_file_request->chunking_strategy);
    if(chunking_strategy_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "chunking_strategy", chunking_strategy_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

create_vector_store_file_request_t *create_vector_store_file_request_parseFromJSON(cJSON *create_vector_store_file_requestJSON){

    create_vector_store_file_request_t *create_vector_store_file_request_local_var = NULL;

    // define the local variable for create_vector_store_file_request->chunking_strategy
    chunking_strategy_request_param_t *chunking_strategy_local_nonprim = NULL;

    // create_vector_store_file_request->file_id
    cJSON *file_id = cJSON_GetObjectItemCaseSensitive(create_vector_store_file_requestJSON, "file_id");
    if (cJSON_IsNull(file_id)) {
        file_id = NULL;
    }
    if (!file_id) {
        goto end;
    }

    
    if(!cJSON_IsString(file_id))
    {
    goto end; //String
    }

    // create_vector_store_file_request->chunking_strategy
    cJSON *chunking_strategy = cJSON_GetObjectItemCaseSensitive(create_vector_store_file_requestJSON, "chunking_strategy");
    if (cJSON_IsNull(chunking_strategy)) {
        chunking_strategy = NULL;
    }
    if (chunking_strategy) { 
    chunking_strategy_local_nonprim = chunking_strategy_request_param_parseFromJSON(chunking_strategy); //nonprimitive
    }


    create_vector_store_file_request_local_var = create_vector_store_file_request_create_internal (
        strdup(file_id->valuestring),
        chunking_strategy ? chunking_strategy_local_nonprim : NULL
        );

    return create_vector_store_file_request_local_var;
end:
    if (chunking_strategy_local_nonprim) {
        chunking_strategy_request_param_free(chunking_strategy_local_nonprim);
        chunking_strategy_local_nonprim = NULL;
    }
    return NULL;

}
