#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "FineTuneMethod.h"

using namespace std;
using namespace Tizen::ArtikCloud;

FineTuneMethod::FineTuneMethod()
{
	//__init();
}

FineTuneMethod::~FineTuneMethod()
{
	//__cleanup();
}

void
FineTuneMethod::__init()
{
	//type = std::string();
	//supervised = new FineTuneSupervisedMethod();
	//dpo = new FineTuneDPOMethod();
}

void
FineTuneMethod::__cleanup()
{
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(supervised != NULL) {
	//
	//delete supervised;
	//supervised = NULL;
	//}
	//if(dpo != NULL) {
	//
	//delete dpo;
	//dpo = NULL;
	//}
	//
}

void
FineTuneMethod::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&type, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *supervisedKey = "supervised";
	node = json_object_get_member(pJsonObject, supervisedKey);
	if (node !=NULL) {
	

		if (isprimitive("FineTuneSupervisedMethod")) {
			jsonToValue(&supervised, node, "FineTuneSupervisedMethod", "");
		} else {
			
			FineTuneSupervisedMethod* obj = static_cast<FineTuneSupervisedMethod*> (&supervised);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *dpoKey = "dpo";
	node = json_object_get_member(pJsonObject, dpoKey);
	if (node !=NULL) {
	

		if (isprimitive("FineTuneDPOMethod")) {
			jsonToValue(&dpo, node, "FineTuneDPOMethod", "");
		} else {
			
			FineTuneDPOMethod* obj = static_cast<FineTuneDPOMethod*> (&dpo);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

FineTuneMethod::FineTuneMethod(char* json)
{
	this->fromJson(json);
}

char*
FineTuneMethod::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	if (isprimitive("FineTuneSupervisedMethod")) {
		FineTuneSupervisedMethod obj = getSupervised();
		node = converttoJson(&obj, "FineTuneSupervisedMethod", "");
	}
	else {
		
		FineTuneSupervisedMethod obj = static_cast<FineTuneSupervisedMethod> (getSupervised());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *supervisedKey = "supervised";
	json_object_set_member(pJsonObject, supervisedKey, node);
	if (isprimitive("FineTuneDPOMethod")) {
		FineTuneDPOMethod obj = getDpo();
		node = converttoJson(&obj, "FineTuneDPOMethod", "");
	}
	else {
		
		FineTuneDPOMethod obj = static_cast<FineTuneDPOMethod> (getDpo());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *dpoKey = "dpo";
	json_object_set_member(pJsonObject, dpoKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
FineTuneMethod::getType()
{
	return type;
}

void
FineTuneMethod::setType(std::string  type)
{
	this->type = type;
}

FineTuneSupervisedMethod
FineTuneMethod::getSupervised()
{
	return supervised;
}

void
FineTuneMethod::setSupervised(FineTuneSupervisedMethod  supervised)
{
	this->supervised = supervised;
}

FineTuneDPOMethod
FineTuneMethod::getDpo()
{
	return dpo;
}

void
FineTuneMethod::setDpo(FineTuneDPOMethod  dpo)
{
	this->dpo = dpo;
}


