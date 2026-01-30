#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CreateModerationResponse_results_inner_category_scores.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CreateModerationResponse_results_inner_category_scores::CreateModerationResponse_results_inner_category_scores()
{
	//__init();
}

CreateModerationResponse_results_inner_category_scores::~CreateModerationResponse_results_inner_category_scores()
{
	//__cleanup();
}

void
CreateModerationResponse_results_inner_category_scores::__init()
{
	//hate = double(0);
	//hatethreatening = double(0);
	//harassment = double(0);
	//harassmentthreatening = double(0);
	//illicit = double(0);
	//illicitviolent = double(0);
	//selfharm = double(0);
	//selfharmintent = double(0);
	//selfharminstructions = double(0);
	//sexual = double(0);
	//sexualminors = double(0);
	//violence = double(0);
	//violencegraphic = double(0);
}

void
CreateModerationResponse_results_inner_category_scores::__cleanup()
{
	//if(hate != NULL) {
	//
	//delete hate;
	//hate = NULL;
	//}
	//if(hatethreatening != NULL) {
	//
	//delete hatethreatening;
	//hatethreatening = NULL;
	//}
	//if(harassment != NULL) {
	//
	//delete harassment;
	//harassment = NULL;
	//}
	//if(harassmentthreatening != NULL) {
	//
	//delete harassmentthreatening;
	//harassmentthreatening = NULL;
	//}
	//if(illicit != NULL) {
	//
	//delete illicit;
	//illicit = NULL;
	//}
	//if(illicitviolent != NULL) {
	//
	//delete illicitviolent;
	//illicitviolent = NULL;
	//}
	//if(selfharm != NULL) {
	//
	//delete selfharm;
	//selfharm = NULL;
	//}
	//if(selfharmintent != NULL) {
	//
	//delete selfharmintent;
	//selfharmintent = NULL;
	//}
	//if(selfharminstructions != NULL) {
	//
	//delete selfharminstructions;
	//selfharminstructions = NULL;
	//}
	//if(sexual != NULL) {
	//
	//delete sexual;
	//sexual = NULL;
	//}
	//if(sexualminors != NULL) {
	//
	//delete sexualminors;
	//sexualminors = NULL;
	//}
	//if(violence != NULL) {
	//
	//delete violence;
	//violence = NULL;
	//}
	//if(violencegraphic != NULL) {
	//
	//delete violencegraphic;
	//violencegraphic = NULL;
	//}
	//
}

void
CreateModerationResponse_results_inner_category_scores::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *hateKey = "hate";
	node = json_object_get_member(pJsonObject, hateKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&hate, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&hate);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *hatethreateningKey = "hate/threatening";
	node = json_object_get_member(pJsonObject, hatethreateningKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&hatethreatening, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&hatethreatening);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *harassmentKey = "harassment";
	node = json_object_get_member(pJsonObject, harassmentKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&harassment, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&harassment);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *harassmentthreateningKey = "harassment/threatening";
	node = json_object_get_member(pJsonObject, harassmentthreateningKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&harassmentthreatening, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&harassmentthreatening);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *illicitKey = "illicit";
	node = json_object_get_member(pJsonObject, illicitKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&illicit, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&illicit);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *illicitviolentKey = "illicit/violent";
	node = json_object_get_member(pJsonObject, illicitviolentKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&illicitviolent, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&illicitviolent);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *selfharmKey = "self-harm";
	node = json_object_get_member(pJsonObject, selfharmKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&selfharm, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&selfharm);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *selfharmintentKey = "self-harm/intent";
	node = json_object_get_member(pJsonObject, selfharmintentKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&selfharmintent, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&selfharmintent);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *selfharminstructionsKey = "self-harm/instructions";
	node = json_object_get_member(pJsonObject, selfharminstructionsKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&selfharminstructions, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&selfharminstructions);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *sexualKey = "sexual";
	node = json_object_get_member(pJsonObject, sexualKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&sexual, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&sexual);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *sexualminorsKey = "sexual/minors";
	node = json_object_get_member(pJsonObject, sexualminorsKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&sexualminors, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&sexualminors);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *violenceKey = "violence";
	node = json_object_get_member(pJsonObject, violenceKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&violence, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&violence);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *violencegraphicKey = "violence/graphic";
	node = json_object_get_member(pJsonObject, violencegraphicKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&violencegraphic, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&violencegraphic);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CreateModerationResponse_results_inner_category_scores::CreateModerationResponse_results_inner_category_scores(char* json)
{
	this->fromJson(json);
}

char*
CreateModerationResponse_results_inner_category_scores::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getHate();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getHate());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *hateKey = "hate";
	json_object_set_member(pJsonObject, hateKey, node);
	if (isprimitive("long long")) {
		long long obj = getHatethreatening();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getHatethreatening());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *hatethreateningKey = "hate/threatening";
	json_object_set_member(pJsonObject, hatethreateningKey, node);
	if (isprimitive("long long")) {
		long long obj = getHarassment();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getHarassment());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *harassmentKey = "harassment";
	json_object_set_member(pJsonObject, harassmentKey, node);
	if (isprimitive("long long")) {
		long long obj = getHarassmentthreatening();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getHarassmentthreatening());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *harassmentthreateningKey = "harassment/threatening";
	json_object_set_member(pJsonObject, harassmentthreateningKey, node);
	if (isprimitive("long long")) {
		long long obj = getIllicit();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getIllicit());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *illicitKey = "illicit";
	json_object_set_member(pJsonObject, illicitKey, node);
	if (isprimitive("long long")) {
		long long obj = getIllicitviolent();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getIllicitviolent());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *illicitviolentKey = "illicit/violent";
	json_object_set_member(pJsonObject, illicitviolentKey, node);
	if (isprimitive("long long")) {
		long long obj = getSelfharm();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getSelfharm());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *selfharmKey = "self-harm";
	json_object_set_member(pJsonObject, selfharmKey, node);
	if (isprimitive("long long")) {
		long long obj = getSelfharmintent();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getSelfharmintent());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *selfharmintentKey = "self-harm/intent";
	json_object_set_member(pJsonObject, selfharmintentKey, node);
	if (isprimitive("long long")) {
		long long obj = getSelfharminstructions();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getSelfharminstructions());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *selfharminstructionsKey = "self-harm/instructions";
	json_object_set_member(pJsonObject, selfharminstructionsKey, node);
	if (isprimitive("long long")) {
		long long obj = getSexual();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getSexual());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *sexualKey = "sexual";
	json_object_set_member(pJsonObject, sexualKey, node);
	if (isprimitive("long long")) {
		long long obj = getSexualminors();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getSexualminors());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *sexualminorsKey = "sexual/minors";
	json_object_set_member(pJsonObject, sexualminorsKey, node);
	if (isprimitive("long long")) {
		long long obj = getViolence();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getViolence());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *violenceKey = "violence";
	json_object_set_member(pJsonObject, violenceKey, node);
	if (isprimitive("long long")) {
		long long obj = getViolencegraphic();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getViolencegraphic());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *violencegraphicKey = "violence/graphic";
	json_object_set_member(pJsonObject, violencegraphicKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
CreateModerationResponse_results_inner_category_scores::getHate()
{
	return hate;
}

void
CreateModerationResponse_results_inner_category_scores::setHate(long long  hate)
{
	this->hate = hate;
}

long long
CreateModerationResponse_results_inner_category_scores::getHatethreatening()
{
	return hatethreatening;
}

void
CreateModerationResponse_results_inner_category_scores::setHatethreatening(long long  hatethreatening)
{
	this->hatethreatening = hatethreatening;
}

long long
CreateModerationResponse_results_inner_category_scores::getHarassment()
{
	return harassment;
}

void
CreateModerationResponse_results_inner_category_scores::setHarassment(long long  harassment)
{
	this->harassment = harassment;
}

long long
CreateModerationResponse_results_inner_category_scores::getHarassmentthreatening()
{
	return harassmentthreatening;
}

void
CreateModerationResponse_results_inner_category_scores::setHarassmentthreatening(long long  harassmentthreatening)
{
	this->harassmentthreatening = harassmentthreatening;
}

long long
CreateModerationResponse_results_inner_category_scores::getIllicit()
{
	return illicit;
}

void
CreateModerationResponse_results_inner_category_scores::setIllicit(long long  illicit)
{
	this->illicit = illicit;
}

long long
CreateModerationResponse_results_inner_category_scores::getIllicitviolent()
{
	return illicitviolent;
}

void
CreateModerationResponse_results_inner_category_scores::setIllicitviolent(long long  illicitviolent)
{
	this->illicitviolent = illicitviolent;
}

long long
CreateModerationResponse_results_inner_category_scores::getSelfharm()
{
	return selfharm;
}

void
CreateModerationResponse_results_inner_category_scores::setSelfharm(long long  selfharm)
{
	this->selfharm = selfharm;
}

long long
CreateModerationResponse_results_inner_category_scores::getSelfharmintent()
{
	return selfharmintent;
}

void
CreateModerationResponse_results_inner_category_scores::setSelfharmintent(long long  selfharmintent)
{
	this->selfharmintent = selfharmintent;
}

long long
CreateModerationResponse_results_inner_category_scores::getSelfharminstructions()
{
	return selfharminstructions;
}

void
CreateModerationResponse_results_inner_category_scores::setSelfharminstructions(long long  selfharminstructions)
{
	this->selfharminstructions = selfharminstructions;
}

long long
CreateModerationResponse_results_inner_category_scores::getSexual()
{
	return sexual;
}

void
CreateModerationResponse_results_inner_category_scores::setSexual(long long  sexual)
{
	this->sexual = sexual;
}

long long
CreateModerationResponse_results_inner_category_scores::getSexualminors()
{
	return sexualminors;
}

void
CreateModerationResponse_results_inner_category_scores::setSexualminors(long long  sexualminors)
{
	this->sexualminors = sexualminors;
}

long long
CreateModerationResponse_results_inner_category_scores::getViolence()
{
	return violence;
}

void
CreateModerationResponse_results_inner_category_scores::setViolence(long long  violence)
{
	this->violence = violence;
}

long long
CreateModerationResponse_results_inner_category_scores::getViolencegraphic()
{
	return violencegraphic;
}

void
CreateModerationResponse_results_inner_category_scores::setViolencegraphic(long long  violencegraphic)
{
	this->violencegraphic = violencegraphic;
}


