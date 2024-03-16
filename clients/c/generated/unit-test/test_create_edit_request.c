#ifndef create_edit_request_TEST
#define create_edit_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define create_edit_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/create_edit_request.h"
create_edit_request_t* instantiate_create_edit_request(int include_optional);

#include "test_create_edit_request_model.c"


create_edit_request_t* instantiate_create_edit_request(int include_optional) {
  create_edit_request_t* create_edit_request = NULL;
  if (include_optional) {
    create_edit_request = create_edit_request_create(
      "text-davinci-edit-001",
      "0",
      "Fix the spelling mistakes.",
      1,
      1,
      1
    );
  } else {
    create_edit_request = create_edit_request_create(
      "text-davinci-edit-001",
      "0",
      "Fix the spelling mistakes.",
      1,
      1,
      1
    );
  }

  return create_edit_request;
}


#ifdef create_edit_request_MAIN

void test_create_edit_request(int include_optional) {
    create_edit_request_t* create_edit_request_1 = instantiate_create_edit_request(include_optional);

	cJSON* jsoncreate_edit_request_1 = create_edit_request_convertToJSON(create_edit_request_1);
	printf("create_edit_request :\n%s\n", cJSON_Print(jsoncreate_edit_request_1));
	create_edit_request_t* create_edit_request_2 = create_edit_request_parseFromJSON(jsoncreate_edit_request_1);
	cJSON* jsoncreate_edit_request_2 = create_edit_request_convertToJSON(create_edit_request_2);
	printf("repeating create_edit_request:\n%s\n", cJSON_Print(jsoncreate_edit_request_2));
}

int main() {
  test_create_edit_request(1);
  test_create_edit_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // create_edit_request_MAIN
#endif // create_edit_request_TEST
