#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "project_service_account.h"


char* project_service_account_object_ToString(openai_api_project_service_account_OBJECT_e object) {
    char* objectArray[] =  { "NULL", "organization.project.service_account" };
    return objectArray[object];
}

openai_api_project_service_account_OBJECT_e project_service_account_object_FromString(char* object){
    int stringToReturn = 0;
    char *objectArray[] =  { "NULL", "organization.project.service_account" };
    size_t sizeofArray = sizeof(objectArray) / sizeof(objectArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(object, objectArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* project_service_account_role_ToString(openai_api_project_service_account_ROLE_e role) {
    char* roleArray[] =  { "NULL", "owner", "member" };
    return roleArray[role];
}

openai_api_project_service_account_ROLE_e project_service_account_role_FromString(char* role){
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

static project_service_account_t *project_service_account_create_internal(
    openai_api_project_service_account_OBJECT_e object,
    char *id,
    char *name,
    openai_api_project_service_account_ROLE_e role,
    int created_at
    ) {
    project_service_account_t *project_service_account_local_var = malloc(sizeof(project_service_account_t));
    if (!project_service_account_local_var) {
        return NULL;
    }
    project_service_account_local_var->object = object;
    project_service_account_local_var->id = id;
    project_service_account_local_var->name = name;
    project_service_account_local_var->role = role;
    project_service_account_local_var->created_at = created_at;

    project_service_account_local_var->_library_owned = 1;
    return project_service_account_local_var;
}

__attribute__((deprecated)) project_service_account_t *project_service_account_create(
    openai_api_project_service_account_OBJECT_e object,
    char *id,
    char *name,
    openai_api_project_service_account_ROLE_e role,
    int created_at
    ) {
    return project_service_account_create_internal (
        object,
        id,
        name,
        role,
        created_at
        );
}

void project_service_account_free(project_service_account_t *project_service_account) {
    if(NULL == project_service_account){
        return ;
    }
    if(project_service_account->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "project_service_account_free");
        return ;
    }
    listEntry_t *listEntry;
    if (project_service_account->id) {
        free(project_service_account->id);
        project_service_account->id = NULL;
    }
    if (project_service_account->name) {
        free(project_service_account->name);
        project_service_account->name = NULL;
    }
    free(project_service_account);
}

cJSON *project_service_account_convertToJSON(project_service_account_t *project_service_account) {
    cJSON *item = cJSON_CreateObject();

    // project_service_account->object
    if (openai_api_project_service_account_OBJECT_NULL == project_service_account->object) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "object", project_service_account_object_ToString(project_service_account->object)) == NULL)
    {
    goto fail; //Enum
    }


    // project_service_account->id
    if (!project_service_account->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", project_service_account->id) == NULL) {
    goto fail; //String
    }


    // project_service_account->name
    if (!project_service_account->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", project_service_account->name) == NULL) {
    goto fail; //String
    }


    // project_service_account->role
    if (openai_api_project_service_account_ROLE_NULL == project_service_account->role) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "role", project_service_account_role_ToString(project_service_account->role)) == NULL)
    {
    goto fail; //Enum
    }


    // project_service_account->created_at
    if (!project_service_account->created_at) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "created_at", project_service_account->created_at) == NULL) {
    goto fail; //Numeric
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

project_service_account_t *project_service_account_parseFromJSON(cJSON *project_service_accountJSON){

    project_service_account_t *project_service_account_local_var = NULL;

    // project_service_account->object
    cJSON *object = cJSON_GetObjectItemCaseSensitive(project_service_accountJSON, "object");
    if (cJSON_IsNull(object)) {
        object = NULL;
    }
    if (!object) {
        goto end;
    }

    openai_api_project_service_account_OBJECT_e objectVariable;
    
    if(!cJSON_IsString(object))
    {
    goto end; //Enum
    }
    objectVariable = project_service_account_object_FromString(object->valuestring);

    // project_service_account->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(project_service_accountJSON, "id");
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

    // project_service_account->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(project_service_accountJSON, "name");
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

    // project_service_account->role
    cJSON *role = cJSON_GetObjectItemCaseSensitive(project_service_accountJSON, "role");
    if (cJSON_IsNull(role)) {
        role = NULL;
    }
    if (!role) {
        goto end;
    }

    openai_api_project_service_account_ROLE_e roleVariable;
    
    if(!cJSON_IsString(role))
    {
    goto end; //Enum
    }
    roleVariable = project_service_account_role_FromString(role->valuestring);

    // project_service_account->created_at
    cJSON *created_at = cJSON_GetObjectItemCaseSensitive(project_service_accountJSON, "created_at");
    if (cJSON_IsNull(created_at)) {
        created_at = NULL;
    }
    if (!created_at) {
        goto end;
    }

    
    if(!cJSON_IsNumber(created_at))
    {
    goto end; //Numeric
    }


    project_service_account_local_var = project_service_account_create_internal (
        objectVariable,
        strdup(id->valuestring),
        strdup(name->valuestring),
        roleVariable,
        created_at->valuedouble
        );

    return project_service_account_local_var;
end:
    return NULL;

}
