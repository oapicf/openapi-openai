#ifndef audit_log_event_type_TEST
#define audit_log_event_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define audit_log_event_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/audit_log_event_type.h"
audit_log_event_type_t* instantiate_audit_log_event_type(int include_optional);



audit_log_event_type_t* instantiate_audit_log_event_type(int include_optional) {
  audit_log_event_type_t* audit_log_event_type = NULL;
  if (include_optional) {
    audit_log_event_type = audit_log_event_type_create(
    );
  } else {
    audit_log_event_type = audit_log_event_type_create(
    );
  }

  return audit_log_event_type;
}


#ifdef audit_log_event_type_MAIN

void test_audit_log_event_type(int include_optional) {
    audit_log_event_type_t* audit_log_event_type_1 = instantiate_audit_log_event_type(include_optional);

	cJSON* jsonaudit_log_event_type_1 = audit_log_event_type_convertToJSON(audit_log_event_type_1);
	printf("audit_log_event_type :\n%s\n", cJSON_Print(jsonaudit_log_event_type_1));
	audit_log_event_type_t* audit_log_event_type_2 = audit_log_event_type_parseFromJSON(jsonaudit_log_event_type_1);
	cJSON* jsonaudit_log_event_type_2 = audit_log_event_type_convertToJSON(audit_log_event_type_2);
	printf("repeating audit_log_event_type:\n%s\n", cJSON_Print(jsonaudit_log_event_type_2));
}

int main() {
  test_audit_log_event_type(1);
  test_audit_log_event_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // audit_log_event_type_MAIN
#endif // audit_log_event_type_TEST
