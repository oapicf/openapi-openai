/*
 * InviteRequest.h
 *
 * 
 */

#ifndef _InviteRequest_H_
#define _InviteRequest_H_


#include <string>
#include "InviteRequest_projects_inner.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class InviteRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	InviteRequest();
	InviteRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~InviteRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Send an email to this address
	 */
	std::string getEmail();

	/*! \brief Set Send an email to this address
	 */
	void setEmail(std::string  email);
	/*! \brief Get `owner` or `reader`
	 */
	std::string getRole();

	/*! \brief Set `owner` or `reader`
	 */
	void setRole(std::string  role);
	/*! \brief Get An array of projects to which membership is granted at the same time the org invite is accepted. If omitted, the user will be invited to the default project for compatibility with legacy behavior.
	 */
	std::list<InviteRequest_projects_inner> getProjects();

	/*! \brief Set An array of projects to which membership is granted at the same time the org invite is accepted. If omitted, the user will be invited to the default project for compatibility with legacy behavior.
	 */
	void setProjects(std::list <InviteRequest_projects_inner> projects);

private:
	std::string email;
	std::string role;
	std::list <InviteRequest_projects_inner>projects;
	void __init();
	void __cleanup();

};
}
}

#endif /* _InviteRequest_H_ */
