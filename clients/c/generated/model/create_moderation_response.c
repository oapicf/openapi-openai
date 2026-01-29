#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_moderation_response.h"



static create_moderation_response_t *create_moderation_response_create_internal(
    char *id,
    char *model,
    list_t *results
    ) {
    create_moderation_response_t *create_moderation_response_local_var = malloc(sizeof(create_moderation_response_t));
    if (!create_moderation_response_local_var) {
        return NULL;
    }
    create_moderation_response_local_var->id = id;
    create_moderation_response_local_var->model = model;
    create_moderation_response_local_var->results = results;

    create_moderation_response_local_var->_library_owned = 1;
    return create_moderation_response_local_var;
}

__attribute__((deprecated)) create_moderation_response_t *create_moderation_response_create(
    char *id,
    char *model,
    list_t *results
    ) {
    return create_moderation_response_create_internal (
        id,
        model,
        results
        );
}

void create_moderation_response_free(create_moderation_response_t *create_moderation_response) {
    if(NULL == create_moderation_response){
        return ;
    }
    if(create_moderation_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "create_moderation_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (create_moderation_response->id) {
        free(create_moderation_response->id);
        create_moderation_response->id = NULL;
    }
    if (create_moderation_response->model) {
        free(create_moderation_response->model);
        create_moderation_response->model = NULL;
    }
    if (create_moderation_response->results) {
        list_ForEach(listEntry, create_moderation_response->results) {
            create_moderation_response_results_inner_free(listEntry->data);
        }
        list_freeList(create_moderation_response->results);
        create_moderation_response->results = NULL;
    }
    free(create_moderation_response);
}

cJSON *create_moderation_response_convertToJSON(create_moderation_response_t *create_moderation_response) {
    cJSON *item = cJSON_CreateObject();

    // create_moderation_response->id
    if (!create_moderation_response->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", create_moderation_response->id) == NULL) {
    goto fail; //String
    }


    // create_moderation_response->model
    if (!create_moderation_response->model) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "model", create_moderation_response->model) == NULL) {
    goto fail; //String
    }


    // create_moderation_response->results
    if (!create_moderation_response->results) {
        goto fail;
    }
    cJSON *results = cJSON_AddArrayToObject(item, "results");
    if(results == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *resultsListEntry;
    if (create_moderation_response->results) {
    list_ForEach(resultsListEntry, create_moderation_response->results) {
    cJSON *itemLocal = create_moderation_response_results_inner_convertToJSON(resultsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(results, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

create_moderation_response_t *create_moderation_response_parseFromJSON(cJSON *create_moderation_responseJSON){

    create_moderation_response_t *create_moderation_response_local_var = NULL;

    // define the local list for create_moderation_response->results
    list_t *resultsList = NULL;

    // create_moderation_response->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(create_moderation_responseJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }

    // create_moderation_response->model
    cJSON *model = cJSON_GetObjectItemCaseSensitive(create_moderation_responseJSON, "model");
    if (cJSON_IsNull(model)) {
        model = NULL;
    }
    if (!model) {
        goto end;
    }

    
    if(!cJSON_IsString(model))
    {
    goto end; //String
    }

    // create_moderation_response->results
    cJSON *results = cJSON_GetObjectItemCaseSensitive(create_moderation_responseJSON, "results");
    if (cJSON_IsNull(results)) {
        results = NULL;
    }
    if (!results) {
        goto end;
    }

    
    cJSON *results_local_nonprimitive = NULL;
    if(!cJSON_IsArray(results)){
        goto end; //nonprimitive container
    }

    resultsList = list_createList();

    cJSON_ArrayForEach(results_local_nonprimitive,results )
    {
        if(!cJSON_IsObject(results_local_nonprimitive)){
            goto end;
        }
        create_moderation_response_results_inner_t *resultsItem = create_moderation_response_results_inner_parseFromJSON(results_local_nonprimitive);

        list_addElement(resultsList, resultsItem);
    }


    create_moderation_response_local_var = create_moderation_response_create_internal (
        strdup(id->valuestring),
        strdup(model->valuestring),
        resultsList
        );

    return create_moderation_response_local_var;
end:
    if (resultsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, resultsList) {
            create_moderation_response_results_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(resultsList);
        resultsList = NULL;
    }
    return NULL;

}
