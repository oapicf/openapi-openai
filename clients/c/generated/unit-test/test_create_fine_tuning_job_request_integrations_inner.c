#ifndef create_fine_tuning_job_request_integrations_inner_TEST
#define create_fine_tuning_job_request_integrations_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define create_fine_tuning_job_request_integrations_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/create_fine_tuning_job_request_integrations_inner.h"
create_fine_tuning_job_request_integrations_inner_t* instantiate_create_fine_tuning_job_request_integrations_inner(int include_optional);

#include "test_create_fine_tuning_job_request_integrations_inner_type.c"
#include "test_create_fine_tuning_job_request_integrations_inner_wandb.c"


create_fine_tuning_job_request_integrations_inner_t* instantiate_create_fine_tuning_job_request_integrations_inner(int include_optional) {
  create_fine_tuning_job_request_integrations_inner_t* create_fine_tuning_job_request_integrations_inner = NULL;
  if (include_optional) {
    create_fine_tuning_job_request_integrations_inner = create_fine_tuning_job_request_integrations_inner_create(
      null,
       // false, not to have infinite recursion
      instantiate_create_fine_tuning_job_request_integrations_inner_wandb(0)
    );
  } else {
    create_fine_tuning_job_request_integrations_inner = create_fine_tuning_job_request_integrations_inner_create(
      null,
      NULL
    );
  }

  return create_fine_tuning_job_request_integrations_inner;
}


#ifdef create_fine_tuning_job_request_integrations_inner_MAIN

void test_create_fine_tuning_job_request_integrations_inner(int include_optional) {
    create_fine_tuning_job_request_integrations_inner_t* create_fine_tuning_job_request_integrations_inner_1 = instantiate_create_fine_tuning_job_request_integrations_inner(include_optional);

	cJSON* jsoncreate_fine_tuning_job_request_integrations_inner_1 = create_fine_tuning_job_request_integrations_inner_convertToJSON(create_fine_tuning_job_request_integrations_inner_1);
	printf("create_fine_tuning_job_request_integrations_inner :\n%s\n", cJSON_Print(jsoncreate_fine_tuning_job_request_integrations_inner_1));
	create_fine_tuning_job_request_integrations_inner_t* create_fine_tuning_job_request_integrations_inner_2 = create_fine_tuning_job_request_integrations_inner_parseFromJSON(jsoncreate_fine_tuning_job_request_integrations_inner_1);
	cJSON* jsoncreate_fine_tuning_job_request_integrations_inner_2 = create_fine_tuning_job_request_integrations_inner_convertToJSON(create_fine_tuning_job_request_integrations_inner_2);
	printf("repeating create_fine_tuning_job_request_integrations_inner:\n%s\n", cJSON_Print(jsoncreate_fine_tuning_job_request_integrations_inner_2));
}

int main() {
  test_create_fine_tuning_job_request_integrations_inner(1);
  test_create_fine_tuning_job_request_integrations_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // create_fine_tuning_job_request_integrations_inner_MAIN
#endif // create_fine_tuning_job_request_integrations_inner_TEST
