#ifndef message_stream_event_one_of_1_TEST
#define message_stream_event_one_of_1_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define message_stream_event_one_of_1_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/message_stream_event_one_of_1.h"
message_stream_event_one_of_1_t* instantiate_message_stream_event_one_of_1(int include_optional);

#include "test_message_object.c"


message_stream_event_one_of_1_t* instantiate_message_stream_event_one_of_1(int include_optional) {
  message_stream_event_one_of_1_t* message_stream_event_one_of_1 = NULL;
  if (include_optional) {
    message_stream_event_one_of_1 = message_stream_event_one_of_1_create(
      openai_api_message_stream_event_one_of_1_EVENT_thread.message.in_progress,
       // false, not to have infinite recursion
      instantiate_message_object(0)
    );
  } else {
    message_stream_event_one_of_1 = message_stream_event_one_of_1_create(
      openai_api_message_stream_event_one_of_1_EVENT_thread.message.in_progress,
      NULL
    );
  }

  return message_stream_event_one_of_1;
}


#ifdef message_stream_event_one_of_1_MAIN

void test_message_stream_event_one_of_1(int include_optional) {
    message_stream_event_one_of_1_t* message_stream_event_one_of_1_1 = instantiate_message_stream_event_one_of_1(include_optional);

	cJSON* jsonmessage_stream_event_one_of_1_1 = message_stream_event_one_of_1_convertToJSON(message_stream_event_one_of_1_1);
	printf("message_stream_event_one_of_1 :\n%s\n", cJSON_Print(jsonmessage_stream_event_one_of_1_1));
	message_stream_event_one_of_1_t* message_stream_event_one_of_1_2 = message_stream_event_one_of_1_parseFromJSON(jsonmessage_stream_event_one_of_1_1);
	cJSON* jsonmessage_stream_event_one_of_1_2 = message_stream_event_one_of_1_convertToJSON(message_stream_event_one_of_1_2);
	printf("repeating message_stream_event_one_of_1:\n%s\n", cJSON_Print(jsonmessage_stream_event_one_of_1_2));
}

int main() {
  test_message_stream_event_one_of_1(1);
  test_message_stream_event_one_of_1(0);

  printf("Hello world \n");
  return 0;
}

#endif // message_stream_event_one_of_1_MAIN
#endif // message_stream_event_one_of_1_TEST
