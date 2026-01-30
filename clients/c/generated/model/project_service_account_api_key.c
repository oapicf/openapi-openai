#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "project_service_account_api_key.h"


char* project_service_account_api_key_object_ToString(openai_api_project_service_account_api_key_OBJECT_e object) {
    char* objectArray[] =  { "NULL", "organization.project.service_account.api_key" };
    return objectArray[object];
}

openai_api_project_service_account_api_key_OBJECT_e project_service_account_api_key_object_FromString(char* object){
    int stringToReturn = 0;
    char *objectArray[] =  { "NULL", "organization.project.service_account.api_key" };
    size_t sizeofArray = sizeof(objectArray) / sizeof(objectArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(object, objectArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static project_service_account_api_key_t *project_service_account_api_key_create_internal(
    openai_api_project_service_account_api_key_OBJECT_e object,
    char *value,
    char *name,
    int created_at,
    char *id
    ) {
    project_service_account_api_key_t *project_service_account_api_key_local_var = malloc(sizeof(project_service_account_api_key_t));
    if (!project_service_account_api_key_local_var) {
        return NULL;
    }
    project_service_account_api_key_local_var->object = object;
    project_service_account_api_key_local_var->value = value;
    project_service_account_api_key_local_var->name = name;
    project_service_account_api_key_local_var->created_at = created_at;
    project_service_account_api_key_local_var->id = id;

    project_service_account_api_key_local_var->_library_owned = 1;
    return project_service_account_api_key_local_var;
}

__attribute__((deprecated)) project_service_account_api_key_t *project_service_account_api_key_create(
    openai_api_project_service_account_api_key_OBJECT_e object,
    char *value,
    char *name,
    int created_at,
    char *id
    ) {
    return project_service_account_api_key_create_internal (
        object,
        value,
        name,
        created_at,
        id
        );
}

void project_service_account_api_key_free(project_service_account_api_key_t *project_service_account_api_key) {
    if(NULL == project_service_account_api_key){
        return ;
    }
    if(project_service_account_api_key->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "project_service_account_api_key_free");
        return ;
    }
    listEntry_t *listEntry;
    if (project_service_account_api_key->value) {
        free(project_service_account_api_key->value);
        project_service_account_api_key->value = NULL;
    }
    if (project_service_account_api_key->name) {
        free(project_service_account_api_key->name);
        project_service_account_api_key->name = NULL;
    }
    if (project_service_account_api_key->id) {
        free(project_service_account_api_key->id);
        project_service_account_api_key->id = NULL;
    }
    free(project_service_account_api_key);
}

cJSON *project_service_account_api_key_convertToJSON(project_service_account_api_key_t *project_service_account_api_key) {
    cJSON *item = cJSON_CreateObject();

    // project_service_account_api_key->object
    if (openai_api_project_service_account_api_key_OBJECT_NULL == project_service_account_api_key->object) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "object", project_service_account_api_key_object_ToString(project_service_account_api_key->object)) == NULL)
    {
    goto fail; //Enum
    }


    // project_service_account_api_key->value
    if (!project_service_account_api_key->value) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "value", project_service_account_api_key->value) == NULL) {
    goto fail; //String
    }


    // project_service_account_api_key->name
    if (!project_service_account_api_key->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", project_service_account_api_key->name) == NULL) {
    goto fail; //String
    }


    // project_service_account_api_key->created_at
    if (!project_service_account_api_key->created_at) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "created_at", project_service_account_api_key->created_at) == NULL) {
    goto fail; //Numeric
    }


    // project_service_account_api_key->id
    if (!project_service_account_api_key->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", project_service_account_api_key->id) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

project_service_account_api_key_t *project_service_account_api_key_parseFromJSON(cJSON *project_service_account_api_keyJSON){

    project_service_account_api_key_t *project_service_account_api_key_local_var = NULL;

    // project_service_account_api_key->object
    cJSON *object = cJSON_GetObjectItemCaseSensitive(project_service_account_api_keyJSON, "object");
    if (cJSON_IsNull(object)) {
        object = NULL;
    }
    if (!object) {
        goto end;
    }

    openai_api_project_service_account_api_key_OBJECT_e objectVariable;
    
    if(!cJSON_IsString(object))
    {
    goto end; //Enum
    }
    objectVariable = project_service_account_api_key_object_FromString(object->valuestring);

    // project_service_account_api_key->value
    cJSON *value = cJSON_GetObjectItemCaseSensitive(project_service_account_api_keyJSON, "value");
    if (cJSON_IsNull(value)) {
        value = NULL;
    }
    if (!value) {
        goto end;
    }

    
    if(!cJSON_IsString(value))
    {
    goto end; //String
    }

    // project_service_account_api_key->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(project_service_account_api_keyJSON, "name");
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

    // project_service_account_api_key->created_at
    cJSON *created_at = cJSON_GetObjectItemCaseSensitive(project_service_account_api_keyJSON, "created_at");
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

    // project_service_account_api_key->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(project_service_account_api_keyJSON, "id");
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


    project_service_account_api_key_local_var = project_service_account_api_key_create_internal (
        objectVariable,
        strdup(value->valuestring),
        strdup(name->valuestring),
        created_at->valuedouble,
        strdup(id->valuestring)
        );

    return project_service_account_api_key_local_var;
end:
    return NULL;

}
