#ifndef list_fine_tune_events_response_TEST
#define list_fine_tune_events_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define list_fine_tune_events_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/list_fine_tune_events_response.h"
list_fine_tune_events_response_t* instantiate_list_fine_tune_events_response(int include_optional);



list_fine_tune_events_response_t* instantiate_list_fine_tune_events_response(int include_optional) {
  list_fine_tune_events_response_t* list_fine_tune_events_response = NULL;
  if (include_optional) {
    list_fine_tune_events_response = list_fine_tune_events_response_create(
      "0",
      list_createList()
    );
  } else {
    list_fine_tune_events_response = list_fine_tune_events_response_create(
      "0",
      list_createList()
    );
  }

  return list_fine_tune_events_response;
}


#ifdef list_fine_tune_events_response_MAIN

void test_list_fine_tune_events_response(int include_optional) {
    list_fine_tune_events_response_t* list_fine_tune_events_response_1 = instantiate_list_fine_tune_events_response(include_optional);

	cJSON* jsonlist_fine_tune_events_response_1 = list_fine_tune_events_response_convertToJSON(list_fine_tune_events_response_1);
	printf("list_fine_tune_events_response :\n%s\n", cJSON_Print(jsonlist_fine_tune_events_response_1));
	list_fine_tune_events_response_t* list_fine_tune_events_response_2 = list_fine_tune_events_response_parseFromJSON(jsonlist_fine_tune_events_response_1);
	cJSON* jsonlist_fine_tune_events_response_2 = list_fine_tune_events_response_convertToJSON(list_fine_tune_events_response_2);
	printf("repeating list_fine_tune_events_response:\n%s\n", cJSON_Print(jsonlist_fine_tune_events_response_2));
}

int main() {
  test_list_fine_tune_events_response(1);
  test_list_fine_tune_events_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // list_fine_tune_events_response_MAIN
#endif // list_fine_tune_events_response_TEST
