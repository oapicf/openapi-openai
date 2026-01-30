/*
 * vector_store_expiration_after.h
 *
 * The expiration policy for a vector store.
 */

#ifndef _vector_store_expiration_after_H_
#define _vector_store_expiration_after_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct vector_store_expiration_after_t vector_store_expiration_after_t;


// Enum ANCHOR for vector_store_expiration_after

typedef enum  { openai_api_vector_store_expiration_after_ANCHOR_NULL = 0, openai_api_vector_store_expiration_after_ANCHOR_last_active_at } openai_api_vector_store_expiration_after_ANCHOR_e;

char* vector_store_expiration_after_anchor_ToString(openai_api_vector_store_expiration_after_ANCHOR_e anchor);

openai_api_vector_store_expiration_after_ANCHOR_e vector_store_expiration_after_anchor_FromString(char* anchor);



typedef struct vector_store_expiration_after_t {
    openai_api_vector_store_expiration_after_ANCHOR_e anchor; //enum
    int days; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} vector_store_expiration_after_t;

__attribute__((deprecated)) vector_store_expiration_after_t *vector_store_expiration_after_create(
    openai_api_vector_store_expiration_after_ANCHOR_e anchor,
    int days
);

void vector_store_expiration_after_free(vector_store_expiration_after_t *vector_store_expiration_after);

vector_store_expiration_after_t *vector_store_expiration_after_parseFromJSON(cJSON *vector_store_expiration_afterJSON);

cJSON *vector_store_expiration_after_convertToJSON(vector_store_expiration_after_t *vector_store_expiration_after);

#endif /* _vector_store_expiration_after_H_ */

