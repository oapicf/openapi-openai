#ifndef modify_run_request_TEST
#define modify_run_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define modify_run_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/modify_run_request.h"
modify_run_request_t* instantiate_modify_run_request(int include_optional);



modify_run_request_t* instantiate_modify_run_request(int include_optional) {
  modify_run_request_t* modify_run_request = NULL;
  if (include_optional) {
    modify_run_request = modify_run_request_create(
      0
    );
  } else {
    modify_run_request = modify_run_request_create(
      0
    );
  }

  return modify_run_request;
}


#ifdef modify_run_request_MAIN

void test_modify_run_request(int include_optional) {
    modify_run_request_t* modify_run_request_1 = instantiate_modify_run_request(include_optional);

	cJSON* jsonmodify_run_request_1 = modify_run_request_convertToJSON(modify_run_request_1);
	printf("modify_run_request :\n%s\n", cJSON_Print(jsonmodify_run_request_1));
	modify_run_request_t* modify_run_request_2 = modify_run_request_parseFromJSON(jsonmodify_run_request_1);
	cJSON* jsonmodify_run_request_2 = modify_run_request_convertToJSON(modify_run_request_2);
	printf("repeating modify_run_request:\n%s\n", cJSON_Print(jsonmodify_run_request_2));
}

int main() {
  test_modify_run_request(1);
  test_modify_run_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // modify_run_request_MAIN
#endif // modify_run_request_TEST
