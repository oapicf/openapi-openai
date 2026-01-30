#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_vector_store_file_batch_request.h"



static create_vector_store_file_batch_request_t *create_vector_store_file_batch_request_create_internal(
    list_t *file_ids,
    chunking_strategy_request_param_t *chunking_strategy
    ) {
    create_vector_store_file_batch_request_t *create_vector_store_file_batch_request_local_var = malloc(sizeof(create_vector_store_file_batch_request_t));
    if (!create_vector_store_file_batch_request_local_var) {
        return NULL;
    }
    create_vector_store_file_batch_request_local_var->file_ids = file_ids;
    create_vector_store_file_batch_request_local_var->chunking_strategy = chunking_strategy;

    create_vector_store_file_batch_request_local_var->_library_owned = 1;
    return create_vector_store_file_batch_request_local_var;
}

__attribute__((deprecated)) create_vector_store_file_batch_request_t *create_vector_store_file_batch_request_create(
    list_t *file_ids,
    chunking_strategy_request_param_t *chunking_strategy
    ) {
    return create_vector_store_file_batch_request_create_internal (
        file_ids,
        chunking_strategy
        );
}

void create_vector_store_file_batch_request_free(create_vector_store_file_batch_request_t *create_vector_store_file_batch_request) {
    if(NULL == create_vector_store_file_batch_request){
        return ;
    }
    if(create_vector_store_file_batch_request->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "create_vector_store_file_batch_request_free");
        return ;
    }
    listEntry_t *listEntry;
    if (create_vector_store_file_batch_request->file_ids) {
        list_ForEach(listEntry, create_vector_store_file_batch_request->file_ids) {
            free(listEntry->data);
        }
        list_freeList(create_vector_store_file_batch_request->file_ids);
        create_vector_store_file_batch_request->file_ids = NULL;
    }
    if (create_vector_store_file_batch_request->chunking_strategy) {
        chunking_strategy_request_param_free(create_vector_store_file_batch_request->chunking_strategy);
        create_vector_store_file_batch_request->chunking_strategy = NULL;
    }
    free(create_vector_store_file_batch_request);
}

cJSON *create_vector_store_file_batch_request_convertToJSON(create_vector_store_file_batch_request_t *create_vector_store_file_batch_request) {
    cJSON *item = cJSON_CreateObject();

    // create_vector_store_file_batch_request->file_ids
    if (!create_vector_store_file_batch_request->file_ids) {
        goto fail;
    }
    cJSON *file_ids = cJSON_AddArrayToObject(item, "file_ids");
    if(file_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *file_idsListEntry;
    list_ForEach(file_idsListEntry, create_vector_store_file_batch_request->file_ids) {
    if(cJSON_AddStringToObject(file_ids, "", file_idsListEntry->data) == NULL)
    {
        goto fail;
    }
    }


    // create_vector_store_file_batch_request->chunking_strategy
    if(create_vector_store_file_batch_request->chunking_strategy) {
    cJSON *chunking_strategy_local_JSON = chunking_strategy_request_param_convertToJSON(create_vector_store_file_batch_request->chunking_strategy);
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

create_vector_store_file_batch_request_t *create_vector_store_file_batch_request_parseFromJSON(cJSON *create_vector_store_file_batch_requestJSON){

    create_vector_store_file_batch_request_t *create_vector_store_file_batch_request_local_var = NULL;

    // define the local list for create_vector_store_file_batch_request->file_ids
    list_t *file_idsList = NULL;

    // define the local variable for create_vector_store_file_batch_request->chunking_strategy
    chunking_strategy_request_param_t *chunking_strategy_local_nonprim = NULL;

    // create_vector_store_file_batch_request->file_ids
    cJSON *file_ids = cJSON_GetObjectItemCaseSensitive(create_vector_store_file_batch_requestJSON, "file_ids");
    if (cJSON_IsNull(file_ids)) {
        file_ids = NULL;
    }
    if (!file_ids) {
        goto end;
    }

    
    cJSON *file_ids_local = NULL;
    if(!cJSON_IsArray(file_ids)) {
        goto end;//primitive container
    }
    file_idsList = list_createList();

    cJSON_ArrayForEach(file_ids_local, file_ids)
    {
        if(!cJSON_IsString(file_ids_local))
        {
            goto end;
        }
        list_addElement(file_idsList , strdup(file_ids_local->valuestring));
    }

    // create_vector_store_file_batch_request->chunking_strategy
    cJSON *chunking_strategy = cJSON_GetObjectItemCaseSensitive(create_vector_store_file_batch_requestJSON, "chunking_strategy");
    if (cJSON_IsNull(chunking_strategy)) {
        chunking_strategy = NULL;
    }
    if (chunking_strategy) { 
    chunking_strategy_local_nonprim = chunking_strategy_request_param_parseFromJSON(chunking_strategy); //nonprimitive
    }


    create_vector_store_file_batch_request_local_var = create_vector_store_file_batch_request_create_internal (
        file_idsList,
        chunking_strategy ? chunking_strategy_local_nonprim : NULL
        );

    return create_vector_store_file_batch_request_local_var;
end:
    if (file_idsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, file_idsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(file_idsList);
        file_idsList = NULL;
    }
    if (chunking_strategy_local_nonprim) {
        chunking_strategy_request_param_free(chunking_strategy_local_nonprim);
        chunking_strategy_local_nonprim = NULL;
    }
    return NULL;

}
