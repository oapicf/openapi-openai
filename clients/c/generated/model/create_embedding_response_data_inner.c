#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_embedding_response_data_inner.h"



create_embedding_response_data_inner_t *create_embedding_response_data_inner_create(
    int index,
    char *object,
    list_t *embedding
    ) {
    create_embedding_response_data_inner_t *create_embedding_response_data_inner_local_var = malloc(sizeof(create_embedding_response_data_inner_t));
    if (!create_embedding_response_data_inner_local_var) {
        return NULL;
    }
    create_embedding_response_data_inner_local_var->index = index;
    create_embedding_response_data_inner_local_var->object = object;
    create_embedding_response_data_inner_local_var->embedding = embedding;

    return create_embedding_response_data_inner_local_var;
}


void create_embedding_response_data_inner_free(create_embedding_response_data_inner_t *create_embedding_response_data_inner) {
    if(NULL == create_embedding_response_data_inner){
        return ;
    }
    listEntry_t *listEntry;
    if (create_embedding_response_data_inner->object) {
        free(create_embedding_response_data_inner->object);
        create_embedding_response_data_inner->object = NULL;
    }
    if (create_embedding_response_data_inner->embedding) {
        list_ForEach(listEntry, create_embedding_response_data_inner->embedding) {
            free(listEntry->data);
        }
        list_freeList(create_embedding_response_data_inner->embedding);
        create_embedding_response_data_inner->embedding = NULL;
    }
    free(create_embedding_response_data_inner);
}

cJSON *create_embedding_response_data_inner_convertToJSON(create_embedding_response_data_inner_t *create_embedding_response_data_inner) {
    cJSON *item = cJSON_CreateObject();

    // create_embedding_response_data_inner->index
    if (!create_embedding_response_data_inner->index) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "index", create_embedding_response_data_inner->index) == NULL) {
    goto fail; //Numeric
    }


    // create_embedding_response_data_inner->object
    if (!create_embedding_response_data_inner->object) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "object", create_embedding_response_data_inner->object) == NULL) {
    goto fail; //String
    }


    // create_embedding_response_data_inner->embedding
    if (!create_embedding_response_data_inner->embedding) {
        goto fail;
    }
    cJSON *embedding = cJSON_AddArrayToObject(item, "embedding");
    if(embedding == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *embeddingListEntry;
    list_ForEach(embeddingListEntry, create_embedding_response_data_inner->embedding) {
    if(cJSON_AddNumberToObject(embedding, "", *(double *)embeddingListEntry->data) == NULL)
    {
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

create_embedding_response_data_inner_t *create_embedding_response_data_inner_parseFromJSON(cJSON *create_embedding_response_data_innerJSON){

    create_embedding_response_data_inner_t *create_embedding_response_data_inner_local_var = NULL;

    // define the local list for create_embedding_response_data_inner->embedding
    list_t *embeddingList = NULL;

    // create_embedding_response_data_inner->index
    cJSON *index = cJSON_GetObjectItemCaseSensitive(create_embedding_response_data_innerJSON, "index");
    if (!index) {
        goto end;
    }

    
    if(!cJSON_IsNumber(index))
    {
    goto end; //Numeric
    }

    // create_embedding_response_data_inner->object
    cJSON *object = cJSON_GetObjectItemCaseSensitive(create_embedding_response_data_innerJSON, "object");
    if (!object) {
        goto end;
    }

    
    if(!cJSON_IsString(object))
    {
    goto end; //String
    }

    // create_embedding_response_data_inner->embedding
    cJSON *embedding = cJSON_GetObjectItemCaseSensitive(create_embedding_response_data_innerJSON, "embedding");
    if (!embedding) {
        goto end;
    }

    
    cJSON *embedding_local = NULL;
    if(!cJSON_IsArray(embedding)) {
        goto end;//primitive container
    }
    embeddingList = list_createList();

    cJSON_ArrayForEach(embedding_local, embedding)
    {
        if(!cJSON_IsNumber(embedding_local))
        {
            goto end;
        }
        double *embedding_local_value = (double *)calloc(1, sizeof(double));
        if(!embedding_local_value)
        {
            goto end;
        }
        *embedding_local_value = embedding_local->valuedouble;
        list_addElement(embeddingList , embedding_local_value);
    }


    create_embedding_response_data_inner_local_var = create_embedding_response_data_inner_create (
        index->valuedouble,
        strdup(object->valuestring),
        embeddingList
        );

    return create_embedding_response_data_inner_local_var;
end:
    if (embeddingList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, embeddingList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(embeddingList);
        embeddingList = NULL;
    }
    return NULL;

}
