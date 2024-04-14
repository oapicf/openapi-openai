#ifndef message_stream_event_one_of_2_TEST
#define message_stream_event_one_of_2_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define message_stream_event_one_of_2_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/message_stream_event_one_of_2.h"
message_stream_event_one_of_2_t* instantiate_message_stream_event_one_of_2(int include_optional);

#include "test_message_delta_object.c"


message_stream_event_one_of_2_t* instantiate_message_stream_event_one_of_2(int include_optional) {
  message_stream_event_one_of_2_t* message_stream_event_one_of_2 = NULL;
  if (include_optional) {
    message_stream_event_one_of_2 = message_stream_event_one_of_2_create(
      openai_api_message_stream_event_one_of_2_EVENT_thread.message.delta,
       // false, not to have infinite recursion
      instantiate_message_delta_object(0)
    );
  } else {
    message_stream_event_one_of_2 = message_stream_event_one_of_2_create(
      openai_api_message_stream_event_one_of_2_EVENT_thread.message.delta,
      NULL
    );
  }

  return message_stream_event_one_of_2;
}


#ifdef message_stream_event_one_of_2_MAIN

void test_message_stream_event_one_of_2(int include_optional) {
    message_stream_event_one_of_2_t* message_stream_event_one_of_2_1 = instantiate_message_stream_event_one_of_2(include_optional);

	cJSON* jsonmessage_stream_event_one_of_2_1 = message_stream_event_one_of_2_convertToJSON(message_stream_event_one_of_2_1);
	printf("message_stream_event_one_of_2 :\n%s\n", cJSON_Print(jsonmessage_stream_event_one_of_2_1));
	message_stream_event_one_of_2_t* message_stream_event_one_of_2_2 = message_stream_event_one_of_2_parseFromJSON(jsonmessage_stream_event_one_of_2_1);
	cJSON* jsonmessage_stream_event_one_of_2_2 = message_stream_event_one_of_2_convertToJSON(message_stream_event_one_of_2_2);
	printf("repeating message_stream_event_one_of_2:\n%s\n", cJSON_Print(jsonmessage_stream_event_one_of_2_2));
}

int main() {
  test_message_stream_event_one_of_2(1);
  test_message_stream_event_one_of_2(0);

  printf("Hello world \n");
  return 0;
}

#endif // message_stream_event_one_of_2_MAIN
#endif // message_stream_event_one_of_2_TEST
