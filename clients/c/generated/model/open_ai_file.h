/*
 * open_ai_file.h
 *
 * The &#x60;File&#x60; object represents a document that has been uploaded to OpenAI.
 */

#ifndef _open_ai_file_H_
#define _open_ai_file_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct open_ai_file_t open_ai_file_t;


// Enum OBJECT for open_ai_file

typedef enum  { openai_api_open_ai_file_OBJECT_NULL = 0, openai_api_open_ai_file_OBJECT_file } openai_api_open_ai_file_OBJECT_e;

char* open_ai_file_object_ToString(openai_api_open_ai_file_OBJECT_e object);

openai_api_open_ai_file_OBJECT_e open_ai_file_object_FromString(char* object);

// Enum PURPOSE for open_ai_file

typedef enum  { openai_api_open_ai_file_PURPOSE_NULL = 0, openai_api_open_ai_file_PURPOSE_assistants, openai_api_open_ai_file_PURPOSE_assistants_output, openai_api_open_ai_file_PURPOSE_batch, openai_api_open_ai_file_PURPOSE_batch_output, openai_api_open_ai_file_PURPOSE_fine_tune, openai_api_open_ai_file_PURPOSE_fine_tune_results, openai_api_open_ai_file_PURPOSE_vision } openai_api_open_ai_file_PURPOSE_e;

char* open_ai_file_purpose_ToString(openai_api_open_ai_file_PURPOSE_e purpose);

openai_api_open_ai_file_PURPOSE_e open_ai_file_purpose_FromString(char* purpose);

// Enum STATUS for open_ai_file

typedef enum  { openai_api_open_ai_file_STATUS_NULL = 0, openai_api_open_ai_file_STATUS_uploaded, openai_api_open_ai_file_STATUS_processed, openai_api_open_ai_file_STATUS_error } openai_api_open_ai_file_STATUS_e;

char* open_ai_file_status_ToString(openai_api_open_ai_file_STATUS_e status);

openai_api_open_ai_file_STATUS_e open_ai_file_status_FromString(char* status);



typedef struct open_ai_file_t {
    char *id; // string
    int bytes; //numeric
    int created_at; //numeric
    char *filename; // string
    openai_api_open_ai_file_OBJECT_e object; //enum
    openai_api_open_ai_file_PURPOSE_e purpose; //enum
    openai_api_open_ai_file_STATUS_e status; //enum
    char *status_details; // string

    int _library_owned; // Is the library responsible for freeing this object?
} open_ai_file_t;

__attribute__((deprecated)) open_ai_file_t *open_ai_file_create(
    char *id,
    int bytes,
    int created_at,
    char *filename,
    openai_api_open_ai_file_OBJECT_e object,
    openai_api_open_ai_file_PURPOSE_e purpose,
    openai_api_open_ai_file_STATUS_e status,
    char *status_details
);

void open_ai_file_free(open_ai_file_t *open_ai_file);

open_ai_file_t *open_ai_file_parseFromJSON(cJSON *open_ai_fileJSON);

cJSON *open_ai_file_convertToJSON(open_ai_file_t *open_ai_file);

#endif /* _open_ai_file_H_ */

