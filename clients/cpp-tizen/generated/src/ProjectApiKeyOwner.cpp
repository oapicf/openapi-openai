#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ProjectApiKey_owner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ProjectApiKey_owner::ProjectApiKey_owner()
{
	//__init();
}

ProjectApiKey_owner::~ProjectApiKey_owner()
{
	//__cleanup();
}

void
ProjectApiKey_owner::__init()
{
	//type = std::string();
	//user = new ProjectUser();
	//service_account = new ProjectServiceAccount();
}

void
ProjectApiKey_owner::__cleanup()
{
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(user != NULL) {
	//
	//delete user;
	//user = NULL;
	//}
	//if(service_account != NULL) {
	//
	//delete service_account;
	//service_account = NULL;
	//}
	//
}

void
ProjectApiKey_owner::fromJson(char* jsonStr)
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
	const gchar *userKey = "user";
	node = json_object_get_member(pJsonObject, userKey);
	if (node !=NULL) {
	

		if (isprimitive("ProjectUser")) {
			jsonToValue(&user, node, "ProjectUser", "ProjectUser");
		} else {
			
			ProjectUser* obj = static_cast<ProjectUser*> (&user);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *service_accountKey = "service_account";
	node = json_object_get_member(pJsonObject, service_accountKey);
	if (node !=NULL) {
	

		if (isprimitive("ProjectServiceAccount")) {
			jsonToValue(&service_account, node, "ProjectServiceAccount", "ProjectServiceAccount");
		} else {
			
			ProjectServiceAccount* obj = static_cast<ProjectServiceAccount*> (&service_account);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ProjectApiKey_owner::ProjectApiKey_owner(char* json)
{
	this->fromJson(json);
}

char*
ProjectApiKey_owner::toJson()
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
	if (isprimitive("ProjectUser")) {
		ProjectUser obj = getUser();
		node = converttoJson(&obj, "ProjectUser", "");
	}
	else {
		
		ProjectUser obj = static_cast<ProjectUser> (getUser());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *userKey = "user";
	json_object_set_member(pJsonObject, userKey, node);
	if (isprimitive("ProjectServiceAccount")) {
		ProjectServiceAccount obj = getServiceAccount();
		node = converttoJson(&obj, "ProjectServiceAccount", "");
	}
	else {
		
		ProjectServiceAccount obj = static_cast<ProjectServiceAccount> (getServiceAccount());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *service_accountKey = "service_account";
	json_object_set_member(pJsonObject, service_accountKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
ProjectApiKey_owner::getType()
{
	return type;
}

void
ProjectApiKey_owner::setType(std::string  type)
{
	this->type = type;
}

ProjectUser
ProjectApiKey_owner::getUser()
{
	return user;
}

void
ProjectApiKey_owner::setUser(ProjectUser  user)
{
	this->user = user;
}

ProjectServiceAccount
ProjectApiKey_owner::getServiceAccount()
{
	return service_account;
}

void
ProjectApiKey_owner::setServiceAccount(ProjectServiceAccount  service_account)
{
	this->service_account = service_account;
}


