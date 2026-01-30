#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "project_user.h"


char* project_user_object_ToString(openai_api_project_user_OBJECT_e object) {
    char* objectArray[] =  { "NULL", "organization.project.user" };
    return objectArray[object];
}

openai_api_project_user_OBJECT_e project_user_object_FromString(char* object){
    int stringToReturn = 0;
    char *objectArray[] =  { "NULL", "organization.project.user" };
    size_t sizeofArray = sizeof(objectArray) / sizeof(objectArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(object, objectArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* project_user_role_ToString(openai_api_project_user_ROLE_e role) {
    char* roleArray[] =  { "NULL", "owner", "member" };
    return roleArray[role];
}

openai_api_project_user_ROLE_e project_user_role_FromString(char* role){
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

static project_user_t *project_user_create_internal(
    openai_api_project_user_OBJECT_e object,
    char *id,
    char *name,
    char *email,
    openai_api_project_user_ROLE_e role,
    int added_at
    ) {
    project_user_t *project_user_local_var = malloc(sizeof(project_user_t));
    if (!project_user_local_var) {
        return NULL;
    }
    project_user_local_var->object = object;
    project_user_local_var->id = id;
    project_user_local_var->name = name;
    project_user_local_var->email = email;
    project_user_local_var->role = role;
    project_user_local_var->added_at = added_at;

    project_user_local_var->_library_owned = 1;
    return project_user_local_var;
}

__attribute__((deprecated)) project_user_t *project_user_create(
    openai_api_project_user_OBJECT_e object,
    char *id,
    char *name,
    char *email,
    openai_api_project_user_ROLE_e role,
    int added_at
    ) {
    return project_user_create_internal (
        object,
        id,
        name,
        email,
        role,
        added_at
        );
}

void project_user_free(project_user_t *project_user) {
    if(NULL == project_user){
        return ;
    }
    if(project_user->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "project_user_free");
        return ;
    }
    listEntry_t *listEntry;
    if (project_user->id) {
        free(project_user->id);
        project_user->id = NULL;
    }
    if (project_user->name) {
        free(project_user->name);
        project_user->name = NULL;
    }
    if (project_user->email) {
        free(project_user->email);
        project_user->email = NULL;
    }
    free(project_user);
}

cJSON *project_user_convertToJSON(project_user_t *project_user) {
    cJSON *item = cJSON_CreateObject();

    // project_user->object
    if (openai_api_project_user_OBJECT_NULL == project_user->object) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "object", project_user_object_ToString(project_user->object)) == NULL)
    {
    goto fail; //Enum
    }


    // project_user->id
    if (!project_user->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", project_user->id) == NULL) {
    goto fail; //String
    }


    // project_user->name
    if (!project_user->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", project_user->name) == NULL) {
    goto fail; //String
    }


    // project_user->email
    if (!project_user->email) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "email", project_user->email) == NULL) {
    goto fail; //String
    }


    // project_user->role
    if (openai_api_project_user_ROLE_NULL == project_user->role) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "role", project_user_role_ToString(project_user->role)) == NULL)
    {
    goto fail; //Enum
    }


    // project_user->added_at
    if (!project_user->added_at) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "added_at", project_user->added_at) == NULL) {
    goto fail; //Numeric
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

project_user_t *project_user_parseFromJSON(cJSON *project_userJSON){

    project_user_t *project_user_local_var = NULL;

    // project_user->object
    cJSON *object = cJSON_GetObjectItemCaseSensitive(project_userJSON, "object");
    if (cJSON_IsNull(object)) {
        object = NULL;
    }
    if (!object) {
        goto end;
    }

    openai_api_project_user_OBJECT_e objectVariable;
    
    if(!cJSON_IsString(object))
    {
    goto end; //Enum
    }
    objectVariable = project_user_object_FromString(object->valuestring);

    // project_user->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(project_userJSON, "id");
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

    // project_user->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(project_userJSON, "name");
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

    // project_user->email
    cJSON *email = cJSON_GetObjectItemCaseSensitive(project_userJSON, "email");
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

    // project_user->role
    cJSON *role = cJSON_GetObjectItemCaseSensitive(project_userJSON, "role");
    if (cJSON_IsNull(role)) {
        role = NULL;
    }
    if (!role) {
        goto end;
    }

    openai_api_project_user_ROLE_e roleVariable;
    
    if(!cJSON_IsString(role))
    {
    goto end; //Enum
    }
    roleVariable = project_user_role_FromString(role->valuestring);

    // project_user->added_at
    cJSON *added_at = cJSON_GetObjectItemCaseSensitive(project_userJSON, "added_at");
    if (cJSON_IsNull(added_at)) {
        added_at = NULL;
    }
    if (!added_at) {
        goto end;
    }

    
    if(!cJSON_IsNumber(added_at))
    {
    goto end; //Numeric
    }


    project_user_local_var = project_user_create_internal (
        objectVariable,
        strdup(id->valuestring),
        strdup(name->valuestring),
        strdup(email->valuestring),
        roleVariable,
        added_at->valuedouble
        );

    return project_user_local_var;
end:
    return NULL;

}
