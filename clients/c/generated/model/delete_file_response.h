/*
 * delete_file_response.h
 *
 * 
 */

#ifndef _delete_file_response_H_
#define _delete_file_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct delete_file_response_t delete_file_response_t;




typedef struct delete_file_response_t {
    char *id; // string
    char *object; // string
    int deleted; //boolean

} delete_file_response_t;

delete_file_response_t *delete_file_response_create(
    char *id,
    char *object,
    int deleted
);

void delete_file_response_free(delete_file_response_t *delete_file_response);

delete_file_response_t *delete_file_response_parseFromJSON(cJSON *delete_file_responseJSON);

cJSON *delete_file_response_convertToJSON(delete_file_response_t *delete_file_response);

#endif /* _delete_file_response_H_ */

