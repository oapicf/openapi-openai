/*
 * vector_store_file_batch_object.h
 *
 * A batch of files attached to a vector store.
 */

#ifndef _vector_store_file_batch_object_H_
#define _vector_store_file_batch_object_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct vector_store_file_batch_object_t vector_store_file_batch_object_t;

#include "vector_store_file_batch_object_file_counts.h"

// Enum OBJECT for vector_store_file_batch_object

typedef enum  { openai_api_vector_store_file_batch_object_OBJECT_NULL = 0, openai_api_vector_store_file_batch_object_OBJECT_vector_store.files_batch } openai_api_vector_store_file_batch_object_OBJECT_e;

char* vector_store_file_batch_object_object_ToString(openai_api_vector_store_file_batch_object_OBJECT_e object);

openai_api_vector_store_file_batch_object_OBJECT_e vector_store_file_batch_object_object_FromString(char* object);

// Enum STATUS for vector_store_file_batch_object

typedef enum  { openai_api_vector_store_file_batch_object_STATUS_NULL = 0, openai_api_vector_store_file_batch_object_STATUS_in_progress, openai_api_vector_store_file_batch_object_STATUS_completed, openai_api_vector_store_file_batch_object_STATUS_cancelled, openai_api_vector_store_file_batch_object_STATUS_failed } openai_api_vector_store_file_batch_object_STATUS_e;

char* vector_store_file_batch_object_status_ToString(openai_api_vector_store_file_batch_object_STATUS_e status);

openai_api_vector_store_file_batch_object_STATUS_e vector_store_file_batch_object_status_FromString(char* status);



typedef struct vector_store_file_batch_object_t {
    char *id; // string
    openai_api_vector_store_file_batch_object_OBJECT_e object; //enum
    int created_at; //numeric
    char *vector_store_id; // string
    openai_api_vector_store_file_batch_object_STATUS_e status; //enum
    struct vector_store_file_batch_object_file_counts_t *file_counts; //model

    int _library_owned; // Is the library responsible for freeing this object?
} vector_store_file_batch_object_t;

__attribute__((deprecated)) vector_store_file_batch_object_t *vector_store_file_batch_object_create(
    char *id,
    openai_api_vector_store_file_batch_object_OBJECT_e object,
    int created_at,
    char *vector_store_id,
    openai_api_vector_store_file_batch_object_STATUS_e status,
    vector_store_file_batch_object_file_counts_t *file_counts
);

void vector_store_file_batch_object_free(vector_store_file_batch_object_t *vector_store_file_batch_object);

vector_store_file_batch_object_t *vector_store_file_batch_object_parseFromJSON(cJSON *vector_store_file_batch_objectJSON);

cJSON *vector_store_file_batch_object_convertToJSON(vector_store_file_batch_object_t *vector_store_file_batch_object);

#endif /* _vector_store_file_batch_object_H_ */

