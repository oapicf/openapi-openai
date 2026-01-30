#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CostsResult_amount.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CostsResult_amount::CostsResult_amount()
{
	//__init();
}

CostsResult_amount::~CostsResult_amount()
{
	//__cleanup();
}

void
CostsResult_amount::__init()
{
	//value = double(0);
	//currency = std::string();
}

void
CostsResult_amount::__cleanup()
{
	//if(value != NULL) {
	//
	//delete value;
	//value = NULL;
	//}
	//if(currency != NULL) {
	//
	//delete currency;
	//currency = NULL;
	//}
	//
}

void
CostsResult_amount::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *valueKey = "value";
	node = json_object_get_member(pJsonObject, valueKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&value, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&value);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *currencyKey = "currency";
	node = json_object_get_member(pJsonObject, currencyKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&currency, node, "std::string", "");
		} else {
			
		}
	}
}

CostsResult_amount::CostsResult_amount(char* json)
{
	this->fromJson(json);
}

char*
CostsResult_amount::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getValue();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getValue());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *valueKey = "value";
	json_object_set_member(pJsonObject, valueKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCurrency();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *currencyKey = "currency";
	json_object_set_member(pJsonObject, currencyKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
CostsResult_amount::getValue()
{
	return value;
}

void
CostsResult_amount::setValue(long long  value)
{
	this->value = value;
}

std::string
CostsResult_amount::getCurrency()
{
	return currency;
}

void
CostsResult_amount::setCurrency(std::string  currency)
{
	this->currency = currency;
}


