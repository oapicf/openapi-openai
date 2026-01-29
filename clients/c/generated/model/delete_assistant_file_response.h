/*
 * delete_assistant_file_response.h
 *
 * Deletes the association between the assistant and the file, but does not delete the [File](/docs/api-reference/files) object itself.
 */

#ifndef _delete_assistant_file_response_H_
#define _delete_assistant_file_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct delete_assistant_file_response_t delete_assistant_file_response_t;


// Enum OBJECT for delete_assistant_file_response

typedef enum  { openai_api_delete_assistant_file_response_OBJECT_NULL = 0, openai_api_delete_assistant_file_response_OBJECT_assistant.file.deleted } openai_api_delete_assistant_file_response_OBJECT_e;

char* delete_assistant_file_response_object_ToString(openai_api_delete_assistant_file_response_OBJECT_e object);

openai_api_delete_assistant_file_response_OBJECT_e delete_assistant_file_response_object_FromString(char* object);



typedef struct delete_assistant_file_response_t {
    char *id; // string
    int deleted; //boolean
    openai_api_delete_assistant_file_response_OBJECT_e object; //enum

    int _library_owned; // Is the library responsible for freeing this object?
} delete_assistant_file_response_t;

__attribute__((deprecated)) delete_assistant_file_response_t *delete_assistant_file_response_create(
    char *id,
    int deleted,
    openai_api_delete_assistant_file_response_OBJECT_e object
);

void delete_assistant_file_response_free(delete_assistant_file_response_t *delete_assistant_file_response);

delete_assistant_file_response_t *delete_assistant_file_response_parseFromJSON(cJSON *delete_assistant_file_responseJSON);

cJSON *delete_assistant_file_response_convertToJSON(delete_assistant_file_response_t *delete_assistant_file_response);

#endif /* _delete_assistant_file_response_H_ */

