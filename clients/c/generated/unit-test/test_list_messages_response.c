#ifndef list_messages_response_TEST
#define list_messages_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define list_messages_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/list_messages_response.h"
list_messages_response_t* instantiate_list_messages_response(int include_optional);



list_messages_response_t* instantiate_list_messages_response(int include_optional) {
  list_messages_response_t* list_messages_response = NULL;
  if (include_optional) {
    list_messages_response = list_messages_response_create(
      "list",
      list_createList(),
      "msg_abc123",
      "msg_abc123",
      false
    );
  } else {
    list_messages_response = list_messages_response_create(
      "list",
      list_createList(),
      "msg_abc123",
      "msg_abc123",
      false
    );
  }

  return list_messages_response;
}


#ifdef list_messages_response_MAIN

void test_list_messages_response(int include_optional) {
    list_messages_response_t* list_messages_response_1 = instantiate_list_messages_response(include_optional);

	cJSON* jsonlist_messages_response_1 = list_messages_response_convertToJSON(list_messages_response_1);
	printf("list_messages_response :\n%s\n", cJSON_Print(jsonlist_messages_response_1));
	list_messages_response_t* list_messages_response_2 = list_messages_response_parseFromJSON(jsonlist_messages_response_1);
	cJSON* jsonlist_messages_response_2 = list_messages_response_convertToJSON(list_messages_response_2);
	printf("repeating list_messages_response:\n%s\n", cJSON_Print(jsonlist_messages_response_2));
}

int main() {
  test_list_messages_response(1);
  test_list_messages_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // list_messages_response_MAIN
#endif // list_messages_response_TEST
