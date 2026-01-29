#ifndef create_message_request_TEST
#define create_message_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define create_message_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/create_message_request.h"
create_message_request_t* instantiate_create_message_request(int include_optional);



create_message_request_t* instantiate_create_message_request(int include_optional) {
  create_message_request_t* create_message_request = NULL;
  if (include_optional) {
    create_message_request = create_message_request_create(
      openai_api_create_message_request_ROLE_user,
      "0",
      list_createList(),
      0
    );
  } else {
    create_message_request = create_message_request_create(
      openai_api_create_message_request_ROLE_user,
      "0",
      list_createList(),
      0
    );
  }

  return create_message_request;
}


#ifdef create_message_request_MAIN

void test_create_message_request(int include_optional) {
    create_message_request_t* create_message_request_1 = instantiate_create_message_request(include_optional);

	cJSON* jsoncreate_message_request_1 = create_message_request_convertToJSON(create_message_request_1);
	printf("create_message_request :\n%s\n", cJSON_Print(jsoncreate_message_request_1));
	create_message_request_t* create_message_request_2 = create_message_request_parseFromJSON(jsoncreate_message_request_1);
	cJSON* jsoncreate_message_request_2 = create_message_request_convertToJSON(create_message_request_2);
	printf("repeating create_message_request:\n%s\n", cJSON_Print(jsoncreate_message_request_2));
}

int main() {
  test_create_message_request(1);
  test_create_message_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // create_message_request_MAIN
#endif // create_message_request_TEST
