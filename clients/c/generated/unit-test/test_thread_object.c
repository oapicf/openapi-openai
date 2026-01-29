#ifndef thread_object_TEST
#define thread_object_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define thread_object_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/thread_object.h"
thread_object_t* instantiate_thread_object(int include_optional);



thread_object_t* instantiate_thread_object(int include_optional) {
  thread_object_t* thread_object = NULL;
  if (include_optional) {
    thread_object = thread_object_create(
      "0",
      openai_api_thread_object_OBJECT_thread,
      56,
      0
    );
  } else {
    thread_object = thread_object_create(
      "0",
      openai_api_thread_object_OBJECT_thread,
      56,
      0
    );
  }

  return thread_object;
}


#ifdef thread_object_MAIN

void test_thread_object(int include_optional) {
    thread_object_t* thread_object_1 = instantiate_thread_object(include_optional);

	cJSON* jsonthread_object_1 = thread_object_convertToJSON(thread_object_1);
	printf("thread_object :\n%s\n", cJSON_Print(jsonthread_object_1));
	thread_object_t* thread_object_2 = thread_object_parseFromJSON(jsonthread_object_1);
	cJSON* jsonthread_object_2 = thread_object_convertToJSON(thread_object_2);
	printf("repeating thread_object:\n%s\n", cJSON_Print(jsonthread_object_2));
}

int main() {
  test_thread_object(1);
  test_thread_object(0);

  printf("Hello world \n");
  return 0;
}

#endif // thread_object_MAIN
#endif // thread_object_TEST
