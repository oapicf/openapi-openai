/*
 * complete_upload_request.h
 *
 * 
 */

#ifndef _complete_upload_request_H_
#define _complete_upload_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct complete_upload_request_t complete_upload_request_t;




typedef struct complete_upload_request_t {
    list_t *part_ids; //primitive container
    char *md5; // string

    int _library_owned; // Is the library responsible for freeing this object?
} complete_upload_request_t;

__attribute__((deprecated)) complete_upload_request_t *complete_upload_request_create(
    list_t *part_ids,
    char *md5
);

void complete_upload_request_free(complete_upload_request_t *complete_upload_request);

complete_upload_request_t *complete_upload_request_parseFromJSON(cJSON *complete_upload_requestJSON);

cJSON *complete_upload_request_convertToJSON(complete_upload_request_t *complete_upload_request);

#endif /* _complete_upload_request_H_ */

