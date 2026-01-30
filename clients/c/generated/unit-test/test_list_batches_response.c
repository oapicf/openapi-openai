#ifndef list_batches_response_TEST
#define list_batches_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define list_batches_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/list_batches_response.h"
list_batches_response_t* instantiate_list_batches_response(int include_optional);



list_batches_response_t* instantiate_list_batches_response(int include_optional) {
  list_batches_response_t* list_batches_response = NULL;
  if (include_optional) {
    list_batches_response = list_batches_response_create(
      list_createList(),
      "batch_abc123",
      "batch_abc456",
      1,
      openai_api_list_batches_response_OBJECT_list
    );
  } else {
    list_batches_response = list_batches_response_create(
      list_createList(),
      "batch_abc123",
      "batch_abc456",
      1,
      openai_api_list_batches_response_OBJECT_list
    );
  }

  return list_batches_response;
}


#ifdef list_batches_response_MAIN

void test_list_batches_response(int include_optional) {
    list_batches_response_t* list_batches_response_1 = instantiate_list_batches_response(include_optional);

	cJSON* jsonlist_batches_response_1 = list_batches_response_convertToJSON(list_batches_response_1);
	printf("list_batches_response :\n%s\n", cJSON_Print(jsonlist_batches_response_1));
	list_batches_response_t* list_batches_response_2 = list_batches_response_parseFromJSON(jsonlist_batches_response_1);
	cJSON* jsonlist_batches_response_2 = list_batches_response_convertToJSON(list_batches_response_2);
	printf("repeating list_batches_response:\n%s\n", cJSON_Print(jsonlist_batches_response_2));
}

int main() {
  test_list_batches_response(1);
  test_list_batches_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // list_batches_response_MAIN
#endif // list_batches_response_TEST
