/*
 * realtime_response_status_details_error.h
 *
 * A description of the error that caused the response to fail,  populated when the &#x60;status&#x60; is &#x60;failed&#x60;. 
 */

#ifndef _realtime_response_status_details_error_H_
#define _realtime_response_status_details_error_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct realtime_response_status_details_error_t realtime_response_status_details_error_t;




typedef struct realtime_response_status_details_error_t {
    char *type; // string
    char *code; // string

    int _library_owned; // Is the library responsible for freeing this object?
} realtime_response_status_details_error_t;

__attribute__((deprecated)) realtime_response_status_details_error_t *realtime_response_status_details_error_create(
    char *type,
    char *code
);

void realtime_response_status_details_error_free(realtime_response_status_details_error_t *realtime_response_status_details_error);

realtime_response_status_details_error_t *realtime_response_status_details_error_parseFromJSON(cJSON *realtime_response_status_details_errorJSON);

cJSON *realtime_response_status_details_error_convertToJSON(realtime_response_status_details_error_t *realtime_response_status_details_error);

#endif /* _realtime_response_status_details_error_H_ */

