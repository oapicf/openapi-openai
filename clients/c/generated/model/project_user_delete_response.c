#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "project_user_delete_response.h"


char* project_user_delete_response_object_ToString(openai_api_project_user_delete_response_OBJECT_e object) {
    char* objectArray[] =  { "NULL", "organization.project.user.deleted" };
    return objectArray[object];
}

openai_api_project_user_delete_response_OBJECT_e project_user_delete_response_object_FromString(char* object){
    int stringToReturn = 0;
    char *objectArray[] =  { "NULL", "organization.project.user.deleted" };
    size_t sizeofArray = sizeof(objectArray) / sizeof(objectArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(object, objectArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static project_user_delete_response_t *project_user_delete_response_create_internal(
    openai_api_project_user_delete_response_OBJECT_e object,
    char *id,
    int deleted
    ) {
    project_user_delete_response_t *project_user_delete_response_local_var = malloc(sizeof(project_user_delete_response_t));
    if (!project_user_delete_response_local_var) {
        return NULL;
    }
    project_user_delete_response_local_var->object = object;
    project_user_delete_response_local_var->id = id;
    project_user_delete_response_local_var->deleted = deleted;

    project_user_delete_response_local_var->_library_owned = 1;
    return project_user_delete_response_local_var;
}

__attribute__((deprecated)) project_user_delete_response_t *project_user_delete_response_create(
    openai_api_project_user_delete_response_OBJECT_e object,
    char *id,
    int deleted
    ) {
    return project_user_delete_response_create_internal (
        object,
        id,
        deleted
        );
}

void project_user_delete_response_free(project_user_delete_response_t *project_user_delete_response) {
    if(NULL == project_user_delete_response){
        return ;
    }
    if(project_user_delete_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "project_user_delete_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (project_user_delete_response->id) {
        free(project_user_delete_response->id);
        project_user_delete_response->id = NULL;
    }
    free(project_user_delete_response);
}

cJSON *project_user_delete_response_convertToJSON(project_user_delete_response_t *project_user_delete_response) {
    cJSON *item = cJSON_CreateObject();

    // project_user_delete_response->object
    if (openai_api_project_user_delete_response_OBJECT_NULL == project_user_delete_response->object) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "object", project_user_delete_response_object_ToString(project_user_delete_response->object)) == NULL)
    {
    goto fail; //Enum
    }


    // project_user_delete_response->id
    if (!project_user_delete_response->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", project_user_delete_response->id) == NULL) {
    goto fail; //String
    }


    // project_user_delete_response->deleted
    if (!project_user_delete_response->deleted) {
        goto fail;
    }
    if(cJSON_AddBoolToObject(item, "deleted", project_user_delete_response->deleted) == NULL) {
    goto fail; //Bool
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

project_user_delete_response_t *project_user_delete_response_parseFromJSON(cJSON *project_user_delete_responseJSON){

    project_user_delete_response_t *project_user_delete_response_local_var = NULL;

    // project_user_delete_response->object
    cJSON *object = cJSON_GetObjectItemCaseSensitive(project_user_delete_responseJSON, "object");
    if (cJSON_IsNull(object)) {
        object = NULL;
    }
    if (!object) {
        goto end;
    }

    openai_api_project_user_delete_response_OBJECT_e objectVariable;
    
    if(!cJSON_IsString(object))
    {
    goto end; //Enum
    }
    objectVariable = project_user_delete_response_object_FromString(object->valuestring);

    // project_user_delete_response->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(project_user_delete_responseJSON, "id");
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

    // project_user_delete_response->deleted
    cJSON *deleted = cJSON_GetObjectItemCaseSensitive(project_user_delete_responseJSON, "deleted");
    if (cJSON_IsNull(deleted)) {
        deleted = NULL;
    }
    if (!deleted) {
        goto end;
    }

    
    if(!cJSON_IsBool(deleted))
    {
    goto end; //Bool
    }


    project_user_delete_response_local_var = project_user_delete_response_create_internal (
        objectVariable,
        strdup(id->valuestring),
        deleted->valueint
        );

    return project_user_delete_response_local_var;
end:
    return NULL;

}
