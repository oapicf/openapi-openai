#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "thread_stream_event.h"


char* thread_stream_event_event_ToString(openai_api_thread_stream_event_EVENT_e event) {
    char* eventArray[] =  { "NULL", "thread.created" };
    return eventArray[event];
}

openai_api_thread_stream_event_EVENT_e thread_stream_event_event_FromString(char* event){
    int stringToReturn = 0;
    char *eventArray[] =  { "NULL", "thread.created" };
    size_t sizeofArray = sizeof(eventArray) / sizeof(eventArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(event, eventArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

thread_stream_event_t *thread_stream_event_create(
    openai_api_thread_stream_event_EVENT_e event,
    thread_object_t *data
    ) {
    thread_stream_event_t *thread_stream_event_local_var = malloc(sizeof(thread_stream_event_t));
    if (!thread_stream_event_local_var) {
        return NULL;
    }
    thread_stream_event_local_var->event = event;
    thread_stream_event_local_var->data = data;

    return thread_stream_event_local_var;
}


void thread_stream_event_free(thread_stream_event_t *thread_stream_event) {
    if(NULL == thread_stream_event){
        return ;
    }
    listEntry_t *listEntry;
    if (thread_stream_event->data) {
        thread_object_free(thread_stream_event->data);
        thread_stream_event->data = NULL;
    }
    free(thread_stream_event);
}

cJSON *thread_stream_event_convertToJSON(thread_stream_event_t *thread_stream_event) {
    cJSON *item = cJSON_CreateObject();

    // thread_stream_event->event
    if (openai_api_thread_stream_event_EVENT_NULL == thread_stream_event->event) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "event", eventthread_stream_event_ToString(thread_stream_event->event)) == NULL)
    {
    goto fail; //Enum
    }


    // thread_stream_event->data
    if (!thread_stream_event->data) {
        goto fail;
    }
    cJSON *data_local_JSON = thread_object_convertToJSON(thread_stream_event->data);
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

thread_stream_event_t *thread_stream_event_parseFromJSON(cJSON *thread_stream_eventJSON){

    thread_stream_event_t *thread_stream_event_local_var = NULL;

    // define the local variable for thread_stream_event->data
    thread_object_t *data_local_nonprim = NULL;

    // thread_stream_event->event
    cJSON *event = cJSON_GetObjectItemCaseSensitive(thread_stream_eventJSON, "event");
    if (!event) {
        goto end;
    }

    openai_api_thread_stream_event_EVENT_e eventVariable;
    
    if(!cJSON_IsString(event))
    {
    goto end; //Enum
    }
    eventVariable = thread_stream_event_event_FromString(event->valuestring);

    // thread_stream_event->data
    cJSON *data = cJSON_GetObjectItemCaseSensitive(thread_stream_eventJSON, "data");
    if (!data) {
        goto end;
    }

    
    data_local_nonprim = thread_object_parseFromJSON(data); //nonprimitive


    thread_stream_event_local_var = thread_stream_event_create (
        eventVariable,
        data_local_nonprim
        );

    return thread_stream_event_local_var;
end:
    if (data_local_nonprim) {
        thread_object_free(data_local_nonprim);
        data_local_nonprim = NULL;
    }
    return NULL;

}
