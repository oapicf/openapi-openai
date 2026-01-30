/*
 * project.h
 *
 * Represents an individual project.
 */

#ifndef _project_H_
#define _project_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct project_t project_t;


// Enum OBJECT for project

typedef enum  { openai_api_project_OBJECT_NULL = 0, openai_api_project_OBJECT_organization.project } openai_api_project_OBJECT_e;

char* project_object_ToString(openai_api_project_OBJECT_e object);

openai_api_project_OBJECT_e project_object_FromString(char* object);

// Enum STATUS for project

typedef enum  { openai_api_project_STATUS_NULL = 0, openai_api_project_STATUS_active, openai_api_project_STATUS_archived } openai_api_project_STATUS_e;

char* project_status_ToString(openai_api_project_STATUS_e status);

openai_api_project_STATUS_e project_status_FromString(char* status);



typedef struct project_t {
    char *id; // string
    openai_api_project_OBJECT_e object; //enum
    char *name; // string
    int created_at; //numeric
    int archived_at; //numeric
    openai_api_project_STATUS_e status; //enum

    int _library_owned; // Is the library responsible for freeing this object?
} project_t;

__attribute__((deprecated)) project_t *project_create(
    char *id,
    openai_api_project_OBJECT_e object,
    char *name,
    int created_at,
    int archived_at,
    openai_api_project_STATUS_e status
);

void project_free(project_t *project);

project_t *project_parseFromJSON(cJSON *projectJSON);

cJSON *project_convertToJSON(project_t *project);

#endif /* _project_H_ */

