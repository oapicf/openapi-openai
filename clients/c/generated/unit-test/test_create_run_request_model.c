#ifndef create_run_request_model_TEST
#define create_run_request_model_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define create_run_request_model_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/create_run_request_model.h"
create_run_request_model_t* instantiate_create_run_request_model(int include_optional);



create_run_request_model_t* instantiate_create_run_request_model(int include_optional) {
  create_run_request_model_t* create_run_request_model = NULL;
  if (include_optional) {
    create_run_request_model = create_run_request_model_create(
    );
  } else {
    create_run_request_model = create_run_request_model_create(
    );
  }

  return create_run_request_model;
}


#ifdef create_run_request_model_MAIN

void test_create_run_request_model(int include_optional) {
    create_run_request_model_t* create_run_request_model_1 = instantiate_create_run_request_model(include_optional);

	cJSON* jsoncreate_run_request_model_1 = create_run_request_model_convertToJSON(create_run_request_model_1);
	printf("create_run_request_model :\n%s\n", cJSON_Print(jsoncreate_run_request_model_1));
	create_run_request_model_t* create_run_request_model_2 = create_run_request_model_parseFromJSON(jsoncreate_run_request_model_1);
	cJSON* jsoncreate_run_request_model_2 = create_run_request_model_convertToJSON(create_run_request_model_2);
	printf("repeating create_run_request_model:\n%s\n", cJSON_Print(jsoncreate_run_request_model_2));
}

int main() {
  test_create_run_request_model(1);
  test_create_run_request_model(0);

  printf("Hello world \n");
  return 0;
}

#endif // create_run_request_model_MAIN
#endif // create_run_request_model_TEST
