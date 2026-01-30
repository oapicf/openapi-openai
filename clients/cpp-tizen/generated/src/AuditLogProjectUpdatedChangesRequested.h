/*
 * AuditLog_project_updated_changes_requested.h
 *
 * The payload used to update the project.
 */

#ifndef _AuditLog_project_updated_changes_requested_H_
#define _AuditLog_project_updated_changes_requested_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The payload used to update the project.
 *
 *  \ingroup Models
 *
 */

class AuditLog_project_updated_changes_requested : public Object {
public:
	/*! \brief Constructor.
	 */
	AuditLog_project_updated_changes_requested();
	AuditLog_project_updated_changes_requested(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AuditLog_project_updated_changes_requested();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The title of the project as seen on the dashboard.
	 */
	std::string getTitle();

	/*! \brief Set The title of the project as seen on the dashboard.
	 */
	void setTitle(std::string  title);

private:
	std::string title;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AuditLog_project_updated_changes_requested_H_ */
