/*
 * InviteRequest_projects_inner.h
 *
 * 
 */

#ifndef _InviteRequest_projects_inner_H_
#define _InviteRequest_projects_inner_H_


#include <string>
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

class InviteRequest_projects_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	InviteRequest_projects_inner();
	InviteRequest_projects_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~InviteRequest_projects_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Project's public ID
	 */
	std::string getId();

	/*! \brief Set Project's public ID
	 */
	void setId(std::string  id);
	/*! \brief Get Project membership role
	 */
	std::string getRole();

	/*! \brief Set Project membership role
	 */
	void setRole(std::string  role);

private:
	std::string id;
	std::string role;
	void __init();
	void __cleanup();

};
}
}

#endif /* _InviteRequest_projects_inner_H_ */
