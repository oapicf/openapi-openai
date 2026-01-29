#ifndef fine_tuning_job_checkpoint_TEST
#define fine_tuning_job_checkpoint_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define fine_tuning_job_checkpoint_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/fine_tuning_job_checkpoint.h"
fine_tuning_job_checkpoint_t* instantiate_fine_tuning_job_checkpoint(int include_optional);

#include "test_fine_tuning_job_checkpoint_metrics.c"


fine_tuning_job_checkpoint_t* instantiate_fine_tuning_job_checkpoint(int include_optional) {
  fine_tuning_job_checkpoint_t* fine_tuning_job_checkpoint = NULL;
  if (include_optional) {
    fine_tuning_job_checkpoint = fine_tuning_job_checkpoint_create(
      "0",
      56,
      "0",
      56,
       // false, not to have infinite recursion
      instantiate_fine_tuning_job_checkpoint_metrics(0),
      "0",
      openai_api_fine_tuning_job_checkpoint_OBJECT_fine_tuning.job.checkpoint
    );
  } else {
    fine_tuning_job_checkpoint = fine_tuning_job_checkpoint_create(
      "0",
      56,
      "0",
      56,
      NULL,
      "0",
      openai_api_fine_tuning_job_checkpoint_OBJECT_fine_tuning.job.checkpoint
    );
  }

  return fine_tuning_job_checkpoint;
}


#ifdef fine_tuning_job_checkpoint_MAIN

void test_fine_tuning_job_checkpoint(int include_optional) {
    fine_tuning_job_checkpoint_t* fine_tuning_job_checkpoint_1 = instantiate_fine_tuning_job_checkpoint(include_optional);

	cJSON* jsonfine_tuning_job_checkpoint_1 = fine_tuning_job_checkpoint_convertToJSON(fine_tuning_job_checkpoint_1);
	printf("fine_tuning_job_checkpoint :\n%s\n", cJSON_Print(jsonfine_tuning_job_checkpoint_1));
	fine_tuning_job_checkpoint_t* fine_tuning_job_checkpoint_2 = fine_tuning_job_checkpoint_parseFromJSON(jsonfine_tuning_job_checkpoint_1);
	cJSON* jsonfine_tuning_job_checkpoint_2 = fine_tuning_job_checkpoint_convertToJSON(fine_tuning_job_checkpoint_2);
	printf("repeating fine_tuning_job_checkpoint:\n%s\n", cJSON_Print(jsonfine_tuning_job_checkpoint_2));
}

int main() {
  test_fine_tuning_job_checkpoint(1);
  test_fine_tuning_job_checkpoint(0);

  printf("Hello world \n");
  return 0;
}

#endif // fine_tuning_job_checkpoint_MAIN
#endif // fine_tuning_job_checkpoint_TEST
