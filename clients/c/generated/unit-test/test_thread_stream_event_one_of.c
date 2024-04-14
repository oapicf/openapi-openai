#ifndef thread_stream_event_one_of_TEST
#define thread_stream_event_one_of_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define thread_stream_event_one_of_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/thread_stream_event_one_of.h"
thread_stream_event_one_of_t* instantiate_thread_stream_event_one_of(int include_optional);

#include "test_thread_object.c"


thread_stream_event_one_of_t* instantiate_thread_stream_event_one_of(int include_optional) {
  thread_stream_event_one_of_t* thread_stream_event_one_of = NULL;
  if (include_optional) {
    thread_stream_event_one_of = thread_stream_event_one_of_create(
      openai_api_thread_stream_event_one_of_EVENT_thread.created,
       // false, not to have infinite recursion
      instantiate_thread_object(0)
    );
  } else {
    thread_stream_event_one_of = thread_stream_event_one_of_create(
      openai_api_thread_stream_event_one_of_EVENT_thread.created,
      NULL
    );
  }

  return thread_stream_event_one_of;
}


#ifdef thread_stream_event_one_of_MAIN

void test_thread_stream_event_one_of(int include_optional) {
    thread_stream_event_one_of_t* thread_stream_event_one_of_1 = instantiate_thread_stream_event_one_of(include_optional);

	cJSON* jsonthread_stream_event_one_of_1 = thread_stream_event_one_of_convertToJSON(thread_stream_event_one_of_1);
	printf("thread_stream_event_one_of :\n%s\n", cJSON_Print(jsonthread_stream_event_one_of_1));
	thread_stream_event_one_of_t* thread_stream_event_one_of_2 = thread_stream_event_one_of_parseFromJSON(jsonthread_stream_event_one_of_1);
	cJSON* jsonthread_stream_event_one_of_2 = thread_stream_event_one_of_convertToJSON(thread_stream_event_one_of_2);
	printf("repeating thread_stream_event_one_of:\n%s\n", cJSON_Print(jsonthread_stream_event_one_of_2));
}

int main() {
  test_thread_stream_event_one_of(1);
  test_thread_stream_event_one_of(0);

  printf("Hello world \n");
  return 0;
}

#endif // thread_stream_event_one_of_MAIN
#endif // thread_stream_event_one_of_TEST
