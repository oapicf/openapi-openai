/*
 * list_audit_logs_response.h
 *
 * 
 */

#ifndef _list_audit_logs_response_H_
#define _list_audit_logs_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct list_audit_logs_response_t list_audit_logs_response_t;

#include "audit_log.h"

// Enum OBJECT for list_audit_logs_response

typedef enum  { openai_api_list_audit_logs_response_OBJECT_NULL = 0, openai_api_list_audit_logs_response_OBJECT_list } openai_api_list_audit_logs_response_OBJECT_e;

char* list_audit_logs_response_object_ToString(openai_api_list_audit_logs_response_OBJECT_e object);

openai_api_list_audit_logs_response_OBJECT_e list_audit_logs_response_object_FromString(char* object);



typedef struct list_audit_logs_response_t {
    openai_api_list_audit_logs_response_OBJECT_e object; //enum
    list_t *data; //nonprimitive container
    char *first_id; // string
    char *last_id; // string
    int has_more; //boolean

    int _library_owned; // Is the library responsible for freeing this object?
} list_audit_logs_response_t;

__attribute__((deprecated)) list_audit_logs_response_t *list_audit_logs_response_create(
    openai_api_list_audit_logs_response_OBJECT_e object,
    list_t *data,
    char *first_id,
    char *last_id,
    int has_more
);

void list_audit_logs_response_free(list_audit_logs_response_t *list_audit_logs_response);

list_audit_logs_response_t *list_audit_logs_response_parseFromJSON(cJSON *list_audit_logs_responseJSON);

cJSON *list_audit_logs_response_convertToJSON(list_audit_logs_response_t *list_audit_logs_response);

#endif /* _list_audit_logs_response_H_ */

