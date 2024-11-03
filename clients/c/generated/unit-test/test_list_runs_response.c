#ifndef list_runs_response_TEST
#define list_runs_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define list_runs_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/list_runs_response.h"
list_runs_response_t* instantiate_list_runs_response(int include_optional);



list_runs_response_t* instantiate_list_runs_response(int include_optional) {
  list_runs_response_t* list_runs_response = NULL;
  if (include_optional) {
    list_runs_response = list_runs_response_create(
      "list",
      list_createList(),
      "run_abc123",
      "run_abc456",
      false
    );
  } else {
    list_runs_response = list_runs_response_create(
      "list",
      list_createList(),
      "run_abc123",
      "run_abc456",
      false
    );
  }

  return list_runs_response;
}


#ifdef list_runs_response_MAIN

void test_list_runs_response(int include_optional) {
    list_runs_response_t* list_runs_response_1 = instantiate_list_runs_response(include_optional);

	cJSON* jsonlist_runs_response_1 = list_runs_response_convertToJSON(list_runs_response_1);
	printf("list_runs_response :\n%s\n", cJSON_Print(jsonlist_runs_response_1));
	list_runs_response_t* list_runs_response_2 = list_runs_response_parseFromJSON(jsonlist_runs_response_1);
	cJSON* jsonlist_runs_response_2 = list_runs_response_convertToJSON(list_runs_response_2);
	printf("repeating list_runs_response:\n%s\n", cJSON_Print(jsonlist_runs_response_2));
}

int main() {
  test_list_runs_response(1);
  test_list_runs_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // list_runs_response_MAIN
#endif // list_runs_response_TEST
