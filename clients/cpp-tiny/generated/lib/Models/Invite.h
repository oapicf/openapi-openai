
/*
 * Invite.h
 *
 * Represents an individual &#x60;invite&#x60; to the organization.
 */

#ifndef TINY_CPP_CLIENT_Invite_H_
#define TINY_CPP_CLIENT_Invite_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Invite_projects_inner.h"
#include <list>

namespace Tiny {


/*! \brief Represents an individual `invite` to the organization.
 *
 *  \ingroup Models
 *
 */

class Invite{
public:

    /*! \brief Constructor.
	 */
    Invite();
    Invite(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Invite();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The object type, which is always `organization.invite`
	 */
	std::string getObject();

	/*! \brief Set The object type, which is always `organization.invite`
	 */
	void setObject(std::string  object);
	/*! \brief Get The identifier, which can be referenced in API endpoints
	 */
	std::string getId();

	/*! \brief Set The identifier, which can be referenced in API endpoints
	 */
	void setId(std::string  id);
	/*! \brief Get The email address of the individual to whom the invite was sent
	 */
	std::string getEmail();

	/*! \brief Set The email address of the individual to whom the invite was sent
	 */
	void setEmail(std::string  email);
	/*! \brief Get `owner` or `reader`
	 */
	std::string getRole();

	/*! \brief Set `owner` or `reader`
	 */
	void setRole(std::string  role);
	/*! \brief Get `accepted`,`expired`, or `pending`
	 */
	std::string getStatus();

	/*! \brief Set `accepted`,`expired`, or `pending`
	 */
	void setStatus(std::string  status);
	/*! \brief Get The Unix timestamp (in seconds) of when the invite was sent.
	 */
	int getInvitedAt();

	/*! \brief Set The Unix timestamp (in seconds) of when the invite was sent.
	 */
	void setInvitedAt(int  invited_at);
	/*! \brief Get The Unix timestamp (in seconds) of when the invite expires.
	 */
	int getExpiresAt();

	/*! \brief Set The Unix timestamp (in seconds) of when the invite expires.
	 */
	void setExpiresAt(int  expires_at);
	/*! \brief Get The Unix timestamp (in seconds) of when the invite was accepted.
	 */
	int getAcceptedAt();

	/*! \brief Set The Unix timestamp (in seconds) of when the invite was accepted.
	 */
	void setAcceptedAt(int  accepted_at);
	/*! \brief Get The projects that were granted membership upon acceptance of the invite.
	 */
	std::list<Invite_projects_inner> getProjects();

	/*! \brief Set The projects that were granted membership upon acceptance of the invite.
	 */
	void setProjects(std::list <Invite_projects_inner> projects);


    private:
    std::string object{};
    std::string id{};
    std::string email{};
    std::string role{};
    std::string status{};
    int invited_at{};
    int expires_at{};
    int accepted_at{};
    std::list<Invite_projects_inner> projects;
};
}

#endif /* TINY_CPP_CLIENT_Invite_H_ */
