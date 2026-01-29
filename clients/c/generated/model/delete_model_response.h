/*
 * delete_model_response.h
 *
 * 
 */

#ifndef _delete_model_response_H_
#define _delete_model_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct delete_model_response_t delete_model_response_t;




typedef struct delete_model_response_t {
    char *id; // string
    int deleted; //boolean
    char *object; // string

    int _library_owned; // Is the library responsible for freeing this object?
} delete_model_response_t;

__attribute__((deprecated)) delete_model_response_t *delete_model_response_create(
    char *id,
    int deleted,
    char *object
);

void delete_model_response_free(delete_model_response_t *delete_model_response);

delete_model_response_t *delete_model_response_parseFromJSON(cJSON *delete_model_responseJSON);

cJSON *delete_model_response_convertToJSON(delete_model_response_t *delete_model_response);

#endif /* _delete_model_response_H_ */

