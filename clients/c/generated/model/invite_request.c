#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "invite_request.h"


char* invite_request_role_ToString(openai_api_invite_request_ROLE_e role) {
    char* roleArray[] =  { "NULL", "reader", "owner" };
    return roleArray[role];
}

openai_api_invite_request_ROLE_e invite_request_role_FromString(char* role){
    int stringToReturn = 0;
    char *roleArray[] =  { "NULL", "reader", "owner" };
    size_t sizeofArray = sizeof(roleArray) / sizeof(roleArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(role, roleArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static invite_request_t *invite_request_create_internal(
    char *email,
    openai_api_invite_request_ROLE_e role,
    list_t *projects
    ) {
    invite_request_t *invite_request_local_var = malloc(sizeof(invite_request_t));
    if (!invite_request_local_var) {
        return NULL;
    }
    invite_request_local_var->email = email;
    invite_request_local_var->role = role;
    invite_request_local_var->projects = projects;

    invite_request_local_var->_library_owned = 1;
    return invite_request_local_var;
}

__attribute__((deprecated)) invite_request_t *invite_request_create(
    char *email,
    openai_api_invite_request_ROLE_e role,
    list_t *projects
    ) {
    return invite_request_create_internal (
        email,
        role,
        projects
        );
}

void invite_request_free(invite_request_t *invite_request) {
    if(NULL == invite_request){
        return ;
    }
    if(invite_request->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "invite_request_free");
        return ;
    }
    listEntry_t *listEntry;
    if (invite_request->email) {
        free(invite_request->email);
        invite_request->email = NULL;
    }
    if (invite_request->projects) {
        list_ForEach(listEntry, invite_request->projects) {
            invite_request_projects_inner_free(listEntry->data);
        }
        list_freeList(invite_request->projects);
        invite_request->projects = NULL;
    }
    free(invite_request);
}

cJSON *invite_request_convertToJSON(invite_request_t *invite_request) {
    cJSON *item = cJSON_CreateObject();

    // invite_request->email
    if (!invite_request->email) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "email", invite_request->email) == NULL) {
    goto fail; //String
    }


    // invite_request->role
    if (openai_api_invite_request_ROLE_NULL == invite_request->role) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "role", invite_request_role_ToString(invite_request->role)) == NULL)
    {
    goto fail; //Enum
    }


    // invite_request->projects
    if(invite_request->projects) {
    cJSON *projects = cJSON_AddArrayToObject(item, "projects");
    if(projects == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *projectsListEntry;
    if (invite_request->projects) {
    list_ForEach(projectsListEntry, invite_request->projects) {
    cJSON *itemLocal = invite_request_projects_inner_convertToJSON(projectsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(projects, itemLocal);
    }
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

invite_request_t *invite_request_parseFromJSON(cJSON *invite_requestJSON){

    invite_request_t *invite_request_local_var = NULL;

    // define the local list for invite_request->projects
    list_t *projectsList = NULL;

    // invite_request->email
    cJSON *email = cJSON_GetObjectItemCaseSensitive(invite_requestJSON, "email");
    if (cJSON_IsNull(email)) {
        email = NULL;
    }
    if (!email) {
        goto end;
    }

    
    if(!cJSON_IsString(email))
    {
    goto end; //String
    }

    // invite_request->role
    cJSON *role = cJSON_GetObjectItemCaseSensitive(invite_requestJSON, "role");
    if (cJSON_IsNull(role)) {
        role = NULL;
    }
    if (!role) {
        goto end;
    }

    openai_api_invite_request_ROLE_e roleVariable;
    
    if(!cJSON_IsString(role))
    {
    goto end; //Enum
    }
    roleVariable = invite_request_role_FromString(role->valuestring);

    // invite_request->projects
    cJSON *projects = cJSON_GetObjectItemCaseSensitive(invite_requestJSON, "projects");
    if (cJSON_IsNull(projects)) {
        projects = NULL;
    }
    if (projects) { 
    cJSON *projects_local_nonprimitive = NULL;
    if(!cJSON_IsArray(projects)){
        goto end; //nonprimitive container
    }

    projectsList = list_createList();

    cJSON_ArrayForEach(projects_local_nonprimitive,projects )
    {
        if(!cJSON_IsObject(projects_local_nonprimitive)){
            goto end;
        }
        invite_request_projects_inner_t *projectsItem = invite_request_projects_inner_parseFromJSON(projects_local_nonprimitive);

        list_addElement(projectsList, projectsItem);
    }
    }


    invite_request_local_var = invite_request_create_internal (
        strdup(email->valuestring),
        roleVariable,
        projects ? projectsList : NULL
        );

    return invite_request_local_var;
end:
    if (projectsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, projectsList) {
            invite_request_projects_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(projectsList);
        projectsList = NULL;
    }
    return NULL;

}
