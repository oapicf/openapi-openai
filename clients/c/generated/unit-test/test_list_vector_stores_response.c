#ifndef list_vector_stores_response_TEST
#define list_vector_stores_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define list_vector_stores_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/list_vector_stores_response.h"
list_vector_stores_response_t* instantiate_list_vector_stores_response(int include_optional);



list_vector_stores_response_t* instantiate_list_vector_stores_response(int include_optional) {
  list_vector_stores_response_t* list_vector_stores_response = NULL;
  if (include_optional) {
    list_vector_stores_response = list_vector_stores_response_create(
      "list",
      list_createList(),
      "vs_abc123",
      "vs_abc456",
      false
    );
  } else {
    list_vector_stores_response = list_vector_stores_response_create(
      "list",
      list_createList(),
      "vs_abc123",
      "vs_abc456",
      false
    );
  }

  return list_vector_stores_response;
}


#ifdef list_vector_stores_response_MAIN

void test_list_vector_stores_response(int include_optional) {
    list_vector_stores_response_t* list_vector_stores_response_1 = instantiate_list_vector_stores_response(include_optional);

	cJSON* jsonlist_vector_stores_response_1 = list_vector_stores_response_convertToJSON(list_vector_stores_response_1);
	printf("list_vector_stores_response :\n%s\n", cJSON_Print(jsonlist_vector_stores_response_1));
	list_vector_stores_response_t* list_vector_stores_response_2 = list_vector_stores_response_parseFromJSON(jsonlist_vector_stores_response_1);
	cJSON* jsonlist_vector_stores_response_2 = list_vector_stores_response_convertToJSON(list_vector_stores_response_2);
	printf("repeating list_vector_stores_response:\n%s\n", cJSON_Print(jsonlist_vector_stores_response_2));
}

int main() {
  test_list_vector_stores_response(1);
  test_list_vector_stores_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // list_vector_stores_response_MAIN
#endif // list_vector_stores_response_TEST
