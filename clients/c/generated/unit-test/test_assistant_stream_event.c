#ifndef assistant_stream_event_TEST
#define assistant_stream_event_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define assistant_stream_event_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/assistant_stream_event.h"
assistant_stream_event_t* instantiate_assistant_stream_event(int include_optional);



assistant_stream_event_t* instantiate_assistant_stream_event(int include_optional) {
  assistant_stream_event_t* assistant_stream_event = NULL;
  if (include_optional) {
    assistant_stream_event = assistant_stream_event_create(
      openai_api_assistant_stream_event_EVENT_done,
      openai_api_assistant_stream_event_DATA_[DONE]
    );
  } else {
    assistant_stream_event = assistant_stream_event_create(
      openai_api_assistant_stream_event_EVENT_done,
      openai_api_assistant_stream_event_DATA_[DONE]
    );
  }

  return assistant_stream_event;
}


#ifdef assistant_stream_event_MAIN

void test_assistant_stream_event(int include_optional) {
    assistant_stream_event_t* assistant_stream_event_1 = instantiate_assistant_stream_event(include_optional);

	cJSON* jsonassistant_stream_event_1 = assistant_stream_event_convertToJSON(assistant_stream_event_1);
	printf("assistant_stream_event :\n%s\n", cJSON_Print(jsonassistant_stream_event_1));
	assistant_stream_event_t* assistant_stream_event_2 = assistant_stream_event_parseFromJSON(jsonassistant_stream_event_1);
	cJSON* jsonassistant_stream_event_2 = assistant_stream_event_convertToJSON(assistant_stream_event_2);
	printf("repeating assistant_stream_event:\n%s\n", cJSON_Print(jsonassistant_stream_event_2));
}

int main() {
  test_assistant_stream_event(1);
  test_assistant_stream_event(0);

  printf("Hello world \n");
  return 0;
}

#endif // assistant_stream_event_MAIN
#endif // assistant_stream_event_TEST
