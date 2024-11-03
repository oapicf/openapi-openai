#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "fine_tuning_job_event.h"


char* fine_tuning_job_event_level_ToString(openai_api_fine_tuning_job_event_LEVEL_e level) {
    char* levelArray[] =  { "NULL", "info", "warn", "error" };
    return levelArray[level];
}

openai_api_fine_tuning_job_event_LEVEL_e fine_tuning_job_event_level_FromString(char* level){
    int stringToReturn = 0;
    char *levelArray[] =  { "NULL", "info", "warn", "error" };
    size_t sizeofArray = sizeof(levelArray) / sizeof(levelArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(level, levelArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* fine_tuning_job_event_object_ToString(openai_api_fine_tuning_job_event_OBJECT_e object) {
    char* objectArray[] =  { "NULL", "fine_tuning.job.event" };
    return objectArray[object];
}

openai_api_fine_tuning_job_event_OBJECT_e fine_tuning_job_event_object_FromString(char* object){
    int stringToReturn = 0;
    char *objectArray[] =  { "NULL", "fine_tuning.job.event" };
    size_t sizeofArray = sizeof(objectArray) / sizeof(objectArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(object, objectArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

fine_tuning_job_event_t *fine_tuning_job_event_create(
    char *id,
    int created_at,
    openai_api_fine_tuning_job_event_LEVEL_e level,
    char *message,
    openai_api_fine_tuning_job_event_OBJECT_e object
    ) {
    fine_tuning_job_event_t *fine_tuning_job_event_local_var = malloc(sizeof(fine_tuning_job_event_t));
    if (!fine_tuning_job_event_local_var) {
        return NULL;
    }
    fine_tuning_job_event_local_var->id = id;
    fine_tuning_job_event_local_var->created_at = created_at;
    fine_tuning_job_event_local_var->level = level;
    fine_tuning_job_event_local_var->message = message;
    fine_tuning_job_event_local_var->object = object;

    return fine_tuning_job_event_local_var;
}


void fine_tuning_job_event_free(fine_tuning_job_event_t *fine_tuning_job_event) {
    if(NULL == fine_tuning_job_event){
        return ;
    }
    listEntry_t *listEntry;
    if (fine_tuning_job_event->id) {
        free(fine_tuning_job_event->id);
        fine_tuning_job_event->id = NULL;
    }
    if (fine_tuning_job_event->message) {
        free(fine_tuning_job_event->message);
        fine_tuning_job_event->message = NULL;
    }
    free(fine_tuning_job_event);
}

cJSON *fine_tuning_job_event_convertToJSON(fine_tuning_job_event_t *fine_tuning_job_event) {
    cJSON *item = cJSON_CreateObject();

    // fine_tuning_job_event->id
    if (!fine_tuning_job_event->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", fine_tuning_job_event->id) == NULL) {
    goto fail; //String
    }


    // fine_tuning_job_event->created_at
    if (!fine_tuning_job_event->created_at) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "created_at", fine_tuning_job_event->created_at) == NULL) {
    goto fail; //Numeric
    }


    // fine_tuning_job_event->level
    if (openai_api_fine_tuning_job_event_LEVEL_NULL == fine_tuning_job_event->level) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "level", levelfine_tuning_job_event_ToString(fine_tuning_job_event->level)) == NULL)
    {
    goto fail; //Enum
    }


    // fine_tuning_job_event->message
    if (!fine_tuning_job_event->message) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "message", fine_tuning_job_event->message) == NULL) {
    goto fail; //String
    }


    // fine_tuning_job_event->object
    if (openai_api_fine_tuning_job_event_OBJECT_NULL == fine_tuning_job_event->object) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "object", objectfine_tuning_job_event_ToString(fine_tuning_job_event->object)) == NULL)
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

fine_tuning_job_event_t *fine_tuning_job_event_parseFromJSON(cJSON *fine_tuning_job_eventJSON){

    fine_tuning_job_event_t *fine_tuning_job_event_local_var = NULL;

    // fine_tuning_job_event->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(fine_tuning_job_eventJSON, "id");
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }

    // fine_tuning_job_event->created_at
    cJSON *created_at = cJSON_GetObjectItemCaseSensitive(fine_tuning_job_eventJSON, "created_at");
    if (!created_at) {
        goto end;
    }

    
    if(!cJSON_IsNumber(created_at))
    {
    goto end; //Numeric
    }

    // fine_tuning_job_event->level
    cJSON *level = cJSON_GetObjectItemCaseSensitive(fine_tuning_job_eventJSON, "level");
    if (!level) {
        goto end;
    }

    openai_api_fine_tuning_job_event_LEVEL_e levelVariable;
    
    if(!cJSON_IsString(level))
    {
    goto end; //Enum
    }
    levelVariable = fine_tuning_job_event_level_FromString(level->valuestring);

    // fine_tuning_job_event->message
    cJSON *message = cJSON_GetObjectItemCaseSensitive(fine_tuning_job_eventJSON, "message");
    if (!message) {
        goto end;
    }

    
    if(!cJSON_IsString(message))
    {
    goto end; //String
    }

    // fine_tuning_job_event->object
    cJSON *object = cJSON_GetObjectItemCaseSensitive(fine_tuning_job_eventJSON, "object");
    if (!object) {
        goto end;
    }

    openai_api_fine_tuning_job_event_OBJECT_e objectVariable;
    
    if(!cJSON_IsString(object))
    {
    goto end; //Enum
    }
    objectVariable = fine_tuning_job_event_object_FromString(object->valuestring);


    fine_tuning_job_event_local_var = fine_tuning_job_event_create (
        strdup(id->valuestring),
        created_at->valuedouble,
        levelVariable,
        strdup(message->valuestring),
        objectVariable
        );

    return fine_tuning_job_event_local_var;
end:
    return NULL;

}
