#ifndef create_assistant_request_TEST
#define create_assistant_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define create_assistant_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/create_assistant_request.h"
create_assistant_request_t* instantiate_create_assistant_request(int include_optional);

#include "test_create_assistant_request_model.c"


create_assistant_request_t* instantiate_create_assistant_request(int include_optional) {
  create_assistant_request_t* create_assistant_request = NULL;
  if (include_optional) {
    create_assistant_request = create_assistant_request_create(
      gpt-4-turbo,
      "0",
      "0",
      "0",
      list_createList(),
      list_createList(),
      0
    );
  } else {
    create_assistant_request = create_assistant_request_create(
      gpt-4-turbo,
      "0",
      "0",
      "0",
      list_createList(),
      list_createList(),
      0
    );
  }

  return create_assistant_request;
}


#ifdef create_assistant_request_MAIN

void test_create_assistant_request(int include_optional) {
    create_assistant_request_t* create_assistant_request_1 = instantiate_create_assistant_request(include_optional);

	cJSON* jsoncreate_assistant_request_1 = create_assistant_request_convertToJSON(create_assistant_request_1);
	printf("create_assistant_request :\n%s\n", cJSON_Print(jsoncreate_assistant_request_1));
	create_assistant_request_t* create_assistant_request_2 = create_assistant_request_parseFromJSON(jsoncreate_assistant_request_1);
	cJSON* jsoncreate_assistant_request_2 = create_assistant_request_convertToJSON(create_assistant_request_2);
	printf("repeating create_assistant_request:\n%s\n", cJSON_Print(jsoncreate_assistant_request_2));
}

int main() {
  test_create_assistant_request(1);
  test_create_assistant_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // create_assistant_request_MAIN
#endif // create_assistant_request_TEST
