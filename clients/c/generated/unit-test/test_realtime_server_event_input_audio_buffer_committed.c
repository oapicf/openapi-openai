#ifndef realtime_server_event_input_audio_buffer_committed_TEST
#define realtime_server_event_input_audio_buffer_committed_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define realtime_server_event_input_audio_buffer_committed_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/realtime_server_event_input_audio_buffer_committed.h"
realtime_server_event_input_audio_buffer_committed_t* instantiate_realtime_server_event_input_audio_buffer_committed(int include_optional);



realtime_server_event_input_audio_buffer_committed_t* instantiate_realtime_server_event_input_audio_buffer_committed(int include_optional) {
  realtime_server_event_input_audio_buffer_committed_t* realtime_server_event_input_audio_buffer_committed = NULL;
  if (include_optional) {
    realtime_server_event_input_audio_buffer_committed = realtime_server_event_input_audio_buffer_committed_create(
      "0",
      openai_api_realtime_server_event_input_audio_buffer_committed_TYPE_input_audio_buffer.committed,
      "0",
      "0"
    );
  } else {
    realtime_server_event_input_audio_buffer_committed = realtime_server_event_input_audio_buffer_committed_create(
      "0",
      openai_api_realtime_server_event_input_audio_buffer_committed_TYPE_input_audio_buffer.committed,
      "0",
      "0"
    );
  }

  return realtime_server_event_input_audio_buffer_committed;
}


#ifdef realtime_server_event_input_audio_buffer_committed_MAIN

void test_realtime_server_event_input_audio_buffer_committed(int include_optional) {
    realtime_server_event_input_audio_buffer_committed_t* realtime_server_event_input_audio_buffer_committed_1 = instantiate_realtime_server_event_input_audio_buffer_committed(include_optional);

	cJSON* jsonrealtime_server_event_input_audio_buffer_committed_1 = realtime_server_event_input_audio_buffer_committed_convertToJSON(realtime_server_event_input_audio_buffer_committed_1);
	printf("realtime_server_event_input_audio_buffer_committed :\n%s\n", cJSON_Print(jsonrealtime_server_event_input_audio_buffer_committed_1));
	realtime_server_event_input_audio_buffer_committed_t* realtime_server_event_input_audio_buffer_committed_2 = realtime_server_event_input_audio_buffer_committed_parseFromJSON(jsonrealtime_server_event_input_audio_buffer_committed_1);
	cJSON* jsonrealtime_server_event_input_audio_buffer_committed_2 = realtime_server_event_input_audio_buffer_committed_convertToJSON(realtime_server_event_input_audio_buffer_committed_2);
	printf("repeating realtime_server_event_input_audio_buffer_committed:\n%s\n", cJSON_Print(jsonrealtime_server_event_input_audio_buffer_committed_2));
}

int main() {
  test_realtime_server_event_input_audio_buffer_committed(1);
  test_realtime_server_event_input_audio_buffer_committed(0);

  printf("Hello world \n");
  return 0;
}

#endif // realtime_server_event_input_audio_buffer_committed_MAIN
#endif // realtime_server_event_input_audio_buffer_committed_TEST
