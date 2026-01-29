/*
 * transcription_word.h
 *
 * 
 */

#ifndef _transcription_word_H_
#define _transcription_word_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct transcription_word_t transcription_word_t;




typedef struct transcription_word_t {
    char *word; // string
    float start; //numeric
    float end; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} transcription_word_t;

__attribute__((deprecated)) transcription_word_t *transcription_word_create(
    char *word,
    float start,
    float end
);

void transcription_word_free(transcription_word_t *transcription_word);

transcription_word_t *transcription_word_parseFromJSON(cJSON *transcription_wordJSON);

cJSON *transcription_word_convertToJSON(transcription_word_t *transcription_word);

#endif /* _transcription_word_H_ */

