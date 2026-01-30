#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "project_service_account_create_request.h"



static project_service_account_create_request_t *project_service_account_create_request_create_internal(
    char *name
    ) {
    project_service_account_create_request_t *project_service_account_create_request_local_var = malloc(sizeof(project_service_account_create_request_t));
    if (!project_service_account_create_request_local_var) {
        return NULL;
    }
    project_service_account_create_request_local_var->name = name;

    project_service_account_create_request_local_var->_library_owned = 1;
    return project_service_account_create_request_local_var;
}

__attribute__((deprecated)) project_service_account_create_request_t *project_service_account_create_request_create(
    char *name
    ) {
    return project_service_account_create_request_create_internal (
        name
        );
}

void project_service_account_create_request_free(project_service_account_create_request_t *project_service_account_create_request) {
    if(NULL == project_service_account_create_request){
        return ;
    }
    if(project_service_account_create_request->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "project_service_account_create_request_free");
        return ;
    }
    listEntry_t *listEntry;
    if (project_service_account_create_request->name) {
        free(project_service_account_create_request->name);
        project_service_account_create_request->name = NULL;
    }
    free(project_service_account_create_request);
}

cJSON *project_service_account_create_request_convertToJSON(project_service_account_create_request_t *project_service_account_create_request) {
    cJSON *item = cJSON_CreateObject();

    // project_service_account_create_request->name
    if (!project_service_account_create_request->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", project_service_account_create_request->name) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

project_service_account_create_request_t *project_service_account_create_request_parseFromJSON(cJSON *project_service_account_create_requestJSON){

    project_service_account_create_request_t *project_service_account_create_request_local_var = NULL;

    // project_service_account_create_request->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(project_service_account_create_requestJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (!name) {
        goto end;
    }

    
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }


    project_service_account_create_request_local_var = project_service_account_create_request_create_internal (
        strdup(name->valuestring)
        );

    return project_service_account_create_request_local_var;
end:
    return NULL;

}
