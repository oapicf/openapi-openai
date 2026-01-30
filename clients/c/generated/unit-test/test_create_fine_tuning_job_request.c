#ifndef create_fine_tuning_job_request_TEST
#define create_fine_tuning_job_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define create_fine_tuning_job_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/create_fine_tuning_job_request.h"
create_fine_tuning_job_request_t* instantiate_create_fine_tuning_job_request(int include_optional);

#include "test_create_fine_tuning_job_request_model.c"
#include "test_create_fine_tuning_job_request_hyperparameters.c"
#include "test_fine_tune_method.c"


create_fine_tuning_job_request_t* instantiate_create_fine_tuning_job_request(int include_optional) {
  create_fine_tuning_job_request_t* create_fine_tuning_job_request = NULL;
  if (include_optional) {
    create_fine_tuning_job_request = create_fine_tuning_job_request_create(
      gpt-4o-mini,
      "file-abc123",
       // false, not to have infinite recursion
      instantiate_create_fine_tuning_job_request_hyperparameters(0),
      "0",
      "file-abc123",
      list_createList(),
      42,
       // false, not to have infinite recursion
      instantiate_fine_tune_method(0)
    );
  } else {
    create_fine_tuning_job_request = create_fine_tuning_job_request_create(
      gpt-4o-mini,
      "file-abc123",
      NULL,
      "0",
      "file-abc123",
      list_createList(),
      42,
      NULL
    );
  }

  return create_fine_tuning_job_request;
}


#ifdef create_fine_tuning_job_request_MAIN

void test_create_fine_tuning_job_request(int include_optional) {
    create_fine_tuning_job_request_t* create_fine_tuning_job_request_1 = instantiate_create_fine_tuning_job_request(include_optional);

	cJSON* jsoncreate_fine_tuning_job_request_1 = create_fine_tuning_job_request_convertToJSON(create_fine_tuning_job_request_1);
	printf("create_fine_tuning_job_request :\n%s\n", cJSON_Print(jsoncreate_fine_tuning_job_request_1));
	create_fine_tuning_job_request_t* create_fine_tuning_job_request_2 = create_fine_tuning_job_request_parseFromJSON(jsoncreate_fine_tuning_job_request_1);
	cJSON* jsoncreate_fine_tuning_job_request_2 = create_fine_tuning_job_request_convertToJSON(create_fine_tuning_job_request_2);
	printf("repeating create_fine_tuning_job_request:\n%s\n", cJSON_Print(jsoncreate_fine_tuning_job_request_2));
}

int main() {
  test_create_fine_tuning_job_request(1);
  test_create_fine_tuning_job_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // create_fine_tuning_job_request_MAIN
#endif // create_fine_tuning_job_request_TEST
