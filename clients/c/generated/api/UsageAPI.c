#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>

#include "UsageAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define MAX_NUMBER_LENGTH_LONG 21

// Functions for enum BUCKETWIDTH for UsageAPI_usageAudioSpeeches

static char* usageAudioSpeeches_BUCKETWIDTH_ToString(openai_api_usageAudioSpeeches_bucket_width_e BUCKETWIDTH){
    char *BUCKETWIDTHArray[] =  { "NULL", "1m", "1h", "1d" };
    return BUCKETWIDTHArray[BUCKETWIDTH];
}

static openai_api_usageAudioSpeeches_bucket_width_e usageAudioSpeeches_BUCKETWIDTH_FromString(char* BUCKETWIDTH){
    int stringToReturn = 0;
    char *BUCKETWIDTHArray[] =  { "NULL", "1m", "1h", "1d" };
    size_t sizeofArray = sizeof(BUCKETWIDTHArray) / sizeof(BUCKETWIDTHArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(BUCKETWIDTH, BUCKETWIDTHArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function usageAudioSpeeches_BUCKETWIDTH_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *usageAudioSpeeches_BUCKETWIDTH_convertToJSON(openai_api_usageAudioSpeeches_bucket_width_e BUCKETWIDTH) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "bucket_width", usageAudioSpeeches_BUCKETWIDTH_ToString(BUCKETWIDTH)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function usageAudioSpeeches_BUCKETWIDTH_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static openai_api_usageAudioSpeeches_bucket_width_e usageAudioSpeeches_BUCKETWIDTH_parseFromJSON(cJSON* BUCKETWIDTHJSON) {
    openai_api_usageAudioSpeeches_bucket_width_e BUCKETWIDTHVariable = 0;
    cJSON *BUCKETWIDTHVar = cJSON_GetObjectItemCaseSensitive(BUCKETWIDTHJSON, "bucket_width");
    if(!cJSON_IsString(BUCKETWIDTHVar) || (BUCKETWIDTHVar->valuestring == NULL))
    {
        goto end;
    }
    BUCKETWIDTHVariable = usageAudioSpeeches_BUCKETWIDTH_FromString(BUCKETWIDTHVar->valuestring);
    return BUCKETWIDTHVariable;
end:
    return 0;
}
*/

// Functions for enum GROUPBY for UsageAPI_usageAudioSpeeches

static char* usageAudioSpeeches_GROUPBY_ToString(openai_api_usageAudioSpeeches_group_by_e GROUPBY){
    char *GROUPBYArray[] =  { "NULL", "project_id", "user_id", "api_key_id", "model" };
    return GROUPBYArray[GROUPBY];
}

static openai_api_usageAudioSpeeches_group_by_e usageAudioSpeeches_GROUPBY_FromString(char* GROUPBY){
    int stringToReturn = 0;
    char *GROUPBYArray[] =  { "NULL", "project_id", "user_id", "api_key_id", "model" };
    size_t sizeofArray = sizeof(GROUPBYArray) / sizeof(GROUPBYArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(GROUPBY, GROUPBYArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function usageAudioSpeeches_GROUPBY_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *usageAudioSpeeches_GROUPBY_convertToJSON(openai_api_usageAudioSpeeches_group_by_e GROUPBY) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function usageAudioSpeeches_GROUPBY_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static openai_api_usageAudioSpeeches_group_by_e usageAudioSpeeches_GROUPBY_parseFromJSON(cJSON* GROUPBYJSON) {
    openai_api_usageAudioSpeeches_group_by_e GROUPBYVariable = 0;
    return GROUPBYVariable;
end:
    return 0;
}
*/

// Functions for enum BUCKETWIDTH for UsageAPI_usageAudioTranscriptions

static char* usageAudioTranscriptions_BUCKETWIDTH_ToString(openai_api_usageAudioTranscriptions_bucket_width_e BUCKETWIDTH){
    char *BUCKETWIDTHArray[] =  { "NULL", "1m", "1h", "1d" };
    return BUCKETWIDTHArray[BUCKETWIDTH];
}

static openai_api_usageAudioTranscriptions_bucket_width_e usageAudioTranscriptions_BUCKETWIDTH_FromString(char* BUCKETWIDTH){
    int stringToReturn = 0;
    char *BUCKETWIDTHArray[] =  { "NULL", "1m", "1h", "1d" };
    size_t sizeofArray = sizeof(BUCKETWIDTHArray) / sizeof(BUCKETWIDTHArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(BUCKETWIDTH, BUCKETWIDTHArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function usageAudioTranscriptions_BUCKETWIDTH_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *usageAudioTranscriptions_BUCKETWIDTH_convertToJSON(openai_api_usageAudioTranscriptions_bucket_width_e BUCKETWIDTH) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "bucket_width", usageAudioTranscriptions_BUCKETWIDTH_ToString(BUCKETWIDTH)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function usageAudioTranscriptions_BUCKETWIDTH_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static openai_api_usageAudioTranscriptions_bucket_width_e usageAudioTranscriptions_BUCKETWIDTH_parseFromJSON(cJSON* BUCKETWIDTHJSON) {
    openai_api_usageAudioTranscriptions_bucket_width_e BUCKETWIDTHVariable = 0;
    cJSON *BUCKETWIDTHVar = cJSON_GetObjectItemCaseSensitive(BUCKETWIDTHJSON, "bucket_width");
    if(!cJSON_IsString(BUCKETWIDTHVar) || (BUCKETWIDTHVar->valuestring == NULL))
    {
        goto end;
    }
    BUCKETWIDTHVariable = usageAudioTranscriptions_BUCKETWIDTH_FromString(BUCKETWIDTHVar->valuestring);
    return BUCKETWIDTHVariable;
end:
    return 0;
}
*/

// Functions for enum GROUPBY for UsageAPI_usageAudioTranscriptions

static char* usageAudioTranscriptions_GROUPBY_ToString(openai_api_usageAudioTranscriptions_group_by_e GROUPBY){
    char *GROUPBYArray[] =  { "NULL", "project_id", "user_id", "api_key_id", "model" };
    return GROUPBYArray[GROUPBY];
}

static openai_api_usageAudioTranscriptions_group_by_e usageAudioTranscriptions_GROUPBY_FromString(char* GROUPBY){
    int stringToReturn = 0;
    char *GROUPBYArray[] =  { "NULL", "project_id", "user_id", "api_key_id", "model" };
    size_t sizeofArray = sizeof(GROUPBYArray) / sizeof(GROUPBYArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(GROUPBY, GROUPBYArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function usageAudioTranscriptions_GROUPBY_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *usageAudioTranscriptions_GROUPBY_convertToJSON(openai_api_usageAudioTranscriptions_group_by_e GROUPBY) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function usageAudioTranscriptions_GROUPBY_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static openai_api_usageAudioTranscriptions_group_by_e usageAudioTranscriptions_GROUPBY_parseFromJSON(cJSON* GROUPBYJSON) {
    openai_api_usageAudioTranscriptions_group_by_e GROUPBYVariable = 0;
    return GROUPBYVariable;
end:
    return 0;
}
*/

// Functions for enum BUCKETWIDTH for UsageAPI_usageCodeInterpreterSessions

static char* usageCodeInterpreterSessions_BUCKETWIDTH_ToString(openai_api_usageCodeInterpreterSessions_bucket_width_e BUCKETWIDTH){
    char *BUCKETWIDTHArray[] =  { "NULL", "1m", "1h", "1d" };
    return BUCKETWIDTHArray[BUCKETWIDTH];
}

static openai_api_usageCodeInterpreterSessions_bucket_width_e usageCodeInterpreterSessions_BUCKETWIDTH_FromString(char* BUCKETWIDTH){
    int stringToReturn = 0;
    char *BUCKETWIDTHArray[] =  { "NULL", "1m", "1h", "1d" };
    size_t sizeofArray = sizeof(BUCKETWIDTHArray) / sizeof(BUCKETWIDTHArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(BUCKETWIDTH, BUCKETWIDTHArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function usageCodeInterpreterSessions_BUCKETWIDTH_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *usageCodeInterpreterSessions_BUCKETWIDTH_convertToJSON(openai_api_usageCodeInterpreterSessions_bucket_width_e BUCKETWIDTH) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "bucket_width", usageCodeInterpreterSessions_BUCKETWIDTH_ToString(BUCKETWIDTH)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function usageCodeInterpreterSessions_BUCKETWIDTH_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static openai_api_usageCodeInterpreterSessions_bucket_width_e usageCodeInterpreterSessions_BUCKETWIDTH_parseFromJSON(cJSON* BUCKETWIDTHJSON) {
    openai_api_usageCodeInterpreterSessions_bucket_width_e BUCKETWIDTHVariable = 0;
    cJSON *BUCKETWIDTHVar = cJSON_GetObjectItemCaseSensitive(BUCKETWIDTHJSON, "bucket_width");
    if(!cJSON_IsString(BUCKETWIDTHVar) || (BUCKETWIDTHVar->valuestring == NULL))
    {
        goto end;
    }
    BUCKETWIDTHVariable = usageCodeInterpreterSessions_BUCKETWIDTH_FromString(BUCKETWIDTHVar->valuestring);
    return BUCKETWIDTHVariable;
end:
    return 0;
}
*/

// Functions for enum GROUPBY for UsageAPI_usageCodeInterpreterSessions

static char* usageCodeInterpreterSessions_GROUPBY_ToString(openai_api_usageCodeInterpreterSessions_group_by_e GROUPBY){
    char *GROUPBYArray[] =  { "NULL", "project_id" };
    return GROUPBYArray[GROUPBY];
}

static openai_api_usageCodeInterpreterSessions_group_by_e usageCodeInterpreterSessions_GROUPBY_FromString(char* GROUPBY){
    int stringToReturn = 0;
    char *GROUPBYArray[] =  { "NULL", "project_id" };
    size_t sizeofArray = sizeof(GROUPBYArray) / sizeof(GROUPBYArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(GROUPBY, GROUPBYArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function usageCodeInterpreterSessions_GROUPBY_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *usageCodeInterpreterSessions_GROUPBY_convertToJSON(openai_api_usageCodeInterpreterSessions_group_by_e GROUPBY) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function usageCodeInterpreterSessions_GROUPBY_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static openai_api_usageCodeInterpreterSessions_group_by_e usageCodeInterpreterSessions_GROUPBY_parseFromJSON(cJSON* GROUPBYJSON) {
    openai_api_usageCodeInterpreterSessions_group_by_e GROUPBYVariable = 0;
    return GROUPBYVariable;
end:
    return 0;
}
*/

// Functions for enum BUCKETWIDTH for UsageAPI_usageCompletions

static char* usageCompletions_BUCKETWIDTH_ToString(openai_api_usageCompletions_bucket_width_e BUCKETWIDTH){
    char *BUCKETWIDTHArray[] =  { "NULL", "1m", "1h", "1d" };
    return BUCKETWIDTHArray[BUCKETWIDTH];
}

static openai_api_usageCompletions_bucket_width_e usageCompletions_BUCKETWIDTH_FromString(char* BUCKETWIDTH){
    int stringToReturn = 0;
    char *BUCKETWIDTHArray[] =  { "NULL", "1m", "1h", "1d" };
    size_t sizeofArray = sizeof(BUCKETWIDTHArray) / sizeof(BUCKETWIDTHArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(BUCKETWIDTH, BUCKETWIDTHArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function usageCompletions_BUCKETWIDTH_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *usageCompletions_BUCKETWIDTH_convertToJSON(openai_api_usageCompletions_bucket_width_e BUCKETWIDTH) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "bucket_width", usageCompletions_BUCKETWIDTH_ToString(BUCKETWIDTH)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function usageCompletions_BUCKETWIDTH_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static openai_api_usageCompletions_bucket_width_e usageCompletions_BUCKETWIDTH_parseFromJSON(cJSON* BUCKETWIDTHJSON) {
    openai_api_usageCompletions_bucket_width_e BUCKETWIDTHVariable = 0;
    cJSON *BUCKETWIDTHVar = cJSON_GetObjectItemCaseSensitive(BUCKETWIDTHJSON, "bucket_width");
    if(!cJSON_IsString(BUCKETWIDTHVar) || (BUCKETWIDTHVar->valuestring == NULL))
    {
        goto end;
    }
    BUCKETWIDTHVariable = usageCompletions_BUCKETWIDTH_FromString(BUCKETWIDTHVar->valuestring);
    return BUCKETWIDTHVariable;
end:
    return 0;
}
*/

// Functions for enum GROUPBY for UsageAPI_usageCompletions

static char* usageCompletions_GROUPBY_ToString(openai_api_usageCompletions_group_by_e GROUPBY){
    char *GROUPBYArray[] =  { "NULL", "project_id", "user_id", "api_key_id", "model", "batch" };
    return GROUPBYArray[GROUPBY];
}

static openai_api_usageCompletions_group_by_e usageCompletions_GROUPBY_FromString(char* GROUPBY){
    int stringToReturn = 0;
    char *GROUPBYArray[] =  { "NULL", "project_id", "user_id", "api_key_id", "model", "batch" };
    size_t sizeofArray = sizeof(GROUPBYArray) / sizeof(GROUPBYArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(GROUPBY, GROUPBYArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function usageCompletions_GROUPBY_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *usageCompletions_GROUPBY_convertToJSON(openai_api_usageCompletions_group_by_e GROUPBY) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function usageCompletions_GROUPBY_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static openai_api_usageCompletions_group_by_e usageCompletions_GROUPBY_parseFromJSON(cJSON* GROUPBYJSON) {
    openai_api_usageCompletions_group_by_e GROUPBYVariable = 0;
    return GROUPBYVariable;
end:
    return 0;
}
*/

// Functions for enum BUCKETWIDTH for UsageAPI_usageCosts

static char* usageCosts_BUCKETWIDTH_ToString(openai_api_usageCosts_bucket_width_e BUCKETWIDTH){
    char *BUCKETWIDTHArray[] =  { "NULL", "1d" };
    return BUCKETWIDTHArray[BUCKETWIDTH];
}

static openai_api_usageCosts_bucket_width_e usageCosts_BUCKETWIDTH_FromString(char* BUCKETWIDTH){
    int stringToReturn = 0;
    char *BUCKETWIDTHArray[] =  { "NULL", "1d" };
    size_t sizeofArray = sizeof(BUCKETWIDTHArray) / sizeof(BUCKETWIDTHArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(BUCKETWIDTH, BUCKETWIDTHArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function usageCosts_BUCKETWIDTH_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *usageCosts_BUCKETWIDTH_convertToJSON(openai_api_usageCosts_bucket_width_e BUCKETWIDTH) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "bucket_width", usageCosts_BUCKETWIDTH_ToString(BUCKETWIDTH)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function usageCosts_BUCKETWIDTH_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static openai_api_usageCosts_bucket_width_e usageCosts_BUCKETWIDTH_parseFromJSON(cJSON* BUCKETWIDTHJSON) {
    openai_api_usageCosts_bucket_width_e BUCKETWIDTHVariable = 0;
    cJSON *BUCKETWIDTHVar = cJSON_GetObjectItemCaseSensitive(BUCKETWIDTHJSON, "bucket_width");
    if(!cJSON_IsString(BUCKETWIDTHVar) || (BUCKETWIDTHVar->valuestring == NULL))
    {
        goto end;
    }
    BUCKETWIDTHVariable = usageCosts_BUCKETWIDTH_FromString(BUCKETWIDTHVar->valuestring);
    return BUCKETWIDTHVariable;
end:
    return 0;
}
*/

// Functions for enum GROUPBY for UsageAPI_usageCosts

static char* usageCosts_GROUPBY_ToString(openai_api_usageCosts_group_by_e GROUPBY){
    char *GROUPBYArray[] =  { "NULL", "project_id", "line_item" };
    return GROUPBYArray[GROUPBY];
}

static openai_api_usageCosts_group_by_e usageCosts_GROUPBY_FromString(char* GROUPBY){
    int stringToReturn = 0;
    char *GROUPBYArray[] =  { "NULL", "project_id", "line_item" };
    size_t sizeofArray = sizeof(GROUPBYArray) / sizeof(GROUPBYArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(GROUPBY, GROUPBYArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function usageCosts_GROUPBY_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *usageCosts_GROUPBY_convertToJSON(openai_api_usageCosts_group_by_e GROUPBY) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function usageCosts_GROUPBY_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static openai_api_usageCosts_group_by_e usageCosts_GROUPBY_parseFromJSON(cJSON* GROUPBYJSON) {
    openai_api_usageCosts_group_by_e GROUPBYVariable = 0;
    return GROUPBYVariable;
end:
    return 0;
}
*/

// Functions for enum BUCKETWIDTH for UsageAPI_usageEmbeddings

static char* usageEmbeddings_BUCKETWIDTH_ToString(openai_api_usageEmbeddings_bucket_width_e BUCKETWIDTH){
    char *BUCKETWIDTHArray[] =  { "NULL", "1m", "1h", "1d" };
    return BUCKETWIDTHArray[BUCKETWIDTH];
}

static openai_api_usageEmbeddings_bucket_width_e usageEmbeddings_BUCKETWIDTH_FromString(char* BUCKETWIDTH){
    int stringToReturn = 0;
    char *BUCKETWIDTHArray[] =  { "NULL", "1m", "1h", "1d" };
    size_t sizeofArray = sizeof(BUCKETWIDTHArray) / sizeof(BUCKETWIDTHArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(BUCKETWIDTH, BUCKETWIDTHArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function usageEmbeddings_BUCKETWIDTH_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *usageEmbeddings_BUCKETWIDTH_convertToJSON(openai_api_usageEmbeddings_bucket_width_e BUCKETWIDTH) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "bucket_width", usageEmbeddings_BUCKETWIDTH_ToString(BUCKETWIDTH)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function usageEmbeddings_BUCKETWIDTH_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static openai_api_usageEmbeddings_bucket_width_e usageEmbeddings_BUCKETWIDTH_parseFromJSON(cJSON* BUCKETWIDTHJSON) {
    openai_api_usageEmbeddings_bucket_width_e BUCKETWIDTHVariable = 0;
    cJSON *BUCKETWIDTHVar = cJSON_GetObjectItemCaseSensitive(BUCKETWIDTHJSON, "bucket_width");
    if(!cJSON_IsString(BUCKETWIDTHVar) || (BUCKETWIDTHVar->valuestring == NULL))
    {
        goto end;
    }
    BUCKETWIDTHVariable = usageEmbeddings_BUCKETWIDTH_FromString(BUCKETWIDTHVar->valuestring);
    return BUCKETWIDTHVariable;
end:
    return 0;
}
*/

// Functions for enum GROUPBY for UsageAPI_usageEmbeddings

static char* usageEmbeddings_GROUPBY_ToString(openai_api_usageEmbeddings_group_by_e GROUPBY){
    char *GROUPBYArray[] =  { "NULL", "project_id", "user_id", "api_key_id", "model" };
    return GROUPBYArray[GROUPBY];
}

static openai_api_usageEmbeddings_group_by_e usageEmbeddings_GROUPBY_FromString(char* GROUPBY){
    int stringToReturn = 0;
    char *GROUPBYArray[] =  { "NULL", "project_id", "user_id", "api_key_id", "model" };
    size_t sizeofArray = sizeof(GROUPBYArray) / sizeof(GROUPBYArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(GROUPBY, GROUPBYArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function usageEmbeddings_GROUPBY_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *usageEmbeddings_GROUPBY_convertToJSON(openai_api_usageEmbeddings_group_by_e GROUPBY) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function usageEmbeddings_GROUPBY_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static openai_api_usageEmbeddings_group_by_e usageEmbeddings_GROUPBY_parseFromJSON(cJSON* GROUPBYJSON) {
    openai_api_usageEmbeddings_group_by_e GROUPBYVariable = 0;
    return GROUPBYVariable;
end:
    return 0;
}
*/

// Functions for enum BUCKETWIDTH for UsageAPI_usageImages

static char* usageImages_BUCKETWIDTH_ToString(openai_api_usageImages_bucket_width_e BUCKETWIDTH){
    char *BUCKETWIDTHArray[] =  { "NULL", "1m", "1h", "1d" };
    return BUCKETWIDTHArray[BUCKETWIDTH];
}

static openai_api_usageImages_bucket_width_e usageImages_BUCKETWIDTH_FromString(char* BUCKETWIDTH){
    int stringToReturn = 0;
    char *BUCKETWIDTHArray[] =  { "NULL", "1m", "1h", "1d" };
    size_t sizeofArray = sizeof(BUCKETWIDTHArray) / sizeof(BUCKETWIDTHArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(BUCKETWIDTH, BUCKETWIDTHArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function usageImages_BUCKETWIDTH_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *usageImages_BUCKETWIDTH_convertToJSON(openai_api_usageImages_bucket_width_e BUCKETWIDTH) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "bucket_width", usageImages_BUCKETWIDTH_ToString(BUCKETWIDTH)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function usageImages_BUCKETWIDTH_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static openai_api_usageImages_bucket_width_e usageImages_BUCKETWIDTH_parseFromJSON(cJSON* BUCKETWIDTHJSON) {
    openai_api_usageImages_bucket_width_e BUCKETWIDTHVariable = 0;
    cJSON *BUCKETWIDTHVar = cJSON_GetObjectItemCaseSensitive(BUCKETWIDTHJSON, "bucket_width");
    if(!cJSON_IsString(BUCKETWIDTHVar) || (BUCKETWIDTHVar->valuestring == NULL))
    {
        goto end;
    }
    BUCKETWIDTHVariable = usageImages_BUCKETWIDTH_FromString(BUCKETWIDTHVar->valuestring);
    return BUCKETWIDTHVariable;
end:
    return 0;
}
*/

// Functions for enum SOURCES for UsageAPI_usageImages

static char* usageImages_SOURCES_ToString(openai_api_usageImages_sources_e SOURCES){
    char *SOURCESArray[] =  { "NULL", "image.generation", "image.edit", "image.variation" };
    return SOURCESArray[SOURCES];
}

static openai_api_usageImages_sources_e usageImages_SOURCES_FromString(char* SOURCES){
    int stringToReturn = 0;
    char *SOURCESArray[] =  { "NULL", "image.generation", "image.edit", "image.variation" };
    size_t sizeofArray = sizeof(SOURCESArray) / sizeof(SOURCESArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(SOURCES, SOURCESArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function usageImages_SOURCES_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *usageImages_SOURCES_convertToJSON(openai_api_usageImages_sources_e SOURCES) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function usageImages_SOURCES_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static openai_api_usageImages_sources_e usageImages_SOURCES_parseFromJSON(cJSON* SOURCESJSON) {
    openai_api_usageImages_sources_e SOURCESVariable = 0;
    return SOURCESVariable;
end:
    return 0;
}
*/

// Functions for enum SIZES for UsageAPI_usageImages

static char* usageImages_SIZES_ToString(openai_api_usageImages_sizes_e SIZES){
    char *SIZESArray[] =  { "NULL", "256x256", "512x512", "1024x1024", "1792x1792", "1024x1792" };
    return SIZESArray[SIZES];
}

static openai_api_usageImages_sizes_e usageImages_SIZES_FromString(char* SIZES){
    int stringToReturn = 0;
    char *SIZESArray[] =  { "NULL", "256x256", "512x512", "1024x1024", "1792x1792", "1024x1792" };
    size_t sizeofArray = sizeof(SIZESArray) / sizeof(SIZESArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(SIZES, SIZESArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function usageImages_SIZES_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *usageImages_SIZES_convertToJSON(openai_api_usageImages_sizes_e SIZES) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function usageImages_SIZES_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static openai_api_usageImages_sizes_e usageImages_SIZES_parseFromJSON(cJSON* SIZESJSON) {
    openai_api_usageImages_sizes_e SIZESVariable = 0;
    return SIZESVariable;
end:
    return 0;
}
*/

// Functions for enum GROUPBY for UsageAPI_usageImages

static char* usageImages_GROUPBY_ToString(openai_api_usageImages_group_by_e GROUPBY){
    char *GROUPBYArray[] =  { "NULL", "project_id", "user_id", "api_key_id", "model", "size", "source" };
    return GROUPBYArray[GROUPBY];
}

static openai_api_usageImages_group_by_e usageImages_GROUPBY_FromString(char* GROUPBY){
    int stringToReturn = 0;
    char *GROUPBYArray[] =  { "NULL", "project_id", "user_id", "api_key_id", "model", "size", "source" };
    size_t sizeofArray = sizeof(GROUPBYArray) / sizeof(GROUPBYArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(GROUPBY, GROUPBYArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function usageImages_GROUPBY_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *usageImages_GROUPBY_convertToJSON(openai_api_usageImages_group_by_e GROUPBY) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function usageImages_GROUPBY_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static openai_api_usageImages_group_by_e usageImages_GROUPBY_parseFromJSON(cJSON* GROUPBYJSON) {
    openai_api_usageImages_group_by_e GROUPBYVariable = 0;
    return GROUPBYVariable;
end:
    return 0;
}
*/

// Functions for enum BUCKETWIDTH for UsageAPI_usageModerations

static char* usageModerations_BUCKETWIDTH_ToString(openai_api_usageModerations_bucket_width_e BUCKETWIDTH){
    char *BUCKETWIDTHArray[] =  { "NULL", "1m", "1h", "1d" };
    return BUCKETWIDTHArray[BUCKETWIDTH];
}

static openai_api_usageModerations_bucket_width_e usageModerations_BUCKETWIDTH_FromString(char* BUCKETWIDTH){
    int stringToReturn = 0;
    char *BUCKETWIDTHArray[] =  { "NULL", "1m", "1h", "1d" };
    size_t sizeofArray = sizeof(BUCKETWIDTHArray) / sizeof(BUCKETWIDTHArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(BUCKETWIDTH, BUCKETWIDTHArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function usageModerations_BUCKETWIDTH_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *usageModerations_BUCKETWIDTH_convertToJSON(openai_api_usageModerations_bucket_width_e BUCKETWIDTH) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "bucket_width", usageModerations_BUCKETWIDTH_ToString(BUCKETWIDTH)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function usageModerations_BUCKETWIDTH_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static openai_api_usageModerations_bucket_width_e usageModerations_BUCKETWIDTH_parseFromJSON(cJSON* BUCKETWIDTHJSON) {
    openai_api_usageModerations_bucket_width_e BUCKETWIDTHVariable = 0;
    cJSON *BUCKETWIDTHVar = cJSON_GetObjectItemCaseSensitive(BUCKETWIDTHJSON, "bucket_width");
    if(!cJSON_IsString(BUCKETWIDTHVar) || (BUCKETWIDTHVar->valuestring == NULL))
    {
        goto end;
    }
    BUCKETWIDTHVariable = usageModerations_BUCKETWIDTH_FromString(BUCKETWIDTHVar->valuestring);
    return BUCKETWIDTHVariable;
end:
    return 0;
}
*/

// Functions for enum GROUPBY for UsageAPI_usageModerations

static char* usageModerations_GROUPBY_ToString(openai_api_usageModerations_group_by_e GROUPBY){
    char *GROUPBYArray[] =  { "NULL", "project_id", "user_id", "api_key_id", "model" };
    return GROUPBYArray[GROUPBY];
}

static openai_api_usageModerations_group_by_e usageModerations_GROUPBY_FromString(char* GROUPBY){
    int stringToReturn = 0;
    char *GROUPBYArray[] =  { "NULL", "project_id", "user_id", "api_key_id", "model" };
    size_t sizeofArray = sizeof(GROUPBYArray) / sizeof(GROUPBYArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(GROUPBY, GROUPBYArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function usageModerations_GROUPBY_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *usageModerations_GROUPBY_convertToJSON(openai_api_usageModerations_group_by_e GROUPBY) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function usageModerations_GROUPBY_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static openai_api_usageModerations_group_by_e usageModerations_GROUPBY_parseFromJSON(cJSON* GROUPBYJSON) {
    openai_api_usageModerations_group_by_e GROUPBYVariable = 0;
    return GROUPBYVariable;
end:
    return 0;
}
*/

// Functions for enum BUCKETWIDTH for UsageAPI_usageVectorStores

static char* usageVectorStores_BUCKETWIDTH_ToString(openai_api_usageVectorStores_bucket_width_e BUCKETWIDTH){
    char *BUCKETWIDTHArray[] =  { "NULL", "1m", "1h", "1d" };
    return BUCKETWIDTHArray[BUCKETWIDTH];
}

static openai_api_usageVectorStores_bucket_width_e usageVectorStores_BUCKETWIDTH_FromString(char* BUCKETWIDTH){
    int stringToReturn = 0;
    char *BUCKETWIDTHArray[] =  { "NULL", "1m", "1h", "1d" };
    size_t sizeofArray = sizeof(BUCKETWIDTHArray) / sizeof(BUCKETWIDTHArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(BUCKETWIDTH, BUCKETWIDTHArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function usageVectorStores_BUCKETWIDTH_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *usageVectorStores_BUCKETWIDTH_convertToJSON(openai_api_usageVectorStores_bucket_width_e BUCKETWIDTH) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "bucket_width", usageVectorStores_BUCKETWIDTH_ToString(BUCKETWIDTH)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function usageVectorStores_BUCKETWIDTH_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static openai_api_usageVectorStores_bucket_width_e usageVectorStores_BUCKETWIDTH_parseFromJSON(cJSON* BUCKETWIDTHJSON) {
    openai_api_usageVectorStores_bucket_width_e BUCKETWIDTHVariable = 0;
    cJSON *BUCKETWIDTHVar = cJSON_GetObjectItemCaseSensitive(BUCKETWIDTHJSON, "bucket_width");
    if(!cJSON_IsString(BUCKETWIDTHVar) || (BUCKETWIDTHVar->valuestring == NULL))
    {
        goto end;
    }
    BUCKETWIDTHVariable = usageVectorStores_BUCKETWIDTH_FromString(BUCKETWIDTHVar->valuestring);
    return BUCKETWIDTHVariable;
end:
    return 0;
}
*/

// Functions for enum GROUPBY for UsageAPI_usageVectorStores

static char* usageVectorStores_GROUPBY_ToString(openai_api_usageVectorStores_group_by_e GROUPBY){
    char *GROUPBYArray[] =  { "NULL", "project_id" };
    return GROUPBYArray[GROUPBY];
}

static openai_api_usageVectorStores_group_by_e usageVectorStores_GROUPBY_FromString(char* GROUPBY){
    int stringToReturn = 0;
    char *GROUPBYArray[] =  { "NULL", "project_id" };
    size_t sizeofArray = sizeof(GROUPBYArray) / sizeof(GROUPBYArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(GROUPBY, GROUPBYArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function usageVectorStores_GROUPBY_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *usageVectorStores_GROUPBY_convertToJSON(openai_api_usageVectorStores_group_by_e GROUPBY) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function usageVectorStores_GROUPBY_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static openai_api_usageVectorStores_group_by_e usageVectorStores_GROUPBY_parseFromJSON(cJSON* GROUPBYJSON) {
    openai_api_usageVectorStores_group_by_e GROUPBYVariable = 0;
    return GROUPBYVariable;
end:
    return 0;
}
*/


// Get audio speeches usage details for the organization.
//
usage_response_t*
UsageAPI_usageAudioSpeeches(apiClient_t *apiClient, int *start_time, int *end_time, openai_api_usageAudioSpeeches_bucket_width_e bucket_width, list_t *project_ids, list_t *user_ids, list_t *api_key_ids, list_t *models, list_t *group_by, int *limit, char *page)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/organization/usage/audio_speeches");





    // query parameters
    char *keyQuery_start_time = NULL;
    char * valueQuery_start_time = NULL;
    keyValuePair_t *keyPairQuery_start_time = 0;
    if (start_time)
    {
        keyQuery_start_time = strdup("start_time");
        valueQuery_start_time = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_start_time, MAX_NUMBER_LENGTH, "%d", *start_time);
        keyPairQuery_start_time = keyValuePair_create(keyQuery_start_time, valueQuery_start_time);
        list_addElement(localVarQueryParameters,keyPairQuery_start_time);
    }

    // query parameters
    char *keyQuery_end_time = NULL;
    char * valueQuery_end_time = NULL;
    keyValuePair_t *keyPairQuery_end_time = 0;
    if (end_time)
    {
        keyQuery_end_time = strdup("end_time");
        valueQuery_end_time = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_end_time, MAX_NUMBER_LENGTH, "%d", *end_time);
        keyPairQuery_end_time = keyValuePair_create(keyQuery_end_time, valueQuery_end_time);
        list_addElement(localVarQueryParameters,keyPairQuery_end_time);
    }

    // query parameters
    char *keyQuery_bucket_width = NULL;
    openai_api_usageAudioSpeeches_bucket_width_e valueQuery_bucket_width ;
    keyValuePair_t *keyPairQuery_bucket_width = 0;
    if (bucket_width)
    {
        keyQuery_bucket_width = strdup("bucket_width");
        valueQuery_bucket_width = (bucket_width);
        keyPairQuery_bucket_width = keyValuePair_create(keyQuery_bucket_width, strdup(usageAudioSpeeches_BUCKETWIDTH_ToString(
        valueQuery_bucket_width)));
        list_addElement(localVarQueryParameters,keyPairQuery_bucket_width);
    }

    // query parameters
    if (project_ids)
    {
        list_addElement(localVarQueryParameters,project_ids);
    }

    // query parameters
    if (user_ids)
    {
        list_addElement(localVarQueryParameters,user_ids);
    }

    // query parameters
    if (api_key_ids)
    {
        list_addElement(localVarQueryParameters,api_key_ids);
    }

    // query parameters
    if (models)
    {
        list_addElement(localVarQueryParameters,models);
    }

    // query parameters
    if (group_by)
    {
        list_addElement(localVarQueryParameters,group_by);
    }

    // query parameters
    char *keyQuery_limit = NULL;
    char * valueQuery_limit = NULL;
    keyValuePair_t *keyPairQuery_limit = 0;
    if (limit)
    {
        keyQuery_limit = strdup("limit");
        valueQuery_limit = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_limit, MAX_NUMBER_LENGTH, "%d", *limit);
        keyPairQuery_limit = keyValuePair_create(keyQuery_limit, valueQuery_limit);
        list_addElement(localVarQueryParameters,keyPairQuery_limit);
    }

    // query parameters
    char *keyQuery_page = NULL;
    char * valueQuery_page = NULL;
    keyValuePair_t *keyPairQuery_page = 0;
    if (page)
    {
        keyQuery_page = strdup("page");
        valueQuery_page = strdup((page));
        keyPairQuery_page = keyValuePair_create(keyQuery_page, valueQuery_page);
        list_addElement(localVarQueryParameters,keyPairQuery_page);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Usage data retrieved successfully.");
    //}
    //nonprimitive not container
    usage_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *UsageAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = usage_response_parseFromJSON(UsageAPIlocalVarJSON);
        cJSON_Delete(UsageAPIlocalVarJSON);
        if(elementToReturn == NULL) {
            // return 0;
        }
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_freeList(localVarQueryParameters);
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    if(keyQuery_start_time){
        free(keyQuery_start_time);
        keyQuery_start_time = NULL;
    }
    if(valueQuery_start_time){
        free(valueQuery_start_time);
        valueQuery_start_time = NULL;
    }
    if(keyPairQuery_start_time){
        keyValuePair_free(keyPairQuery_start_time);
        keyPairQuery_start_time = NULL;
    }
    if(keyQuery_end_time){
        free(keyQuery_end_time);
        keyQuery_end_time = NULL;
    }
    if(valueQuery_end_time){
        free(valueQuery_end_time);
        valueQuery_end_time = NULL;
    }
    if(keyPairQuery_end_time){
        keyValuePair_free(keyPairQuery_end_time);
        keyPairQuery_end_time = NULL;
    }
    if(keyQuery_bucket_width){
        free(keyQuery_bucket_width);
        keyQuery_bucket_width = NULL;
    }
    if(keyPairQuery_bucket_width){
        keyValuePair_free(keyPairQuery_bucket_width);
        keyPairQuery_bucket_width = NULL;
    }
    if(keyQuery_limit){
        free(keyQuery_limit);
        keyQuery_limit = NULL;
    }
    if(valueQuery_limit){
        free(valueQuery_limit);
        valueQuery_limit = NULL;
    }
    if(keyPairQuery_limit){
        keyValuePair_free(keyPairQuery_limit);
        keyPairQuery_limit = NULL;
    }
    if(keyQuery_page){
        free(keyQuery_page);
        keyQuery_page = NULL;
    }
    if(valueQuery_page){
        free(valueQuery_page);
        valueQuery_page = NULL;
    }
    if(keyPairQuery_page){
        keyValuePair_free(keyPairQuery_page);
        keyPairQuery_page = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Get audio transcriptions usage details for the organization.
//
usage_response_t*
UsageAPI_usageAudioTranscriptions(apiClient_t *apiClient, int *start_time, int *end_time, openai_api_usageAudioTranscriptions_bucket_width_e bucket_width, list_t *project_ids, list_t *user_ids, list_t *api_key_ids, list_t *models, list_t *group_by, int *limit, char *page)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/organization/usage/audio_transcriptions");





    // query parameters
    char *keyQuery_start_time = NULL;
    char * valueQuery_start_time = NULL;
    keyValuePair_t *keyPairQuery_start_time = 0;
    if (start_time)
    {
        keyQuery_start_time = strdup("start_time");
        valueQuery_start_time = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_start_time, MAX_NUMBER_LENGTH, "%d", *start_time);
        keyPairQuery_start_time = keyValuePair_create(keyQuery_start_time, valueQuery_start_time);
        list_addElement(localVarQueryParameters,keyPairQuery_start_time);
    }

    // query parameters
    char *keyQuery_end_time = NULL;
    char * valueQuery_end_time = NULL;
    keyValuePair_t *keyPairQuery_end_time = 0;
    if (end_time)
    {
        keyQuery_end_time = strdup("end_time");
        valueQuery_end_time = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_end_time, MAX_NUMBER_LENGTH, "%d", *end_time);
        keyPairQuery_end_time = keyValuePair_create(keyQuery_end_time, valueQuery_end_time);
        list_addElement(localVarQueryParameters,keyPairQuery_end_time);
    }

    // query parameters
    char *keyQuery_bucket_width = NULL;
    openai_api_usageAudioTranscriptions_bucket_width_e valueQuery_bucket_width ;
    keyValuePair_t *keyPairQuery_bucket_width = 0;
    if (bucket_width)
    {
        keyQuery_bucket_width = strdup("bucket_width");
        valueQuery_bucket_width = (bucket_width);
        keyPairQuery_bucket_width = keyValuePair_create(keyQuery_bucket_width, strdup(usageAudioTranscriptions_BUCKETWIDTH_ToString(
        valueQuery_bucket_width)));
        list_addElement(localVarQueryParameters,keyPairQuery_bucket_width);
    }

    // query parameters
    if (project_ids)
    {
        list_addElement(localVarQueryParameters,project_ids);
    }

    // query parameters
    if (user_ids)
    {
        list_addElement(localVarQueryParameters,user_ids);
    }

    // query parameters
    if (api_key_ids)
    {
        list_addElement(localVarQueryParameters,api_key_ids);
    }

    // query parameters
    if (models)
    {
        list_addElement(localVarQueryParameters,models);
    }

    // query parameters
    if (group_by)
    {
        list_addElement(localVarQueryParameters,group_by);
    }

    // query parameters
    char *keyQuery_limit = NULL;
    char * valueQuery_limit = NULL;
    keyValuePair_t *keyPairQuery_limit = 0;
    if (limit)
    {
        keyQuery_limit = strdup("limit");
        valueQuery_limit = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_limit, MAX_NUMBER_LENGTH, "%d", *limit);
        keyPairQuery_limit = keyValuePair_create(keyQuery_limit, valueQuery_limit);
        list_addElement(localVarQueryParameters,keyPairQuery_limit);
    }

    // query parameters
    char *keyQuery_page = NULL;
    char * valueQuery_page = NULL;
    keyValuePair_t *keyPairQuery_page = 0;
    if (page)
    {
        keyQuery_page = strdup("page");
        valueQuery_page = strdup((page));
        keyPairQuery_page = keyValuePair_create(keyQuery_page, valueQuery_page);
        list_addElement(localVarQueryParameters,keyPairQuery_page);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Usage data retrieved successfully.");
    //}
    //nonprimitive not container
    usage_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *UsageAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = usage_response_parseFromJSON(UsageAPIlocalVarJSON);
        cJSON_Delete(UsageAPIlocalVarJSON);
        if(elementToReturn == NULL) {
            // return 0;
        }
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_freeList(localVarQueryParameters);
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    if(keyQuery_start_time){
        free(keyQuery_start_time);
        keyQuery_start_time = NULL;
    }
    if(valueQuery_start_time){
        free(valueQuery_start_time);
        valueQuery_start_time = NULL;
    }
    if(keyPairQuery_start_time){
        keyValuePair_free(keyPairQuery_start_time);
        keyPairQuery_start_time = NULL;
    }
    if(keyQuery_end_time){
        free(keyQuery_end_time);
        keyQuery_end_time = NULL;
    }
    if(valueQuery_end_time){
        free(valueQuery_end_time);
        valueQuery_end_time = NULL;
    }
    if(keyPairQuery_end_time){
        keyValuePair_free(keyPairQuery_end_time);
        keyPairQuery_end_time = NULL;
    }
    if(keyQuery_bucket_width){
        free(keyQuery_bucket_width);
        keyQuery_bucket_width = NULL;
    }
    if(keyPairQuery_bucket_width){
        keyValuePair_free(keyPairQuery_bucket_width);
        keyPairQuery_bucket_width = NULL;
    }
    if(keyQuery_limit){
        free(keyQuery_limit);
        keyQuery_limit = NULL;
    }
    if(valueQuery_limit){
        free(valueQuery_limit);
        valueQuery_limit = NULL;
    }
    if(keyPairQuery_limit){
        keyValuePair_free(keyPairQuery_limit);
        keyPairQuery_limit = NULL;
    }
    if(keyQuery_page){
        free(keyQuery_page);
        keyQuery_page = NULL;
    }
    if(valueQuery_page){
        free(valueQuery_page);
        valueQuery_page = NULL;
    }
    if(keyPairQuery_page){
        keyValuePair_free(keyPairQuery_page);
        keyPairQuery_page = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Get code interpreter sessions usage details for the organization.
//
usage_response_t*
UsageAPI_usageCodeInterpreterSessions(apiClient_t *apiClient, int *start_time, int *end_time, openai_api_usageCodeInterpreterSessions_bucket_width_e bucket_width, list_t *project_ids, list_t *group_by, int *limit, char *page)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/organization/usage/code_interpreter_sessions");





    // query parameters
    char *keyQuery_start_time = NULL;
    char * valueQuery_start_time = NULL;
    keyValuePair_t *keyPairQuery_start_time = 0;
    if (start_time)
    {
        keyQuery_start_time = strdup("start_time");
        valueQuery_start_time = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_start_time, MAX_NUMBER_LENGTH, "%d", *start_time);
        keyPairQuery_start_time = keyValuePair_create(keyQuery_start_time, valueQuery_start_time);
        list_addElement(localVarQueryParameters,keyPairQuery_start_time);
    }

    // query parameters
    char *keyQuery_end_time = NULL;
    char * valueQuery_end_time = NULL;
    keyValuePair_t *keyPairQuery_end_time = 0;
    if (end_time)
    {
        keyQuery_end_time = strdup("end_time");
        valueQuery_end_time = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_end_time, MAX_NUMBER_LENGTH, "%d", *end_time);
        keyPairQuery_end_time = keyValuePair_create(keyQuery_end_time, valueQuery_end_time);
        list_addElement(localVarQueryParameters,keyPairQuery_end_time);
    }

    // query parameters
    char *keyQuery_bucket_width = NULL;
    openai_api_usageCodeInterpreterSessions_bucket_width_e valueQuery_bucket_width ;
    keyValuePair_t *keyPairQuery_bucket_width = 0;
    if (bucket_width)
    {
        keyQuery_bucket_width = strdup("bucket_width");
        valueQuery_bucket_width = (bucket_width);
        keyPairQuery_bucket_width = keyValuePair_create(keyQuery_bucket_width, strdup(usageCodeInterpreterSessions_BUCKETWIDTH_ToString(
        valueQuery_bucket_width)));
        list_addElement(localVarQueryParameters,keyPairQuery_bucket_width);
    }

    // query parameters
    if (project_ids)
    {
        list_addElement(localVarQueryParameters,project_ids);
    }

    // query parameters
    if (group_by)
    {
        list_addElement(localVarQueryParameters,group_by);
    }

    // query parameters
    char *keyQuery_limit = NULL;
    char * valueQuery_limit = NULL;
    keyValuePair_t *keyPairQuery_limit = 0;
    if (limit)
    {
        keyQuery_limit = strdup("limit");
        valueQuery_limit = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_limit, MAX_NUMBER_LENGTH, "%d", *limit);
        keyPairQuery_limit = keyValuePair_create(keyQuery_limit, valueQuery_limit);
        list_addElement(localVarQueryParameters,keyPairQuery_limit);
    }

    // query parameters
    char *keyQuery_page = NULL;
    char * valueQuery_page = NULL;
    keyValuePair_t *keyPairQuery_page = 0;
    if (page)
    {
        keyQuery_page = strdup("page");
        valueQuery_page = strdup((page));
        keyPairQuery_page = keyValuePair_create(keyQuery_page, valueQuery_page);
        list_addElement(localVarQueryParameters,keyPairQuery_page);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Usage data retrieved successfully.");
    //}
    //nonprimitive not container
    usage_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *UsageAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = usage_response_parseFromJSON(UsageAPIlocalVarJSON);
        cJSON_Delete(UsageAPIlocalVarJSON);
        if(elementToReturn == NULL) {
            // return 0;
        }
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_freeList(localVarQueryParameters);
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    if(keyQuery_start_time){
        free(keyQuery_start_time);
        keyQuery_start_time = NULL;
    }
    if(valueQuery_start_time){
        free(valueQuery_start_time);
        valueQuery_start_time = NULL;
    }
    if(keyPairQuery_start_time){
        keyValuePair_free(keyPairQuery_start_time);
        keyPairQuery_start_time = NULL;
    }
    if(keyQuery_end_time){
        free(keyQuery_end_time);
        keyQuery_end_time = NULL;
    }
    if(valueQuery_end_time){
        free(valueQuery_end_time);
        valueQuery_end_time = NULL;
    }
    if(keyPairQuery_end_time){
        keyValuePair_free(keyPairQuery_end_time);
        keyPairQuery_end_time = NULL;
    }
    if(keyQuery_bucket_width){
        free(keyQuery_bucket_width);
        keyQuery_bucket_width = NULL;
    }
    if(keyPairQuery_bucket_width){
        keyValuePair_free(keyPairQuery_bucket_width);
        keyPairQuery_bucket_width = NULL;
    }
    if(keyQuery_limit){
        free(keyQuery_limit);
        keyQuery_limit = NULL;
    }
    if(valueQuery_limit){
        free(valueQuery_limit);
        valueQuery_limit = NULL;
    }
    if(keyPairQuery_limit){
        keyValuePair_free(keyPairQuery_limit);
        keyPairQuery_limit = NULL;
    }
    if(keyQuery_page){
        free(keyQuery_page);
        keyQuery_page = NULL;
    }
    if(valueQuery_page){
        free(valueQuery_page);
        valueQuery_page = NULL;
    }
    if(keyPairQuery_page){
        keyValuePair_free(keyPairQuery_page);
        keyPairQuery_page = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Get completions usage details for the organization.
//
usage_response_t*
UsageAPI_usageCompletions(apiClient_t *apiClient, int *start_time, int *end_time, openai_api_usageCompletions_bucket_width_e bucket_width, list_t *project_ids, list_t *user_ids, list_t *api_key_ids, list_t *models, int *batch, list_t *group_by, int *limit, char *page)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/organization/usage/completions");





    // query parameters
    char *keyQuery_start_time = NULL;
    char * valueQuery_start_time = NULL;
    keyValuePair_t *keyPairQuery_start_time = 0;
    if (start_time)
    {
        keyQuery_start_time = strdup("start_time");
        valueQuery_start_time = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_start_time, MAX_NUMBER_LENGTH, "%d", *start_time);
        keyPairQuery_start_time = keyValuePair_create(keyQuery_start_time, valueQuery_start_time);
        list_addElement(localVarQueryParameters,keyPairQuery_start_time);
    }

    // query parameters
    char *keyQuery_end_time = NULL;
    char * valueQuery_end_time = NULL;
    keyValuePair_t *keyPairQuery_end_time = 0;
    if (end_time)
    {
        keyQuery_end_time = strdup("end_time");
        valueQuery_end_time = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_end_time, MAX_NUMBER_LENGTH, "%d", *end_time);
        keyPairQuery_end_time = keyValuePair_create(keyQuery_end_time, valueQuery_end_time);
        list_addElement(localVarQueryParameters,keyPairQuery_end_time);
    }

    // query parameters
    char *keyQuery_bucket_width = NULL;
    openai_api_usageCompletions_bucket_width_e valueQuery_bucket_width ;
    keyValuePair_t *keyPairQuery_bucket_width = 0;
    if (bucket_width)
    {
        keyQuery_bucket_width = strdup("bucket_width");
        valueQuery_bucket_width = (bucket_width);
        keyPairQuery_bucket_width = keyValuePair_create(keyQuery_bucket_width, strdup(usageCompletions_BUCKETWIDTH_ToString(
        valueQuery_bucket_width)));
        list_addElement(localVarQueryParameters,keyPairQuery_bucket_width);
    }

    // query parameters
    if (project_ids)
    {
        list_addElement(localVarQueryParameters,project_ids);
    }

    // query parameters
    if (user_ids)
    {
        list_addElement(localVarQueryParameters,user_ids);
    }

    // query parameters
    if (api_key_ids)
    {
        list_addElement(localVarQueryParameters,api_key_ids);
    }

    // query parameters
    if (models)
    {
        list_addElement(localVarQueryParameters,models);
    }

    // query parameters
    char *keyQuery_batch = NULL;
    char * valueQuery_batch = NULL;
    keyValuePair_t *keyPairQuery_batch = 0;
    if (batch)
    {
        keyQuery_batch = strdup("batch");
        valueQuery_batch = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_batch, MAX_NUMBER_LENGTH, "%d", *batch);
        keyPairQuery_batch = keyValuePair_create(keyQuery_batch, valueQuery_batch);
        list_addElement(localVarQueryParameters,keyPairQuery_batch);
    }

    // query parameters
    if (group_by)
    {
        list_addElement(localVarQueryParameters,group_by);
    }

    // query parameters
    char *keyQuery_limit = NULL;
    char * valueQuery_limit = NULL;
    keyValuePair_t *keyPairQuery_limit = 0;
    if (limit)
    {
        keyQuery_limit = strdup("limit");
        valueQuery_limit = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_limit, MAX_NUMBER_LENGTH, "%d", *limit);
        keyPairQuery_limit = keyValuePair_create(keyQuery_limit, valueQuery_limit);
        list_addElement(localVarQueryParameters,keyPairQuery_limit);
    }

    // query parameters
    char *keyQuery_page = NULL;
    char * valueQuery_page = NULL;
    keyValuePair_t *keyPairQuery_page = 0;
    if (page)
    {
        keyQuery_page = strdup("page");
        valueQuery_page = strdup((page));
        keyPairQuery_page = keyValuePair_create(keyQuery_page, valueQuery_page);
        list_addElement(localVarQueryParameters,keyPairQuery_page);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Usage data retrieved successfully.");
    //}
    //nonprimitive not container
    usage_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *UsageAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = usage_response_parseFromJSON(UsageAPIlocalVarJSON);
        cJSON_Delete(UsageAPIlocalVarJSON);
        if(elementToReturn == NULL) {
            // return 0;
        }
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_freeList(localVarQueryParameters);
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    if(keyQuery_start_time){
        free(keyQuery_start_time);
        keyQuery_start_time = NULL;
    }
    if(valueQuery_start_time){
        free(valueQuery_start_time);
        valueQuery_start_time = NULL;
    }
    if(keyPairQuery_start_time){
        keyValuePair_free(keyPairQuery_start_time);
        keyPairQuery_start_time = NULL;
    }
    if(keyQuery_end_time){
        free(keyQuery_end_time);
        keyQuery_end_time = NULL;
    }
    if(valueQuery_end_time){
        free(valueQuery_end_time);
        valueQuery_end_time = NULL;
    }
    if(keyPairQuery_end_time){
        keyValuePair_free(keyPairQuery_end_time);
        keyPairQuery_end_time = NULL;
    }
    if(keyQuery_bucket_width){
        free(keyQuery_bucket_width);
        keyQuery_bucket_width = NULL;
    }
    if(keyPairQuery_bucket_width){
        keyValuePair_free(keyPairQuery_bucket_width);
        keyPairQuery_bucket_width = NULL;
    }
    if(keyQuery_batch){
        free(keyQuery_batch);
        keyQuery_batch = NULL;
    }
    if(valueQuery_batch){
        free(valueQuery_batch);
        valueQuery_batch = NULL;
    }
    if(keyPairQuery_batch){
        keyValuePair_free(keyPairQuery_batch);
        keyPairQuery_batch = NULL;
    }
    if(keyQuery_limit){
        free(keyQuery_limit);
        keyQuery_limit = NULL;
    }
    if(valueQuery_limit){
        free(valueQuery_limit);
        valueQuery_limit = NULL;
    }
    if(keyPairQuery_limit){
        keyValuePair_free(keyPairQuery_limit);
        keyPairQuery_limit = NULL;
    }
    if(keyQuery_page){
        free(keyQuery_page);
        keyQuery_page = NULL;
    }
    if(valueQuery_page){
        free(valueQuery_page);
        valueQuery_page = NULL;
    }
    if(keyPairQuery_page){
        keyValuePair_free(keyPairQuery_page);
        keyPairQuery_page = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Get costs details for the organization.
//
usage_response_t*
UsageAPI_usageCosts(apiClient_t *apiClient, int *start_time, int *end_time, openai_api_usageCosts_bucket_width_e bucket_width, list_t *project_ids, list_t *group_by, int *limit, char *page)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/organization/costs");





    // query parameters
    char *keyQuery_start_time = NULL;
    char * valueQuery_start_time = NULL;
    keyValuePair_t *keyPairQuery_start_time = 0;
    if (start_time)
    {
        keyQuery_start_time = strdup("start_time");
        valueQuery_start_time = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_start_time, MAX_NUMBER_LENGTH, "%d", *start_time);
        keyPairQuery_start_time = keyValuePair_create(keyQuery_start_time, valueQuery_start_time);
        list_addElement(localVarQueryParameters,keyPairQuery_start_time);
    }

    // query parameters
    char *keyQuery_end_time = NULL;
    char * valueQuery_end_time = NULL;
    keyValuePair_t *keyPairQuery_end_time = 0;
    if (end_time)
    {
        keyQuery_end_time = strdup("end_time");
        valueQuery_end_time = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_end_time, MAX_NUMBER_LENGTH, "%d", *end_time);
        keyPairQuery_end_time = keyValuePair_create(keyQuery_end_time, valueQuery_end_time);
        list_addElement(localVarQueryParameters,keyPairQuery_end_time);
    }

    // query parameters
    char *keyQuery_bucket_width = NULL;
    openai_api_usageCosts_bucket_width_e valueQuery_bucket_width ;
    keyValuePair_t *keyPairQuery_bucket_width = 0;
    if (bucket_width)
    {
        keyQuery_bucket_width = strdup("bucket_width");
        valueQuery_bucket_width = (bucket_width);
        keyPairQuery_bucket_width = keyValuePair_create(keyQuery_bucket_width, strdup(usageCosts_BUCKETWIDTH_ToString(
        valueQuery_bucket_width)));
        list_addElement(localVarQueryParameters,keyPairQuery_bucket_width);
    }

    // query parameters
    if (project_ids)
    {
        list_addElement(localVarQueryParameters,project_ids);
    }

    // query parameters
    if (group_by)
    {
        list_addElement(localVarQueryParameters,group_by);
    }

    // query parameters
    char *keyQuery_limit = NULL;
    char * valueQuery_limit = NULL;
    keyValuePair_t *keyPairQuery_limit = 0;
    if (limit)
    {
        keyQuery_limit = strdup("limit");
        valueQuery_limit = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_limit, MAX_NUMBER_LENGTH, "%d", *limit);
        keyPairQuery_limit = keyValuePair_create(keyQuery_limit, valueQuery_limit);
        list_addElement(localVarQueryParameters,keyPairQuery_limit);
    }

    // query parameters
    char *keyQuery_page = NULL;
    char * valueQuery_page = NULL;
    keyValuePair_t *keyPairQuery_page = 0;
    if (page)
    {
        keyQuery_page = strdup("page");
        valueQuery_page = strdup((page));
        keyPairQuery_page = keyValuePair_create(keyQuery_page, valueQuery_page);
        list_addElement(localVarQueryParameters,keyPairQuery_page);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Costs data retrieved successfully.");
    //}
    //nonprimitive not container
    usage_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *UsageAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = usage_response_parseFromJSON(UsageAPIlocalVarJSON);
        cJSON_Delete(UsageAPIlocalVarJSON);
        if(elementToReturn == NULL) {
            // return 0;
        }
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_freeList(localVarQueryParameters);
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    if(keyQuery_start_time){
        free(keyQuery_start_time);
        keyQuery_start_time = NULL;
    }
    if(valueQuery_start_time){
        free(valueQuery_start_time);
        valueQuery_start_time = NULL;
    }
    if(keyPairQuery_start_time){
        keyValuePair_free(keyPairQuery_start_time);
        keyPairQuery_start_time = NULL;
    }
    if(keyQuery_end_time){
        free(keyQuery_end_time);
        keyQuery_end_time = NULL;
    }
    if(valueQuery_end_time){
        free(valueQuery_end_time);
        valueQuery_end_time = NULL;
    }
    if(keyPairQuery_end_time){
        keyValuePair_free(keyPairQuery_end_time);
        keyPairQuery_end_time = NULL;
    }
    if(keyQuery_bucket_width){
        free(keyQuery_bucket_width);
        keyQuery_bucket_width = NULL;
    }
    if(keyPairQuery_bucket_width){
        keyValuePair_free(keyPairQuery_bucket_width);
        keyPairQuery_bucket_width = NULL;
    }
    if(keyQuery_limit){
        free(keyQuery_limit);
        keyQuery_limit = NULL;
    }
    if(valueQuery_limit){
        free(valueQuery_limit);
        valueQuery_limit = NULL;
    }
    if(keyPairQuery_limit){
        keyValuePair_free(keyPairQuery_limit);
        keyPairQuery_limit = NULL;
    }
    if(keyQuery_page){
        free(keyQuery_page);
        keyQuery_page = NULL;
    }
    if(valueQuery_page){
        free(valueQuery_page);
        valueQuery_page = NULL;
    }
    if(keyPairQuery_page){
        keyValuePair_free(keyPairQuery_page);
        keyPairQuery_page = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Get embeddings usage details for the organization.
//
usage_response_t*
UsageAPI_usageEmbeddings(apiClient_t *apiClient, int *start_time, int *end_time, openai_api_usageEmbeddings_bucket_width_e bucket_width, list_t *project_ids, list_t *user_ids, list_t *api_key_ids, list_t *models, list_t *group_by, int *limit, char *page)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/organization/usage/embeddings");





    // query parameters
    char *keyQuery_start_time = NULL;
    char * valueQuery_start_time = NULL;
    keyValuePair_t *keyPairQuery_start_time = 0;
    if (start_time)
    {
        keyQuery_start_time = strdup("start_time");
        valueQuery_start_time = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_start_time, MAX_NUMBER_LENGTH, "%d", *start_time);
        keyPairQuery_start_time = keyValuePair_create(keyQuery_start_time, valueQuery_start_time);
        list_addElement(localVarQueryParameters,keyPairQuery_start_time);
    }

    // query parameters
    char *keyQuery_end_time = NULL;
    char * valueQuery_end_time = NULL;
    keyValuePair_t *keyPairQuery_end_time = 0;
    if (end_time)
    {
        keyQuery_end_time = strdup("end_time");
        valueQuery_end_time = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_end_time, MAX_NUMBER_LENGTH, "%d", *end_time);
        keyPairQuery_end_time = keyValuePair_create(keyQuery_end_time, valueQuery_end_time);
        list_addElement(localVarQueryParameters,keyPairQuery_end_time);
    }

    // query parameters
    char *keyQuery_bucket_width = NULL;
    openai_api_usageEmbeddings_bucket_width_e valueQuery_bucket_width ;
    keyValuePair_t *keyPairQuery_bucket_width = 0;
    if (bucket_width)
    {
        keyQuery_bucket_width = strdup("bucket_width");
        valueQuery_bucket_width = (bucket_width);
        keyPairQuery_bucket_width = keyValuePair_create(keyQuery_bucket_width, strdup(usageEmbeddings_BUCKETWIDTH_ToString(
        valueQuery_bucket_width)));
        list_addElement(localVarQueryParameters,keyPairQuery_bucket_width);
    }

    // query parameters
    if (project_ids)
    {
        list_addElement(localVarQueryParameters,project_ids);
    }

    // query parameters
    if (user_ids)
    {
        list_addElement(localVarQueryParameters,user_ids);
    }

    // query parameters
    if (api_key_ids)
    {
        list_addElement(localVarQueryParameters,api_key_ids);
    }

    // query parameters
    if (models)
    {
        list_addElement(localVarQueryParameters,models);
    }

    // query parameters
    if (group_by)
    {
        list_addElement(localVarQueryParameters,group_by);
    }

    // query parameters
    char *keyQuery_limit = NULL;
    char * valueQuery_limit = NULL;
    keyValuePair_t *keyPairQuery_limit = 0;
    if (limit)
    {
        keyQuery_limit = strdup("limit");
        valueQuery_limit = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_limit, MAX_NUMBER_LENGTH, "%d", *limit);
        keyPairQuery_limit = keyValuePair_create(keyQuery_limit, valueQuery_limit);
        list_addElement(localVarQueryParameters,keyPairQuery_limit);
    }

    // query parameters
    char *keyQuery_page = NULL;
    char * valueQuery_page = NULL;
    keyValuePair_t *keyPairQuery_page = 0;
    if (page)
    {
        keyQuery_page = strdup("page");
        valueQuery_page = strdup((page));
        keyPairQuery_page = keyValuePair_create(keyQuery_page, valueQuery_page);
        list_addElement(localVarQueryParameters,keyPairQuery_page);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Usage data retrieved successfully.");
    //}
    //nonprimitive not container
    usage_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *UsageAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = usage_response_parseFromJSON(UsageAPIlocalVarJSON);
        cJSON_Delete(UsageAPIlocalVarJSON);
        if(elementToReturn == NULL) {
            // return 0;
        }
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_freeList(localVarQueryParameters);
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    if(keyQuery_start_time){
        free(keyQuery_start_time);
        keyQuery_start_time = NULL;
    }
    if(valueQuery_start_time){
        free(valueQuery_start_time);
        valueQuery_start_time = NULL;
    }
    if(keyPairQuery_start_time){
        keyValuePair_free(keyPairQuery_start_time);
        keyPairQuery_start_time = NULL;
    }
    if(keyQuery_end_time){
        free(keyQuery_end_time);
        keyQuery_end_time = NULL;
    }
    if(valueQuery_end_time){
        free(valueQuery_end_time);
        valueQuery_end_time = NULL;
    }
    if(keyPairQuery_end_time){
        keyValuePair_free(keyPairQuery_end_time);
        keyPairQuery_end_time = NULL;
    }
    if(keyQuery_bucket_width){
        free(keyQuery_bucket_width);
        keyQuery_bucket_width = NULL;
    }
    if(keyPairQuery_bucket_width){
        keyValuePair_free(keyPairQuery_bucket_width);
        keyPairQuery_bucket_width = NULL;
    }
    if(keyQuery_limit){
        free(keyQuery_limit);
        keyQuery_limit = NULL;
    }
    if(valueQuery_limit){
        free(valueQuery_limit);
        valueQuery_limit = NULL;
    }
    if(keyPairQuery_limit){
        keyValuePair_free(keyPairQuery_limit);
        keyPairQuery_limit = NULL;
    }
    if(keyQuery_page){
        free(keyQuery_page);
        keyQuery_page = NULL;
    }
    if(valueQuery_page){
        free(valueQuery_page);
        valueQuery_page = NULL;
    }
    if(keyPairQuery_page){
        keyValuePair_free(keyPairQuery_page);
        keyPairQuery_page = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Get images usage details for the organization.
//
usage_response_t*
UsageAPI_usageImages(apiClient_t *apiClient, int *start_time, int *end_time, openai_api_usageImages_bucket_width_e bucket_width, list_t *sources, list_t *sizes, list_t *project_ids, list_t *user_ids, list_t *api_key_ids, list_t *models, list_t *group_by, int *limit, char *page)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/organization/usage/images");





    // query parameters
    char *keyQuery_start_time = NULL;
    char * valueQuery_start_time = NULL;
    keyValuePair_t *keyPairQuery_start_time = 0;
    if (start_time)
    {
        keyQuery_start_time = strdup("start_time");
        valueQuery_start_time = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_start_time, MAX_NUMBER_LENGTH, "%d", *start_time);
        keyPairQuery_start_time = keyValuePair_create(keyQuery_start_time, valueQuery_start_time);
        list_addElement(localVarQueryParameters,keyPairQuery_start_time);
    }

    // query parameters
    char *keyQuery_end_time = NULL;
    char * valueQuery_end_time = NULL;
    keyValuePair_t *keyPairQuery_end_time = 0;
    if (end_time)
    {
        keyQuery_end_time = strdup("end_time");
        valueQuery_end_time = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_end_time, MAX_NUMBER_LENGTH, "%d", *end_time);
        keyPairQuery_end_time = keyValuePair_create(keyQuery_end_time, valueQuery_end_time);
        list_addElement(localVarQueryParameters,keyPairQuery_end_time);
    }

    // query parameters
    char *keyQuery_bucket_width = NULL;
    openai_api_usageImages_bucket_width_e valueQuery_bucket_width ;
    keyValuePair_t *keyPairQuery_bucket_width = 0;
    if (bucket_width)
    {
        keyQuery_bucket_width = strdup("bucket_width");
        valueQuery_bucket_width = (bucket_width);
        keyPairQuery_bucket_width = keyValuePair_create(keyQuery_bucket_width, strdup(usageImages_BUCKETWIDTH_ToString(
        valueQuery_bucket_width)));
        list_addElement(localVarQueryParameters,keyPairQuery_bucket_width);
    }

    // query parameters
    if (sources)
    {
        list_addElement(localVarQueryParameters,sources);
    }

    // query parameters
    if (sizes)
    {
        list_addElement(localVarQueryParameters,sizes);
    }

    // query parameters
    if (project_ids)
    {
        list_addElement(localVarQueryParameters,project_ids);
    }

    // query parameters
    if (user_ids)
    {
        list_addElement(localVarQueryParameters,user_ids);
    }

    // query parameters
    if (api_key_ids)
    {
        list_addElement(localVarQueryParameters,api_key_ids);
    }

    // query parameters
    if (models)
    {
        list_addElement(localVarQueryParameters,models);
    }

    // query parameters
    if (group_by)
    {
        list_addElement(localVarQueryParameters,group_by);
    }

    // query parameters
    char *keyQuery_limit = NULL;
    char * valueQuery_limit = NULL;
    keyValuePair_t *keyPairQuery_limit = 0;
    if (limit)
    {
        keyQuery_limit = strdup("limit");
        valueQuery_limit = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_limit, MAX_NUMBER_LENGTH, "%d", *limit);
        keyPairQuery_limit = keyValuePair_create(keyQuery_limit, valueQuery_limit);
        list_addElement(localVarQueryParameters,keyPairQuery_limit);
    }

    // query parameters
    char *keyQuery_page = NULL;
    char * valueQuery_page = NULL;
    keyValuePair_t *keyPairQuery_page = 0;
    if (page)
    {
        keyQuery_page = strdup("page");
        valueQuery_page = strdup((page));
        keyPairQuery_page = keyValuePair_create(keyQuery_page, valueQuery_page);
        list_addElement(localVarQueryParameters,keyPairQuery_page);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Usage data retrieved successfully.");
    //}
    //nonprimitive not container
    usage_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *UsageAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = usage_response_parseFromJSON(UsageAPIlocalVarJSON);
        cJSON_Delete(UsageAPIlocalVarJSON);
        if(elementToReturn == NULL) {
            // return 0;
        }
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_freeList(localVarQueryParameters);
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    if(keyQuery_start_time){
        free(keyQuery_start_time);
        keyQuery_start_time = NULL;
    }
    if(valueQuery_start_time){
        free(valueQuery_start_time);
        valueQuery_start_time = NULL;
    }
    if(keyPairQuery_start_time){
        keyValuePair_free(keyPairQuery_start_time);
        keyPairQuery_start_time = NULL;
    }
    if(keyQuery_end_time){
        free(keyQuery_end_time);
        keyQuery_end_time = NULL;
    }
    if(valueQuery_end_time){
        free(valueQuery_end_time);
        valueQuery_end_time = NULL;
    }
    if(keyPairQuery_end_time){
        keyValuePair_free(keyPairQuery_end_time);
        keyPairQuery_end_time = NULL;
    }
    if(keyQuery_bucket_width){
        free(keyQuery_bucket_width);
        keyQuery_bucket_width = NULL;
    }
    if(keyPairQuery_bucket_width){
        keyValuePair_free(keyPairQuery_bucket_width);
        keyPairQuery_bucket_width = NULL;
    }
    if(keyQuery_limit){
        free(keyQuery_limit);
        keyQuery_limit = NULL;
    }
    if(valueQuery_limit){
        free(valueQuery_limit);
        valueQuery_limit = NULL;
    }
    if(keyPairQuery_limit){
        keyValuePair_free(keyPairQuery_limit);
        keyPairQuery_limit = NULL;
    }
    if(keyQuery_page){
        free(keyQuery_page);
        keyQuery_page = NULL;
    }
    if(valueQuery_page){
        free(valueQuery_page);
        valueQuery_page = NULL;
    }
    if(keyPairQuery_page){
        keyValuePair_free(keyPairQuery_page);
        keyPairQuery_page = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Get moderations usage details for the organization.
//
usage_response_t*
UsageAPI_usageModerations(apiClient_t *apiClient, int *start_time, int *end_time, openai_api_usageModerations_bucket_width_e bucket_width, list_t *project_ids, list_t *user_ids, list_t *api_key_ids, list_t *models, list_t *group_by, int *limit, char *page)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/organization/usage/moderations");





    // query parameters
    char *keyQuery_start_time = NULL;
    char * valueQuery_start_time = NULL;
    keyValuePair_t *keyPairQuery_start_time = 0;
    if (start_time)
    {
        keyQuery_start_time = strdup("start_time");
        valueQuery_start_time = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_start_time, MAX_NUMBER_LENGTH, "%d", *start_time);
        keyPairQuery_start_time = keyValuePair_create(keyQuery_start_time, valueQuery_start_time);
        list_addElement(localVarQueryParameters,keyPairQuery_start_time);
    }

    // query parameters
    char *keyQuery_end_time = NULL;
    char * valueQuery_end_time = NULL;
    keyValuePair_t *keyPairQuery_end_time = 0;
    if (end_time)
    {
        keyQuery_end_time = strdup("end_time");
        valueQuery_end_time = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_end_time, MAX_NUMBER_LENGTH, "%d", *end_time);
        keyPairQuery_end_time = keyValuePair_create(keyQuery_end_time, valueQuery_end_time);
        list_addElement(localVarQueryParameters,keyPairQuery_end_time);
    }

    // query parameters
    char *keyQuery_bucket_width = NULL;
    openai_api_usageModerations_bucket_width_e valueQuery_bucket_width ;
    keyValuePair_t *keyPairQuery_bucket_width = 0;
    if (bucket_width)
    {
        keyQuery_bucket_width = strdup("bucket_width");
        valueQuery_bucket_width = (bucket_width);
        keyPairQuery_bucket_width = keyValuePair_create(keyQuery_bucket_width, strdup(usageModerations_BUCKETWIDTH_ToString(
        valueQuery_bucket_width)));
        list_addElement(localVarQueryParameters,keyPairQuery_bucket_width);
    }

    // query parameters
    if (project_ids)
    {
        list_addElement(localVarQueryParameters,project_ids);
    }

    // query parameters
    if (user_ids)
    {
        list_addElement(localVarQueryParameters,user_ids);
    }

    // query parameters
    if (api_key_ids)
    {
        list_addElement(localVarQueryParameters,api_key_ids);
    }

    // query parameters
    if (models)
    {
        list_addElement(localVarQueryParameters,models);
    }

    // query parameters
    if (group_by)
    {
        list_addElement(localVarQueryParameters,group_by);
    }

    // query parameters
    char *keyQuery_limit = NULL;
    char * valueQuery_limit = NULL;
    keyValuePair_t *keyPairQuery_limit = 0;
    if (limit)
    {
        keyQuery_limit = strdup("limit");
        valueQuery_limit = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_limit, MAX_NUMBER_LENGTH, "%d", *limit);
        keyPairQuery_limit = keyValuePair_create(keyQuery_limit, valueQuery_limit);
        list_addElement(localVarQueryParameters,keyPairQuery_limit);
    }

    // query parameters
    char *keyQuery_page = NULL;
    char * valueQuery_page = NULL;
    keyValuePair_t *keyPairQuery_page = 0;
    if (page)
    {
        keyQuery_page = strdup("page");
        valueQuery_page = strdup((page));
        keyPairQuery_page = keyValuePair_create(keyQuery_page, valueQuery_page);
        list_addElement(localVarQueryParameters,keyPairQuery_page);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Usage data retrieved successfully.");
    //}
    //nonprimitive not container
    usage_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *UsageAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = usage_response_parseFromJSON(UsageAPIlocalVarJSON);
        cJSON_Delete(UsageAPIlocalVarJSON);
        if(elementToReturn == NULL) {
            // return 0;
        }
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_freeList(localVarQueryParameters);
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    if(keyQuery_start_time){
        free(keyQuery_start_time);
        keyQuery_start_time = NULL;
    }
    if(valueQuery_start_time){
        free(valueQuery_start_time);
        valueQuery_start_time = NULL;
    }
    if(keyPairQuery_start_time){
        keyValuePair_free(keyPairQuery_start_time);
        keyPairQuery_start_time = NULL;
    }
    if(keyQuery_end_time){
        free(keyQuery_end_time);
        keyQuery_end_time = NULL;
    }
    if(valueQuery_end_time){
        free(valueQuery_end_time);
        valueQuery_end_time = NULL;
    }
    if(keyPairQuery_end_time){
        keyValuePair_free(keyPairQuery_end_time);
        keyPairQuery_end_time = NULL;
    }
    if(keyQuery_bucket_width){
        free(keyQuery_bucket_width);
        keyQuery_bucket_width = NULL;
    }
    if(keyPairQuery_bucket_width){
        keyValuePair_free(keyPairQuery_bucket_width);
        keyPairQuery_bucket_width = NULL;
    }
    if(keyQuery_limit){
        free(keyQuery_limit);
        keyQuery_limit = NULL;
    }
    if(valueQuery_limit){
        free(valueQuery_limit);
        valueQuery_limit = NULL;
    }
    if(keyPairQuery_limit){
        keyValuePair_free(keyPairQuery_limit);
        keyPairQuery_limit = NULL;
    }
    if(keyQuery_page){
        free(keyQuery_page);
        keyQuery_page = NULL;
    }
    if(valueQuery_page){
        free(valueQuery_page);
        valueQuery_page = NULL;
    }
    if(keyPairQuery_page){
        keyValuePair_free(keyPairQuery_page);
        keyPairQuery_page = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Get vector stores usage details for the organization.
//
usage_response_t*
UsageAPI_usageVectorStores(apiClient_t *apiClient, int *start_time, int *end_time, openai_api_usageVectorStores_bucket_width_e bucket_width, list_t *project_ids, list_t *group_by, int *limit, char *page)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/organization/usage/vector_stores");





    // query parameters
    char *keyQuery_start_time = NULL;
    char * valueQuery_start_time = NULL;
    keyValuePair_t *keyPairQuery_start_time = 0;
    if (start_time)
    {
        keyQuery_start_time = strdup("start_time");
        valueQuery_start_time = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_start_time, MAX_NUMBER_LENGTH, "%d", *start_time);
        keyPairQuery_start_time = keyValuePair_create(keyQuery_start_time, valueQuery_start_time);
        list_addElement(localVarQueryParameters,keyPairQuery_start_time);
    }

    // query parameters
    char *keyQuery_end_time = NULL;
    char * valueQuery_end_time = NULL;
    keyValuePair_t *keyPairQuery_end_time = 0;
    if (end_time)
    {
        keyQuery_end_time = strdup("end_time");
        valueQuery_end_time = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_end_time, MAX_NUMBER_LENGTH, "%d", *end_time);
        keyPairQuery_end_time = keyValuePair_create(keyQuery_end_time, valueQuery_end_time);
        list_addElement(localVarQueryParameters,keyPairQuery_end_time);
    }

    // query parameters
    char *keyQuery_bucket_width = NULL;
    openai_api_usageVectorStores_bucket_width_e valueQuery_bucket_width ;
    keyValuePair_t *keyPairQuery_bucket_width = 0;
    if (bucket_width)
    {
        keyQuery_bucket_width = strdup("bucket_width");
        valueQuery_bucket_width = (bucket_width);
        keyPairQuery_bucket_width = keyValuePair_create(keyQuery_bucket_width, strdup(usageVectorStores_BUCKETWIDTH_ToString(
        valueQuery_bucket_width)));
        list_addElement(localVarQueryParameters,keyPairQuery_bucket_width);
    }

    // query parameters
    if (project_ids)
    {
        list_addElement(localVarQueryParameters,project_ids);
    }

    // query parameters
    if (group_by)
    {
        list_addElement(localVarQueryParameters,group_by);
    }

    // query parameters
    char *keyQuery_limit = NULL;
    char * valueQuery_limit = NULL;
    keyValuePair_t *keyPairQuery_limit = 0;
    if (limit)
    {
        keyQuery_limit = strdup("limit");
        valueQuery_limit = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_limit, MAX_NUMBER_LENGTH, "%d", *limit);
        keyPairQuery_limit = keyValuePair_create(keyQuery_limit, valueQuery_limit);
        list_addElement(localVarQueryParameters,keyPairQuery_limit);
    }

    // query parameters
    char *keyQuery_page = NULL;
    char * valueQuery_page = NULL;
    keyValuePair_t *keyPairQuery_page = 0;
    if (page)
    {
        keyQuery_page = strdup("page");
        valueQuery_page = strdup((page));
        keyPairQuery_page = keyValuePair_create(keyQuery_page, valueQuery_page);
        list_addElement(localVarQueryParameters,keyPairQuery_page);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","Usage data retrieved successfully.");
    //}
    //nonprimitive not container
    usage_response_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *UsageAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = usage_response_parseFromJSON(UsageAPIlocalVarJSON);
        cJSON_Delete(UsageAPIlocalVarJSON);
        if(elementToReturn == NULL) {
            // return 0;
        }
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_freeList(localVarQueryParameters);
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    if(keyQuery_start_time){
        free(keyQuery_start_time);
        keyQuery_start_time = NULL;
    }
    if(valueQuery_start_time){
        free(valueQuery_start_time);
        valueQuery_start_time = NULL;
    }
    if(keyPairQuery_start_time){
        keyValuePair_free(keyPairQuery_start_time);
        keyPairQuery_start_time = NULL;
    }
    if(keyQuery_end_time){
        free(keyQuery_end_time);
        keyQuery_end_time = NULL;
    }
    if(valueQuery_end_time){
        free(valueQuery_end_time);
        valueQuery_end_time = NULL;
    }
    if(keyPairQuery_end_time){
        keyValuePair_free(keyPairQuery_end_time);
        keyPairQuery_end_time = NULL;
    }
    if(keyQuery_bucket_width){
        free(keyQuery_bucket_width);
        keyQuery_bucket_width = NULL;
    }
    if(keyPairQuery_bucket_width){
        keyValuePair_free(keyPairQuery_bucket_width);
        keyPairQuery_bucket_width = NULL;
    }
    if(keyQuery_limit){
        free(keyQuery_limit);
        keyQuery_limit = NULL;
    }
    if(valueQuery_limit){
        free(valueQuery_limit);
        valueQuery_limit = NULL;
    }
    if(keyPairQuery_limit){
        keyValuePair_free(keyPairQuery_limit);
        keyPairQuery_limit = NULL;
    }
    if(keyQuery_page){
        free(keyQuery_page);
        keyQuery_page = NULL;
    }
    if(valueQuery_page){
        free(valueQuery_page);
        valueQuery_page = NULL;
    }
    if(keyPairQuery_page){
        keyValuePair_free(keyPairQuery_page);
        keyPairQuery_page = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

