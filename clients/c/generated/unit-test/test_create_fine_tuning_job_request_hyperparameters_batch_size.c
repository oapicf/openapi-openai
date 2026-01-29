#ifndef create_fine_tuning_job_request_hyperparameters_batch_size_TEST
#define create_fine_tuning_job_request_hyperparameters_batch_size_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define create_fine_tuning_job_request_hyperparameters_batch_size_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/create_fine_tuning_job_request_hyperparameters_batch_size.h"
create_fine_tuning_job_request_hyperparameters_batch_size_t* instantiate_create_fine_tuning_job_request_hyperparameters_batch_size(int include_optional);



create_fine_tuning_job_request_hyperparameters_batch_size_t* instantiate_create_fine_tuning_job_request_hyperparameters_batch_size(int include_optional) {
  create_fine_tuning_job_request_hyperparameters_batch_size_t* create_fine_tuning_job_request_hyperparameters_batch_size = NULL;
  if (include_optional) {
    create_fine_tuning_job_request_hyperparameters_batch_size = create_fine_tuning_job_request_hyperparameters_batch_size_create(
    );
  } else {
    create_fine_tuning_job_request_hyperparameters_batch_size = create_fine_tuning_job_request_hyperparameters_batch_size_create(
    );
  }

  return create_fine_tuning_job_request_hyperparameters_batch_size;
}


#ifdef create_fine_tuning_job_request_hyperparameters_batch_size_MAIN

void test_create_fine_tuning_job_request_hyperparameters_batch_size(int include_optional) {
    create_fine_tuning_job_request_hyperparameters_batch_size_t* create_fine_tuning_job_request_hyperparameters_batch_size_1 = instantiate_create_fine_tuning_job_request_hyperparameters_batch_size(include_optional);

	cJSON* jsoncreate_fine_tuning_job_request_hyperparameters_batch_size_1 = create_fine_tuning_job_request_hyperparameters_batch_size_convertToJSON(create_fine_tuning_job_request_hyperparameters_batch_size_1);
	printf("create_fine_tuning_job_request_hyperparameters_batch_size :\n%s\n", cJSON_Print(jsoncreate_fine_tuning_job_request_hyperparameters_batch_size_1));
	create_fine_tuning_job_request_hyperparameters_batch_size_t* create_fine_tuning_job_request_hyperparameters_batch_size_2 = create_fine_tuning_job_request_hyperparameters_batch_size_parseFromJSON(jsoncreate_fine_tuning_job_request_hyperparameters_batch_size_1);
	cJSON* jsoncreate_fine_tuning_job_request_hyperparameters_batch_size_2 = create_fine_tuning_job_request_hyperparameters_batch_size_convertToJSON(create_fine_tuning_job_request_hyperparameters_batch_size_2);
	printf("repeating create_fine_tuning_job_request_hyperparameters_batch_size:\n%s\n", cJSON_Print(jsoncreate_fine_tuning_job_request_hyperparameters_batch_size_2));
}

int main() {
  test_create_fine_tuning_job_request_hyperparameters_batch_size(1);
  test_create_fine_tuning_job_request_hyperparameters_batch_size(0);

  printf("Hello world \n");
  return 0;
}

#endif // create_fine_tuning_job_request_hyperparameters_batch_size_MAIN
#endif // create_fine_tuning_job_request_hyperparameters_batch_size_TEST
