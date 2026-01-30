/*
 * realtime_session_create_response_client_secret.h
 *
 * Ephemeral key returned by the API.
 */

#ifndef _realtime_session_create_response_client_secret_H_
#define _realtime_session_create_response_client_secret_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct realtime_session_create_response_client_secret_t realtime_session_create_response_client_secret_t;




typedef struct realtime_session_create_response_client_secret_t {
    char *value; // string
    int expires_at; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} realtime_session_create_response_client_secret_t;

__attribute__((deprecated)) realtime_session_create_response_client_secret_t *realtime_session_create_response_client_secret_create(
    char *value,
    int expires_at
);

void realtime_session_create_response_client_secret_free(realtime_session_create_response_client_secret_t *realtime_session_create_response_client_secret);

realtime_session_create_response_client_secret_t *realtime_session_create_response_client_secret_parseFromJSON(cJSON *realtime_session_create_response_client_secretJSON);

cJSON *realtime_session_create_response_client_secret_convertToJSON(realtime_session_create_response_client_secret_t *realtime_session_create_response_client_secret);

#endif /* _realtime_session_create_response_client_secret_H_ */

