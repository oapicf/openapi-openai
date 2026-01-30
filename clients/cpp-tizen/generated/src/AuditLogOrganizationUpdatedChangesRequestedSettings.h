/*
 * AuditLog_organization_updated_changes_requested_settings.h
 *
 * 
 */

#ifndef _AuditLog_organization_updated_changes_requested_settings_H_
#define _AuditLog_organization_updated_changes_requested_settings_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AuditLog_organization_updated_changes_requested_settings : public Object {
public:
	/*! \brief Constructor.
	 */
	AuditLog_organization_updated_changes_requested_settings();
	AuditLog_organization_updated_changes_requested_settings(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AuditLog_organization_updated_changes_requested_settings();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Visibility of the threads page which shows messages created with the Assistants API and Playground. One of `ANY_ROLE`, `OWNERS`, or `NONE`.
	 */
	std::string getThreadsUiVisibility();

	/*! \brief Set Visibility of the threads page which shows messages created with the Assistants API and Playground. One of `ANY_ROLE`, `OWNERS`, or `NONE`.
	 */
	void setThreadsUiVisibility(std::string  threads_ui_visibility);
	/*! \brief Get Visibility of the usage dashboard which shows activity and costs for your organization. One of `ANY_ROLE` or `OWNERS`.
	 */
	std::string getUsageDashboardVisibility();

	/*! \brief Set Visibility of the usage dashboard which shows activity and costs for your organization. One of `ANY_ROLE` or `OWNERS`.
	 */
	void setUsageDashboardVisibility(std::string  usage_dashboard_visibility);

private:
	std::string threads_ui_visibility;
	std::string usage_dashboard_visibility;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AuditLog_organization_updated_changes_requested_settings_H_ */
