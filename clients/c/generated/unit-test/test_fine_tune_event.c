#ifndef fine_tune_event_TEST
#define fine_tune_event_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define fine_tune_event_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/fine_tune_event.h"
fine_tune_event_t* instantiate_fine_tune_event(int include_optional);



fine_tune_event_t* instantiate_fine_tune_event(int include_optional) {
  fine_tune_event_t* fine_tune_event = NULL;
  if (include_optional) {
    fine_tune_event = fine_tune_event_create(
      "0",
      56,
      "0",
      "0"
    );
  } else {
    fine_tune_event = fine_tune_event_create(
      "0",
      56,
      "0",
      "0"
    );
  }

  return fine_tune_event;
}


#ifdef fine_tune_event_MAIN

void test_fine_tune_event(int include_optional) {
    fine_tune_event_t* fine_tune_event_1 = instantiate_fine_tune_event(include_optional);

	cJSON* jsonfine_tune_event_1 = fine_tune_event_convertToJSON(fine_tune_event_1);
	printf("fine_tune_event :\n%s\n", cJSON_Print(jsonfine_tune_event_1));
	fine_tune_event_t* fine_tune_event_2 = fine_tune_event_parseFromJSON(jsonfine_tune_event_1);
	cJSON* jsonfine_tune_event_2 = fine_tune_event_convertToJSON(fine_tune_event_2);
	printf("repeating fine_tune_event:\n%s\n", cJSON_Print(jsonfine_tune_event_2));
}

int main() {
  test_fine_tune_event(1);
  test_fine_tune_event(0);

  printf("Hello world \n");
  return 0;
}

#endif // fine_tune_event_MAIN
#endif // fine_tune_event_TEST
