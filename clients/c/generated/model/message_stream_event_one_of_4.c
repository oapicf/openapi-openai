#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "message_stream_event_one_of_4.h"


char* message_stream_event_one_of_4_event_ToString(openai_api_message_stream_event_one_of_4_EVENT_e event) {
    char* eventArray[] =  { "NULL", "thread.message.incomplete" };
    return eventArray[event];
}

openai_api_message_stream_event_one_of_4_EVENT_e message_stream_event_one_of_4_event_FromString(char* event){
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

static message_stream_event_one_of_4_t *message_stream_event_one_of_4_create_internal(
    openai_api_message_stream_event_one_of_4_EVENT_e event,
    message_object_t *data
    ) {
    message_stream_event_one_of_4_t *message_stream_event_one_of_4_local_var = malloc(sizeof(message_stream_event_one_of_4_t));
    if (!message_stream_event_one_of_4_local_var) {
        return NULL;
    }
    message_stream_event_one_of_4_local_var->event = event;
    message_stream_event_one_of_4_local_var->data = data;

    message_stream_event_one_of_4_local_var->_library_owned = 1;
    return message_stream_event_one_of_4_local_var;
}

__attribute__((deprecated)) message_stream_event_one_of_4_t *message_stream_event_one_of_4_create(
    openai_api_message_stream_event_one_of_4_EVENT_e event,
    message_object_t *data
    ) {
    return message_stream_event_one_of_4_create_internal (
        event,
        data
        );
}

void message_stream_event_one_of_4_free(message_stream_event_one_of_4_t *message_stream_event_one_of_4) {
    if(NULL == message_stream_event_one_of_4){
        return ;
    }
    if(message_stream_event_one_of_4->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "message_stream_event_one_of_4_free");
        return ;
    }
    listEntry_t *listEntry;
    if (message_stream_event_one_of_4->data) {
        message_object_free(message_stream_event_one_of_4->data);
        message_stream_event_one_of_4->data = NULL;
    }
    free(message_stream_event_one_of_4);
}

cJSON *message_stream_event_one_of_4_convertToJSON(message_stream_event_one_of_4_t *message_stream_event_one_of_4) {
    cJSON *item = cJSON_CreateObject();

    // message_stream_event_one_of_4->event
    if (openai_api_message_stream_event_one_of_4_EVENT_NULL == message_stream_event_one_of_4->event) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "event", message_stream_event_one_of_4_event_ToString(message_stream_event_one_of_4->event)) == NULL)
    {
    goto fail; //Enum
    }


    // message_stream_event_one_of_4->data
    if (!message_stream_event_one_of_4->data) {
        goto fail;
    }
    cJSON *data_local_JSON = message_object_convertToJSON(message_stream_event_one_of_4->data);
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

message_stream_event_one_of_4_t *message_stream_event_one_of_4_parseFromJSON(cJSON *message_stream_event_one_of_4JSON){

    message_stream_event_one_of_4_t *message_stream_event_one_of_4_local_var = NULL;

    // define the local variable for message_stream_event_one_of_4->data
    message_object_t *data_local_nonprim = NULL;

    // message_stream_event_one_of_4->event
    cJSON *event = cJSON_GetObjectItemCaseSensitive(message_stream_event_one_of_4JSON, "event");
    if (cJSON_IsNull(event)) {
        event = NULL;
    }
    if (!event) {
        goto end;
    }

    openai_api_message_stream_event_one_of_4_EVENT_e eventVariable;
    
    if(!cJSON_IsString(event))
    {
    goto end; //Enum
    }
    eventVariable = message_stream_event_one_of_4_event_FromString(event->valuestring);

    // message_stream_event_one_of_4->data
    cJSON *data = cJSON_GetObjectItemCaseSensitive(message_stream_event_one_of_4JSON, "data");
    if (cJSON_IsNull(data)) {
        data = NULL;
    }
    if (!data) {
        goto end;
    }

    
    data_local_nonprim = message_object_parseFromJSON(data); //nonprimitive


    message_stream_event_one_of_4_local_var = message_stream_event_one_of_4_create_internal (
        eventVariable,
        data_local_nonprim
        );

    return message_stream_event_one_of_4_local_var;
end:
    if (data_local_nonprim) {
        message_object_free(data_local_nonprim);
        data_local_nonprim = NULL;
    }
    return NULL;

}
