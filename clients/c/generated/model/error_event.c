#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "error_event.h"


char* error_event_event_ToString(openai_api_error_event_EVENT_e event) {
    char* eventArray[] =  { "NULL", "error" };
    return eventArray[event];
}

openai_api_error_event_EVENT_e error_event_event_FromString(char* event){
    int stringToReturn = 0;
    char *eventArray[] =  { "NULL", "error" };
    size_t sizeofArray = sizeof(eventArray) / sizeof(eventArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(event, eventArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

error_event_t *error_event_create(
    openai_api_error_event_EVENT_e event,
    error_t *data
    ) {
    error_event_t *error_event_local_var = malloc(sizeof(error_event_t));
    if (!error_event_local_var) {
        return NULL;
    }
    error_event_local_var->event = event;
    error_event_local_var->data = data;

    return error_event_local_var;
}


void error_event_free(error_event_t *error_event) {
    if(NULL == error_event){
        return ;
    }
    listEntry_t *listEntry;
    if (error_event->data) {
        error_free(error_event->data);
        error_event->data = NULL;
    }
    free(error_event);
}

cJSON *error_event_convertToJSON(error_event_t *error_event) {
    cJSON *item = cJSON_CreateObject();

    // error_event->event
    if (openai_api_error_event_EVENT_NULL == error_event->event) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "event", eventerror_event_ToString(error_event->event)) == NULL)
    {
    goto fail; //Enum
    }


    // error_event->data
    if (!error_event->data) {
        goto fail;
    }
    cJSON *data_local_JSON = error_convertToJSON(error_event->data);
    if(data_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "data", data_local_JSON);
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

error_event_t *error_event_parseFromJSON(cJSON *error_eventJSON){

    error_event_t *error_event_local_var = NULL;

    // define the local variable for error_event->data
    error_t *data_local_nonprim = NULL;

    // error_event->event
    cJSON *event = cJSON_GetObjectItemCaseSensitive(error_eventJSON, "event");
    if (!event) {
        goto end;
    }

    openai_api_error_event_EVENT_e eventVariable;
    
    if(!cJSON_IsString(event))
    {
    goto end; //Enum
    }
    eventVariable = error_event_event_FromString(event->valuestring);

    // error_event->data
    cJSON *data = cJSON_GetObjectItemCaseSensitive(error_eventJSON, "data");
    if (!data) {
        goto end;
    }

    
    data_local_nonprim = error_parseFromJSON(data); //nonprimitive


    error_event_local_var = error_event_create (
        eventVariable,
        data_local_nonprim
        );

    return error_event_local_var;
end:
    if (data_local_nonprim) {
        error_free(data_local_nonprim);
        data_local_nonprim = NULL;
    }
    return NULL;

}
