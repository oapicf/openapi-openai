#ifndef fine_tune_dpo_method_hyperparameters_TEST
#define fine_tune_dpo_method_hyperparameters_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define fine_tune_dpo_method_hyperparameters_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/fine_tune_dpo_method_hyperparameters.h"
fine_tune_dpo_method_hyperparameters_t* instantiate_fine_tune_dpo_method_hyperparameters(int include_optional);

#include "test_fine_tune_dpo_method_hyperparameters_beta.c"
#include "test_fine_tune_dpo_method_hyperparameters_batch_size.c"
#include "test_fine_tune_dpo_method_hyperparameters_learning_rate_multiplier.c"
#include "test_fine_tune_dpo_method_hyperparameters_n_epochs.c"


fine_tune_dpo_method_hyperparameters_t* instantiate_fine_tune_dpo_method_hyperparameters(int include_optional) {
  fine_tune_dpo_method_hyperparameters_t* fine_tune_dpo_method_hyperparameters = NULL;
  if (include_optional) {
    fine_tune_dpo_method_hyperparameters = fine_tune_dpo_method_hyperparameters_create(
      null,
      null,
      null,
      null
    );
  } else {
    fine_tune_dpo_method_hyperparameters = fine_tune_dpo_method_hyperparameters_create(
      null,
      null,
      null,
      null
    );
  }

  return fine_tune_dpo_method_hyperparameters;
}


#ifdef fine_tune_dpo_method_hyperparameters_MAIN

void test_fine_tune_dpo_method_hyperparameters(int include_optional) {
    fine_tune_dpo_method_hyperparameters_t* fine_tune_dpo_method_hyperparameters_1 = instantiate_fine_tune_dpo_method_hyperparameters(include_optional);

	cJSON* jsonfine_tune_dpo_method_hyperparameters_1 = fine_tune_dpo_method_hyperparameters_convertToJSON(fine_tune_dpo_method_hyperparameters_1);
	printf("fine_tune_dpo_method_hyperparameters :\n%s\n", cJSON_Print(jsonfine_tune_dpo_method_hyperparameters_1));
	fine_tune_dpo_method_hyperparameters_t* fine_tune_dpo_method_hyperparameters_2 = fine_tune_dpo_method_hyperparameters_parseFromJSON(jsonfine_tune_dpo_method_hyperparameters_1);
	cJSON* jsonfine_tune_dpo_method_hyperparameters_2 = fine_tune_dpo_method_hyperparameters_convertToJSON(fine_tune_dpo_method_hyperparameters_2);
	printf("repeating fine_tune_dpo_method_hyperparameters:\n%s\n", cJSON_Print(jsonfine_tune_dpo_method_hyperparameters_2));
}

int main() {
  test_fine_tune_dpo_method_hyperparameters(1);
  test_fine_tune_dpo_method_hyperparameters(0);

  printf("Hello world \n");
  return 0;
}

#endif // fine_tune_dpo_method_hyperparameters_MAIN
#endif // fine_tune_dpo_method_hyperparameters_TEST
