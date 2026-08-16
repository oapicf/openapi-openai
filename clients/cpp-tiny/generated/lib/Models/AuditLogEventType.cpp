

#include "AuditLogEventType.h"

using namespace Tiny;

AuditLogEventType::AuditLogEventType()
{
}

AuditLogEventType::AuditLogEventType(std::string jsonString)
{
	this->fromJson(jsonString);
}

AuditLogEventType::~AuditLogEventType()
{

}

void
AuditLogEventType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
AuditLogEventType::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



