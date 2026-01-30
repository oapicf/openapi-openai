#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "project_update_request.h"



static project_update_request_t *project_update_request_create_internal(
    char *name
    ) {
    project_update_request_t *project_update_request_local_var = malloc(sizeof(project_update_request_t));
    if (!project_update_request_local_var) {
        return NULL;
    }
    project_update_request_local_var->name = name;

    project_update_request_local_var->_library_owned = 1;
    return project_update_request_local_var;
}

__attribute__((deprecated)) project_update_request_t *project_update_request_create(
    char *name
    ) {
    return project_update_request_create_internal (
        name
        );
}

void project_update_request_free(project_update_request_t *project_update_request) {
    if(NULL == project_update_request){
        return ;
    }
    if(project_update_request->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "project_update_request_free");
        return ;
    }
    listEntry_t *listEntry;
    if (project_update_request->name) {
        free(project_update_request->name);
        project_update_request->name = NULL;
    }
    free(project_update_request);
}

cJSON *project_update_request_convertToJSON(project_update_request_t *project_update_request) {
    cJSON *item = cJSON_CreateObject();

    // project_update_request->name
    if (!project_update_request->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", project_update_request->name) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

project_update_request_t *project_update_request_parseFromJSON(cJSON *project_update_requestJSON){

    project_update_request_t *project_update_request_local_var = NULL;

    // project_update_request->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(project_update_requestJSON, "name");
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


    project_update_request_local_var = project_update_request_create_internal (
        strdup(name->valuestring)
        );

    return project_update_request_local_var;
end:
    return NULL;

}
