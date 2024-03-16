/*
 * open_ai_file.h
 *
 * 
 */

#ifndef _open_ai_file_H_
#define _open_ai_file_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct open_ai_file_t open_ai_file_t;

#include "object.h"



typedef struct open_ai_file_t {
    char *id; // string
    char *object; // string
    int bytes; //numeric
    int created_at; //numeric
    char *filename; // string
    char *purpose; // string
    char *status; // string
    object_t *status_details; //object

} open_ai_file_t;

open_ai_file_t *open_ai_file_create(
    char *id,
    char *object,
    int bytes,
    int created_at,
    char *filename,
    char *purpose,
    char *status,
    object_t *status_details
);

void open_ai_file_free(open_ai_file_t *open_ai_file);

open_ai_file_t *open_ai_file_parseFromJSON(cJSON *open_ai_fileJSON);

cJSON *open_ai_file_convertToJSON(open_ai_file_t *open_ai_file);

#endif /* _open_ai_file_H_ */

