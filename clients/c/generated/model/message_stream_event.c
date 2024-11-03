#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "message_stream_event.h"


char* message_stream_event_event_ToString(openai_api_message_stream_event_EVENT_e event) {
    char* eventArray[] =  { "NULL", "thread.message.incomplete" };
    return eventArray[event];
}

openai_api_message_stream_event_EVENT_e message_stream_event_event_FromString(char* event){
    int stringToReturn = 0;
    char *eventArray[] =  { "NULL", "thread.message.incomplete" };
    size_t sizeofArray = sizeof(eventArray) / sizeof(eventArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(event, eventArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

message_stream_event_t *message_stream_event_create(
    openai_api_message_stream_event_EVENT_e event,
    message_object_t *data
    ) {
    message_stream_event_t *message_stream_event_local_var = malloc(sizeof(message_stream_event_t));
    if (!message_stream_event_local_var) {
        return NULL;
    }
    message_stream_event_local_var->event = event;
    message_stream_event_local_var->data = data;

    return message_stream_event_local_var;
}


void message_stream_event_free(message_stream_event_t *message_stream_event) {
    if(NULL == message_stream_event){
        return ;
    }
    listEntry_t *listEntry;
    if (message_stream_event->data) {
        message_object_free(message_stream_event->data);
        message_stream_event->data = NULL;
    }
    free(message_stream_event);
}

cJSON *message_stream_event_convertToJSON(message_stream_event_t *message_stream_event) {
    cJSON *item = cJSON_CreateObject();

    // message_stream_event->event
    if (openai_api_message_stream_event_EVENT_NULL == message_stream_event->event) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "event", eventmessage_stream_event_ToString(message_stream_event->event)) == NULL)
    {
    goto fail; //Enum
    }


    // message_stream_event->data
    if (!message_stream_event->data) {
        goto fail;
    }
    cJSON *data_local_JSON = message_object_convertToJSON(message_stream_event->data);
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

message_stream_event_t *message_stream_event_parseFromJSON(cJSON *message_stream_eventJSON){

    message_stream_event_t *message_stream_event_local_var = NULL;

    // define the local variable for message_stream_event->data
    message_object_t *data_local_nonprim = NULL;

    // message_stream_event->event
    cJSON *event = cJSON_GetObjectItemCaseSensitive(message_stream_eventJSON, "event");
    if (!event) {
        goto end;
    }

    openai_api_message_stream_event_EVENT_e eventVariable;
    
    if(!cJSON_IsString(event))
    {
    goto end; //Enum
    }
    eventVariable = message_stream_event_event_FromString(event->valuestring);

    // message_stream_event->data
    cJSON *data = cJSON_GetObjectItemCaseSensitive(message_stream_eventJSON, "data");
    if (!data) {
        goto end;
    }

    
    data_local_nonprim = message_object_parseFromJSON(data); //nonprimitive


    message_stream_event_local_var = message_stream_event_create (
        eventVariable,
        data_local_nonprim
        );

    return message_stream_event_local_var;
end:
    if (data_local_nonprim) {
        message_object_free(data_local_nonprim);
        data_local_nonprim = NULL;
    }
    return NULL;

}
