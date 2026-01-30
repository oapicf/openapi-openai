/*
 * Project.h
 *
 * Represents an individual project.
 */

#ifndef _Project_H_
#define _Project_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Represents an individual project.
 *
 *  \ingroup Models
 *
 */

class Project : public Object {
public:
	/*! \brief Constructor.
	 */
	Project();
	Project(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Project();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The identifier, which can be referenced in API endpoints
	 */
	std::string getId();

	/*! \brief Set The identifier, which can be referenced in API endpoints
	 */
	void setId(std::string  id);
	/*! \brief Get The object type, which is always `organization.project`
	 */
	std::string getObject();

	/*! \brief Set The object type, which is always `organization.project`
	 */
	void setObject(std::string  object);
	/*! \brief Get The name of the project. This appears in reporting.
	 */
	std::string getName();

	/*! \brief Set The name of the project. This appears in reporting.
	 */
	void setName(std::string  name);
	/*! \brief Get The Unix timestamp (in seconds) of when the project was created.
	 */
	int getCreatedAt();

	/*! \brief Set The Unix timestamp (in seconds) of when the project was created.
	 */
	void setCreatedAt(int  created_at);
	/*! \brief Get The Unix timestamp (in seconds) of when the project was archived or `null`.
	 */
	int getArchivedAt();

	/*! \brief Set The Unix timestamp (in seconds) of when the project was archived or `null`.
	 */
	void setArchivedAt(int  archived_at);
	/*! \brief Get `active` or `archived`
	 */
	std::string getStatus();

	/*! \brief Set `active` or `archived`
	 */
	void setStatus(std::string  status);

private:
	std::string id;
	std::string object;
	std::string name;
	int created_at;
	int archived_at;
	std::string status;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Project_H_ */
