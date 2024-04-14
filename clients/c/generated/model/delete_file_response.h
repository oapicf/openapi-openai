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


// Enum OBJECT for delete_file_response

typedef enum  { openai_api_delete_file_response_OBJECT_NULL = 0, openai_api_delete_file_response_OBJECT_file } openai_api_delete_file_response_OBJECT_e;

char* delete_file_response_object_ToString(openai_api_delete_file_response_OBJECT_e object);

openai_api_delete_file_response_OBJECT_e delete_file_response_object_FromString(char* object);



typedef struct delete_file_response_t {
    char *id; // string
    openai_api_delete_file_response_OBJECT_e object; //enum
    int deleted; //boolean

} delete_file_response_t;

delete_file_response_t *delete_file_response_create(
    char *id,
    openai_api_delete_file_response_OBJECT_e object,
    int deleted
);

void delete_file_response_free(delete_file_response_t *delete_file_response);

delete_file_response_t *delete_file_response_parseFromJSON(cJSON *delete_file_responseJSON);

cJSON *delete_file_response_convertToJSON(delete_file_response_t *delete_file_response);

#endif /* _delete_file_response_H_ */

