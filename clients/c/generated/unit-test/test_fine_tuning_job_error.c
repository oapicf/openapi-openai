#ifndef fine_tuning_job_error_TEST
#define fine_tuning_job_error_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define fine_tuning_job_error_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/fine_tuning_job_error.h"
fine_tuning_job_error_t* instantiate_fine_tuning_job_error(int include_optional);



fine_tuning_job_error_t* instantiate_fine_tuning_job_error(int include_optional) {
  fine_tuning_job_error_t* fine_tuning_job_error = NULL;
  if (include_optional) {
    fine_tuning_job_error = fine_tuning_job_error_create(
      "0",
      "0",
      "0"
    );
  } else {
    fine_tuning_job_error = fine_tuning_job_error_create(
      "0",
      "0",
      "0"
    );
  }

  return fine_tuning_job_error;
}


#ifdef fine_tuning_job_error_MAIN

void test_fine_tuning_job_error(int include_optional) {
    fine_tuning_job_error_t* fine_tuning_job_error_1 = instantiate_fine_tuning_job_error(include_optional);

	cJSON* jsonfine_tuning_job_error_1 = fine_tuning_job_error_convertToJSON(fine_tuning_job_error_1);
	printf("fine_tuning_job_error :\n%s\n", cJSON_Print(jsonfine_tuning_job_error_1));
	fine_tuning_job_error_t* fine_tuning_job_error_2 = fine_tuning_job_error_parseFromJSON(jsonfine_tuning_job_error_1);
	cJSON* jsonfine_tuning_job_error_2 = fine_tuning_job_error_convertToJSON(fine_tuning_job_error_2);
	printf("repeating fine_tuning_job_error:\n%s\n", cJSON_Print(jsonfine_tuning_job_error_2));
}

int main() {
  test_fine_tuning_job_error(1);
  test_fine_tuning_job_error(0);

  printf("Hello world \n");
  return 0;
}

#endif // fine_tuning_job_error_MAIN
#endif // fine_tuning_job_error_TEST
