#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "assistant_stream_event.h"


char* assistant_stream_event_event_ToString(openai_api_assistant_stream_event_EVENT_e event) {
    char* eventArray[] =  { "NULL", "done" };
    return eventArray[event];
}

openai_api_assistant_stream_event_EVENT_e assistant_stream_event_event_FromString(char* event){
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
char* assistant_stream_event_data_ToString(openai_api_assistant_stream_event_DATA_e data) {
    char* dataArray[] =  { "NULL", "[DONE]" };
    return dataArray[data];
}

openai_api_assistant_stream_event_DATA_e assistant_stream_event_data_FromString(char* data){
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

static assistant_stream_event_t *assistant_stream_event_create_internal(
    openai_api_assistant_stream_event_EVENT_e event,
    openai_api_assistant_stream_event_DATA_e data
    ) {
    assistant_stream_event_t *assistant_stream_event_local_var = malloc(sizeof(assistant_stream_event_t));
    if (!assistant_stream_event_local_var) {
        return NULL;
    }
    assistant_stream_event_local_var->event = event;
    assistant_stream_event_local_var->data = data;

    assistant_stream_event_local_var->_library_owned = 1;
    return assistant_stream_event_local_var;
}

__attribute__((deprecated)) assistant_stream_event_t *assistant_stream_event_create(
    openai_api_assistant_stream_event_EVENT_e event,
    openai_api_assistant_stream_event_DATA_e data
    ) {
    return assistant_stream_event_create_internal (
        event,
        data
        );
}

void assistant_stream_event_free(assistant_stream_event_t *assistant_stream_event) {
    if(NULL == assistant_stream_event){
        return ;
    }
    if(assistant_stream_event->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "assistant_stream_event_free");
        return ;
    }
    listEntry_t *listEntry;
    free(assistant_stream_event);
}

cJSON *assistant_stream_event_convertToJSON(assistant_stream_event_t *assistant_stream_event) {
    cJSON *item = cJSON_CreateObject();

    // assistant_stream_event->event
    if (openai_api_assistant_stream_event_EVENT_NULL == assistant_stream_event->event) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "event", assistant_stream_event_event_ToString(assistant_stream_event->event)) == NULL)
    {
    goto fail; //Enum
    }


    // assistant_stream_event->data
    if (openai_api_assistant_stream_event_DATA_NULL == assistant_stream_event->data) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "data", assistant_stream_event_data_ToString(assistant_stream_event->data)) == NULL)
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

assistant_stream_event_t *assistant_stream_event_parseFromJSON(cJSON *assistant_stream_eventJSON){

    assistant_stream_event_t *assistant_stream_event_local_var = NULL;

    // assistant_stream_event->event
    cJSON *event = cJSON_GetObjectItemCaseSensitive(assistant_stream_eventJSON, "event");
    if (cJSON_IsNull(event)) {
        event = NULL;
    }
    if (!event) {
        goto end;
    }

    openai_api_assistant_stream_event_EVENT_e eventVariable;
    
    if(!cJSON_IsString(event))
    {
    goto end; //Enum
    }
    eventVariable = assistant_stream_event_event_FromString(event->valuestring);

    // assistant_stream_event->data
    cJSON *data = cJSON_GetObjectItemCaseSensitive(assistant_stream_eventJSON, "data");
    if (cJSON_IsNull(data)) {
        data = NULL;
    }
    if (!data) {
        goto end;
    }

    openai_api_assistant_stream_event_DATA_e dataVariable;
    
    if(!cJSON_IsString(data))
    {
    goto end; //Enum
    }
    dataVariable = assistant_stream_event_data_FromString(data->valuestring);


    assistant_stream_event_local_var = assistant_stream_event_create_internal (
        eventVariable,
        dataVariable
        );

    return assistant_stream_event_local_var;
end:
    return NULL;

}
