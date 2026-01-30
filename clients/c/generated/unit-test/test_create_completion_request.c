#ifndef create_completion_request_TEST
#define create_completion_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define create_completion_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/create_completion_request.h"
create_completion_request_t* instantiate_create_completion_request(int include_optional);

#include "test_create_completion_request_model.c"
#include "test_create_completion_request_prompt.c"
#include "test_create_completion_request_stop.c"
#include "test_chat_completion_stream_options.c"


create_completion_request_t* instantiate_create_completion_request(int include_optional) {
  create_completion_request_t* create_completion_request = NULL;
  if (include_optional) {
    create_completion_request = create_completion_request_create(
      null,
      null,
      0,
      1,
      -2,
      list_createList(),
      0,
      16,
      1,
      -2,
      -9223372036854776000,
      null,
      1,
       // false, not to have infinite recursion
      instantiate_chat_completion_stream_options(0),
      "test.",
      1,
      1,
      "user-1234"
    );
  } else {
    create_completion_request = create_completion_request_create(
      null,
      null,
      0,
      1,
      -2,
      list_createList(),
      0,
      16,
      1,
      -2,
      -9223372036854776000,
      null,
      1,
      NULL,
      "test.",
      1,
      1,
      "user-1234"
    );
  }

  return create_completion_request;
}


#ifdef create_completion_request_MAIN

void test_create_completion_request(int include_optional) {
    create_completion_request_t* create_completion_request_1 = instantiate_create_completion_request(include_optional);

	cJSON* jsoncreate_completion_request_1 = create_completion_request_convertToJSON(create_completion_request_1);
	printf("create_completion_request :\n%s\n", cJSON_Print(jsoncreate_completion_request_1));
	create_completion_request_t* create_completion_request_2 = create_completion_request_parseFromJSON(jsoncreate_completion_request_1);
	cJSON* jsoncreate_completion_request_2 = create_completion_request_convertToJSON(create_completion_request_2);
	printf("repeating create_completion_request:\n%s\n", cJSON_Print(jsoncreate_completion_request_2));
}

int main() {
  test_create_completion_request(1);
  test_create_completion_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // create_completion_request_MAIN
#endif // create_completion_request_TEST
