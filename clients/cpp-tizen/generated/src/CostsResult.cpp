#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CostsResult.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CostsResult::CostsResult()
{
	//__init();
}

CostsResult::~CostsResult()
{
	//__cleanup();
}

void
CostsResult::__init()
{
	//object = std::string();
	//amount = new CostsResult_amount();
	//line_item = std::string();
	//project_id = std::string();
}

void
CostsResult::__cleanup()
{
	//if(object != NULL) {
	//
	//delete object;
	//object = NULL;
	//}
	//if(amount != NULL) {
	//
	//delete amount;
	//amount = NULL;
	//}
	//if(line_item != NULL) {
	//
	//delete line_item;
	//line_item = NULL;
	//}
	//if(project_id != NULL) {
	//
	//delete project_id;
	//project_id = NULL;
	//}
	//
}

void
CostsResult::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *objectKey = "object";
	node = json_object_get_member(pJsonObject, objectKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&object, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *amountKey = "amount";
	node = json_object_get_member(pJsonObject, amountKey);
	if (node !=NULL) {
	

		if (isprimitive("CostsResult_amount")) {
			jsonToValue(&amount, node, "CostsResult_amount", "CostsResult_amount");
		} else {
			
			CostsResult_amount* obj = static_cast<CostsResult_amount*> (&amount);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *line_itemKey = "line_item";
	node = json_object_get_member(pJsonObject, line_itemKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&line_item, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *project_idKey = "project_id";
	node = json_object_get_member(pJsonObject, project_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&project_id, node, "std::string", "");
		} else {
			
		}
	}
}

CostsResult::CostsResult(char* json)
{
	this->fromJson(json);
}

char*
CostsResult::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getObject();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *objectKey = "object";
	json_object_set_member(pJsonObject, objectKey, node);
	if (isprimitive("CostsResult_amount")) {
		CostsResult_amount obj = getAmount();
		node = converttoJson(&obj, "CostsResult_amount", "");
	}
	else {
		
		CostsResult_amount obj = static_cast<CostsResult_amount> (getAmount());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *amountKey = "amount";
	json_object_set_member(pJsonObject, amountKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getLineItem();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *line_itemKey = "line_item";
	json_object_set_member(pJsonObject, line_itemKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getProjectId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *project_idKey = "project_id";
	json_object_set_member(pJsonObject, project_idKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
CostsResult::getObject()
{
	return object;
}

void
CostsResult::setObject(std::string  object)
{
	this->object = object;
}

CostsResult_amount
CostsResult::getAmount()
{
	return amount;
}

void
CostsResult::setAmount(CostsResult_amount  amount)
{
	this->amount = amount;
}

std::string
CostsResult::getLineItem()
{
	return line_item;
}

void
CostsResult::setLineItem(std::string  line_item)
{
	this->line_item = line_item;
}

std::string
CostsResult::getProjectId()
{
	return project_id;
}

void
CostsResult::setProjectId(std::string  project_id)
{
	this->project_id = project_id;
}


