#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "project.h"


char* project_object_ToString(openai_api_project_OBJECT_e object) {
    char* objectArray[] =  { "NULL", "organization.project" };
    return objectArray[object];
}

openai_api_project_OBJECT_e project_object_FromString(char* object){
    int stringToReturn = 0;
    char *objectArray[] =  { "NULL", "organization.project" };
    size_t sizeofArray = sizeof(objectArray) / sizeof(objectArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(object, objectArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* project_status_ToString(openai_api_project_STATUS_e status) {
    char* statusArray[] =  { "NULL", "active", "archived" };
    return statusArray[status];
}

openai_api_project_STATUS_e project_status_FromString(char* status){
    int stringToReturn = 0;
    char *statusArray[] =  { "NULL", "active", "archived" };
    size_t sizeofArray = sizeof(statusArray) / sizeof(statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(status, statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static project_t *project_create_internal(
    char *id,
    openai_api_project_OBJECT_e object,
    char *name,
    int created_at,
    int archived_at,
    openai_api_project_STATUS_e status
    ) {
    project_t *project_local_var = malloc(sizeof(project_t));
    if (!project_local_var) {
        return NULL;
    }
    project_local_var->id = id;
    project_local_var->object = object;
    project_local_var->name = name;
    project_local_var->created_at = created_at;
    project_local_var->archived_at = archived_at;
    project_local_var->status = status;

    project_local_var->_library_owned = 1;
    return project_local_var;
}

__attribute__((deprecated)) project_t *project_create(
    char *id,
    openai_api_project_OBJECT_e object,
    char *name,
    int created_at,
    int archived_at,
    openai_api_project_STATUS_e status
    ) {
    return project_create_internal (
        id,
        object,
        name,
        created_at,
        archived_at,
        status
        );
}

void project_free(project_t *project) {
    if(NULL == project){
        return ;
    }
    if(project->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "project_free");
        return ;
    }
    listEntry_t *listEntry;
    if (project->id) {
        free(project->id);
        project->id = NULL;
    }
    if (project->name) {
        free(project->name);
        project->name = NULL;
    }
    free(project);
}

cJSON *project_convertToJSON(project_t *project) {
    cJSON *item = cJSON_CreateObject();

    // project->id
    if (!project->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", project->id) == NULL) {
    goto fail; //String
    }


    // project->object
    if (openai_api_project_OBJECT_NULL == project->object) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "object", project_object_ToString(project->object)) == NULL)
    {
    goto fail; //Enum
    }


    // project->name
    if (!project->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", project->name) == NULL) {
    goto fail; //String
    }


    // project->created_at
    if (!project->created_at) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "created_at", project->created_at) == NULL) {
    goto fail; //Numeric
    }


    // project->archived_at
    if(project->archived_at) {
    if(cJSON_AddNumberToObject(item, "archived_at", project->archived_at) == NULL) {
    goto fail; //Numeric
    }
    }


    // project->status
    if (openai_api_project_STATUS_NULL == project->status) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "status", project_status_ToString(project->status)) == NULL)
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

project_t *project_parseFromJSON(cJSON *projectJSON){

    project_t *project_local_var = NULL;

    // project->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(projectJSON, "id");
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

    // project->object
    cJSON *object = cJSON_GetObjectItemCaseSensitive(projectJSON, "object");
    if (cJSON_IsNull(object)) {
        object = NULL;
    }
    if (!object) {
        goto end;
    }

    openai_api_project_OBJECT_e objectVariable;
    
    if(!cJSON_IsString(object))
    {
    goto end; //Enum
    }
    objectVariable = project_object_FromString(object->valuestring);

    // project->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(projectJSON, "name");
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

    // project->created_at
    cJSON *created_at = cJSON_GetObjectItemCaseSensitive(projectJSON, "created_at");
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

    // project->archived_at
    cJSON *archived_at = cJSON_GetObjectItemCaseSensitive(projectJSON, "archived_at");
    if (cJSON_IsNull(archived_at)) {
        archived_at = NULL;
    }
    if (archived_at) { 
    if(!cJSON_IsNumber(archived_at))
    {
    goto end; //Numeric
    }
    }

    // project->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(projectJSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    if (!status) {
        goto end;
    }

    openai_api_project_STATUS_e statusVariable;
    
    if(!cJSON_IsString(status))
    {
    goto end; //Enum
    }
    statusVariable = project_status_FromString(status->valuestring);


    project_local_var = project_create_internal (
        strdup(id->valuestring),
        objectVariable,
        strdup(name->valuestring),
        created_at->valuedouble,
        archived_at ? archived_at->valuedouble : 0,
        statusVariable
        );

    return project_local_var;
end:
    return NULL;

}
