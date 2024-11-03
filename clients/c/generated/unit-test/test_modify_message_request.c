#ifndef modify_message_request_TEST
#define modify_message_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define modify_message_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/modify_message_request.h"
modify_message_request_t* instantiate_modify_message_request(int include_optional);



modify_message_request_t* instantiate_modify_message_request(int include_optional) {
  modify_message_request_t* modify_message_request = NULL;
  if (include_optional) {
    modify_message_request = modify_message_request_create(
      0
    );
  } else {
    modify_message_request = modify_message_request_create(
      0
    );
  }

  return modify_message_request;
}


#ifdef modify_message_request_MAIN

void test_modify_message_request(int include_optional) {
    modify_message_request_t* modify_message_request_1 = instantiate_modify_message_request(include_optional);

	cJSON* jsonmodify_message_request_1 = modify_message_request_convertToJSON(modify_message_request_1);
	printf("modify_message_request :\n%s\n", cJSON_Print(jsonmodify_message_request_1));
	modify_message_request_t* modify_message_request_2 = modify_message_request_parseFromJSON(jsonmodify_message_request_1);
	cJSON* jsonmodify_message_request_2 = modify_message_request_convertToJSON(modify_message_request_2);
	printf("repeating modify_message_request:\n%s\n", cJSON_Print(jsonmodify_message_request_2));
}

int main() {
  test_modify_message_request(1);
  test_modify_message_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // modify_message_request_MAIN
#endif // modify_message_request_TEST
