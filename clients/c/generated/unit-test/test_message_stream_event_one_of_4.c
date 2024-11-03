#ifndef message_stream_event_one_of_4_TEST
#define message_stream_event_one_of_4_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define message_stream_event_one_of_4_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/message_stream_event_one_of_4.h"
message_stream_event_one_of_4_t* instantiate_message_stream_event_one_of_4(int include_optional);

#include "test_message_object.c"


message_stream_event_one_of_4_t* instantiate_message_stream_event_one_of_4(int include_optional) {
  message_stream_event_one_of_4_t* message_stream_event_one_of_4 = NULL;
  if (include_optional) {
    message_stream_event_one_of_4 = message_stream_event_one_of_4_create(
      openai_api_message_stream_event_one_of_4_EVENT_thread.message.incomplete,
       // false, not to have infinite recursion
      instantiate_message_object(0)
    );
  } else {
    message_stream_event_one_of_4 = message_stream_event_one_of_4_create(
      openai_api_message_stream_event_one_of_4_EVENT_thread.message.incomplete,
      NULL
    );
  }

  return message_stream_event_one_of_4;
}


#ifdef message_stream_event_one_of_4_MAIN

void test_message_stream_event_one_of_4(int include_optional) {
    message_stream_event_one_of_4_t* message_stream_event_one_of_4_1 = instantiate_message_stream_event_one_of_4(include_optional);

	cJSON* jsonmessage_stream_event_one_of_4_1 = message_stream_event_one_of_4_convertToJSON(message_stream_event_one_of_4_1);
	printf("message_stream_event_one_of_4 :\n%s\n", cJSON_Print(jsonmessage_stream_event_one_of_4_1));
	message_stream_event_one_of_4_t* message_stream_event_one_of_4_2 = message_stream_event_one_of_4_parseFromJSON(jsonmessage_stream_event_one_of_4_1);
	cJSON* jsonmessage_stream_event_one_of_4_2 = message_stream_event_one_of_4_convertToJSON(message_stream_event_one_of_4_2);
	printf("repeating message_stream_event_one_of_4:\n%s\n", cJSON_Print(jsonmessage_stream_event_one_of_4_2));
}

int main() {
  test_message_stream_event_one_of_4(1);
  test_message_stream_event_one_of_4(0);

  printf("Hello world \n");
  return 0;
}

#endif // message_stream_event_one_of_4_MAIN
#endif // message_stream_event_one_of_4_TEST
