#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "invite.h"


char* invite_object_ToString(openai_api_invite_OBJECT_e object) {
    char* objectArray[] =  { "NULL", "organization.invite" };
    return objectArray[object];
}

openai_api_invite_OBJECT_e invite_object_FromString(char* object){
    int stringToReturn = 0;
    char *objectArray[] =  { "NULL", "organization.invite" };
    size_t sizeofArray = sizeof(objectArray) / sizeof(objectArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(object, objectArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* invite_role_ToString(openai_api_invite_ROLE_e role) {
    char* roleArray[] =  { "NULL", "owner", "reader" };
    return roleArray[role];
}

openai_api_invite_ROLE_e invite_role_FromString(char* role){
    int stringToReturn = 0;
    char *roleArray[] =  { "NULL", "owner", "reader" };
    size_t sizeofArray = sizeof(roleArray) / sizeof(roleArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(role, roleArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* invite_status_ToString(openai_api_invite_STATUS_e status) {
    char* statusArray[] =  { "NULL", "accepted", "expired", "pending" };
    return statusArray[status];
}

openai_api_invite_STATUS_e invite_status_FromString(char* status){
    int stringToReturn = 0;
    char *statusArray[] =  { "NULL", "accepted", "expired", "pending" };
    size_t sizeofArray = sizeof(statusArray) / sizeof(statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(status, statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static invite_t *invite_create_internal(
    openai_api_invite_OBJECT_e object,
    char *id,
    char *email,
    openai_api_invite_ROLE_e role,
    openai_api_invite_STATUS_e status,
    int *invited_at,
    int *expires_at,
    int *accepted_at,
    list_t *projects
    ) {
    invite_t *invite_local_var = malloc(sizeof(invite_t));
    if (!invite_local_var) {
        return NULL;
    }
    memset(invite_local_var, 0, sizeof(invite_t));
    invite_local_var->_library_owned = 1;
    invite_local_var->object = object;
    invite_local_var->id = id;
    invite_local_var->email = email;
    invite_local_var->role = role;
    invite_local_var->status = status;
    invite_local_var->invited_at = invited_at;
    invite_local_var->expires_at = expires_at;
    invite_local_var->accepted_at = accepted_at;
    invite_local_var->projects = projects;
    return invite_local_var;
}

__attribute__((deprecated)) invite_t *invite_create(
    openai_api_invite_OBJECT_e object,
    char *id,
    char *email,
    openai_api_invite_ROLE_e role,
    openai_api_invite_STATUS_e status,
    int *invited_at,
    int *expires_at,
    int *accepted_at,
    list_t *projects
    ) {
    int *invited_at_copy = NULL;
    if (invited_at) {
        invited_at_copy = malloc(sizeof(int));
        if (invited_at_copy) *invited_at_copy = *invited_at;
    }
    int *expires_at_copy = NULL;
    if (expires_at) {
        expires_at_copy = malloc(sizeof(int));
        if (expires_at_copy) *expires_at_copy = *expires_at;
    }
    int *accepted_at_copy = NULL;
    if (accepted_at) {
        accepted_at_copy = malloc(sizeof(int));
        if (accepted_at_copy) *accepted_at_copy = *accepted_at;
    }
    invite_t *result = invite_create_internal (
        object,
        id,
        email,
        role,
        status,
        invited_at_copy,
        expires_at_copy,
        accepted_at_copy,
        projects
        );
    if (!result) {
        free(invited_at_copy);
        free(expires_at_copy);
        free(accepted_at_copy);
    }
    return result;
}

void invite_free(invite_t *invite) {
    if(NULL == invite){
        return ;
    }
    if(invite->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "invite_free");
        return ;
    }
    listEntry_t *listEntry;
    if (invite->id) {
        free(invite->id);
        invite->id = NULL;
    }
    if (invite->email) {
        free(invite->email);
        invite->email = NULL;
    }
    if (invite->invited_at) {
        free(invite->invited_at);
        invite->invited_at = NULL;
    }
    if (invite->expires_at) {
        free(invite->expires_at);
        invite->expires_at = NULL;
    }
    if (invite->accepted_at) {
        free(invite->accepted_at);
        invite->accepted_at = NULL;
    }
    if (invite->projects) {
        list_ForEach(listEntry, invite->projects) {
            invite_projects_inner_free(listEntry->data);
        }
        list_freeList(invite->projects);
        invite->projects = NULL;
    }
    free(invite);
}

cJSON *invite_convertToJSON(invite_t *invite) {
    cJSON *item = cJSON_CreateObject();

    // invite->object
    if (openai_api_invite_OBJECT_NULL == invite->object) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "object", invite_object_ToString(invite->object)) == NULL)
    {
    goto fail; //Enum
    }


    // invite->id
    if (!invite->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", invite->id) == NULL) {
    goto fail; //String
    }


    // invite->email
    if (!invite->email) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "email", invite->email) == NULL) {
    goto fail; //String
    }


    // invite->role
    if (openai_api_invite_ROLE_NULL == invite->role) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "role", invite_role_ToString(invite->role)) == NULL)
    {
    goto fail; //Enum
    }


    // invite->status
    if (openai_api_invite_STATUS_NULL == invite->status) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "status", invite_status_ToString(invite->status)) == NULL)
    {
    goto fail; //Enum
    }


    // invite->invited_at
    if (!invite->invited_at) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "invited_at", *invite->invited_at) == NULL) {
    goto fail; //Numeric
    }


    // invite->expires_at
    if (!invite->expires_at) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "expires_at", *invite->expires_at) == NULL) {
    goto fail; //Numeric
    }


    // invite->accepted_at
    if(invite->accepted_at) {
    if(cJSON_AddNumberToObject(item, "accepted_at", *invite->accepted_at) == NULL) {
    goto fail; //Numeric
    }
    }


    // invite->projects
    if(invite->projects) {
    cJSON *projects = cJSON_AddArrayToObject(item, "projects");
    if(projects == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *projectsListEntry;
    if (invite->projects) {
    list_ForEach(projectsListEntry, invite->projects) {
    cJSON *itemLocal = invite_projects_inner_convertToJSON(projectsListEntry->data);
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

invite_t *invite_parseFromJSON(cJSON *inviteJSON){

    invite_t *invite_local_var = NULL;

    char *id_local_str = NULL;

    char *email_local_str = NULL;

    // define the local variable for invite->invited_at
    int *invited_at_local_var = NULL;

    // define the local variable for invite->expires_at
    int *expires_at_local_var = NULL;

    // define the local variable for invite->accepted_at
    int *accepted_at_local_var = NULL;

    // define the local list for invite->projects
    list_t *projectsList = NULL;

    // invite->object
    cJSON *object = cJSON_GetObjectItemCaseSensitive(inviteJSON, "object");
    if (cJSON_IsNull(object)) {
        object = NULL;
    }
    if (!object) {
        goto end;
    }

    openai_api_invite_OBJECT_e objectVariable;
    
    if(!cJSON_IsString(object))
    {
    goto end; //Enum
    }
    objectVariable = invite_object_FromString(object->valuestring);

    // invite->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(inviteJSON, "id");
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

    // invite->email
    cJSON *email = cJSON_GetObjectItemCaseSensitive(inviteJSON, "email");
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

    // invite->role
    cJSON *role = cJSON_GetObjectItemCaseSensitive(inviteJSON, "role");
    if (cJSON_IsNull(role)) {
        role = NULL;
    }
    if (!role) {
        goto end;
    }

    openai_api_invite_ROLE_e roleVariable;
    
    if(!cJSON_IsString(role))
    {
    goto end; //Enum
    }
    roleVariable = invite_role_FromString(role->valuestring);

    // invite->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(inviteJSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    if (!status) {
        goto end;
    }

    openai_api_invite_STATUS_e statusVariable;
    
    if(!cJSON_IsString(status))
    {
    goto end; //Enum
    }
    statusVariable = invite_status_FromString(status->valuestring);

    // invite->invited_at
    cJSON *invited_at = cJSON_GetObjectItemCaseSensitive(inviteJSON, "invited_at");
    if (cJSON_IsNull(invited_at)) {
        invited_at = NULL;
    }
    if (!invited_at) {
        goto end;
    }

    
    if(!cJSON_IsNumber(invited_at))
    {
    goto end; //Numeric
    }
    invited_at_local_var = malloc(sizeof(int));
    if(!invited_at_local_var)
    {
        goto end;
    }
    *invited_at_local_var = invited_at->valuedouble;

    // invite->expires_at
    cJSON *expires_at = cJSON_GetObjectItemCaseSensitive(inviteJSON, "expires_at");
    if (cJSON_IsNull(expires_at)) {
        expires_at = NULL;
    }
    if (!expires_at) {
        goto end;
    }

    
    if(!cJSON_IsNumber(expires_at))
    {
    goto end; //Numeric
    }
    expires_at_local_var = malloc(sizeof(int));
    if(!expires_at_local_var)
    {
        goto end;
    }
    *expires_at_local_var = expires_at->valuedouble;

    // invite->accepted_at
    cJSON *accepted_at = cJSON_GetObjectItemCaseSensitive(inviteJSON, "accepted_at");
    if (cJSON_IsNull(accepted_at)) {
        accepted_at = NULL;
    }
    if (accepted_at) { 
    if(!cJSON_IsNumber(accepted_at))
    {
    goto end; //Numeric
    }
    accepted_at_local_var = malloc(sizeof(int));
    if(!accepted_at_local_var)
    {
        goto end;
    }
    *accepted_at_local_var = accepted_at->valuedouble;
    }

    // invite->projects
    cJSON *projects = cJSON_GetObjectItemCaseSensitive(inviteJSON, "projects");
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
        invite_projects_inner_t *projectsItem = invite_projects_inner_parseFromJSON(projects_local_nonprimitive);

        list_addElement(projectsList, projectsItem);
    }
    }


    if (id && !cJSON_IsNull(id)) id_local_str = strdup(id->valuestring);
    if (email && !cJSON_IsNull(email)) email_local_str = strdup(email->valuestring);

    invite_local_var = invite_create_internal (
        objectVariable,
        id_local_str,
        email_local_str,
        roleVariable,
        statusVariable,
        invited_at_local_var,
        expires_at_local_var,
        accepted_at_local_var,
        projects ? projectsList : NULL
        );

    if (!invite_local_var) {
        goto end;
    }

    return invite_local_var;
end:
    if (id_local_str) {
        free(id_local_str);
        id_local_str = NULL;
    }
    if (email_local_str) {
        free(email_local_str);
        email_local_str = NULL;
    }
    if (invited_at_local_var) {
        free(invited_at_local_var);
        invited_at_local_var = NULL;
    }
    if (expires_at_local_var) {
        free(expires_at_local_var);
        expires_at_local_var = NULL;
    }
    if (accepted_at_local_var) {
        free(accepted_at_local_var);
        accepted_at_local_var = NULL;
    }
    if (projectsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, projectsList) {
            invite_projects_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(projectsList);
        projectsList = NULL;
    }
    return NULL;

}
