#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "embedding.h"


char* embedding_object_ToString(openai_api_embedding_OBJECT_e object) {
    char* objectArray[] =  { "NULL", "embedding" };
    return objectArray[object];
}

openai_api_embedding_OBJECT_e embedding_object_FromString(char* object){
    int stringToReturn = 0;
    char *objectArray[] =  { "NULL", "embedding" };
    size_t sizeofArray = sizeof(objectArray) / sizeof(objectArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(object, objectArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static embedding_t *embedding_create_internal(
    int index,
    list_t *embedding,
    openai_api_embedding_OBJECT_e object
    ) {
    embedding_t *embedding_local_var = malloc(sizeof(embedding_t));
    if (!embedding_local_var) {
        return NULL;
    }
    embedding_local_var->index = index;
    embedding_local_var->embedding = embedding;
    embedding_local_var->object = object;

    embedding_local_var->_library_owned = 1;
    return embedding_local_var;
}

__attribute__((deprecated)) embedding_t *embedding_create(
    int index,
    list_t *embedding,
    openai_api_embedding_OBJECT_e object
    ) {
    return embedding_create_internal (
        index,
        embedding,
        object
        );
}

void embedding_free(embedding_t *embedding) {
    if(NULL == embedding){
        return ;
    }
    if(embedding->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "embedding_free");
        return ;
    }
    listEntry_t *listEntry;
    if (embedding->embedding) {
        list_ForEach(listEntry, embedding->embedding) {
            free(listEntry->data);
        }
        list_freeList(embedding->embedding);
        embedding->embedding = NULL;
    }
    free(embedding);
}

cJSON *embedding_convertToJSON(embedding_t *embedding) {
    cJSON *item = cJSON_CreateObject();

    // embedding->index
    if (!embedding->index) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "index", embedding->index) == NULL) {
    goto fail; //Numeric
    }


    // embedding->embedding
    if (!embedding->embedding) {
        goto fail;
    }
    cJSON *embedding = cJSON_AddArrayToObject(item, "embedding");
    if(embedding == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *embeddingListEntry;
    list_ForEach(embeddingListEntry, embedding->embedding) {
    if(cJSON_AddNumberToObject(embedding, "", *(double *)embeddingListEntry->data) == NULL)
    {
        goto fail;
    }
    }


    // embedding->object
    if (openai_api_embedding_OBJECT_NULL == embedding->object) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "object", embedding_object_ToString(embedding->object)) == NULL)
    {
    goto fail; //Enum
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

embedding_t *embedding_parseFromJSON(cJSON *embeddingJSON){

    embedding_t *embedding_local_var = NULL;

    // define the local list for embedding->embedding
    list_t *embeddingList = NULL;

    // embedding->index
    cJSON *index = cJSON_GetObjectItemCaseSensitive(embeddingJSON, "index");
    if (cJSON_IsNull(index)) {
        index = NULL;
    }
    if (!index) {
        goto end;
    }

    
    if(!cJSON_IsNumber(index))
    {
    goto end; //Numeric
    }

    // embedding->embedding
    cJSON *embedding = cJSON_GetObjectItemCaseSensitive(embeddingJSON, "embedding");
    if (cJSON_IsNull(embedding)) {
        embedding = NULL;
    }
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
        double *embedding_local_value = calloc(1, sizeof(double));
        if(!embedding_local_value)
        {
            goto end;
        }
        *embedding_local_value = embedding_local->valuedouble;
        list_addElement(embeddingList , embedding_local_value);
    }

    // embedding->object
    cJSON *object = cJSON_GetObjectItemCaseSensitive(embeddingJSON, "object");
    if (cJSON_IsNull(object)) {
        object = NULL;
    }
    if (!object) {
        goto end;
    }

    openai_api_embedding_OBJECT_e objectVariable;
    
    if(!cJSON_IsString(object))
    {
    goto end; //Enum
    }
    objectVariable = embedding_object_FromString(object->valuestring);


    embedding_local_var = embedding_create_internal (
        index->valuedouble,
        embeddingList,
        objectVariable
        );

    return embedding_local_var;
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
