/*
 * upload_part.h
 *
 * The upload Part represents a chunk of bytes we can add to an Upload object. 
 */

#ifndef _upload_part_H_
#define _upload_part_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct upload_part_t upload_part_t;


// Enum OBJECT for upload_part

typedef enum  { openai_api_upload_part_OBJECT_NULL = 0, openai_api_upload_part_OBJECT_upload.part } openai_api_upload_part_OBJECT_e;

char* upload_part_object_ToString(openai_api_upload_part_OBJECT_e object);

openai_api_upload_part_OBJECT_e upload_part_object_FromString(char* object);



typedef struct upload_part_t {
    char *id; // string
    int created_at; //numeric
    char *upload_id; // string
    openai_api_upload_part_OBJECT_e object; //enum

    int _library_owned; // Is the library responsible for freeing this object?
} upload_part_t;

__attribute__((deprecated)) upload_part_t *upload_part_create(
    char *id,
    int created_at,
    char *upload_id,
    openai_api_upload_part_OBJECT_e object
);

void upload_part_free(upload_part_t *upload_part);

upload_part_t *upload_part_parseFromJSON(cJSON *upload_partJSON);

cJSON *upload_part_convertToJSON(upload_part_t *upload_part);

#endif /* _upload_part_H_ */

