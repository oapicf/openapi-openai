/*
 * User.h
 *
 * Represents an individual &#x60;user&#x60; within an organization.
 */

#ifndef _User_H_
#define _User_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Represents an individual `user` within an organization.
 *
 *  \ingroup Models
 *
 */

class User : public Object {
public:
	/*! \brief Constructor.
	 */
	User();
	User(char* str);

	/*! \brief Destructor.
	 */
	virtual ~User();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The object type, which is always `organization.user`
	 */
	std::string getObject();

	/*! \brief Set The object type, which is always `organization.user`
	 */
	void setObject(std::string  object);
	/*! \brief Get The identifier, which can be referenced in API endpoints
	 */
	std::string getId();

	/*! \brief Set The identifier, which can be referenced in API endpoints
	 */
	void setId(std::string  id);
	/*! \brief Get The name of the user
	 */
	std::string getName();

	/*! \brief Set The name of the user
	 */
	void setName(std::string  name);
	/*! \brief Get The email address of the user
	 */
	std::string getEmail();

	/*! \brief Set The email address of the user
	 */
	void setEmail(std::string  email);
	/*! \brief Get `owner` or `reader`
	 */
	std::string getRole();

	/*! \brief Set `owner` or `reader`
	 */
	void setRole(std::string  role);
	/*! \brief Get The Unix timestamp (in seconds) of when the user was added.
	 */
	int getAddedAt();

	/*! \brief Set The Unix timestamp (in seconds) of when the user was added.
	 */
	void setAddedAt(int  added_at);

private:
	std::string object;
	std::string id;
	std::string name;
	std::string email;
	std::string role;
	int added_at;
	void __init();
	void __cleanup();

};
}
}

#endif /* _User_H_ */
