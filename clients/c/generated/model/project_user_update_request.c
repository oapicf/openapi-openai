#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "project_user_update_request.h"


char* project_user_update_request_role_ToString(openai_api_project_user_update_request_ROLE_e role) {
    char* roleArray[] =  { "NULL", "owner", "member" };
    return roleArray[role];
}

openai_api_project_user_update_request_ROLE_e project_user_update_request_role_FromString(char* role){
    int stringToReturn = 0;
    char *roleArray[] =  { "NULL", "owner", "member" };
    size_t sizeofArray = sizeof(roleArray) / sizeof(roleArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(role, roleArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static project_user_update_request_t *project_user_update_request_create_internal(
    openai_api_project_user_update_request_ROLE_e role
    ) {
    project_user_update_request_t *project_user_update_request_local_var = malloc(sizeof(project_user_update_request_t));
    if (!project_user_update_request_local_var) {
        return NULL;
    }
    project_user_update_request_local_var->role = role;

    project_user_update_request_local_var->_library_owned = 1;
    return project_user_update_request_local_var;
}

__attribute__((deprecated)) project_user_update_request_t *project_user_update_request_create(
    openai_api_project_user_update_request_ROLE_e role
    ) {
    return project_user_update_request_create_internal (
        role
        );
}

void project_user_update_request_free(project_user_update_request_t *project_user_update_request) {
    if(NULL == project_user_update_request){
        return ;
    }
    if(project_user_update_request->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "project_user_update_request_free");
        return ;
    }
    listEntry_t *listEntry;
    free(project_user_update_request);
}

cJSON *project_user_update_request_convertToJSON(project_user_update_request_t *project_user_update_request) {
    cJSON *item = cJSON_CreateObject();

    // project_user_update_request->role
    if (openai_api_project_user_update_request_ROLE_NULL == project_user_update_request->role) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "role", project_user_update_request_role_ToString(project_user_update_request->role)) == NULL)
    {
    goto fail; //Enum
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

project_user_update_request_t *project_user_update_request_parseFromJSON(cJSON *project_user_update_requestJSON){

    project_user_update_request_t *project_user_update_request_local_var = NULL;

    // project_user_update_request->role
    cJSON *role = cJSON_GetObjectItemCaseSensitive(project_user_update_requestJSON, "role");
    if (cJSON_IsNull(role)) {
        role = NULL;
    }
    if (!role) {
        goto end;
    }

    openai_api_project_user_update_request_ROLE_e roleVariable;
    
    if(!cJSON_IsString(role))
    {
    goto end; //Enum
    }
    roleVariable = project_user_update_request_role_FromString(role->valuestring);


    project_user_update_request_local_var = project_user_update_request_create_internal (
        roleVariable
        );

    return project_user_update_request_local_var;
end:
    return NULL;

}
