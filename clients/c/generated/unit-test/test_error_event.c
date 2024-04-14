#ifndef error_event_TEST
#define error_event_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define error_event_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/error_event.h"
error_event_t* instantiate_error_event(int include_optional);

#include "test_error.c"


error_event_t* instantiate_error_event(int include_optional) {
  error_event_t* error_event = NULL;
  if (include_optional) {
    error_event = error_event_create(
      openai_api_error_event_EVENT_error,
       // false, not to have infinite recursion
      instantiate_error(0)
    );
  } else {
    error_event = error_event_create(
      openai_api_error_event_EVENT_error,
      NULL
    );
  }

  return error_event;
}


#ifdef error_event_MAIN

void test_error_event(int include_optional) {
    error_event_t* error_event_1 = instantiate_error_event(include_optional);

	cJSON* jsonerror_event_1 = error_event_convertToJSON(error_event_1);
	printf("error_event :\n%s\n", cJSON_Print(jsonerror_event_1));
	error_event_t* error_event_2 = error_event_parseFromJSON(jsonerror_event_1);
	cJSON* jsonerror_event_2 = error_event_convertToJSON(error_event_2);
	printf("repeating error_event:\n%s\n", cJSON_Print(jsonerror_event_2));
}

int main() {
  test_error_event(1);
  test_error_event(0);

  printf("Hello world \n");
  return 0;
}

#endif // error_event_MAIN
#endif // error_event_TEST
