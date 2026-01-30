/*
 * vector_store_object.h
 *
 * A vector store is a collection of processed files can be used by the &#x60;file_search&#x60; tool.
 */

#ifndef _vector_store_object_H_
#define _vector_store_object_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct vector_store_object_t vector_store_object_t;

#include "object.h"
#include "vector_store_expiration_after.h"
#include "vector_store_object_file_counts.h"

// Enum OBJECT for vector_store_object

typedef enum  { openai_api_vector_store_object_OBJECT_NULL = 0, openai_api_vector_store_object_OBJECT_vector_store } openai_api_vector_store_object_OBJECT_e;

char* vector_store_object_object_ToString(openai_api_vector_store_object_OBJECT_e object);

openai_api_vector_store_object_OBJECT_e vector_store_object_object_FromString(char* object);

// Enum STATUS for vector_store_object

typedef enum  { openai_api_vector_store_object_STATUS_NULL = 0, openai_api_vector_store_object_STATUS_expired, openai_api_vector_store_object_STATUS_in_progress, openai_api_vector_store_object_STATUS_completed } openai_api_vector_store_object_STATUS_e;

char* vector_store_object_status_ToString(openai_api_vector_store_object_STATUS_e status);

openai_api_vector_store_object_STATUS_e vector_store_object_status_FromString(char* status);



typedef struct vector_store_object_t {
    char *id; // string
    openai_api_vector_store_object_OBJECT_e object; //enum
    int created_at; //numeric
    char *name; // string
    int usage_bytes; //numeric
    struct vector_store_object_file_counts_t *file_counts; //model
    openai_api_vector_store_object_STATUS_e status; //enum
    struct vector_store_expiration_after_t *expires_after; //model
    int expires_at; //numeric
    int last_active_at; //numeric
    object_t *metadata; //object

    int _library_owned; // Is the library responsible for freeing this object?
} vector_store_object_t;

__attribute__((deprecated)) vector_store_object_t *vector_store_object_create(
    char *id,
    openai_api_vector_store_object_OBJECT_e object,
    int created_at,
    char *name,
    int usage_bytes,
    vector_store_object_file_counts_t *file_counts,
    openai_api_vector_store_object_STATUS_e status,
    vector_store_expiration_after_t *expires_after,
    int expires_at,
    int last_active_at,
    object_t *metadata
);

void vector_store_object_free(vector_store_object_t *vector_store_object);

vector_store_object_t *vector_store_object_parseFromJSON(cJSON *vector_store_objectJSON);

cJSON *vector_store_object_convertToJSON(vector_store_object_t *vector_store_object);

#endif /* _vector_store_object_H_ */

