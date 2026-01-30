#ifndef realtime_client_event_input_audio_buffer_commit_TEST
#define realtime_client_event_input_audio_buffer_commit_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define realtime_client_event_input_audio_buffer_commit_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/realtime_client_event_input_audio_buffer_commit.h"
realtime_client_event_input_audio_buffer_commit_t* instantiate_realtime_client_event_input_audio_buffer_commit(int include_optional);



realtime_client_event_input_audio_buffer_commit_t* instantiate_realtime_client_event_input_audio_buffer_commit(int include_optional) {
  realtime_client_event_input_audio_buffer_commit_t* realtime_client_event_input_audio_buffer_commit = NULL;
  if (include_optional) {
    realtime_client_event_input_audio_buffer_commit = realtime_client_event_input_audio_buffer_commit_create(
      "0",
      openai_api_realtime_client_event_input_audio_buffer_commit_TYPE_input_audio_buffer.commit
    );
  } else {
    realtime_client_event_input_audio_buffer_commit = realtime_client_event_input_audio_buffer_commit_create(
      "0",
      openai_api_realtime_client_event_input_audio_buffer_commit_TYPE_input_audio_buffer.commit
    );
  }

  return realtime_client_event_input_audio_buffer_commit;
}


#ifdef realtime_client_event_input_audio_buffer_commit_MAIN

void test_realtime_client_event_input_audio_buffer_commit(int include_optional) {
    realtime_client_event_input_audio_buffer_commit_t* realtime_client_event_input_audio_buffer_commit_1 = instantiate_realtime_client_event_input_audio_buffer_commit(include_optional);

	cJSON* jsonrealtime_client_event_input_audio_buffer_commit_1 = realtime_client_event_input_audio_buffer_commit_convertToJSON(realtime_client_event_input_audio_buffer_commit_1);
	printf("realtime_client_event_input_audio_buffer_commit :\n%s\n", cJSON_Print(jsonrealtime_client_event_input_audio_buffer_commit_1));
	realtime_client_event_input_audio_buffer_commit_t* realtime_client_event_input_audio_buffer_commit_2 = realtime_client_event_input_audio_buffer_commit_parseFromJSON(jsonrealtime_client_event_input_audio_buffer_commit_1);
	cJSON* jsonrealtime_client_event_input_audio_buffer_commit_2 = realtime_client_event_input_audio_buffer_commit_convertToJSON(realtime_client_event_input_audio_buffer_commit_2);
	printf("repeating realtime_client_event_input_audio_buffer_commit:\n%s\n", cJSON_Print(jsonrealtime_client_event_input_audio_buffer_commit_2));
}

int main() {
  test_realtime_client_event_input_audio_buffer_commit(1);
  test_realtime_client_event_input_audio_buffer_commit(0);

  printf("Hello world \n");
  return 0;
}

#endif // realtime_client_event_input_audio_buffer_commit_MAIN
#endif // realtime_client_event_input_audio_buffer_commit_TEST
