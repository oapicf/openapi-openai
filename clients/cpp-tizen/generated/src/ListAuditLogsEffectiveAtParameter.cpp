#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "List_audit_logs_effective_at_parameter.h"

using namespace std;
using namespace Tizen::ArtikCloud;

List_audit_logs_effective_at_parameter::List_audit_logs_effective_at_parameter()
{
	//__init();
}

List_audit_logs_effective_at_parameter::~List_audit_logs_effective_at_parameter()
{
	//__cleanup();
}

void
List_audit_logs_effective_at_parameter::__init()
{
	//gt = int(0);
	//gte = int(0);
	//lt = int(0);
	//lte = int(0);
}

void
List_audit_logs_effective_at_parameter::__cleanup()
{
	//if(gt != NULL) {
	//
	//delete gt;
	//gt = NULL;
	//}
	//if(gte != NULL) {
	//
	//delete gte;
	//gte = NULL;
	//}
	//if(lt != NULL) {
	//
	//delete lt;
	//lt = NULL;
	//}
	//if(lte != NULL) {
	//
	//delete lte;
	//lte = NULL;
	//}
	//
}

void
List_audit_logs_effective_at_parameter::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *gtKey = "gt";
	node = json_object_get_member(pJsonObject, gtKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&gt, node, "int", "");
		} else {
			
		}
	}
	const gchar *gteKey = "gte";
	node = json_object_get_member(pJsonObject, gteKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&gte, node, "int", "");
		} else {
			
		}
	}
	const gchar *ltKey = "lt";
	node = json_object_get_member(pJsonObject, ltKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&lt, node, "int", "");
		} else {
			
		}
	}
	const gchar *lteKey = "lte";
	node = json_object_get_member(pJsonObject, lteKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&lte, node, "int", "");
		} else {
			
		}
	}
}

List_audit_logs_effective_at_parameter::List_audit_logs_effective_at_parameter(char* json)
{
	this->fromJson(json);
}

char*
List_audit_logs_effective_at_parameter::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getGt();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *gtKey = "gt";
	json_object_set_member(pJsonObject, gtKey, node);
	if (isprimitive("int")) {
		int obj = getGte();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *gteKey = "gte";
	json_object_set_member(pJsonObject, gteKey, node);
	if (isprimitive("int")) {
		int obj = getLt();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *ltKey = "lt";
	json_object_set_member(pJsonObject, ltKey, node);
	if (isprimitive("int")) {
		int obj = getLte();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *lteKey = "lte";
	json_object_set_member(pJsonObject, lteKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
List_audit_logs_effective_at_parameter::getGt()
{
	return gt;
}

void
List_audit_logs_effective_at_parameter::setGt(int  gt)
{
	this->gt = gt;
}

int
List_audit_logs_effective_at_parameter::getGte()
{
	return gte;
}

void
List_audit_logs_effective_at_parameter::setGte(int  gte)
{
	this->gte = gte;
}

int
List_audit_logs_effective_at_parameter::getLt()
{
	return lt;
}

void
List_audit_logs_effective_at_parameter::setLt(int  lt)
{
	this->lt = lt;
}

int
List_audit_logs_effective_at_parameter::getLte()
{
	return lte;
}

void
List_audit_logs_effective_at_parameter::setLte(int  lte)
{
	this->lte = lte;
}


