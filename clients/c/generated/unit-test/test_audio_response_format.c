#ifndef audio_response_format_TEST
#define audio_response_format_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define audio_response_format_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/audio_response_format.h"
audio_response_format_t* instantiate_audio_response_format(int include_optional);



audio_response_format_t* instantiate_audio_response_format(int include_optional) {
  audio_response_format_t* audio_response_format = NULL;
  if (include_optional) {
    audio_response_format = audio_response_format_create(
    );
  } else {
    audio_response_format = audio_response_format_create(
    );
  }

  return audio_response_format;
}


#ifdef audio_response_format_MAIN

void test_audio_response_format(int include_optional) {
    audio_response_format_t* audio_response_format_1 = instantiate_audio_response_format(include_optional);

	cJSON* jsonaudio_response_format_1 = audio_response_format_convertToJSON(audio_response_format_1);
	printf("audio_response_format :\n%s\n", cJSON_Print(jsonaudio_response_format_1));
	audio_response_format_t* audio_response_format_2 = audio_response_format_parseFromJSON(jsonaudio_response_format_1);
	cJSON* jsonaudio_response_format_2 = audio_response_format_convertToJSON(audio_response_format_2);
	printf("repeating audio_response_format:\n%s\n", cJSON_Print(jsonaudio_response_format_2));
}

int main() {
  test_audio_response_format(1);
  test_audio_response_format(0);

  printf("Hello world \n");
  return 0;
}

#endif // audio_response_format_MAIN
#endif // audio_response_format_TEST
