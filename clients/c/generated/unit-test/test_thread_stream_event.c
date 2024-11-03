#ifndef thread_stream_event_TEST
#define thread_stream_event_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define thread_stream_event_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/thread_stream_event.h"
thread_stream_event_t* instantiate_thread_stream_event(int include_optional);

#include "test_thread_object.c"


thread_stream_event_t* instantiate_thread_stream_event(int include_optional) {
  thread_stream_event_t* thread_stream_event = NULL;
  if (include_optional) {
    thread_stream_event = thread_stream_event_create(
      openai_api_thread_stream_event_EVENT_thread.created,
       // false, not to have infinite recursion
      instantiate_thread_object(0)
    );
  } else {
    thread_stream_event = thread_stream_event_create(
      openai_api_thread_stream_event_EVENT_thread.created,
      NULL
    );
  }

  return thread_stream_event;
}


#ifdef thread_stream_event_MAIN

void test_thread_stream_event(int include_optional) {
    thread_stream_event_t* thread_stream_event_1 = instantiate_thread_stream_event(include_optional);

	cJSON* jsonthread_stream_event_1 = thread_stream_event_convertToJSON(thread_stream_event_1);
	printf("thread_stream_event :\n%s\n", cJSON_Print(jsonthread_stream_event_1));
	thread_stream_event_t* thread_stream_event_2 = thread_stream_event_parseFromJSON(jsonthread_stream_event_1);
	cJSON* jsonthread_stream_event_2 = thread_stream_event_convertToJSON(thread_stream_event_2);
	printf("repeating thread_stream_event:\n%s\n", cJSON_Print(jsonthread_stream_event_2));
}

int main() {
  test_thread_stream_event(1);
  test_thread_stream_event(0);

  printf("Hello world \n");
  return 0;
}

#endif // thread_stream_event_MAIN
#endif // thread_stream_event_TEST
