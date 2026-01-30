#ifndef fine_tuning_job_TEST
#define fine_tuning_job_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define fine_tuning_job_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/fine_tuning_job.h"
fine_tuning_job_t* instantiate_fine_tuning_job(int include_optional);

#include "test_fine_tuning_job_error.c"
#include "test_fine_tuning_job_hyperparameters.c"
#include "test_fine_tune_method.c"


fine_tuning_job_t* instantiate_fine_tuning_job(int include_optional) {
  fine_tuning_job_t* fine_tuning_job = NULL;
  if (include_optional) {
    fine_tuning_job = fine_tuning_job_create(
      "0",
      56,
       // false, not to have infinite recursion
      instantiate_fine_tuning_job_error(0),
      "0",
      56,
       // false, not to have infinite recursion
      instantiate_fine_tuning_job_hyperparameters(0),
      "0",
      openai_api_fine_tuning_job_OBJECT_fine_tuning.job,
      "0",
      list_createList(),
      openai_api_fine_tuning_job_STATUS_validating_files,
      56,
      "0",
      "0",
      list_createList(),
      56,
      56,
       // false, not to have infinite recursion
      instantiate_fine_tune_method(0)
    );
  } else {
    fine_tuning_job = fine_tuning_job_create(
      "0",
      56,
      NULL,
      "0",
      56,
      NULL,
      "0",
      openai_api_fine_tuning_job_OBJECT_fine_tuning.job,
      "0",
      list_createList(),
      openai_api_fine_tuning_job_STATUS_validating_files,
      56,
      "0",
      "0",
      list_createList(),
      56,
      56,
      NULL
    );
  }

  return fine_tuning_job;
}


#ifdef fine_tuning_job_MAIN

void test_fine_tuning_job(int include_optional) {
    fine_tuning_job_t* fine_tuning_job_1 = instantiate_fine_tuning_job(include_optional);

	cJSON* jsonfine_tuning_job_1 = fine_tuning_job_convertToJSON(fine_tuning_job_1);
	printf("fine_tuning_job :\n%s\n", cJSON_Print(jsonfine_tuning_job_1));
	fine_tuning_job_t* fine_tuning_job_2 = fine_tuning_job_parseFromJSON(jsonfine_tuning_job_1);
	cJSON* jsonfine_tuning_job_2 = fine_tuning_job_convertToJSON(fine_tuning_job_2);
	printf("repeating fine_tuning_job:\n%s\n", cJSON_Print(jsonfine_tuning_job_2));
}

int main() {
  test_fine_tuning_job(1);
  test_fine_tuning_job(0);

  printf("Hello world \n");
  return 0;
}

#endif // fine_tuning_job_MAIN
#endif // fine_tuning_job_TEST
