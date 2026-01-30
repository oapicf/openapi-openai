#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "invite_request_projects_inner.h"


char* invite_request_projects_inner_role_ToString(openai_api_invite_request_projects_inner_ROLE_e role) {
    char* roleArray[] =  { "NULL", "member", "owner" };
    return roleArray[role];
}

openai_api_invite_request_projects_inner_ROLE_e invite_request_projects_inner_role_FromString(char* role){
    int stringToReturn = 0;
    char *roleArray[] =  { "NULL", "member", "owner" };
    size_t sizeofArray = sizeof(roleArray) / sizeof(roleArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(role, roleArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static invite_request_projects_inner_t *invite_request_projects_inner_create_internal(
    char *id,
    openai_api_invite_request_projects_inner_ROLE_e role
    ) {
    invite_request_projects_inner_t *invite_request_projects_inner_local_var = malloc(sizeof(invite_request_projects_inner_t));
    if (!invite_request_projects_inner_local_var) {
        return NULL;
    }
    invite_request_projects_inner_local_var->id = id;
    invite_request_projects_inner_local_var->role = role;

    invite_request_projects_inner_local_var->_library_owned = 1;
    return invite_request_projects_inner_local_var;
}

__attribute__((deprecated)) invite_request_projects_inner_t *invite_request_projects_inner_create(
    char *id,
    openai_api_invite_request_projects_inner_ROLE_e role
    ) {
    return invite_request_projects_inner_create_internal (
        id,
        role
        );
}

void invite_request_projects_inner_free(invite_request_projects_inner_t *invite_request_projects_inner) {
    if(NULL == invite_request_projects_inner){
        return ;
    }
    if(invite_request_projects_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "invite_request_projects_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (invite_request_projects_inner->id) {
        free(invite_request_projects_inner->id);
        invite_request_projects_inner->id = NULL;
    }
    free(invite_request_projects_inner);
}

cJSON *invite_request_projects_inner_convertToJSON(invite_request_projects_inner_t *invite_request_projects_inner) {
    cJSON *item = cJSON_CreateObject();

    // invite_request_projects_inner->id
    if (!invite_request_projects_inner->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", invite_request_projects_inner->id) == NULL) {
    goto fail; //String
    }


    // invite_request_projects_inner->role
    if (openai_api_invite_request_projects_inner_ROLE_NULL == invite_request_projects_inner->role) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "role", invite_request_projects_inner_role_ToString(invite_request_projects_inner->role)) == NULL)
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

invite_request_projects_inner_t *invite_request_projects_inner_parseFromJSON(cJSON *invite_request_projects_innerJSON){

    invite_request_projects_inner_t *invite_request_projects_inner_local_var = NULL;

    // invite_request_projects_inner->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(invite_request_projects_innerJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }

    // invite_request_projects_inner->role
    cJSON *role = cJSON_GetObjectItemCaseSensitive(invite_request_projects_innerJSON, "role");
    if (cJSON_IsNull(role)) {
        role = NULL;
    }
    if (!role) {
        goto end;
    }

    openai_api_invite_request_projects_inner_ROLE_e roleVariable;
    
    if(!cJSON_IsString(role))
    {
    goto end; //Enum
    }
    roleVariable = invite_request_projects_inner_role_FromString(role->valuestring);


    invite_request_projects_inner_local_var = invite_request_projects_inner_create_internal (
        strdup(id->valuestring),
        roleVariable
        );

    return invite_request_projects_inner_local_var;
end:
    return NULL;

}
