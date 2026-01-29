/*
 * message_object_incomplete_details.h
 *
 * On an incomplete message, details about why the message is incomplete.
 */

#ifndef _message_object_incomplete_details_H_
#define _message_object_incomplete_details_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct message_object_incomplete_details_t message_object_incomplete_details_t;


// Enum REASON for message_object_incomplete_details

typedef enum  { openai_api_message_object_incomplete_details_REASON_NULL = 0, openai_api_message_object_incomplete_details_REASON_content_filter, openai_api_message_object_incomplete_details_REASON_max_tokens, openai_api_message_object_incomplete_details_REASON_run_cancelled, openai_api_message_object_incomplete_details_REASON_run_expired, openai_api_message_object_incomplete_details_REASON_run_failed } openai_api_message_object_incomplete_details_REASON_e;

char* message_object_incomplete_details_reason_ToString(openai_api_message_object_incomplete_details_REASON_e reason);

openai_api_message_object_incomplete_details_REASON_e message_object_incomplete_details_reason_FromString(char* reason);



typedef struct message_object_incomplete_details_t {
    openai_api_message_object_incomplete_details_REASON_e reason; //enum

    int _library_owned; // Is the library responsible for freeing this object?
} message_object_incomplete_details_t;

__attribute__((deprecated)) message_object_incomplete_details_t *message_object_incomplete_details_create(
    openai_api_message_object_incomplete_details_REASON_e reason
);

void message_object_incomplete_details_free(message_object_incomplete_details_t *message_object_incomplete_details);

message_object_incomplete_details_t *message_object_incomplete_details_parseFromJSON(cJSON *message_object_incomplete_detailsJSON);

cJSON *message_object_incomplete_details_convertToJSON(message_object_incomplete_details_t *message_object_incomplete_details);

#endif /* _message_object_incomplete_details_H_ */

