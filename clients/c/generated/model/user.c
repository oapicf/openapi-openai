#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "user.h"


char* user_object_ToString(openai_api_user_OBJECT_e object) {
    char* objectArray[] =  { "NULL", "organization.user" };
    return objectArray[object];
}

openai_api_user_OBJECT_e user_object_FromString(char* object){
    int stringToReturn = 0;
    char *objectArray[] =  { "NULL", "organization.user" };
    size_t sizeofArray = sizeof(objectArray) / sizeof(objectArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(object, objectArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* user_role_ToString(openai_api_user_ROLE_e role) {
    char* roleArray[] =  { "NULL", "owner", "reader" };
    return roleArray[role];
}

openai_api_user_ROLE_e user_role_FromString(char* role){
    int stringToReturn = 0;
    char *roleArray[] =  { "NULL", "owner", "reader" };
    size_t sizeofArray = sizeof(roleArray) / sizeof(roleArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(role, roleArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static user_t *user_create_internal(
    openai_api_user_OBJECT_e object,
    char *id,
    char *name,
    char *email,
    openai_api_user_ROLE_e role,
    int *added_at
    ) {
    user_t *user_local_var = malloc(sizeof(user_t));
    if (!user_local_var) {
        return NULL;
    }
    memset(user_local_var, 0, sizeof(user_t));
    user_local_var->_library_owned = 1;
    user_local_var->object = object;
    user_local_var->id = id;
    user_local_var->name = name;
    user_local_var->email = email;
    user_local_var->role = role;
    user_local_var->added_at = added_at;
    return user_local_var;
}

__attribute__((deprecated)) user_t *user_create(
    openai_api_user_OBJECT_e object,
    char *id,
    char *name,
    char *email,
    openai_api_user_ROLE_e role,
    int *added_at
    ) {
    int *added_at_copy = NULL;
    if (added_at) {
        added_at_copy = malloc(sizeof(int));
        if (added_at_copy) *added_at_copy = *added_at;
    }
    user_t *result = user_create_internal (
        object,
        id,
        name,
        email,
        role,
        added_at_copy
        );
    if (!result) {
        free(added_at_copy);
    }
    return result;
}

void user_free(user_t *user) {
    if(NULL == user){
        return ;
    }
    if(user->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "user_free");
        return ;
    }
    listEntry_t *listEntry;
    if (user->id) {
        free(user->id);
        user->id = NULL;
    }
    if (user->name) {
        free(user->name);
        user->name = NULL;
    }
    if (user->email) {
        free(user->email);
        user->email = NULL;
    }
    if (user->added_at) {
        free(user->added_at);
        user->added_at = NULL;
    }
    free(user);
}

cJSON *user_convertToJSON(user_t *user) {
    cJSON *item = cJSON_CreateObject();

    // user->object
    if (openai_api_user_OBJECT_NULL == user->object) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "object", user_object_ToString(user->object)) == NULL)
    {
    goto fail; //Enum
    }


    // user->id
    if (!user->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", user->id) == NULL) {
    goto fail; //String
    }


    // user->name
    if (!user->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", user->name) == NULL) {
    goto fail; //String
    }


    // user->email
    if (!user->email) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "email", user->email) == NULL) {
    goto fail; //String
    }


    // user->role
    if (openai_api_user_ROLE_NULL == user->role) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "role", user_role_ToString(user->role)) == NULL)
    {
    goto fail; //Enum
    }


    // user->added_at
    if (!user->added_at) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "added_at", *user->added_at) == NULL) {
    goto fail; //Numeric
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

user_t *user_parseFromJSON(cJSON *userJSON){

    user_t *user_local_var = NULL;

    char *id_local_str = NULL;

    char *name_local_str = NULL;

    char *email_local_str = NULL;

    // define the local variable for user->added_at
    int *added_at_local_var = NULL;

    // user->object
    cJSON *object = cJSON_GetObjectItemCaseSensitive(userJSON, "object");
    if (cJSON_IsNull(object)) {
        object = NULL;
    }
    if (!object) {
        goto end;
    }

    openai_api_user_OBJECT_e objectVariable;
    
    if(!cJSON_IsString(object))
    {
    goto end; //Enum
    }
    objectVariable = user_object_FromString(object->valuestring);

    // user->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(userJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }

    // user->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(userJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (!name) {
        goto end;
    }

    
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }

    // user->email
    cJSON *email = cJSON_GetObjectItemCaseSensitive(userJSON, "email");
    if (cJSON_IsNull(email)) {
        email = NULL;
    }
    if (!email) {
        goto end;
    }

    
    if(!cJSON_IsString(email))
    {
    goto end; //String
    }

    // user->role
    cJSON *role = cJSON_GetObjectItemCaseSensitive(userJSON, "role");
    if (cJSON_IsNull(role)) {
        role = NULL;
    }
    if (!role) {
        goto end;
    }

    openai_api_user_ROLE_e roleVariable;
    
    if(!cJSON_IsString(role))
    {
    goto end; //Enum
    }
    roleVariable = user_role_FromString(role->valuestring);

    // user->added_at
    cJSON *added_at = cJSON_GetObjectItemCaseSensitive(userJSON, "added_at");
    if (cJSON_IsNull(added_at)) {
        added_at = NULL;
    }
    if (!added_at) {
        goto end;
    }

    
    if(!cJSON_IsNumber(added_at))
    {
    goto end; //Numeric
    }
    added_at_local_var = malloc(sizeof(int));
    if(!added_at_local_var)
    {
        goto end;
    }
    *added_at_local_var = added_at->valuedouble;


    if (id && !cJSON_IsNull(id)) id_local_str = strdup(id->valuestring);
    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);
    if (email && !cJSON_IsNull(email)) email_local_str = strdup(email->valuestring);

    user_local_var = user_create_internal (
        objectVariable,
        id_local_str,
        name_local_str,
        email_local_str,
        roleVariable,
        added_at_local_var
        );

    if (!user_local_var) {
        goto end;
    }

    return user_local_var;
end:
    if (id_local_str) {
        free(id_local_str);
        id_local_str = NULL;
    }
    if (name_local_str) {
        free(name_local_str);
        name_local_str = NULL;
    }
    if (email_local_str) {
        free(email_local_str);
        email_local_str = NULL;
    }
    if (added_at_local_var) {
        free(added_at_local_var);
        added_at_local_var = NULL;
    }
    return NULL;

}
