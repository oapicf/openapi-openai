/*
 * transcription_segment.h
 *
 * 
 */

#ifndef _transcription_segment_H_
#define _transcription_segment_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct transcription_segment_t transcription_segment_t;




typedef struct transcription_segment_t {
    int id; //numeric
    int seek; //numeric
    float start; //numeric
    float end; //numeric
    char *text; // string
    list_t *tokens; //primitive container
    float temperature; //numeric
    float avg_logprob; //numeric
    float compression_ratio; //numeric
    float no_speech_prob; //numeric

} transcription_segment_t;

transcription_segment_t *transcription_segment_create(
    int id,
    int seek,
    float start,
    float end,
    char *text,
    list_t *tokens,
    float temperature,
    float avg_logprob,
    float compression_ratio,
    float no_speech_prob
);

void transcription_segment_free(transcription_segment_t *transcription_segment);

transcription_segment_t *transcription_segment_parseFromJSON(cJSON *transcription_segmentJSON);

cJSON *transcription_segment_convertToJSON(transcription_segment_t *transcription_segment);

#endif /* _transcription_segment_H_ */

