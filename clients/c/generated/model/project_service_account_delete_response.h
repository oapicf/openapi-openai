/*
 * project_service_account_delete_response.h
 *
 * 
 */

#ifndef _project_service_account_delete_response_H_
#define _project_service_account_delete_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct project_service_account_delete_response_t project_service_account_delete_response_t;


// Enum OBJECT for project_service_account_delete_response

typedef enum  { openai_api_project_service_account_delete_response_OBJECT_NULL = 0, openai_api_project_service_account_delete_response_OBJECT_organization.project.service_account.deleted } openai_api_project_service_account_delete_response_OBJECT_e;

char* project_service_account_delete_response_object_ToString(openai_api_project_service_account_delete_response_OBJECT_e object);

openai_api_project_service_account_delete_response_OBJECT_e project_service_account_delete_response_object_FromString(char* object);



typedef struct project_service_account_delete_response_t {
    openai_api_project_service_account_delete_response_OBJECT_e object; //enum
    char *id; // string
    int deleted; //boolean

    int _library_owned; // Is the library responsible for freeing this object?
} project_service_account_delete_response_t;

__attribute__((deprecated)) project_service_account_delete_response_t *project_service_account_delete_response_create(
    openai_api_project_service_account_delete_response_OBJECT_e object,
    char *id,
    int deleted
);

void project_service_account_delete_response_free(project_service_account_delete_response_t *project_service_account_delete_response);

project_service_account_delete_response_t *project_service_account_delete_response_parseFromJSON(cJSON *project_service_account_delete_responseJSON);

cJSON *project_service_account_delete_response_convertToJSON(project_service_account_delete_response_t *project_service_account_delete_response);

#endif /* _project_service_account_delete_response_H_ */

