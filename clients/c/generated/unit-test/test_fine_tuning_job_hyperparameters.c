#ifndef fine_tuning_job_hyperparameters_TEST
#define fine_tuning_job_hyperparameters_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define fine_tuning_job_hyperparameters_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/fine_tuning_job_hyperparameters.h"
fine_tuning_job_hyperparameters_t* instantiate_fine_tuning_job_hyperparameters(int include_optional);

#include "test_fine_tuning_job_hyperparameters_n_epochs.c"


fine_tuning_job_hyperparameters_t* instantiate_fine_tuning_job_hyperparameters(int include_optional) {
  fine_tuning_job_hyperparameters_t* fine_tuning_job_hyperparameters = NULL;
  if (include_optional) {
    fine_tuning_job_hyperparameters = fine_tuning_job_hyperparameters_create(
      null
    );
  } else {
    fine_tuning_job_hyperparameters = fine_tuning_job_hyperparameters_create(
      null
    );
  }

  return fine_tuning_job_hyperparameters;
}


#ifdef fine_tuning_job_hyperparameters_MAIN

void test_fine_tuning_job_hyperparameters(int include_optional) {
    fine_tuning_job_hyperparameters_t* fine_tuning_job_hyperparameters_1 = instantiate_fine_tuning_job_hyperparameters(include_optional);

	cJSON* jsonfine_tuning_job_hyperparameters_1 = fine_tuning_job_hyperparameters_convertToJSON(fine_tuning_job_hyperparameters_1);
	printf("fine_tuning_job_hyperparameters :\n%s\n", cJSON_Print(jsonfine_tuning_job_hyperparameters_1));
	fine_tuning_job_hyperparameters_t* fine_tuning_job_hyperparameters_2 = fine_tuning_job_hyperparameters_parseFromJSON(jsonfine_tuning_job_hyperparameters_1);
	cJSON* jsonfine_tuning_job_hyperparameters_2 = fine_tuning_job_hyperparameters_convertToJSON(fine_tuning_job_hyperparameters_2);
	printf("repeating fine_tuning_job_hyperparameters:\n%s\n", cJSON_Print(jsonfine_tuning_job_hyperparameters_2));
}

int main() {
  test_fine_tuning_job_hyperparameters(1);
  test_fine_tuning_job_hyperparameters(0);

  printf("Hello world \n");
  return 0;
}

#endif // fine_tuning_job_hyperparameters_MAIN
#endif // fine_tuning_job_hyperparameters_TEST
