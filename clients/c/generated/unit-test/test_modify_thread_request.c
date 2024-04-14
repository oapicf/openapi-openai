#ifndef modify_thread_request_TEST
#define modify_thread_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define modify_thread_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/modify_thread_request.h"
modify_thread_request_t* instantiate_modify_thread_request(int include_optional);



modify_thread_request_t* instantiate_modify_thread_request(int include_optional) {
  modify_thread_request_t* modify_thread_request = NULL;
  if (include_optional) {
    modify_thread_request = modify_thread_request_create(
      0
    );
  } else {
    modify_thread_request = modify_thread_request_create(
      0
    );
  }

  return modify_thread_request;
}


#ifdef modify_thread_request_MAIN

void test_modify_thread_request(int include_optional) {
    modify_thread_request_t* modify_thread_request_1 = instantiate_modify_thread_request(include_optional);

	cJSON* jsonmodify_thread_request_1 = modify_thread_request_convertToJSON(modify_thread_request_1);
	printf("modify_thread_request :\n%s\n", cJSON_Print(jsonmodify_thread_request_1));
	modify_thread_request_t* modify_thread_request_2 = modify_thread_request_parseFromJSON(jsonmodify_thread_request_1);
	cJSON* jsonmodify_thread_request_2 = modify_thread_request_convertToJSON(modify_thread_request_2);
	printf("repeating modify_thread_request:\n%s\n", cJSON_Print(jsonmodify_thread_request_2));
}

int main() {
  test_modify_thread_request(1);
  test_modify_thread_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // modify_thread_request_MAIN
#endif // modify_thread_request_TEST
