
/*
 * AuditLog_project_updated_changes_requested.h
 *
 * The payload used to update the project.
 */

#ifndef TINY_CPP_CLIENT_AuditLog_project_updated_changes_requested_H_
#define TINY_CPP_CLIENT_AuditLog_project_updated_changes_requested_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The payload used to update the project.
 *
 *  \ingroup Models
 *
 */

class AuditLog_project_updated_changes_requested{
public:

    /*! \brief Constructor.
	 */
    AuditLog_project_updated_changes_requested();
    AuditLog_project_updated_changes_requested(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AuditLog_project_updated_changes_requested();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The title of the project as seen on the dashboard.
	 */
	std::string getTitle();

	/*! \brief Set The title of the project as seen on the dashboard.
	 */
	void setTitle(std::string  title);


    private:
    std::string title{};
};
}

#endif /* TINY_CPP_CLIENT_AuditLog_project_updated_changes_requested_H_ */
