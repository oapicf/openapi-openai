#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "usage_code_interpreter_sessions_result.h"


char* usage_code_interpreter_sessions_result_object_ToString(openai_api_usage_code_interpreter_sessions_result_OBJECT_e object) {
    char* objectArray[] =  { "NULL", "organization.usage.code_interpreter_sessions.result" };
    return objectArray[object];
}

openai_api_usage_code_interpreter_sessions_result_OBJECT_e usage_code_interpreter_sessions_result_object_FromString(char* object){
    int stringToReturn = 0;
    char *objectArray[] =  { "NULL", "organization.usage.code_interpreter_sessions.result" };
    size_t sizeofArray = sizeof(objectArray) / sizeof(objectArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(object, objectArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static usage_code_interpreter_sessions_result_t *usage_code_interpreter_sessions_result_create_internal(
    openai_api_usage_code_interpreter_sessions_result_OBJECT_e object,
    int *sessions,
    char *project_id
    ) {
    usage_code_interpreter_sessions_result_t *usage_code_interpreter_sessions_result_local_var = malloc(sizeof(usage_code_interpreter_sessions_result_t));
    if (!usage_code_interpreter_sessions_result_local_var) {
        return NULL;
    }
    memset(usage_code_interpreter_sessions_result_local_var, 0, sizeof(usage_code_interpreter_sessions_result_t));
    usage_code_interpreter_sessions_result_local_var->_library_owned = 1;
    usage_code_interpreter_sessions_result_local_var->object = object;
    usage_code_interpreter_sessions_result_local_var->sessions = sessions;
    usage_code_interpreter_sessions_result_local_var->project_id = project_id;
    return usage_code_interpreter_sessions_result_local_var;
}

__attribute__((deprecated)) usage_code_interpreter_sessions_result_t *usage_code_interpreter_sessions_result_create(
    openai_api_usage_code_interpreter_sessions_result_OBJECT_e object,
    int *sessions,
    char *project_id
    ) {
    int *sessions_copy = NULL;
    if (sessions) {
        sessions_copy = malloc(sizeof(int));
        if (sessions_copy) *sessions_copy = *sessions;
    }
    usage_code_interpreter_sessions_result_t *result = usage_code_interpreter_sessions_result_create_internal (
        object,
        sessions_copy,
        project_id
        );
    if (!result) {
        free(sessions_copy);
    }
    return result;
}

void usage_code_interpreter_sessions_result_free(usage_code_interpreter_sessions_result_t *usage_code_interpreter_sessions_result) {
    if(NULL == usage_code_interpreter_sessions_result){
        return ;
    }
    if(usage_code_interpreter_sessions_result->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "usage_code_interpreter_sessions_result_free");
        return ;
    }
    listEntry_t *listEntry;
    if (usage_code_interpreter_sessions_result->sessions) {
        free(usage_code_interpreter_sessions_result->sessions);
        usage_code_interpreter_sessions_result->sessions = NULL;
    }
    if (usage_code_interpreter_sessions_result->project_id) {
        free(usage_code_interpreter_sessions_result->project_id);
        usage_code_interpreter_sessions_result->project_id = NULL;
    }
    free(usage_code_interpreter_sessions_result);
}

cJSON *usage_code_interpreter_sessions_result_convertToJSON(usage_code_interpreter_sessions_result_t *usage_code_interpreter_sessions_result) {
    cJSON *item = cJSON_CreateObject();

    // usage_code_interpreter_sessions_result->object
    if (openai_api_usage_code_interpreter_sessions_result_OBJECT_NULL == usage_code_interpreter_sessions_result->object) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "object", usage_code_interpreter_sessions_result_object_ToString(usage_code_interpreter_sessions_result->object)) == NULL)
    {
    goto fail; //Enum
    }


    // usage_code_interpreter_sessions_result->sessions
    if (!usage_code_interpreter_sessions_result->sessions) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "sessions", *usage_code_interpreter_sessions_result->sessions) == NULL) {
    goto fail; //Numeric
    }


    // usage_code_interpreter_sessions_result->project_id
    if(usage_code_interpreter_sessions_result->project_id) {
    if(cJSON_AddStringToObject(item, "project_id", usage_code_interpreter_sessions_result->project_id) == NULL) {
    goto fail; //String
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

usage_code_interpreter_sessions_result_t *usage_code_interpreter_sessions_result_parseFromJSON(cJSON *usage_code_interpreter_sessions_resultJSON){

    usage_code_interpreter_sessions_result_t *usage_code_interpreter_sessions_result_local_var = NULL;

    // define the local variable for usage_code_interpreter_sessions_result->sessions
    int *sessions_local_var = NULL;

    char *project_id_local_str = NULL;

    // usage_code_interpreter_sessions_result->object
    cJSON *object = cJSON_GetObjectItemCaseSensitive(usage_code_interpreter_sessions_resultJSON, "object");
    if (cJSON_IsNull(object)) {
        object = NULL;
    }
    if (!object) {
        goto end;
    }

    openai_api_usage_code_interpreter_sessions_result_OBJECT_e objectVariable;
    
    if(!cJSON_IsString(object))
    {
    goto end; //Enum
    }
    objectVariable = usage_code_interpreter_sessions_result_object_FromString(object->valuestring);

    // usage_code_interpreter_sessions_result->sessions
    cJSON *sessions = cJSON_GetObjectItemCaseSensitive(usage_code_interpreter_sessions_resultJSON, "sessions");
    if (cJSON_IsNull(sessions)) {
        sessions = NULL;
    }
    if (!sessions) {
        goto end;
    }

    
    if(!cJSON_IsNumber(sessions))
    {
    goto end; //Numeric
    }
    sessions_local_var = malloc(sizeof(int));
    if(!sessions_local_var)
    {
        goto end;
    }
    *sessions_local_var = sessions->valuedouble;

    // usage_code_interpreter_sessions_result->project_id
    cJSON *project_id = cJSON_GetObjectItemCaseSensitive(usage_code_interpreter_sessions_resultJSON, "project_id");
    if (cJSON_IsNull(project_id)) {
        project_id = NULL;
    }
    if (project_id) { 
    if(!cJSON_IsString(project_id) && !cJSON_IsNull(project_id))
    {
    goto end; //String
    }
    }


    if (project_id && !cJSON_IsNull(project_id)) project_id_local_str = strdup(project_id->valuestring);

    usage_code_interpreter_sessions_result_local_var = usage_code_interpreter_sessions_result_create_internal (
        objectVariable,
        sessions_local_var,
        project_id_local_str
        );

    if (!usage_code_interpreter_sessions_result_local_var) {
        goto end;
    }

    return usage_code_interpreter_sessions_result_local_var;
end:
    if (sessions_local_var) {
        free(sessions_local_var);
        sessions_local_var = NULL;
    }
    if (project_id_local_str) {
        free(project_id_local_str);
        project_id_local_str = NULL;
    }
    return NULL;

}
