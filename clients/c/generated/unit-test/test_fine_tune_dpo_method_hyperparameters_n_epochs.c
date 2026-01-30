#ifndef fine_tune_dpo_method_hyperparameters_n_epochs_TEST
#define fine_tune_dpo_method_hyperparameters_n_epochs_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define fine_tune_dpo_method_hyperparameters_n_epochs_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/fine_tune_dpo_method_hyperparameters_n_epochs.h"
fine_tune_dpo_method_hyperparameters_n_epochs_t* instantiate_fine_tune_dpo_method_hyperparameters_n_epochs(int include_optional);



fine_tune_dpo_method_hyperparameters_n_epochs_t* instantiate_fine_tune_dpo_method_hyperparameters_n_epochs(int include_optional) {
  fine_tune_dpo_method_hyperparameters_n_epochs_t* fine_tune_dpo_method_hyperparameters_n_epochs = NULL;
  if (include_optional) {
    fine_tune_dpo_method_hyperparameters_n_epochs = fine_tune_dpo_method_hyperparameters_n_epochs_create(
    );
  } else {
    fine_tune_dpo_method_hyperparameters_n_epochs = fine_tune_dpo_method_hyperparameters_n_epochs_create(
    );
  }

  return fine_tune_dpo_method_hyperparameters_n_epochs;
}


#ifdef fine_tune_dpo_method_hyperparameters_n_epochs_MAIN

void test_fine_tune_dpo_method_hyperparameters_n_epochs(int include_optional) {
    fine_tune_dpo_method_hyperparameters_n_epochs_t* fine_tune_dpo_method_hyperparameters_n_epochs_1 = instantiate_fine_tune_dpo_method_hyperparameters_n_epochs(include_optional);

	cJSON* jsonfine_tune_dpo_method_hyperparameters_n_epochs_1 = fine_tune_dpo_method_hyperparameters_n_epochs_convertToJSON(fine_tune_dpo_method_hyperparameters_n_epochs_1);
	printf("fine_tune_dpo_method_hyperparameters_n_epochs :\n%s\n", cJSON_Print(jsonfine_tune_dpo_method_hyperparameters_n_epochs_1));
	fine_tune_dpo_method_hyperparameters_n_epochs_t* fine_tune_dpo_method_hyperparameters_n_epochs_2 = fine_tune_dpo_method_hyperparameters_n_epochs_parseFromJSON(jsonfine_tune_dpo_method_hyperparameters_n_epochs_1);
	cJSON* jsonfine_tune_dpo_method_hyperparameters_n_epochs_2 = fine_tune_dpo_method_hyperparameters_n_epochs_convertToJSON(fine_tune_dpo_method_hyperparameters_n_epochs_2);
	printf("repeating fine_tune_dpo_method_hyperparameters_n_epochs:\n%s\n", cJSON_Print(jsonfine_tune_dpo_method_hyperparameters_n_epochs_2));
}

int main() {
  test_fine_tune_dpo_method_hyperparameters_n_epochs(1);
  test_fine_tune_dpo_method_hyperparameters_n_epochs(0);

  printf("Hello world \n");
  return 0;
}

#endif // fine_tune_dpo_method_hyperparameters_n_epochs_MAIN
#endif // fine_tune_dpo_method_hyperparameters_n_epochs_TEST
