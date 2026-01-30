#ifndef realtime_server_event_conversation_item_input_audio_transcription_failed_TEST
#define realtime_server_event_conversation_item_input_audio_transcription_failed_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define realtime_server_event_conversation_item_input_audio_transcription_failed_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/realtime_server_event_conversation_item_input_audio_transcription_failed.h"
realtime_server_event_conversation_item_input_audio_transcription_failed_t* instantiate_realtime_server_event_conversation_item_input_audio_transcription_failed(int include_optional);

#include "test_realtime_server_event_conversation_item_input_audio_transcription_failed_error.c"


realtime_server_event_conversation_item_input_audio_transcription_failed_t* instantiate_realtime_server_event_conversation_item_input_audio_transcription_failed(int include_optional) {
  realtime_server_event_conversation_item_input_audio_transcription_failed_t* realtime_server_event_conversation_item_input_audio_transcription_failed = NULL;
  if (include_optional) {
    realtime_server_event_conversation_item_input_audio_transcription_failed = realtime_server_event_conversation_item_input_audio_transcription_failed_create(
      "0",
      openai_api_realtime_server_event_conversation_item_input_audio_transcription_failed_TYPE_conversation.item.input_audio_transcription.failed,
      "0",
      56,
       // false, not to have infinite recursion
      instantiate_realtime_server_event_conversation_item_input_audio_transcription_failed_error(0)
    );
  } else {
    realtime_server_event_conversation_item_input_audio_transcription_failed = realtime_server_event_conversation_item_input_audio_transcription_failed_create(
      "0",
      openai_api_realtime_server_event_conversation_item_input_audio_transcription_failed_TYPE_conversation.item.input_audio_transcription.failed,
      "0",
      56,
      NULL
    );
  }

  return realtime_server_event_conversation_item_input_audio_transcription_failed;
}


#ifdef realtime_server_event_conversation_item_input_audio_transcription_failed_MAIN

void test_realtime_server_event_conversation_item_input_audio_transcription_failed(int include_optional) {
    realtime_server_event_conversation_item_input_audio_transcription_failed_t* realtime_server_event_conversation_item_input_audio_transcription_failed_1 = instantiate_realtime_server_event_conversation_item_input_audio_transcription_failed(include_optional);

	cJSON* jsonrealtime_server_event_conversation_item_input_audio_transcription_failed_1 = realtime_server_event_conversation_item_input_audio_transcription_failed_convertToJSON(realtime_server_event_conversation_item_input_audio_transcription_failed_1);
	printf("realtime_server_event_conversation_item_input_audio_transcription_failed :\n%s\n", cJSON_Print(jsonrealtime_server_event_conversation_item_input_audio_transcription_failed_1));
	realtime_server_event_conversation_item_input_audio_transcription_failed_t* realtime_server_event_conversation_item_input_audio_transcription_failed_2 = realtime_server_event_conversation_item_input_audio_transcription_failed_parseFromJSON(jsonrealtime_server_event_conversation_item_input_audio_transcription_failed_1);
	cJSON* jsonrealtime_server_event_conversation_item_input_audio_transcription_failed_2 = realtime_server_event_conversation_item_input_audio_transcription_failed_convertToJSON(realtime_server_event_conversation_item_input_audio_transcription_failed_2);
	printf("repeating realtime_server_event_conversation_item_input_audio_transcription_failed:\n%s\n", cJSON_Print(jsonrealtime_server_event_conversation_item_input_audio_transcription_failed_2));
}

int main() {
  test_realtime_server_event_conversation_item_input_audio_transcription_failed(1);
  test_realtime_server_event_conversation_item_input_audio_transcription_failed(0);

  printf("Hello world \n");
  return 0;
}

#endif // realtime_server_event_conversation_item_input_audio_transcription_failed_MAIN
#endif // realtime_server_event_conversation_item_input_audio_transcription_failed_TEST
