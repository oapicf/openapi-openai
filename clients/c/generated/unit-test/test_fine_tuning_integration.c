#ifndef fine_tuning_integration_TEST
#define fine_tuning_integration_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define fine_tuning_integration_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/fine_tuning_integration.h"
fine_tuning_integration_t* instantiate_fine_tuning_integration(int include_optional);

#include "test_create_fine_tuning_job_request_integrations_inner_wandb.c"


fine_tuning_integration_t* instantiate_fine_tuning_integration(int include_optional) {
  fine_tuning_integration_t* fine_tuning_integration = NULL;
  if (include_optional) {
    fine_tuning_integration = fine_tuning_integration_create(
      openai_api_fine_tuning_integration_TYPE_wandb,
       // false, not to have infinite recursion
      instantiate_create_fine_tuning_job_request_integrations_inner_wandb(0)
    );
  } else {
    fine_tuning_integration = fine_tuning_integration_create(
      openai_api_fine_tuning_integration_TYPE_wandb,
      NULL
    );
  }

  return fine_tuning_integration;
}


#ifdef fine_tuning_integration_MAIN

void test_fine_tuning_integration(int include_optional) {
    fine_tuning_integration_t* fine_tuning_integration_1 = instantiate_fine_tuning_integration(include_optional);

	cJSON* jsonfine_tuning_integration_1 = fine_tuning_integration_convertToJSON(fine_tuning_integration_1);
	printf("fine_tuning_integration :\n%s\n", cJSON_Print(jsonfine_tuning_integration_1));
	fine_tuning_integration_t* fine_tuning_integration_2 = fine_tuning_integration_parseFromJSON(jsonfine_tuning_integration_1);
	cJSON* jsonfine_tuning_integration_2 = fine_tuning_integration_convertToJSON(fine_tuning_integration_2);
	printf("repeating fine_tuning_integration:\n%s\n", cJSON_Print(jsonfine_tuning_integration_2));
}

int main() {
  test_fine_tuning_integration(1);
  test_fine_tuning_integration(0);

  printf("Hello world \n");
  return 0;
}

#endif // fine_tuning_integration_MAIN
#endif // fine_tuning_integration_TEST
