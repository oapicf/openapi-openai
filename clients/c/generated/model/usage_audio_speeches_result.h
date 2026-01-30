/*
 * usage_audio_speeches_result.h
 *
 * The aggregated audio speeches usage details of the specific time bucket.
 */

#ifndef _usage_audio_speeches_result_H_
#define _usage_audio_speeches_result_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct usage_audio_speeches_result_t usage_audio_speeches_result_t;


// Enum OBJECT for usage_audio_speeches_result

typedef enum  { openai_api_usage_audio_speeches_result_OBJECT_NULL = 0, openai_api_usage_audio_speeches_result_OBJECT_organization.usage.audio_speeches.result } openai_api_usage_audio_speeches_result_OBJECT_e;

char* usage_audio_speeches_result_object_ToString(openai_api_usage_audio_speeches_result_OBJECT_e object);

openai_api_usage_audio_speeches_result_OBJECT_e usage_audio_speeches_result_object_FromString(char* object);



typedef struct usage_audio_speeches_result_t {
    openai_api_usage_audio_speeches_result_OBJECT_e object; //enum
    int characters; //numeric
    int num_model_requests; //numeric
    char *project_id; // string
    char *user_id; // string
    char *api_key_id; // string
    char *model; // string

    int _library_owned; // Is the library responsible for freeing this object?
} usage_audio_speeches_result_t;

__attribute__((deprecated)) usage_audio_speeches_result_t *usage_audio_speeches_result_create(
    openai_api_usage_audio_speeches_result_OBJECT_e object,
    int characters,
    int num_model_requests,
    char *project_id,
    char *user_id,
    char *api_key_id,
    char *model
);

void usage_audio_speeches_result_free(usage_audio_speeches_result_t *usage_audio_speeches_result);

usage_audio_speeches_result_t *usage_audio_speeches_result_parseFromJSON(cJSON *usage_audio_speeches_resultJSON);

cJSON *usage_audio_speeches_result_convertToJSON(usage_audio_speeches_result_t *usage_audio_speeches_result);

#endif /* _usage_audio_speeches_result_H_ */

