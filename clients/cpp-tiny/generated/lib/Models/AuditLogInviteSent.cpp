

#include "AuditLog_invite_sent.h"

using namespace Tiny;

AuditLog_invite_sent::AuditLog_invite_sent()
{
	id = std::string();
	data = AuditLog_invite_sent_data();
}

AuditLog_invite_sent::AuditLog_invite_sent(std::string jsonString)
{
	this->fromJson(jsonString);
}

AuditLog_invite_sent::~AuditLog_invite_sent()
{

}

void
AuditLog_invite_sent::fromJson(std::string jsonObj)
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




        AuditLog_invite_sent_data* obj = &data;
		obj->fromJson(value.dump());

    }


}

bourne::json
AuditLog_invite_sent::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();







	object["data"] = getData().toJson();


    return object;

}

std::string
AuditLog_invite_sent::getId()
{
	return id;
}

void
AuditLog_invite_sent::setId(std::string  id)
{
	this->id = id;
}

AuditLog_invite_sent_data
AuditLog_invite_sent::getData()
{
	return data;
}

void
AuditLog_invite_sent::setData(AuditLog_invite_sent_data  data)
{
	this->data = data;
}



