/*
 * vector_store_object_file_counts.h
 *
 * 
 */

#ifndef _vector_store_object_file_counts_H_
#define _vector_store_object_file_counts_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct vector_store_object_file_counts_t vector_store_object_file_counts_t;




typedef struct vector_store_object_file_counts_t {
    int in_progress; //numeric
    int completed; //numeric
    int failed; //numeric
    int cancelled; //numeric
    int total; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} vector_store_object_file_counts_t;

__attribute__((deprecated)) vector_store_object_file_counts_t *vector_store_object_file_counts_create(
    int in_progress,
    int completed,
    int failed,
    int cancelled,
    int total
);

void vector_store_object_file_counts_free(vector_store_object_file_counts_t *vector_store_object_file_counts);

vector_store_object_file_counts_t *vector_store_object_file_counts_parseFromJSON(cJSON *vector_store_object_file_countsJSON);

cJSON *vector_store_object_file_counts_convertToJSON(vector_store_object_file_counts_t *vector_store_object_file_counts);

#endif /* _vector_store_object_file_counts_H_ */

