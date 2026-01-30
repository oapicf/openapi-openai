#ifndef realtime_session_input_audio_transcription_TEST
#define realtime_session_input_audio_transcription_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define realtime_session_input_audio_transcription_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/realtime_session_input_audio_transcription.h"
realtime_session_input_audio_transcription_t* instantiate_realtime_session_input_audio_transcription(int include_optional);



realtime_session_input_audio_transcription_t* instantiate_realtime_session_input_audio_transcription(int include_optional) {
  realtime_session_input_audio_transcription_t* realtime_session_input_audio_transcription = NULL;
  if (include_optional) {
    realtime_session_input_audio_transcription = realtime_session_input_audio_transcription_create(
      "0"
    );
  } else {
    realtime_session_input_audio_transcription = realtime_session_input_audio_transcription_create(
      "0"
    );
  }

  return realtime_session_input_audio_transcription;
}


#ifdef realtime_session_input_audio_transcription_MAIN

void test_realtime_session_input_audio_transcription(int include_optional) {
    realtime_session_input_audio_transcription_t* realtime_session_input_audio_transcription_1 = instantiate_realtime_session_input_audio_transcription(include_optional);

	cJSON* jsonrealtime_session_input_audio_transcription_1 = realtime_session_input_audio_transcription_convertToJSON(realtime_session_input_audio_transcription_1);
	printf("realtime_session_input_audio_transcription :\n%s\n", cJSON_Print(jsonrealtime_session_input_audio_transcription_1));
	realtime_session_input_audio_transcription_t* realtime_session_input_audio_transcription_2 = realtime_session_input_audio_transcription_parseFromJSON(jsonrealtime_session_input_audio_transcription_1);
	cJSON* jsonrealtime_session_input_audio_transcription_2 = realtime_session_input_audio_transcription_convertToJSON(realtime_session_input_audio_transcription_2);
	printf("repeating realtime_session_input_audio_transcription:\n%s\n", cJSON_Print(jsonrealtime_session_input_audio_transcription_2));
}

int main() {
  test_realtime_session_input_audio_transcription(1);
  test_realtime_session_input_audio_transcription(0);

  printf("Hello world \n");
  return 0;
}

#endif // realtime_session_input_audio_transcription_MAIN
#endif // realtime_session_input_audio_transcription_TEST
