#ifndef create_fine_tune_request_TEST
#define create_fine_tune_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define create_fine_tune_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/create_fine_tune_request.h"
create_fine_tune_request_t* instantiate_create_fine_tune_request(int include_optional);

#include "test_create_fine_tune_request_model.c"


create_fine_tune_request_t* instantiate_create_fine_tune_request(int include_optional) {
  create_fine_tune_request_t* create_fine_tune_request = NULL;
  if (include_optional) {
    create_fine_tune_request = create_fine_tune_request_create(
      "file-ajSREls59WBbvgSzJSVWxMCB",
      "file-XjSREls59WBbvgSzJSVWxMCa",
      curie,
      56,
      56,
      1.337,
      1.337,
      1,
      56,
      "0",
      [0.6,1,1.5,2],
      "0"
    );
  } else {
    create_fine_tune_request = create_fine_tune_request_create(
      "file-ajSREls59WBbvgSzJSVWxMCB",
      "file-XjSREls59WBbvgSzJSVWxMCa",
      curie,
      56,
      56,
      1.337,
      1.337,
      1,
      56,
      "0",
      [0.6,1,1.5,2],
      "0"
    );
  }

  return create_fine_tune_request;
}


#ifdef create_fine_tune_request_MAIN

void test_create_fine_tune_request(int include_optional) {
    create_fine_tune_request_t* create_fine_tune_request_1 = instantiate_create_fine_tune_request(include_optional);

	cJSON* jsoncreate_fine_tune_request_1 = create_fine_tune_request_convertToJSON(create_fine_tune_request_1);
	printf("create_fine_tune_request :\n%s\n", cJSON_Print(jsoncreate_fine_tune_request_1));
	create_fine_tune_request_t* create_fine_tune_request_2 = create_fine_tune_request_parseFromJSON(jsoncreate_fine_tune_request_1);
	cJSON* jsoncreate_fine_tune_request_2 = create_fine_tune_request_convertToJSON(create_fine_tune_request_2);
	printf("repeating create_fine_tune_request:\n%s\n", cJSON_Print(jsoncreate_fine_tune_request_2));
}

int main() {
  test_create_fine_tune_request(1);
  test_create_fine_tune_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // create_fine_tune_request_MAIN
#endif // create_fine_tune_request_TEST
