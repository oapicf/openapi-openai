/*
 * ProjectServiceAccount.h
 *
 * Represents an individual service account in a project.
 */

#ifndef _ProjectServiceAccount_H_
#define _ProjectServiceAccount_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Represents an individual service account in a project.
 *
 *  \ingroup Models
 *
 */

class ProjectServiceAccount : public Object {
public:
	/*! \brief Constructor.
	 */
	ProjectServiceAccount();
	ProjectServiceAccount(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ProjectServiceAccount();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The object type, which is always `organization.project.service_account`
	 */
	std::string getObject();

	/*! \brief Set The object type, which is always `organization.project.service_account`
	 */
	void setObject(std::string  object);
	/*! \brief Get The identifier, which can be referenced in API endpoints
	 */
	std::string getId();

	/*! \brief Set The identifier, which can be referenced in API endpoints
	 */
	void setId(std::string  id);
	/*! \brief Get The name of the service account
	 */
	std::string getName();

	/*! \brief Set The name of the service account
	 */
	void setName(std::string  name);
	/*! \brief Get `owner` or `member`
	 */
	std::string getRole();

	/*! \brief Set `owner` or `member`
	 */
	void setRole(std::string  role);
	/*! \brief Get The Unix timestamp (in seconds) of when the service account was created
	 */
	int getCreatedAt();

	/*! \brief Set The Unix timestamp (in seconds) of when the service account was created
	 */
	void setCreatedAt(int  created_at);

private:
	std::string object;
	std::string id;
	std::string name;
	std::string role;
	int created_at;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ProjectServiceAccount_H_ */
