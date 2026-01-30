/*
 * AuditLog_project.h
 *
 * The project that the action was scoped to. Absent for actions not scoped to projects.
 */

#ifndef _AuditLog_project_H_
#define _AuditLog_project_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The project that the action was scoped to. Absent for actions not scoped to projects.
 *
 *  \ingroup Models
 *
 */

class AuditLog_project : public Object {
public:
	/*! \brief Constructor.
	 */
	AuditLog_project();
	AuditLog_project(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AuditLog_project();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The project ID.
	 */
	std::string getId();

	/*! \brief Set The project ID.
	 */
	void setId(std::string  id);
	/*! \brief Get The project title.
	 */
	std::string getName();

	/*! \brief Set The project title.
	 */
	void setName(std::string  name);

private:
	std::string id;
	std::string name;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AuditLog_project_H_ */
