#ifndef create_fine_tuning_job_request_hyperparameters_TEST
#define create_fine_tuning_job_request_hyperparameters_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define create_fine_tuning_job_request_hyperparameters_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/create_fine_tuning_job_request_hyperparameters.h"
create_fine_tuning_job_request_hyperparameters_t* instantiate_create_fine_tuning_job_request_hyperparameters(int include_optional);

#include "test_create_fine_tuning_job_request_hyperparameters_batch_size.c"
#include "test_create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier.c"
#include "test_create_fine_tuning_job_request_hyperparameters_n_epochs.c"


create_fine_tuning_job_request_hyperparameters_t* instantiate_create_fine_tuning_job_request_hyperparameters(int include_optional) {
  create_fine_tuning_job_request_hyperparameters_t* create_fine_tuning_job_request_hyperparameters = NULL;
  if (include_optional) {
    create_fine_tuning_job_request_hyperparameters = create_fine_tuning_job_request_hyperparameters_create(
      null,
      null,
      null
    );
  } else {
    create_fine_tuning_job_request_hyperparameters = create_fine_tuning_job_request_hyperparameters_create(
      null,
      null,
      null
    );
  }

  return create_fine_tuning_job_request_hyperparameters;
}


#ifdef create_fine_tuning_job_request_hyperparameters_MAIN

void test_create_fine_tuning_job_request_hyperparameters(int include_optional) {
    create_fine_tuning_job_request_hyperparameters_t* create_fine_tuning_job_request_hyperparameters_1 = instantiate_create_fine_tuning_job_request_hyperparameters(include_optional);

	cJSON* jsoncreate_fine_tuning_job_request_hyperparameters_1 = create_fine_tuning_job_request_hyperparameters_convertToJSON(create_fine_tuning_job_request_hyperparameters_1);
	printf("create_fine_tuning_job_request_hyperparameters :\n%s\n", cJSON_Print(jsoncreate_fine_tuning_job_request_hyperparameters_1));
	create_fine_tuning_job_request_hyperparameters_t* create_fine_tuning_job_request_hyperparameters_2 = create_fine_tuning_job_request_hyperparameters_parseFromJSON(jsoncreate_fine_tuning_job_request_hyperparameters_1);
	cJSON* jsoncreate_fine_tuning_job_request_hyperparameters_2 = create_fine_tuning_job_request_hyperparameters_convertToJSON(create_fine_tuning_job_request_hyperparameters_2);
	printf("repeating create_fine_tuning_job_request_hyperparameters:\n%s\n", cJSON_Print(jsoncreate_fine_tuning_job_request_hyperparameters_2));
}

int main() {
  test_create_fine_tuning_job_request_hyperparameters(1);
  test_create_fine_tuning_job_request_hyperparameters(0);

  printf("Hello world \n");
  return 0;
}

#endif // create_fine_tuning_job_request_hyperparameters_MAIN
#endif // create_fine_tuning_job_request_hyperparameters_TEST
