#ifndef audit_log_invite_sent_TEST
#define audit_log_invite_sent_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define audit_log_invite_sent_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/audit_log_invite_sent.h"
audit_log_invite_sent_t* instantiate_audit_log_invite_sent(int include_optional);

#include "test_audit_log_invite_sent_data.c"


audit_log_invite_sent_t* instantiate_audit_log_invite_sent(int include_optional) {
  audit_log_invite_sent_t* audit_log_invite_sent = NULL;
  if (include_optional) {
    audit_log_invite_sent = audit_log_invite_sent_create(
      "0",
       // false, not to have infinite recursion
      instantiate_audit_log_invite_sent_data(0)
    );
  } else {
    audit_log_invite_sent = audit_log_invite_sent_create(
      "0",
      NULL
    );
  }

  return audit_log_invite_sent;
}


#ifdef audit_log_invite_sent_MAIN

void test_audit_log_invite_sent(int include_optional) {
    audit_log_invite_sent_t* audit_log_invite_sent_1 = instantiate_audit_log_invite_sent(include_optional);

	cJSON* jsonaudit_log_invite_sent_1 = audit_log_invite_sent_convertToJSON(audit_log_invite_sent_1);
	printf("audit_log_invite_sent :\n%s\n", cJSON_Print(jsonaudit_log_invite_sent_1));
	audit_log_invite_sent_t* audit_log_invite_sent_2 = audit_log_invite_sent_parseFromJSON(jsonaudit_log_invite_sent_1);
	cJSON* jsonaudit_log_invite_sent_2 = audit_log_invite_sent_convertToJSON(audit_log_invite_sent_2);
	printf("repeating audit_log_invite_sent:\n%s\n", cJSON_Print(jsonaudit_log_invite_sent_2));
}

int main() {
  test_audit_log_invite_sent(1);
  test_audit_log_invite_sent(0);

  printf("Hello world \n");
  return 0;
}

#endif // audit_log_invite_sent_MAIN
#endif // audit_log_invite_sent_TEST
