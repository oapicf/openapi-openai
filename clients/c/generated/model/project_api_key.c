#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "project_api_key.h"


char* project_api_key_object_ToString(openai_api_project_api_key_OBJECT_e object) {
    char* objectArray[] =  { "NULL", "organization.project.api_key" };
    return objectArray[object];
}

openai_api_project_api_key_OBJECT_e project_api_key_object_FromString(char* object){
    int stringToReturn = 0;
    char *objectArray[] =  { "NULL", "organization.project.api_key" };
    size_t sizeofArray = sizeof(objectArray) / sizeof(objectArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(object, objectArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static project_api_key_t *project_api_key_create_internal(
    openai_api_project_api_key_OBJECT_e object,
    char *redacted_value,
    char *name,
    int created_at,
    char *id,
    project_api_key_owner_t *owner
    ) {
    project_api_key_t *project_api_key_local_var = malloc(sizeof(project_api_key_t));
    if (!project_api_key_local_var) {
        return NULL;
    }
    project_api_key_local_var->object = object;
    project_api_key_local_var->redacted_value = redacted_value;
    project_api_key_local_var->name = name;
    project_api_key_local_var->created_at = created_at;
    project_api_key_local_var->id = id;
    project_api_key_local_var->owner = owner;

    project_api_key_local_var->_library_owned = 1;
    return project_api_key_local_var;
}

__attribute__((deprecated)) project_api_key_t *project_api_key_create(
    openai_api_project_api_key_OBJECT_e object,
    char *redacted_value,
    char *name,
    int created_at,
    char *id,
    project_api_key_owner_t *owner
    ) {
    return project_api_key_create_internal (
        object,
        redacted_value,
        name,
        created_at,
        id,
        owner
        );
}

void project_api_key_free(project_api_key_t *project_api_key) {
    if(NULL == project_api_key){
        return ;
    }
    if(project_api_key->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "project_api_key_free");
        return ;
    }
    listEntry_t *listEntry;
    if (project_api_key->redacted_value) {
        free(project_api_key->redacted_value);
        project_api_key->redacted_value = NULL;
    }
    if (project_api_key->name) {
        free(project_api_key->name);
        project_api_key->name = NULL;
    }
    if (project_api_key->id) {
        free(project_api_key->id);
        project_api_key->id = NULL;
    }
    if (project_api_key->owner) {
        project_api_key_owner_free(project_api_key->owner);
        project_api_key->owner = NULL;
    }
    free(project_api_key);
}

cJSON *project_api_key_convertToJSON(project_api_key_t *project_api_key) {
    cJSON *item = cJSON_CreateObject();

    // project_api_key->object
    if (openai_api_project_api_key_OBJECT_NULL == project_api_key->object) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "object", project_api_key_object_ToString(project_api_key->object)) == NULL)
    {
    goto fail; //Enum
    }


    // project_api_key->redacted_value
    if (!project_api_key->redacted_value) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "redacted_value", project_api_key->redacted_value) == NULL) {
    goto fail; //String
    }


    // project_api_key->name
    if (!project_api_key->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", project_api_key->name) == NULL) {
    goto fail; //String
    }


    // project_api_key->created_at
    if (!project_api_key->created_at) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "created_at", project_api_key->created_at) == NULL) {
    goto fail; //Numeric
    }


    // project_api_key->id
    if (!project_api_key->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", project_api_key->id) == NULL) {
    goto fail; //String
    }


    // project_api_key->owner
    if (!project_api_key->owner) {
        goto fail;
    }
    cJSON *owner_local_JSON = project_api_key_owner_convertToJSON(project_api_key->owner);
    if(owner_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "owner", owner_local_JSON);
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

project_api_key_t *project_api_key_parseFromJSON(cJSON *project_api_keyJSON){

    project_api_key_t *project_api_key_local_var = NULL;

    // define the local variable for project_api_key->owner
    project_api_key_owner_t *owner_local_nonprim = NULL;

    // project_api_key->object
    cJSON *object = cJSON_GetObjectItemCaseSensitive(project_api_keyJSON, "object");
    if (cJSON_IsNull(object)) {
        object = NULL;
    }
    if (!object) {
        goto end;
    }

    openai_api_project_api_key_OBJECT_e objectVariable;
    
    if(!cJSON_IsString(object))
    {
    goto end; //Enum
    }
    objectVariable = project_api_key_object_FromString(object->valuestring);

    // project_api_key->redacted_value
    cJSON *redacted_value = cJSON_GetObjectItemCaseSensitive(project_api_keyJSON, "redacted_value");
    if (cJSON_IsNull(redacted_value)) {
        redacted_value = NULL;
    }
    if (!redacted_value) {
        goto end;
    }

    
    if(!cJSON_IsString(redacted_value))
    {
    goto end; //String
    }

    // project_api_key->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(project_api_keyJSON, "name");
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

    // project_api_key->created_at
    cJSON *created_at = cJSON_GetObjectItemCaseSensitive(project_api_keyJSON, "created_at");
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

    // project_api_key->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(project_api_keyJSON, "id");
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

    // project_api_key->owner
    cJSON *owner = cJSON_GetObjectItemCaseSensitive(project_api_keyJSON, "owner");
    if (cJSON_IsNull(owner)) {
        owner = NULL;
    }
    if (!owner) {
        goto end;
    }

    
    owner_local_nonprim = project_api_key_owner_parseFromJSON(owner); //nonprimitive


    project_api_key_local_var = project_api_key_create_internal (
        objectVariable,
        strdup(redacted_value->valuestring),
        strdup(name->valuestring),
        created_at->valuedouble,
        strdup(id->valuestring),
        owner_local_nonprim
        );

    return project_api_key_local_var;
end:
    if (owner_local_nonprim) {
        project_api_key_owner_free(owner_local_nonprim);
        owner_local_nonprim = NULL;
    }
    return NULL;

}
