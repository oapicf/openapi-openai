#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "project_user_create_request.h"


char* project_user_create_request_role_ToString(openai_api_project_user_create_request_ROLE_e role) {
    char* roleArray[] =  { "NULL", "owner", "member" };
    return roleArray[role];
}

openai_api_project_user_create_request_ROLE_e project_user_create_request_role_FromString(char* role){
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

static project_user_create_request_t *project_user_create_request_create_internal(
    char *user_id,
    openai_api_project_user_create_request_ROLE_e role
    ) {
    project_user_create_request_t *project_user_create_request_local_var = malloc(sizeof(project_user_create_request_t));
    if (!project_user_create_request_local_var) {
        return NULL;
    }
    project_user_create_request_local_var->user_id = user_id;
    project_user_create_request_local_var->role = role;

    project_user_create_request_local_var->_library_owned = 1;
    return project_user_create_request_local_var;
}

__attribute__((deprecated)) project_user_create_request_t *project_user_create_request_create(
    char *user_id,
    openai_api_project_user_create_request_ROLE_e role
    ) {
    return project_user_create_request_create_internal (
        user_id,
        role
        );
}

void project_user_create_request_free(project_user_create_request_t *project_user_create_request) {
    if(NULL == project_user_create_request){
        return ;
    }
    if(project_user_create_request->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "project_user_create_request_free");
        return ;
    }
    listEntry_t *listEntry;
    if (project_user_create_request->user_id) {
        free(project_user_create_request->user_id);
        project_user_create_request->user_id = NULL;
    }
    free(project_user_create_request);
}

cJSON *project_user_create_request_convertToJSON(project_user_create_request_t *project_user_create_request) {
    cJSON *item = cJSON_CreateObject();

    // project_user_create_request->user_id
    if (!project_user_create_request->user_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "user_id", project_user_create_request->user_id) == NULL) {
    goto fail; //String
    }


    // project_user_create_request->role
    if (openai_api_project_user_create_request_ROLE_NULL == project_user_create_request->role) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "role", project_user_create_request_role_ToString(project_user_create_request->role)) == NULL)
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

project_user_create_request_t *project_user_create_request_parseFromJSON(cJSON *project_user_create_requestJSON){

    project_user_create_request_t *project_user_create_request_local_var = NULL;

    // project_user_create_request->user_id
    cJSON *user_id = cJSON_GetObjectItemCaseSensitive(project_user_create_requestJSON, "user_id");
    if (cJSON_IsNull(user_id)) {
        user_id = NULL;
    }
    if (!user_id) {
        goto end;
    }

    
    if(!cJSON_IsString(user_id))
    {
    goto end; //String
    }

    // project_user_create_request->role
    cJSON *role = cJSON_GetObjectItemCaseSensitive(project_user_create_requestJSON, "role");
    if (cJSON_IsNull(role)) {
        role = NULL;
    }
    if (!role) {
        goto end;
    }

    openai_api_project_user_create_request_ROLE_e roleVariable;
    
    if(!cJSON_IsString(role))
    {
    goto end; //Enum
    }
    roleVariable = project_user_create_request_role_FromString(role->valuestring);


    project_user_create_request_local_var = project_user_create_request_create_internal (
        strdup(user_id->valuestring),
        roleVariable
        );

    return project_user_create_request_local_var;
end:
    return NULL;

}
