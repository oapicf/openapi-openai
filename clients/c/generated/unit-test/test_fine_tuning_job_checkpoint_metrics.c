#ifndef fine_tuning_job_checkpoint_metrics_TEST
#define fine_tuning_job_checkpoint_metrics_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define fine_tuning_job_checkpoint_metrics_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/fine_tuning_job_checkpoint_metrics.h"
fine_tuning_job_checkpoint_metrics_t* instantiate_fine_tuning_job_checkpoint_metrics(int include_optional);



fine_tuning_job_checkpoint_metrics_t* instantiate_fine_tuning_job_checkpoint_metrics(int include_optional) {
  fine_tuning_job_checkpoint_metrics_t* fine_tuning_job_checkpoint_metrics = NULL;
  if (include_optional) {
    fine_tuning_job_checkpoint_metrics = fine_tuning_job_checkpoint_metrics_create(
      1.337,
      1.337,
      1.337,
      1.337,
      1.337,
      1.337,
      1.337
    );
  } else {
    fine_tuning_job_checkpoint_metrics = fine_tuning_job_checkpoint_metrics_create(
      1.337,
      1.337,
      1.337,
      1.337,
      1.337,
      1.337,
      1.337
    );
  }

  return fine_tuning_job_checkpoint_metrics;
}


#ifdef fine_tuning_job_checkpoint_metrics_MAIN

void test_fine_tuning_job_checkpoint_metrics(int include_optional) {
    fine_tuning_job_checkpoint_metrics_t* fine_tuning_job_checkpoint_metrics_1 = instantiate_fine_tuning_job_checkpoint_metrics(include_optional);

	cJSON* jsonfine_tuning_job_checkpoint_metrics_1 = fine_tuning_job_checkpoint_metrics_convertToJSON(fine_tuning_job_checkpoint_metrics_1);
	printf("fine_tuning_job_checkpoint_metrics :\n%s\n", cJSON_Print(jsonfine_tuning_job_checkpoint_metrics_1));
	fine_tuning_job_checkpoint_metrics_t* fine_tuning_job_checkpoint_metrics_2 = fine_tuning_job_checkpoint_metrics_parseFromJSON(jsonfine_tuning_job_checkpoint_metrics_1);
	cJSON* jsonfine_tuning_job_checkpoint_metrics_2 = fine_tuning_job_checkpoint_metrics_convertToJSON(fine_tuning_job_checkpoint_metrics_2);
	printf("repeating fine_tuning_job_checkpoint_metrics:\n%s\n", cJSON_Print(jsonfine_tuning_job_checkpoint_metrics_2));
}

int main() {
  test_fine_tuning_job_checkpoint_metrics(1);
  test_fine_tuning_job_checkpoint_metrics(0);

  printf("Hello world \n");
  return 0;
}

#endif // fine_tuning_job_checkpoint_metrics_MAIN
#endif // fine_tuning_job_checkpoint_metrics_TEST
