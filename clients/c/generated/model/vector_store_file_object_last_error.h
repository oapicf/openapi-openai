/*
 * vector_store_file_object_last_error.h
 *
 * The last error associated with this vector store file. Will be &#x60;null&#x60; if there are no errors.
 */

#ifndef _vector_store_file_object_last_error_H_
#define _vector_store_file_object_last_error_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct vector_store_file_object_last_error_t vector_store_file_object_last_error_t;


// Enum CODE for vector_store_file_object_last_error

typedef enum  { openai_api_vector_store_file_object_last_error_CODE_NULL = 0, openai_api_vector_store_file_object_last_error_CODE_server_error, openai_api_vector_store_file_object_last_error_CODE_unsupported_file, openai_api_vector_store_file_object_last_error_CODE_invalid_file } openai_api_vector_store_file_object_last_error_CODE_e;

char* vector_store_file_object_last_error_code_ToString(openai_api_vector_store_file_object_last_error_CODE_e code);

openai_api_vector_store_file_object_last_error_CODE_e vector_store_file_object_last_error_code_FromString(char* code);



typedef struct vector_store_file_object_last_error_t {
    openai_api_vector_store_file_object_last_error_CODE_e code; //enum
    char *message; // string

    int _library_owned; // Is the library responsible for freeing this object?
} vector_store_file_object_last_error_t;

__attribute__((deprecated)) vector_store_file_object_last_error_t *vector_store_file_object_last_error_create(
    openai_api_vector_store_file_object_last_error_CODE_e code,
    char *message
);

void vector_store_file_object_last_error_free(vector_store_file_object_last_error_t *vector_store_file_object_last_error);

vector_store_file_object_last_error_t *vector_store_file_object_last_error_parseFromJSON(cJSON *vector_store_file_object_last_errorJSON);

cJSON *vector_store_file_object_last_error_convertToJSON(vector_store_file_object_last_error_t *vector_store_file_object_last_error);

#endif /* _vector_store_file_object_last_error_H_ */

