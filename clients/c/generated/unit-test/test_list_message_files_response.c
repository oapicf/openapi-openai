#ifndef list_message_files_response_TEST
#define list_message_files_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define list_message_files_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/list_message_files_response.h"
list_message_files_response_t* instantiate_list_message_files_response(int include_optional);



list_message_files_response_t* instantiate_list_message_files_response(int include_optional) {
  list_message_files_response_t* list_message_files_response = NULL;
  if (include_optional) {
    list_message_files_response = list_message_files_response_create(
      "list",
      list_createList(),
      "file-abc123",
      "file-abc456",
      false
    );
  } else {
    list_message_files_response = list_message_files_response_create(
      "list",
      list_createList(),
      "file-abc123",
      "file-abc456",
      false
    );
  }

  return list_message_files_response;
}


#ifdef list_message_files_response_MAIN

void test_list_message_files_response(int include_optional) {
    list_message_files_response_t* list_message_files_response_1 = instantiate_list_message_files_response(include_optional);

	cJSON* jsonlist_message_files_response_1 = list_message_files_response_convertToJSON(list_message_files_response_1);
	printf("list_message_files_response :\n%s\n", cJSON_Print(jsonlist_message_files_response_1));
	list_message_files_response_t* list_message_files_response_2 = list_message_files_response_parseFromJSON(jsonlist_message_files_response_1);
	cJSON* jsonlist_message_files_response_2 = list_message_files_response_convertToJSON(list_message_files_response_2);
	printf("repeating list_message_files_response:\n%s\n", cJSON_Print(jsonlist_message_files_response_2));
}

int main() {
  test_list_message_files_response(1);
  test_list_message_files_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // list_message_files_response_MAIN
#endif // list_message_files_response_TEST
