#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "fine_tune_event.h"



fine_tune_event_t *fine_tune_event_create(
    char *object,
    int created_at,
    char *level,
    char *message
    ) {
    fine_tune_event_t *fine_tune_event_local_var = malloc(sizeof(fine_tune_event_t));
    if (!fine_tune_event_local_var) {
        return NULL;
    }
    fine_tune_event_local_var->object = object;
    fine_tune_event_local_var->created_at = created_at;
    fine_tune_event_local_var->level = level;
    fine_tune_event_local_var->message = message;

    return fine_tune_event_local_var;
}


void fine_tune_event_free(fine_tune_event_t *fine_tune_event) {
    if(NULL == fine_tune_event){
        return ;
    }
    listEntry_t *listEntry;
    if (fine_tune_event->object) {
        free(fine_tune_event->object);
        fine_tune_event->object = NULL;
    }
    if (fine_tune_event->level) {
        free(fine_tune_event->level);
        fine_tune_event->level = NULL;
    }
    if (fine_tune_event->message) {
        free(fine_tune_event->message);
        fine_tune_event->message = NULL;
    }
    free(fine_tune_event);
}

cJSON *fine_tune_event_convertToJSON(fine_tune_event_t *fine_tune_event) {
    cJSON *item = cJSON_CreateObject();

    // fine_tune_event->object
    if (!fine_tune_event->object) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "object", fine_tune_event->object) == NULL) {
    goto fail; //String
    }


    // fine_tune_event->created_at
    if (!fine_tune_event->created_at) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "created_at", fine_tune_event->created_at) == NULL) {
    goto fail; //Numeric
    }


    // fine_tune_event->level
    if (!fine_tune_event->level) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "level", fine_tune_event->level) == NULL) {
    goto fail; //String
    }


    // fine_tune_event->message
    if (!fine_tune_event->message) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "message", fine_tune_event->message) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

fine_tune_event_t *fine_tune_event_parseFromJSON(cJSON *fine_tune_eventJSON){

    fine_tune_event_t *fine_tune_event_local_var = NULL;

    // fine_tune_event->object
    cJSON *object = cJSON_GetObjectItemCaseSensitive(fine_tune_eventJSON, "object");
    if (!object) {
        goto end;
    }

    
    if(!cJSON_IsString(object))
    {
    goto end; //String
    }

    // fine_tune_event->created_at
    cJSON *created_at = cJSON_GetObjectItemCaseSensitive(fine_tune_eventJSON, "created_at");
    if (!created_at) {
        goto end;
    }

    
    if(!cJSON_IsNumber(created_at))
    {
    goto end; //Numeric
    }

    // fine_tune_event->level
    cJSON *level = cJSON_GetObjectItemCaseSensitive(fine_tune_eventJSON, "level");
    if (!level) {
        goto end;
    }

    
    if(!cJSON_IsString(level))
    {
    goto end; //String
    }

    // fine_tune_event->message
    cJSON *message = cJSON_GetObjectItemCaseSensitive(fine_tune_eventJSON, "message");
    if (!message) {
        goto end;
    }

    
    if(!cJSON_IsString(message))
    {
    goto end; //String
    }


    fine_tune_event_local_var = fine_tune_event_create (
        strdup(object->valuestring),
        created_at->valuedouble,
        strdup(level->valuestring),
        strdup(message->valuestring)
        );

    return fine_tune_event_local_var;
end:
    return NULL;

}
