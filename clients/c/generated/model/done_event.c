#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "done_event.h"


char* done_event_event_ToString(openai_api_done_event_EVENT_e event) {
    char* eventArray[] =  { "NULL", "done" };
    return eventArray[event];
}

openai_api_done_event_EVENT_e done_event_event_FromString(char* event){
    int stringToReturn = 0;
    char *eventArray[] =  { "NULL", "done" };
    size_t sizeofArray = sizeof(eventArray) / sizeof(eventArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(event, eventArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* done_event_data_ToString(openai_api_done_event_DATA_e data) {
    char* dataArray[] =  { "NULL", "[DONE]" };
    return dataArray[data];
}

openai_api_done_event_DATA_e done_event_data_FromString(char* data){
    int stringToReturn = 0;
    char *dataArray[] =  { "NULL", "[DONE]" };
    size_t sizeofArray = sizeof(dataArray) / sizeof(dataArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(data, dataArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

done_event_t *done_event_create(
    openai_api_done_event_EVENT_e event,
    openai_api_done_event_DATA_e data
    ) {
    done_event_t *done_event_local_var = malloc(sizeof(done_event_t));
    if (!done_event_local_var) {
        return NULL;
    }
    done_event_local_var->event = event;
    done_event_local_var->data = data;

    return done_event_local_var;
}


void done_event_free(done_event_t *done_event) {
    if(NULL == done_event){
        return ;
    }
    listEntry_t *listEntry;
    free(done_event);
}

cJSON *done_event_convertToJSON(done_event_t *done_event) {
    cJSON *item = cJSON_CreateObject();

    // done_event->event
    if (openai_api_done_event_EVENT_NULL == done_event->event) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "event", eventdone_event_ToString(done_event->event)) == NULL)
    {
    goto fail; //Enum
    }


    // done_event->data
    if (openai_api_done_event_DATA_NULL == done_event->data) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "data", datadone_event_ToString(done_event->data)) == NULL)
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

done_event_t *done_event_parseFromJSON(cJSON *done_eventJSON){

    done_event_t *done_event_local_var = NULL;

    // done_event->event
    cJSON *event = cJSON_GetObjectItemCaseSensitive(done_eventJSON, "event");
    if (!event) {
        goto end;
    }

    openai_api_done_event_EVENT_e eventVariable;
    
    if(!cJSON_IsString(event))
    {
    goto end; //Enum
    }
    eventVariable = done_event_event_FromString(event->valuestring);

    // done_event->data
    cJSON *data = cJSON_GetObjectItemCaseSensitive(done_eventJSON, "data");
    if (!data) {
        goto end;
    }

    openai_api_done_event_DATA_e dataVariable;
    
    if(!cJSON_IsString(data))
    {
    goto end; //Enum
    }
    dataVariable = done_event_data_FromString(data->valuestring);


    done_event_local_var = done_event_create (
        eventVariable,
        dataVariable
        );

    return done_event_local_var;
end:
    return NULL;

}
