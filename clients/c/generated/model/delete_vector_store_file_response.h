/*
 * delete_vector_store_file_response.h
 *
 * 
 */

#ifndef _delete_vector_store_file_response_H_
#define _delete_vector_store_file_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct delete_vector_store_file_response_t delete_vector_store_file_response_t;


// Enum OBJECT for delete_vector_store_file_response

typedef enum  { openai_api_delete_vector_store_file_response_OBJECT_NULL = 0, openai_api_delete_vector_store_file_response_OBJECT_vector_store.file.deleted } openai_api_delete_vector_store_file_response_OBJECT_e;

char* delete_vector_store_file_response_object_ToString(openai_api_delete_vector_store_file_response_OBJECT_e object);

openai_api_delete_vector_store_file_response_OBJECT_e delete_vector_store_file_response_object_FromString(char* object);



typedef struct delete_vector_store_file_response_t {
    char *id; // string
    int deleted; //boolean
    openai_api_delete_vector_store_file_response_OBJECT_e object; //enum

    int _library_owned; // Is the library responsible for freeing this object?
} delete_vector_store_file_response_t;

__attribute__((deprecated)) delete_vector_store_file_response_t *delete_vector_store_file_response_create(
    char *id,
    int deleted,
    openai_api_delete_vector_store_file_response_OBJECT_e object
);

void delete_vector_store_file_response_free(delete_vector_store_file_response_t *delete_vector_store_file_response);

delete_vector_store_file_response_t *delete_vector_store_file_response_parseFromJSON(cJSON *delete_vector_store_file_responseJSON);

cJSON *delete_vector_store_file_response_convertToJSON(delete_vector_store_file_response_t *delete_vector_store_file_response);

#endif /* _delete_vector_store_file_response_H_ */

