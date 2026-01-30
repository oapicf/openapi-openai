#ifndef realtime_server_event_response_audio_done_TEST
#define realtime_server_event_response_audio_done_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define realtime_server_event_response_audio_done_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/realtime_server_event_response_audio_done.h"
realtime_server_event_response_audio_done_t* instantiate_realtime_server_event_response_audio_done(int include_optional);



realtime_server_event_response_audio_done_t* instantiate_realtime_server_event_response_audio_done(int include_optional) {
  realtime_server_event_response_audio_done_t* realtime_server_event_response_audio_done = NULL;
  if (include_optional) {
    realtime_server_event_response_audio_done = realtime_server_event_response_audio_done_create(
      "0",
      openai_api_realtime_server_event_response_audio_done_TYPE_response.audio.done,
      "0",
      "0",
      56,
      56
    );
  } else {
    realtime_server_event_response_audio_done = realtime_server_event_response_audio_done_create(
      "0",
      openai_api_realtime_server_event_response_audio_done_TYPE_response.audio.done,
      "0",
      "0",
      56,
      56
    );
  }

  return realtime_server_event_response_audio_done;
}


#ifdef realtime_server_event_response_audio_done_MAIN

void test_realtime_server_event_response_audio_done(int include_optional) {
    realtime_server_event_response_audio_done_t* realtime_server_event_response_audio_done_1 = instantiate_realtime_server_event_response_audio_done(include_optional);

	cJSON* jsonrealtime_server_event_response_audio_done_1 = realtime_server_event_response_audio_done_convertToJSON(realtime_server_event_response_audio_done_1);
	printf("realtime_server_event_response_audio_done :\n%s\n", cJSON_Print(jsonrealtime_server_event_response_audio_done_1));
	realtime_server_event_response_audio_done_t* realtime_server_event_response_audio_done_2 = realtime_server_event_response_audio_done_parseFromJSON(jsonrealtime_server_event_response_audio_done_1);
	cJSON* jsonrealtime_server_event_response_audio_done_2 = realtime_server_event_response_audio_done_convertToJSON(realtime_server_event_response_audio_done_2);
	printf("repeating realtime_server_event_response_audio_done:\n%s\n", cJSON_Print(jsonrealtime_server_event_response_audio_done_2));
}

int main() {
  test_realtime_server_event_response_audio_done(1);
  test_realtime_server_event_response_audio_done(0);

  printf("Hello world \n");
  return 0;
}

#endif // realtime_server_event_response_audio_done_MAIN
#endif // realtime_server_event_response_audio_done_TEST
