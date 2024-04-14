/*
 * embedding.h
 *
 * Represents an embedding vector returned by embedding endpoint. 
 */

#ifndef _embedding_H_
#define _embedding_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct embedding_t embedding_t;


// Enum OBJECT for embedding

typedef enum  { openai_api_embedding_OBJECT_NULL = 0, openai_api_embedding_OBJECT_embedding } openai_api_embedding_OBJECT_e;

char* embedding_object_ToString(openai_api_embedding_OBJECT_e object);

openai_api_embedding_OBJECT_e embedding_object_FromString(char* object);



typedef struct embedding_t {
    int index; //numeric
    list_t *embedding; //primitive container
    openai_api_embedding_OBJECT_e object; //enum

} embedding_t;

embedding_t *embedding_create(
    int index,
    list_t *embedding,
    openai_api_embedding_OBJECT_e object
);

void embedding_free(embedding_t *embedding);

embedding_t *embedding_parseFromJSON(cJSON *embeddingJSON);

cJSON *embedding_convertToJSON(embedding_t *embedding);

#endif /* _embedding_H_ */

