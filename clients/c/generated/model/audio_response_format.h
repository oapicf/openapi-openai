/*
 * audio_response_format.h
 *
 * The format of the output, in one of these options: &#x60;json&#x60;, &#x60;text&#x60;, &#x60;srt&#x60;, &#x60;verbose_json&#x60;, or &#x60;vtt&#x60;. 
 */

#ifndef _audio_response_format_H_
#define _audio_response_format_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct audio_response_format_t audio_response_format_t;


// Enum  for audio_response_format

typedef enum { openai_api_audio_response_format__NULL = 0, openai_api_audio_response_format__json, openai_api_audio_response_format__text, openai_api_audio_response_format__srt, openai_api_audio_response_format__verbose_json, openai_api_audio_response_format__vtt } openai_api_audio_response_format__e;

char* audio_response_format_audio_response_format_ToString(openai_api_audio_response_format__e audio_response_format);

openai_api_audio_response_format__e audio_response_format_audio_response_format_FromString(char* audio_response_format);

cJSON *audio_response_format_convertToJSON(openai_api_audio_response_format__e audio_response_format);

openai_api_audio_response_format__e audio_response_format_parseFromJSON(cJSON *audio_response_formatJSON);

#endif /* _audio_response_format_H_ */

