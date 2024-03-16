#ifndef create_edit_response_TEST
#define create_edit_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define create_edit_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/create_edit_response.h"
create_edit_response_t* instantiate_create_edit_response(int include_optional);

#include "test_create_completion_response_usage.c"


create_edit_response_t* instantiate_create_edit_response(int include_optional) {
  create_edit_response_t* create_edit_response = NULL;
  if (include_optional) {
    create_edit_response = create_edit_response_create(
      "0",
      56,
      list_createList(),
       // false, not to have infinite recursion
      instantiate_create_completion_response_usage(0)
    );
  } else {
    create_edit_response = create_edit_response_create(
      "0",
      56,
      list_createList(),
      NULL
    );
  }

  return create_edit_response;
}


#ifdef create_edit_response_MAIN

void test_create_edit_response(int include_optional) {
    create_edit_response_t* create_edit_response_1 = instantiate_create_edit_response(include_optional);

	cJSON* jsoncreate_edit_response_1 = create_edit_response_convertToJSON(create_edit_response_1);
	printf("create_edit_response :\n%s\n", cJSON_Print(jsoncreate_edit_response_1));
	create_edit_response_t* create_edit_response_2 = create_edit_response_parseFromJSON(jsoncreate_edit_response_1);
	cJSON* jsoncreate_edit_response_2 = create_edit_response_convertToJSON(create_edit_response_2);
	printf("repeating create_edit_response:\n%s\n", cJSON_Print(jsoncreate_edit_response_2));
}

int main() {
  test_create_edit_response(1);
  test_create_edit_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // create_edit_response_MAIN
#endif // create_edit_response_TEST
