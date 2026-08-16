
/*
 * AuditLog_organization_updated_changes_requested_settings.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AuditLog_organization_updated_changes_requested_settings_H_
#define TINY_CPP_CLIENT_AuditLog_organization_updated_changes_requested_settings_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AuditLog_organization_updated_changes_requested_settings{
public:

    /*! \brief Constructor.
	 */
    AuditLog_organization_updated_changes_requested_settings();
    AuditLog_organization_updated_changes_requested_settings(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AuditLog_organization_updated_changes_requested_settings();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::string threads_ui_visibility{};
    std::string usage_dashboard_visibility{};
};
}

#endif /* TINY_CPP_CLIENT_AuditLog_organization_updated_changes_requested_settings_H_ */
