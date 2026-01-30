#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "realtime_server_event_session_created.h"


char* realtime_server_event_session_created_type_ToString(openai_api_realtime_server_event_session_created_TYPE_e type) {
    char* typeArray[] =  { "NULL", "session.created" };
    return typeArray[type];
}

openai_api_realtime_server_event_session_created_TYPE_e realtime_server_event_session_created_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "session.created" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static realtime_server_event_session_created_t *realtime_server_event_session_created_create_internal(
    char *event_id,
    openai_api_realtime_server_event_session_created_TYPE_e type,
    realtime_session_t *session
    ) {
    realtime_server_event_session_created_t *realtime_server_event_session_created_local_var = malloc(sizeof(realtime_server_event_session_created_t));
    if (!realtime_server_event_session_created_local_var) {
        return NULL;
    }
    realtime_server_event_session_created_local_var->event_id = event_id;
    realtime_server_event_session_created_local_var->type = type;
    realtime_server_event_session_created_local_var->session = session;

    realtime_server_event_session_created_local_var->_library_owned = 1;
    return realtime_server_event_session_created_local_var;
}

__attribute__((deprecated)) realtime_server_event_session_created_t *realtime_server_event_session_created_create(
    char *event_id,
    openai_api_realtime_server_event_session_created_TYPE_e type,
    realtime_session_t *session
    ) {
    return realtime_server_event_session_created_create_internal (
        event_id,
        type,
        session
        );
}

void realtime_server_event_session_created_free(realtime_server_event_session_created_t *realtime_server_event_session_created) {
    if(NULL == realtime_server_event_session_created){
        return ;
    }
    if(realtime_server_event_session_created->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "realtime_server_event_session_created_free");
        return ;
    }
    listEntry_t *listEntry;
    if (realtime_server_event_session_created->event_id) {
        free(realtime_server_event_session_created->event_id);
        realtime_server_event_session_created->event_id = NULL;
    }
    if (realtime_server_event_session_created->session) {
        realtime_session_free(realtime_server_event_session_created->session);
        realtime_server_event_session_created->session = NULL;
    }
    free(realtime_server_event_session_created);
}

cJSON *realtime_server_event_session_created_convertToJSON(realtime_server_event_session_created_t *realtime_server_event_session_created) {
    cJSON *item = cJSON_CreateObject();

    // realtime_server_event_session_created->event_id
    if (!realtime_server_event_session_created->event_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "event_id", realtime_server_event_session_created->event_id) == NULL) {
    goto fail; //String
    }


    // realtime_server_event_session_created->type
    if (openai_api_realtime_server_event_session_created_TYPE_NULL == realtime_server_event_session_created->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", realtime_server_event_session_created_type_ToString(realtime_server_event_session_created->type)) == NULL)
    {
    goto fail; //Enum
    }


    // realtime_server_event_session_created->session
    if (!realtime_server_event_session_created->session) {
        goto fail;
    }
    cJSON *session_local_JSON = realtime_session_convertToJSON(realtime_server_event_session_created->session);
    if(session_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "session", session_local_JSON);
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

realtime_server_event_session_created_t *realtime_server_event_session_created_parseFromJSON(cJSON *realtime_server_event_session_createdJSON){

    realtime_server_event_session_created_t *realtime_server_event_session_created_local_var = NULL;

    // define the local variable for realtime_server_event_session_created->session
    realtime_session_t *session_local_nonprim = NULL;

    // realtime_server_event_session_created->event_id
    cJSON *event_id = cJSON_GetObjectItemCaseSensitive(realtime_server_event_session_createdJSON, "event_id");
    if (cJSON_IsNull(event_id)) {
        event_id = NULL;
    }
    if (!event_id) {
        goto end;
    }

    
    if(!cJSON_IsString(event_id))
    {
    goto end; //String
    }

    // realtime_server_event_session_created->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(realtime_server_event_session_createdJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (!type) {
        goto end;
    }

    openai_api_realtime_server_event_session_created_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = realtime_server_event_session_created_type_FromString(type->valuestring);

    // realtime_server_event_session_created->session
    cJSON *session = cJSON_GetObjectItemCaseSensitive(realtime_server_event_session_createdJSON, "session");
    if (cJSON_IsNull(session)) {
        session = NULL;
    }
    if (!session) {
        goto end;
    }

    
    session_local_nonprim = realtime_session_parseFromJSON(session); //nonprimitive


    realtime_server_event_session_created_local_var = realtime_server_event_session_created_create_internal (
        strdup(event_id->valuestring),
        typeVariable,
        session_local_nonprim
        );

    return realtime_server_event_session_created_local_var;
end:
    if (session_local_nonprim) {
        realtime_session_free(session_local_nonprim);
        session_local_nonprim = NULL;
    }
    return NULL;

}
