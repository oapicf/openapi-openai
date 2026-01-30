/*
 * AuditLog_project_created_data.h
 *
 * The payload used to create the project.
 */

#ifndef _AuditLog_project_created_data_H_
#define _AuditLog_project_created_data_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The payload used to create the project.
 *
 *  \ingroup Models
 *
 */

class AuditLog_project_created_data : public Object {
public:
	/*! \brief Constructor.
	 */
	AuditLog_project_created_data();
	AuditLog_project_created_data(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AuditLog_project_created_data();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The project name.
	 */
	std::string getName();

	/*! \brief Set The project name.
	 */
	void setName(std::string  name);
	/*! \brief Get The title of the project as seen on the dashboard.
	 */
	std::string getTitle();

	/*! \brief Set The title of the project as seen on the dashboard.
	 */
	void setTitle(std::string  title);

private:
	std::string name;
	std::string title;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AuditLog_project_created_data_H_ */
