/*
 * Invite.h
 *
 * Represents an individual &#x60;invite&#x60; to the organization.
 */

#ifndef _Invite_H_
#define _Invite_H_


#include <string>
#include "Invite_projects_inner.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Represents an individual `invite` to the organization.
 *
 *  \ingroup Models
 *
 */

class Invite : public Object {
public:
	/*! \brief Constructor.
	 */
	Invite();
	Invite(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Invite();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	std::string object;
	std::string id;
	std::string email;
	std::string role;
	std::string status;
	int invited_at;
	int expires_at;
	int accepted_at;
	std::list <Invite_projects_inner>projects;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Invite_H_ */
