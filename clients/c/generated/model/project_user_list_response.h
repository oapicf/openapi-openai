/*
 * project_user_list_response.h
 *
 * 
 */

#ifndef _project_user_list_response_H_
#define _project_user_list_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct project_user_list_response_t project_user_list_response_t;

#include "project_user.h"



typedef struct project_user_list_response_t {
    char *object; // string
    list_t *data; //nonprimitive container
    char *first_id; // string
    char *last_id; // string
    int has_more; //boolean

    int _library_owned; // Is the library responsible for freeing this object?
} project_user_list_response_t;

__attribute__((deprecated)) project_user_list_response_t *project_user_list_response_create(
    char *object,
    list_t *data,
    char *first_id,
    char *last_id,
    int has_more
);

void project_user_list_response_free(project_user_list_response_t *project_user_list_response);

project_user_list_response_t *project_user_list_response_parseFromJSON(cJSON *project_user_list_responseJSON);

cJSON *project_user_list_response_convertToJSON(project_user_list_response_t *project_user_list_response);

#endif /* _project_user_list_response_H_ */

