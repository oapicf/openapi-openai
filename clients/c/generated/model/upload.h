/*
 * upload.h
 *
 * The Upload object can accept byte chunks in the form of Parts. 
 */

#ifndef _upload_H_
#define _upload_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct upload_t upload_t;

#include "open_ai_file.h"

// Enum STATUS for upload

typedef enum  { openai_api_upload_STATUS_NULL = 0, openai_api_upload_STATUS_pending, openai_api_upload_STATUS_completed, openai_api_upload_STATUS_cancelled, openai_api_upload_STATUS_expired } openai_api_upload_STATUS_e;

char* upload_status_ToString(openai_api_upload_STATUS_e status);

openai_api_upload_STATUS_e upload_status_FromString(char* status);

// Enum OBJECT for upload

typedef enum  { openai_api_upload_OBJECT_NULL = 0, openai_api_upload_OBJECT_upload } openai_api_upload_OBJECT_e;

char* upload_object_ToString(openai_api_upload_OBJECT_e object);

openai_api_upload_OBJECT_e upload_object_FromString(char* object);



typedef struct upload_t {
    char *id; // string
    int created_at; //numeric
    char *filename; // string
    int bytes; //numeric
    char *purpose; // string
    openai_api_upload_STATUS_e status; //enum
    int expires_at; //numeric
    openai_api_upload_OBJECT_e object; //enum
    struct open_ai_file_t *file; //model

    int _library_owned; // Is the library responsible for freeing this object?
} upload_t;

__attribute__((deprecated)) upload_t *upload_create(
    char *id,
    int created_at,
    char *filename,
    int bytes,
    char *purpose,
    openai_api_upload_STATUS_e status,
    int expires_at,
    openai_api_upload_OBJECT_e object,
    open_ai_file_t *file
);

void upload_free(upload_t *upload);

upload_t *upload_parseFromJSON(cJSON *uploadJSON);

cJSON *upload_convertToJSON(upload_t *upload);

#endif /* _upload_H_ */

