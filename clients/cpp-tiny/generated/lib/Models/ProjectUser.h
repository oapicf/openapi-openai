
/*
 * ProjectUser.h
 *
 * Represents an individual user in a project.
 */

#ifndef TINY_CPP_CLIENT_ProjectUser_H_
#define TINY_CPP_CLIENT_ProjectUser_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Represents an individual user in a project.
 *
 *  \ingroup Models
 *
 */

class ProjectUser{
public:

    /*! \brief Constructor.
	 */
    ProjectUser();
    ProjectUser(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ProjectUser();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The object type, which is always `organization.project.user`
	 */
	std::string getObject();

	/*! \brief Set The object type, which is always `organization.project.user`
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
	/*! \brief Get `owner` or `member`
	 */
	std::string getRole();

	/*! \brief Set `owner` or `member`
	 */
	void setRole(std::string  role);
	/*! \brief Get The Unix timestamp (in seconds) of when the project was added.
	 */
	int getAddedAt();

	/*! \brief Set The Unix timestamp (in seconds) of when the project was added.
	 */
	void setAddedAt(int  added_at);


    private:
    std::string object{};
    std::string id{};
    std::string name{};
    std::string email{};
    std::string role{};
    int added_at{};
};
}

#endif /* TINY_CPP_CLIENT_ProjectUser_H_ */
