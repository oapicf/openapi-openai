#ifndef list_run_steps_response_TEST
#define list_run_steps_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define list_run_steps_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/list_run_steps_response.h"
list_run_steps_response_t* instantiate_list_run_steps_response(int include_optional);



list_run_steps_response_t* instantiate_list_run_steps_response(int include_optional) {
  list_run_steps_response_t* list_run_steps_response = NULL;
  if (include_optional) {
    list_run_steps_response = list_run_steps_response_create(
      "list",
      list_createList(),
      "step_abc123",
      "step_abc456",
      false
    );
  } else {
    list_run_steps_response = list_run_steps_response_create(
      "list",
      list_createList(),
      "step_abc123",
      "step_abc456",
      false
    );
  }

  return list_run_steps_response;
}


#ifdef list_run_steps_response_MAIN

void test_list_run_steps_response(int include_optional) {
    list_run_steps_response_t* list_run_steps_response_1 = instantiate_list_run_steps_response(include_optional);

	cJSON* jsonlist_run_steps_response_1 = list_run_steps_response_convertToJSON(list_run_steps_response_1);
	printf("list_run_steps_response :\n%s\n", cJSON_Print(jsonlist_run_steps_response_1));
	list_run_steps_response_t* list_run_steps_response_2 = list_run_steps_response_parseFromJSON(jsonlist_run_steps_response_1);
	cJSON* jsonlist_run_steps_response_2 = list_run_steps_response_convertToJSON(list_run_steps_response_2);
	printf("repeating list_run_steps_response:\n%s\n", cJSON_Print(jsonlist_run_steps_response_2));
}

int main() {
  test_list_run_steps_response(1);
  test_list_run_steps_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // list_run_steps_response_MAIN
#endif // list_run_steps_response_TEST
