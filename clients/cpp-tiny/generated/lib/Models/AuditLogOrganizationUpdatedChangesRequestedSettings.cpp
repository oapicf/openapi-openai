

#include "AuditLog_organization_updated_changes_requested_settings.h"

using namespace Tiny;

AuditLog_organization_updated_changes_requested_settings::AuditLog_organization_updated_changes_requested_settings()
{
	threads_ui_visibility = std::string();
	usage_dashboard_visibility = std::string();
}

AuditLog_organization_updated_changes_requested_settings::AuditLog_organization_updated_changes_requested_settings(std::string jsonString)
{
	this->fromJson(jsonString);
}

AuditLog_organization_updated_changes_requested_settings::~AuditLog_organization_updated_changes_requested_settings()
{

}

void
AuditLog_organization_updated_changes_requested_settings::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *threads_ui_visibilityKey = "threads_ui_visibility";

    if(object.has_key(threads_ui_visibilityKey))
    {
        bourne::json value = object[threads_ui_visibilityKey];



        jsonToValue(&threads_ui_visibility, value, "std::string");


    }

    const char *usage_dashboard_visibilityKey = "usage_dashboard_visibility";

    if(object.has_key(usage_dashboard_visibilityKey))
    {
        bourne::json value = object[usage_dashboard_visibilityKey];



        jsonToValue(&usage_dashboard_visibility, value, "std::string");


    }


}

bourne::json
AuditLog_organization_updated_changes_requested_settings::toJson()
{
    bourne::json object = bourne::json::object();





    object["threads_ui_visibility"] = getThreadsUiVisibility();






    object["usage_dashboard_visibility"] = getUsageDashboardVisibility();



    return object;

}

std::string
AuditLog_organization_updated_changes_requested_settings::getThreadsUiVisibility()
{
	return threads_ui_visibility;
}

void
AuditLog_organization_updated_changes_requested_settings::setThreadsUiVisibility(std::string  threads_ui_visibility)
{
	this->threads_ui_visibility = threads_ui_visibility;
}

std::string
AuditLog_organization_updated_changes_requested_settings::getUsageDashboardVisibility()
{
	return usage_dashboard_visibility;
}

void
AuditLog_organization_updated_changes_requested_settings::setUsageDashboardVisibility(std::string  usage_dashboard_visibility)
{
	this->usage_dashboard_visibility = usage_dashboard_visibility;
}



