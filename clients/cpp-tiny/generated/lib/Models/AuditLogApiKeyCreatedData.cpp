

#include "AuditLog_api_key_created_data.h"

using namespace Tiny;

AuditLog_api_key_created_data::AuditLog_api_key_created_data()
{
	scopes = std::list<std::string>();
}

AuditLog_api_key_created_data::AuditLog_api_key_created_data(std::string jsonString)
{
	this->fromJson(jsonString);
}

AuditLog_api_key_created_data::~AuditLog_api_key_created_data()
{

}

void
AuditLog_api_key_created_data::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *scopesKey = "scopes";

    if(object.has_key(scopesKey))
    {
        bourne::json value = object[scopesKey];


        std::list<std::string> scopes_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            scopes_list.push_back(element);
        }
        scopes = scopes_list;


    }


}

bourne::json
AuditLog_api_key_created_data::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<std::string> scopes_list = getScopes();
    bourne::json scopes_arr = bourne::json::array();

    for(auto& var : scopes_list)
    {
        scopes_arr.append(var);
    }
    object["scopes"] = scopes_arr;






    return object;

}

std::list<std::string>
AuditLog_api_key_created_data::getScopes()
{
	return scopes;
}

void
AuditLog_api_key_created_data::setScopes(std::list <std::string> scopes)
{
	this->scopes = scopes;
}



