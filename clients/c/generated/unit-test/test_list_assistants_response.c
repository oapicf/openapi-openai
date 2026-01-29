#ifndef list_assistants_response_TEST
#define list_assistants_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define list_assistants_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/list_assistants_response.h"
list_assistants_response_t* instantiate_list_assistants_response(int include_optional);



list_assistants_response_t* instantiate_list_assistants_response(int include_optional) {
  list_assistants_response_t* list_assistants_response = NULL;
  if (include_optional) {
    list_assistants_response = list_assistants_response_create(
      "list",
      list_createList(),
      "asst_abc123",
      "asst_abc456",
      false
    );
  } else {
    list_assistants_response = list_assistants_response_create(
      "list",
      list_createList(),
      "asst_abc123",
      "asst_abc456",
      false
    );
  }

  return list_assistants_response;
}


#ifdef list_assistants_response_MAIN

void test_list_assistants_response(int include_optional) {
    list_assistants_response_t* list_assistants_response_1 = instantiate_list_assistants_response(include_optional);

	cJSON* jsonlist_assistants_response_1 = list_assistants_response_convertToJSON(list_assistants_response_1);
	printf("list_assistants_response :\n%s\n", cJSON_Print(jsonlist_assistants_response_1));
	list_assistants_response_t* list_assistants_response_2 = list_assistants_response_parseFromJSON(jsonlist_assistants_response_1);
	cJSON* jsonlist_assistants_response_2 = list_assistants_response_convertToJSON(list_assistants_response_2);
	printf("repeating list_assistants_response:\n%s\n", cJSON_Print(jsonlist_assistants_response_2));
}

int main() {
  test_list_assistants_response(1);
  test_list_assistants_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // list_assistants_response_MAIN
#endif // list_assistants_response_TEST
