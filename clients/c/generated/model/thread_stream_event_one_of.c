#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "thread_stream_event_one_of.h"


char* thread_stream_event_one_of_event_ToString(openai_api_thread_stream_event_one_of_EVENT_e event) {
    char* eventArray[] =  { "NULL", "thread.created" };
    return eventArray[event];
}

openai_api_thread_stream_event_one_of_EVENT_e thread_stream_event_one_of_event_FromString(char* event){
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

thread_stream_event_one_of_t *thread_stream_event_one_of_create(
    openai_api_thread_stream_event_one_of_EVENT_e event,
    thread_object_t *data
    ) {
    thread_stream_event_one_of_t *thread_stream_event_one_of_local_var = malloc(sizeof(thread_stream_event_one_of_t));
    if (!thread_stream_event_one_of_local_var) {
        return NULL;
    }
    thread_stream_event_one_of_local_var->event = event;
    thread_stream_event_one_of_local_var->data = data;

    return thread_stream_event_one_of_local_var;
}


void thread_stream_event_one_of_free(thread_stream_event_one_of_t *thread_stream_event_one_of) {
    if(NULL == thread_stream_event_one_of){
        return ;
    }
    listEntry_t *listEntry;
    if (thread_stream_event_one_of->data) {
        thread_object_free(thread_stream_event_one_of->data);
        thread_stream_event_one_of->data = NULL;
    }
    free(thread_stream_event_one_of);
}

cJSON *thread_stream_event_one_of_convertToJSON(thread_stream_event_one_of_t *thread_stream_event_one_of) {
    cJSON *item = cJSON_CreateObject();

    // thread_stream_event_one_of->event
    if (openai_api_thread_stream_event_one_of_EVENT_NULL == thread_stream_event_one_of->event) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "event", eventthread_stream_event_one_of_ToString(thread_stream_event_one_of->event)) == NULL)
    {
    goto fail; //Enum
    }


    // thread_stream_event_one_of->data
    if (!thread_stream_event_one_of->data) {
        goto fail;
    }
    cJSON *data_local_JSON = thread_object_convertToJSON(thread_stream_event_one_of->data);
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

thread_stream_event_one_of_t *thread_stream_event_one_of_parseFromJSON(cJSON *thread_stream_event_one_ofJSON){

    thread_stream_event_one_of_t *thread_stream_event_one_of_local_var = NULL;

    // define the local variable for thread_stream_event_one_of->data
    thread_object_t *data_local_nonprim = NULL;

    // thread_stream_event_one_of->event
    cJSON *event = cJSON_GetObjectItemCaseSensitive(thread_stream_event_one_ofJSON, "event");
    if (!event) {
        goto end;
    }

    openai_api_thread_stream_event_one_of_EVENT_e eventVariable;
    
    if(!cJSON_IsString(event))
    {
    goto end; //Enum
    }
    eventVariable = thread_stream_event_one_of_event_FromString(event->valuestring);

    // thread_stream_event_one_of->data
    cJSON *data = cJSON_GetObjectItemCaseSensitive(thread_stream_event_one_ofJSON, "data");
    if (!data) {
        goto end;
    }

    
    data_local_nonprim = thread_object_parseFromJSON(data); //nonprimitive


    thread_stream_event_one_of_local_var = thread_stream_event_one_of_create (
        eventVariable,
        data_local_nonprim
        );

    return thread_stream_event_one_of_local_var;
end:
    if (data_local_nonprim) {
        thread_object_free(data_local_nonprim);
        data_local_nonprim = NULL;
    }
    return NULL;

}
