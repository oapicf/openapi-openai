

#include "AuditLog_api_key_created.h"

using namespace Tiny;

AuditLog_api_key_created::AuditLog_api_key_created()
{
	id = std::string();
	data = AuditLog_api_key_created_data();
}

AuditLog_api_key_created::AuditLog_api_key_created(std::string jsonString)
{
	this->fromJson(jsonString);
}

AuditLog_api_key_created::~AuditLog_api_key_created()
{

}

void
AuditLog_api_key_created::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *dataKey = "data";

    if(object.has_key(dataKey))
    {
        bourne::json value = object[dataKey];




        AuditLog_api_key_created_data* obj = &data;
		obj->fromJson(value.dump());

    }


}

bourne::json
AuditLog_api_key_created::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();







	object["data"] = getData().toJson();


    return object;

}

std::string
AuditLog_api_key_created::getId()
{
	return id;
}

void
AuditLog_api_key_created::setId(std::string  id)
{
	this->id = id;
}

AuditLog_api_key_created_data
AuditLog_api_key_created::getData()
{
	return data;
}

void
AuditLog_api_key_created::setData(AuditLog_api_key_created_data  data)
{
	this->data = data;
}



