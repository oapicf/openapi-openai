#ifndef create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier_TEST
#define create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier.h"
create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier_t* instantiate_create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier(int include_optional);



create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier_t* instantiate_create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier(int include_optional) {
  create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier_t* create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier = NULL;
  if (include_optional) {
    create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier = create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier_create(
    );
  } else {
    create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier = create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier_create(
    );
  }

  return create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier;
}


#ifdef create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier_MAIN

void test_create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier(int include_optional) {
    create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier_t* create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier_1 = instantiate_create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier(include_optional);

	cJSON* jsoncreate_fine_tuning_job_request_hyperparameters_learning_rate_multiplier_1 = create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier_convertToJSON(create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier_1);
	printf("create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier :\n%s\n", cJSON_Print(jsoncreate_fine_tuning_job_request_hyperparameters_learning_rate_multiplier_1));
	create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier_t* create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier_2 = create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier_parseFromJSON(jsoncreate_fine_tuning_job_request_hyperparameters_learning_rate_multiplier_1);
	cJSON* jsoncreate_fine_tuning_job_request_hyperparameters_learning_rate_multiplier_2 = create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier_convertToJSON(create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier_2);
	printf("repeating create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier:\n%s\n", cJSON_Print(jsoncreate_fine_tuning_job_request_hyperparameters_learning_rate_multiplier_2));
}

int main() {
  test_create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier(1);
  test_create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier(0);

  printf("Hello world \n");
  return 0;
}

#endif // create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier_MAIN
#endif // create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier_TEST
