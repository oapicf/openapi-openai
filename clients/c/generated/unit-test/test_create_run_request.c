#ifndef create_run_request_TEST
#define create_run_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define create_run_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/create_run_request.h"
create_run_request_t* instantiate_create_run_request(int include_optional);

#include "test_create_run_request_model.c"
#include "test_truncation_object.c"
#include "test_assistants_api_tool_choice_option.c"
#include "test_assistants_api_response_format_option.c"


create_run_request_t* instantiate_create_run_request(int include_optional) {
  create_run_request_t* create_run_request = NULL;
  if (include_optional) {
    create_run_request = create_run_request_create(
      "0",
      gpt-4o,
      "0",
      "0",
      list_createList(),
      list_createList(),
      0,
      1,
      1,
      1,
      256,
      256,
       // false, not to have infinite recursion
      instantiate_truncation_object(0),
      null,
      1,
      null
    );
  } else {
    create_run_request = create_run_request_create(
      "0",
      gpt-4o,
      "0",
      "0",
      list_createList(),
      list_createList(),
      0,
      1,
      1,
      1,
      256,
      256,
      NULL,
      null,
      1,
      null
    );
  }

  return create_run_request;
}


#ifdef create_run_request_MAIN

void test_create_run_request(int include_optional) {
    create_run_request_t* create_run_request_1 = instantiate_create_run_request(include_optional);

	cJSON* jsoncreate_run_request_1 = create_run_request_convertToJSON(create_run_request_1);
	printf("create_run_request :\n%s\n", cJSON_Print(jsoncreate_run_request_1));
	create_run_request_t* create_run_request_2 = create_run_request_parseFromJSON(jsoncreate_run_request_1);
	cJSON* jsoncreate_run_request_2 = create_run_request_convertToJSON(create_run_request_2);
	printf("repeating create_run_request:\n%s\n", cJSON_Print(jsoncreate_run_request_2));
}

int main() {
  test_create_run_request(1);
  test_create_run_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // create_run_request_MAIN
#endif // create_run_request_TEST
