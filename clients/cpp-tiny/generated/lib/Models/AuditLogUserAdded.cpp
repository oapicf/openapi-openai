

#include "AuditLog_user_added.h"

using namespace Tiny;

AuditLog_user_added::AuditLog_user_added()
{
	id = std::string();
	data = AuditLog_user_added_data();
}

AuditLog_user_added::AuditLog_user_added(std::string jsonString)
{
	this->fromJson(jsonString);
}

AuditLog_user_added::~AuditLog_user_added()
{

}

void
AuditLog_user_added::fromJson(std::string jsonObj)
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




        AuditLog_user_added_data* obj = &data;
		obj->fromJson(value.dump());

    }


}

bourne::json
AuditLog_user_added::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();







	object["data"] = getData().toJson();


    return object;

}

std::string
AuditLog_user_added::getId()
{
	return id;
}

void
AuditLog_user_added::setId(std::string  id)
{
	this->id = id;
}

AuditLog_user_added_data
AuditLog_user_added::getData()
{
	return data;
}

void
AuditLog_user_added::setData(AuditLog_user_added_data  data)
{
	this->data = data;
}



