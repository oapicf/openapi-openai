#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "project_service_account_create_response.h"


char* project_service_account_create_response_object_ToString(openai_api_project_service_account_create_response_OBJECT_e object) {
    char* objectArray[] =  { "NULL", "organization.project.service_account" };
    return objectArray[object];
}

openai_api_project_service_account_create_response_OBJECT_e project_service_account_create_response_object_FromString(char* object){
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
char* project_service_account_create_response_role_ToString(openai_api_project_service_account_create_response_ROLE_e role) {
    char* roleArray[] =  { "NULL", "member" };
    return roleArray[role];
}

openai_api_project_service_account_create_response_ROLE_e project_service_account_create_response_role_FromString(char* role){
    int stringToReturn = 0;
    char *roleArray[] =  { "NULL", "member" };
    size_t sizeofArray = sizeof(roleArray) / sizeof(roleArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(role, roleArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static project_service_account_create_response_t *project_service_account_create_response_create_internal(
    openai_api_project_service_account_create_response_OBJECT_e object,
    char *id,
    char *name,
    openai_api_project_service_account_create_response_ROLE_e role,
    int created_at,
    project_service_account_api_key_t *api_key
    ) {
    project_service_account_create_response_t *project_service_account_create_response_local_var = malloc(sizeof(project_service_account_create_response_t));
    if (!project_service_account_create_response_local_var) {
        return NULL;
    }
    project_service_account_create_response_local_var->object = object;
    project_service_account_create_response_local_var->id = id;
    project_service_account_create_response_local_var->name = name;
    project_service_account_create_response_local_var->role = role;
    project_service_account_create_response_local_var->created_at = created_at;
    project_service_account_create_response_local_var->api_key = api_key;

    project_service_account_create_response_local_var->_library_owned = 1;
    return project_service_account_create_response_local_var;
}

__attribute__((deprecated)) project_service_account_create_response_t *project_service_account_create_response_create(
    openai_api_project_service_account_create_response_OBJECT_e object,
    char *id,
    char *name,
    openai_api_project_service_account_create_response_ROLE_e role,
    int created_at,
    project_service_account_api_key_t *api_key
    ) {
    return project_service_account_create_response_create_internal (
        object,
        id,
        name,
        role,
        created_at,
        api_key
        );
}

void project_service_account_create_response_free(project_service_account_create_response_t *project_service_account_create_response) {
    if(NULL == project_service_account_create_response){
        return ;
    }
    if(project_service_account_create_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "project_service_account_create_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (project_service_account_create_response->id) {
        free(project_service_account_create_response->id);
        project_service_account_create_response->id = NULL;
    }
    if (project_service_account_create_response->name) {
        free(project_service_account_create_response->name);
        project_service_account_create_response->name = NULL;
    }
    if (project_service_account_create_response->api_key) {
        project_service_account_api_key_free(project_service_account_create_response->api_key);
        project_service_account_create_response->api_key = NULL;
    }
    free(project_service_account_create_response);
}

cJSON *project_service_account_create_response_convertToJSON(project_service_account_create_response_t *project_service_account_create_response) {
    cJSON *item = cJSON_CreateObject();

    // project_service_account_create_response->object
    if (openai_api_project_service_account_create_response_OBJECT_NULL == project_service_account_create_response->object) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "object", project_service_account_create_response_object_ToString(project_service_account_create_response->object)) == NULL)
    {
    goto fail; //Enum
    }


    // project_service_account_create_response->id
    if (!project_service_account_create_response->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", project_service_account_create_response->id) == NULL) {
    goto fail; //String
    }


    // project_service_account_create_response->name
    if (!project_service_account_create_response->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", project_service_account_create_response->name) == NULL) {
    goto fail; //String
    }


    // project_service_account_create_response->role
    if (openai_api_project_service_account_create_response_ROLE_NULL == project_service_account_create_response->role) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "role", project_service_account_create_response_role_ToString(project_service_account_create_response->role)) == NULL)
    {
    goto fail; //Enum
    }


    // project_service_account_create_response->created_at
    if (!project_service_account_create_response->created_at) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "created_at", project_service_account_create_response->created_at) == NULL) {
    goto fail; //Numeric
    }


    // project_service_account_create_response->api_key
    if (!project_service_account_create_response->api_key) {
        goto fail;
    }
    cJSON *api_key_local_JSON = project_service_account_api_key_convertToJSON(project_service_account_create_response->api_key);
    if(api_key_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "api_key", api_key_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

project_service_account_create_response_t *project_service_account_create_response_parseFromJSON(cJSON *project_service_account_create_responseJSON){

    project_service_account_create_response_t *project_service_account_create_response_local_var = NULL;

    // define the local variable for project_service_account_create_response->api_key
    project_service_account_api_key_t *api_key_local_nonprim = NULL;

    // project_service_account_create_response->object
    cJSON *object = cJSON_GetObjectItemCaseSensitive(project_service_account_create_responseJSON, "object");
    if (cJSON_IsNull(object)) {
        object = NULL;
    }
    if (!object) {
        goto end;
    }

    openai_api_project_service_account_create_response_OBJECT_e objectVariable;
    
    if(!cJSON_IsString(object))
    {
    goto end; //Enum
    }
    objectVariable = project_service_account_create_response_object_FromString(object->valuestring);

    // project_service_account_create_response->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(project_service_account_create_responseJSON, "id");
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

    // project_service_account_create_response->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(project_service_account_create_responseJSON, "name");
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

    // project_service_account_create_response->role
    cJSON *role = cJSON_GetObjectItemCaseSensitive(project_service_account_create_responseJSON, "role");
    if (cJSON_IsNull(role)) {
        role = NULL;
    }
    if (!role) {
        goto end;
    }

    openai_api_project_service_account_create_response_ROLE_e roleVariable;
    
    if(!cJSON_IsString(role))
    {
    goto end; //Enum
    }
    roleVariable = project_service_account_create_response_role_FromString(role->valuestring);

    // project_service_account_create_response->created_at
    cJSON *created_at = cJSON_GetObjectItemCaseSensitive(project_service_account_create_responseJSON, "created_at");
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

    // project_service_account_create_response->api_key
    cJSON *api_key = cJSON_GetObjectItemCaseSensitive(project_service_account_create_responseJSON, "api_key");
    if (cJSON_IsNull(api_key)) {
        api_key = NULL;
    }
    if (!api_key) {
        goto end;
    }

    
    api_key_local_nonprim = project_service_account_api_key_parseFromJSON(api_key); //nonprimitive


    project_service_account_create_response_local_var = project_service_account_create_response_create_internal (
        objectVariable,
        strdup(id->valuestring),
        strdup(name->valuestring),
        roleVariable,
        created_at->valuedouble,
        api_key_local_nonprim
        );

    return project_service_account_create_response_local_var;
end:
    if (api_key_local_nonprim) {
        project_service_account_api_key_free(api_key_local_nonprim);
        api_key_local_nonprim = NULL;
    }
    return NULL;

}
