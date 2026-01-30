/*
 * create_batch_request.h
 *
 * 
 */

#ifndef _create_batch_request_H_
#define _create_batch_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_batch_request_t create_batch_request_t;


// Enum ENDPOINT for create_batch_request

typedef enum  { openai_api_create_batch_request_ENDPOINT_NULL = 0, openai_api_create_batch_request_ENDPOINT_/v1/chat/completions, openai_api_create_batch_request_ENDPOINT_/v1/embeddings, openai_api_create_batch_request_ENDPOINT_/v1/completions } openai_api_create_batch_request_ENDPOINT_e;

char* create_batch_request_endpoint_ToString(openai_api_create_batch_request_ENDPOINT_e endpoint);

openai_api_create_batch_request_ENDPOINT_e create_batch_request_endpoint_FromString(char* endpoint);

// Enum COMPLETIONWINDOW for create_batch_request

typedef enum  { openai_api_create_batch_request_COMPLETIONWINDOW_NULL = 0, openai_api_create_batch_request_COMPLETIONWINDOW__24h } openai_api_create_batch_request_COMPLETIONWINDOW_e;

char* create_batch_request_completion_window_ToString(openai_api_create_batch_request_COMPLETIONWINDOW_e completion_window);

openai_api_create_batch_request_COMPLETIONWINDOW_e create_batch_request_completion_window_FromString(char* completion_window);



typedef struct create_batch_request_t {
    char *input_file_id; // string
    openai_api_create_batch_request_ENDPOINT_e endpoint; //enum
    openai_api_create_batch_request_COMPLETIONWINDOW_e completion_window; //enum
    list_t* metadata; //map

    int _library_owned; // Is the library responsible for freeing this object?
} create_batch_request_t;

__attribute__((deprecated)) create_batch_request_t *create_batch_request_create(
    char *input_file_id,
    openai_api_create_batch_request_ENDPOINT_e endpoint,
    openai_api_create_batch_request_COMPLETIONWINDOW_e completion_window,
    list_t* metadata
);

void create_batch_request_free(create_batch_request_t *create_batch_request);

create_batch_request_t *create_batch_request_parseFromJSON(cJSON *create_batch_requestJSON);

cJSON *create_batch_request_convertToJSON(create_batch_request_t *create_batch_request);

#endif /* _create_batch_request_H_ */

