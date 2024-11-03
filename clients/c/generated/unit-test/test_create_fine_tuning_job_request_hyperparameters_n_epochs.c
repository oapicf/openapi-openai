#ifndef create_fine_tuning_job_request_hyperparameters_n_epochs_TEST
#define create_fine_tuning_job_request_hyperparameters_n_epochs_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define create_fine_tuning_job_request_hyperparameters_n_epochs_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/create_fine_tuning_job_request_hyperparameters_n_epochs.h"
create_fine_tuning_job_request_hyperparameters_n_epochs_t* instantiate_create_fine_tuning_job_request_hyperparameters_n_epochs(int include_optional);



create_fine_tuning_job_request_hyperparameters_n_epochs_t* instantiate_create_fine_tuning_job_request_hyperparameters_n_epochs(int include_optional) {
  create_fine_tuning_job_request_hyperparameters_n_epochs_t* create_fine_tuning_job_request_hyperparameters_n_epochs = NULL;
  if (include_optional) {
    create_fine_tuning_job_request_hyperparameters_n_epochs = create_fine_tuning_job_request_hyperparameters_n_epochs_create(
    );
  } else {
    create_fine_tuning_job_request_hyperparameters_n_epochs = create_fine_tuning_job_request_hyperparameters_n_epochs_create(
    );
  }

  return create_fine_tuning_job_request_hyperparameters_n_epochs;
}


#ifdef create_fine_tuning_job_request_hyperparameters_n_epochs_MAIN

void test_create_fine_tuning_job_request_hyperparameters_n_epochs(int include_optional) {
    create_fine_tuning_job_request_hyperparameters_n_epochs_t* create_fine_tuning_job_request_hyperparameters_n_epochs_1 = instantiate_create_fine_tuning_job_request_hyperparameters_n_epochs(include_optional);

	cJSON* jsoncreate_fine_tuning_job_request_hyperparameters_n_epochs_1 = create_fine_tuning_job_request_hyperparameters_n_epochs_convertToJSON(create_fine_tuning_job_request_hyperparameters_n_epochs_1);
	printf("create_fine_tuning_job_request_hyperparameters_n_epochs :\n%s\n", cJSON_Print(jsoncreate_fine_tuning_job_request_hyperparameters_n_epochs_1));
	create_fine_tuning_job_request_hyperparameters_n_epochs_t* create_fine_tuning_job_request_hyperparameters_n_epochs_2 = create_fine_tuning_job_request_hyperparameters_n_epochs_parseFromJSON(jsoncreate_fine_tuning_job_request_hyperparameters_n_epochs_1);
	cJSON* jsoncreate_fine_tuning_job_request_hyperparameters_n_epochs_2 = create_fine_tuning_job_request_hyperparameters_n_epochs_convertToJSON(create_fine_tuning_job_request_hyperparameters_n_epochs_2);
	printf("repeating create_fine_tuning_job_request_hyperparameters_n_epochs:\n%s\n", cJSON_Print(jsoncreate_fine_tuning_job_request_hyperparameters_n_epochs_2));
}

int main() {
  test_create_fine_tuning_job_request_hyperparameters_n_epochs(1);
  test_create_fine_tuning_job_request_hyperparameters_n_epochs(0);

  printf("Hello world \n");
  return 0;
}

#endif // create_fine_tuning_job_request_hyperparameters_n_epochs_MAIN
#endif // create_fine_tuning_job_request_hyperparameters_n_epochs_TEST
