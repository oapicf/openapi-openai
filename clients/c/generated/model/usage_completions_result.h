/*
 * usage_completions_result.h
 *
 * The aggregated completions usage details of the specific time bucket.
 */

#ifndef _usage_completions_result_H_
#define _usage_completions_result_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct usage_completions_result_t usage_completions_result_t;


// Enum OBJECT for usage_completions_result

typedef enum  { openai_api_usage_completions_result_OBJECT_NULL = 0, openai_api_usage_completions_result_OBJECT_organization.usage.completions.result } openai_api_usage_completions_result_OBJECT_e;

char* usage_completions_result_object_ToString(openai_api_usage_completions_result_OBJECT_e object);

openai_api_usage_completions_result_OBJECT_e usage_completions_result_object_FromString(char* object);



typedef struct usage_completions_result_t {
    openai_api_usage_completions_result_OBJECT_e object; //enum
    int input_tokens; //numeric
    int input_cached_tokens; //numeric
    int output_tokens; //numeric
    int input_audio_tokens; //numeric
    int output_audio_tokens; //numeric
    int num_model_requests; //numeric
    char *project_id; // string
    char *user_id; // string
    char *api_key_id; // string
    char *model; // string
    int batch; //boolean

    int _library_owned; // Is the library responsible for freeing this object?
} usage_completions_result_t;

__attribute__((deprecated)) usage_completions_result_t *usage_completions_result_create(
    openai_api_usage_completions_result_OBJECT_e object,
    int input_tokens,
    int input_cached_tokens,
    int output_tokens,
    int input_audio_tokens,
    int output_audio_tokens,
    int num_model_requests,
    char *project_id,
    char *user_id,
    char *api_key_id,
    char *model,
    int batch
);

void usage_completions_result_free(usage_completions_result_t *usage_completions_result);

usage_completions_result_t *usage_completions_result_parseFromJSON(cJSON *usage_completions_resultJSON);

cJSON *usage_completions_result_convertToJSON(usage_completions_result_t *usage_completions_result);

#endif /* _usage_completions_result_H_ */

