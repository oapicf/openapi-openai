#ifndef list_threads_response_TEST
#define list_threads_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define list_threads_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/list_threads_response.h"
list_threads_response_t* instantiate_list_threads_response(int include_optional);



list_threads_response_t* instantiate_list_threads_response(int include_optional) {
  list_threads_response_t* list_threads_response = NULL;
  if (include_optional) {
    list_threads_response = list_threads_response_create(
      "list",
      list_createList(),
      "asst_abc123",
      "asst_abc456",
      false
    );
  } else {
    list_threads_response = list_threads_response_create(
      "list",
      list_createList(),
      "asst_abc123",
      "asst_abc456",
      false
    );
  }

  return list_threads_response;
}


#ifdef list_threads_response_MAIN

void test_list_threads_response(int include_optional) {
    list_threads_response_t* list_threads_response_1 = instantiate_list_threads_response(include_optional);

	cJSON* jsonlist_threads_response_1 = list_threads_response_convertToJSON(list_threads_response_1);
	printf("list_threads_response :\n%s\n", cJSON_Print(jsonlist_threads_response_1));
	list_threads_response_t* list_threads_response_2 = list_threads_response_parseFromJSON(jsonlist_threads_response_1);
	cJSON* jsonlist_threads_response_2 = list_threads_response_convertToJSON(list_threads_response_2);
	printf("repeating list_threads_response:\n%s\n", cJSON_Print(jsonlist_threads_response_2));
}

int main() {
  test_list_threads_response(1);
  test_list_threads_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // list_threads_response_MAIN
#endif // list_threads_response_TEST
