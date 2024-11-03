#ifndef fine_tuning_job_integrations_inner_TEST
#define fine_tuning_job_integrations_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define fine_tuning_job_integrations_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/fine_tuning_job_integrations_inner.h"
fine_tuning_job_integrations_inner_t* instantiate_fine_tuning_job_integrations_inner(int include_optional);

#include "test_create_fine_tuning_job_request_integrations_inner_wandb.c"


fine_tuning_job_integrations_inner_t* instantiate_fine_tuning_job_integrations_inner(int include_optional) {
  fine_tuning_job_integrations_inner_t* fine_tuning_job_integrations_inner = NULL;
  if (include_optional) {
    fine_tuning_job_integrations_inner = fine_tuning_job_integrations_inner_create(
      openai_api_fine_tuning_job_integrations_inner_TYPE_wandb,
       // false, not to have infinite recursion
      instantiate_create_fine_tuning_job_request_integrations_inner_wandb(0)
    );
  } else {
    fine_tuning_job_integrations_inner = fine_tuning_job_integrations_inner_create(
      openai_api_fine_tuning_job_integrations_inner_TYPE_wandb,
      NULL
    );
  }

  return fine_tuning_job_integrations_inner;
}


#ifdef fine_tuning_job_integrations_inner_MAIN

void test_fine_tuning_job_integrations_inner(int include_optional) {
    fine_tuning_job_integrations_inner_t* fine_tuning_job_integrations_inner_1 = instantiate_fine_tuning_job_integrations_inner(include_optional);

	cJSON* jsonfine_tuning_job_integrations_inner_1 = fine_tuning_job_integrations_inner_convertToJSON(fine_tuning_job_integrations_inner_1);
	printf("fine_tuning_job_integrations_inner :\n%s\n", cJSON_Print(jsonfine_tuning_job_integrations_inner_1));
	fine_tuning_job_integrations_inner_t* fine_tuning_job_integrations_inner_2 = fine_tuning_job_integrations_inner_parseFromJSON(jsonfine_tuning_job_integrations_inner_1);
	cJSON* jsonfine_tuning_job_integrations_inner_2 = fine_tuning_job_integrations_inner_convertToJSON(fine_tuning_job_integrations_inner_2);
	printf("repeating fine_tuning_job_integrations_inner:\n%s\n", cJSON_Print(jsonfine_tuning_job_integrations_inner_2));
}

int main() {
  test_fine_tuning_job_integrations_inner(1);
  test_fine_tuning_job_integrations_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // fine_tuning_job_integrations_inner_MAIN
#endif // fine_tuning_job_integrations_inner_TEST
