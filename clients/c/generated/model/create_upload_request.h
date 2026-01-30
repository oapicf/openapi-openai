/*
 * create_upload_request.h
 *
 * 
 */

#ifndef _create_upload_request_H_
#define _create_upload_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_upload_request_t create_upload_request_t;


// Enum PURPOSE for create_upload_request

typedef enum  { openai_api_create_upload_request_PURPOSE_NULL = 0, openai_api_create_upload_request_PURPOSE_assistants, openai_api_create_upload_request_PURPOSE_batch, openai_api_create_upload_request_PURPOSE_fine_tune, openai_api_create_upload_request_PURPOSE_vision } openai_api_create_upload_request_PURPOSE_e;

char* create_upload_request_purpose_ToString(openai_api_create_upload_request_PURPOSE_e purpose);

openai_api_create_upload_request_PURPOSE_e create_upload_request_purpose_FromString(char* purpose);



typedef struct create_upload_request_t {
    char *filename; // string
    openai_api_create_upload_request_PURPOSE_e purpose; //enum
    int bytes; //numeric
    char *mime_type; // string

    int _library_owned; // Is the library responsible for freeing this object?
} create_upload_request_t;

__attribute__((deprecated)) create_upload_request_t *create_upload_request_create(
    char *filename,
    openai_api_create_upload_request_PURPOSE_e purpose,
    int bytes,
    char *mime_type
);

void create_upload_request_free(create_upload_request_t *create_upload_request);

create_upload_request_t *create_upload_request_parseFromJSON(cJSON *create_upload_requestJSON);

cJSON *create_upload_request_convertToJSON(create_upload_request_t *create_upload_request);

#endif /* _create_upload_request_H_ */

