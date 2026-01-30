#ifndef fine_tune_dpo_method_hyperparameters_beta_TEST
#define fine_tune_dpo_method_hyperparameters_beta_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define fine_tune_dpo_method_hyperparameters_beta_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/fine_tune_dpo_method_hyperparameters_beta.h"
fine_tune_dpo_method_hyperparameters_beta_t* instantiate_fine_tune_dpo_method_hyperparameters_beta(int include_optional);



fine_tune_dpo_method_hyperparameters_beta_t* instantiate_fine_tune_dpo_method_hyperparameters_beta(int include_optional) {
  fine_tune_dpo_method_hyperparameters_beta_t* fine_tune_dpo_method_hyperparameters_beta = NULL;
  if (include_optional) {
    fine_tune_dpo_method_hyperparameters_beta = fine_tune_dpo_method_hyperparameters_beta_create(
    );
  } else {
    fine_tune_dpo_method_hyperparameters_beta = fine_tune_dpo_method_hyperparameters_beta_create(
    );
  }

  return fine_tune_dpo_method_hyperparameters_beta;
}


#ifdef fine_tune_dpo_method_hyperparameters_beta_MAIN

void test_fine_tune_dpo_method_hyperparameters_beta(int include_optional) {
    fine_tune_dpo_method_hyperparameters_beta_t* fine_tune_dpo_method_hyperparameters_beta_1 = instantiate_fine_tune_dpo_method_hyperparameters_beta(include_optional);

	cJSON* jsonfine_tune_dpo_method_hyperparameters_beta_1 = fine_tune_dpo_method_hyperparameters_beta_convertToJSON(fine_tune_dpo_method_hyperparameters_beta_1);
	printf("fine_tune_dpo_method_hyperparameters_beta :\n%s\n", cJSON_Print(jsonfine_tune_dpo_method_hyperparameters_beta_1));
	fine_tune_dpo_method_hyperparameters_beta_t* fine_tune_dpo_method_hyperparameters_beta_2 = fine_tune_dpo_method_hyperparameters_beta_parseFromJSON(jsonfine_tune_dpo_method_hyperparameters_beta_1);
	cJSON* jsonfine_tune_dpo_method_hyperparameters_beta_2 = fine_tune_dpo_method_hyperparameters_beta_convertToJSON(fine_tune_dpo_method_hyperparameters_beta_2);
	printf("repeating fine_tune_dpo_method_hyperparameters_beta:\n%s\n", cJSON_Print(jsonfine_tune_dpo_method_hyperparameters_beta_2));
}

int main() {
  test_fine_tune_dpo_method_hyperparameters_beta(1);
  test_fine_tune_dpo_method_hyperparameters_beta(0);

  printf("Hello world \n");
  return 0;
}

#endif // fine_tune_dpo_method_hyperparameters_beta_MAIN
#endif // fine_tune_dpo_method_hyperparameters_beta_TEST
